package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class k1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.m1 f101212d;

    public k1(com.tencent.mm.plugin.fav.ui.m1 m1Var) {
        this.f101212d = m1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        com.tencent.mm.plugin.fav.ui.m1 m1Var = this.f101212d;
        com.tencent.mm.ui.MMActivity mMActivity = m1Var.f101253a;
        if (mMActivity == null) {
            return;
        }
        mMActivity.finish();
        m1Var.f101253a.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.ui.base.MultiTouchImageView W;
        super.onAnimationStart(animator);
        com.tencent.mm.plugin.fav.ui.m1 m1Var = this.f101212d;
        com.tencent.mm.plugin.fav.ui.l1 l1Var = m1Var.f101257e;
        if (l1Var == null || (W = l1Var.W()) == null) {
            return;
        }
        if (W.getScale() > 1.0f) {
            W.i();
        }
        m1Var.f101264l = W.getTranslationX();
        m1Var.f101265m = W.getTranslationY();
        m1Var.f101262j = W.getScaleX();
        m1Var.f101263k = W.getScaleY();
        W.getScale();
        float f17 = m1Var.f101264l;
        float f18 = m1Var.f101265m;
        float f19 = m1Var.f101262j;
        float f27 = m1Var.f101263k;
    }
}
