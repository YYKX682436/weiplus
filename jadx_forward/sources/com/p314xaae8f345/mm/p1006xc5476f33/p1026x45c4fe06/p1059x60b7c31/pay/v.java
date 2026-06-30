package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34656x366c91de = 693;

    /* renamed from: NAME */
    public static final java.lang.String f34657x24728b = "getWCPayOverseaPrepayRequest";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "invoke JsApiGetWCPayOverseaPrepayRequest!");
        if (c0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "fail:component is null");
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetWCPayOverseaPrepayRequest", "fail:context is null");
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62(jSONObject);
        c19761xc2874b62.A = 2;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f.b(Z0, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.u(this, c19761xc2874b62, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.t(this, Z0, c0Var, i17)))) {
            return;
        }
        c0Var.a(i17, o("fail"));
    }
}
