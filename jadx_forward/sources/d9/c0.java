package d9;

/* loaded from: classes15.dex */
public final class c0 {

    /* renamed from: i, reason: collision with root package name */
    public int f308834i;

    /* renamed from: j, reason: collision with root package name */
    public int f308835j;

    /* renamed from: k, reason: collision with root package name */
    public int f308836k;

    /* renamed from: l, reason: collision with root package name */
    public int f308837l;

    /* renamed from: q, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f308842q;

    /* renamed from: r, reason: collision with root package name */
    public int f308843r;

    /* renamed from: a, reason: collision with root package name */
    public int f308826a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public int[] f308827b = new int[1000];

    /* renamed from: c, reason: collision with root package name */
    public long[] f308828c = new long[1000];

    /* renamed from: f, reason: collision with root package name */
    public long[] f308831f = new long[1000];

    /* renamed from: e, reason: collision with root package name */
    public int[] f308830e = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    public int[] f308829d = new int[1000];

    /* renamed from: g, reason: collision with root package name */
    public q8.n[] f308832g = new q8.n[1000];

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[] f308833h = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417[1000];

    /* renamed from: m, reason: collision with root package name */
    public long f308838m = Long.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public long f308839n = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public boolean f308841p = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f308840o = true;

    public final long a(int i17) {
        this.f308838m = java.lang.Math.max(this.f308838m, d(i17));
        int i18 = this.f308834i - i17;
        this.f308834i = i18;
        this.f308835j += i17;
        int i19 = this.f308836k + i17;
        this.f308836k = i19;
        int i27 = this.f308826a;
        if (i19 >= i27) {
            this.f308836k = i19 - i27;
        }
        int i28 = this.f308837l - i17;
        this.f308837l = i28;
        if (i28 < 0) {
            this.f308837l = 0;
        }
        if (i18 != 0) {
            return this.f308828c[this.f308836k];
        }
        int i29 = this.f308836k;
        if (i29 != 0) {
            i27 = i29;
        }
        return this.f308828c[i27 - 1] + this.f308829d[r2];
    }

    public long b(int i17) {
        int i18 = this.f308835j;
        int i19 = this.f308834i;
        int i27 = (i18 + i19) - i17;
        t9.a.a(i27 >= 0 && i27 <= i19 - this.f308837l);
        int i28 = this.f308834i - i27;
        this.f308834i = i28;
        this.f308839n = java.lang.Math.max(this.f308838m, d(i28));
        int i29 = this.f308834i;
        if (i29 == 0) {
            return 0L;
        }
        return this.f308828c[e(i29 - 1)] + this.f308829d[r6];
    }

    public final int c(int i17, int i18, long j17, boolean z17) {
        int i19 = -1;
        for (int i27 = 0; i27 < i18 && this.f308831f[i17] <= j17; i27++) {
            if (!z17 || (this.f308830e[i17] & 1) != 0) {
                i19 = i27;
            }
            i17++;
            if (i17 == this.f308826a) {
                i17 = 0;
            }
        }
        return i19;
    }

    public final long d(int i17) {
        long j17 = Long.MIN_VALUE;
        if (i17 == 0) {
            return Long.MIN_VALUE;
        }
        int e17 = e(i17 - 1);
        for (int i18 = 0; i18 < i17; i18++) {
            j17 = java.lang.Math.max(j17, this.f308831f[e17]);
            if ((this.f308830e[e17] & 1) != 0) {
                break;
            }
            e17--;
            if (e17 == -1) {
                e17 = this.f308826a - 1;
            }
        }
        return j17;
    }

    public final int e(int i17) {
        int i18 = this.f308836k + i17;
        int i19 = this.f308826a;
        return i18 < i19 ? i18 : i18 - i19;
    }

    public synchronized boolean f() {
        return this.f308837l != this.f308834i;
    }
}
