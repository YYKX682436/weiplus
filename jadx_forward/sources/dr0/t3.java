package dr0;

/* loaded from: classes12.dex */
public abstract class t3 {
    public static final java.lang.String a(android.app.ApplicationExitInfo applicationExitInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applicationExitInfo, "<this>");
        java.lang.String applicationExitInfo2 = applicationExitInfo.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationExitInfo2, "toString(...)");
        if (!r26.n0.B(applicationExitInfo2, ") subreason=", false)) {
            return "";
        }
        java.lang.String substring = applicationExitInfo2.substring(r26.n0.L(applicationExitInfo2, ") subreason=", 0, false, 6, null) + 12);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        if (!r26.n0.B(substring, " (", false)) {
            return "";
        }
        java.lang.String substring2 = substring.substring(0, r26.n0.L(substring, " (", 0, false, 6, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        return substring2;
    }
}
