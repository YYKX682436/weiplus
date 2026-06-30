package q35;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f441503a = new boolean[21];

    public static boolean a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return ((java.lang.Boolean) xo.a.a(path, false).f384374d).booleanValue();
    }

    public static boolean b() {
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            return true;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new q35.RunnableC29989x2d183f());
        java.lang.String path = lp0.b.D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        jz5.o a17 = xo.a.a(path, false);
        if (((java.lang.Boolean) a17.f384374d).booleanValue()) {
            return true;
        }
        java.util.Map b17 = xo.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "File_WriteSdTest", new java.io.File(lp0.b.D()), (java.lang.Throwable) a17.f384376f);
        ap.a.a(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "SdcardCompat", (java.lang.Throwable) a17.f384376f, b17, "WriteSdTest", (java.lang.String) a17.f384375e);
        if (!xo.a.f537272b) {
            jz5.o a18 = xo.a.a(lp0.b.D(), true);
            if (((java.lang.Boolean) a18.f384374d).booleanValue()) {
                return true;
            }
            ap.a.a(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "SdcardCompat", (java.lang.Throwable) a18.f384376f, b17, "WriteSdTestSimpleMode", (java.lang.String) a18.f384375e);
        }
        return !xo.a.f537274d;
    }
}
