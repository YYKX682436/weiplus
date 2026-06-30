package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class t7 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.oe f88969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.n7 f88970f;

    public t7(com.tencent.mm.plugin.appbrand.n7 n7Var) {
        this.f88970f = n7Var;
    }

    @Override // wu5.b
    public boolean b() {
        com.tencent.mm.plugin.appbrand.oe oeVar = this.f88969e;
        if (oeVar != null) {
            oeVar.f86248d.set(true);
        }
        return super.b();
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "RuntimeLaunchTimeoutFallbackReloadTask|" + this.f88970f.f86038h;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.n7 n7Var = this.f88970f;
        com.tencent.mm.plugin.appbrand.o6 rt6 = n7Var.f86038h;
        com.tencent.mm.plugin.appbrand.launching.r1 prepareTask = n7Var.f86036f;
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(prepareTask, "prepareTask");
        com.tencent.mars.xlog.Log.i("MicroMsg.RuntimeLaunchTimeoutFallbackReloadTask", "start(" + rt6 + "), stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        android.content.Context r07 = rt6.r0();
        if (r07 == null) {
            r07 = rt6.f74795d;
        }
        kotlin.jvm.internal.o.d(r07);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = rt6.u0();
        kotlin.jvm.internal.o.f(u07, "getInitConfig(...)");
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel a17 = k91.h0.a(u07);
        java.lang.String instanceId = rt6.u0().f77298k2.f88134d;
        kotlin.jvm.internal.o.f(instanceId, "instanceId");
        a17.M = new com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle(instanceId, wg1.b.f445712e.h());
        com.tencent.mm.plugin.appbrand.oe oeVar = new com.tencent.mm.plugin.appbrand.oe(rt6, prepareTask);
        new com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask(r07, a17, true, oeVar).G(true).I();
        this.f88969e = oeVar;
    }
}
