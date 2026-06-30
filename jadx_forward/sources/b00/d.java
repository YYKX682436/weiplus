package b00;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b00.d f98181a = new b00.d();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f98182b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f98183c;

    static {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ecs.d.f298163a = b00.c.f98179a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.h() && gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f394148d).a(b00.b.f98172d);
        }
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.ecs.c a() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ecs.c cVar = com.p314xaae8f345.p3133xd0ce8b26.aff.ecs.c.f298161b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cVar, "getInstance(...)");
        return cVar;
    }

    public final synchronized void b() {
        if (!f98182b && !f98183c) {
            f98182b = true;
            a().b();
            f98183c = true;
        }
    }
}
