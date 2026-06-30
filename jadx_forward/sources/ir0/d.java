package ir0;

/* loaded from: classes11.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final ir0.d f375458d = new ir0.d();

    public d() {
        super(3);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String thread = (java.lang.String) obj;
        java.lang.String stacktrace = (java.lang.String) obj2;
        long longValue = ((java.lang.Number) obj3).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stacktrace, "stacktrace");
        ri.k0.f477453a.a(new ri.j0(101, null, 0, 0, longValue, 0L, 0L, 0, r26.i0.t(r26.i0.t(stacktrace, "\n", ";", false), "\t", "", false), 0, thread, 0, null, 0L, 0L, 0L, null, null, 0, 0, 0, 0, 0, 0L, null, null, null, 0, 0, null, null, 0, 0, -1298, 1, null));
        oj.j.b("MicroMsg.MatrixLifecycleBoot", "thread: " + thread + ", cost: " + longValue + ", " + stacktrace, new java.lang.Object[0]);
        return jz5.f0.f384359a;
    }
}
