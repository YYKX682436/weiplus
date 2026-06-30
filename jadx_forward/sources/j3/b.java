package j3;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f378865a = 0;

    static {
        int i17 = android.os.Build.VERSION.SDK_INT;
        j3.a aVar = j3.a.f378864a;
        if (i17 >= 30) {
            aVar.a(30);
        }
        if (i17 >= 30) {
            aVar.a(31);
        }
        if (i17 >= 30) {
            aVar.a(33);
        }
        if (i17 >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a(java.lang.String codename, java.lang.String buildCodename) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codename, "codename");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buildCodename, "buildCodename");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("REL", buildCodename)) {
            return false;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = buildCodename.toUpperCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        java.lang.String upperCase2 = codename.toUpperCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 31) {
            if (i17 >= 30) {
                java.lang.String CODENAME = android.os.Build.VERSION.CODENAME;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CODENAME, "CODENAME");
                if (a(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a, CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 34) {
            if (i17 >= 33) {
                java.lang.String CODENAME = android.os.Build.VERSION.CODENAME;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CODENAME, "CODENAME");
                if (a("UpsideDownCake", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}
