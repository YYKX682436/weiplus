package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public abstract class m0 {
    public static long a(h02.a aVar) {
        h02.b g17;
        if (aVar == null || (g17 = g()) == null) {
            return -1L;
        }
        j(aVar.field_appId);
        k(aVar.field_downloadUrl);
        j(aVar.field_rawAppId);
        aVar.field_updateTime = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoDBHelper", "insert downloadinfo: " + aVar.field_downloadId + ", ret=" + g17.insert(aVar));
        return aVar.field_downloadId;
    }

    public static java.util.LinkedList b() {
        h02.b g17 = g();
        if (g17 == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoStorage", "getAllTasks, sql = select * from FileDownloadInfo");
        android.database.Cursor rawQuery = g17.rawQuery("select * from FileDownloadInfo", new java.lang.String[0]);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                h02.a aVar = new h02.a();
                aVar.convertFrom(rawQuery);
                linkedList.add(aVar);
            }
            rawQuery.close();
        }
        return linkedList;
    }

    public static h02.a c(long j17) {
        h02.b g17 = g();
        if (g17 == null) {
            return null;
        }
        return g17.D0(j17);
    }

    public static h02.a d(java.lang.String str) {
        h02.b g17 = g();
        if (g17 == null) {
            return null;
        }
        return g17.z0(str);
    }

    public static h02.a e(long j17) {
        h02.b g17 = g();
        if (g17 == null) {
            return null;
        }
        return g17.D0(j17);
    }

    public static h02.a f(java.lang.String str) {
        h02.b g17 = g();
        h02.a aVar = null;
        if (g17 == null) {
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadInfoStorage", "Null or nil url");
        } else {
            android.database.Cursor rawQuery = g17.rawQuery("select * from FileDownloadInfo where downloadUrl=?", str);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    aVar = new h02.a();
                    aVar.convertFrom(rawQuery);
                }
                rawQuery.close();
            }
        }
        return aVar;
    }

    public static h02.b g() {
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                if (i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadInfoDBHelper", "service not ready");
                    return null;
                }
                a02.g gVar = (a02.g) ((com.tencent.mm.plugin.downloader.api.g) i95.n0.c(com.tencent.mm.plugin.downloader.api.g.class));
                gVar.requireAccountInitialized();
                return gVar.f380d;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadInfoDBHelper", "no user login");
        return null;
    }

    public static boolean h(java.lang.String str) {
        android.database.Cursor rawQuery;
        h02.b g17 = g();
        if (g17 == null || (rawQuery = g17.rawQuery(java.lang.String.format("select count(*) from %s where %s=?", "FileDownloadInfo", "downloadUrl"), str)) == null || !rawQuery.moveToFirst()) {
            return false;
        }
        int i17 = rawQuery.getInt(0);
        rawQuery.close();
        return i17 > 1;
    }

    public static boolean i(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoDBHelper", "removeDownloadInfo id: [%s]", java.lang.Long.valueOf(j17));
        h02.b g17 = g();
        if (g17 == null) {
            return false;
        }
        h02.a aVar = new h02.a();
        aVar.field_downloadId = j17;
        return g17.delete(aVar, new java.lang.String[0]);
    }

    public static boolean j(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoDBHelper", "removeDownloadInfoByAppIdIfExist id: [%s]", str);
        h02.b g17 = g();
        if (g17 == null) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return g17.delete("FileDownloadInfo", "appId=? or rawAppId=?", new java.lang.String[]{str, str}) > 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, appId is null");
        return false;
    }

    public static boolean k(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoDBHelper", "removeDownloadInfoByURLIfExist url: [%s]", str);
        h02.b g17 = g();
        if (g17 == null) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return g17.delete("FileDownloadInfo", "downloadUrl=?", new java.lang.String[]{str}) > 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, url is null");
        return false;
    }

    public static long l(dm.t3 t3Var) {
        h02.b g17;
        if (t3Var == null || (g17 = g()) == null) {
            return -1L;
        }
        t3Var.field_updateTime = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoDBHelper", "Update Downloadinfo, ID: %d, ret: %b, Status: %d", java.lang.Long.valueOf(t3Var.field_downloadId), java.lang.Boolean.valueOf(g17.update(t3Var, new java.lang.String[0])), java.lang.Integer.valueOf(t3Var.field_status));
        return t3Var.field_downloadId;
    }

    public static boolean m(java.lang.String str, int i17) {
        h02.b g17 = g();
        if (g17 == null) {
            return false;
        }
        java.lang.String format = java.lang.String.format("update %s set %s=%d where %s=\"%s\"", "FileDownloadInfo", "status", java.lang.Integer.valueOf(i17), "downloadUrl", str);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("status", java.lang.Integer.valueOf(i17));
        boolean z17 = g17.update("FileDownloadInfo", contentValues, "downloadUrl=?", new java.lang.String[]{str}) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadInfoStorage", "updateDownloadState, sql : %s\ndownloadUrl : %s, status : %d, ret : %s", format, str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
