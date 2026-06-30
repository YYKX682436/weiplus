package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final /* synthetic */ class ye$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f92425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wg1.b f92426e;

    public /* synthetic */ ye$$a(com.tencent.mm.plugin.appbrand.o6 o6Var, wg1.b bVar) {
        this.f92425d = o6Var;
        this.f92426e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final com.tencent.mm.plugin.appbrand.o6 o6Var = this.f92425d;
        final wg1.b bVar = this.f92426e;
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel a17 = k91.h0.a(o6Var.u0());
        a17.d();
        a17.M = new com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle(o6Var.u0().f77298k2.f88134d, wg1.b.f445711d.h());
        if (wg1.b.f445717m == bVar) {
            o6Var.S1();
            o6Var.N.a(new com.tencent.mm.plugin.appbrand.cf(o6Var));
        }
        new com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask(o6Var.f74795d, a17, new com.tencent.mm.plugin.appbrand.launching.o0() { // from class: com.tencent.mm.plugin.appbrand.ye$$b
            @Override // com.tencent.mm.plugin.appbrand.launching.o0
            public final void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
                com.tencent.mm.plugin.appbrand.o6 o6Var2 = com.tencent.mm.plugin.appbrand.o6.this;
                wg1.b bVar2 = bVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForAttrAsyncUpdated AppBrandPreInitTask callback %s", appBrandInitConfigWC);
                if (appBrandInitConfigWC == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForAttrAsyncUpdated preInitTask callback with null config, appId:%s", o6Var2.f74803n);
                    o6Var2.l0();
                } else {
                    if (o6Var2.S || o6Var2.L0()) {
                        return;
                    }
                    appBrandInitConfigWC.f47269b2 = appBrandStatObject;
                    if (wg1.b.f445717m == bVar2) {
                        appBrandInitConfigWC.f77291t = true;
                    }
                    o6Var2.m(new com.tencent.mm.plugin.appbrand.ze(o6Var2, bVar2, appBrandInitConfigWC));
                }
            }
        }).G(true).I();
    }
}
