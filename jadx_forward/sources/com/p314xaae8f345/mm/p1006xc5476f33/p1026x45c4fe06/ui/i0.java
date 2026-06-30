package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f171302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j0 f171303e;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j0 j0Var, boolean z17) {
        this.f171303e = j0Var;
        this.f171302d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f171302d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j0 j0Var = this.f171303e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.Z6(j0Var.f171331b.f171350e, j0Var.f171330a);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.k0 k0Var = j0Var.f171331b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.Z6(k0Var.f171350e, k0Var.f171349d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257 = j0Var.f171331b.f171350e;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = activityC12636x4eed9257.f170843p;
        if (c21560x1fce98fb != null) {
            if (activityC12636x4eed9257.f170848u.f469593f != 1) {
                c21560x1fce98fb.G(com.p314xaae8f345.mm.R.C30867xcad56011.f571595ju);
            } else {
                c21560x1fce98fb.G(com.p314xaae8f345.mm.R.C30867xcad56011.f571594jt);
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) j0Var.f171331b.f171350e.f170841n).notifyDataSetChanged();
    }
}
