package te1;

/* loaded from: classes13.dex */
public class s {

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f499353v = new java.util.concurrent.atomic.AtomicInteger(10000);

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.Future f499354a;

    /* renamed from: d, reason: collision with root package name */
    public te1.t f499357d;

    /* renamed from: i, reason: collision with root package name */
    public long f499362i;

    /* renamed from: j, reason: collision with root package name */
    public long f499363j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f499365l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f499366m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f499367n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f499368o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f499369p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f499370q;

    /* renamed from: t, reason: collision with root package name */
    public int f499373t;

    /* renamed from: b, reason: collision with root package name */
    public int f499355b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f499356c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f499358e = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public int f499360g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f499361h = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f499364k = -1;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f499371r = "";

    /* renamed from: s, reason: collision with root package name */
    public te1.b f499372s = te1.b.f499301c;

    /* renamed from: f, reason: collision with root package name */
    public final int f499359f = f499353v.incrementAndGet();

    /* renamed from: u, reason: collision with root package name */
    public final long f499374u = java.lang.System.currentTimeMillis();

    public final boolean a(int i17) {
        boolean z17;
        synchronized (this.f499358e) {
            z17 = this.f499356c == i17;
        }
        return z17;
    }

    public void b() {
        if (u(1, 2)) {
            te1.t tVar = this.f499357d;
            if (tVar != null) {
                tVar.getClass();
            }
            if (qe1.a.a().f443550b) {
                ve1.g.p(3, f(), "cancel proceeding, seq=" + this.f499359f, null);
            }
        }
    }

    public void c() {
        if (u(2, 3)) {
            te1.t tVar = this.f499357d;
            if (tVar != null) {
                ((te1.u) tVar).f499375a.countDown();
            }
            if (qe1.a.a().f443550b) {
                ve1.g.p(3, f(), "cancel success, seq=" + this.f499359f, null);
            }
        }
    }

    public int d() {
        return this.f499360g;
    }

    public synchronized te1.b e() {
        return this.f499372s;
    }

    public java.lang.String f() {
        return this.f499371r + "VideoRequest";
    }

    public int g() {
        return this.f499361h;
    }

    public long h() {
        return this.f499363j;
    }

    public long i() {
        return this.f499362i;
    }

    public java.lang.String j() {
        return this.f499370q;
    }

    public int k() {
        return this.f499359f;
    }

    public java.lang.String l() {
        return this.f499368o;
    }

    public java.lang.String m() {
        return this.f499366m;
    }

    public java.lang.String n() {
        return this.f499367n;
    }

    public boolean o() {
        return a(2);
    }

    public boolean p() {
        java.lang.String str = this.f499370q;
        return str != null && str.toLowerCase().equals("head");
    }

    public void q(int i17) {
        this.f499360g = i17;
    }

    public synchronized void r(int i17) {
    }

    public void s(int i17) {
        int i18 = this.f499355b;
        if ((i18 & i17) == 0) {
            this.f499355b = i18 + i17;
        }
    }

    public boolean t() {
        return a(1);
    }

    /* renamed from: toString */
    public java.lang.String m166299x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(super.toString());
        sb6.append("{seq=");
        sb6.append(this.f499359f);
        sb6.append(",priority=");
        sb6.append(this.f499361h);
        sb6.append(",range=[");
        sb6.append(this.f499362i);
        sb6.append(",");
        sb6.append(this.f499363j);
        sb6.append("],uuid=");
        sb6.append(this.f499366m);
        sb6.append(",contentType=");
        sb6.append(this.f499369p);
        sb6.append(",cancelState=");
        sb6.append(this.f499356c);
        sb6.append(",sourceUrl=");
        sb6.append(this.f499368o);
        sb6.append(",videoKey=");
        sb6.append(this.f499367n);
        sb6.append(",task=");
        java.util.concurrent.Future future = this.f499354a;
        sb6.append(future == null ? "null" : future.toString());
        sb6.append("}");
        return sb6.toString();
    }

    public final boolean u(int i17, int i18) {
        synchronized (this.f499358e) {
            if (this.f499356c == i17) {
                this.f499356c = i18;
                return true;
            }
            ve1.g.p(5, f(), java.lang.String.format(java.util.Locale.US, "transState error, current %d, condition %d, newState %d", java.lang.Integer.valueOf(this.f499356c), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), null);
            return false;
        }
    }

    public synchronized void v(long j17, te1.b bVar) {
        this.f499364k = j17;
        this.f499372s = bVar;
        if (bVar.m166294xb2c87fbf(te1.b.f499303e)) {
            this.f499360g |= 8;
        }
    }

    public synchronized void w(int i17) {
        this.f499373t += i17;
    }
}
