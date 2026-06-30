package hq1;

/* loaded from: classes13.dex */
public class o extends android.bluetooth.BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq1.t f364707a;

    public o(hq1.t tVar) {
        this.f364707a = tVar;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onDataReceive------");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364707a.f364720i;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(8, bluetoothGattCharacteristic.getValue()))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 8);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onCharacteristicRead------ status = %d", java.lang.Integer.valueOf(i17));
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onDataWriteCallback------ status = %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364707a.f364720i;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50290x733c63a2(7, i17, 0))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 7);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt bluetoothGatt, int i17, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        hq1.t tVar = this.f364707a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onConnectionStateChange------ connect newState = %d, op status = %d, mConnectState = %d", valueOf, valueOf2, java.lang.Integer.valueOf(tVar.f364727p));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = tVar.f364720i;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50290x733c63a2(4, i18, 0))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 4);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onDescriptorWrite------ status = %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364707a.f364720i;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50291x733c63a2(6, i17, 0, bluetoothGatt))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 6);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(android.bluetooth.BluetoothGatt bluetoothGatt, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLESession", "------onServicesDiscovered------ status = %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f364707a.f364720i;
        if (n3Var.mo50308x2936bf5f(n3Var.mo50291x733c63a2(5, i17, 0, bluetoothGatt))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", 5);
    }
}
