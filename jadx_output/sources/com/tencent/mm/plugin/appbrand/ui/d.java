package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class d implements i81.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.g f89653a;

    public d(com.tencent.mm.plugin.appbrand.ui.g gVar) {
        this.f89653a = gVar;
    }

    @Override // i81.p
    public void a(java.lang.String str) {
        i81.l0 l0Var = this.f89653a.f89720g;
        if (l0Var != null) {
            i81.b0 b0Var = (i81.b0) l0Var;
            if ("launch".equalsIgnoreCase(str)) {
                com.tencent.mm.plugin.appbrand.ad.jsapi.k kVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.k();
                kVar.f74914i = str;
                kVar.x(b0Var.g());
                com.tencent.mm.plugin.appbrand.ad.jsapi.i iVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.i();
                iVar.f74910i = str;
                iVar.x(b0Var.g());
                final com.tencent.mm.plugin.appbrand.o6 o6Var = b0Var.f289525b;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "tryResetPageOrientation[AppBrandSplashAd], appId:%s, reset orientation before onRuntimeInitialized", o6Var.f74803n);
                o6Var.I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ni1.e eVar;
                        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = com.tencent.mm.plugin.appbrand.AppBrandRuntime.this;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "tryResetPageOrientation[AppBrandSplashAd], appId:%s, reset orientation after onRuntimeInitialized", appBrandRuntime.f74803n);
                        if (appBrandRuntime.x0() == null || appBrandRuntime.x0().getPageView() == null || (eVar = (ni1.e) appBrandRuntime.x0().getPageView().B1(ni1.e.class)) == null) {
                            return;
                        }
                        java.lang.String requestedOrientation = eVar.getRequestedOrientation();
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "tryResetPageOrientation[AppBrandSplashAd], appId:%s, request orientation:%s", appBrandRuntime.f74803n, requestedOrientation);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(requestedOrientation)) {
                            return;
                        }
                        eVar.d(null);
                    }
                });
                b0Var.j();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "onSplashAdViewContainerHide");
                b0Var.f289533j = true;
                b0Var.b();
                if (b0Var.g() != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "destroyServiceAdComponentView");
                    b0Var.g().M1();
                }
                b0Var.a();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                b0Var.f289531h = java.lang.System.currentTimeMillis();
            }
        }
    }

    @Override // i81.p
    public void onDetach() {
        i81.l0 l0Var = this.f89653a.f89720g;
        if (l0Var != null) {
            i81.b0 b0Var = (i81.b0) l0Var;
            b0Var.getClass();
            com.tencent.mm.plugin.appbrand.ad.jsapi.k kVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.k();
            kVar.f74914i = "launch";
            kVar.x(b0Var.g());
            com.tencent.mm.plugin.appbrand.ad.jsapi.i iVar = new com.tencent.mm.plugin.appbrand.ad.jsapi.i();
            iVar.f74910i = "launch";
            iVar.x(b0Var.g());
        }
    }
}
