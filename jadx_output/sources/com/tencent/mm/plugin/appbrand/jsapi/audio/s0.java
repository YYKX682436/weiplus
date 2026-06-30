package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class s0 extends com.tencent.mm.plugin.appbrand.jsapi.audio.p0 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.p0
    public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask C(com.tencent.mm.plugin.appbrand.jsapi.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC(fVar, (com.tencent.luggage.sdk.jsapi.component.service.y) lVar, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.p0
    public void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) lVar;
        if (this.f79264g != null) {
            com.tencent.luggage.sdk.config.AppBrandSysConfigLU E0 = yVar.t3().E0();
            this.f79264g.f79065i = E0.f305852r.f75399d;
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask = this.f79264g;
            jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79066m = E0.f305841d;
            jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79067n = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.a(yVar);
            java.lang.String a17 = c01.n2.a("AppBrandService#" + yVar.hashCode());
            c01.l2 c17 = c01.n2.d().c(a17, true);
            synchronized (c17) {
                if (((com.tencent.mm.plugin.appbrand.ui.banner.w) c17.c("StickyBannerChangeListener", null)) == null) {
                    com.tencent.mm.plugin.appbrand.jsapi.audio.q0 q0Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.q0(this, c17);
                    k91.z0 z0Var = (k91.z0) yVar.b(k91.z0.class);
                    if (z0Var != null) {
                        c17.i("pkgType", java.lang.Integer.valueOf(z0Var.f305852r.f75399d));
                    }
                    c17.i("StickyBannerChangeListener", q0Var);
                    c17.i("appId", yVar.getAppId());
                }
                if (((com.tencent.mm.plugin.appbrand.v0) c17.c("AppBrandLifeCycle.Listener", null)) == null) {
                    com.tencent.mm.plugin.appbrand.jsapi.audio.r0 r0Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.r0(this, c17, a17);
                    c17.i("AppBrandLifeCycle.Listener", r0Var);
                    this.f79264g.f79062f = r0Var;
                }
                com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask2 = this.f79264g;
                if (jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask2 instanceof com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC) jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask2).getClass();
                    ((com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC) jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask2).f79085u = c17;
                }
            }
        }
    }
}
