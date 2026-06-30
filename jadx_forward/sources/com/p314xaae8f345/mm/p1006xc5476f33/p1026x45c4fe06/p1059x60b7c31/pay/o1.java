package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public class o1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34634x366c91de = 682;

    /* renamed from: NAME */
    public static final java.lang.String f34635x24728b = "requestH5Transaction";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestH5Transaction", "invoke JsApiRequestH5Transaction!");
        if (d0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestH5Transaction", "fail:component is null");
            return;
        }
        android.content.Context f229340d = d0Var.getF229340d();
        if (f229340d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestH5Transaction", "fail:context is null");
            d0Var.a(i17, o("fail"));
            return;
        }
        java.lang.String optString = jSONObject.optString("closeWebAfterPayDetailBack");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestH5Transaction", "close window: %s", optString);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("1", optString)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n1(this, d0Var), 1000L);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", d0Var.mo48798x74292566());
        intent.putExtra("timeStamp", jSONObject.optString("timeStamp"));
        intent.putExtra("nonceStr", jSONObject.optString("nonceStr"));
        intent.putExtra("packageExt", jSONObject.optString("package"));
        intent.putExtra("signtype", jSONObject.optString("signType"));
        intent.putExtra("paySignature", jSONObject.optString("paySign"));
        intent.putExtra("url", jSONObject.optString("url"));
        ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletManager", "startIbgOrder context %s from %s", f229340d, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        j45.l.k(f229340d, "wallet_core", ".ui.ibg.WalletIbgOrderInfoUI", intent, true);
        d0Var.a(i17, o("ok"));
    }
}
