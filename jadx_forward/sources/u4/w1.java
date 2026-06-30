package u4;

/* loaded from: classes13.dex */
public abstract class w1 {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Field f506106b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f506107c;

    /* renamed from: a, reason: collision with root package name */
    public static final u4.a2 f506105a = new u4.z1();

    /* renamed from: d, reason: collision with root package name */
    public static final android.util.Property f506108d = new u4.u1(java.lang.Float.class, "translationAlpha");

    /* renamed from: e, reason: collision with root package name */
    public static final android.util.Property f506109e = new u4.v1(android.graphics.Rect.class, "clipBounds");

    public static void a(android.view.View view, android.graphics.Matrix matrix) {
        if (!u4.y1.f506127j) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("setAnimationMatrix", android.graphics.Matrix.class);
                u4.y1.f506126i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            u4.y1.f506127j = true;
        }
        java.lang.reflect.Method method = u4.y1.f506126i;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (java.lang.IllegalAccessException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            } catch (java.lang.reflect.InvocationTargetException unused2) {
            }
        }
    }

    public static void b(android.view.View view, int i17, int i18, int i19, int i27) {
        if (!u4.z1.f506131l) {
            try {
                java.lang.Class cls = java.lang.Integer.TYPE;
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("setLeftTopRightBottom", cls, cls, cls, cls);
                u4.z1.f506130k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            u4.z1.f506131l = true;
        }
        java.lang.reflect.Method method = u4.z1.f506130k;
        if (method != null) {
            try {
                method.invoke(view, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
            } catch (java.lang.IllegalAccessException unused2) {
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            }
        }
    }

    public static void c(android.view.View view, float f17) {
        if (!u4.x1.f506113b) {
            try {
                java.lang.reflect.Method declaredMethod = android.view.View.class.getDeclaredMethod("setTransitionAlpha", java.lang.Float.TYPE);
                u4.x1.f506112a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            u4.x1.f506113b = true;
        }
        java.lang.reflect.Method method = u4.x1.f506112a;
        if (method != null) {
            try {
                method.invoke(view, java.lang.Float.valueOf(f17));
                return;
            } catch (java.lang.IllegalAccessException unused2) {
                return;
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "androidx/transition/ViewUtilsApi19", "setTransitionAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "androidx/transition/ViewUtilsApi19", "setTransitionAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public static void d(android.view.View view, int i17) {
        if (!f506107c) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mViewFlags");
                f506106b = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
            }
            f506107c = true;
        }
        java.lang.reflect.Field field = f506106b;
        if (field != null) {
            try {
                f506106b.setInt(view, i17 | (field.getInt(view) & (-13)));
            } catch (java.lang.IllegalAccessException unused2) {
            }
        }
    }
}
