package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f87351a = new java.util.HashMap();

    public static void a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask appBrandPerformanceManager$SetAppPerformanceModeTask = new com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask();
        appBrandPerformanceManager$SetAppPerformanceModeTask.f87322f = str;
        appBrandPerformanceManager$SetAppPerformanceModeTask.f87323g = false;
        appBrandPerformanceManager$SetAppPerformanceModeTask.d();
    }

    public static boolean b(ze.n nVar, com.tencent.mm.plugin.appbrand.performance.a aVar) {
        if (!com.tencent.mm.plugin.appbrand.performance.m.c().booleanValue()) {
            return false;
        }
        java.lang.String str = nVar.f74803n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List<com.tencent.mm.plugin.appbrand.performance.l> list = com.tencent.mm.plugin.appbrand.performance.m.f87365c;
        synchronized (list) {
            if (list.size() == 0) {
                return true;
            }
            list.size();
            for (com.tencent.mm.plugin.appbrand.performance.l lVar : list) {
                java.lang.String str2 = lVar.f87356a;
                if (str2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPerformanceTracer", "appid is null, event is %s", lVar.toString());
                } else if (!str2.equals(str)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPerformanceTracer", "event appid is not equal to current appid, cur appId is %s, event is %s", str, lVar.toString());
                } else if (lVar.f87360e < com.tencent.mm.plugin.appbrand.performance.m.f87363a) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPerformanceTracer", "event start is less than sAppStartTime, event is %s", str, lVar.toString());
                } else {
                    sb6.append(lVar.toString());
                    sb6.append("\n");
                }
            }
            com.tencent.mm.plugin.appbrand.performance.m.f87365c.clear();
            return com.tencent.mm.plugin.appbrand.performance.m.b(str, sb6.toString());
        }
    }

    public static void c(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask appBrandPerformanceManager$SetAppPerformanceModeTask = new com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask();
        appBrandPerformanceManager$SetAppPerformanceModeTask.f87322f = str;
        appBrandPerformanceManager$SetAppPerformanceModeTask.f87323g = true;
        appBrandPerformanceManager$SetAppPerformanceModeTask.d();
    }

    public static void d(ze.n nVar, int i17, long j17) {
        e(nVar, i17, java.lang.String.format("%d ms", java.lang.Long.valueOf(j17)));
    }

    public static void e(ze.n nVar, int i17, java.lang.String str) {
        java.lang.String str2 = nVar.f74803n;
        com.tencent.mm.plugin.appbrand.ui.ga gaVar = nVar.V1;
        if (gaVar != null) {
            ik1.h0.b(new com.tencent.mm.plugin.appbrand.ui.ca(gaVar, i17, str));
            return;
        }
        c01.n2.d().c(str2 + "performance_data", true).i(java.lang.String.valueOf(i17), str);
    }

    public static boolean f(ze.n nVar) {
        com.tencent.mm.plugin.appbrand.performance.a aVar = (com.tencent.mm.plugin.appbrand.performance.a) nVar.b(com.tencent.mm.plugin.appbrand.performance.a.class);
        return aVar != null && aVar.f87324d;
    }
}
