package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class h implements org.webrtc.RendererCommon.RendererEvents {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webrtc.i f83827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f83828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83829f;

    public h(com.tencent.mm.plugin.appbrand.jsapi.webrtc.i iVar, com.tencent.luggage.sdk.jsapi.component.b bVar, int i17) {
        this.f83827d = iVar;
        this.f83828e = bVar;
        this.f83829f = i17;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        this.f83827d.Q(this.f83828e, this.f83829f);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: onFrameResolutionChanged " + i17 + " * " + i18);
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onRenderStats(org.webrtc.PerformanceStatistics performanceStatistics) {
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e;
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var;
        kotlin.jvm.internal.o.g(performanceStatistics, "performanceStatistics");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertWebRTCRendererView", "hy: current render stats: " + performanceStatistics);
        com.tencent.luggage.sdk.jsapi.component.b bVar = this.f83828e;
        com.tencent.luggage.sdk.jsapi.component.service.y v37 = bVar.v3();
        if (v37 == null || (f147808e = v37.getF147808e()) == null || (f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class)) == null) {
            return;
        }
        f0Var.post(new com.tencent.mm.plugin.appbrand.jsapi.webrtc.g(bVar, performanceStatistics));
    }
}
