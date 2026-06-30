package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 f171430d;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var) {
        this.f171430d = w4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w4 w4Var = this.f171430d;
        if (w4Var.Q) {
            return;
        }
        w4Var.T = true;
        w4Var.N.setVisibility(0);
        w4Var.H.f();
    }
}
