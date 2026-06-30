package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class b implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d f159602b;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d dVar, int i17) {
        this.f159602b = dVar;
        this.f159601a = i17;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159602b.f159610v, "onClose, checkFloatBallPermission isOK:%b", java.lang.Boolean.valueOf(h17));
        if (h17) {
            this.f159602b.w0(this.f159601a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d.t0(this.f159602b, true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f159602b.f159610v, "onClose, refuse permission, remove ball and stop background play");
        this.f159602b.d();
        this.f159602b.f159613y = false;
        this.f159602b.v0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.d.t0(this.f159602b, false);
        this.f159602b.f174772n.q(true);
    }
}
