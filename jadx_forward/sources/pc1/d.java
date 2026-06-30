package pc1;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public android.bluetooth.BluetoothAdapter f434873a;

    /* renamed from: d, reason: collision with root package name */
    public pc1.c f434876d;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f434874b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public java.util.UUID[] f434875c = null;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f434877e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f434878f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f434879g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final android.bluetooth.BluetoothAdapter.LeScanCallback f434880h = new pc1.b(this);

    public d() {
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BeaconManager", "bluetoothManager is null!");
            return;
        }
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f434873a = adapter;
        if (adapter == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BeaconManager", "bluetoothAdapter is null!");
        } else {
            pc1.e.f434883c = adapter.isEnabled();
        }
    }

    public boolean a() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "BeaconWorker:%d stop", java.lang.Integer.valueOf(hashCode()));
        synchronized (this) {
            z17 = this.f434877e;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BeaconManager", "BeaconWorker:%d, already stop", java.lang.Integer.valueOf(hashCode()));
            return false;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f434874b).clear();
        this.f434873a.stopLeScan(this.f434880h);
        this.f434877e = false;
        return true;
    }
}
