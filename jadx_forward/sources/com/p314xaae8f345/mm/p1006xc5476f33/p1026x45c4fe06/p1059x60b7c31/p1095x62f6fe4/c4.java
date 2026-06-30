package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class c4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34473x366c91de = 532;

    /* renamed from: NAME */
    public static final java.lang.String f34474x24728b = "chooseMessageFile";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMessageFile", "data is null");
            d0Var.a(i17, o("fail:invalid data"));
            return;
        }
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMessageFile", "context is null, invoke with appId:%s, callbackId:%d", d0Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
            d0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMessageFile", "chooseMsgFile data:%s, appId:%s, callbackId:%d", jSONObject, d0Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
        java.lang.String optString = jSONObject.optString("type", com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18);
        java.lang.String optString2 = jSONObject.optString("extension", "");
        int optInt = jSONObject.optInt("count", 9);
        ((uv1.d) ((lo.k) i95.n0.c(lo.k.class))).Ai(r07, optString, optInt, optString2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b4(this, d0Var, i17));
    }
}
