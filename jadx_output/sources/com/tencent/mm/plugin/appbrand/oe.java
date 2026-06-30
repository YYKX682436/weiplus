package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class oe implements com.tencent.mm.plugin.appbrand.launching.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f86245a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.r1 f86246b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f86247c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f86248d;

    public oe(com.tencent.mm.plugin.appbrand.o6 rt6, com.tencent.mm.plugin.appbrand.launching.r1 prepareTask) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(prepareTask, "prepareTask");
        this.f86245a = rt6;
        this.f86246b = prepareTask;
        this.f86247c = "MicroMsg.AppBrand.RuntimeLaunchTimeoutFallbackReloadTask[" + rt6.f74803n + '|' + rt6.hashCode() + ']';
        this.f86248d = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.o0
    public void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        boolean z17 = this.f86248d.get();
        java.lang.String str = this.f86247c;
        if (z17) {
            com.tencent.mars.xlog.Log.w(str, "onResult but canceled");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "onResult with config:" + appBrandInitConfigWC);
        this.f86246b.b();
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f86245a;
        if (appBrandInitConfigWC == null) {
            o6Var.l0();
        } else {
            o6Var.m(new com.tencent.mm.plugin.appbrand.ne(appBrandInitConfigWC, appBrandStatObject, this));
        }
    }
}
