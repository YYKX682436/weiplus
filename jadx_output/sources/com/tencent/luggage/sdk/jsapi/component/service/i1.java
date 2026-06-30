package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class i1 implements com.tencent.mm.plugin.appbrand.jsruntime.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.k1 f47449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f47450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f47451f;

    public i1(com.tencent.luggage.sdk.jsapi.component.service.k1 k1Var, com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.Object obj) {
        this.f47449d = k1Var;
        this.f47450e = rVar;
        this.f47451f = obj;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.x
    public final void onDestroy() {
        this.f47449d.f47465c = null;
        com.tencent.mm.plugin.appbrand.jsruntime.r rVar = this.f47450e;
        java.lang.Object obj = this.f47451f;
        cl.q0 n07 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) rVar).n0();
        n07.getClass();
        if (obj instanceof com.eclipsesource.mmv8.Releasable) {
            ((cl.a) n07.f42724b).h(new cl.y0(n07, obj), false);
        }
    }
}
