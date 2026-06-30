package r9;

/* loaded from: classes15.dex */
public final class p implements r9.e, r9.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final t9.x f474930a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.d f474931b;

    /* renamed from: c, reason: collision with root package name */
    public int f474932c;

    /* renamed from: d, reason: collision with root package name */
    public long f474933d;

    /* renamed from: e, reason: collision with root package name */
    public long f474934e;

    /* renamed from: f, reason: collision with root package name */
    public long f474935f;

    /* renamed from: g, reason: collision with root package name */
    public long f474936g;

    /* renamed from: h, reason: collision with root package name */
    public long f474937h;

    public p() {
        t9.d dVar = t9.d.f498030a;
        this.f474930a = new t9.x(2000);
        this.f474931b = dVar;
        this.f474937h = -1L;
    }

    @Override // r9.k0
    public synchronized void a(java.lang.Object obj, int i17) {
        this.f474934e += i17;
    }

    @Override // r9.k0
    public synchronized void b(java.lang.Object obj) {
        t9.a.d(this.f474932c > 0);
        ((t9.z) this.f474931b).getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = (int) (elapsedRealtime - this.f474933d);
        long j17 = i17;
        this.f474935f += j17;
        long j18 = this.f474936g;
        long j19 = this.f474934e;
        this.f474936g = j18 + j19;
        if (i17 > 0) {
            this.f474930a.a((int) java.lang.Math.sqrt(j19), (float) ((8000 * j19) / j17));
            if (this.f474935f >= 2000 || this.f474936g >= 524288) {
                float b17 = this.f474930a.b(0.5f);
                this.f474937h = java.lang.Float.isNaN(b17) ? -1L : b17;
            }
        }
        int i18 = this.f474932c - 1;
        this.f474932c = i18;
        if (i18 > 0) {
            this.f474933d = elapsedRealtime;
        }
        this.f474934e = 0L;
    }

    @Override // r9.e
    public synchronized long c() {
        return this.f474937h;
    }

    @Override // r9.k0
    public synchronized void d(java.lang.Object obj, r9.n nVar) {
        if (this.f474932c == 0) {
            ((t9.z) this.f474931b).getClass();
            this.f474933d = android.os.SystemClock.elapsedRealtime();
        }
        this.f474932c++;
    }
}
