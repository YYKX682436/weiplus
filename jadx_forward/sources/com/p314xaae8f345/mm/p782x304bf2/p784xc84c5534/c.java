package com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534;

/* loaded from: classes8.dex */
public class c extends jj0.a {
    public static void f(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc) {
        long j17;
        long j18;
        long j19;
        long j27;
        long j28;
        java.lang.String str;
        int i17;
        long j29;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameReportImpl", "reportWebPerformanceInMM, %s", c10723x8ab106bc.m45675x9616526c());
        long j37 = c10723x8ab106bc.f149719s;
        long j38 = c10723x8ab106bc.f149718r;
        long j39 = j37 - j38 > 0 ? j37 - j38 : 0L;
        long j47 = c10723x8ab106bc.f149720t - j38;
        long j48 = c10723x8ab106bc.f149721u;
        int i18 = j48 > 0 ? 1 : 0;
        if (i18 == 1) {
            j18 = j48 - j38;
            j17 = c10723x8ab106bc.f149722v - j38;
        } else {
            j17 = 0;
            j18 = 0;
        }
        int i19 = c10723x8ab106bc.f149711h;
        if (i19 == 1) {
            j19 = c10723x8ab106bc.f149723w - j38;
            j27 = c10723x8ab106bc.f149724x - j38;
        } else {
            j19 = 0;
            j27 = 0;
        }
        long j49 = c10723x8ab106bc.f149725y - j38;
        long j57 = c10723x8ab106bc.f149726z - j38;
        long j58 = c10723x8ab106bc.A - j38;
        long j59 = c10723x8ab106bc.B - j38;
        long j66 = c10723x8ab106bc.C;
        if (j66 != 0) {
            long j67 = j66 - j38;
            j28 = (i19 != 0 || j67 >= 0) ? j67 : -1L;
        } else {
            j28 = 0;
        }
        long j68 = c10723x8ab106bc.D - j38;
        long j69 = c10723x8ab106bc.E - j38;
        long j76 = 0;
        if (i19 == 0 && j69 <= 0) {
            j69 = -1;
        }
        long j77 = j69;
        long j78 = c10723x8ab106bc.F;
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
        int i27 = c10723x8ab106bc.f149713m;
        long j86 = j79;
        if (i27 == 0) {
            long j87 = c10723x8ab106bc.G - j38;
            long j88 = j87 <= 0 ? -1L : j87;
            long j89 = c10723x8ab106bc.H - j38;
            if (j89 <= 0) {
                j89 = -1;
            }
            j76 = j88;
            j29 = j89;
        } else {
            j29 = 0;
        }
        long j96 = c10723x8ab106bc.f149706J - j38;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "url : %s, pkgId: %s, isLuggage : %d, isWePkg: %d, isPreloadWePkg: %d, isPreloadWebCore: %d, hasLoadFinished: %d, gameCenterUICreate: %d, startWebUI: %d,preloadWePkgBgn: %d, preloadWePkgEnd: %d, preloadWebCoreBgn: %d, preloadWebCoreEnd: %d,webUICreate: %d, webUIOnshowBgn: %d, createViewBgn: %d, createViewEnd: %d, jsbridgeInject: %d, loadUrlBgn: %d, onPageStarted: %d, onPageFinished: %d, getA8keyBgn: %d, getA8keyEnd: %d, webUIInfront: %d,webUIDestroy: %d", c10723x8ab106bc.f149707d, c10723x8ab106bc.f149717q, java.lang.Integer.valueOf(c10723x8ab106bc.f149709f), java.lang.Integer.valueOf(c10723x8ab106bc.f149710g), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(c10723x8ab106bc.f149711h), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j39), java.lang.Long.valueOf(j47), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j49), java.lang.Long.valueOf(j57), java.lang.Long.valueOf(j58), java.lang.Long.valueOf(j59), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j68), java.lang.Long.valueOf(j77), java.lang.Long.valueOf(j86), java.lang.Long.valueOf(j76), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(c10723x8ab106bc.I), java.lang.Long.valueOf(j96));
        try {
            str2 = java.net.URLEncoder.encode(c10723x8ab106bc.f149707d, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.io.UnsupportedEncodingException unused) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(16141, str3, java.lang.Integer.valueOf(c10723x8ab106bc.f149709f), java.lang.Integer.valueOf(c10723x8ab106bc.f149710g), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(c10723x8ab106bc.f149711h), java.lang.Long.valueOf(j39), java.lang.Long.valueOf(j47), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j49), java.lang.Long.valueOf(j57), java.lang.Long.valueOf(j58), java.lang.Long.valueOf(j59), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j68), java.lang.Long.valueOf(j77), java.lang.Long.valueOf(j86), java.lang.Long.valueOf(j76), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(c10723x8ab106bc.I), java.lang.Long.valueOf(j96), java.lang.Integer.valueOf(i17), c10723x8ab106bc.f149717q, java.lang.Integer.valueOf(c10723x8ab106bc.f149712i), c10723x8ab106bc.f149708e, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), java.lang.Integer.valueOf(c10723x8ab106bc.f149715o), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(c10723x8ab106bc.f149716p), c10723x8ab106bc.M, c10723x8ab106bc.N, c10723x8ab106bc.P);
        if (i17 != 1) {
            if (c10723x8ab106bc.f149710g == 1) {
                g0Var.C(949L, 5L, 1L);
                return;
            } else {
                g0Var.C(949L, 6L, 1L);
                return;
            }
        }
        if (c10723x8ab106bc.f149715o == 0) {
            g0Var.C(949L, 4L, 1L);
        }
        if (c10723x8ab106bc.H == -1) {
            g0Var.C(949L, 7L, 1L);
        }
    }

    @Override // jj0.a
    public void b(int i17, java.lang.String str, java.lang.String str2, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16171, 0, java.lang.Integer.valueOf(i17), str, str2, java.lang.Long.valueOf(j17));
    }

    @Override // jj0.a
    public void c(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        if (com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.a.f149705d == null) {
            synchronized (com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.a.class) {
                if (com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.a.f149705d == null) {
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.a.f149705d = new com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.a();
                }
            }
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.a.f149705d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMsgReportService", "appId = %s, opType = %d, opStatus = %d, extInfo = %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str3);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.h(str, i17, i18, str2, str3));
    }

    @Override // jj0.a
    public void d(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, long j17, java.lang.String str5, java.lang.String str6, int i27) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportImpl", "reportMsgClick fail, appId is null");
            return;
        }
        android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
        if (j18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportImpl", "reportMsgClick fail, appinfo is null");
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
        java.lang.String str7 = j18.f67386xa1e9e82c;
        if (str7 == null) {
            str7 = "";
        }
        objArr[9] = str7;
        java.lang.String str8 = j18.f67390xda9bc3b3;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.reportMsgClick", a18.f381496b);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.k.a(a18);
    }

    @Override // jj0.a
    public void e(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc) {
        if (c10723x8ab106bc == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10723x8ab106bc.f149707d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameReportImpl", "info is null");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            f(c10723x8ab106bc);
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c10723x8ab106bc, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.b.class, null);
        }
    }
}
