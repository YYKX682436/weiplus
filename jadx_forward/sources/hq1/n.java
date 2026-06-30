package hq1;

/* loaded from: classes7.dex */
public class n implements android.bluetooth.BluetoothAdapter.LeScanCallback {

    /* renamed from: i, reason: collision with root package name */
    public static hq1.n f364700i;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f364701d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f364702e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f364703f;

    /* renamed from: g, reason: collision with root package name */
    public final android.bluetooth.BluetoothAdapter f364704g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f364705h;

    public n(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "no context for scaner");
            return;
        }
        this.f364701d = context;
        this.f364702e = new java.util.ArrayList();
        this.f364703f = false;
        this.f364704g = null;
        this.f364705h = null;
        this.f364704g = ((android.bluetooth.BluetoothManager) context.getSystemService("bluetooth")).getAdapter();
        this.f364705h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("BluetoothLEScanerThread");
    }

    public final boolean a(hq1.m mVar) {
        java.util.ArrayList arrayList;
        int i17 = 0;
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEScaner", "callback is null");
            return false;
        }
        while (true) {
            arrayList = this.f364702e;
            if (i17 >= arrayList.size()) {
                i17 = -1;
                break;
            }
            if (((hq1.m) arrayList.get(i17)) == mVar) {
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return arrayList.add(mVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.BluetoothLEScaner", "callback has in queue. pass");
        return true;
    }

    public boolean b(boolean z17, hq1.m mVar) {
        java.lang.Boolean bool = (java.lang.Boolean) new hq1.k(this, z17, mVar).a(this.f364705h);
        iz5.a.g(null, bool != null);
        return bool.booleanValue();
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        bluetoothDevice.getAddress();
        bluetoothDevice.getName();
        a42.i.a(bArr);
        this.f364702e.size();
        this.f364705h.mo50293x3498a0(new hq1.l(this, bluetoothDevice, i17, bArr));
    }
}
