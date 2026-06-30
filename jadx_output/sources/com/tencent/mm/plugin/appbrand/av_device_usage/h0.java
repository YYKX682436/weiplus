package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class h0 extends lk0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f76707e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final fb1.h f76708d;

    public h0(fb1.h onStatusChange) {
        kotlin.jvm.internal.o.g(onStatusChange, "onStatusChange");
        this.f76708d = onStatusChange;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeStub$onCallback$observer$1] */
    @Override // lk0.f
    public void f(android.os.Bundle bundle) {
        fb1.c cVar;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus.class.getClassLoader());
        int i17 = bundle.getInt("callbackType", 0);
        if (i17 == 1) {
            final lk0.f d17 = lk0.e.d(bundle.getBinder("sender"));
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeStub.onCallback, sender is null");
                return;
            }
            ?? r07 = new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeStub$onCallback$observer$1
                @Override // androidx.lifecycle.v
                public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                    kotlin.jvm.internal.o.g(source, "source");
                    kotlin.jvm.internal.o.g(event, "event");
                    if (androidx.lifecycle.m.ON_DESTROY == event) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeStub.onCallback, onDestroy");
                        int i18 = com.tencent.mm.plugin.appbrand.av_device_usage.x.f76745e;
                        lk0.f fVar = lk0.f.this;
                        kotlin.jvm.internal.o.g(fVar, "<this>");
                        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageClientService", "LifecycleSendProxy.onDestroy");
                        try {
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putBoolean("lifecycleOnDestroy", true);
                            fVar.f(bundle2);
                        } catch (android.os.DeadObjectException unused) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AVDeviceUsageClientService", "LifecycleSendProxy.onDestroy, trigger DeadObjectException");
                        }
                        this.f76708d.getLifecycleOwner().mo133getLifecycle().c(this);
                    }
                }
            };
            d17.asBinder().linkToDeath(new com.tencent.mm.plugin.appbrand.av_device_usage.e0(this, r07), 0);
            nf.e.f(new com.tencent.mm.plugin.appbrand.av_device_usage.f0(d17, this, r07));
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus parcelableAVDeviceStatus = (com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus) bundle.getParcelable("status");
        if (parcelableAVDeviceStatus == null || (cVar = parcelableAVDeviceStatus.f76681f) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeStub.onCallback, parcelable is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeStub.onCallback, onStatusChange, status: " + cVar);
        nf.e.f(new com.tencent.mm.plugin.appbrand.av_device_usage.g0(this, cVar));
    }
}
