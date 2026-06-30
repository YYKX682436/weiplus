package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 f232858d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var) {
        this.f232858d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = this.f232858d;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R6 = s1Var.R6();
        if (R6 != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i3(R6, s1Var.f232954o, false));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R62 = s1Var.R6();
        if (R62 != null) {
            R62.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R63 = s1Var.R6();
        if (R63 != null) {
            R63.animate().cancel();
            R63.animate().alpha(1.0f).start();
        }
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(s1Var.m158354x19263085(), 7, r45.bt4.class);
        java.lang.Integer valueOf = bt4Var != null ? java.lang.Integer.valueOf(bt4Var.f452582t + 1) : null;
        r45.bt4 bt4Var2 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(s1Var.m158354x19263085(), 7, r45.bt4.class);
        if (bt4Var2 != null) {
            bt4Var2.f452582t = valueOf.intValue();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        s1Var.f232958s = android.os.SystemClock.elapsedRealtime();
    }
}
