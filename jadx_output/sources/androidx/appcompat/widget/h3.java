package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f9604a;

    static {
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", android.graphics.Rect.class, android.graphics.Rect.class);
            f9604a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    public static boolean a(android.view.View view) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.v0.d(view) == 1;
    }
}
