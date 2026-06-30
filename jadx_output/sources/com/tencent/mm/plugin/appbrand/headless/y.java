package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class y implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f78318d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f78319e;

    /* renamed from: f, reason: collision with root package name */
    public final int f78320f;

    /* renamed from: g, reason: collision with root package name */
    public final l81.v0 f78321g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.headless.q f78322h;

    public y(com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceData data, l81.v0 v0Var) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z0 z0Var = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z0();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC config = data.f78277d;
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat = data.f78278e;
        kotlin.jvm.internal.o.g(stat, "stat");
        this.f78318d = config;
        this.f78319e = stat;
        this.f78320f = data.f78279f;
        this.f78321g = v0Var;
        this.f78322h = z0Var;
    }

    public static final void a(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.headless.y yVar, yz5.a aVar) {
        java.lang.String str = yVar.f78318d.f47281y;
        o6Var.R.a(str == null || str.length() == 0 ? com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME : yVar.f78318d.f47281y, new com.tencent.mm.plugin.appbrand.headless.s(yVar, o6Var, aVar), null, true);
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AppBrandHeadlessStartService.RemoteLoader-" + this.f78320f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHeadlessStartService.RemoteLoader", "run()-start, id:" + this.f78320f + ", appId:" + this.f78318d.f77278d + ", instanceId:" + this.f78318d.f47277w + ", sessionId:" + this.f78318d.f47276v);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f78318d;
        appBrandInitConfigWC.f47269b2 = this.f78319e;
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(appBrandInitConfigWC.f77278d);
        if (b17 != null && !b17.S && !b17.L0()) {
            a(b17, this, com.tencent.mm.plugin.appbrand.headless.r.f78305d);
            return;
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        com.tencent.mm.plugin.appbrand.o6 o6Var = new com.tencent.mm.plugin.appbrand.o6(new yi1.a());
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC2 = this.f78318d;
        android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C;
        o6Var.I0(appBrandInitConfigWC2);
        o6Var.X0();
        o6Var.I1(new com.tencent.mm.plugin.appbrand.headless.v(o6Var, c0Var, this));
        com.tencent.mm.plugin.appbrand.headless.x xVar = new com.tencent.mm.plugin.appbrand.headless.x(c0Var, this);
        java.lang.String str = o6Var.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        xVar.invoke(mVar);
        o6Var.N.a(mVar);
    }
}
