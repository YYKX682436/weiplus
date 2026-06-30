package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.x5 f92376d = new com.tencent.mm.plugin.appbrand.x5();

    @Override // java.lang.Runnable
    public final void run() {
        cm.h hVar;
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17;
        try {
            java.util.LinkedHashMap linkedHashMap = com.tencent.mm.plugin.appbrand.l.f84209b;
            synchronized (linkedHashMap) {
                hVar = null;
                o6Var = linkedHashMap.isEmpty() ? null : (com.tencent.mm.plugin.appbrand.o6) linkedHashMap.values().toArray()[linkedHashMap.size() - 1];
            }
            if (o6Var == null || (a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(o6Var)) == null) {
                return;
            }
            java.lang.String e17 = lj.f.e(android.os.Looper.getMainLooper().getThread().getStackTrace());
            com.tencent.mm.autogen.mmdata.rpt.WeAppInitLagMonitorStruct weAppInitLagMonitorStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppInitLagMonitorStruct();
            weAppInitLagMonitorStruct.f62279d = weAppInitLagMonitorStruct.b("AppId", o6Var.f74803n, true);
            weAppInitLagMonitorStruct.f62280e = a17.f88139i;
            int i17 = a17.f88136f;
            if (i17 == 1) {
                hVar = cm.h.release;
            } else if (i17 == 2) {
                hVar = cm.h.debug;
            } else if (i17 == 3) {
                hVar = cm.h.demo;
            }
            weAppInitLagMonitorStruct.f62281f = hVar;
            weAppInitLagMonitorStruct.f62282g = a17.f88137g;
            weAppInitLagMonitorStruct.f62283h = a17.f88138h;
            weAppInitLagMonitorStruct.f62284i = weAppInitLagMonitorStruct.b("InstanceId", a17.f88134d, true);
            weAppInitLagMonitorStruct.f62285j = weAppInitLagMonitorStruct.b("ProcessName", bm5.f1.a(), true);
            weAppInitLagMonitorStruct.f62286k = weAppInitLagMonitorStruct.b("ThreadName", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM, true);
            weAppInitLagMonitorStruct.f62287l = weAppInitLagMonitorStruct.b("Stack", e17, true);
            weAppInitLagMonitorStruct.f62288m = weAppInitLagMonitorStruct.b("StackID", com.tencent.mm.sdk.platformtools.w2.a(e17), true);
            weAppInitLagMonitorStruct.f62289n = ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.appbrand.y5.f92413c).getValue()).longValue();
            weAppInitLagMonitorStruct.k();
        } catch (java.lang.Exception unused) {
        }
    }
}
