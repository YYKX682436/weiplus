package bf3;

/* loaded from: classes7.dex */
public final class q0 extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f f101187f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f101188g;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f jsapi, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapi, "jsapi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f101187f = jsapi;
        this.f101188g = appId;
    }

    @Override // lc3.c0
    public java.lang.String f() {
        java.lang.String k17 = this.f101187f.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getName(...)");
        return k17;
    }

    @Override // lc3.b0
    public lc3.b0 r() {
        return new bf3.q0(this.f101187f, this.f101188g);
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.app.Activity B0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lc3.e eVar = this.f399423a;
        if (eVar == null || (B0 = eVar.B0()) == null) {
            s().mo146xb9724478(h(4096, "Run UI jsapi without activity context provide"));
            return;
        }
        jc3.p0 p0Var = new jc3.p0(B0, this.f101188g, s(), null, 8, null);
        p0Var.B(this.f399423a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar = this.f101187f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponent>");
        fVar.A(p0Var, data, 0);
    }
}
