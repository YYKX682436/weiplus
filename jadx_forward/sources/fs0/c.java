package fs0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f347732a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f347733b;

    /* renamed from: d, reason: collision with root package name */
    public final long f347735d;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.PriorityQueue f347738g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f347739h;

    /* renamed from: i, reason: collision with root package name */
    public final int f347740i;

    /* renamed from: j, reason: collision with root package name */
    public final int f347741j;

    /* renamed from: c, reason: collision with root package name */
    public long f347734c = -1;

    /* renamed from: e, reason: collision with root package name */
    public final x.b f347736e = new x.b();

    /* renamed from: f, reason: collision with root package name */
    public final x.b f347737f = new x.b();

    /* renamed from: k, reason: collision with root package name */
    public final int f347742k = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_remuxer_vfr_threshold, 10);

    public c(java.lang.String str, int i17, long j17, boolean z17) {
        boolean z18;
        this.f347732a = j17;
        this.f347733b = z17;
        this.f347735d = -1L;
        double[] dArr = {0.0d, 0.0d, 0.0d};
        this.f347739h = kz5.n0.D0(rs0.f.a(str, dArr, Integer.MAX_VALUE));
        int i18 = (int) dArr[2];
        this.f347740i = i18;
        this.f347741j = i17 <= 0 ? i18 : i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.B(986L, 114L);
        g0Var.C(986L, 115L, (long) dArr[2]);
        g0Var.C(986L, 116L, (long) (dArr[1] - dArr[0]));
        int i19 = 0;
        while (true) {
            if (i19 >= 3) {
                z18 = true;
                break;
            }
            if (!(dArr[i19] > 0.0d)) {
                z18 = false;
                break;
            }
            i19++;
        }
        if (z18 && (!this.f347739h.isEmpty())) {
            this.f347735d = ((java.lang.Number) kz5.n0.i0(this.f347739h)).longValue();
        }
        double d17 = dArr[0];
        double d18 = dArr[1];
        this.f347738g = new java.util.PriorityQueue(java.lang.Math.max(this.f347739h.size(), 11), fs0.b.f347731d);
        z65.c.a();
        if (this.f347740i <= this.f347741j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DecodeHelper", "use PassthroughDecodeStrategy");
            a(new fs0.p());
        } else {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_remuxer_vfr_max_process_frame_count, 3660);
            java.util.List list = this.f347739h;
            if (list.size() > Ni && !com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.d() && !com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.c(false, this.f347733b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DecodeHelper", "use CfrDecodeStrategy");
                a(new fs0.a());
            } else if (list.size() <= Ni) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DecodeHelper", "use VfrDecodeStrategy");
                a(new fs0.r());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DecodeHelper", "use SimpleVfrDecodeStrategy");
                a(new fs0.q());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DecodeHelper", "init decode helper, inFPS = " + this.f347740i + ", outFPS = " + this.f347741j + ", minFps:" + d17 + ", maxFps:" + d18 + ", vfrThreshold:" + this.f347742k + ", valid frames = " + this.f347736e.f532379f + ", lastPts:" + this.f347735d + ", frames.size:" + this.f347739h.size());
    }

    public final void a(fs0.d strategy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strategy, "strategy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        strategy.a(this.f347732a, this.f347739h, this.f347740i, this.f347741j, this.f347736e, this.f347737f);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (strategy instanceof fs0.p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.B(986L, 105L);
            g0Var.C(986L, 108L, currentTimeMillis2);
        } else if (strategy instanceof fs0.a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.B(986L, 107L);
            g0Var2.C(986L, 112L, currentTimeMillis2);
        } else if (strategy instanceof fs0.r) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var3.B(986L, 106L);
            g0Var3.C(986L, 110L, currentTimeMillis2);
        } else if (strategy instanceof fs0.q) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var4.B(986L, 149L);
            g0Var4.C(986L, 150L, currentTimeMillis2);
        }
        this.f347734c = -1L;
    }
}
