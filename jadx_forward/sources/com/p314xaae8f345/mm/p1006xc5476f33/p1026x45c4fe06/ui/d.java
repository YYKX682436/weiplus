package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class d implements i81.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g f171186a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g gVar) {
        this.f171186a = gVar;
    }

    @Override // i81.p
    public void a(java.lang.String str) {
        i81.l0 l0Var = this.f171186a.f171253g;
        if (l0Var != null) {
            i81.b0 b0Var = (i81.b0) l0Var;
            if ("launch".equalsIgnoreCase(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.k();
                kVar.f156447i = str;
                kVar.x(b0Var.g());
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.i();
                iVar.f156443i = str;
                iVar.x(b0Var.g());
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = b0Var.f371058b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntime", "tryResetPageOrientation[AppBrandSplashAd], appId:%s, reset orientation before onRuntimeInitialized", o6Var.f156336n);
                o6Var.I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ni1.e eVar;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2.this;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntime", "tryResetPageOrientation[AppBrandSplashAd], appId:%s, reset orientation after onRuntimeInitialized", c11510xdd90c2f2.f156336n);
                        if (c11510xdd90c2f2.x0() == null || c11510xdd90c2f2.x0().m52174xaf156f4a() == null || (eVar = (ni1.e) c11510xdd90c2f2.x0().m52174xaf156f4a().B1(ni1.e.class)) == null) {
                            return;
                        }
                        java.lang.String mo14689x776c71f8 = eVar.mo14689x776c71f8();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntime", "tryResetPageOrientation[AppBrandSplashAd], appId:%s, request orientation:%s", c11510xdd90c2f2.f156336n, mo14689x776c71f8);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo14689x776c71f8)) {
                            return;
                        }
                        eVar.d(null);
                    }
                });
                b0Var.j();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "onSplashAdViewContainerHide");
                b0Var.f371066j = true;
                b0Var.b();
                if (b0Var.g() != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "destroyServiceAdComponentView");
                    b0Var.g().M1();
                }
                b0Var.a();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                b0Var.f371064h = java.lang.System.currentTimeMillis();
            }
        }
    }

    @Override // i81.p
    /* renamed from: onDetach */
    public void mo48845x3f5eee52() {
        i81.l0 l0Var = this.f171186a.f171253g;
        if (l0Var != null) {
            i81.b0 b0Var = (i81.b0) l0Var;
            b0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.k();
            kVar.f156447i = "launch";
            kVar.x(b0Var.g());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.i();
            iVar.f156443i = "launch";
            iVar.x(b0Var.g());
        }
    }
}
