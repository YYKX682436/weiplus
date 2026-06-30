package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class z7 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 102;
    public static final java.lang.String NAME = "makePhoneCall";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        java.lang.String optString = jSONObject.optString("phoneNumber");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            e9Var.a(i17, o("fail"));
            return;
        }
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
            intent.setData(android.net.Uri.parse("tel:" + android.net.Uri.encode(optString)));
            nf.g.a(Z0).j(intent, new com.tencent.mm.plugin.appbrand.jsapi.y7(this, e9Var, i17));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiMakePhoneCall", "startActivity failed");
            e9Var.a(i17, o("fail"));
        }
    }
}
