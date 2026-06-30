package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class s0 implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.w0 f159674b;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.w0 w0Var, int i17) {
        this.f159674b = w0Var;
        this.f159673a = i17;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCloseAfterCheckingTip, checkFloatBallPermission isOK:%b", java.lang.Boolean.valueOf(h17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.w0 w0Var = this.f159674b;
        if (h17) {
            w0Var.v0(this.f159673a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "onCloseAfterCheckingTip, refuse permission, remove ball and stop voip");
        w0Var.d();
        w0Var.y0();
        w0Var.f174772n.q(true);
    }
}
