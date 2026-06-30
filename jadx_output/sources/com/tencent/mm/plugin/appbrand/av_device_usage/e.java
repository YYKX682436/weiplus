package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fb1.d f76696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f76697f;

    public e(java.lang.String str, fb1.d dVar, boolean z17) {
        this.f76695d = str;
        this.f76696e = dVar;
        this.f76697f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uk0.a.d(new com.tencent.mm.plugin.appbrand.av_device_usage.AVDeviceUsageClientService$MarkInUseParams(com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene.f76682e.a(this.f76696e), this.f76697f, this.f76695d + '_' + bm5.f1.a()), com.tencent.mm.plugin.appbrand.av_device_usage.d.f76692a);
    }
}
