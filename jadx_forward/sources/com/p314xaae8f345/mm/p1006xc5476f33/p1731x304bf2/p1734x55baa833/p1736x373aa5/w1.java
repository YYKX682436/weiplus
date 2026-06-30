package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes5.dex */
public class w1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y1 f220864d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y1 y1Var) {
        this.f220864d = y1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y1 y1Var = this.f220864d;
        android.view.ViewGroup.LayoutParams layoutParams = y1Var.f220891d.f220480q.getLayoutParams();
        layoutParams.width = intValue;
        y1Var.f220891d.f220480q.setLayoutParams(layoutParams);
        y1Var.f220891d.f220480q.setAlpha(intValue / r0.A);
    }
}
