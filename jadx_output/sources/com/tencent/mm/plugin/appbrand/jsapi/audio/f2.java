package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
class f2 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.l2 f79189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f79191f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.e2 f79192g;

    public f2(com.tencent.mm.plugin.appbrand.jsapi.audio.e2 e2Var, c01.l2 l2Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79192g = e2Var;
        this.f79189d = l2Var;
        this.f79190e = lVar;
        this.f79191f = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        java.lang.String f17 = this.f79189d.f("appId", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "onDestroy, appId:%s", f17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask jsApiSetBackgroundAudioState$SetBackgroundAudioStateTask = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask(this.f79192g, this.f79190e, this.f79191f);
        jsApiSetBackgroundAudioState$SetBackgroundAudioStateTask.f79080n = jSONObject.toString();
        jsApiSetBackgroundAudioState$SetBackgroundAudioStateTask.f79078i = f17;
        jsApiSetBackgroundAudioState$SetBackgroundAudioStateTask.s();
    }
}
