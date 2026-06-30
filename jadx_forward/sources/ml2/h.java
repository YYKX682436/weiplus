package ml2;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f409034a;

    /* renamed from: b, reason: collision with root package name */
    public long f409035b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f409036c;

    /* renamed from: f, reason: collision with root package name */
    public long f409039f;

    /* renamed from: h, reason: collision with root package name */
    public long f409041h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f409042i;

    /* renamed from: j, reason: collision with root package name */
    public rh.c1 f409043j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f409045l;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f409037d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("Finder.DeviceStatusReporter", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new ml2.g(this), true);

    /* renamed from: e, reason: collision with root package name */
    public final int f409038e = 30000;

    /* renamed from: g, reason: collision with root package name */
    public final int f409040g = 30000;

    /* renamed from: k, reason: collision with root package name */
    public final ml2.f f409044k = new ml2.f();

    public final void a() {
        this.f409037d.d();
        synchronized (this) {
            rh.c1 c1Var = this.f409043j;
            if (c1Var != null) {
                this.f409042i = false;
                if (c1Var.E()) {
                    c1Var.a();
                }
                c1Var.b();
                this.f409043j = null;
            }
        }
        this.f409045l = false;
        ml2.f fVar = this.f409044k;
        fVar.f408927a = 0;
        fVar.f408928b = 0L;
        this.f409039f = 0L;
        this.f409041h = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DeviceStatusReporter", "stopReportDeviceStatus");
    }
}
