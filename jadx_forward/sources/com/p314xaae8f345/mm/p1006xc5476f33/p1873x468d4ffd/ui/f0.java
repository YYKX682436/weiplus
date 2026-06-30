package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class f0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f230857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 f230858e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360, long j17) {
        this.f230858e = c16551xff789360;
        this.f230857d = j17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360 = this.f230858e;
        if (c16551xff789360.f230727d > 0 && this.f230857d <= 500 && !c16551xff789360.f230734n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "on Simple Tap, isDispatchSimpleTap: %s, isDispatchLongPress: %s", java.lang.Boolean.valueOf(c16551xff789360.f230733m), java.lang.Boolean.valueOf(c16551xff789360.f230734n));
            c16551xff789360.f230733m = true;
            if (c16551xff789360.f230734n) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360.a(c16551xff789360);
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.j0 j0Var = c16551xff789360.f230745y;
            if (j0Var != null) {
                j0Var.a();
                return;
            }
            return;
        }
        if (c16551xff789360.f230734n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "on Long Press finish ，isRecordIng:%b", java.lang.Boolean.valueOf(c16551xff789360.f230732i));
            if (c16551xff789360.f230732i) {
                c16551xff789360.f230732i = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0 h0Var = c16551xff789360.f230746z;
            if (h0Var != null) {
                h0Var.c();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "error action up");
        if (c16551xff789360.f230732i) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360.a(c16551xff789360);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.g0 g0Var = c16551xff789360.B;
        if (g0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.k3 k3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.k3) g0Var;
            k3Var.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TestCaptureUiEvent", "onErrorUp: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = k3Var.f230890a;
            ei3.m mVar = activityC16554x70dcab5d.f230768m;
            if (mVar != null) {
                mVar.mo127742xae7a2e7a();
                if (activityC16554x70dcab5d.f230761d == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d.T6(activityC16554x70dcab5d);
                }
            }
        }
    }
}
