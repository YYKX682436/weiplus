package hq1;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f364684h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hq1.m f364685i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hq1.n f364686j;

    public k(hq1.n nVar, boolean z17, hq1.m mVar) {
        this.f364686j = nVar;
        this.f364684h = z17;
        this.f364685i = mVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        boolean hasSystemFeature;
        hq1.n nVar = this.f364686j;
        android.content.Context context = nVar.f364701d;
        boolean z17 = false;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "not found context");
            hasSystemFeature = false;
        } else {
            hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        }
        if (hasSystemFeature) {
            android.bluetooth.BluetoothAdapter bluetoothAdapter = nVar.f364704g;
            if (bluetoothAdapter == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "not found BluetoothAdapter");
            } else {
                java.util.ArrayList arrayList = nVar.f364702e;
                boolean z18 = this.f364684h;
                hq1.m mVar = this.f364685i;
                if (z18) {
                    if (nVar.f364703f) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothLEScaner", "ble has scan. just add callback and return");
                        nVar.a(mVar);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEScaner", "[BluetoothTrace] start scan");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.BluetoothLEScaner", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                        android.bluetooth.BluetoothAdapter bluetoothAdapter2 = nVar.f364704g;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(nVar);
                        java.util.Collections.reverse(arrayList2);
                        boolean booleanValue = ((java.lang.Boolean) yj0.a.k(bluetoothAdapter2, arrayList2.toArray(), "com/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner", "scanImpl", "(ZLcom/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner$BLEScanCallback;)Z", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue();
                        if (booleanValue) {
                            nVar.f364703f = true;
                            nVar.a(mVar);
                        } else if (arrayList.size() <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed and callbacklist size is 0,start retry,and bluetooth state is(12 is on ,10 is off): " + bluetoothAdapter.getState());
                            for (int i17 = 0; !booleanValue && i17 < 3; i17++) {
                                bluetoothAdapter.stopLeScan(nVar);
                                nVar.f364703f = false;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed,retry no " + i17 + " time");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEScaner", "[BluetoothTrace] start scan");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.BluetoothLEScaner", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                                android.bluetooth.BluetoothAdapter bluetoothAdapter3 = nVar.f364704g;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                arrayList3.add(nVar);
                                java.util.Collections.reverse(arrayList3);
                                booleanValue = ((java.lang.Boolean) yj0.a.k(bluetoothAdapter3, arrayList3.toArray(), "com/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner", "scanImpl", "(ZLcom/tencent/mm/plugin/bluetooth/sdk/ble/BluetoothLEScaner$BLEScanCallback;)Z", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue();
                                if (booleanValue) {
                                    nVar.f364703f = true;
                                    nVar.a(mVar);
                                }
                            }
                        } else if (bluetoothAdapter.getState() == 12) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed when bluetooth state is on.");
                            nVar.f364703f = true;
                            nVar.a(mVar);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "start BLE scan failed");
                        }
                        z17 = booleanValue;
                    }
                } else if (nVar.f364703f) {
                    if (mVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "callback is null");
                    } else {
                        arrayList.remove(mVar);
                    }
                    if (mVar != null) {
                        mVar.a();
                    }
                    if (arrayList.size() <= 0) {
                        bluetoothAdapter.stopLeScan(nVar);
                        nVar.f364703f = false;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothLEScaner", "scan haven't started. just return, callback size = %d", java.lang.Integer.valueOf(arrayList.size()));
                }
                z17 = true;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "this phone is not support BLE");
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
