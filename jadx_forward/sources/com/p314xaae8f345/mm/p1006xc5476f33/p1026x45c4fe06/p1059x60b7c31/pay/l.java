package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g {

    /* renamed from: CTRL_INDEX */
    public static final int f34624x366c91de = 86;

    /* renamed from: NAME */
    public static final java.lang.String f34625x24728b = "bindPaymentCard";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) ffVar.f162546b;
        org.json.JSONObject jSONObject = ffVar.f162548d;
        org.json.JSONObject jSONObject2 = ffVar.f162547c;
        int i17 = ffVar.f162549e;
        if (jSONObject2 == null) {
            c0Var.a(i17, o("fail"));
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail"));
            return;
        }
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.d(c0Var, jSONObject2, jSONObject, f34625x24728b, false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.INSTANCE.m51167xaba2942b(Z0, c0Var.t3().l2(), jSONObject2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.k(this, c0Var, i17));
            } else {
                c0Var.a(i17, o("fail illegal appId"));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiBindPaymentCard", e17.getMessage());
            c0Var.a(i17, o("fail"));
        }
    }
}
