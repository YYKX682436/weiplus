package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Landroidx/window/layout/ActivityCompatHelperApi30;", "", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroid/app/Activity;", "maximumWindowBounds", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class ActivityCompatHelperApi30 {
    public static final androidx.window.layout.ActivityCompatHelperApi30 INSTANCE = new androidx.window.layout.ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final android.graphics.Rect currentWindowBounds(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.graphics.Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        kotlin.jvm.internal.o.f(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final android.graphics.Rect maximumWindowBounds(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.graphics.Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        kotlin.jvm.internal.o.f(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
