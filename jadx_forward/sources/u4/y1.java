package u4;

/* loaded from: classes13.dex */
public abstract class y1 extends u4.x1 {

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Method f506122e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f506123f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.reflect.Method f506124g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f506125h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.reflect.Method f506126i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f506127j;

    @Override // u4.a2
    public void b(android.view.View view, android.graphics.Matrix matrix) {
        if (!f506123f) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("transformMatrixToGlobal", android.graphics.Matrix.class);
                f506122e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            f506123f = true;
        }
        java.lang.reflect.Method method = f506122e;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (java.lang.IllegalAccessException unused2) {
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            }
        }
    }

    @Override // u4.a2
    public void c(android.view.View view, android.graphics.Matrix matrix) {
        if (!f506125h) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("transformMatrixToLocal", android.graphics.Matrix.class);
                f506124g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            f506125h = true;
        }
        java.lang.reflect.Method method = f506124g;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (java.lang.IllegalAccessException unused2) {
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            }
        }
    }
}
