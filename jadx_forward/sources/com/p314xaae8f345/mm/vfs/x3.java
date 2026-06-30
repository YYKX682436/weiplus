package com.p314xaae8f345.mm.vfs;

/* loaded from: classes10.dex */
public abstract class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f294771a = {"Download", "attachment", "image", "image2", "record", "video", "voice2"};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f294772b = {".planCache", "CheckResUpdate_1", "CronetCache", "configlist", "jscache", "jsengine", "surface", "biztest", "webcompt_debug", "mmslot", "tmpScanLicense", "webservice", "CDNTemp", "test_writable", "xlogtest_writable", ".planCache", ".tmp", "AudioRecord", "CDNTemp", "CheckResUpdate", "CheckResUpdate_1", "ClickFlow", "CronetCache", "Diagnostic", "Download", "FailMsgFileCache", "Game", "Handler", "ProcessDetector", "SQLTrace", "ThumbVideoCache", "WebCanvasPkg", "WebviewCache", "appbrand", "avatar", "browser", "card", "configlist", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede, "diskcache", "download", "egg_spring", "exdevice", "facedir", "fts", "game", "hbstoryvideo", "hilive", "imagecache", "jscache", "jsengine", "surface", "biztest", "webcompt_debug", "last_avatar_dir", "mail", "mapsdk", "mmslot", "music", "recovery", "regioncode", "taxi_icon", "temp_video_cache", "test_writable", "tmpScanLicense", "trace", "video", "vusericon", "wagamefiles", "wallet", "wallet", "wallet_images", "webcompt", "webservice", "webview_tmpl", "wenote", "wepkg", "wvtemp", "wxacache", "wxafiles", "wxanewfiles", "wxauto", "wxvideocache", "wxvideotmp", "xlog", "xlogtest_writable"};

    public static void a() {
        java.lang.String str;
        java.lang.String str2 = "storage_migration_report_last_report";
        long j17 = 0;
        long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("storage_migration_report_last_report", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - j18 < 86400000) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.MigrationStatistics", "Report storage migration");
        int i17 = 0;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("storage_migration_report_items", "[]"));
            int length = jSONArray.length();
            int i18 = 0;
            while (i18 < length) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i18);
                if (optJSONObject == null) {
                    str = str2;
                } else {
                    java.lang.String optString = optJSONObject.optString("n");
                    long optLong = optJSONObject.optLong("ts", j17);
                    int optInt = optJSONObject.optInt("f", i17);
                    int optInt2 = optJSONObject.optInt("d", i17);
                    str = str2;
                    try {
                        long optLong2 = optJSONObject.optLong("a", -1L);
                        if (!optString.isEmpty()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.MigrationStatistics", ">> KV: " + optString + ", " + optInt + ", " + optInt2 + ", " + optLong2);
                            jx3.f.INSTANCE.d(21388, optString, 0, 0, "", java.lang.Long.valueOf(optLong), java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2), 0, 0, 0, java.lang.Long.valueOf(optLong2), 0, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                        }
                    } catch (org.json.JSONException e17) {
                        e = e17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.MigrationStatistics", e, "Cannot read report json", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B(str, currentTimeMillis);
                    }
                }
                i18++;
                str2 = str;
                i17 = 0;
                j17 = 0;
            }
            str = str2;
        } catch (org.json.JSONException e18) {
            e = e18;
            str = str2;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B(str, currentTimeMillis);
    }
}
