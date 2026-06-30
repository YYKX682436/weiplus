package y;

/* loaded from: classes14.dex */
public final class s1 extends y.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final z.p f539973d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f539974e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f539975f;

    /* renamed from: g, reason: collision with root package name */
    public y.p1 f539976g;

    public s1(z.p animSpec, p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animSpec, "animSpec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f539973d = animSpec;
        this.f539974e = scope;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        long a17 = p2.r.a(m17.f483583d, m17.f483584e);
        y.p1 p1Var = this.f539976g;
        if (p1Var != null) {
            z.e eVar = p1Var.f539957a;
            if (!p2.q.a(a17, ((p2.q) ((n0.q4) eVar.f550167e).mo128745x754a37bb()).f432929a)) {
                p1Var.f539958b = ((p2.q) eVar.d()).f432929a;
                p3325xe03a0797.p3326xc267989b.l.d(this.f539974e, null, null, new y.q1(p1Var, a17, this, null), 3, null);
            }
        } else {
            p1Var = new y.p1(new z.e(new p2.q(a17), z.q3.f550341h, new p2.q(p2.r.a(1, 1))), a17, null);
        }
        this.f539976g = p1Var;
        long j18 = ((p2.q) p1Var.f539957a.d()).f432929a;
        return s1.v0.b(measure, (int) (j18 >> 32), p2.q.b(j18), null, new y.r1(m17), 4, null);
    }
}
