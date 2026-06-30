package com.tencent.mm.plugin.appbrand.av_device_usage;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tencent/mm/plugin/appbrand/av_device_usage/ParcelableAVDeviceStatus;", "kotlin.jvm.PlatformType", "paramsBundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class b<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.b f76686a = new com.tencent.mm.plugin.appbrand.av_device_usage.b();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        fb1.d dVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        bundle.setClassLoader(com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene.class.getClassLoader());
        com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene parcelableAVDeviceUsageScene = (com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene) bundle.getParcelable(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        fb1.c cVar = fb1.b.f260828a;
        if (parcelableAVDeviceUsageScene == null || (dVar = parcelableAVDeviceUsageScene.f76684d) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AVDeviceUsageClientService", "IPCSyncInvokeTask.invoke, scene is null");
            if (kotlin.jvm.internal.o.b(cVar, cVar)) {
                return new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus(true, "");
            }
            if (cVar instanceof fb1.a) {
                return new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus(false, ((fb1.a) cVar).f260827a);
            }
            throw new jz5.j();
        }
        lk0.f d17 = lk0.e.d(bundle.getBinder("onStatusChange"));
        fb1.c ec6 = com.tencent.mm.plugin.appbrand.av_device_usage.q.f76731d.ec(dVar, bundle.getBoolean("shouldKeepObservingWhenBusy", false), d17 == null ? null : new com.tencent.mm.plugin.appbrand.av_device_usage.c0(d17));
        if (kotlin.jvm.internal.o.b(ec6, cVar)) {
            return new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus(true, "");
        }
        if (ec6 instanceof fb1.a) {
            return new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus(false, ((fb1.a) ec6).f260827a);
        }
        throw new jz5.j();
    }
}
