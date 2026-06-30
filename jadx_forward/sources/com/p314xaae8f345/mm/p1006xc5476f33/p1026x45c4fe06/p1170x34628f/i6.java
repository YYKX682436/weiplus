package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f168286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168287e;

    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        this.f168287e = v5Var;
        this.f168286d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168287e;
        if (v5Var.r1() == null) {
            return;
        }
        al1.b r17 = v5Var.r1();
        int i17 = this.f168286d;
        r17.mo2219xf502931e(i17);
        v5Var.f3((i17 == -1 ? al1.j0.WHITE : al1.j0.BLACK).name());
    }
}
