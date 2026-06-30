package rt2;

/* loaded from: classes10.dex */
public final class g {
    public g() {
        a("execSql", rt2.a.f481033d);
        a("sendGifts", rt2.b.f481034d);
        a("redDot", new rt2.c(this));
        a("dropFrameTest", new rt2.d(this));
        a("audioChange", new rt2.e(this));
        a("disableGuide", new rt2.f(this));
    }

    public final void a(java.lang.String cmd, yz5.l shell) {
        java.util.HashMap hashMap = rt2.h.f481039a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shell, "shell");
        java.util.HashMap hashMap2 = rt2.h.f481039a;
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = cmd.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        hashMap2.put(lowerCase, shell);
    }
}
