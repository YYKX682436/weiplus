package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class x0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u81.h f77974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f77975e;

    public x0(u81.h hVar, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo) {
        this.f77974d = hVar;
        this.f77975e = monitoredBluetoothDeviceInfo;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.SUSPEND == bVar) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.y0.a(this.f77975e);
            this.f77974d.c(this);
        }
    }
}
