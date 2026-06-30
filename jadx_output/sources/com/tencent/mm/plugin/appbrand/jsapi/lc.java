package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class lc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1087;
    private static final java.lang.String NAME = "requestSnsPayment";

    /* renamed from: g, reason: collision with root package name */
    public final int f81518g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var == null || jSONObject == null) {
            return;
        }
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            java.lang.String str = android.text.TextUtils.isEmpty("fail:internal error invalid android context") ? "fail:internal error" : "fail:internal error invalid android context";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i17, u(str, jSONObject2));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestSnsPayment", "context null");
            return;
        }
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.kc(this, d0Var, i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d0Var.getAppId());
        bundle.putInt("payScene", jSONObject.optInt("payScene", 2));
        bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
        bundle.putString("package", jSONObject.optString("package"));
        bundle.putString("nonceStr", jSONObject.optString("nonceStr"));
        bundle.putString("paySign", jSONObject.optString("paySign"));
        bundle.putString("signType", jSONObject.optString("signType"));
        bundle.putString("prepayId", jSONObject.optString("prepayId"));
        bundle.putString("partnerId", jSONObject.optString("partnerId"));
        bundle.putString("bindSerial", jSONObject.optString("bindSerial"));
        bundle.putString("bankType", jSONObject.optString("bankType"));
        bundle.putString("jsapiName", NAME);
        bundle.putString("paymentDeskModalTitle", jSONObject.optString("paymentDeskModalTitle"));
        bundle.putInt("jsapi_type", 1);
        j45.l.n(r07, "wallet", ".ui.WXPayJsApiKindaEntranceUI", new android.content.Intent().putExtras(bundle), this.f81518g);
    }
}
