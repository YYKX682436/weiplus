package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34658x366c91de = 681;

    /* renamed from: NAME */
    public static final java.lang.String f34659x24728b = "handleWCPayOverseaWalletBuffer";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleWCPayOverseaWalletBuffer", "invoke JsApiHandleWCPayOverseaWalletBuffer!");
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleWCPayOverseaWalletBuffer", "fail:component is null");
            return;
        }
        if (lVar.mo50352x76847179() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleWCPayOverseaWalletBuffer", "fail:context is null");
            lVar.a(i17, o("fail"));
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5();
        java.lang.String optString = jSONObject.optString("action");
        am.e10 e10Var = c6236xbc6b9a5.f136484g;
        e10Var.f88065h = optString;
        e10Var.f88067j = jSONObject.optString("buffer");
        e10Var.f88058a = jSONObject.optString("appId");
        e10Var.f88066i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("walletRegion"), 0);
        e10Var.f88059b = jSONObject.optString("timeStamp");
        e10Var.f88063f = jSONObject.optString("nonceStr");
        e10Var.f88061d = jSONObject.optString("paySign");
        e10Var.f88062e = jSONObject.optString("signType");
        e10Var.f88060c = jSONObject.optString("package");
        e10Var.f88064g = jSONObject.optString("url");
        c6236xbc6b9a5.f136485h.f88161c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.w(this, c6236xbc6b9a5, lVar, i17);
        c6236xbc6b9a5.e();
    }
}
