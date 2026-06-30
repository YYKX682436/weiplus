package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public class c0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1545;
    private static final java.lang.String NAME = "getChatToolInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("Luggage.JsApigetChatToolInfo", "getChatToolInfo data: " + jSONObject);
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApigetChatToolInfo", "getChatToolInfo fail, env is null");
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.chattool.b0(jSONObject, c0Var, i17, this, null), 3, null);
        }
    }
}
