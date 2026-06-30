package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class f implements fb1.g {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.f f76700d = new com.tencent.mm.plugin.appbrand.av_device_usage.f();

    @Override // fb1.g
    public void F3(fb1.d scene, boolean z17, java.lang.String token) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(token, "token");
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.av_device_usage.e(token, scene, z17), "MicroMsg.AVDeviceUsageClientService");
    }

    @Override // fb1.g
    public boolean R() {
        return true;
    }

    @Override // fb1.g
    public fb1.c ec(fb1.d scene, boolean z17, fb1.h hVar) {
        fb1.c cVar;
        kotlin.jvm.internal.o.g(scene, "scene");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene.f76682e.a(scene));
        bundle.putBinder("onStatusChange", hVar == null ? null : new com.tencent.mm.plugin.appbrand.av_device_usage.h0(hVar));
        bundle.putBoolean("shouldKeepObservingWhenBusy", z17);
        com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus parcelableAVDeviceStatus = (com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus) uk0.a.d(bundle, com.tencent.mm.plugin.appbrand.av_device_usage.b.f76686a);
        if (parcelableAVDeviceStatus != null && (cVar = parcelableAVDeviceStatus.f76681f) != null) {
            return cVar;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AVDeviceUsageClientService", "IPC call returned null, using fallback value AVDeviceStatus.Idle");
        return fb1.b.f260828a;
    }
}
