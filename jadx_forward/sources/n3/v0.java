package n3;

/* loaded from: classes13.dex */
public abstract class v0 {
    public static int a() {
        return android.view.View.generateViewId();
    }

    public static android.view.Display b(android.view.View view) {
        return view.getDisplay();
    }

    public static int c(android.view.View view) {
        return view.getLabelFor();
    }

    public static int d(android.view.View view) {
        return view.getLayoutDirection();
    }

    public static int e(android.view.View view) {
        return view.getPaddingEnd();
    }

    public static int f(android.view.View view) {
        return view.getPaddingStart();
    }

    public static boolean g(android.view.View view) {
        return view.isPaddingRelative();
    }

    public static void h(android.view.View view, int i17) {
        view.setLabelFor(i17);
    }

    public static void i(android.view.View view, android.graphics.Paint paint) {
        view.setLayerPaint(paint);
    }

    public static void j(android.view.View view, int i17) {
        view.setLayoutDirection(i17);
    }

    public static void k(android.view.View view, int i17, int i18, int i19, int i27) {
        view.setPaddingRelative(i17, i18, i19, i27);
    }
}
