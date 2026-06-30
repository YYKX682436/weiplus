package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public class x extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 681;
    public static final java.lang.String NAME = "handleWCPayOverseaWalletBuffer";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleWCPayOverseaWalletBuffer", "invoke JsApiHandleWCPayOverseaWalletBuffer!");
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleWCPayOverseaWalletBuffer", "fail:component is null");
            return;
        }
        if (lVar.getContext() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleWCPayOverseaWalletBuffer", "fail:context is null");
            lVar.a(i17, o("fail"));
            return;
        }
        com.tencent.mm.autogen.events.WCPayWalletBufferEvent wCPayWalletBufferEvent = new com.tencent.mm.autogen.events.WCPayWalletBufferEvent();
        java.lang.String optString = jSONObject.optString("action");
        am.e10 e10Var = wCPayWalletBufferEvent.f54951g;
        e10Var.f6532h = optString;
        e10Var.f6534j = jSONObject.optString("buffer");
        e10Var.f6525a = jSONObject.optString("appId");
        e10Var.f6533i = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("walletRegion"), 0);
        e10Var.f6526b = jSONObject.optString("timeStamp");
        e10Var.f6530f = jSONObject.optString("nonceStr");
        e10Var.f6528d = jSONObject.optString("paySign");
        e10Var.f6529e = jSONObject.optString("signType");
        e10Var.f6527c = jSONObject.optString("package");
        e10Var.f6531g = jSONObject.optString("url");
        wCPayWalletBufferEvent.f54952h.f6628c = new com.tencent.mm.plugin.appbrand.jsapi.pay.w(this, wCPayWalletBufferEvent, lVar, i17);
        wCPayWalletBufferEvent.e();
    }
}
