package dz4;

/* loaded from: classes12.dex */
public final class a1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz4.r f326691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.b1 f326692e;

    public a1(iz4.r rVar, dz4.b1 b1Var) {
        this.f326691d = rVar;
        this.f326692e = b1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        o72.k4 oj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
        iz4.r rVar = this.f326691d;
        o72.r2 F = oj6.F(rVar.f377673e);
        dz4.b1 b1Var = this.f326692e;
        if (F == null || F.f67643xc8a07680 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b1Var.f326703b, "favitem with local id = " + rVar.f377673e + " is not ready to pin.");
            return;
        }
        b1Var.a(rVar);
        gm0.j1.d().q(401, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b1Var.f326703b, "pin favitem with favid = " + F.f67643xc8a07680 + ", after it's inserted to the database.");
    }
}
