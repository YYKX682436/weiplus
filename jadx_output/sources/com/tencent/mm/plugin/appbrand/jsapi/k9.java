package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class k9 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 59;
    public static final java.lang.String NAME = "openCard";

    /* renamed from: g, reason: collision with root package name */
    public final int f81351g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        android.content.Intent intent = new android.content.Intent();
        android.app.Activity r07 = e9Var.t3().r0();
        if (r07 == null) {
            e9Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenCard", "mmActivity is null, invoke fail! with appId[%s] callbackId[%d]", e9Var.getAppId(), java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String optString = jSONObject.optString("cardList");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            e9Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenCard", "cardList is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.j9(this, e9Var, i17));
        intent.putExtra("key_app_id", e9Var.getAppId());
        intent.putExtra("card_list", optString);
        intent.putExtra("key_from_scene", 26);
        k91.z0 z0Var = (k91.z0) e9Var.b(k91.z0.class);
        if (z0Var != null && z0Var.f305852r != null) {
            intent.putExtra("key_from_appbrand_type", z0Var.f305852r.f75399d);
        }
        j45.l.n(r07, "card", ".ui.CardViewEntranceUI", intent, this.f81351g);
    }
}
