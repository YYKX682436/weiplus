package lx;

/* loaded from: classes11.dex */
public final class z4 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403562e;

    public z4(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a, java.lang.ref.WeakReference weakReference) {
        this.f403561d = c10491x8102098a;
        this.f403562e = weakReference;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null;
        if (valueOf != null && valueOf.intValue() == 385) {
            gm0.j1.d().q(385, this);
            boolean Bi = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Bi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f403561d.f146786d, "onSceneEnd: %s, %s, %s, unReg: %s", valueOf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(Bi));
            com.p314xaae8f345.p2845xc516c4b6.biz.C23186xda420f98 c23186xda420f98 = (com.p314xaae8f345.p2845xc516c4b6.biz.C23186xda420f98) this.f403562e.get();
            if (c23186xda420f98 != null) {
                c23186xda420f98.m85211x47bb976f(!Bi, lx.y4.f403551d);
            }
        }
    }
}
