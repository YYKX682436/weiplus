package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1049xd8792b07.p1050x755ac2ae;

/* loaded from: classes7.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothGatt f159485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.bluetooth.BluetoothGatt bluetoothGatt) {
        super(0);
        this.f159485d = bluetoothGatt;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.bluetooth.BluetoothGatt bluetoothGatt = this.f159485d;
        bluetoothGatt.disconnect();
        bluetoothGatt.close();
        return jz5.f0.f384359a;
    }
}
