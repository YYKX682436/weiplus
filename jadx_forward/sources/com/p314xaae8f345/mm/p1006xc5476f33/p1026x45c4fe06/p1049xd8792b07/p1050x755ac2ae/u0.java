package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0 f159495a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f159496b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.c1 f159497c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f159498d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f159499e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f159500f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f159501g;

    static {
        f06.v[] vVarArr = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.class, "trustAutoConnectWillBeCanceledAfterCallbackDisConnected", "getTrustAutoConnectWillBeCanceledAfterCallbackDisConnected()Z", 0))};
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0();
        f159495a = u0Var;
        boolean booleanValue = ((java.lang.Boolean) new nf.r(java.lang.Boolean.FALSE).b(u0Var, vVarArr[0])).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectWillBeCanceledAfterCallbackDisConnected: " + booleanValue);
        f159496b = booleanValue;
        f159498d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.r0.f159487d);
        f159499e = new java.util.concurrent.ConcurrentHashMap();
        f159500f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.t0.f159491d);
        f159501g = qb1.b.c();
    }

    public final boolean a(java.lang.String deviceId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1 gattConnectListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gattConnectListener, "gattConnectListener");
        t91.a aVar = t91.a.f498100a;
        aVar.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectGatt, deviceId: ".concat(deviceId));
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        android.bluetooth.BluetoothDevice remoteDevice = d17 != null ? d17.getRemoteDevice(deviceId) : null;
        if (remoteDevice == null) {
            aVar.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectGatt, bluetoothDevice is null");
            return false;
        }
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.s0 s0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.s0) ((jz5.n) f159500f).mo141623x754a37bb();
            s0Var.getClass();
            aVar.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "bindOnce, deviceId: ".concat(deviceId));
            s0Var.f159489a.put(deviceId, gattConnectListener);
            android.bluetooth.BluetoothGatt connectGatt = remoteDevice.connectGatt(context, true, s0Var, 2);
            if (connectGatt == null) {
                return false;
            }
            f159499e.put(deviceId, connectGatt);
            return true;
        } catch (java.lang.Exception e17) {
            t91.a.f498100a.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "autoConnectGatt, connectGattCompat fail since " + e17);
            return false;
        }
    }

    public final boolean b(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        t91.a aVar = t91.a.f498100a;
        aVar.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disAutoConnect, deviceId: ".concat(deviceId));
        android.bluetooth.BluetoothGatt bluetoothGatt = (android.bluetooth.BluetoothGatt) f159499e.remove(deviceId);
        if (bluetoothGatt == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.s0 s0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.s0) ((jz5.n) f159500f).mo141623x754a37bb();
        s0Var.getClass();
        aVar.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "unBind, deviceId: " + deviceId + ", originBond: " + (s0Var.f159489a.remove(deviceId) != null));
        try {
            ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.q0(bluetoothGatt));
        } catch (java.lang.Exception e17) {
            t91.a.f498100a.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disAutoConnect, disAutoConnect fail since " + e17);
        }
        return true;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.c1 c1Var) {
        f159497c = c1Var;
        if (c1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11857xff31332d c11857xff31332d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11857xff31332d) ((jz5.n) f159498d).mo141623x754a37bb();
            c11857xff31332d.getClass();
            t91.a.f498100a.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "enable#sysBluetoothStateChangeListener");
            c11857xff31332d.a();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context != null) {
                context.registerReceiver(c11857xff31332d, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11857xff31332d c11857xff31332d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.C11857xff31332d) ((jz5.n) f159498d).mo141623x754a37bb();
        c11857xff31332d2.getClass();
        t91.a.f498100a.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disable#sysBluetoothStateChangeListener");
        try {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context2 != null) {
                context2.unregisterReceiver(c11857xff31332d2);
            }
        } catch (java.lang.Exception e17) {
            t91.a.f498100a.b("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "disable#sysBluetoothStateChangeListener, unregister fail since " + e17);
        }
    }
}
