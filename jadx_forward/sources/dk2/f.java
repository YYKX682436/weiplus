package dk2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final r45.qt2 f314945a;

    /* renamed from: b, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f314946b;

    /* renamed from: c, reason: collision with root package name */
    public long f314947c;

    /* renamed from: d, reason: collision with root package name */
    public long f314948d;

    public f(r45.qt2 qt2Var) {
        this.f314945a = qt2Var;
    }

    public final void a(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ShoppingBubbleReport", "product " + j17 + " start report");
        this.f314947c = java.lang.System.currentTimeMillis();
        this.f314948d = j17;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f314946b;
        if (y0Var != null) {
            if (y0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coroutineScope");
                throw null;
            }
            p3325xe03a0797.p3326xc267989b.z0.e(y0Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);
        this.f314946b = a17;
        p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new dk2.e(this, null), 3, null);
    }

    public final void b() {
        r45.qt2 qt2Var;
        gk2.e eVar = gk2.e.f354004n;
        if (eVar == null || (qt2Var = this.f314945a) == null) {
            return;
        }
        int currentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - this.f314947c) / 1000);
        r45.jn0 k07 = zl2.r4.k0(zl2.r4.f555483a, eVar, 33, java.lang.String.valueOf(this.f314948d), currentTimeMillis, null, 16, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ShoppingBubbleReport", "report product " + this.f314948d + " exposed for " + currentTimeMillis);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Kj(qt2Var, 18054, k07);
    }
}
