package yu;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.aw2 f547304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547305g;

    public l(java.lang.String str, java.lang.String str2, r45.aw2 aw2Var, yz5.l lVar) {
        this.f547302d = str;
        this.f547303e = str2;
        this.f547304f = aw2Var;
        this.f547305g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f547302d, true);
        int i17 = (n17 == null || !n17.k2()) ? 0 : 2;
        s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
        yu.k kVar = new yu.k(this.f547304f, this.f547305g);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) a1Var).getClass();
        java.lang.String anchorUsername = this.f547303e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.s5(kVar, anchorUsername, i17, null), 3, null);
    }
}
