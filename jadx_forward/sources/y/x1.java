package y;

/* loaded from: classes14.dex */
public final class x1 extends y.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final z.c2 f540007d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.e5 f540008e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.e5 f540009f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f540010g;

    public x1(z.c2 lazyAnimation, n0.e5 slideIn, n0.e5 slideOut) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lazyAnimation, "lazyAnimation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slideIn, "slideIn");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slideOut, "slideOut");
        this.f540007d = lazyAnimation;
        this.f540008e = slideIn;
        this.f540009f = slideOut;
        this.f540010g = new y.w1(this);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        return s1.v0.b(measure, m17.f483583d, m17.f483584e, null, new y.v1(this, m17, p2.r.a(m17.f483583d, m17.f483584e)), 4, null);
    }
}
