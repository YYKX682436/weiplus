package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class w6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1248;
    private static final java.lang.String NAME = "jumpToWCPayMessage";

    /* renamed from: g, reason: collision with root package name */
    public final int f83713g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (d0Var == null || jSONObject == null) {
            return;
        }
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, "jumpToWCPayMessage:fail");
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiJumpToWCPayMessage", "context null");
            return;
        }
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.v6(this, d0Var, i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d0Var.getAppId());
        bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
        bundle.putString("packageExt", jSONObject.optString("package"));
        bundle.putString("nonceStr", jSONObject.optString("nonceStr"));
        bundle.putString("paySignature", jSONObject.optString("paySign"));
        bundle.putString("signtype", jSONObject.optString("signType"));
        bundle.putString("jsapiName", NAME);
        j45.l.n(r07, "wallet_index", ".ui.WalletOpenViewProxyUI", new android.content.Intent().putExtras(bundle), this.f83713g);
    }
}
