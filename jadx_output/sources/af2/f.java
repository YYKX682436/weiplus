package af2;

/* loaded from: classes3.dex */
public final class f extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4525a;

    public f(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f4525a = kz5.c0.i(new xe2.c(liveContext), new xe2.a1(liveContext), new xe2.o0(liveContext), new xe2.t0(liveContext), new xe2.r(liveContext), new xe2.q(liveContext), new xe2.n1(liveContext), new xe2.j(liveContext), new xe2.h0(liveContext), new xe2.v0(liveContext), new xe2.x0(liveContext), new xe2.f(liveContext), new xe2.a(liveContext), new xe2.f1(liveContext), new xe2.h1(liveContext), new xe2.p(liveContext), new xe2.j1(liveContext), new xe2.k(liveContext), new xe2.o(liveContext), new xe2.i(liveContext), new xe2.e(liveContext), new xe2.q0(liveContext), new xe2.p0(liveContext), new xe2.s0(liveContext), new xe2.g(liveContext), new xe2.i1(liveContext), new xe2.m1(liveContext), new xe2.l1(liveContext), new xe2.b(liveContext), new xe2.h(liveContext), new xe2.k0(liveContext), new xe2.b0(liveContext), new xe2.w0(liveContext), new xe2.k1(liveContext), new xe2.n0(liveContext), new xe2.y0(liveContext), new xe2.z0(liveContext), new xe2.m0(liveContext));
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        java.util.Iterator it = this.f4525a.iterator();
        while (it.hasNext()) {
            ((we2.z) it.next()).b(respWrapper);
        }
        return true;
    }
}
