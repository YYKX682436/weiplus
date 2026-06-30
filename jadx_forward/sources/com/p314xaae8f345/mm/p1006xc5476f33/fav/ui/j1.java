package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class j1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 f182725d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 m1Var) {
        this.f182725d = m1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 m1Var = this.f182725d;
        if (m1Var.f182787b == null) {
            return;
        }
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) m1Var.f182787b.getLayoutParams();
        layoutParams.leftMargin = (int) (m1Var.f182793h * floatValue);
        layoutParams.topMargin = (int) (m1Var.f182794i * floatValue);
        layoutParams.rightMargin = (int) (((m1Var.f182788c.getWidth() * floatValue) - (m1Var.f182791f * floatValue)) - layoutParams.leftMargin);
        layoutParams.bottomMargin = (int) (((m1Var.f182788c.getHeight() * floatValue) - (m1Var.f182792g * floatValue)) - layoutParams.topMargin);
        m1Var.f182787b.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1 l1Var = m1Var.f182790e;
        if (l1Var == null || l1Var.W() == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a W = m1Var.f182790e.W();
        float f17 = 1.0f - floatValue;
        W.setTranslationX(m1Var.f182797l * f17);
        W.setTranslationY(m1Var.f182798m * f17);
        W.setScaleX((m1Var.f182795j * f17) + floatValue);
        W.setScaleY((m1Var.f182796k * f17) + floatValue);
        m1Var.f182789d.setAlpha(f17);
        float f18 = m1Var.f182797l;
        float f19 = m1Var.f182798m;
        float f27 = m1Var.f182795j;
        float f28 = m1Var.f182796k;
    }
}
