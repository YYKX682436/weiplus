package pb1;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f434674b;

    /* renamed from: c, reason: collision with root package name */
    public pb1.x f434675c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f434676d;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f434680h;

    /* renamed from: j, reason: collision with root package name */
    public android.content.BroadcastReceiver f434682j;

    /* renamed from: o, reason: collision with root package name */
    public volatile ob1.l f434687o;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434673a = "MicroMsg.Ble.BleScanWorker#" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f434677e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f434678f = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f434679g = new android.os.Handler();

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f434681i = new pb1.c(this);

    /* renamed from: k, reason: collision with root package name */
    public volatile pb1.h f434683k = null;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Runnable f434684l = new pb1.d(this);

    /* renamed from: m, reason: collision with root package name */
    public int f434685m = -1;

    /* renamed from: n, reason: collision with root package name */
    public volatile pb1.v f434686n = pb1.p.f434693a;

    public i(android.content.Context context) {
        this.f434674b = context;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12041x3974a582 a(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1078030475:
                if (str.equals(ya.b.f77490x87518375)) {
                    c17 = 0;
                    break;
                }
                break;
            case 107348:
                if (str.equals("low")) {
                    c17 = 1;
                    break;
                }
                break;
            case 3202466:
                if (str.equals("high")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12041x3974a582(1, 1, 0L, null);
            case 1:
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12041x3974a582(0, 1, 0L, null);
            case 2:
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12041x3974a582(2, 1, 0L, null);
            default:
                return a(ya.b.f77490x87518375);
        }
    }

    public final synchronized void b() {
        if (this.f434674b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f434673a, "initBroadcaseListener, context is null");
            return;
        }
        if (this.f434682j == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f434673a, "bluetoothStateListener init");
            this.f434682j = new pb1.f(this);
            this.f434674b.registerReceiver(this.f434682j, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Type inference failed for: r2v20, types: [pb1.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(pb1.h r25) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.i.c(pb1.h):void");
    }

    public synchronized ob1.m d() {
        if (this.f434678f.get() && this.f434675c != null) {
            if (!this.f434677e.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f434673a, "not scan", new java.lang.Object[0]);
                return ob1.m.f425551e;
            }
            android.bluetooth.BluetoothAdapter d17 = qb1.b.d();
            if (d17 != null && qb1.b.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f434673a, "stopBleScan, stopScan", new java.lang.Object[0]);
                this.f434677e.set(false);
                pb1.x xVar = this.f434675c;
                ((pb1.j) pb1.m.f434690a).getClass();
                pb1.k kVar = (pb1.k) pb1.j.f434688a.m174754xc84af884(xVar);
                if (kVar != null) {
                    if (d17.getBluetoothLeScanner() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ble.BleScannerCompat", "bluetoothscanner is null, return");
                    } else {
                        d17.getBluetoothLeScanner().stopScan(kVar);
                    }
                }
                if (kb1.b.a().f387754e) {
                    pb1.u uVar = (pb1.u) i95.n0.c(pb1.u.class);
                    if (uVar == null) {
                        uVar = pb1.o.f434692d;
                    }
                    uVar.t9(this.f434685m);
                    this.f434685m = -1;
                    this.f434679g.removeCallbacks(this.f434684l);
                }
                return ob1.m.f425551e;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f434673a, "BluetoothAdapter is null, err", new java.lang.Object[0]);
            return ob1.m.f425555i;
        }
        return ob1.m.f425554h;
    }
}
