package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class t8 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1260;
    public static final java.lang.String NAME = "openAddressEditor";

    /* renamed from: g, reason: collision with root package name */
    public final int f83465g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.app.Activity r07;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = d0Var.t3();
        if (t37 != null && (r07 = t37.r0()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenAddressEditor", "invoke");
            nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.s8(this, d0Var, i17));
            j45.l.o(r07, "address", ".ui.WalletAddAddressUI", null, this.f83465g, false);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOpenAddressEditor", "invoke, activity is null");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        d0Var.a(i17, u(str, jSONObject2));
    }
}
