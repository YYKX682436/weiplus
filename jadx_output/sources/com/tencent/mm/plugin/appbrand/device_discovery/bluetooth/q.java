package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class q implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f77950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f77951e;

    public q(yz5.l lVar, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        this.f77950d = lVar;
        this.f77951e = monitoredBluetoothDeviceInfo;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "SetMonitoredBluetoothDeviceInfo#" + hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object m521constructorimpl;
        if (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.i(this.f77951e)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.j1(null, 1, null)));
        }
        this.f77950d.invoke(kotlin.Result.m520boximpl(m521constructorimpl));
    }
}
