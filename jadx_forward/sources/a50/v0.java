package a50;

/* loaded from: classes11.dex */
public final class v0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f83078b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f83079c = true;

    /* renamed from: d, reason: collision with root package name */
    public static long f83080d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f83081e = true;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f83083g;

    /* renamed from: h, reason: collision with root package name */
    public static final a50.o0 f83084h;

    /* renamed from: a, reason: collision with root package name */
    public static final a50.v0 f83077a = new a50.v0();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f83082f = jz5.h.b(a50.p0.f83057d);

    static {
        jz5.h.b(a50.u0.f83074d);
        f83083g = jz5.h.b(a50.m0.f83045d);
        f83084h = new a50.o0();
    }

    public final boolean a(java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        if (!f83078b || !c()) {
            return false;
        }
        b(from);
        return true;
    }

    public final void b(java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        ((ku5.t0) ku5.t0.f394148d).B(new a50.l0(from));
    }

    public final boolean c() {
        if (f83080d < 0) {
            return false;
        }
        return java.lang.System.currentTimeMillis() - f83080d > ((long) com.p314xaae8f345.mm.p2621x8fb0427b.c2.e()) * 1000;
    }
}
