package vn1;

/* loaded from: classes7.dex */
public final class k extends android.bluetooth.le.ScanCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vn1.m f519742a;

    public k(vn1.m mVar) {
        this.f519742a = mVar;
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.BLE.BLEDeviceManager", "BLE scan failed with error code: " + i17);
        vn1.m mVar = this.f519742a;
        mVar.f519763r = false;
        vn1.a aVar = mVar.f519747b;
        if (aVar != null) {
            aVar.a(false);
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i17, android.bluetooth.le.ScanResult result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        super.onScanResult(i17, result);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "BLE scan result: " + result);
        android.bluetooth.BluetoothDevice device = result.getDevice();
        java.lang.String address = device.getAddress();
        java.lang.String name = device.getName();
        if (name == null) {
            name = "Unknown Device";
        }
        vn1.m mVar = this.f519742a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = mVar.f519749d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(address);
        concurrentHashMap.put(address, device);
        int rssi = result.getRssi();
        vn1.a aVar = mVar.f519747b;
        if (aVar != null) {
            aVar.d(address, name, rssi);
        }
    }
}
