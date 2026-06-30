package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* renamed from: com.tencent.mm.plugin.downloader.model.FileDownloadService */
/* loaded from: classes8.dex */
public class C13221x3505cfd1 extends com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21024xc1ed8ab9 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f178489m = "FileDownloadService_extra_" + dm.i4.f66865x76d1ec5a;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f178490n = "FileDownloadService_extra_action_type";

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f178491o = "FileDownloadService_extra_file_path";

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f178492p = "FileDownloadService_extra_md5";

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f178493q = "FileDownloadService_extra_change_url";

    public C13221x3505cfd1() {
        super("FileDownloadService");
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public java.lang.String b() {
        return "MicroMsg.FileDownloadService";
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21024xc1ed8ab9
    public void i(android.content.Intent intent) {
        h02.a c17;
        long j17;
        java.lang.String str;
        java.lang.String str2;
        boolean b17;
        long c18;
        h02.a d17;
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra(f178490n, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadService", "handle intent type : %d", java.lang.Integer.valueOf(intExtra));
        if (intExtra != 1) {
            java.lang.String str3 = f178491o;
            if (intExtra == 3) {
                java.lang.String stringExtra = intent.getStringExtra(str3);
                long longExtra = intent.getLongExtra("downloadId", -1L);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || !com.p314xaae8f345.mm.vfs.w6.j(stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadService", "Invalid file path, ignored");
                    return;
                }
                h02.a c19 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(longExtra);
                if (c19 != null) {
                    k02.l.a(c19.f68408x32b20428, false, null);
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadAppUtil", "installApk, path is null");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAppUtil", "installApk, path = " + stringExtra);
                if (com.p314xaae8f345.mm.vfs.w6.j(stringExtra)) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, stringExtra, null, true);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadAppUtil", "installApk, path not exists");
                    return;
                }
            }
            if (intExtra == 4 && gm0.j1.b().m()) {
                gm0.j1.b();
                if (gm0.m.r()) {
                    return;
                }
                long longExtra2 = intent.getLongExtra("downloadId", -1L);
                h02.a c27 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(longExtra2);
                if (c27 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadService", "can not find info:, id = " + longExtra2);
                    return;
                }
                java.lang.String stringExtra2 = intent.getStringExtra(str3);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) || !com.p314xaae8f345.mm.vfs.w6.j(stringExtra2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadService", "Invalid file path, ignored");
                    return;
                }
                try {
                    java.lang.String string = new org.json.JSONObject(c27.f68417x26b3182a).getString("appId");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c27.f68417x26b3182a, 11311002L, 1L, 2, "{\"status\":3}");
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f398565k = 1378;
                    b1Var.f398547b = string;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FileDownloadService", e17, "Exception:can not get appid", new java.lang.Object[0]);
                    return;
                }
            }
            return;
        }
        long longExtra3 = intent.getLongExtra(f178489m, -1L);
        if (longExtra3 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadService", "Invalid id");
            return;
        }
        if (gm0.j1.b().m()) {
            gm0.j1.b();
            if (gm0.m.r() || (c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(longExtra3)) == null) {
                return;
            }
            boolean z17 = intent.getBooleanExtra(f178493q, false) || c17.f68425x9ddfd98b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadService", "filePath = " + c17.f68419xf1e9b966);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68419xf1e9b966) || !com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 5L, 1L, false);
                c17.f68441x10a0fed7 = 4;
                c17.f68416x1c571ead = 806;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i();
                i17.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "onDownloadFailed, id = %d, errCode = %d", java.lang.Long.valueOf(longExtra3), 806);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var = i17.f178664f;
                if (l0Var != null) {
                    l0Var.c(longExtra3, 806, z17);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadService", "file not exists, appid = " + c17.f68404x28d45f97);
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68426x4b6e68b9)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadService", "Invalid original md5, abort checking");
                c17.f68441x10a0fed7 = 3;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().n(longExtra3, z17);
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68404x28d45f97)) {
                j17 = 0;
                str = "";
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                try {
                    str = e02.k.a(new com.p314xaae8f345.mm.vfs.r6(c17.f68419xf1e9b966));
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloadService", "readChannelId exception : " + e18.getMessage());
                    str = "";
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadService", "readChannelId, channelId:%s, cost time: %d", str, java.lang.Long.valueOf(currentTimeMillis2));
                j17 = 0 + currentTimeMillis2;
            }
            java.lang.String str4 = c17.f68404x28d45f97;
            g02.c cVar = new g02.c(str4, c17.f68408x32b20428, str, j17, c17.f68431x4651c731 ? 1 : 0);
            java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.n0.f178621a;
            if (c17.f68434x671f82e6 == null) {
                java.lang.String str5 = c17.f68419xf1e9b966;
                java.lang.String str6 = c17.f68426x4b6e68b9;
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str5));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadMD5Manager", "MD5 Check: %s, File Exists: %b", str5, java.lang.Boolean.valueOf(r6Var.m()));
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.u());
                long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadMD5Manager", "MD5 Check Time: %d", java.lang.Long.valueOf(currentTimeMillis4));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadMD5Manager", "Original MD5: %s, Calculated MD5: %s", str6, p17);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) || (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(str4)) == null) {
                    str2 = "MicroMsg.FileDownloadService";
                } else {
                    str2 = "MicroMsg.FileDownloadService";
                    g02.b.c(111, new g02.c(str4, d17.f68408x32b20428, "", currentTimeMillis4, d17.f68431x4651c731 ? 1 : 0));
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                    b17 = r6Var.m();
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadMD5Manager", "check from file failed, may caused by low memory while checking md5");
                    b17 = r6Var.m();
                } else {
                    b17 = str6.trim().equalsIgnoreCase(p17.trim());
                }
            } else {
                str2 = "MicroMsg.FileDownloadService";
                b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.n0.b(c17);
            }
            if (z17) {
                if (b17) {
                    g02.b.d(c17.f68404x28d45f97, 21L, 1L);
                    g02.b.c(108, cVar);
                } else {
                    g02.b.d(c17.f68404x28d45f97, 22L, 1L);
                    g02.b.c(109, cVar);
                }
            }
            if (!b17) {
                if (c17.f68411x238eb002.startsWith("https")) {
                    g02.b.d(c17.f68404x28d45f97, 32L, 1L);
                } else {
                    g02.b.d(c17.f68404x28d45f97, 31L, 1L);
                }
            }
            if (b17) {
                c17.f68441x10a0fed7 = 3;
                c17.f68407xf1be7c79 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.m(c17.f68411x238eb002, 3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().n(longExtra3, z17);
                return;
            }
            if (c17.f68414xf4f8adf4 == 3) {
                if (c17.f68411x238eb002.startsWith("https")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 10L, 1L, false);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 9L, 1L, false);
                }
            } else if (c17.f68411x238eb002.startsWith("https")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 7L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 6L, 1L, false);
            }
            c17.f68441x10a0fed7 = 4;
            c17.f68407xf1be7c79 = str;
            c17.f68416x1c571ead = 802;
            c17.f68413xf432b5ad = com.p314xaae8f345.mm.vfs.w6.k(c17.f68419xf1e9b966);
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            java.lang.String str7 = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "ChannelId = %s, receivedSize = %d, fileSize = %d", str, java.lang.Long.valueOf(c17.f68413xf432b5ad), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(c17.f68419xf1e9b966)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "delete file: %s", c17.f68419xf1e9b966);
            com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "checkMd5, isWifi: %b, hasChangeUrl: %b, hasHttpsUrl: %b", java.lang.Boolean.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68433xf9fba680)));
            if (!((!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f68433xf9fba680)) ? false : true)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i();
                i18.getClass();
                h02.a c28 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(longExtra3);
                if (c28 == null) {
                    return;
                }
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                if (c28.f68435x73c7b92d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c28.f68428x579b8428)) {
                    i18.y(c28.f68404x28d45f97, c28.f68428x579b8428, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cel), null);
                } else if (c28.f68435x73c7b92d && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c28.f68418xf1e8cfcc)) {
                    i18.y(c28.f68404x28d45f97, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cel), "", null);
                } else if (c28.f68435x73c7b92d && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c28.f68418xf1e8cfcc)) {
                    i18.y(c28.f68404x28d45f97, c28.f68418xf1e8cfcc, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cel), null);
                }
                i18.f178664f.c(longExtra3, 802, z17);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
            t0Var.f178683a = c17.f68433xf9fba680;
            t0Var.f178685c = c17.f68420xf1eb3542;
            t0Var.f178686d = c17.f68418xf1e8cfcc;
            t0Var.A = c17.f68428x579b8428;
            t0Var.f178689g = c17.f68404x28d45f97;
            t0Var.f178687e = c17.f68426x4b6e68b9;
            t0Var.f178694l = c17.f68432x29cbf907;
            t0Var.f178699q = c17.f68417x26b3182a;
            t0Var.f178695m = true;
            t0Var.f178691i = true;
            t0Var.f178688f = 1;
            t0Var.f178690h = c17.f68429xa1e9e82c;
            t0Var.f178698p = true;
            if (c17.f68434x671f82e6 != null) {
                d02.q qVar = new d02.q();
                try {
                    qVar.mo11468x92b714fd(c17.f68434x671f82e6);
                    t0Var.f178705w = qVar.f306889d;
                } catch (java.io.IOException unused) {
                }
            }
            if (c17.f68414xf4f8adf4 != 3) {
                c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 8L, 1L, false);
            } else {
                c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().c(t0Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(710L, 11L, 1L, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "MD5 check failed, restart download, id = " + c18);
            g02.b.c(110, cVar);
            g02.b.d(c17.f68404x28d45f97, 30L, 1L);
        }
    }
}
