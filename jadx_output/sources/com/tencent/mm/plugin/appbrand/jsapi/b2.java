package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class b2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 58;
    public static final java.lang.String NAME = "addCard";

    /* renamed from: g, reason: collision with root package name */
    public final int f79816g = cf.b.a(this);

    /* renamed from: h, reason: collision with root package name */
    public int f79817h;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddCard", "mmActivity is null, invoke fail! with appId[%s] callbackId[%d]", d0Var.getAppId(), java.lang.Integer.valueOf(i17));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String optString = jSONObject.optString("cardList");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            d0Var.a(i17, o("fail:invalid data"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddCard", "cardList is null, invoke fail!");
            return;
        }
        this.f79817h = i17;
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.a2(this, d0Var));
        intent.putExtra("key_in_card_list", optString);
        intent.putExtra("key_from_scene", 26);
        k91.z0 E0 = d0Var.t3().E0();
        if (E0 != null && E0.f305852r != null) {
            intent.putExtra("key_from_appbrand_type", E0.f305852r.f75399d);
        }
        j45.l.n(r07, "card", ".ui.CardAddEntranceUI", intent, this.f79816g);
    }
}
