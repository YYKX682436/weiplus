package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class h3 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 35;
    public static final java.lang.String NAME = "stopVoice";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStopPlayVoice", "doStopVoice, appId : %s, localId : %s", e9Var.getAppId(), jSONObject.optString(dm.i4.COL_LOCALID));
        new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice$StopPlayVoice().d();
        e9Var.a(i17, o("ok"));
        com.tencent.mm.plugin.appbrand.jsapi.audio.v2.f79291h = null;
    }
}
