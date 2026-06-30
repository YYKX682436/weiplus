package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f77878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        super(1);
        this.f77878d = monitoredBluetoothDeviceInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1 runningState = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o1) obj;
        kotlin.jvm.internal.o.g(runningState, "runningState");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v0.a(this.f77878d, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1.f77922h, new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d0(runningState));
        return jz5.f0.f302826a;
    }
}
