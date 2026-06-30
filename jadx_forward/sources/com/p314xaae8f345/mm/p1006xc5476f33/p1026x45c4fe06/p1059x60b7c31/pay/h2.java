package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public class h2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34618x366c91de = 707;

    /* renamed from: NAME */
    public static final java.lang.String f34619x24728b = "requestVerifyUserIdentity";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestVerifyUserIdentity", "invoke JsApiRequestVerifyUserIdentity!");
        if (c0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestVerifyUserIdentity", "fail:component is null");
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestVerifyUserIdentity", "fail:context is null");
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String mo48798x74292566 = c0Var.mo48798x74292566();
            java.lang.String optString = jSONObject.optString("sessionid");
            if (optString != null && mo48798x74292566 != null && !optString.isEmpty() && !mo48798x74292566.isEmpty()) {
                hashMap.put("appId", mo48798x74292566);
                hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, optString);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.INSTANCE.m51169x93905eb7(Z0, c0Var.t3().l2(), "verifyUserIdentity", hashMap, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.g2(this, c0Var, i17));
            }
            c0Var.a(i17, p("fail", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.e2(this)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestVerifyUserIdentity", e17.getMessage());
            c0Var.a(i17, p("fail", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f2(this)));
        }
    }
}
