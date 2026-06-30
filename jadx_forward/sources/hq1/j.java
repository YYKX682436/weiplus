package hq1;

/* loaded from: classes13.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f364671d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f364672e;

    /* renamed from: h, reason: collision with root package name */
    public hq1.n f364675h;

    /* renamed from: i, reason: collision with root package name */
    public hq1.m0 f364676i;

    /* renamed from: a, reason: collision with root package name */
    public hq1.h f364668a = null;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f364669b = null;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f364670c = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f364673f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f364674g = false;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f364677j = new java.util.HashSet();

    /* renamed from: k, reason: collision with root package name */
    public final hq1.m f364678k = new hq1.d(this);

    /* renamed from: l, reason: collision with root package name */
    public final hq1.l0 f364679l = new hq1.g(this);

    public j(java.lang.String str) {
        this.f364671d = null;
        this.f364672e = null;
        this.f364672e = new hq1.b(this);
        this.f364671d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(str);
    }

    public static void a(hq1.j jVar, android.bluetooth.BluetoothDevice bluetoothDevice, int i17, byte[] bArr) {
        java.util.HashSet hashSet = jVar.f364677j;
        if (!hashSet.isEmpty()) {
            long h17 = a42.i.h(bluetoothDevice.getAddress());
            if (hashSet.contains(java.lang.Long.valueOf(h17))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "------onConnectPreScanFound------ sessionid = %d", java.lang.Long.valueOf(h17));
                hq1.t tVar = (hq1.t) jVar.f364670c.get(java.lang.String.valueOf(h17));
                if (tVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "null == les");
                    hq1.h hVar = jVar.f364668a;
                    if (hVar != null) {
                        hVar.a(h17, false);
                    }
                } else if (!tVar.b()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "les.connect() Failed!!!");
                    hq1.h hVar2 = jVar.f364668a;
                    if (hVar2 != null) {
                        hVar2.a(h17, false);
                    }
                }
                hashSet.remove(java.lang.Long.valueOf(h17));
                if (hashSet.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "Connect PreScan is done.");
                }
            }
        }
        hq1.h hVar3 = jVar.f364668a;
        if (hVar3 != null) {
            iz5.a.g(null, kq1.n.a(((kq1.e) hVar3).f392773a, 3, 0, 0, new kq1.l(bluetoothDevice.getAddress(), bluetoothDevice.getName(), i17, bArr)));
        }
    }

    public final boolean b(boolean z17) {
        hq1.m0 m0Var;
        if (!fp.h.c(21) || (m0Var = this.f364676i) == null) {
            hq1.n nVar = this.f364675h;
            if (nVar != null) {
                return nVar.b(z17, this.f364678k);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "Scanner is null");
            return false;
        }
        hq1.l0 l0Var = this.f364679l;
        m0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NewBluetoothLEScanner", "(API21)execute scan");
        java.lang.Boolean bool = (java.lang.Boolean) new hq1.i0(m0Var, z17, l0Var).a(m0Var.f364699f);
        iz5.a.g(null, bool != null);
        return bool.booleanValue();
    }

    public boolean c() {
        iz5.a.g(null, this.f364674g);
        return this.f364669b.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public boolean d(boolean z17, int... iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "------scanLEDevice------".concat(z17 ? "true" : "false"));
        iz5.a.g(null, this.f364674g);
        if (!c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "BLE Unsupport");
            return false;
        }
        if (!lq1.a.a() && android.os.Build.VERSION.SDK_INT >= 31) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "BLE connect and scan permission is disabled");
            return false;
        }
        if (!z17) {
            if (this.f364673f) {
                this.f364671d.mo50300x3fa464aa(this.f364672e);
                this.f364673f = false;
                b(false);
                e();
                hq1.h hVar = this.f364668a;
                if (hVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothSDKManager", "***BLE onDiscoverFinished***");
                    kq1.n nVar = ((kq1.e) hVar).f392773a;
                    nVar.f392791e.clear();
                    iz5.a.g(null, kq1.n.a(nVar, 2, 0, 0, null));
                }
            }
            return true;
        }
        if (this.f364673f) {
            return true;
        }
        if (b(z17)) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 1) {
                this.f364671d.mo50297x7c4d7ca2(this.f364672e, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            } else {
                this.f364671d.mo50300x3fa464aa(this.f364672e);
            }
            this.f364673f = true;
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "mAdapter.startLeScan Failed!!!");
        if (!this.f364677j.isEmpty()) {
            java.util.Iterator it = this.f364677j.iterator();
            while (it.hasNext()) {
                java.lang.Long l17 = (java.lang.Long) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", l17);
                hq1.h hVar2 = this.f364668a;
                if (hVar2 != null) {
                    hVar2.a(l17.longValue(), false);
                }
            }
            this.f364677j.clear();
        }
        return false;
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.BluetoothLEManager", "tryToCleanPreScanSet");
        java.util.HashSet hashSet = this.f364677j;
        if (hashSet.isEmpty()) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", l17);
            hq1.h hVar = this.f364668a;
            if (hVar != null) {
                hVar.a(l17.longValue(), false);
            }
        }
        hashSet.clear();
    }
}
