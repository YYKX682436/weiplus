package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0 f77962a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f77963b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.c1 f77964c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f77965d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f77966e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f77967f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f77968g;

    static {
        f06.v[] vVarArr = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.class, "trustAutoConnectWillBeCanceledAfterCallbackDisConnected", "getTrustAutoConnectWillBeCanceledAfterCallbackDisConnected()Z", 0))};
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0 u0Var = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0();
        f77962a = u0Var;
        boolean booleanValue = ((java.lang.Boolean) new nf.r(java.lang.Boolean.FALSE).b(u0Var, vVarArr[0])).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectWillBeCanceledAfterCallbackDisConnected: " + booleanValue);
        f77963b = booleanValue;
        f77965d = jz5.h.b(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.r0.f77954d);
        f77966e = new java.util.concurrent.ConcurrentHashMap();
        f77967f = jz5.h.b(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.t0.f77958d);
        f77968g = qb1.b.c();
    }

    public final boolean a(java.lang.String deviceId, com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1 gattConnectListener) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(gattConnectListener, "gattConnectListener");
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectGatt, deviceId: ".concat(deviceId));
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        android.bluetooth.BluetoothDevice remoteDevice = d17 != null ? d17.getRemoteDevice(deviceId) : null;
        if (remoteDevice == null) {
            aVar.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectGatt, bluetoothDevice is null");
            return false;
        }
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.s0 s0Var = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.s0) ((jz5.n) f77967f).getValue();
            s0Var.getClass();
            aVar.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "bindOnce, deviceId: ".concat(deviceId));
            s0Var.f77956a.put(deviceId, gattConnectListener);
            android.bluetooth.BluetoothGatt connectGatt = remoteDevice.connectGatt(context, true, s0Var, 2);
            if (connectGatt == null) {
                return false;
            }
            f77966e.put(deviceId, connectGatt);
            return true;
        } catch (java.lang.Exception e17) {
            t91.a.f416567a.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectGatt, connectGattCompat fail since " + e17);
            return false;
        }
    }

    public final boolean b(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        t91.a aVar = t91.a.f416567a;
        aVar.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disAutoConnect, deviceId: ".concat(deviceId));
        android.bluetooth.BluetoothGatt bluetoothGatt = (android.bluetooth.BluetoothGatt) f77966e.remove(deviceId);
        if (bluetoothGatt == null) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.s0 s0Var = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.s0) ((jz5.n) f77967f).getValue();
        s0Var.getClass();
        aVar.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "unBind, deviceId: " + deviceId + ", originBond: " + (s0Var.f77956a.remove(deviceId) != null));
        try {
            ym5.a1.f(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.q0(bluetoothGatt));
        } catch (java.lang.Exception e17) {
            t91.a.f416567a.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disAutoConnect, disAutoConnect fail since " + e17);
        }
        return true;
    }

    public final void c(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.c1 c1Var) {
        f77964c = c1Var;
        if (c1Var != null) {
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.BluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1 bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1 = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.BluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1) ((jz5.n) f77965d).getValue();
            bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1.getClass();
            t91.a.f416567a.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "enable#sysBluetoothStateChangeListener");
            bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1.a();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context != null) {
                context.registerReceiver(bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.BluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1 bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$12 = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.BluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$1) ((jz5.n) f77965d).getValue();
        bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$12.getClass();
        t91.a.f416567a.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disable#sysBluetoothStateChangeListener");
        try {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context2 != null) {
                context2.unregisterReceiver(bluetoothAbility4DeviceDiscovery$sysBluetoothStateChangeListener$2$12);
            }
        } catch (java.lang.Exception e17) {
            t91.a.f416567a.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disable#sysBluetoothStateChangeListener, unregister fail since " + e17);
        }
    }
}
