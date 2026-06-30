package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public class c6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33969x366c91de = 711;

    /* renamed from: NAME */
    public static final java.lang.String f33970x24728b = "getOAID";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String k96 = ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetOAID", "AppBrand getOAID, oaid=" + k96);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1896, 22);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k96)) {
            lVar.a(i17, o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", k96);
        lVar.a(i17, p("ok", hashMap));
    }
}
