package mq;

/* loaded from: classes8.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static mq.g f412044a = new mq.f();

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f412044a != null) {
            if (objArr != null) {
                str2 = java.lang.String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f412044a.e(str, str2);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f412044a != null) {
            if (objArr != null) {
                str2 = java.lang.String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f412044a.i(str, str2);
        }
    }

    public static void c(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        if (f412044a != null) {
            if (objArr != null) {
                str2 = java.lang.String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f412044a.e(str, str2 + "  " + android.util.Log.getStackTraceString(th6));
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (f412044a != null) {
            if (objArr != null) {
                str2 = java.lang.String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            f412044a.w(str, str2);
        }
    }
}
