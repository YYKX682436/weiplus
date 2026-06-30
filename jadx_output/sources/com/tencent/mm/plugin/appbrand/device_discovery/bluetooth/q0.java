package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothGatt f77952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.bluetooth.BluetoothGatt bluetoothGatt) {
        super(0);
        this.f77952d = bluetoothGatt;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f77952d;
        bluetoothGatt.disconnect();
        bluetoothGatt.close();
        return jz5.f0.f302826a;
    }
}
