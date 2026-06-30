package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class y1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 34;
    public static final java.lang.String NAME = "pauseVoice";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice$PausePlayVoice().d();
        com.tencent.mm.plugin.appbrand.jsapi.audio.v2.f79291h = null;
        ((com.tencent.mm.plugin.appbrand.e9) lVar).a(i17, o("ok"));
    }
}
