package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f165593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 f165594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l3 f165596g;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l3 l3Var, km5.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var, java.lang.String str) {
        this.f165596g = l3Var;
        this.f165593d = bVar;
        this.f165594e = x0Var;
        this.f165595f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f165596g.f165751a.f159985d) {
                this.f165596g.f165751a.g("preloadAppService, ahead preload entered but EXPIRED", new java.lang.Object[0]);
                this.f165593d.c(null);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2 = this.f165596g.f165751a.f159983b.S2(false);
            if (S2 == null) {
                this.f165593d.c(null);
                this.f165596g.f165751a.g("preloadAppService, ahead preload entered but get NULL reader", new java.lang.Object[0]);
                return;
            }
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 tVar = this.f165594e == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME ? new fa1.t() : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0();
            tVar.L0(S2);
            if ("wxb1320569c2a2b6d2".equals(this.f165596g.f165751a.f159983b.f156336n) && 1190 == this.f165596g.f165751a.f159983b.g2() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.of.a()) {
                tVar.I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.k3$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0.this.Z1();
                    }
                });
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadBeforeRuntimeInit;
            tVar.G1(o0Var, new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1(!this.f165596g.f165751a.f159983b.v0(), !this.f165596g.f165751a.f159983b.u0().d()));
            this.f165596g.f165751a.h("preloadAppService, ahead preload DONE", new java.lang.Object[0]);
            this.f165593d.c(tVar);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f165595f, true).D = o0Var;
            } catch (java.lang.Exception unused) {
                this.f165596g.f165751a.g("preloadAppService, ahead preload DONE but get NULL session", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(this.f165596g.f165751a.f159983b.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35255x1312a2e6);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", th6, "preloadAppService, ahead preload EXCEPTION", new java.lang.Object[0]);
            this.f165593d.c(null);
        }
    }
}
