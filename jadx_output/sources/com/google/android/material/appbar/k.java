package com.google.android.material.appbar;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.coordinatorlayout.widget.CoordinatorLayout f44344d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f44345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.appbar.HeaderBehavior f44346f;

    public k(com.google.android.material.appbar.HeaderBehavior headerBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        this.f44346f = headerBehavior;
        this.f44344d = coordinatorLayout;
        this.f44345e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.google.android.material.appbar.HeaderBehavior headerBehavior;
        android.widget.OverScroller overScroller;
        android.view.View view = this.f44345e;
        if (view == null || (overScroller = (headerBehavior = this.f44346f).f44325g) == null) {
            return;
        }
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.f44344d;
        if (!computeScrollOffset) {
            headerBehavior.F(coordinatorLayout, view);
            return;
        }
        headerBehavior.G(coordinatorLayout, view, headerBehavior.f44325g.getCurrY());
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.m(view, this);
    }
}
