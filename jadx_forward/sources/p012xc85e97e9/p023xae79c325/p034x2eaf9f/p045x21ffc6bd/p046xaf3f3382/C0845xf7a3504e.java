package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382;

/* renamed from: androidx.camera.core.internal.compat.ImageWriterCompatApi26Impl */
/* loaded from: classes8.dex */
final class C0845xf7a3504e {
    private static final java.lang.String TAG = "ImageWriterCompatApi26";

    /* renamed from: sNewInstanceMethod */
    private static java.lang.reflect.Method f2097x4f1ebf63;

    static {
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            f2097x4f1ebf63 = android.media.ImageWriter.class.getMethod("newInstance", android.view.Surface.class, cls, cls);
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    private C0845xf7a3504e() {
    }

    /* renamed from: newInstance */
    public static android.media.ImageWriter m6161x6bff0255(android.view.Surface surface, int i17, int i18) {
        java.lang.Throwable th6 = null;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            try {
                java.lang.Object invoke = f2097x4f1ebf63.invoke(null, surface, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                invoke.getClass();
                return (android.media.ImageWriter) invoke;
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
                th6 = e17;
            }
        }
        throw new java.lang.RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th6);
    }
}
