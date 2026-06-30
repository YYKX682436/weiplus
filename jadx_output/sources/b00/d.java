package b00;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final b00.d f16648a = new b00.d();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f16649b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f16650c;

    static {
        com.tencent.wechat.aff.ecs.d.f216630a = b00.c.f16646a;
        if (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.h() && gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f312615d).a(b00.b.f16639d);
        }
    }

    public final com.tencent.wechat.aff.ecs.c a() {
        com.tencent.wechat.aff.ecs.c cVar = com.tencent.wechat.aff.ecs.c.f216628b;
        kotlin.jvm.internal.o.f(cVar, "getInstance(...)");
        return cVar;
    }

    public final synchronized void b() {
        if (!f16649b && !f16650c) {
            f16649b = true;
            a().b();
            f16650c = true;
        }
    }
}
