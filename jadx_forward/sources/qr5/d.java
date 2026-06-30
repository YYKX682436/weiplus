package qr5;

/* loaded from: classes13.dex */
public class d extends qr5.e {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Class f447668b;

    static {
        try {
            f447668b = java.lang.Class.forName("com.epicgames.ue4.GameActivity");
        } catch (java.lang.Throwable unused) {
            f447668b = null;
        }
    }

    public d() {
        super(null);
    }

    @Override // qr5.e
    public android.app.Activity a() {
        try {
            return (android.app.Activity) f447668b.getMethod("Get", null).invoke(null, null);
        } catch (java.lang.Throwable th6) {
            or5.b.c(3, th6, "Get Activity failed", new java.lang.Object[0]);
            return null;
        }
    }
}
