package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q5 f168409d;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q5 q5Var) {
        this.f168409d = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 x1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q5 q5Var = this.f168409d;
        if (q5Var.f168568d && (x1Var = q5Var.f168569e.N) != null) {
            x1Var.cancel();
            q5Var.f168569e.N = null;
        }
        q5Var.f168565a.mo52131xae7a2e7a();
    }
}
