package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.SingleViewWindowManager */
/* loaded from: classes7.dex */
abstract class AbstractWindowManagerC28735xfd755370 implements android.view.WindowManager {
    private static final java.lang.String TAG = "PlatformViewsController";

    /* renamed from: delegate */
    final android.view.WindowManager f71872x30d5dd85;

    /* renamed from: fakeWindowRootView */
    io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28733xc74af448 f71873x7d5ee96c;

    public AbstractWindowManagerC28735xfd755370(android.view.WindowManager windowManager, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28733xc74af448 c28733xc74af448) {
        this.f71872x30d5dd85 = windowManager;
        this.f71873x7d5ee96c = c28733xc74af448;
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> consumer) {
        this.f71872x30d5dd85.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28733xc74af448 c28733xc74af448 = this.f71873x7d5ee96c;
        if (c28733xc74af448 == null) {
            io.p3284xd2ae381c.Log.w(TAG, "Embedded view called addView while detached from presentation");
        } else {
            c28733xc74af448.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public android.view.WindowMetrics getCurrentWindowMetrics() {
        return this.f71872x30d5dd85.getCurrentWindowMetrics();
    }

    @Override // android.view.WindowManager
    @java.lang.Deprecated
    public android.view.Display getDefaultDisplay() {
        return this.f71872x30d5dd85.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public android.view.WindowMetrics getMaximumWindowMetrics() {
        return this.f71872x30d5dd85.getMaximumWindowMetrics();
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        return this.f71872x30d5dd85.isCrossWindowBlurEnabled();
    }

    @Override // android.view.WindowManager
    public void removeCrossWindowBlurEnabledListener(java.util.function.Consumer<java.lang.Boolean> consumer) {
        this.f71872x30d5dd85.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public void removeView(android.view.View view) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28733xc74af448 c28733xc74af448 = this.f71873x7d5ee96c;
        if (c28733xc74af448 == null) {
            io.p3284xd2ae381c.Log.w(TAG, "Embedded view called removeView while detached from presentation");
        } else {
            c28733xc74af448.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(android.view.View view) {
        if (this.f71873x7d5ee96c == null) {
            io.p3284xd2ae381c.Log.w(TAG, "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            this.f71873x7d5ee96c.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28733xc74af448 c28733xc74af448 = this.f71873x7d5ee96c;
        if (c28733xc74af448 == null) {
            io.p3284xd2ae381c.Log.w(TAG, "Embedded view called updateViewLayout while detached from presentation");
        } else {
            c28733xc74af448.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public void addCrossWindowBlurEnabledListener(java.util.concurrent.Executor executor, java.util.function.Consumer<java.lang.Boolean> consumer) {
        this.f71872x30d5dd85.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
