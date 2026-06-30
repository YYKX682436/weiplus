package hq1;

/* loaded from: classes13.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final hq1.n f364614a;

    /* renamed from: b, reason: collision with root package name */
    public final hq1.z f364615b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f364616c;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f364618e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f364619f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f364617d = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: g, reason: collision with root package name */
    public final hq1.m f364620g = new hq1.u(this);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f364621h = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f364622i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f364623j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final hq1.f0 f364624k = new hq1.w(this);

    public a0(hq1.z zVar) {
        this.f364616c = null;
        this.f364618e = null;
        this.f364619f = null;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f364616c = context;
        this.f364615b = zVar;
        hq1.n nVar = hq1.n.f364700i;
        if (nVar == null) {
            nVar = new hq1.n(context);
            hq1.n.f364700i = nVar;
        }
        this.f364614a = nVar;
        this.f364619f = new hq1.x(this);
        this.f364618e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("BluetoothLESimpleManagerThread");
    }

    public final boolean a() {
        return this.f364616c.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }
}
