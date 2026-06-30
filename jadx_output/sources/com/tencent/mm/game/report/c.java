package com.tencent.mm.game.report;

/* loaded from: classes8.dex */
public class c extends jj0.a {
    public static void f(com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo) {
        long j17;
        long j18;
        long j19;
        long j27;
        long j28;
        java.lang.String str;
        int i17;
        long j29;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameReportImpl", "reportWebPerformanceInMM, %s", gameWebPerformanceInfo.toString());
        long j37 = gameWebPerformanceInfo.f68186s;
        long j38 = gameWebPerformanceInfo.f68185r;
        long j39 = j37 - j38 > 0 ? j37 - j38 : 0L;
        long j47 = gameWebPerformanceInfo.f68187t - j38;
        long j48 = gameWebPerformanceInfo.f68188u;
        int i18 = j48 > 0 ? 1 : 0;
        if (i18 == 1) {
            j18 = j48 - j38;
            j17 = gameWebPerformanceInfo.f68189v - j38;
        } else {
            j17 = 0;
            j18 = 0;
        }
        int i19 = gameWebPerformanceInfo.f68178h;
        if (i19 == 1) {
            j19 = gameWebPerformanceInfo.f68190w - j38;
            j27 = gameWebPerformanceInfo.f68191x - j38;
        } else {
            j19 = 0;
            j27 = 0;
        }
        long j49 = gameWebPerformanceInfo.f68192y - j38;
        long j57 = gameWebPerformanceInfo.f68193z - j38;
        long j58 = gameWebPerformanceInfo.A - j38;
        long j59 = gameWebPerformanceInfo.B - j38;
        long j66 = gameWebPerformanceInfo.C;
        if (j66 != 0) {
            long j67 = j66 - j38;
            j28 = (i19 != 0 || j67 >= 0) ? j67 : -1L;
        } else {
            j28 = 0;
        }
        long j68 = gameWebPerformanceInfo.D - j38;
        long j69 = gameWebPerformanceInfo.E - j38;
        long j76 = 0;
        if (i19 == 0 && j69 <= 0) {
            j69 = -1;
        }
        long j77 = j69;
        long j78 = gameWebPerformanceInfo.F;
        if (j78 > 0) {
            str = "MicroMsg.GameReportImpl";
            i17 = 1;
        } else {
            str = "MicroMsg.GameReportImpl";
            i17 = 0;
        }
        long j79 = j78 - j38;
        if (i17 == 0 || (i19 == 0 && j79 <= 0)) {
            j79 = -1;
        }
        int i27 = gameWebPerformanceInfo.f68180m;
        long j86 = j79;
        if (i27 == 0) {
            long j87 = gameWebPerformanceInfo.G - j38;
            long j88 = j87 <= 0 ? -1L : j87;
            long j89 = gameWebPerformanceInfo.H - j38;
            if (j89 <= 0) {
                j89 = -1;
            }
            j76 = j88;
            j29 = j89;
        } else {
            j29 = 0;
        }
        long j96 = gameWebPerformanceInfo.f68173J - j38;
        com.tencent.mars.xlog.Log.i(str, "url : %s, pkgId: %s, isLuggage : %d, isWePkg: %d, isPreloadWePkg: %d, isPreloadWebCore: %d, hasLoadFinished: %d, gameCenterUICreate: %d, startWebUI: %d,preloadWePkgBgn: %d, preloadWePkgEnd: %d, preloadWebCoreBgn: %d, preloadWebCoreEnd: %d,webUICreate: %d, webUIOnshowBgn: %d, createViewBgn: %d, createViewEnd: %d, jsbridgeInject: %d, loadUrlBgn: %d, onPageStarted: %d, onPageFinished: %d, getA8keyBgn: %d, getA8keyEnd: %d, webUIInfront: %d,webUIDestroy: %d", gameWebPerformanceInfo.f68174d, gameWebPerformanceInfo.f68184q, java.lang.Integer.valueOf(gameWebPerformanceInfo.f68176f), java.lang.Integer.valueOf(gameWebPerformanceInfo.f68177g), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(gameWebPerformanceInfo.f68178h), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j39), java.lang.Long.valueOf(j47), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j49), java.lang.Long.valueOf(j57), java.lang.Long.valueOf(j58), java.lang.Long.valueOf(j59), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j68), java.lang.Long.valueOf(j77), java.lang.Long.valueOf(j86), java.lang.Long.valueOf(j76), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(gameWebPerformanceInfo.I), java.lang.Long.valueOf(j96));
        try {
            str2 = java.net.URLEncoder.encode(gameWebPerformanceInfo.f68174d, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.io.UnsupportedEncodingException unused) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(16141, str3, java.lang.Integer.valueOf(gameWebPerformanceInfo.f68176f), java.lang.Integer.valueOf(gameWebPerformanceInfo.f68177g), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(gameWebPerformanceInfo.f68178h), java.lang.Long.valueOf(j39), java.lang.Long.valueOf(j47), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j49), java.lang.Long.valueOf(j57), java.lang.Long.valueOf(j58), java.lang.Long.valueOf(j59), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j68), java.lang.Long.valueOf(j77), java.lang.Long.valueOf(j86), java.lang.Long.valueOf(j76), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(gameWebPerformanceInfo.I), java.lang.Long.valueOf(j96), java.lang.Integer.valueOf(i17), gameWebPerformanceInfo.f68184q, java.lang.Integer.valueOf(gameWebPerformanceInfo.f68179i), gameWebPerformanceInfo.f68175e, com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a), java.lang.Integer.valueOf(gameWebPerformanceInfo.f68182o), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(gameWebPerformanceInfo.f68183p), gameWebPerformanceInfo.M, gameWebPerformanceInfo.N, gameWebPerformanceInfo.P);
        if (i17 != 1) {
            if (gameWebPerformanceInfo.f68177g == 1) {
                g0Var.C(949L, 5L, 1L);
                return;
            } else {
                g0Var.C(949L, 6L, 1L);
                return;
            }
        }
        if (gameWebPerformanceInfo.f68182o == 0) {
            g0Var.C(949L, 4L, 1L);
        }
        if (gameWebPerformanceInfo.H == -1) {
            g0Var.C(949L, 7L, 1L);
        }
    }

    @Override // jj0.a
    public void b(int i17, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16171, 0, java.lang.Integer.valueOf(i17), str, str2, java.lang.Long.valueOf(j17));
    }

    @Override // jj0.a
    public void c(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.game.report.a.f68172d == null) {
            synchronized (com.tencent.mm.game.report.a.class) {
                if (com.tencent.mm.game.report.a.f68172d == null) {
                    com.tencent.mm.game.report.a.f68172d = new com.tencent.mm.game.report.a();
                }
            }
        }
        com.tencent.mm.game.report.a.f68172d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMsgReportService", "appId = %s, opType = %d, opStatus = %d, extInfo = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str3);
        gm0.j1.d().g(new com.tencent.mm.game.report.h(str, i17, i18, str2, str3));
    }

    @Override // jj0.a
    public void d(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, long j17, java.lang.String str5, java.lang.String str6, int i27) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameReportImpl", "reportMsgClick fail, appId is null");
            return;
        }
        android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m j18 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        if (j18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameReportImpl", "reportMsgClick fail, appinfo is null");
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[19];
        objArr[0] = str;
        android.content.pm.PackageInfo a17 = ik1.b.a(context2, str2);
        objArr[1] = java.lang.Integer.valueOf(a17 != null ? a17.versionCode : 0);
        objArr[2] = nj0.a.b();
        objArr[3] = str3;
        objArr[4] = java.lang.Integer.valueOf(i17);
        objArr[5] = str4;
        objArr[6] = java.lang.Integer.valueOf(i18);
        objArr[7] = java.lang.Integer.valueOf(i19);
        objArr[8] = java.lang.Integer.valueOf(nj0.a.a(context2));
        java.lang.String str7 = j18.field_packageName;
        if (str7 == null) {
            str7 = "";
        }
        objArr[9] = str7;
        java.lang.String str8 = j18.field_signature;
        if (str8 == null) {
            str8 = "";
        }
        objArr[10] = str8;
        objArr[11] = java.lang.Long.toString(j17);
        objArr[12] = "";
        objArr[13] = str5;
        objArr[14] = "";
        objArr[15] = java.lang.Integer.valueOf(j18.k() ? 1 : 0);
        objArr[16] = str6;
        objArr[17] = "";
        objArr[18] = java.lang.Integer.valueOf(i27);
        jj0.b a18 = jj0.b.a(10531, objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.reportMsgClick", a18.f299963b);
        com.tencent.mm.game.report.k.a(a18);
    }

    @Override // jj0.a
    public void e(com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo) {
        if (gameWebPerformanceInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(gameWebPerformanceInfo.f68174d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameReportImpl", "info is null");
        } else if (com.tencent.mm.sdk.platformtools.x2.n()) {
            f(gameWebPerformanceInfo);
        } else {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, gameWebPerformanceInfo, com.tencent.mm.game.report.b.class, null);
        }
    }
}
