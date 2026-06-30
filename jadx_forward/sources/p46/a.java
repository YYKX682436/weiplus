package p46;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ResourceBundle f433496a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        try {
            final java.util.Locale locale = java.util.Locale.getDefault();
            final java.lang.String str = "org.apache.commons.compress.harmony.archive.internal.nls.messages";
            java.util.ResourceBundle resourceBundle = null;
            try {
                final java.lang.Object[] objArr = 0 == true ? 1 : 0;
                resourceBundle = (java.util.ResourceBundle) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction(str, locale, objArr) { // from class: p46.a$$a

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ java.lang.String f433497a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ java.util.Locale f433498b;

                    @Override // java.security.PrivilegedAction
                    public final java.lang.Object run() {
                        return java.util.ResourceBundle.getBundle(this.f433497a, this.f433498b, java.lang.ClassLoader.getSystemClassLoader());
                    }
                });
            } catch (java.util.MissingResourceException unused) {
            }
            f433496a = resourceBundle;
        } catch (java.lang.Throwable unused2) {
        }
    }
}
