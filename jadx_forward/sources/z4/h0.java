package z4;

/* loaded from: classes13.dex */
public abstract class h0 {
    public static java.lang.reflect.InvocationHandler a() {
        java.lang.ClassLoader classLoader;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            classLoader = z4.q.b();
        } else {
            try {
                java.lang.reflect.Method declaredMethod = android.webkit.WebView.class.getDeclaredMethod("getFactory", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new java.lang.Object[0]).getClass().getClassLoader();
            } catch (java.lang.IllegalAccessException e17) {
                throw new java.lang.RuntimeException(e17);
            } catch (java.lang.NoSuchMethodException e18) {
                throw new java.lang.RuntimeException(e18);
            } catch (java.lang.reflect.InvocationTargetException e19) {
                throw new java.lang.RuntimeException(e19);
            }
        }
        return (java.lang.reflect.InvocationHandler) java.lang.Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
    }
}
