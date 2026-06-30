package ot5;

/* loaded from: classes13.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static ot5.f f430409a = new ot5.j();

    public static void a(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof java.lang.Exception)) {
            f430409a.e(str, obj.toString());
            return;
        }
        f430409a.e(str, "" + obj);
    }

    public static void b(java.lang.String str) {
        c("RiskScanner", str);
    }

    public static void c(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        f430409a.i(str, obj.toString());
    }

    public static void d(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof java.lang.Exception)) {
            f430409a.w(str, obj.toString());
            return;
        }
        f430409a.w(str, "" + obj);
    }

    public static void e(java.lang.Throwable th6) {
        d("RiskScanner", th6);
    }
}
