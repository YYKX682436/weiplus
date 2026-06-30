package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class w1 implements kg1.e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.quality.w1 f88373a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f88374b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f88375c;

    static {
        com.tencent.mm.plugin.appbrand.report.quality.w1 w1Var = new com.tencent.mm.plugin.appbrand.report.quality.w1();
        f88373a = w1Var;
        f88374b = new java.util.concurrent.ConcurrentHashMap();
        f88375c = new java.util.concurrent.ConcurrentHashMap();
        b();
        kg1.m c17 = com.tencent.mm.plugin.appbrand.keylogger.b0.c(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, "mp");
        kotlin.jvm.internal.o.d(c17);
        w1Var.h(c17);
    }

    public static final boolean a() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d || z65.c.a();
    }

    public static final void b() {
        if (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d && a()) {
            try {
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCBoolean(true), com.tencent.mm.plugin.appbrand.report.quality.c0.class, null);
                kx3.a.f313280a = true;
                com.tencent.mars.xlog.Log.setLevel(0, false);
                com.tencent.mars.xlog.Log.setConsoleLogOpen(true);
            } catch (java.lang.Throwable th6) {
                kx3.a.f313280a = true;
                throw th6;
            }
        }
    }

    public static final void d(com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct wALifeCycleTimeAxisItemStruct) {
        kotlin.jvm.internal.o.g(wALifeCycleTimeAxisItemStruct, "<this>");
        boolean z17 = com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d;
        java.lang.String m17 = wALifeCycleTimeAxisItemStruct.m();
        com.tencent.mm.plugin.appbrand.report.d dVar = com.tencent.mm.plugin.appbrand.report.d.f87824a;
        kotlin.jvm.internal.o.d(m17);
        dVar.c(19175, z17 ? 1 : 0, z17, z17, z17, m17);
    }

    public static final com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct f(java.lang.String str, java.lang.String str2, kg1.a aVar) {
        com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct wALifeCycleTimeAxisItemStruct = new com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct();
        wALifeCycleTimeAxisItemStruct.f61959d = wALifeCycleTimeAxisItemStruct.b("InstanceId", str, true);
        wALifeCycleTimeAxisItemStruct.f61960e = wALifeCycleTimeAxisItemStruct.b("Appid", str2, true);
        kg1.h hVar = (kg1.h) aVar;
        wALifeCycleTimeAxisItemStruct.f61962g = wALifeCycleTimeAxisItemStruct.b("EventName", hVar.f307694b, true);
        kg1.a aVar2 = (kg1.a) f88375c.get(aVar);
        wALifeCycleTimeAxisItemStruct.f61964i = wALifeCycleTimeAxisItemStruct.b("Parent", aVar2 == null ? null : com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepLaunch == aVar2 ? "StartUp" : ((kg1.h) aVar2).f307694b, true);
        java.lang.String str3 = hVar.f307697e;
        kotlin.jvm.internal.o.f(str3, "desc(...)");
        if (r26.n0.B(str3, "(Global)", false)) {
            wALifeCycleTimeAxisItemStruct.f61965j = 0L;
        } else if (r26.n0.B(str3, "(View)", false)) {
            wALifeCycleTimeAxisItemStruct.f61965j = 1L;
        } else if (r26.n0.B(str3, "(Service)", false)) {
            wALifeCycleTimeAxisItemStruct.f61965j = 2L;
        } else {
            wALifeCycleTimeAxisItemStruct.f61965j = 3L;
        }
        return wALifeCycleTimeAxisItemStruct;
    }

    public final com.tencent.mm.sdk.platformtools.o4 c() {
        return com.tencent.mm.sdk.platformtools.o4.N("WAKeyStepKvLogger_RUNNING_PROCESS", 2, null);
    }

    public final void e(java.lang.String str, kg1.a aVar, long j17, com.tencent.mm.plugin.appbrand.report.quality.u1 u1Var) {
        java.lang.String str2;
        long j18;
        if (!a() || aVar == null || str == null) {
            return;
        }
        if (com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCBoolean(true), com.tencent.mm.plugin.appbrand.report.quality.c0.class, null);
        }
        if (c().getBoolean(str, false) && (str2 = (java.lang.String) f88374b.get(str)) != null) {
            if (aVar instanceof kg1.n) {
                com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct f17 = f(str2, str, aVar);
                f17.f61962g = f17.b("EventName", "StartUp", true);
                f17.f61963h = 0L;
                f17.f61961f = java.lang.System.currentTimeMillis();
                d(f17);
                return;
            }
            if (aVar instanceof kg1.i) {
                com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct f18 = f(str2, str, aVar);
                f18.f61962g = f18.b("EventName", "StartUp", true);
                f18.f61963h = 1L;
                f18.f61961f = java.lang.System.currentTimeMillis();
                d(f18);
                return;
            }
            if (com.tencent.mm.plugin.appbrand.report.quality.v1.f88364a[u1Var.ordinal()] == 3) {
                com.tencent.mm.sdk.platformtools.o4 c17 = c();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append("__SPLITOR_PROCESS_REPORTED_STARTED__");
                java.lang.String str3 = ((kg1.h) aVar).f307694b;
                sb6.append(str3);
                if (c17.f(sb6.toString())) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WAKeyStepKvLogger", "onStepStart id:" + str + " step:" + str3);
                com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct f19 = f(str2, str, aVar);
                f19.f61963h = 0L;
                f19.f61961f = java.lang.System.currentTimeMillis();
                d(f19);
                c().putLong(str + "__SPLITOR_PROCESS_REPORTED_STARTED__" + str3, java.lang.System.currentTimeMillis());
                return;
            }
            com.tencent.mm.sdk.platformtools.o4 c18 = c();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("__SPLITOR_PROCESS_REPORTED_STARTED__");
            java.lang.String str4 = ((kg1.h) aVar).f307694b;
            sb7.append(str4);
            if (c18.f(sb7.toString())) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                j18 = currentTimeMillis - c().getLong(str + "__SPLITOR_PROCESS_REPORTED_STARTED__" + str4, currentTimeMillis);
            } else {
                j18 = j17;
            }
            int ordinal = u1Var.ordinal();
            if (ordinal == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WAKeyStepKvLogger", "onStepOK id:" + str + " step:" + str4 + " cost:" + j18);
            } else if (ordinal == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WAKeyStepKvLogger", "onStepFail id:" + str + " step:" + str4 + " cost:" + j18);
            }
            if (j18 <= 0) {
                com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct f27 = f(str2, str, aVar);
                f27.f61963h = 2L;
                f27.f61961f = java.lang.System.currentTimeMillis();
                d(f27);
                return;
            }
            com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct f28 = f(str2, str, aVar);
            f28.f61963h = com.tencent.mm.plugin.appbrand.report.quality.u1.f88358e != u1Var ? 3L : 1L;
            f28.f61961f = java.lang.System.currentTimeMillis();
            d(f28);
            if (c().f(str + "__SPLITOR_PROCESS_REPORTED_STARTED__" + str4)) {
                return;
            }
            com.tencent.mm.autogen.mmdata.rpt.WALifeCycleTimeAxisItemStruct f29 = f(str2, str, aVar);
            f29.f61963h = 0L;
            f29.f61961f = java.lang.System.currentTimeMillis() - j18;
            d(f29);
        }
    }

    public final void g(java.lang.String str, java.lang.String instanceId) {
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        if (str == null || str.length() == 0) {
            return;
        }
        f88374b.put(str, instanceId);
    }

    public final void h(kg1.m mVar) {
        java.lang.Iterable<kg1.m> iterable = mVar.f307707b;
        if (iterable == null) {
            iterable = kz5.p0.f313996d;
        }
        for (kg1.m mVar2 : iterable) {
            java.util.List list = mVar2.f307707b;
            if (!(list == null || list.isEmpty())) {
                f88373a.h(mVar2);
            }
            if (mVar.b() != null) {
                kg1.a b17 = mVar2.b();
                kotlin.jvm.internal.o.d(b17);
                kg1.a b18 = mVar.b();
                kotlin.jvm.internal.o.d(b18);
                f88375c.put(b17, b18);
            }
        }
    }
}
