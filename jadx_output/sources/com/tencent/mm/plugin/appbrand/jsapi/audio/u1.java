package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public final class u1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1319;
    public static final java.lang.String NAME = "operateTingAudio";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask f79288g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        com.tencent.luggage.sdk.jsapi.component.service.y service = (com.tencent.luggage.sdk.jsapi.component.service.y) lVar;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String appId = service.getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiOperateTingAudio", "operateTingAudio appId:%s", appId);
        if (this.f79288g == null) {
            this.f79288g = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask(this, service, i17);
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask jsApiSetTingAudioState$SetTingAudioListenerTask = this.f79288g;
        kotlin.jvm.internal.o.d(jsApiSetTingAudioState$SetTingAudioListenerTask);
        jsApiSetTingAudioState$SetTingAudioListenerTask.R(i17);
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask jsApiSetTingAudioState$SetTingAudioListenerTask2 = this.f79288g;
        kotlin.jvm.internal.o.d(jsApiSetTingAudioState$SetTingAudioListenerTask2);
        jsApiSetTingAudioState$SetTingAudioListenerTask2.O(appId);
        if (this.f79288g != null) {
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0 = service.t3().E0();
            kotlin.jvm.internal.o.f(E0, "getSysConfig(...)");
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask jsApiSetTingAudioState$SetTingAudioListenerTask3 = this.f79288g;
            kotlin.jvm.internal.o.d(jsApiSetTingAudioState$SetTingAudioListenerTask3);
            jsApiSetTingAudioState$SetTingAudioListenerTask3.Y(E0.f305852r.f75399d);
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask jsApiSetTingAudioState$SetTingAudioListenerTask4 = this.f79288g;
            kotlin.jvm.internal.o.d(jsApiSetTingAudioState$SetTingAudioListenerTask4);
            jsApiSetTingAudioState$SetTingAudioListenerTask4.Q(E0.f305841d);
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask jsApiSetTingAudioState$SetTingAudioListenerTask5 = this.f79288g;
            kotlin.jvm.internal.o.d(jsApiSetTingAudioState$SetTingAudioListenerTask5);
            jsApiSetTingAudioState$SetTingAudioListenerTask5.P(com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.a(service));
            java.lang.String a17 = c01.n2.a("AppBrandService#" + service.hashCode());
            c01.l2 c17 = c01.n2.d().c(a17, true);
            kotlin.jvm.internal.o.d(c17);
            synchronized (c17) {
                if (((com.tencent.mm.plugin.appbrand.v0) c17.c("AppBrandLifeCycle.Listener", null)) == null) {
                    com.tencent.mm.plugin.appbrand.jsapi.audio.t1 t1Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.t1(c17, this, a17);
                    c17.i("AppBrandLifeCycle.Listener", t1Var);
                    c17.i("appId", service.getAppId());
                    com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask jsApiSetTingAudioState$SetTingAudioListenerTask6 = this.f79288g;
                    kotlin.jvm.internal.o.d(jsApiSetTingAudioState$SetTingAudioListenerTask6);
                    jsApiSetTingAudioState$SetTingAudioListenerTask6.X(t1Var);
                }
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateTingAudio$OperateTingAudioTask jsApiOperateTingAudio$OperateTingAudioTask = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateTingAudio$OperateTingAudioTask(this, service, i17);
        jsApiOperateTingAudio$OperateTingAudioTask.I(i17);
        jsApiOperateTingAudio$OperateTingAudioTask.H(appId);
        jsApiOperateTingAudio$OperateTingAudioTask.K(data.toString());
        jsApiOperateTingAudio$OperateTingAudioTask.d();
    }
}
