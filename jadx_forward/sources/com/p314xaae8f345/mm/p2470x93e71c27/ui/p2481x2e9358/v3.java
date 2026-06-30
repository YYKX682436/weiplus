package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class v3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272224d;

    public v3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272224d = c19666xfd6e2f33;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272224d;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c19666xfd6e2f33.R4.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) c19666xfd6e2f33.S4.getLayoutParams();
        if (c19666xfd6e2f33.f271552l5 == valueAnimator) {
            layoutParams.width = com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.width = com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (c19666xfd6e2f33.f271558m5 == valueAnimator) {
            layoutParams.height = com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.height = com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (c19666xfd6e2f33.f271564n5 == valueAnimator) {
            layoutParams.topMargin = com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.topMargin = com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (c19666xfd6e2f33.f271570o5 == valueAnimator) {
            layoutParams.rightMargin = com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.rightMargin = com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (c19666xfd6e2f33.f271578p5 == valueAnimator) {
            layoutParams.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
            layoutParams2.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(c19666xfd6e2f33.getContext(), ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        }
        c19666xfd6e2f33.R4.setLayoutParams(layoutParams);
        c19666xfd6e2f33.S4.setLayoutParams(layoutParams2);
    }
}
