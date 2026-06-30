package e04;

/* loaded from: classes15.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f327540a;

    /* renamed from: b, reason: collision with root package name */
    public long f327541b;

    /* renamed from: c, reason: collision with root package name */
    public long f327542c;

    /* renamed from: d, reason: collision with root package name */
    public long f327543d;

    /* renamed from: e, reason: collision with root package name */
    public float f327544e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f327545f;

    /* renamed from: g, reason: collision with root package name */
    public int f327546g;

    /* renamed from: h, reason: collision with root package name */
    public e04.k2 f327547h = e04.k2.f327533e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f327548i;

    /* renamed from: j, reason: collision with root package name */
    public long f327549j;

    /* renamed from: k, reason: collision with root package name */
    public long f327550k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f327551l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f327552m;

    public l2() {
        this.f327542c = 3000L;
        this.f327543d = 1000L;
        this.f327544e = 2.0f;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R(gm0.j1.b().j() + "_scan_code_retry");
        this.f327540a = R;
        long j17 = R != null ? R.getLong("scan_code_retry_timeout", 3000L) : 3000L;
        this.f327541b = j17;
        this.f327546g = 1;
        this.f327542c = 3000L;
        this.f327543d = 1000L;
        this.f327544e = 200 / 100.0f;
        long max = java.lang.Math.max(1000L, j17);
        this.f327541b = max;
        this.f327541b = java.lang.Math.min(this.f327542c, max);
        int i17 = this.f327546g;
        if (i17 == 1) {
            this.f327548i = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanRetryManager", "init retryType: %d, maxTimeout: %d, minTimeout: %d, timeout: %d, timeoutFactor config: %d, factor: %f, canRetryReopenCamera: %b", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f327542c), java.lang.Long.valueOf(this.f327543d), java.lang.Long.valueOf(this.f327541b), 200, java.lang.Float.valueOf(this.f327544e), java.lang.Boolean.valueOf(this.f327548i));
    }
}
