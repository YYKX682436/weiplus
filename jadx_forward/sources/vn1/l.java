package vn1;

/* loaded from: classes7.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vn1.m f519743d;

    public l(vn1.m mVar) {
        this.f519743d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vn1.m mVar = this.f519743d;
        android.bluetooth.BluetoothAdapter e17 = mVar.e();
        if (!(e17 != null && e17.isEnabled())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.BLE.BLEDeviceManager", "Bluetooth is not enabled");
            return;
        }
        java.util.List c17 = kz5.b0.c(new android.bluetooth.le.ScanFilter.Builder().setServiceUuid(new android.os.ParcelUuid(vn1.m.f519744w)).build());
        android.bluetooth.le.ScanSettings build = new android.bluetooth.le.ScanSettings.Builder().setScanMode(2).setCallbackType(2).setMatchMode(1).build();
        try {
            android.bluetooth.le.BluetoothLeScanner bluetoothLeScanner = (android.bluetooth.le.BluetoothLeScanner) ((jz5.n) mVar.f519753h).mo141623x754a37bb();
            if (bluetoothLeScanner != null) {
                vn1.k kVar = mVar.f519765t;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(kVar);
                arrayList.add(build);
                arrayList.add(c17);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(bluetoothLeScanner, arrayList.toArray(), "com/tencent/mm/plugin/backup/ble/BLEDeviceManager", "realStartScanning", "()V", "android/bluetooth/le/BluetoothLeScanner", "startScan", "(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V");
            }
            mVar.f519763r = true;
            vn1.a aVar = mVar.f519747b;
            if (aVar != null) {
                aVar.a(true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "Real start scanning executed");
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.BLE.BLEDeviceManager", "Start scan failed: " + e18.getMessage());
            vn1.a aVar2 = mVar.f519747b;
            if (aVar2 != null) {
                aVar2.a(false);
            }
        }
    }
}
