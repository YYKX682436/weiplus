package yw;

/* loaded from: classes11.dex */
public final class w1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f548021b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f548022c = true;

    /* renamed from: d, reason: collision with root package name */
    public static long f548023d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f548024e = true;

    /* renamed from: a, reason: collision with root package name */
    public static final yw.w1 f548020a = new yw.w1();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f548025f = jz5.h.b(yw.p1.f547955d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f548026g = jz5.h.b(yw.v1.f548015d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f548027h = jz5.h.b(yw.m1.f547932d);

    /* renamed from: i, reason: collision with root package name */
    public static final yw.o1 f548028i = new yw.o1();

    public final boolean a(java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        if (!f548021b || !c()) {
            return false;
        }
        b(from);
        return true;
    }

    public final void b(java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        ((ku5.t0) ku5.t0.f394148d).B(new yw.l1(from));
    }

    public final boolean c() {
        if (f548023d < 0) {
            return false;
        }
        return java.lang.System.currentTimeMillis() - f548023d > ((long) com.p314xaae8f345.mm.p2621x8fb0427b.c2.e()) * 1000;
    }
}
