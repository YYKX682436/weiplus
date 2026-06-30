package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public abstract class l extends com.tencent.mm.plugin.appbrand.jsapi.f {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f81089h = new java.util.concurrent.ThreadPoolExecutor(1, 1, 1, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque());

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.file.n f81090g;

    public l(com.tencent.mm.plugin.appbrand.jsapi.file.n nVar) {
        this.f81090g = nVar;
        nVar.f81099a = this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getJsRuntime());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public final void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        f81089h.submit(new com.tencent.mm.plugin.appbrand.jsapi.file.k(this, lVar, c0Var, jSONObject, i17));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public boolean m() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
