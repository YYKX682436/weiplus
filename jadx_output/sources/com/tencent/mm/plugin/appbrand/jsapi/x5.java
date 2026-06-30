package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class x5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 101;
    public static final java.lang.String NAME = "getAppConfig";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (jSONObject == null) {
            c0Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetAppConfig", "data is null");
            return;
        }
        java.lang.String appId = c0Var.getAppId();
        int optInt = jSONObject.optInt("type", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetAppConfig", "getAppConfig app_id:%s,type:%d", appId, java.lang.Integer.valueOf(optInt));
        if (optInt <= 0) {
            c0Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetAppConfig", "type %d is invalid", java.lang.Integer.valueOf(optInt));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask jsApiGetAppConfigTask = new com.tencent.mm.plugin.appbrand.jsapi.JsApiGetAppConfigTask();
        jsApiGetAppConfigTask.f78517f = appId;
        jsApiGetAppConfigTask.f78520i = optInt;
        jsApiGetAppConfigTask.f78521m = c0Var.t3().g2();
        jsApiGetAppConfigTask.f78522n = new com.tencent.mm.plugin.appbrand.jsapi.w5(this, optInt, jsApiGetAppConfigTask, c0Var, i17);
        jsApiGetAppConfigTask.d();
    }
}
