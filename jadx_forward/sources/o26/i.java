package o26;

/* loaded from: classes13.dex */
public abstract class i {
    public static final boolean a(java.lang.Throwable th6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(th6, "<this>");
        java.lang.Class<?> cls = th6.getClass();
        while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }
}
