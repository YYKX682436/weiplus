package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w6 f171809d;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w6 w6Var) {
        this.f171809d = w6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w6 w6Var = this.f171809d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = w6Var.f171835b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        w6Var.a();
    }
}
