package com.google.android.material.appbar;

/* loaded from: classes15.dex */
public class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.appbar.CollapsingToolbarLayout f44342d;

    public i(com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f44342d = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f44342d.setScrimAlpha(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
