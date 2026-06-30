package com.google.android.material.behavior;

/* loaded from: classes14.dex */
public class SwipeDismissBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {

    /* renamed from: d, reason: collision with root package name */
    public androidx.customview.widget.l f44355d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44356e;

    /* renamed from: f, reason: collision with root package name */
    public int f44357f = 2;

    /* renamed from: g, reason: collision with root package name */
    public final float f44358g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public float f44359h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f44360i = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.customview.widget.k f44361m = new x9.b(this);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17 = this.f44356e;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z17 = coordinatorLayout.q(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f44356e = z17;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f44356e = false;
        }
        if (!z17) {
            return false;
        }
        if (this.f44355d == null) {
            this.f44355d = new androidx.customview.widget.l(coordinatorLayout.getContext(), coordinatorLayout, this.f44361m);
        }
        return this.f44355d.t(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean x(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        androidx.customview.widget.l lVar = this.f44355d;
        if (lVar == null) {
            return false;
        }
        lVar.m(motionEvent);
        return true;
    }

    public boolean y(android.view.View view) {
        return true;
    }
}
