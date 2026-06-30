package ki4;

/* loaded from: classes9.dex */
public final class t implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi4.a f389685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bi4.v0 f389686e;

    public t(fi4.a aVar, bi4.v0 v0Var) {
        this.f389685d = aVar;
        this.f389686e = v0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        fi4.a aVar = this.f389685d;
        aVar.getClass();
        d17.p(5829, this);
        com.p314xaae8f345.mm.p944x882e457a.r1 d18 = gm0.j1.d();
        aVar.getClass();
        d18.q(5829, this);
        bi4.v0 v0Var = this.f389686e;
        if (i17 != 0 || i18 != 0) {
            if (v0Var != null) {
                v0Var.a(false, null);
            }
        } else {
            pj4.i iVar = aVar.f344593i;
            if (iVar == null || v0Var == null) {
                return;
            }
            v0Var.a(true, iVar.f436642d);
        }
    }
}
