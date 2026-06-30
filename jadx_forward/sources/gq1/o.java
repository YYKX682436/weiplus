package gq1;

/* loaded from: classes13.dex */
public class o implements gq1.a, u32.a1, android.bluetooth.BluetoothAdapter.LeScanCallback {

    /* renamed from: w, reason: collision with root package name */
    public static boolean f356051w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f356052x;

    /* renamed from: d, reason: collision with root package name */
    public final gq1.c f356053d;

    /* renamed from: e, reason: collision with root package name */
    public final gq1.a f356054e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f356055f;

    /* renamed from: h, reason: collision with root package name */
    public final android.bluetooth.BluetoothAdapter f356057h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f356058i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f356056g = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f356059m = true;

    /* renamed from: n, reason: collision with root package name */
    public int f356060n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f356061o = "";

    /* renamed from: p, reason: collision with root package name */
    public gq1.d f356062p = null;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f356063q = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f356064r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(u32.i1.a().f505843b.mo50284xdd3e8650(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new gq1.f(this), true);

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f356065s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(u32.i1.a().f505843b.mo50284xdd3e8650(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new gq1.g(this), true);

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f356066t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(u32.i1.a().f505843b.mo50284xdd3e8650(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new gq1.h(this), true);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f356067u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(u32.i1.a().f505843b.mo50284xdd3e8650(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new gq1.i(this), true);

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f356068v = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(u32.i1.a().f505843b.mo50284xdd3e8650(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new gq1.j(this), true);

    public o(gq1.a aVar) {
        if (aVar == null) {
            throw new java.lang.NullPointerException("aCallback is null");
        }
        this.f356055f = new java.util.HashSet();
        this.f356053d = new gq1.c(this);
        this.f356054e = aVar;
        this.f356058i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(u32.i1.a().f505843b.mo50284xdd3e8650());
        this.f356057h = ((android.bluetooth.BluetoothManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("bluetooth")).getAdapter();
    }

    @Override // u32.a1
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconServer", "------onScanError------ error code = %s, error msg = %s", java.lang.Integer.valueOf(i17), str);
    }

    @Override // u32.a1
    public void b(java.lang.String str, java.lang.String str2, int i17, int i18, byte[] bArr) {
        a42.i.a(bArr);
        if (i17 != 0) {
            return;
        }
        gq1.d dVar = new gq1.d();
        if (dVar.a(bArr)) {
            java.util.UUID j17 = a42.i.j(dVar.f356033b.f356070c);
            if (j17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
            } else if (this.f356055f.contains(j17)) {
                if (this.f356059m) {
                    this.f356061o = str;
                }
                this.f356058i.mo50293x3498a0(new gq1.m(this, i18, str, dVar));
            }
        }
    }

    @Override // u32.a1
    public void c(int i17) {
        if (i17 != 0) {
            return;
        }
        e();
    }

    @Override // gq1.a
    public void d(double d17, gq1.b bVar) {
        java.lang.String a17 = a42.i.a(bVar.f356027a.f356033b.f356070c);
        if (a17.length() >= 32) {
            a17 = a17.substring(0, 8) + "-" + a17.substring(8, 12) + "-" + a17.substring(12, 16) + "-" + a17.substring(16, 20) + "-" + a17.substring(20);
        }
        java.lang.String str = a17 + ((int) bVar.f356027a.f356033b.f356071d) + ((int) bVar.f356027a.f356033b.f356072e);
        java.util.Map map = this.f356063q;
        boolean containsKey = ((java.util.concurrent.ConcurrentHashMap) map).containsKey(str);
        gq1.a aVar = this.f356054e;
        if (containsKey) {
            long longValue = ((java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) map).get(str)).longValue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - longValue > 500) {
                ((java.util.concurrent.ConcurrentHashMap) map).put(str, java.lang.Long.valueOf(currentTimeMillis));
                aVar.d(d17, bVar);
                return;
            }
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        aVar.d(d17, bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]onRangingCallback,uuid = " + a17 + ",major = " + ((int) bVar.f356027a.f356033b.f356071d) + ",minor = " + (bVar.f356027a.f356033b.f356072e & 65535));
    }

    public final void e() {
        android.bluetooth.BluetoothAdapter bluetoothAdapter;
        ((java.util.concurrent.ConcurrentHashMap) this.f356063q).clear();
        f356051w = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f356067u;
        if (!b4Var.e()) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f356066t;
        if (!b4Var2.e()) {
            b4Var2.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = this.f356065s;
        if (!b4Var3.e()) {
            b4Var3.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var4 = this.f356064r;
        if (!b4Var4.e()) {
            b4Var4.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var5 = this.f356068v;
        if (!b4Var5.e()) {
            b4Var5.d();
        }
        if (!this.f356056g || (bluetoothAdapter = this.f356057h) == null) {
            return;
        }
        if (bluetoothAdapter != null) {
            bluetoothAdapter.stopLeScan(this);
        }
        this.f356056g = false;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        gq1.d dVar = new gq1.d();
        if (dVar.a(bArr)) {
            java.util.UUID j17 = a42.i.j(dVar.f356033b.f356070c);
            if (j17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
                return;
            }
            if (this.f356055f.contains(j17)) {
                if (this.f356059m) {
                    this.f356060n = i17;
                    this.f356062p = dVar;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f356064r;
                    if (b4Var.e()) {
                        b4Var.c(2000L, 2000L);
                    }
                    this.f356059m = false;
                }
                this.f356058i.mo50293x3498a0(new gq1.n(this, i17, bluetoothDevice, dVar));
            }
        }
    }
}
