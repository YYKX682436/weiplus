package kn5;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final android.graphics.Rect f391340a = new android.graphics.Rect();

    public static final int a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        android.view.View k07 = c1163xf1deaba4.k0(java.lang.Math.max(java.lang.Math.min(f17, c1163xf1deaba4.getWidth()), 0.0f), java.lang.Math.max(java.lang.Math.min(f18, c1163xf1deaba4.getHeight()), 0.0f));
        if (k07 == null) {
            return -1;
        }
        android.graphics.Rect rect = f391340a;
        if (k07.getGlobalVisibleRect(rect) && ((float) rect.height()) >= (((float) k07.getMeasuredHeight()) / 4.0f) * ((float) 3)) {
            return c1163xf1deaba4.u0(k07);
        }
        return -1;
    }
}
