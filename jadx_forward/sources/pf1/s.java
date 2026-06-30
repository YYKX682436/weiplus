package pf1;

/* loaded from: classes7.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f435325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pf1.v f435326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f435327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f435328g;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, pf1.v vVar, org.json.JSONObject jSONObject, int i17) {
        this.f435325d = k0Var;
        this.f435326e = vVar;
        this.f435327f = jSONObject;
        this.f435328g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f435325d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponent>");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) k0Var).A(this.f435326e, this.f435327f, this.f435328g);
    }
}
