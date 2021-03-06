package com.actiontech.dble.backend.mysql.view;

import java.util.Map;

/**
 * Created by szf on 2017/10/12.
 */
public interface Repository {
    String SCHEMA_VIEW_SPLIT = ":";
    String SERVER_ID = "serverId";
    String CREATE_SQL = "createSql";

    Map<String, Map<String, String>> getViewCreateSqlMap();

    void put(String schemaName, String viewName, String createSql);

    void delete(String schemaName, String[] viewName);
}
