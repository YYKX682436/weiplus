package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f84687a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.g3 f84688b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f84689c;

    public j2(com.tencent.mm.plugin.appbrand.o6 rt6, com.tencent.mm.plugin.appbrand.g3 process) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(process, "process");
        this.f84687a = rt6;
        this.f84688b = process;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f84689c = linkedList;
        if (rt6.q2() && ((com.tencent.mm.plugin.appbrand.performance.a) rt6.b(com.tencent.mm.plugin.appbrand.performance.a.class)).f87326f) {
            linkedList.add(com.tencent.mm.plugin.appbrand.launching.f2.f84605d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("app(");
        sb6.append(rt6.f74803n);
        sb6.append(") mayShowSplashAdWhenLaunch:");
        sb6.append(rt6.v0());
        sb6.append(", isCheckShowAdPrepareProcessReady:");
        sb6.append(rt6.A2 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimePostResourcePreparedJobsBatchRun[AppBrandSplashAd]", sb6.toString());
        if (rt6.v0()) {
            if (!(rt6.A2 != null)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimePostResourcePreparedJobsBatchRun[AppBrandSplashAd]", "app(" + rt6.f74803n + ") do not add prepare orientation action");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimePostResourcePreparedJobsBatchRun[AppBrandSplashAd]", "app(" + rt6.f74803n + ") add prepare orientation action");
        linkedList.add(new com.tencent.mm.plugin.appbrand.launching.g2(this));
    }
}
