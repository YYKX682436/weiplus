package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd;

/* loaded from: classes7.dex */
public abstract class i implements android.view.WindowManager {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f173825d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.d f173826e;

    public i(android.view.WindowManager windowManager, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.d dVar) {
        this.f173825d = windowManager;
        this.f173826e = dVar;
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(java.util.function.Consumer consumer) {
        this.f173825d.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.d dVar = this.f173826e;
        if (dVar == null) {
            io.p3284xd2ae381c.Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            dVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public android.view.WindowMetrics getCurrentWindowMetrics() {
        return this.f173825d.getCurrentWindowMetrics();
    }

    @Override // android.view.WindowManager
    public android.view.Display getDefaultDisplay() {
        return this.f173825d.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public android.view.WindowMetrics getMaximumWindowMetrics() {
        return this.f173825d.getMaximumWindowMetrics();
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        return this.f173825d.isCrossWindowBlurEnabled();
    }

    @Override // android.view.WindowManager
    public void removeCrossWindowBlurEnabledListener(java.util.function.Consumer consumer) {
        this.f173825d.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void removeView(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.d dVar = this.f173826e;
        if (dVar == null) {
            io.p3284xd2ae381c.Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            dVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.d dVar = this.f173826e;
        if (dVar == null) {
            io.p3284xd2ae381c.Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            dVar.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.d dVar = this.f173826e;
        if (dVar == null) {
            io.p3284xd2ae381c.Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            dVar.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(java.util.concurrent.Executor executor, java.util.function.Consumer consumer) {
        this.f173825d.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
