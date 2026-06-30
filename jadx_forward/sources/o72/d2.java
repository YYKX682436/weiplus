package o72;

/* loaded from: classes12.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f424852a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f424853b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_fav_quality_report_open, true);

    public static boolean a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "favitem", null) != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavApiUtil", "[checkXmlIllegal] maps = null, xml parse error");
        return false;
    }

    public static void b() {
        if (!f424853b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[endFavAddReportEnv] needToReport = false, break flow");
            return;
        }
        o72.w2 w2Var = o72.w2.f425042a;
        long d17 = w2Var.d(1);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae b17 = w2Var.b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[endFavAddReportEnv] session = " + d17 + ", struct un find and return");
            return;
        }
        b17.k();
        w2Var.g(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[endFavAddReportEnv] session = " + d17 + ", finish report");
    }

    public static void c() {
        if (!f424853b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[endSyncReportEnv] needToReport == false, return");
            return;
        }
        o72.w2 w2Var = o72.w2.f425042a;
        long d17 = w2Var.d(2);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e e17 = w2Var.e();
        if (e17 == null || d17 == -4369) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[endSyncReportEnv] struct == null, session = " + d17 + ", return");
        }
        if (e17 == null) {
            return;
        }
        int i17 = e17.f137844d;
        w2Var.g(2);
        e17.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[endSyncReportEnv] scene = " + i17 + ", session = " + d17 + ", finish report");
    }

    public static java.lang.String d(java.lang.String str, int i17) {
        return kk.k.g((str + i17 + java.lang.System.currentTimeMillis()).getBytes());
    }

    public static void e(long j17, int i17, int i18, boolean z17, int i19) {
        o72.w2 w2Var = o72.w2.f425042a;
        java.lang.Long l17 = (java.lang.Long) o72.w2.f425047f.get(java.lang.Long.valueOf(j17));
        long longValue = l17 == null ? -4369L : l17.longValue();
        if (longValue == -4369) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavApiUtil", "[reportFavAddQuality] session un find, localId = " + j17);
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae a17 = w2Var.a(longValue);
        a17.f137768t = i19;
        if (z17) {
            a17.f137769u = 0;
            return;
        }
        a17.f137769u = -1;
        a17.f137770v = i17;
        a17.f137771w = i18;
    }

    public static void f(int i17, int i18, java.lang.String str) {
        if (f424852a.add(i17 + "_" + i18 + "_" + str)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6446xfca3563 c6446xfca3563 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6446xfca3563();
            if (i18 < 0) {
                c6446xfca3563.f137872d = -i18;
            } else {
                c6446xfca3563.f137872d = i18;
            }
            if (str == null) {
                str = "";
            }
            c6446xfca3563.f137873e = c6446xfca3563.b("ErrorMsg", str, true);
            c6446xfca3563.f137876h = 2L;
            c6446xfca3563.f137875g = i17;
            c6446xfca3563.k();
            c6446xfca3563.o();
        }
    }

    public static void g(java.lang.String str, int i17, int i18, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[reportFavSyncQualityStepFirst] syncKey = " + str + ", errorType = " + i17 + ", errorCode = " + i18 + ", cost = " + j17 + ", success = " + z17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e e17 = o72.w2.f425042a.e();
        if (e17 == null) {
            return;
        }
        if (z17) {
            e17.f137846f = 0;
        } else {
            e17.f137846f = -1;
            e17.f137847g = i17;
            e17.f137848h = i18;
        }
        e17.f137850j = j17;
        if (j17 >= 30000) {
            e17.f137849i = -1;
        } else {
            e17.f137849i = 0;
        }
    }

    public static void h(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[reportFavSyncQualityStepFirst] retrySuccessflully = " + z17 + ", totalRetryCnt = " + i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e e17 = o72.w2.f425042a.e();
        if (e17 == null) {
            return;
        }
        e17.A = z17 ? 1 : 0;
        e17.B = i17;
    }

    public static void i(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[reportFavSyncQualityStepFirst] writeDBFailed = " + z17 + ", rewriteCanFix = " + z18);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e e17 = o72.w2.f425042a.e();
        if (e17 == null) {
            return;
        }
        e17.f137865y = z17 ? 1 : 0;
        e17.f137866z = z18 ? 1 : 0;
    }

    public static void j(int i17, int i18, int i19, int i27, long j17, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e e17 = o72.w2.f425042a.e();
        if (e17 == null) {
            return;
        }
        e17.f137858r = i17;
        e17.f137859s = i18;
        e17.f137851k = -1;
        e17.f137857q = j17;
        e17.f137853m = i27;
        e17.f137852l = i19;
        if (z17) {
            e17.f137862v = 1;
        } else {
            e17.f137862v = 0;
        }
        if (j17 >= 30000) {
            e17.f137856p = -1;
        } else {
            e17.f137856p = 0;
        }
    }

    public static void k(int i17, int i18, java.lang.String str, int i19, long j17, int i27, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e e17 = o72.w2.f425042a.e();
        if (e17 == null) {
            return;
        }
        e17.f137858r = i17;
        e17.f137859s = i18;
        e17.f137860t = i19;
        if (i19 == 0) {
            e17.f137854n = 0;
        } else {
            e17.f137854n = -1;
            e17.f137855o = e17.b("BatchGetIllegalXmlContent", str, true);
        }
        if (z17) {
            e17.f137862v = 1;
        } else {
            e17.f137862v = 0;
        }
        e17.f137851k = 0;
        e17.f137861u = i27;
        e17.f137857q = j17;
        if (j17 >= 30000) {
            e17.f137856p = -1;
        } else {
            e17.f137856p = 0;
        }
    }

    public static void l(java.lang.String str, int i17, long j17, int i18, int i19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e e17 = o72.w2.f425042a.e();
        if (e17 == null) {
            return;
        }
        e17.f137858r = 0;
        e17.f137859s = 0;
        e17.f137860t = i17;
        if (i17 == 0) {
            e17.f137854n = 0;
        } else {
            e17.f137854n = -1;
            e17.f137855o = e17.b("BatchGetIllegalXmlContent", str, true);
        }
        e17.f137863w = i18;
        e17.f137864x = i19;
        e17.f137851k = 0;
        e17.f137857q = j17;
        if (j17 >= 30000) {
            e17.f137856p = -1;
        } else {
            e17.f137856p = 0;
        }
    }

    public static void m(int i17) {
        o72.w2 w2Var = o72.w2.f425042a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[createReportSession] create report session = " + currentTimeMillis);
        w2Var.f(2, currentTimeMillis);
        w2Var.e().f137844d = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[startSyncReportEnv] scene = " + i17 + ", session = " + currentTimeMillis);
    }
}
