package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class u0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.w0 f159697a;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.w0 w0Var) {
        this.f159697a = w0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d85) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        if (c11738x6e2c0d85 != null && (o6Var = this.f159697a.f159700v) != null && o6Var.f156336n.equals(c11738x6e2c0d85.f158465d) && this.f159697a.f159700v.f156338p.f158814g == c11738x6e2c0d85.f158466e && c11738x6e2c0d85.f158467f == 4 && c11738x6e2c0d85.f158468g == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.w0 w0Var = this.f159697a;
            if (w0Var.u()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onVOIPStateChanged, already add this float ball, so update state");
                w0Var.b0(w0Var.t0());
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onVOIPStateChanged, add passive float ball");
            w0Var.a0(true);
            w0Var.W(true);
            w0Var.b0(w0Var.t0());
            w0Var.j();
        }
    }
}
