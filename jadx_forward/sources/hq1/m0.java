package hq1;

/* loaded from: classes7.dex */
public class m0 extends android.bluetooth.le.ScanCallback {

    /* renamed from: g, reason: collision with root package name */
    public static hq1.m0 f364693g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f364694a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f364695b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f364696c;

    /* renamed from: d, reason: collision with root package name */
    public final android.bluetooth.BluetoothManager f364697d;

    /* renamed from: e, reason: collision with root package name */
    public android.bluetooth.le.BluetoothLeScanner f364698e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f364699f;

    public m0(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NewBluetoothLEScanner", "No context for scanner");
            return;
        }
        this.f364694a = context;
        this.f364695b = new java.util.ArrayList();
        this.f364696c = false;
        this.f364698e = null;
        this.f364699f = null;
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) context.getSystemService("bluetooth");
        this.f364697d = bluetoothManager;
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager.getAdapter();
        if (adapter != null) {
            this.f364698e = adapter.getBluetoothLeScanner();
        }
        this.f364699f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("NewBluetoothLEScannerThread");
    }

    public final boolean a(hq1.l0 l0Var) {
        java.util.ArrayList arrayList;
        int i17 = 0;
        if (l0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NewBluetoothLEScanner", "callback is null");
            return false;
        }
        while (true) {
            arrayList = this.f364695b;
            if (i17 >= arrayList.size()) {
                i17 = -1;
                break;
            }
            if (((hq1.l0) arrayList.get(i17)) == l0Var) {
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return arrayList.add(l0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.NewBluetoothLEScanner", "callback has in queue. pass");
        return true;
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onBatchScanResults(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                android.bluetooth.le.ScanResult scanResult = (android.bluetooth.le.ScanResult) it.next();
                scanResult.getDevice().getAddress();
                scanResult.getDevice().getName();
                a42.i.a(scanResult.getScanRecord().getBytes());
            }
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i17) {
        this.f364699f.mo50293x3498a0(new hq1.k0(this, i17));
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i17, android.bluetooth.le.ScanResult scanResult) {
        if (scanResult == null || scanResult.getScanRecord() == null) {
            return;
        }
        scanResult.getDevice().getAddress();
        scanResult.getDevice().getName();
        a42.i.a(scanResult.getScanRecord().getBytes());
        this.f364695b.size();
        this.f364699f.mo50293x3498a0(new hq1.j0(this, scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord().getBytes()));
    }
}
