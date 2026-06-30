package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 f169041d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var) {
        this.f169041d = o0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f169041d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "transferTo, run pendingCancelableShowTask");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.z3 z3Var = o0Var.f169074x;
        java.lang.String str = o0Var.f169051a;
        if (z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferTo, pendingCancelableShowTask is null");
            return;
        }
        z3Var.a();
        if (!(o0Var.f169074x.f172172g.get() <= 0) && (runnable = o0Var.f169074x.f172170e) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferTo, run extraTask");
            runnable.run();
        }
        o0Var.f169074x = null;
    }
}
