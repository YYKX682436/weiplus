package com.google.android.material.appbar;

/* loaded from: classes15.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f44338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout f44339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout.BaseBehavior f44340f;

    public b(com.google.android.material.appbar.AppBarLayout.BaseBehavior baseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
        this.f44340f = baseBehavior;
        this.f44338d = coordinatorLayout;
        this.f44339e = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f44340f.G(this.f44338d, this.f44339e, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
