package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class c0 implements fb1.h, androidx.lifecycle.y {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f76688g = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public final lk0.f f76689d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.av_device_usage.c0 f76690e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.b0 f76691f;

    public c0(lk0.f ipcProxy) {
        kotlin.jvm.internal.o.g(ipcProxy, "ipcProxy");
        this.f76689d = ipcProxy;
        this.f76690e = this;
        androidx.lifecycle.b0 b0Var = new androidx.lifecycle.b0(this, true);
        this.f76691f = b0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.<init>, ipcProxy: " + ipcProxy);
        nf.e.f(new com.tencent.mm.plugin.appbrand.av_device_usage.y(this));
        f76688g.add(this);
        nf.e.f(new com.tencent.mm.plugin.appbrand.av_device_usage.b0(this));
        int i17 = com.tencent.mm.plugin.appbrand.av_device_usage.h0.f76707e;
        com.tencent.mm.plugin.appbrand.av_device_usage.x xVar = new com.tencent.mm.plugin.appbrand.av_device_usage.x(b0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.provideLifecycleSender, sender: " + xVar);
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("callbackType", 1);
            bundle.putBinder("sender", xVar);
            ipcProxy.f(bundle);
        } catch (android.os.DeadObjectException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.provideLifecycleSender, trigger DeadObjectException");
        }
        this.f76689d.asBinder().linkToDeath(new com.tencent.mm.plugin.appbrand.av_device_usage.a0(this), 0);
    }

    @Override // fb1.h
    public void a(fb1.c status) {
        com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus parcelableAVDeviceStatus;
        kotlin.jvm.internal.o.g(status, "status");
        int i17 = com.tencent.mm.plugin.appbrand.av_device_usage.h0.f76707e;
        lk0.f fVar = this.f76689d;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.onStatusChange, status: " + status);
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("callbackType", 2);
            if (kotlin.jvm.internal.o.b(status, fb1.b.f260828a)) {
                parcelableAVDeviceStatus = new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus(true, "");
            } else {
                if (!(status instanceof fb1.a)) {
                    throw new jz5.j();
                }
                parcelableAVDeviceStatus = new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus(false, ((fb1.a) status).f260827a);
            }
            bundle.putParcelable("status", parcelableAVDeviceStatus);
            fVar.f(bundle);
        } catch (android.os.DeadObjectException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeProxy.onStatusChange, trigger DeadObjectException");
        }
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f76691f;
    }

    @Override // fb1.h
    public androidx.lifecycle.y getLifecycleOwner() {
        return this.f76690e;
    }
}
