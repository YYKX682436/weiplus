package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class c0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 293;
    public static final java.lang.String NAME = "getAudioState";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiGetAudioState", "getAudioState data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        java.lang.String optString = jSONObject.optString("audioId");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiGetAudioState", "getAudioState audioId is empty");
            lVar.a(i17, o("fail:audioId is empty"));
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.audio.b0 b0Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.b0(this, lVar, i17);
            lVar.getAppId();
            b0Var.f79136g = optString;
            b0Var.c();
        }
    }
}
