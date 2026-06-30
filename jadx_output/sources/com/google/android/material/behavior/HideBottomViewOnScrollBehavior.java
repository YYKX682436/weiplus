package com.google.android.material.behavior;

/* loaded from: classes15.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {

    /* renamed from: d, reason: collision with root package name */
    public int f44352d;

    /* renamed from: e, reason: collision with root package name */
    public int f44353e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f44354f;

    public HideBottomViewOnScrollBehavior() {
        this.f44352d = 0;
        this.f44353e = 2;
    }

    public void A(android.view.View view) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f44354f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f44353e = 2;
        y(view, 0, 225L, w9.a.f444037d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
        this.f44352d = view.getMeasuredHeight();
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void m(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i17, int i18, int i19, int i27) {
        int i28 = this.f44353e;
        if (i28 != 1 && i18 > 0) {
            z(view);
        } else {
            if (i28 == 2 || i18 >= 0) {
                return;
            }
            A(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean t(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i17) {
        return i17 == 2;
    }

    public final void y(android.view.View view, int i17, long j17, android.animation.TimeInterpolator timeInterpolator) {
        this.f44354f = view.animate().translationY(i17).setInterpolator(timeInterpolator).setDuration(j17).setListener(new x9.a(this));
    }

    public void z(android.view.View view) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f44354f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f44353e = 1;
        y(view, this.f44352d, 175L, w9.a.f444036c);
    }

    public HideBottomViewOnScrollBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44352d = 0;
        this.f44353e = 2;
    }
}
