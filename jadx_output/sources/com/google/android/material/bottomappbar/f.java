package com.google.android.material.bottomappbar;

/* loaded from: classes15.dex */
public class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f44382d;

    public f(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar) {
        this.f44382d = bottomAppBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        la.c cVar = this.f44382d.f44363p0;
        cVar.f317432o = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        cVar.invalidateSelf();
    }
}
