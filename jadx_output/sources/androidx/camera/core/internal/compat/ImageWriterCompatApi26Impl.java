package androidx.camera.core.internal.compat;

/* loaded from: classes8.dex */
final class ImageWriterCompatApi26Impl {
    private static final java.lang.String TAG = "ImageWriterCompatApi26";
    private static java.lang.reflect.Method sNewInstanceMethod;

    static {
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            sNewInstanceMethod = android.media.ImageWriter.class.getMethod("newInstance", android.view.Surface.class, cls, cls);
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    private ImageWriterCompatApi26Impl() {
    }

    public static android.media.ImageWriter newInstance(android.view.Surface surface, int i17, int i18) {
        java.lang.Throwable th6 = null;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            try {
                java.lang.Object invoke = sNewInstanceMethod.invoke(null, surface, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                invoke.getClass();
                return (android.media.ImageWriter) invoke;
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
                th6 = e17;
            }
        }
        throw new java.lang.RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th6);
    }
}
