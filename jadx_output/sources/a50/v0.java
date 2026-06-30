package a50;

/* loaded from: classes11.dex */
public final class v0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1545b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1546c = true;

    /* renamed from: d, reason: collision with root package name */
    public static long f1547d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f1548e = true;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f1550g;

    /* renamed from: h, reason: collision with root package name */
    public static final a50.o0 f1551h;

    /* renamed from: a, reason: collision with root package name */
    public static final a50.v0 f1544a = new a50.v0();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f1549f = jz5.h.b(a50.p0.f1524d);

    static {
        jz5.h.b(a50.u0.f1541d);
        f1550g = jz5.h.b(a50.m0.f1512d);
        f1551h = new a50.o0();
    }

    public final boolean a(java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        if (!f1545b || !c()) {
            return false;
        }
        b(from);
        return true;
    }

    public final void b(java.lang.String from) {
        kotlin.jvm.internal.o.g(from, "from");
        ((ku5.t0) ku5.t0.f312615d).B(new a50.l0(from));
    }

    public final boolean c() {
        if (f1547d < 0) {
            return false;
        }
        return java.lang.System.currentTimeMillis() - f1547d > ((long) com.tencent.mm.storage.c2.e()) * 1000;
    }
}
