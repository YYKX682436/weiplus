package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f90640a = new java.util.concurrent.ConcurrentHashMap();

    public static final com.tencent.mm.plugin.appbrand.o6 a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC cfg, com.tencent.mm.plugin.appbrand.hc container) {
        kotlin.jvm.internal.o.g(cfg, "cfg");
        kotlin.jvm.internal.o.g(container, "container");
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) f90640a.remove(cfg.f77278d);
        if (o6Var != null) {
            new com.tencent.luggage.sdk.processes.main.LuggagePopRuntimeTask(o6Var).s();
            if (!b(o6Var, "stashed")) {
                return null;
            }
            o6Var.O1(container);
            return o6Var;
        }
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(cfg.f77278d);
        if (b17 != null) {
            if ((com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.e(b17) || b17.Q0() || b17.N0()) && ((b17.f74796e == null || !b17.R0()) && b(b17, "preferPersistent"))) {
                b17.O1(container);
                return b17;
            }
        }
        return null;
    }

    public static final boolean b(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str) {
        boolean z17;
        java.lang.Boolean[] boolArr = {java.lang.Boolean.valueOf(o6Var.J0()), java.lang.Boolean.valueOf(!o6Var.S), java.lang.Boolean.valueOf(!o6Var.L0())};
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSharedPersistentRuntimeStore", "pollOrCreate, existed runtime[" + o6Var.f74803n + "], reason[" + str + "] conditions[" + u46.a.c(boolArr, "{}") + ']');
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i17 = 0;
        while (true) {
            if (i17 >= 3) {
                z17 = true;
                break;
            }
            if (!kotlin.jvm.internal.o.b(boolArr[i17], bool)) {
                z17 = false;
                break;
            }
            i17++;
        }
        return z17;
    }

    public static final void c(com.tencent.mm.plugin.appbrand.o6 runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSharedPersistentRuntimeStore", "stash " + runtime);
        if (!(runtime.f74796e instanceof yi1.a)) {
            runtime.O1(null);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f90640a;
        java.lang.String str = runtime.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        concurrentHashMap.put(str, runtime);
        new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandStashRuntimeTask(runtime).s();
    }
}
