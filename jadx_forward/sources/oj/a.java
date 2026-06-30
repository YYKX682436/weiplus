package oj;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static android.app.Application f427198a;

    public static android.app.Application a() {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.app.AppGlobals").getDeclaredMethod("getInitialApplication", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            return (android.app.Application) declaredMethod.invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            try {
                java.lang.reflect.Method declaredMethod2 = java.lang.Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new java.lang.Class[0]);
                declaredMethod2.setAccessible(true);
                return (android.app.Application) declaredMethod2.invoke(null, new java.lang.Object[0]);
            } catch (java.lang.Exception e18) {
                oj.j.f("Matrix.ApplicationGlobal", "get activity thread fail, error = " + e17.getMessage() + " & " + e18.getMessage(), new java.lang.Object[0]);
                return null;
            }
        }
    }
}
