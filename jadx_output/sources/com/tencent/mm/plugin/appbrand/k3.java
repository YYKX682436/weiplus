package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f84060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.x0 f84061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.l3 f84063g;

    public k3(com.tencent.mm.plugin.appbrand.l3 l3Var, km5.b bVar, com.tencent.mm.plugin.appbrand.task.x0 x0Var, java.lang.String str) {
        this.f84063g = l3Var;
        this.f84060d = bVar;
        this.f84061e = x0Var;
        this.f84062f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f84063g.f84218a.f78452d) {
                this.f84063g.f84218a.g("preloadAppService, ahead preload entered but EXPIRED", new java.lang.Object[0]);
                this.f84060d.c(null);
                return;
            }
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = this.f84063g.f84218a.f78450b.S2(false);
            if (S2 == null) {
                this.f84060d.c(null);
                this.f84063g.f84218a.g("preloadAppService, ahead preload entered but get NULL reader", new java.lang.Object[0]);
                return;
            }
            final com.tencent.mm.plugin.appbrand.service.c0 tVar = this.f84061e == com.tencent.mm.plugin.appbrand.task.x0.WAGAME ? new fa1.t() : new com.tencent.mm.plugin.appbrand.service.c0();
            tVar.L0(S2);
            if ("wxb1320569c2a2b6d2".equals(this.f84063g.f84218a.f78450b.f74803n) && 1190 == this.f84063g.f84218a.f78450b.g2() && com.tencent.mm.plugin.appbrand.of.a()) {
                tVar.I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.k3$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.appbrand.service.c0.this.Z1();
                    }
                });
            }
            com.tencent.mm.plugin.appbrand.report.quality.o0 o0Var = com.tencent.mm.plugin.appbrand.report.quality.o0.PreloadBeforeRuntimeInit;
            tVar.G1(o0Var, new com.tencent.luggage.sdk.jsapi.component.service.v1(!this.f84063g.f84218a.f78450b.v0(), !this.f84063g.f84218a.f78450b.u0().d()));
            this.f84063g.f84218a.h("preloadAppService, ahead preload DONE", new java.lang.Object[0]);
            this.f84060d.c(tVar);
            try {
                com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f84062f, true).D = o0Var;
            } catch (java.lang.Exception unused) {
                this.f84063g.f84218a.g("preloadAppService, ahead preload DONE but get NULL session", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.appbrand.keylogger.w.e(this.f84063g.f84218a.f78450b.f74803n, com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForAppServiceAheadPreloadDone);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", th6, "preloadAppService, ahead preload EXCEPTION", new java.lang.Object[0]);
            this.f84060d.c(null);
        }
    }
}
