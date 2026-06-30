package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC extends com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask {

    /* renamed from: u, reason: collision with root package name */
    public c01.l2 f79085u;

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f79086v;

    public JsApiSetBackgroundAudioStateWC$SetBackgroundAudioListenerTaskWC(com.tencent.mm.plugin.appbrand.jsapi.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        super(fVar, lVar, i17);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = lVar instanceof com.tencent.mm.plugin.appbrand.y ? ((com.tencent.mm.plugin.appbrand.y) lVar).getRuntime() : null;
        if (runtime != null) {
            this.f79086v = runtime.f74795d;
        } else {
            this.f79086v = lVar.getF147807d();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState$SetBackgroundAudioListenerTask
    public void E(int i17) {
        if (i17 == 0 || i17 == 1) {
            this.f79085u.i("setBackgroundAudioState#isPlaying", java.lang.Boolean.TRUE);
            ((ov.k0) ((pv.h0) i95.n0.c(pv.h0.class))).getClass();
            if (qp1.q.b()) {
                return;
            }
            com.tencent.mm.plugin.appbrand.floatball.t.a(this.f79086v, 6, null);
            return;
        }
        if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 7) {
            this.f79085u.i("setBackgroundAudioState#isPlaying", java.lang.Boolean.FALSE);
        }
    }
}
