package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class s0 extends android.bluetooth.BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f159489a = new java.util.concurrent.ConcurrentHashMap();

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        android.bluetooth.BluetoothDevice device;
        java.lang.Boolean bool = null;
        java.lang.String address = (bluetoothGatt == null || (device = bluetoothGatt.getDevice()) == null) ? null : device.getAddress();
        t91.a.f498100a.a("MicroMsg.AppBrand.BluetoothAbility4DeviceDiscovery", "onConnectionStateChange, gatt(" + address + "), status: " + i17 + ", newState: " + i18);
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
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f159489a;
            if (booleanValue && z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1) concurrentHashMap.get(address);
                if (d1Var != null) {
                    d1Var.a(address, bool.booleanValue());
                    return;
                }
                return;
            }
            if (!bool.booleanValue() && !z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1 d1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.d1) concurrentHashMap.get(address);
                if (d1Var2 != null) {
                    d1Var2.a(address, bool.booleanValue());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159495a.getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159496b) {
                    concurrentHashMap.remove(address);
                    android.bluetooth.BluetoothGatt bluetoothGatt2 = (android.bluetooth.BluetoothGatt) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159499e.remove(address);
                    if (bluetoothGatt2 != null) {
                        ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.q0(bluetoothGatt2));
                        return;
                    }
                    return;
                }
                return;
            }
            if ((!bool.booleanValue() || z17) && (bool.booleanValue() || !z17)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159495a.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159496b) {
                concurrentHashMap.remove(address);
                android.bluetooth.BluetoothGatt bluetoothGatt3 = (android.bluetooth.BluetoothGatt) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.u0.f159499e.remove(address);
                if (bluetoothGatt3 != null) {
                    ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae.q0(bluetoothGatt3));
                }
            }
        }
    }
}
