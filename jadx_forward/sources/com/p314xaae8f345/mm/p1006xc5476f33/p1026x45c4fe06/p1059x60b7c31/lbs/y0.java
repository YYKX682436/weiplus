package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f163047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 f163048e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f163048e = c1Var;
        this.f163047d = c11510xdd90c2f2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 c1Var = this.f163048e;
        java.lang.Runnable runnable = c1Var.f162930d;
        if (runnable != null) {
            c1Var.f162929c.mo50300x3fa464aa(runnable);
            c1Var.f162930d = null;
        }
        if (c1Var.f162928b != null) {
            c1Var.f162927a = java.lang.System.currentTimeMillis();
        } else {
            c1Var.f162928b = mi1.c.a(this.f163047d).h(mi1.d.LBS);
            c1Var.f162927a = java.lang.System.currentTimeMillis();
        }
    }
}
