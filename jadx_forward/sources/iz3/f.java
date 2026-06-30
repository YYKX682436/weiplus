package iz3;

/* loaded from: classes12.dex */
public final class f extends iz3.u {

    /* renamed from: a, reason: collision with root package name */
    public static final iz3.f f377608a = new iz3.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f377609b = new java.util.HashMap();

    @Override // iz3.k
    public void a(iz3.j requestWrapper, ry3.r resultCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestWrapper, "requestWrapper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultCallback, "resultCallback");
        ((ku5.t0) ku5.t0.f394148d).g(new iz3.e(requestWrapper, resultCallback));
    }

    @Override // iz3.k
    public void b(long j17) {
        java.lang.String str = (java.lang.String) f377609b.remove(java.lang.Long.valueOf(j17));
        if (str != null) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str);
        }
    }
}
