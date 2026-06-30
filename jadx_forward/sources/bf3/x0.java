package bf3;

/* loaded from: classes5.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bf3.x0 f101207a = new bf3.x0();

    public final android.graphics.Point a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Point point = new android.graphics.Point();
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.view.WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            point.x = currentWindowMetrics.getBounds().width();
            point.y = currentWindowMetrics.getBounds().height();
            android.graphics.Insets insets = windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(android.view.WindowInsets.Type.navigationBars());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(insets, "getInsets(...)");
            point.x -= java.lang.Math.abs(insets.right - insets.left);
            point.y -= java.lang.Math.abs(insets.bottom - insets.top);
        } else {
            windowManager.getDefaultDisplay().getSize(point);
        }
        return point;
    }
}
