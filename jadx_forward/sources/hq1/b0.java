package hq1;

/* loaded from: classes13.dex */
public class b0 extends android.bluetooth.BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq1.h0 f364626a;

    public b0(hq1.h0 h0Var) {
        this.f364626a = h0Var;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataReceive------");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364626a.f364649g;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(8, bluetoothGattCharacteristic))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 8);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onCharacteristicRead------ status = %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364626a.f364649g;
            if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(8, bluetoothGattCharacteristic))) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 8);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataWriteCallback------ status = %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364626a.f364649g;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50290x733c63a2(7, i17, 0))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 7);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onConnectionStateChange------ connect newState = %d, op status = %d, mConnectState = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f364626a.f364656n));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364626a.f364649g;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50290x733c63a2(4, i18, 0))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 4);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDescriptorWrite------ status = %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364626a.f364649g;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50291x733c63a2(6, i17, 0, bluetoothGatt))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 6);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onServicesDiscovered------ status = %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364626a.f364649g;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50291x733c63a2(5, i17, 0, bluetoothGatt))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", 5);
    }
}
