package we0;

/* loaded from: classes9.dex */
public final class g1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej4.c f526650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe0.k0 f526651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f526652f;

    public g1(ej4.c cVar, xe0.k0 k0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f526650d = cVar;
        this.f526651e = k0Var;
        this.f526652f = u3Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        ej4.c cVar = this.f526650d;
        cVar.getClass();
        d17.p(4301, this);
        com.p314xaae8f345.mm.p944x882e457a.r1 d18 = gm0.j1.d();
        cVar.getClass();
        d18.q(4301, this);
        xe0.k0 k0Var = this.f526651e;
        if (i17 == 0 && i18 == 0) {
            pj4.f fVar = cVar.f334867f;
            if (fVar != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ul) k0Var).a(true, fVar.f436569d);
            }
        } else {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ul) k0Var).a(false, null);
        }
        this.f526652f.dismiss();
    }
}
