package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lk0.f f76701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.h0 f76702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeStub$onCallback$observer$1 f76703f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(lk0.f fVar, com.tencent.mm.plugin.appbrand.av_device_usage.h0 h0Var, com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeStub$onCallback$observer$1 onAVDeviceStatusChangeStub$onCallback$observer$1) {
        super(0);
        this.f76701d = fVar;
        this.f76702e = h0Var;
        this.f76703f = onAVDeviceStatusChangeStub$onCallback$observer$1;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AVDeviceUsageClientService", "OnAVDeviceStatusChangeStub.onCallback, observe lifecycle, senderProxy: " + this.f76701d);
        this.f76702e.f76708d.getLifecycleOwner().mo133getLifecycle().a(this.f76703f);
        return jz5.f0.f302826a;
    }
}
