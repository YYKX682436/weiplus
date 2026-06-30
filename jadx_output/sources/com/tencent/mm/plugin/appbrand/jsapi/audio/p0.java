package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class p0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 161;
    public static final java.lang.String NAME = "operateBackgroundAudio";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask f79264g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio data is null");
            return;
        }
        java.lang.String appId = lVar.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio appId:%s", appId);
        if (this.f79264g == null) {
            this.f79264g = C(this, lVar, i17);
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask = this.f79264g;
        jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79064h = i17;
        jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79068o = appId;
        D(lVar);
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$OperateBackgroundAudioTask jsApiOperateBackgroundAudio$OperateBackgroundAudioTask = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$OperateBackgroundAudioTask(this, lVar, i17);
        jsApiOperateBackgroundAudio$OperateBackgroundAudioTask.f79033h = i17;
        jsApiOperateBackgroundAudio$OperateBackgroundAudioTask.f79034i = appId;
        jsApiOperateBackgroundAudio$OperateBackgroundAudioTask.f79035m = jSONObject.toString();
        jsApiOperateBackgroundAudio$OperateBackgroundAudioTask.d();
    }

    public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask C(com.tencent.mm.plugin.appbrand.jsapi.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask(this, lVar, i17);
    }

    public void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
    }
}
