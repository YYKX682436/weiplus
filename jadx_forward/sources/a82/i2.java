package a82;

/* loaded from: classes12.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f83570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83572f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83573g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a82.h2 f83574h;

    public i2(a82.h2 h2Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18, java.lang.String str) {
        this.f83574h = h2Var;
        this.f83570d = m1Var;
        this.f83571e = i17;
        this.f83572f = i18;
        this.f83573g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f83570d;
        if (m1Var.mo808xfb85f7b0() == 401 && (m1Var instanceof o72.h5)) {
            a82.h2 h2Var = this.f83574h;
            h2Var.f83546f = false;
            o72.r2 r2Var = ((o72.h5) m1Var).f424879f;
            long j17 = r2Var.f67645x88be67a1;
            ((java.util.HashMap) a82.h2.f83542i).remove(java.lang.Long.valueOf(j17));
            int i17 = this.f83571e;
            int i18 = this.f83572f;
            if ((i17 == 0 && i18 == 0) || i18 == -400) {
                ((java.util.HashSet) a82.h2.f83543m).add(java.lang.Long.valueOf(j17));
            }
            int i19 = this.f83571e;
            if ((i19 == 0 || i18 == -400) ? false : true) {
                a82.j1.f83578a.d(r2Var, false, i19, this.f83572f, this.f83573g);
                java.util.Map map = o72.v2.f425035a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10659, 0, java.lang.Integer.valueOf(r2Var.f67657x2262335f), java.lang.Integer.valueOf(i18 == -401 ? -4 : i17 == 4 ? -2 : -1), java.lang.Long.valueOf(o72.x1.N(r2Var)), java.lang.Long.valueOf(o72.v2.a(r2Var.f67645x88be67a1)));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavSendService", "achieved retry limit, set error, localId:%d", java.lang.Long.valueOf(j17));
                if (r2Var.f67644x3059914a == 12) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(14, r2Var.f67645x88be67a1);
                }
                if (r2Var.f67644x3059914a == 9) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(11, r2Var.f67645x88be67a1);
                }
            }
            if (a82.h2.a(h2Var)) {
                return;
            }
            ((s72.j0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj()).f7(5, 2, new a82.C0003x5d0d2d7());
        }
    }

    /* renamed from: toString */
    public java.lang.String m816x9616526c() {
        return super.toString() + "|onSceneEnd";
    }
}
