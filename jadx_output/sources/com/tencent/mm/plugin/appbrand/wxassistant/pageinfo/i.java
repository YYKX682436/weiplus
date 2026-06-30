package com.tencent.mm.plugin.appbrand.wxassistant.pageinfo;

/* loaded from: classes7.dex */
public abstract class i implements android.view.WindowManager {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f92292d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.d f92293e;

    public i(android.view.WindowManager windowManager, com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.d dVar) {
        this.f92292d = windowManager;
        this.f92293e = dVar;
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(java.util.function.Consumer consumer) {
        this.f92292d.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.d dVar = this.f92293e;
        if (dVar == null) {
            io.flutter.Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            dVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public android.view.WindowMetrics getCurrentWindowMetrics() {
        return this.f92292d.getCurrentWindowMetrics();
    }

    @Override // android.view.WindowManager
    public android.view.Display getDefaultDisplay() {
        return this.f92292d.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public android.view.WindowMetrics getMaximumWindowMetrics() {
        return this.f92292d.getMaximumWindowMetrics();
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        return this.f92292d.isCrossWindowBlurEnabled();
    }

    @Override // android.view.WindowManager
    public void removeCrossWindowBlurEnabledListener(java.util.function.Consumer consumer) {
        this.f92292d.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void removeView(android.view.View view) {
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.d dVar = this.f92293e;
        if (dVar == null) {
            io.flutter.Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            dVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(android.view.View view) {
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.d dVar = this.f92293e;
        if (dVar == null) {
            io.flutter.Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            dVar.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.d dVar = this.f92293e;
        if (dVar == null) {
            io.flutter.Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            dVar.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(java.util.concurrent.Executor executor, java.util.function.Consumer consumer) {
        this.f92292d.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
