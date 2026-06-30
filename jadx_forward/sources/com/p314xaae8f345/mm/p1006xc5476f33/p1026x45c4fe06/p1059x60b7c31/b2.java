package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class b2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33875x366c91de = 58;

    /* renamed from: NAME */
    public static final java.lang.String f33876x24728b = "addCard";

    /* renamed from: g, reason: collision with root package name */
    public final int f161349g = cf.b.a(this);

    /* renamed from: h, reason: collision with root package name */
    public int f161350h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddCard", "mmActivity is null, invoke fail! with appId[%s] callbackId[%d]", d0Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String optString = jSONObject.optString("cardList");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            d0Var.a(i17, o("fail:invalid data"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddCard", "cardList is null, invoke fail!");
            return;
        }
        this.f161350h = i17;
        nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a2(this, d0Var));
        intent.putExtra("key_in_card_list", optString);
        intent.putExtra("key_from_scene", 26);
        k91.z0 E0 = d0Var.t3().E0();
        if (E0 != null && E0.f387385r != null) {
            intent.putExtra("key_from_appbrand_type", E0.f387385r.f156932d);
        }
        j45.l.n(r07, "card", ".ui.CardAddEntranceUI", intent, this.f161349g);
    }
}
