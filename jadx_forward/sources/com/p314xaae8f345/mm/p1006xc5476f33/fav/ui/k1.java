package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class k1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 f182745d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 m1Var) {
        this.f182745d = m1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 m1Var = this.f182745d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m1Var.f182786a;
        if (abstractActivityC21394xb3d2c0cf == null) {
            return;
        }
        abstractActivityC21394xb3d2c0cf.finish();
        m1Var.f182786a.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a W;
        super.onAnimationStart(animator);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 m1Var = this.f182745d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1 l1Var = m1Var.f182790e;
        if (l1Var == null || (W = l1Var.W()) == null) {
            return;
        }
        if (W.mo45732x7520af94() > 1.0f) {
            W.i();
        }
        m1Var.f182797l = W.getTranslationX();
        m1Var.f182798m = W.getTranslationY();
        m1Var.f182795j = W.getScaleX();
        m1Var.f182796k = W.getScaleY();
        W.mo45732x7520af94();
        float f17 = m1Var.f182797l;
        float f18 = m1Var.f182798m;
        float f19 = m1Var.f182795j;
        float f27 = m1Var.f182796k;
    }
}
