package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes13.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f91137a;

    static {
        try {
            java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("computeFitSystemWindows", android.graphics.Rect.class, android.graphics.Rect.class);
            f91137a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    public static boolean a(android.view.View view) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return n3.v0.d(view) == 1;
    }
}
