package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class fa extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34156x366c91de = 201;

    /* renamed from: NAME */
    public static final java.lang.String f34157x24728b = "openUrl";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        java.lang.String optString = jSONObject.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            e9Var.a(i17, o("fail"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("pageOrientation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenUrl", "pageOrientation:%s", optString2);
        android.content.Context f229340d = e9Var.getF229340d();
        if (f229340d == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q1 q1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q1();
        q1Var.f164383c = e9Var;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1) e9Var.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1.class)).N(f229340d, optString, optString2, q1Var);
        e9Var.a(i17, o("ok"));
    }
}
