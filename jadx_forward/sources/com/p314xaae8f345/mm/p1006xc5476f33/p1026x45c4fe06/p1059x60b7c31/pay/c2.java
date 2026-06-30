package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public final class c2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34606x366c91de = 976;

    /* renamed from: NAME */
    public static final java.lang.String f34607x24728b = "requestPersonalPay";

    /* renamed from: g, reason: collision with root package name */
    public final int f164123g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u08;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85592;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestPersonalPay", "[invoke JsApiRequestPersonalPay]");
        if (c0Var == null) {
            return;
        }
        if (c0Var.t3() == null) {
            c0Var.a(i17, o("fail:internal error"));
            return;
        }
        if (jSONObject == null) {
            c0Var.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("out_prepay_id");
        if (android.text.TextUtils.isEmpty(optString)) {
            c0Var.a(i17, o("fail: out_prepay_id is empty"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
        int i18 = (t37 == null || (u08 = t37.u0()) == null || (c12559xbdae85592 = u08.f128802b2) == null) ? 1000 : c12559xbdae85592.f169323f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t38 = c0Var.t3();
        int a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62.a(i18, (t38 == null || (u07 = t38.u0()) == null || (c12559xbdae8559 = u07.f128802b2) == null) ? 0 : c12559xbdae8559.f169326i);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_app_id", c0Var.t3().f156336n);
        intent.putExtra("out_prepay_id", optString);
        intent.putExtra("payChannel", a17);
        nf.g.a(c0Var.getF229340d()).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.b2(this, new java.lang.ref.WeakReference(c0Var), i17));
        j45.l.n(c0Var.getF229340d(), "remittance", ".ui.PersonalPayRemittanceUI", intent, this.f164123g);
    }
}
