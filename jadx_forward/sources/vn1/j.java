package vn1;

/* loaded from: classes7.dex */
public final class j extends android.bluetooth.BluetoothGattServerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vn1.m f519741a;

    public j(vn1.m mVar) {
        this.f519741a = mVar;
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onCharacteristicWriteRequest(android.bluetooth.BluetoothDevice device, int i17, android.bluetooth.BluetoothGattCharacteristic characteristic, boolean z17, boolean z18, int i18, byte[] value) {
        android.bluetooth.BluetoothGattServer bluetoothGattServer;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(characteristic, "characteristic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        super.onCharacteristicWriteRequest(device, i17, characteristic, z17, z18, i18, value);
        java.util.UUID uuid = characteristic.getUuid();
        vn1.m mVar = this.f519741a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uuid, mVar.f519748c)) {
            java.lang.String address = device.getAddress();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(address, "getAddress(...)");
            vn1.m.a(mVar, address, value);
            if (!z18 || (bluetoothGattServer = mVar.f519755j) == null) {
                return;
            }
            bluetoothGattServer.sendResponse(device, i17, 0, i18, value);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothDevice device, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        super.onConnectionStateChange(device, i17, i18);
        java.lang.String address = device.getAddress();
        vn1.m mVar = this.f519741a;
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "Server: Central disconnected: " + address);
            mVar.f519758m.remove(address);
            mVar.f519762q.remove(address);
            vn1.a aVar = mVar.f519747b;
            if (aVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(address);
                aVar.c(address);
                return;
            }
            return;
        }
        if (i18 != 2) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "Server: Central connected: " + address);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = mVar.f519758m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(address);
        concurrentHashMap.put(address, device);
        vn1.a aVar2 = mVar.f519747b;
        if (aVar2 != null) {
            aVar2.e(address);
        }
    }

    @Override // android.bluetooth.BluetoothGattServerCallback
    public void onNotificationSent(android.bluetooth.BluetoothDevice bluetoothDevice, int i17) {
        super.onNotificationSent(bluetoothDevice, i17);
        this.f519741a.g();
    }
}
