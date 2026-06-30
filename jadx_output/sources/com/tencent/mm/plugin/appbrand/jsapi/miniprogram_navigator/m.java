package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f82248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.n f82249h;

    public m(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.n nVar, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17) {
        this.f82249h = nVar;
        this.f82245d = d0Var;
        this.f82246e = jSONObject;
        this.f82247f = jSONObject2;
        this.f82248g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82245d;
        d0Var.t3().T(com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult.a(d0Var.t3(), this.f82246e, this.f82247f), null);
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.n nVar = this.f82249h;
        nVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        d0Var.a(this.f82248g, nVar.u(str, jSONObject));
    }
}
