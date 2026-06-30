package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class c4 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 532;
    public static final java.lang.String NAME = "chooseMessageFile";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMessageFile", "data is null");
            d0Var.a(i17, o("fail:invalid data"));
            return;
        }
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMessageFile", "context is null, invoke with appId:%s, callbackId:%d", d0Var.getAppId(), java.lang.Integer.valueOf(i17));
            d0Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMessageFile", "chooseMsgFile data:%s, appId:%s, callbackId:%d", jSONObject, d0Var.getAppId(), java.lang.Integer.valueOf(i17));
        java.lang.String optString = jSONObject.optString("type", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL);
        java.lang.String optString2 = jSONObject.optString("extension", "");
        int optInt = jSONObject.optInt("count", 9);
        ((uv1.d) ((lo.k) i95.n0.c(lo.k.class))).Ai(r07, optString, optInt, optString2, new com.tencent.mm.plugin.appbrand.jsapi.media.b4(this, d0Var, i17));
    }
}
