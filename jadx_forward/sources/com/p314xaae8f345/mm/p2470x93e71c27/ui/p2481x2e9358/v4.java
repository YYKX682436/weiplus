package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class v4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272225d;

    public v4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272225d = c19666xfd6e2f33;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272225d;
        android.view.ViewGroup.LayoutParams layoutParams = c19666xfd6e2f33.f271560n.getLayoutParams();
        layoutParams.width = intValue;
        c19666xfd6e2f33.f271560n.setLayoutParams(layoutParams);
        int i17 = c19666xfd6e2f33.R5;
        c19666xfd6e2f33.f271560n.setAlpha((intValue - i17) / (c19666xfd6e2f33.Q5 - i17));
        c19666xfd6e2f33.Y0(java.lang.Boolean.FALSE);
    }
}
