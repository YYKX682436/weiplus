package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 f258446d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var) {
        this.f258446d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = this.f258446d;
        int i17 = g1Var.W + 1;
        g1Var.W = i17;
        if (g1Var.f258065x.B1 != 0 || i17 > 10) {
            g1Var.n();
            wu5.c cVar = g1Var.V;
            if (cVar != null) {
                cVar.cancel(false);
                g1Var.V = null;
            }
        }
    }
}
