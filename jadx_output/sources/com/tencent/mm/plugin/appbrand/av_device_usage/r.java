package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class r implements fb1.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb1.h f76735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fb1.h f76736e;

    public r(fb1.h hVar) {
        this.f76736e = hVar;
        this.f76735d = hVar;
    }

    @Override // fb1.h
    public void a(fb1.c status) {
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageMainService", "onStatusChange, status: " + status);
        this.f76736e.a(status);
    }

    @Override // fb1.h
    public androidx.lifecycle.y getLifecycleOwner() {
        return this.f76735d.getLifecycleOwner();
    }
}
