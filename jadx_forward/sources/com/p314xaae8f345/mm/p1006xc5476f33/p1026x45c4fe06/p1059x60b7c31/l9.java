package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class l9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34384x366c91de = 642;

    /* renamed from: NAME */
    public static final java.lang.String f34385x24728b = "openWCCardHomePage";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        android.app.Activity r07 = d0Var.mo32091x9a3f0ba2().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
        } else {
            j45.l.j(r07, "card", ".ui.v2.CardHomePageNewUI", new android.content.Intent(), null);
            d0Var.a(i17, o("ok"));
        }
    }
}
