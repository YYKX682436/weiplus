package qr5;

/* loaded from: classes13.dex */
public class c extends qr5.e {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Class f447667b;

    static {
        try {
            f447667b = java.lang.Class.forName("com.unity3d.player.UnityPlayer");
        } catch (java.lang.Throwable unused) {
            f447667b = null;
        }
    }

    public c() {
        super(null);
    }

    @Override // qr5.e
    public android.app.Activity a() {
        try {
            return (android.app.Activity) f447667b.getField("currentActivity").get(null);
        } catch (java.lang.Throwable th6) {
            or5.b.c(3, th6, "Get Activity failed", new java.lang.Object[0]);
            return null;
        }
    }
}
