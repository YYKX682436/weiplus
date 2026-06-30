package b50;

/* loaded from: classes11.dex */
public final class c1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f99463e;

    public c1(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935, java.lang.ref.WeakReference weakReference) {
        this.f99462d = c10601x91d05935;
        this.f99463e = weakReference;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null;
        if (valueOf != null && valueOf.intValue() == 385) {
            gm0.j1.d().q(385, this);
            boolean Bi = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Bi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f99462d.f148594d, "onSceneEnd: %s, %s, %s, unReg: %s", valueOf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(Bi));
            com.p314xaae8f345.p2845xc516c4b6.biz.C23186xda420f98 c23186xda420f98 = (com.p314xaae8f345.p2845xc516c4b6.biz.C23186xda420f98) this.f99463e.get();
            if (c23186xda420f98 != null) {
                c23186xda420f98.m85211x47bb976f(!Bi, b50.b1.f99458d);
            }
        }
    }
}
