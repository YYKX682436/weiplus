package al3;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final al3.g f87391a = new al3.g();

    public final java.lang.String a(android.view.View view) {
        if (view == null) {
            return "";
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, view.getWidth() + i17, view.getHeight() + i18);
        java.lang.String format = java.lang.String.format("%d,%d,%d,%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom)}, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
