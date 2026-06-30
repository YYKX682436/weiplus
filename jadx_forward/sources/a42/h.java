package a42;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final a42.h f82740a = new a42.h();

    public final float a(android.content.Context context, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return (f17 * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
    }
}
