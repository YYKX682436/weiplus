package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class j1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.m1 f101192d;

    public j1(com.tencent.mm.plugin.fav.ui.m1 m1Var) {
        this.f101192d = m1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.tencent.mm.plugin.fav.ui.m1 m1Var = this.f101192d;
        if (m1Var.f101254b == null) {
            return;
        }
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) m1Var.f101254b.getLayoutParams();
        layoutParams.leftMargin = (int) (m1Var.f101260h * floatValue);
        layoutParams.topMargin = (int) (m1Var.f101261i * floatValue);
        layoutParams.rightMargin = (int) (((m1Var.f101255c.getWidth() * floatValue) - (m1Var.f101258f * floatValue)) - layoutParams.leftMargin);
        layoutParams.bottomMargin = (int) (((m1Var.f101255c.getHeight() * floatValue) - (m1Var.f101259g * floatValue)) - layoutParams.topMargin);
        m1Var.f101254b.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.fav.ui.l1 l1Var = m1Var.f101257e;
        if (l1Var == null || l1Var.W() == null) {
            return;
        }
        com.tencent.mm.ui.base.MultiTouchImageView W = m1Var.f101257e.W();
        float f17 = 1.0f - floatValue;
        W.setTranslationX(m1Var.f101264l * f17);
        W.setTranslationY(m1Var.f101265m * f17);
        W.setScaleX((m1Var.f101262j * f17) + floatValue);
        W.setScaleY((m1Var.f101263k * f17) + floatValue);
        m1Var.f101256d.setAlpha(f17);
        float f18 = m1Var.f101264l;
        float f19 = m1Var.f101265m;
        float f27 = m1Var.f101262j;
        float f28 = m1Var.f101263k;
    }
}
