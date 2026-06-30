package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 f162923d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 c1Var) {
        this.f162923d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.c1 c1Var = this.f162923d;
        if (c1Var.f162928b == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - c1Var.f162927a;
        if (currentTimeMillis >= 3000) {
            c1Var.f162928b.mo147359x63a3b28a();
            c1Var.f162928b = null;
            c1Var.f162930d = null;
        } else {
            java.lang.Runnable runnable = c1Var.f162930d;
            if (runnable != null) {
                c1Var.f162929c.mo50300x3fa464aa(runnable);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.z0(this);
            c1Var.f162930d = z0Var;
            c1Var.f162929c.mo50297x7c4d7ca2(z0Var, 3000 - currentTimeMillis);
        }
    }
}
