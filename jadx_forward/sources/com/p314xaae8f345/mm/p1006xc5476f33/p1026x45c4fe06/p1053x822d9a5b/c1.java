package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class c1 implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 f159609b;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var, int i17) {
        this.f159609b = k1Var;
        this.f159608a = i17;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        boolean h17 = j0Var.h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159609b.f159640v, "onClose, checkFloatBallPermission isOK:%b", java.lang.Boolean.valueOf(h17));
        if (h17) {
            this.f159609b.B0(this.f159608a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1.u0(this.f159609b, true);
            if (this.f159609b.B) {
                return;
            }
            this.f159609b.d();
            this.f159609b.A = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1.t0(this.f159609b);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f159609b.f159640v, "onClose, refuse permission, remove ball and stop background play");
        this.f159609b.d();
        this.f159609b.A = false;
        this.f159609b.B = false;
        this.f159609b.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1.u0(this.f159609b, false);
        this.f159609b.f174772n.q(true);
    }
}
