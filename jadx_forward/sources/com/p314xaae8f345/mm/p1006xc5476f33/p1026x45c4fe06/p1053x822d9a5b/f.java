package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public final class f implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i f159621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f159622b;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i iVar, int i17) {
        this.f159621a = iVar;
        this.f159622b = i17;
    }

    @Override // qp1.k0
    public final void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i iVar = this.f159621a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f159633w, "onCheckResult#onClose, isOk: " + h17);
        if (h17) {
            iVar.t0(this.f159622b);
            return;
        }
        iVar.d();
        iVar.f174772n.q(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.i.f161607b.c(iVar.f159632v);
        if (c17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.s.n8(c17, false, 1, null);
        }
    }
}
