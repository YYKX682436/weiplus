package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.p0 f159660a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.p0 p0Var) {
        this.f159660a = p0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d85) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        if (c11738x6e2c0d85 != null && (o6Var = this.f159660a.f159662v) != null && o6Var.f156336n.equals(c11738x6e2c0d85.f158465d) && this.f159660a.f159662v.f156338p.f158814g == c11738x6e2c0d85.f158466e && c11738x6e2c0d85.f158467f == 2 && c11738x6e2c0d85.f158468g == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.p0 p0Var = this.f159660a;
            if (p0Var.u()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onBackgroundLocationStateChanged, add location state to float ball");
                pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
                int i17 = p0Var.f174665d.H;
                ((ov.p0) j0Var).getClass();
                java.lang.Boolean bool = qp1.w.f447288a;
                p0Var.b0(1 | i17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onBackgroundLocationStateChanged, add passive location float ball");
            p0Var.a0(true);
            p0Var.W(true);
            pv.j0 j0Var2 = (pv.j0) i95.n0.c(pv.j0.class);
            int i18 = p0Var.f174665d.H;
            ((ov.p0) j0Var2).getClass();
            java.lang.Boolean bool2 = qp1.w.f447288a;
            p0Var.b0(1 | i18);
            p0Var.j();
        }
    }
}
