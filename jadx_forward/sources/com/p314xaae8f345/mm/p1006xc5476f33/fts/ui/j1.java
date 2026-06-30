package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class j1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 f219614d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78) {
        this.f219614d = abstractActivityC15595x3a75f78;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = this.f219614d;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) abstractActivityC15595x3a75f78.f219472z.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) abstractActivityC15595x3a75f78.A.getLayoutParams();
        if (abstractActivityC15595x3a75f78.M == valueAnimator) {
            layoutParams.width = com.p314xaae8f345.mm.ui.zk.a(abstractActivityC15595x3a75f78.mo55332x76847179(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.width = com.p314xaae8f345.mm.ui.zk.a(abstractActivityC15595x3a75f78.mo55332x76847179(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (abstractActivityC15595x3a75f78.N == valueAnimator) {
            layoutParams.height = com.p314xaae8f345.mm.ui.zk.a(abstractActivityC15595x3a75f78.mo55332x76847179(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.height = com.p314xaae8f345.mm.ui.zk.a(abstractActivityC15595x3a75f78.mo55332x76847179(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (abstractActivityC15595x3a75f78.P == valueAnimator) {
            layoutParams.topMargin = com.p314xaae8f345.mm.ui.zk.a(abstractActivityC15595x3a75f78.mo55332x76847179(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.topMargin = com.p314xaae8f345.mm.ui.zk.a(abstractActivityC15595x3a75f78.mo55332x76847179(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (abstractActivityC15595x3a75f78.Q == valueAnimator) {
            layoutParams.rightMargin = com.p314xaae8f345.mm.ui.zk.a(abstractActivityC15595x3a75f78.mo55332x76847179(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.rightMargin = com.p314xaae8f345.mm.ui.zk.a(abstractActivityC15595x3a75f78.mo55332x76847179(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (abstractActivityC15595x3a75f78.R == valueAnimator) {
            layoutParams.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(abstractActivityC15595x3a75f78.mo55332x76847179(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(abstractActivityC15595x3a75f78.mo55332x76847179(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        abstractActivityC15595x3a75f78.f219472z.setLayoutParams(layoutParams);
        abstractActivityC15595x3a75f78.A.setLayoutParams(layoutParams2);
    }
}
