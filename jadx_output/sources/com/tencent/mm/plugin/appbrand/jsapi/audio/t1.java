package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public final class t1 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f79281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.u1 f79282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79283f;

    public t1(c01.l2 l2Var, com.tencent.mm.plugin.appbrand.jsapi.audio.u1 u1Var, java.lang.String str) {
        this.f79281d = l2Var;
        this.f79282e = u1Var;
        this.f79283f = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        java.lang.String f17 = this.f79281d.f("appId", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "onDestroy, appId:" + f17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.u1 u1Var = this.f79282e;
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask jsApiSetTingAudioState$SetTingAudioListenerTask = u1Var.f79288g;
        kotlin.jvm.internal.o.d(jsApiSetTingAudioState$SetTingAudioListenerTask);
        com.tencent.mm.plugin.appbrand.jsapi.l service = jsApiSetTingAudioState$SetTingAudioListenerTask.getService();
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask jsApiSetTingAudioState$SetTingAudioListenerTask2 = u1Var.f79288g;
        kotlin.jvm.internal.o.d(jsApiSetTingAudioState$SetTingAudioListenerTask2);
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateTingAudio$OperateTingAudioTask jsApiOperateTingAudio$OperateTingAudioTask = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateTingAudio$OperateTingAudioTask(u1Var, service, jsApiSetTingAudioState$SetTingAudioListenerTask2.getCallbackId());
        jsApiOperateTingAudio$OperateTingAudioTask.K(jSONObject.toString());
        jsApiOperateTingAudio$OperateTingAudioTask.H(f17);
        jsApiOperateTingAudio$OperateTingAudioTask.s();
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask jsApiSetTingAudioState$SetTingAudioListenerTask3 = u1Var.f79288g;
        if (jsApiSetTingAudioState$SetTingAudioListenerTask3 != null) {
            jsApiSetTingAudioState$SetTingAudioListenerTask3.x();
        }
        c01.l2 e17 = c01.n2.d().e(this.f79283f);
        if (e17 != null) {
            e17.h();
        }
    }
}
