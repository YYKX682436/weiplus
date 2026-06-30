package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public final class af extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = 313;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "verifyPlugin";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 service = (com.tencent.mm.plugin.appbrand.e9) lVar;
        kotlin.jvm.internal.o.g(service, "service");
        if (jSONObject == null || !jSONObject.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) {
            service.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String str = "appId[" + service.getAppId() + "] callbackId[" + i17 + ']';
        r45.sx6 sx6Var = new r45.sx6();
        sx6Var.f386013d = service.getAppId();
        sx6Var.f386014e = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        com.tencent.mm.plugin.appbrand.networking.c0 c0Var = (com.tencent.mm.plugin.appbrand.networking.c0) service.q(com.tencent.mm.plugin.appbrand.networking.c0.class);
        if (c0Var != null) {
            c0Var.e1("/cgi-bin/mmbiz-bin/wxaapp/verifyplugin", sx6Var.f386013d, sx6Var, r45.tx6.class).a(new com.tencent.mm.plugin.appbrand.jsapi.ze(str, service, i17, this));
            return;
        }
        com.tencent.mars.xlog.Log.e("Luggage.WXA.FULLSDK.JsApiVerifyPlugin", str + " NULL cgiService");
        service.a(i17, o("fail:internal error"));
    }
}
