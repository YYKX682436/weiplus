package com.google.android.material.bottomappbar;

/* loaded from: classes15.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f44374d;

    public b(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar) {
        this.f44374d = bottomAppBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.google.android.material.bottomappbar.BottomAppBar bottomAppBar = this.f44374d;
        bottomAppBar.f44365x0.f44388e = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        bottomAppBar.f44363p0.invalidateSelf();
    }
}
