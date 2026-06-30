package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Landroidx/window/layout/ActivityCompatHelperApi30;", "", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroid/app/Activity;", "maximumWindowBounds", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.layout.ActivityCompatHelperApi30 */
/* loaded from: classes13.dex */
public final class C1228x7a5cda98 {

    /* renamed from: INSTANCE */
    public static final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1228x7a5cda98 f3859x4fbc8495 = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1228x7a5cda98();

    private C1228x7a5cda98() {
    }

    /* renamed from: currentWindowBounds */
    public final android.graphics.Rect m8523xfc77aede(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.graphics.Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    /* renamed from: maximumWindowBounds */
    public final android.graphics.Rect m8524x15eae505(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.graphics.Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
