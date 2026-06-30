package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class s4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34737x366c91de = 501;

    /* renamed from: NAME */
    public static final java.lang.String f34738x24728b = "chooseInvoice";

    /* renamed from: g, reason: collision with root package name */
    public final int f164456g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 == null) {
            e9Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseInvoice", "mmActivity is null, invoke fail!");
            return;
        }
        int optInt = jSONObject.optInt("timeStamp");
        java.lang.String optString = jSONObject.optString("nonceStr");
        java.lang.String optString2 = jSONObject.optString("signType");
        java.lang.String optString3 = jSONObject.optString("cardSign");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, e9Var.mo48798x74292566());
        intent.putExtra("sign_type", optString2);
        intent.putExtra("card_sign", optString3);
        intent.putExtra("time_stamp", optInt);
        intent.putExtra("nonce_str", optString);
        intent.putExtra("can_multi_select", 1);
        intent.putExtra("card_type", "INVOICE");
        intent.putExtra("key_from_scene", 7);
        nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r4(this, e9Var, i17));
        j45.l.o(Z0, "card", ".ui.CardListSelectedUI", intent, this.f164456g, false);
    }
}
