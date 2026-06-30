package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class e0 implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.h0 f76698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeStub$onCallback$observer$1 f76699e;

    public e0(com.tencent.mm.plugin.appbrand.av_device_usage.h0 h0Var, com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeStub$onCallback$observer$1 onAVDeviceStatusChangeStub$onCallback$observer$1) {
        this.f76698d = h0Var;
        this.f76699e = onAVDeviceStatusChangeStub$onCallback$observer$1;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        nf.e.f(new com.tencent.mm.plugin.appbrand.av_device_usage.d0(this.f76698d, this.f76699e));
    }
}
