package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class z0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.w1 f226500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 f226501b;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.w1 w1Var) {
        this.f226501b = x1Var;
        this.f226500a = w1Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = this.f226501b;
        x1Var.Q = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.w1 w1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.w1.OPENED;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.w1 w1Var2 = this.f226500a;
        if (w1Var == w1Var2) {
            x1Var.S = true;
            if (x1Var.f226453J) {
                if (x1Var.T1) {
                    x1Var.T1 = false;
                } else {
                    x1Var.C();
                }
            }
        } else {
            x1Var.S = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1.p(x1Var);
            if (x1Var.f226453J) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1.o(x1Var, x1Var.f226465t.f226293f);
            }
        }
        x1Var.B(w1Var2);
        x1Var.L.clearAnimation();
        x1Var.f226467v.clearAnimation();
        x1Var.T.clearAnimation();
        if (x1Var.U1) {
            x1Var.U1 = false;
            if (x1Var.f226465t.f226297m.equals(x1Var.K) && x1Var.f226465t.f226299o) {
                x1Var.z();
            } else {
                x1Var.K1 = true;
                x1Var.w(false);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = this.f226501b;
        x1Var.Q = false;
        x1Var.R = true;
    }
}
