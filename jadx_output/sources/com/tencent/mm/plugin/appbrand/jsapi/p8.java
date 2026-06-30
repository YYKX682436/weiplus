package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class p8 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "opNativeRedDot";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString("op");
        int optInt = jSONObject.optInt("redDotType", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpNativeRedDot", "op:%s redDotType:%d", optString, java.lang.Integer.valueOf(optInt));
        optString.getClass();
        if (optString.equals("clear")) {
            cj1.b.a(optInt);
            lVar.a(i17, o("ok"));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpNativeRedDot", "unknown op:%s", optString);
            lVar.a(i17, o("fail unknown op"));
        }
    }
}
