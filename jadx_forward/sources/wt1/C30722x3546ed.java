package wt1;

/* renamed from: wt1.t$$a */
/* loaded from: classes13.dex */
public final /* synthetic */ class C30722x3546ed implements wt1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt1.t f530886a;

    public final void a(boolean z17) {
        wt1.t tVar = this.f530886a;
        tVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "onRequestPermissionResult, granted: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "[BluetoothTrace] start scan");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardLbsOrBluetooth", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
            android.bluetooth.BluetoothAdapter bluetoothAdapter = tVar.f530878b;
            android.bluetooth.BluetoothAdapter.LeScanCallback leScanCallback = tVar.f530884h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(leScanCallback);
            java.util.Collections.reverse(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "startLeScan isOK:%b", java.lang.Boolean.valueOf(((java.lang.Boolean) yj0.a.k(bluetoothAdapter, arrayList.toArray(), "com/tencent/mm/plugin/card/mgr/CardLbsOrBluetoothInfoManager$BluetoothHelper", "lambda$startScanBluetooth$0", "(Z)V", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue()));
            tVar.f530877a = true;
        }
    }
}
