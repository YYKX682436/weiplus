package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p246x5a0eb252;

/* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior */
/* loaded from: classes15.dex */
public class C2683xf9e73e90<V extends android.view.View> extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior<V> {

    /* renamed from: d, reason: collision with root package name */
    public int f125885d;

    /* renamed from: e, reason: collision with root package name */
    public int f125886e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f125887f;

    public C2683xf9e73e90() {
        this.f125885d = 0;
        this.f125886e = 2;
    }

    public void A(android.view.View view) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f125887f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f125886e = 2;
        y(view, 0, 225L, w9.a.f525570d);
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
        this.f125885d = view.getMeasuredHeight();
        return false;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void m(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17, int i18, int i19, int i27) {
        int i28 = this.f125886e;
        if (i28 != 1 && i18 > 0) {
            z(view);
        } else {
            if (i28 == 2 || i18 >= 0) {
                return;
            }
            A(view);
        }
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean t(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, android.view.View view3, int i17) {
        return i17 == 2;
    }

    public final void y(android.view.View view, int i17, long j17, android.animation.TimeInterpolator timeInterpolator) {
        this.f125887f = view.animate().translationY(i17).setInterpolator(timeInterpolator).setDuration(j17).setListener(new x9.a(this));
    }

    public void z(android.view.View view) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f125887f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f125886e = 1;
        y(view, this.f125885d, 175L, w9.a.f525569c);
    }

    public C2683xf9e73e90(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f125885d = 0;
        this.f125886e = 2;
    }
}
