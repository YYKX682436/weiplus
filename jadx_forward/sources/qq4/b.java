package qq4;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public int f447502c;

    /* renamed from: d, reason: collision with root package name */
    public long f447503d;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f447508i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f447509j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f447510k;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f447512m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f447513n;

    /* renamed from: o, reason: collision with root package name */
    public android.util.Size f447514o;

    /* renamed from: p, reason: collision with root package name */
    public android.util.Size f447515p;

    /* renamed from: q, reason: collision with root package name */
    public long f447516q;

    /* renamed from: r, reason: collision with root package name */
    public long f447517r;

    /* renamed from: s, reason: collision with root package name */
    public int f447518s;

    /* renamed from: t, reason: collision with root package name */
    public long f447519t;

    /* renamed from: a, reason: collision with root package name */
    public int f447500a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f447501b = new p012xc85e97e9.p093xedfae76a.j0(java.lang.Integer.valueOf(this.f447500a));

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f447504e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f447505f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f447506g = new p012xc85e97e9.p093xedfae76a.j0(java.lang.Boolean.valueOf(this.f447505f));

    /* renamed from: h, reason: collision with root package name */
    public int f447507h = 1;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f447511l = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String type, pq4.c thread) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        this.f447511l.put(type, thread);
    }

    public final boolean b() {
        return (wo.v1.f529355b.f529193e == 1 && this.f447517r == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447508i, java.lang.Boolean.TRUE) || this.f447509j;
    }

    public final boolean c() {
        long j17 = this.f447503d;
        if (671097600 <= j17 && j17 < 805306368) {
            return true;
        }
        java.lang.String str = this.f447504e;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        if (r26.n0.B(lowerCase, "iphone", false)) {
            return true;
        }
        java.lang.String lowerCase2 = this.f447504e.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, "toLowerCase(...)");
        return r26.n0.B(lowerCase2, "ipad", false);
    }

    public final void d() {
        dr4.p1 p1Var;
        dr4.p1 p1Var2;
        this.f447502c = 0;
        this.f447514o = null;
        this.f447515p = null;
        this.f447516q = 0L;
        this.f447517r = 0L;
        this.f447500a = 0;
        boolean e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e();
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f447501b;
        if (e17) {
            j0Var.mo523x53d8522f(0);
        } else {
            j0Var.mo7808x76db6cb1(0);
        }
        this.f447509j = false;
        this.f447503d = 0L;
        gq4.a aVar = gq4.v.Bi().f258092b;
        if (aVar != null && (p1Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) aVar).f257908f) != null) {
            p1Var2.o(gq4.v.wi().f447500a);
        }
        this.f447504e = "";
        gq4.a aVar2 = gq4.v.Bi().f258092b;
        if (aVar2 == null || (p1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) aVar2).f257908f) == null) {
            return;
        }
        p1Var.o(gq4.v.wi().f447500a);
    }
}
