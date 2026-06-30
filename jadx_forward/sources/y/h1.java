package y;

/* loaded from: classes14.dex */
public final class h1 extends y.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final z.c2 f539890d;

    /* renamed from: e, reason: collision with root package name */
    public final z.c2 f539891e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.e5 f539892f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.e5 f539893g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.e5 f539894h;

    /* renamed from: i, reason: collision with root package name */
    public z0.d f539895i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f539896m;

    public h1(z.c2 sizeAnimation, z.c2 offsetAnimation, n0.e5 expand, n0.e5 shrink, n0.e5 alignment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeAnimation, "sizeAnimation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(offsetAnimation, "offsetAnimation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expand, "expand");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shrink, "shrink");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        this.f539890d = sizeAnimation;
        this.f539891e = offsetAnimation;
        this.f539892f = expand;
        this.f539893g = shrink;
        this.f539894h = alignment;
        this.f539896m = new y.g1(this);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        long j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        long a17 = p2.r.a(m17.f483583d, m17.f483584e);
        long j19 = ((p2.q) ((z.b2) this.f539890d.a(this.f539896m, new y.d1(this, a17))).mo128745x754a37bb()).f432929a;
        long j27 = ((p2.m) ((z.b2) this.f539891e.a(y.e1.f539871d, new y.f1(this, a17))).mo128745x754a37bb()).f432923a;
        z0.d dVar = this.f539895i;
        if (dVar != null) {
            j18 = ((z0.g) dVar).a(a17, j19, p2.s.Ltr);
        } else {
            int i17 = p2.m.f432922c;
            j18 = p2.m.f432921b;
        }
        return s1.v0.b(measure, (int) (j19 >> 32), p2.q.b(j19), null, new y.c1(m17, j18, j27), 4, null);
    }
}
