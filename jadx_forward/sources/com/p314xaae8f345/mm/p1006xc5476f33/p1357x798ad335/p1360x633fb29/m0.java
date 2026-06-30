package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public abstract class m0 {
    public static long a(h02.a aVar) {
        h02.b g17;
        if (aVar == null || (g17 = g()) == null) {
            return -1L;
        }
        j(aVar.f68404x28d45f97);
        k(aVar.f68411x238eb002);
        j(aVar.f68430x3a1eb979);
        aVar.f68445xa783a79b = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoDBHelper", "insert downloadinfo: " + aVar.f68408x32b20428 + ", ret=" + g17.mo880xb970c2b9(aVar));
        return aVar.f68408x32b20428;
    }

    public static java.util.LinkedList b() {
        h02.b g17 = g();
        if (g17 == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoStorage", "getAllTasks, sql = select * from FileDownloadInfo");
        android.database.Cursor m145256x1d3f4980 = g17.m145256x1d3f4980("select * from FileDownloadInfo", new java.lang.String[0]);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (m145256x1d3f4980 != null) {
            while (m145256x1d3f4980.moveToNext()) {
                h02.a aVar = new h02.a();
                aVar.mo9015xbf5d97fd(m145256x1d3f4980);
                linkedList.add(aVar);
            }
            m145256x1d3f4980.close();
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
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadInfoStorage", "Null or nil url");
        } else {
            android.database.Cursor m145256x1d3f4980 = g17.m145256x1d3f4980("select * from FileDownloadInfo where downloadUrl=?", str);
            if (m145256x1d3f4980 != null) {
                if (m145256x1d3f4980.moveToFirst()) {
                    aVar = new h02.a();
                    aVar.mo9015xbf5d97fd(m145256x1d3f4980);
                }
                m145256x1d3f4980.close();
            }
        }
        return aVar;
    }

    public static h02.b g() {
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (!gm0.m.r()) {
                if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadInfoDBHelper", "service not ready");
                    return null;
                }
                a02.g gVar = (a02.g) ((com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.g.class));
                gVar.m134976x2690a4ac();
                return gVar.f81913d;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadInfoDBHelper", "no user login");
        return null;
    }

    public static boolean h(java.lang.String str) {
        android.database.Cursor m145256x1d3f4980;
        h02.b g17 = g();
        if (g17 == null || (m145256x1d3f4980 = g17.m145256x1d3f4980(java.lang.String.format("select count(*) from %s where %s=?", "FileDownloadInfo", "downloadUrl"), str)) == null || !m145256x1d3f4980.moveToFirst()) {
            return false;
        }
        int i17 = m145256x1d3f4980.getInt(0);
        m145256x1d3f4980.close();
        return i17 > 1;
    }

    public static boolean i(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoDBHelper", "removeDownloadInfo id: [%s]", java.lang.Long.valueOf(j17));
        h02.b g17 = g();
        if (g17 == null) {
            return false;
        }
        h02.a aVar = new h02.a();
        aVar.f68408x32b20428 = j17;
        return g17.mo9951xb06685ab(aVar, new java.lang.String[0]);
    }

    public static boolean j(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoDBHelper", "removeDownloadInfoByAppIdIfExist id: [%s]", str);
        h02.b g17 = g();
        if (g17 == null) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return g17.m145252xb06685ab("FileDownloadInfo", "appId=? or rawAppId=?", new java.lang.String[]{str, str}) > 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, appId is null");
        return false;
    }

    public static boolean k(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoDBHelper", "removeDownloadInfoByURLIfExist url: [%s]", str);
        h02.b g17 = g();
        if (g17 == null) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return g17.m145252xb06685ab("FileDownloadInfo", "downloadUrl=?", new java.lang.String[]{str}) > 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadInfoStorage", "deledonloadinfo failed, url is null");
        return false;
    }

    public static long l(dm.t3 t3Var) {
        h02.b g17;
        if (t3Var == null || (g17 = g()) == null) {
            return -1L;
        }
        t3Var.f68445xa783a79b = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoDBHelper", "Update Downloadinfo, ID: %d, ret: %b, Status: %d", java.lang.Long.valueOf(t3Var.f68408x32b20428), java.lang.Boolean.valueOf(g17.mo9952xce0038c9(t3Var, new java.lang.String[0])), java.lang.Integer.valueOf(t3Var.f68441x10a0fed7));
        return t3Var.f68408x32b20428;
    }

    public static boolean m(java.lang.String str, int i17) {
        h02.b g17 = g();
        if (g17 == null) {
            return false;
        }
        java.lang.String format = java.lang.String.format("update %s set %s=%d where %s=\"%s\"", "FileDownloadInfo", "status", java.lang.Integer.valueOf(i17), "downloadUrl", str);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("status", java.lang.Integer.valueOf(i17));
        boolean z17 = g17.m145257xce0038c9("FileDownloadInfo", contentValues, "downloadUrl=?", new java.lang.String[]{str}) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadInfoStorage", "updateDownloadState, sql : %s\ndownloadUrl : %s, status : %d, ret : %s", format, str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
