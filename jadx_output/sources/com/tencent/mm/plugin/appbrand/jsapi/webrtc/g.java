package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.b f83822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.webrtc.PerformanceStatistics f83823e;

    public g(com.tencent.luggage.sdk.jsapi.component.b bVar, org.webrtc.PerformanceStatistics performanceStatistics) {
        this.f83822d = bVar;
        this.f83823e = performanceStatistics;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.libmmwebrtc.MMWebRTCBinding mMWebRTCBinding;
        com.tencent.luggage.sdk.jsapi.component.service.a0 y17 = this.f83822d.v3().y1();
        synchronized (y17) {
            mMWebRTCBinding = y17.f47364h;
        }
        if (mMWebRTCBinding != null) {
            mMWebRTCBinding.onRenderStats(this.f83823e);
        }
    }
}
