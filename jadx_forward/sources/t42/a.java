package t42;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f497030a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f497031b = "";

    public static boolean a() {
        if (f497030a == null) {
            if (g42.i.g()) {
                f497030a = java.lang.Boolean.TRUE;
            } else {
                f497030a = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_edge_computing_is_monitor_performance, false));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingMonitor", "[EdgeComputingMonitor] getMonitorPerformanceSwitch sMonitorSwitch : " + f497030a);
        }
        return f497030a.booleanValue();
    }

    public static void b(java.lang.String str, int i17, long j17) {
        if (a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20177, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        }
        g42.i.b("EdgeComputingMonitor", "[EdgeComputingMonitor] monitorProcess configID : %s, process : %d, reportTimeEC : %d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
    }

    public static void c(long j17, int i17) {
        if (j17 <= 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 26L, 1L, false);
        } else if (j17 <= 100) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 27L, 1L, false);
        } else if (j17 <= 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 28L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 29L, 1L, false);
        }
        if (j17 <= 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(1409L, 53L, j17, false);
            g0Var.mo68477x336bdfd8(1409L, 54L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.mo68477x336bdfd8(1409L, 98L, 1L, false);
        if (a()) {
            g0Var2.d(20176, f497031b, 5, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), "");
        }
        g42.i.b("EdgeComputingMonitor", "[EdgeComputingMonitor] statJsApiCostTime configID : %s, costTime : %d, type : %d", f497031b, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    public static void d(int i17) {
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 38L, 1L, false);
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 30L, 1L, false);
        } else if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 31L, 1L, false);
        } else if (i17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 32L, 1L, false);
        } else if (i17 != 5) {
            return;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 33L, 1L, false);
        }
        g42.i.a("EdgeComputingMonitor", "[EdgeComputingMonitor] statRealReportProcess reportProcess : " + i17);
    }

    public static void e(java.lang.String str, long j17) {
        if (a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20176, str, 11, 0, java.lang.Long.valueOf(j17), "");
        }
    }

    public static void f(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 20L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 21L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 55L, 1L, false);
        g42.i.a("EdgeComputingMonitor", "[EdgeComputingMonitor] statScriptConfigParseError success : " + z17);
    }

    public static void g(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 177L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 178L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 179L, 1L, false);
        g42.i.a("EdgeComputingMonitor", "[EdgeComputingMonitor] statScriptDownloadSuccess success : " + z17);
    }

    public static void h(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 24L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 25L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 37L, 1L, false);
        g42.i.a("EdgeComputingMonitor", "[EdgeComputingMonitor] statV8ScriptEngineInitError success : " + z17);
    }

    public static void i(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 22L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 23L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 36L, 1L, false);
        g42.i.a("EdgeComputingMonitor", "[EdgeComputingMonitor] statSqlConfigParseError success : " + z17);
    }

    public static void j(java.lang.String str, long j17, int i17) {
        if (j17 <= 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 8L, 1L, false);
        } else if (j17 <= 100) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 9L, 1L, false);
        } else if (j17 <= 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 10L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1409L, 11L, 1L, false);
        }
        if (j17 <= 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(1409L, 45L, j17, false);
            g0Var.mo68477x336bdfd8(1409L, 46L, 1L, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.mo68477x336bdfd8(1409L, 91L, 1L, false);
        if (a()) {
            g0Var2.d(20176, str, 2, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), "");
        }
        g42.i.b("EdgeComputingMonitor", "[EdgeComputingMonitor] statStorageCostTime configID : %s, costTime : %d, dataSzie : %d", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }
}
