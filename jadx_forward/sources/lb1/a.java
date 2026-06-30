package lb1;

/* loaded from: classes13.dex */
public class a extends android.bluetooth.BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final lb1.l f399230a;

    public a(lb1.l lVar) {
        this.f399230a = lVar;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f399230a.d(bluetoothGatt, bluetoothGattCharacteristic);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        this.f399230a.e(bluetoothGatt, bluetoothGattCharacteristic, i17);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        this.f399230a.g(bluetoothGatt, bluetoothGattCharacteristic, i17);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        this.f399230a.i(bluetoothGatt, i17, i18);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        this.f399230a.b(bluetoothGatt, bluetoothGattDescriptor, i17);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        this.f399230a.c(bluetoothGatt, bluetoothGattDescriptor, i17);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        this.f399230a.a(bluetoothGatt, i17, i18);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onReadRemoteRssi(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        this.f399230a.h(bluetoothGatt, i17, i18);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onReliableWriteCompleted(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        this.f399230a.f(bluetoothGatt, i17);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        this.f399230a.j(bluetoothGatt, i17);
    }
}
