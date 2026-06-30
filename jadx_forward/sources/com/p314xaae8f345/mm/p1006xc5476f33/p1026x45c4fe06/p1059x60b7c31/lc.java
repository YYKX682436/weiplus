package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class lc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34428x366c91de = 1087;

    /* renamed from: NAME */
    private static final java.lang.String f34429x24728b = "requestSnsPayment";

    /* renamed from: g, reason: collision with root package name */
    public final int f163051g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        if (d0Var == null || jSONObject == null) {
            return;
        }
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            java.lang.String str = android.text.TextUtils.isEmpty("fail:internal error invalid android context") ? "fail:internal error" : "fail:internal error invalid android context";
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i17, u(str, jSONObject2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestSnsPayment", "context null");
            return;
        }
        nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.kc(this, d0Var, i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d0Var.mo48798x74292566());
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
        bundle.putString("jsapiName", f34429x24728b);
        bundle.putString("paymentDeskModalTitle", jSONObject.optString("paymentDeskModalTitle"));
        bundle.putInt("jsapi_type", 1);
        j45.l.n(r07, "wallet", ".ui.WXPayJsApiKindaEntranceUI", new android.content.Intent().putExtras(bundle), this.f163051g);
    }
}
