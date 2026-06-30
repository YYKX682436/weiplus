package fm3;

/* loaded from: classes10.dex */
public final class q implements in5.c {

    /* renamed from: p, reason: collision with root package name */
    public static final fm3.h f345637p = new fm3.h(null);

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.Object f345638q = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public ll3.h1 f345639d;

    /* renamed from: e, reason: collision with root package name */
    public int f345640e;

    /* renamed from: f, reason: collision with root package name */
    public int f345641f;

    /* renamed from: g, reason: collision with root package name */
    public int f345642g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f345643h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f345644i;

    /* renamed from: m, reason: collision with root package name */
    public fm3.n f345645m;

    /* renamed from: n, reason: collision with root package name */
    public fm3.o f345646n;

    /* renamed from: o, reason: collision with root package name */
    public fm3.q f345647o;

    public q() {
        fm3.d a17 = fm3.d.f345568f.a();
        this.f345645m = new fm3.i(a17);
        fm3.p pVar = new fm3.p(a17.a(), a17.a(), a17.f345573d, 0, 0, 24, null);
        pVar.f345631d = a17.f345571b;
        pVar.f345632e = a17.f345572c;
        pVar.f345633f = true;
        this.f345646n = pVar;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f17;
        fm3.o oVar = this.f345646n;
        java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0((oVar == null || (f17 = oVar.f()) == null) ? 0L : f17.m76784x5db1b11());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r07, "getUnsignedLongString(...)");
        return r07;
    }

    public final java.lang.String b() {
        java.lang.String r17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f17;
        fm3.o oVar = this.f345646n;
        if (oVar == null || (f17 = oVar.f()) == null || (r17 = f17.m76836x6c03c64c()) == null) {
            r17 = c01.z1.r();
        }
        return r17 == null ? "" : r17;
    }

    public final java.lang.String c(int i17) {
        ll3.f1 d17;
        ll3.h1 h1Var = this.f345639d;
        if (h1Var == null || (d17 = h1Var.d(h1Var.a(i17))) == null) {
            return null;
        }
        return d17.f400701b;
    }

    public final long d() {
        fm3.q qVar = this.f345647o;
        boolean z17 = false;
        if (qVar != null && qVar.f345642g == 0) {
            z17 = true;
        }
        return z17 ? 1L : 0L;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 4;
    }
}
