package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class r1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t1 f159672a;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t1 t1Var) {
        this.f159672a = t1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d85) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        if (c11738x6e2c0d85 != null && (o6Var = this.f159672a.f159676v) != null && o6Var.f156336n.equals(c11738x6e2c0d85.f158465d) && this.f159672a.f159676v.f156338p.f158814g == c11738x6e2c0d85.f158466e && c11738x6e2c0d85.f158467f == 16 && c11738x6e2c0d85.f158468g == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t1 t1Var = this.f159672a;
            if (t1Var.u()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onVOIPStateChanged, already add this float ball, so update state");
                t1Var.b0(t1Var.t0());
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "onVOIPStateChanged, add passive float ball");
            t1Var.a0(true);
            t1Var.W(false);
            t1Var.b0(t1Var.t0());
            t1Var.j();
        }
    }
}
