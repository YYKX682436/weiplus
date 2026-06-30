package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class h0 extends com.tencent.mm.plugin.appbrand.jsapi.n5 {
    public static final int CTRL_INDEX = 1090;
    public static final java.lang.String NAME = "onMonitoredBluetoothDeviceFound";

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo f80073i;

    public h0(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo deviceInfo) {
        kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
        this.f80073i = deviceInfo;
        java.lang.String str = deviceInfo.field_appId;
        java.lang.String str2 = deviceInfo.field_bluetoothDeviceId;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MonitoredBluetoothDevices", "<init>#OnMonitoredBluetoothDeviceFoundEvent, appId: " + str + ", deviceId: " + str2);
        s("bluetoothDeviceId", str2);
    }

    public final void u(yz5.l lVar) {
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = this.f80073i;
        java.lang.String str = monitoredBluetoothDeviceInfo.field_appId;
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str);
        com.tencent.mm.plugin.appbrand.o6 o6Var = null;
        com.tencent.mm.plugin.appbrand.service.c0 C0 = b17 != null ? b17.C0() : null;
        if (C0 != null && true == C0.s(NAME)) {
            p(C0);
            m();
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.v0.a(monitoredBluetoothDeviceInfo, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.m1.f77925n, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.c0(C0));
            if (lVar != null) {
                lVar.invoke(C0);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatchWhenReady, dispatchWhenRuntimeReady, appService exists: ");
        sb6.append(C0 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MonitoredBluetoothDevices", sb6.toString());
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b0 b0Var = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b0(this, lVar);
        com.tencent.mm.plugin.appbrand.o6 b18 = com.tencent.mm.plugin.appbrand.l.b(str);
        if (b18 != null) {
            b18.I1(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e0(b0Var, b18));
            o6Var = b18;
        }
        if (o6Var == null) {
            com.tencent.mm.plugin.appbrand.x0.a(str, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d0(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g0(str, b0Var), str));
        }
    }
}
