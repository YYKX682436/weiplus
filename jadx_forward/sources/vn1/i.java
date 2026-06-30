package vn1;

/* loaded from: classes7.dex */
public final class i extends android.bluetooth.BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vn1.m f519740a;

    public i(vn1.m mVar) {
        this.f519740a = mVar;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothGattCharacteristic characteristic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gatt, "gatt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(characteristic, "characteristic");
        java.util.UUID uuid = characteristic.getUuid();
        vn1.m mVar = this.f519740a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uuid, mVar.f519748c)) {
            java.lang.String address = gatt.getDevice().getAddress();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(address, "getAddress(...)");
            byte[] value = characteristic.getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "getValue(...)");
            vn1.m.a(mVar, address, value);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, int i17) {
        this.f519740a.g();
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt gatt, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gatt, "gatt");
        java.lang.String address = gatt.getDevice().getAddress();
        if (i18 != 0) {
            if (i18 != 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "Client: Connected to " + address + ", discovering...");
            gatt.discoverServices();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "Client: Disconnected from " + address);
        vn1.m mVar = this.f519740a;
        mVar.f519756k.remove(address);
        mVar.f519757l.remove(address);
        mVar.f519762q.remove(address);
        vn1.a aVar = mVar.f519747b;
        if (aVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(address);
            aVar.c(address);
        }
        gatt.close();
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt bluetoothGatt, android.bluetooth.BluetoothGattDescriptor bluetoothGattDescriptor, int i17) {
        android.bluetooth.BluetoothDevice device;
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i17);
        if (i17 == 0) {
            java.lang.String str = null;
            java.util.UUID uuid = bluetoothGattDescriptor != null ? bluetoothGattDescriptor.getUuid() : null;
            java.util.UUID uuid2 = vn1.m.f519744w;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uuid, vn1.m.f519745x)) {
                if (bluetoothGatt != null && (device = bluetoothGatt.getDevice()) != null) {
                    str = device.getAddress();
                }
                if (str == null) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "CCCD written successfully. iOS should now receive didSubscribe.");
                vn1.a aVar = this.f519740a.f519747b;
                if (aVar != null) {
                    aVar.e(str);
                }
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gatt, "gatt");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "Client: Services discovered: " + i17);
        if (i17 == 0) {
            java.util.UUID uuid = vn1.m.f519744w;
            android.bluetooth.BluetoothGattService service = gatt.getService(vn1.m.f519744w);
            vn1.m mVar = this.f519740a;
            android.bluetooth.BluetoothGattCharacteristic characteristic = service != null ? service.getCharacteristic(mVar.f519748c) : null;
            if (characteristic != null) {
                java.lang.String address = gatt.getDevice().getAddress();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = mVar.f519757l;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(address);
                concurrentHashMap.put(address, characteristic);
                gatt.setCharacteristicNotification(characteristic, true);
                android.bluetooth.BluetoothGattDescriptor descriptor = characteristic.getDescriptor(vn1.m.f519745x);
                if (descriptor == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.BLE.BLEDeviceManager", "Could not find CCCD descriptor for characteristic");
                    return;
                }
                descriptor.setValue(android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "Writing CCCD to iOS: " + gatt.writeDescriptor(descriptor));
            }
        }
    }
}
