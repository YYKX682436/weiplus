package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u f77959a = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f77960b = com.tencent.mm.sdk.platformtools.x2.n();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f77961c;

    static {
        java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        kotlin.jvm.internal.o.f(newSetFromMap, "newSetFromMap(...)");
        f77961c = newSetFromMap;
    }

    public final void a(java.lang.String appId, java.lang.String wechatToken, yz5.l callback) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(wechatToken, "wechatToken");
        kotlin.jvm.internal.o.g(callback, "callback");
        t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "deleteInfoAsync, appId: " + appId + ", wechatToken: " + wechatToken);
        if (!f77960b) {
            uk0.a.b(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams(appId, wechatToken), com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.j.f77899d, new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k(callback));
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.i(callback, appId, wechatToken), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
    }

    public final void b(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        t91.a.f416567a.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "getAllInfoAsync");
        if (!f77960b) {
            uk0.a.b(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.o.f77934d, new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.p(callback));
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.n(callback), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
    }

    public final void c(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo info, yz5.l callback) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(callback, "callback");
        t91.a aVar = t91.a.f416567a;
        if (t91.a.f416568b) {
            com.tencent.mm.plugin.appbrand.debugger.console.n0.f77690a.b().logD(0L, null, null, null, 0, 0, 0L, 0L, "MicroMsg.AppBrandMonitoredBluetoothDeviceService: setInfoAsync");
        }
        if (!f77960b) {
            uk0.a.b(info, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.r.f77953d, new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.s(callback));
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.q(callback, info), "MicroMsg.AppBrandMonitoredBluetoothDeviceService");
    }

    public final void d(java.lang.String appId, java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "statWeAppConnectGattSuccess, appId: " + appId + ", deviceId: " + deviceId);
        if (!f77961c.contains(appId)) {
            aVar.a("MicroMsg.AppBrandMonitoredBluetoothDeviceService", "statWeAppConnectGattSuccess, we dont care");
        } else if (f77960b) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a.k(appId, deviceId);
        } else {
            uk0.a.c(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$WeAppConnectGattSuccessInfo(appId, deviceId), com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.t.f77957d, null, 4, null);
        }
    }
}
