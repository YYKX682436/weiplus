package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class h2 extends com.tencent.mm.plugin.appbrand.jsapi.audio.e2 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.e2
    public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask C(com.tencent.mm.plugin.appbrand.jsapi.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC(fVar, lVar, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.e2
    public com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask D(final com.tencent.mm.plugin.appbrand.jsapi.f fVar, final com.tencent.mm.plugin.appbrand.jsapi.l lVar, final int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask(fVar, lVar, i17) { // from class: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioStateTaskWC
            @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioStateTask
            public java.lang.String B(java.lang.String str) {
                return g83.a.a() + str.hashCode();
            }
        };
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.e2
    public void E(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (this.f79180g != null) {
            k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
            this.f79180g.f79065i = z0Var.f305852r.f75399d;
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask = this.f79180g;
            jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79066m = z0Var.f305841d;
            jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask.f79067n = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.a(lVar);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f79180g.f79065i);
            com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask2 = this.f79180g;
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.JsApiSetBackgroundAudioState", "pkgType:%d, brandName:%s, appUserName", valueOf, jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask2.f79066m, jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask2.f79067n);
            c01.l2 c17 = c01.n2.d().c(str, true);
            synchronized (c17) {
                if (((com.tencent.mm.plugin.appbrand.ui.banner.w) c17.c("StickyBannerChangeListener", null)) == null) {
                    com.tencent.mm.plugin.appbrand.jsapi.audio.g2 g2Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.g2(this, c17);
                    c17.i("pkgType", java.lang.Integer.valueOf(z0Var.f305852r.f75399d));
                    c17.i("StickyBannerChangeListener", g2Var);
                    c17.i("appId", lVar.getAppId());
                }
                com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask3 = this.f79180g;
                if (jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask3 instanceof com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC) {
                    ((com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC) jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask3).getClass();
                    ((com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC) jsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask3).f79085u = c17;
                }
            }
        }
    }
}
