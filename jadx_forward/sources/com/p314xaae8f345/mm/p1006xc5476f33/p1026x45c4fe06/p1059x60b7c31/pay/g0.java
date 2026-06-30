package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes7.dex */
public class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34612x366c91de = 701;

    /* renamed from: NAME */
    public static final java.lang.String f34613x24728b = "openSelectPayment";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String mo48798x74292566 = c0Var.mo48798x74292566();
            java.lang.String optString = jSONObject.optString("sessionid");
            java.lang.String optString2 = jSONObject.optString("url");
            if (optString != null && mo48798x74292566 != null && !optString.isEmpty() && !mo48798x74292566.isEmpty()) {
                hashMap.put("appId", mo48798x74292566);
                hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, optString);
                hashMap.put("JSAPIFunc", k());
                if (optString2 != null) {
                    hashMap.put("webViewUrl", optString2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.EnumC12202xa98118f8.INSTANCE.m51169x93905eb7(Z0, c0Var.t3().l2(), "selectPayment", hashMap, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.f0(this, c0Var, i17));
                return;
            }
            c0Var.a(i17, p("fail", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.d0(this)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenSelectPayment", e17.getMessage());
            c0Var.a(i17, p("fail", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.e0(this)));
        }
    }
}
