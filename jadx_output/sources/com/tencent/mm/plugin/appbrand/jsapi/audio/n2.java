package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public final class n2 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f79254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.o2 f79255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f79257g;

    public n2(c01.l2 l2Var, com.tencent.mm.plugin.appbrand.jsapi.audio.o2 o2Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79254d = l2Var;
        this.f79255e = o2Var;
        this.f79256f = lVar;
        this.f79257g = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        java.lang.String f17 = this.f79254d.f("appId", "");
        kotlin.jvm.internal.o.f(f17, "getString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetTingAudioState", "onDestroy, appId:%s", f17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SeTingAudioStateTask jsApiSetTingAudioState$SeTingAudioStateTask = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SeTingAudioStateTask(this.f79255e, this.f79256f, this.f79257g);
        jsApiSetTingAudioState$SeTingAudioStateTask.Q(jSONObject.toString());
        jsApiSetTingAudioState$SeTingAudioStateTask.M(f17);
        jsApiSetTingAudioState$SeTingAudioStateTask.s();
    }
}
