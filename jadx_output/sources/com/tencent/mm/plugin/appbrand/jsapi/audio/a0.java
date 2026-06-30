package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class a0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 290;
    public static final java.lang.String NAME = "destroyAudioInstance";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getJsRuntime());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiDestroyInstanceAudio", "destroyAudioInstance fail, data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiDestroyInstanceAudio", "destroyAudioInstance data:%s", jSONObject.toString());
        java.lang.String optString = jSONObject.optString("audioId");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiDestroyInstanceAudio", "audioId is empty");
            lVar.a(i17, o("fail:audioId is empty"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.z zVar = new com.tencent.mm.plugin.appbrand.jsapi.audio.z(this, lVar, i17);
        lVar.getAppId();
        zVar.f79314g = optString;
        zVar.c();
        com.tencent.mm.plugin.appbrand.jsapi.audio.d.INSTANCE.a(lVar.getAppId()).b(optString);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public boolean m() {
        return true;
    }
}
