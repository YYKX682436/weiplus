package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class w1 extends al5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 f168723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f168724b;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 x1Var, java.lang.Runnable runnable) {
        this.f168723a = x1Var;
        this.f168724b = runnable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f168723a.f168775J = null;
        java.lang.Runnable runnable = this.f168724b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
