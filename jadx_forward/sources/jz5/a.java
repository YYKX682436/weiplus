package jz5;

/* loaded from: classes7.dex */
public abstract class a {
    public static final void a(java.lang.Throwable th6, java.lang.Throwable exception) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(th6, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
        if (th6 != exception) {
            java.lang.Integer num = tz5.a.f504922a;
            if (num == null || num.intValue() >= 19) {
                th6.addSuppressed(exception);
                return;
            }
            java.lang.reflect.Method method = sz5.a.f495783a;
            if (method != null) {
                method.invoke(th6, exception);
            }
        }
    }

    public static final java.lang.String b(java.lang.Throwable th6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(th6, "<this>");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th6.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String stringWriter2 = stringWriter.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
