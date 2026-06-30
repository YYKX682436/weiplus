package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class s0 extends android.bluetooth.BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f77956a = new java.util.concurrent.ConcurrentHashMap();

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        android.bluetooth.BluetoothDevice device;
        java.lang.Boolean bool = null;
        java.lang.String address = (bluetoothGatt == null || (device = bluetoothGatt.getDevice()) == null) ? null : device.getAddress();
        t91.a.f416567a.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "onConnectionStateChange, gatt(" + address + "), status: " + i17 + ", newState: " + i18);
        if (address == null) {
            return;
        }
        if (2 == i18) {
            bool = java.lang.Boolean.TRUE;
        } else if (i18 == 0) {
            bool = java.lang.Boolean.FALSE;
        }
        if (bool != null) {
            bool.booleanValue();
            boolean z17 = i17 == 0;
            boolean booleanValue = bool.booleanValue();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f77956a;
            if (booleanValue && z17) {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1 d1Var = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1) concurrentHashMap.get(address);
                if (d1Var != null) {
                    d1Var.a(address, bool.booleanValue());
                    return;
                }
                return;
            }
            if (!bool.booleanValue() && !z17) {
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1 d1Var2 = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.d1) concurrentHashMap.get(address);
                if (d1Var2 != null) {
                    d1Var2.a(address, bool.booleanValue());
                }
                com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a.getClass();
                if (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77963b) {
                    concurrentHashMap.remove(address);
                    android.bluetooth.BluetoothGatt bluetoothGatt2 = (android.bluetooth.BluetoothGatt) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77966e.remove(address);
                    if (bluetoothGatt2 != null) {
                        ym5.a1.f(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.q0(bluetoothGatt2));
                        return;
                    }
                    return;
                }
                return;
            }
            if ((!bool.booleanValue() || z17) && (bool.booleanValue() || !z17)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77962a.getClass();
            if (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77963b) {
                concurrentHashMap.remove(address);
                android.bluetooth.BluetoothGatt bluetoothGatt3 = (android.bluetooth.BluetoothGatt) com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.u0.f77966e.remove(address);
                if (bluetoothGatt3 != null) {
                    ym5.a1.f(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.q0(bluetoothGatt3));
                }
            }
        }
    }
}
