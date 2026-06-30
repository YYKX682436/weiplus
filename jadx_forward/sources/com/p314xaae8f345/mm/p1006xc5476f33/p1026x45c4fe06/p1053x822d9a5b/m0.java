package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class m0 implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.p0 f159653b;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.p0 p0Var, int i17) {
        this.f159653b = p0Var;
        this.f159652a = i17;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, checkFloatBallPermission isOK:%b", java.lang.Boolean.valueOf(h17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.p0 p0Var = this.f159653b;
        if (h17) {
            p0Var.t0(this.f159652a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandLocationFloatBallHelper", "onClose, refuse permission, remove ball and stop location");
        p0Var.d();
        p0Var.u0();
        p0Var.f174772n.q(true);
    }
}
