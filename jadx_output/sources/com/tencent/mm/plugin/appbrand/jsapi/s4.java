package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class s4 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 501;
    public static final java.lang.String NAME = "chooseInvoice";

    /* renamed from: g, reason: collision with root package name */
    public final int f82923g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 == null) {
            e9Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseInvoice", "mmActivity is null, invoke fail!");
            return;
        }
        int optInt = jSONObject.optInt("timeStamp");
        java.lang.String optString = jSONObject.optString("nonceStr");
        java.lang.String optString2 = jSONObject.optString("signType");
        java.lang.String optString3 = jSONObject.optString("cardSign");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, e9Var.getAppId());
        intent.putExtra("sign_type", optString2);
        intent.putExtra("card_sign", optString3);
        intent.putExtra("time_stamp", optInt);
        intent.putExtra("nonce_str", optString);
        intent.putExtra("can_multi_select", 1);
        intent.putExtra("card_type", "INVOICE");
        intent.putExtra("key_from_scene", 7);
        nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.r4(this, e9Var, i17));
        j45.l.o(Z0, "card", ".ui.CardListSelectedUI", intent, this.f82923g, false);
    }
}
