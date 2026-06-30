package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.h0 f76693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeStub$onCallback$observer$1 f76694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.appbrand.av_device_usage.h0 h0Var, com.tencent.mm.plugin.appbrand.av_device_usage.OnAVDeviceStatusChangeStub$onCallback$observer$1 onAVDeviceStatusChangeStub$onCallback$observer$1) {
        super(0);
        this.f76693d = h0Var;
        this.f76694e = onAVDeviceStatusChangeStub$onCallback$observer$1;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f76693d.f76708d.getLifecycleOwner().mo133getLifecycle().c(this.f76694e);
        return jz5.f0.f302826a;
    }
}
