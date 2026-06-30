package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class m0 extends com.tencent.mm.plugin.appbrand.jsapi.n0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f81591e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81592f;

    public m0(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        super(k0Var, e9Var, v5Var, jSONObject, i17);
        android.app.Activity r07 = e9Var.t3().r0();
        this.f81591e = r07;
        if (r07 == null) {
            throw new java.lang.IllegalArgumentException("JsApiActivityResultRequest. Activity is null");
        }
        this.f81592f = k0Var.hashCode() & 65535;
    }

    public abstract boolean a(android.app.Activity activity, org.json.JSONObject jSONObject, int i17);

    public abstract void b(int i17, java.lang.String str);

    public abstract void c(int i17, android.content.Intent intent);

    public void d() {
        android.app.Activity activity = this.f81591e;
        nf.g.a(activity).f(new com.tencent.mm.plugin.appbrand.jsapi.l0(this));
        if (a(activity, this.f82356b, this.f81592f)) {
            return;
        }
        b(-1, "fail:system error {{launch fail}}");
    }
}
