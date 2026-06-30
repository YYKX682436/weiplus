package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f171227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g0 f171228e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g0 g0Var, boolean z17) {
        this.f171228e = g0Var;
        this.f171227d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f171227d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g0 g0Var = this.f171228e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.Y6(g0Var.f171255b.f171280e, g0Var.f171254a);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.h0 h0Var = g0Var.f171255b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.Y6(h0Var.f171280e, h0Var.f171279d);
        }
        g0Var.f171255b.f171280e.q7();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) g0Var.f171255b.f171280e.f170841n).notifyDataSetChanged();
    }
}
