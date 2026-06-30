package zv;

/* loaded from: classes11.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f557471b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f557472c = true;

    /* renamed from: d, reason: collision with root package name */
    public static long f557473d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f557474e = true;

    /* renamed from: a, reason: collision with root package name */
    public static final zv.e0 f557470a = new zv.e0();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f557475f = jz5.h.b(zv.w.f557656d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f557476g = jz5.h.b(zv.d0.f557461d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f557477h = jz5.h.b(zv.t.f557641d);

    /* renamed from: i, reason: collision with root package name */
    public static final zv.v f557478i = new zv.v();

    public final boolean a(java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        if (!f557471b || !c()) {
            return false;
        }
        b(from);
        return true;
    }

    public final void b(java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        ((ku5.t0) ku5.t0.f394148d).B(new zv.s(from));
    }

    public final boolean c() {
        zv.q qVar = zv.q.f557612a;
        if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsDestroyFlutterImmediately", 0) == 1) {
            return true;
        }
        if (f557473d < 0) {
            return false;
        }
        return java.lang.System.currentTimeMillis() - f557473d > ((long) com.p314xaae8f345.mm.p2621x8fb0427b.c2.e()) * 1000;
    }
}
