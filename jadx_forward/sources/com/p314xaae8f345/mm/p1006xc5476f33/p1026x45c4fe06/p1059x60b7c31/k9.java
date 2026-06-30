package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class k9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34376x366c91de = 59;

    /* renamed from: NAME */
    public static final java.lang.String f34377x24728b = "openCard";

    /* renamed from: g, reason: collision with root package name */
    public final int f162884g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        android.content.Intent intent = new android.content.Intent();
        android.app.Activity r07 = e9Var.t3().r0();
        if (r07 == null) {
            e9Var.a(i17, o("fail:internal error invalid android context"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenCard", "mmActivity is null, invoke fail! with appId[%s] callbackId[%d]", e9Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String optString = jSONObject.optString("cardList");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            e9Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenCard", "cardList is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j9(this, e9Var, i17));
        intent.putExtra("key_app_id", e9Var.mo48798x74292566());
        intent.putExtra("card_list", optString);
        intent.putExtra("key_from_scene", 26);
        k91.z0 z0Var = (k91.z0) e9Var.b(k91.z0.class);
        if (z0Var != null && z0Var.f387385r != null) {
            intent.putExtra("key_from_appbrand_type", z0Var.f387385r.f156932d);
        }
        j45.l.n(r07, "card", ".ui.CardViewEntranceUI", intent, this.f162884g);
    }
}
