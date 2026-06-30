package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class r0 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f79269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.s0 f79271f;

    public r0(com.tencent.mm.plugin.appbrand.jsapi.audio.s0 s0Var, c01.l2 l2Var, java.lang.String str) {
        this.f79271f = s0Var;
        this.f79269d = l2Var;
        this.f79270e = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        java.lang.String f17 = this.f79269d.f("appId", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "onDestroy, appId:%s", f17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.s0 s0Var = this.f79271f;
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask = s0Var.f79264g;
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$OperateBackgroundAudioTask jsApiOperateBackgroundAudio$OperateBackgroundAudioTask = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio$OperateBackgroundAudioTask(s0Var, jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79063g, jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79064h);
        jsApiOperateBackgroundAudio$OperateBackgroundAudioTask.f79035m = jSONObject.toString();
        jsApiOperateBackgroundAudio$OperateBackgroundAudioTask.f79034i = f17;
        jsApiOperateBackgroundAudio$OperateBackgroundAudioTask.s();
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask2 = s0Var.f79264g;
        if (jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask2 != null) {
            jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask2.x();
        }
        c01.l2 e17 = c01.n2.d().e(this.f79270e);
        if (e17 != null) {
            e17.h();
        }
    }
}
