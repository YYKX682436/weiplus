package j5;

/* loaded from: classes13.dex */
public final class w {

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f379296s = a5.a0.e("WorkSpec");

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f379297a;

    /* renamed from: b, reason: collision with root package name */
    public a5.q0 f379298b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f379299c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379300d;

    /* renamed from: e, reason: collision with root package name */
    public a5.m f379301e;

    /* renamed from: f, reason: collision with root package name */
    public a5.m f379302f;

    /* renamed from: g, reason: collision with root package name */
    public long f379303g;

    /* renamed from: h, reason: collision with root package name */
    public long f379304h;

    /* renamed from: i, reason: collision with root package name */
    public long f379305i;

    /* renamed from: j, reason: collision with root package name */
    public a5.f f379306j;

    /* renamed from: k, reason: collision with root package name */
    public int f379307k;

    /* renamed from: l, reason: collision with root package name */
    public a5.a f379308l;

    /* renamed from: m, reason: collision with root package name */
    public long f379309m;

    /* renamed from: n, reason: collision with root package name */
    public long f379310n;

    /* renamed from: o, reason: collision with root package name */
    public long f379311o;

    /* renamed from: p, reason: collision with root package name */
    public long f379312p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f379313q;

    /* renamed from: r, reason: collision with root package name */
    public a5.k0 f379314r;

    public w(java.lang.String str, java.lang.String str2) {
        this.f379298b = a5.q0.ENQUEUED;
        a5.m mVar = a5.m.f82943b;
        this.f379301e = mVar;
        this.f379302f = mVar;
        this.f379306j = a5.f.f82917i;
        this.f379308l = a5.a.EXPONENTIAL;
        this.f379309m = 30000L;
        this.f379312p = -1L;
        this.f379314r = a5.k0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f379297a = str;
        this.f379299c = str2;
    }

    public long a() {
        if (this.f379298b == a5.q0.ENQUEUED && this.f379307k > 0) {
            return this.f379310n + java.lang.Math.min(18000000L, this.f379308l == a5.a.LINEAR ? this.f379309m * this.f379307k : java.lang.Math.scalb((float) this.f379309m, this.f379307k - 1));
        }
        if (!c()) {
            long j17 = this.f379310n;
            if (j17 == 0) {
                j17 = java.lang.System.currentTimeMillis();
            }
            return j17 + this.f379303g;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = this.f379310n;
        if (j18 == 0) {
            j18 = this.f379303g + currentTimeMillis;
        }
        long j19 = this.f379305i;
        long j27 = this.f379304h;
        if (j19 != j27) {
            return j18 + j27 + (j18 == 0 ? j19 * (-1) : 0L);
        }
        return j18 + (j18 != 0 ? j27 : 0L);
    }

    public boolean b() {
        return !a5.f.f82917i.m579xb2c87fbf(this.f379306j);
    }

    public boolean c() {
        return this.f379304h != 0;
    }

    /* renamed from: equals */
    public boolean m140350xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j5.w.class != obj.getClass()) {
            return false;
        }
        j5.w wVar = (j5.w) obj;
        if (this.f379303g != wVar.f379303g || this.f379304h != wVar.f379304h || this.f379305i != wVar.f379305i || this.f379307k != wVar.f379307k || this.f379309m != wVar.f379309m || this.f379310n != wVar.f379310n || this.f379311o != wVar.f379311o || this.f379312p != wVar.f379312p || this.f379313q != wVar.f379313q || !this.f379297a.equals(wVar.f379297a) || this.f379298b != wVar.f379298b || !this.f379299c.equals(wVar.f379299c)) {
            return false;
        }
        java.lang.String str = this.f379300d;
        if (str == null ? wVar.f379300d == null : str.equals(wVar.f379300d)) {
            return this.f379301e.m593xb2c87fbf(wVar.f379301e) && this.f379302f.m593xb2c87fbf(wVar.f379302f) && this.f379306j.m579xb2c87fbf(wVar.f379306j) && this.f379308l == wVar.f379308l && this.f379314r == wVar.f379314r;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m140351x8cdac1b() {
        int hashCode = ((((this.f379297a.hashCode() * 31) + this.f379298b.hashCode()) * 31) + this.f379299c.hashCode()) * 31;
        java.lang.String str = this.f379300d;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f379301e.m594x8cdac1b()) * 31) + this.f379302f.m594x8cdac1b()) * 31;
        long j17 = this.f379303g;
        int i17 = (hashCode2 + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        long j18 = this.f379304h;
        int i18 = (i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f379305i;
        int m580x8cdac1b = (((((((i18 + ((int) (j19 ^ (j19 >>> 32)))) * 31) + this.f379306j.m580x8cdac1b()) * 31) + this.f379307k) * 31) + this.f379308l.hashCode()) * 31;
        long j27 = this.f379309m;
        int i19 = (m580x8cdac1b + ((int) (j27 ^ (j27 >>> 32)))) * 31;
        long j28 = this.f379310n;
        int i27 = (i19 + ((int) (j28 ^ (j28 >>> 32)))) * 31;
        long j29 = this.f379311o;
        int i28 = (i27 + ((int) (j29 ^ (j29 >>> 32)))) * 31;
        long j37 = this.f379312p;
        return ((((i28 + ((int) (j37 ^ (j37 >>> 32)))) * 31) + (this.f379313q ? 1 : 0)) * 31) + this.f379314r.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m140352x9616526c() {
        return "{WorkSpec: " + this.f379297a + "}";
    }

    public w(j5.w wVar) {
        this.f379298b = a5.q0.ENQUEUED;
        a5.m mVar = a5.m.f82943b;
        this.f379301e = mVar;
        this.f379302f = mVar;
        this.f379306j = a5.f.f82917i;
        this.f379308l = a5.a.EXPONENTIAL;
        this.f379309m = 30000L;
        this.f379312p = -1L;
        this.f379314r = a5.k0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f379297a = wVar.f379297a;
        this.f379299c = wVar.f379299c;
        this.f379298b = wVar.f379298b;
        this.f379300d = wVar.f379300d;
        this.f379301e = new a5.m(wVar.f379301e);
        this.f379302f = new a5.m(wVar.f379302f);
        this.f379303g = wVar.f379303g;
        this.f379304h = wVar.f379304h;
        this.f379305i = wVar.f379305i;
        this.f379306j = new a5.f(wVar.f379306j);
        this.f379307k = wVar.f379307k;
        this.f379308l = wVar.f379308l;
        this.f379309m = wVar.f379309m;
        this.f379310n = wVar.f379310n;
        this.f379311o = wVar.f379311o;
        this.f379312p = wVar.f379312p;
        this.f379313q = wVar.f379313q;
        this.f379314r = wVar.f379314r;
    }
}
