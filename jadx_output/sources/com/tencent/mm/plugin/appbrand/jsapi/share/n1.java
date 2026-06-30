package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes4.dex */
public class n1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 465;
    public static final java.lang.String NAME = "showUpdatableMessageSubscribeButton";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowUpdatableMessageSubscribeButton", "data is null, err");
            e9Var.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("shareKey");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShowUpdatableMessageSubscribeButton", "shareKey is null, err");
            e9Var.a(i17, o("fail:invalid data"));
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask jsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask = new com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask();
            jsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask.f83060f = optString;
            jsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask.d();
            e9Var.a(i17, o("ok"));
        }
    }
}
