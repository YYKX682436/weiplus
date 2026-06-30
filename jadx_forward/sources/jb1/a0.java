package jb1;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public android.bluetooth.BluetoothGattServer f380222b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f380223c;

    /* renamed from: g, reason: collision with root package name */
    public jb1.b f380227g;

    /* renamed from: a, reason: collision with root package name */
    public jb1.e0 f380221a = jb1.e0.f380243d;

    /* renamed from: d, reason: collision with root package name */
    public int f380224d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f380225e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f380226f = new java.util.HashMap();

    public final android.bluetooth.BluetoothGattServer a() {
        android.bluetooth.BluetoothGattServer bluetoothGattServer = this.f380222b;
        if (bluetoothGattServer != null) {
            return bluetoothGattServer;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gattServer");
        throw null;
    }

    public final void b(java.util.UUID serviceId, java.util.UUID characteristicId, boolean z17, int i17, java.lang.String base64Value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceId, "serviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(characteristicId, "characteristicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base64Value, "base64Value");
        if (qb1.a.d("android.permission.BLUETOOTH_CONNECT")) {
            try {
                android.bluetooth.BluetoothGattService service = a().getService(serviceId);
                if (service == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: server == null");
                    return;
                }
                android.bluetooth.BluetoothGattCharacteristic characteristic = service.getCharacteristic(characteristicId);
                if (characteristic == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: characteristic == null");
                    return;
                }
                characteristic.setValue(qb1.b.a(android.util.Base64.decode(base64Value, 2)));
                if (z17) {
                    jb1.b bVar = this.f380227g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
                    java.util.Iterator it = bVar.f380228a.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: notifyCharacteristicChanged res = %s", java.lang.String.valueOf(a().notifyCharacteristicChanged((android.bluetooth.BluetoothDevice) it.next(), characteristic, false)));
                    }
                } else {
                    jb1.b bVar2 = this.f380227g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar2);
                    java.util.Iterator it6 = bVar2.f380228a.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: notifyCharacteristicChanged res = %s", java.lang.String.valueOf(a().notifyCharacteristicChanged((android.bluetooth.BluetoothDevice) it6.next(), characteristic, true)));
                    }
                }
                jb1.b bVar3 = this.f380227g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar3);
                jb1.x xVar = (jb1.x) ((java.util.concurrent.ConcurrentHashMap) bVar3.f380229b).get(java.lang.Integer.valueOf(i17));
                if (xVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: #" + i17 + " callbackId -> pendingResp is null");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: device = %s, requestId = %s", xVar.f380280a.toString(), java.lang.String.valueOf(xVar.f380281b));
                if (!a().sendResponse(xVar.f380280a, xVar.f380281b, 0, xVar.f380282c, characteristic.getValue())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BLE.PeripheralBleServer", "sendPendingRespFail");
                }
                jb1.b bVar4 = this.f380227g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar4);
                ((java.util.concurrent.ConcurrentHashMap) bVar4.f380229b).remove(java.lang.Integer.valueOf(i17));
            } catch (java.lang.SecurityException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BLE.PeripheralBleServer", "handleCharacteristicWriteAction: " + e17.getMessage());
            }
        }
    }

    public final void c() {
        java.util.Map map;
        ((java.util.HashMap) this.f380226f).clear();
        try {
            if (this.f380222b != null) {
                a().close();
            }
        } catch (java.lang.SecurityException unused) {
        }
        android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
        if (d17 != null) {
            d(d17);
        }
        jb1.b bVar = this.f380227g;
        if (bVar != null && (map = bVar.f380229b) != null) {
            ((java.util.concurrent.ConcurrentHashMap) map).clear();
        }
        this.f380227g = null;
        this.f380221a = jb1.e0.f380246g;
    }

    public final void d(android.bluetooth.BluetoothAdapter adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        android.bluetooth.le.BluetoothLeAdvertiser bluetoothLeAdvertiser = adapter.getBluetoothLeAdvertiser();
        if (bluetoothLeAdvertiser == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.CopyOnWriteArrayList<android.bluetooth.le.AdvertiseCallback> copyOnWriteArrayList = this.f380225e;
        for (android.bluetooth.le.AdvertiseCallback advertiseCallback : copyOnWriteArrayList) {
            try {
                bluetoothLeAdvertiser.stopAdvertising(advertiseCallback);
            } catch (java.lang.SecurityException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BLE.PeripheralBleServer", "stopAdvertising: " + e17.getMessage());
            }
            arrayList.add(advertiseCallback);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.remove((android.bluetooth.le.AdvertiseCallback) it.next());
        }
    }
}
