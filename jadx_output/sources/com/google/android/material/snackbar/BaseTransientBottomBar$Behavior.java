package com.google.android.material.snackbar;

/* loaded from: classes14.dex */
public class BaseTransientBottomBar$Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {

    /* renamed from: n, reason: collision with root package name */
    public final ma.a f44531n = new ma.a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        this.f44531n.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (ma.g.f325127b == null) {
                    ma.g.f325127b = new ma.g();
                }
                synchronized (ma.g.f325127b.f325128a) {
                }
            }
        } else if (coordinatorLayout.q(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (ma.g.f325127b == null) {
                ma.g.f325127b = new ma.g();
            }
            synchronized (ma.g.f325127b.f325128a) {
            }
        }
        return super.e(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean y(android.view.View view) {
        this.f44531n.getClass();
        return view instanceof ma.e;
    }
}
