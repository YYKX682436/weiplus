package bf3;

/* loaded from: classes7.dex */
public final class q0 extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.f f19654f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f19655g;

    public q0(com.tencent.mm.plugin.appbrand.jsapi.f jsapi, java.lang.String appId) {
        kotlin.jvm.internal.o.g(jsapi, "jsapi");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f19654f = jsapi;
        this.f19655g = appId;
    }

    @Override // lc3.c0
    public java.lang.String f() {
        java.lang.String k17 = this.f19654f.k();
        kotlin.jvm.internal.o.f(k17, "getName(...)");
        return k17;
    }

    @Override // lc3.b0
    public lc3.b0 r() {
        return new bf3.q0(this.f19654f, this.f19655g);
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.app.Activity B0;
        kotlin.jvm.internal.o.g(data, "data");
        lc3.e eVar = this.f317890a;
        if (eVar == null || (B0 = eVar.B0()) == null) {
            s().invoke(h(4096, "Run UI jsapi without activity context provide"));
            return;
        }
        jc3.p0 p0Var = new jc3.p0(B0, this.f19655g, s(), null, 8, null);
        p0Var.B(this.f317890a);
        com.tencent.mm.plugin.appbrand.jsapi.f fVar = this.f19654f;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponent>");
        fVar.A(p0Var, data, 0);
    }
}
