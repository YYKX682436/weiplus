package gq1;

/* loaded from: classes13.dex */
public class g implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq1.o f356036d;

    public g(gq1.o oVar) {
        this.f356036d = oVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.lang.Boolean bool;
        gq1.o oVar = this.f356036d;
        if (oVar.f356055f.size() > 0) {
            if (oVar.f356057h != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.IBeaconServer", "[BluetoothTrace] start scan");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.IBeaconServer", new java.lang.Throwable(), "[BluetoothTrace] ble scan stacktrace", new java.lang.Object[0]);
                android.bluetooth.BluetoothAdapter bluetoothAdapter = oVar.f356057h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(oVar);
                java.util.Collections.reverse(arrayList);
                bool = java.lang.Boolean.valueOf(((java.lang.Boolean) yj0.a.k(bluetoothAdapter, arrayList.toArray(), "com/tencent/mm/plugin/bluetooth/sdk/IBeacon/IBeaconServer", "startScan4SelfAdaption", "()Ljava/lang/Boolean;", "android/bluetooth/BluetoothAdapter", "startLeScan", "(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)Z")).booleanValue());
            } else {
                bool = java.lang.Boolean.FALSE;
            }
            bool.booleanValue();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).getBoolean("isNewScanning", false);
            gq1.o.f356052x = z17;
            if (!z17) {
                if (!oVar.f356066t.e()) {
                    oVar.f356066t.d();
                }
                if (!oVar.f356065s.e()) {
                    oVar.f356065s.d();
                }
            }
        }
        return false;
    }
}
