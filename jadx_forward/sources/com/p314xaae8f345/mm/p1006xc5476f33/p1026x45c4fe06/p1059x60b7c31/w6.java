package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class w6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34938x366c91de = 1248;

    /* renamed from: NAME */
    private static final java.lang.String f34939x24728b = "jumpToWCPayMessage";

    /* renamed from: g, reason: collision with root package name */
    public final int f165246g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        if (d0Var == null || jSONObject == null) {
            return;
        }
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, "jumpToWCPayMessage:fail");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiJumpToWCPayMessage", "context null");
            return;
        }
        nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v6(this, d0Var, i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d0Var.mo48798x74292566());
        bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
        bundle.putString("packageExt", jSONObject.optString("package"));
        bundle.putString("nonceStr", jSONObject.optString("nonceStr"));
        bundle.putString("paySignature", jSONObject.optString("paySign"));
        bundle.putString("signtype", jSONObject.optString("signType"));
        bundle.putString("jsapiName", f34939x24728b);
        j45.l.n(r07, "wallet_index", ".ui.WalletOpenViewProxyUI", new android.content.Intent().putExtras(bundle), this.f165246g);
    }
}
