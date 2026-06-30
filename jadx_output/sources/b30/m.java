package b30;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final b30.m f17570a = new b30.m();

    public final java.lang.Integer a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(android.graphics.Color.parseColor(str));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("EcsColorHelper", th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final java.lang.String b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() != 9) {
            return str;
        }
        char charAt = str.charAt(0);
        java.lang.String substring = str.substring(1, 3);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String substring2 = str.substring(3, 5);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        java.lang.String substring3 = str.substring(5, 7);
        kotlin.jvm.internal.o.f(substring3, "substring(...)");
        java.lang.String substring4 = str.substring(7, 9);
        kotlin.jvm.internal.o.f(substring4, "substring(...)");
        return charAt + substring4 + substring + substring2 + substring3;
    }
}
