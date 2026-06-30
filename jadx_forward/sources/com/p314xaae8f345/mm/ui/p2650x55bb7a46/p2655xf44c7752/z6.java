package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.a7 f283143d;

    public z6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.a7 a7Var) {
        this.f283143d = a7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.a7 a7Var = this.f283143d;
        if (a7Var.f282318a != null) {
            if (a7Var.f282319b) {
                h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
                java.lang.String Q0 = a7Var.f282318a.Q0();
                long m124847x74d37ac6 = a7Var.f282318a.m124847x74d37ac6();
                h90.a[] aVarArr = h90.a.f361204d;
                ((g90.u) wVar).Zi(Q0, m124847x74d37ac6, 1);
            } else {
                h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
                java.lang.String Q02 = a7Var.f282318a.Q0();
                long m124847x74d37ac62 = a7Var.f282318a.m124847x74d37ac6();
                h90.a[] aVarArr2 = h90.a.f361204d;
                ((g90.u) wVar2).Zi(Q02, m124847x74d37ac62, 4);
            }
        }
        java.lang.Runnable runnable = a7Var.f282320c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
