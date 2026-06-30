package vz5;

/* loaded from: classes7.dex */
public abstract class b {
    public static final void a(java.io.Closeable closeable, java.lang.Throwable th6) {
        if (closeable != null) {
            if (th6 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (java.lang.Throwable th7) {
                jz5.a.a(th6, th7);
            }
        }
    }
}
