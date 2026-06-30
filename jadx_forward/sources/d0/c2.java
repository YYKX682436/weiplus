package d0;

/* loaded from: classes14.dex */
public final class c2 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final float f306622d;

    /* renamed from: e, reason: collision with root package name */
    public final float f306623e;

    /* renamed from: f, reason: collision with root package name */
    public final float f306624f;

    /* renamed from: g, reason: collision with root package name */
    public final float f306625g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f306626h;

    public c2(float f17, float f18, float f19, float f27, boolean z17, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(lVar);
        this.f306622d = f17;
        this.f306623e = f18;
        this.f306624f = f19;
        this.f306625g = f27;
        this.f306626h = z17;
        if (!((f17 >= 0.0f || p2.h.a(f17, Float.NaN)) && (f18 >= 0.0f || p2.h.a(f18, Float.NaN)) && ((f19 >= 0.0f || p2.h.a(f19, Float.NaN)) && (f27 >= 0.0f || p2.h.a(f27, Float.NaN))))) {
            throw new java.lang.IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i0
    public int O(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.d(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.a(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.c(this, uVar, tVar, i17);
    }

    /* renamed from: equals */
    public boolean m123194xb2c87fbf(java.lang.Object obj) {
        d0.c2 c2Var = obj instanceof d0.c2 ? (d0.c2) obj : null;
        return c2Var != null && p2.h.a(this.f306622d, c2Var.f306622d) && p2.h.a(this.f306623e, c2Var.f306623e) && p2.h.a(this.f306624f, c2Var.f306624f) && p2.h.a(this.f306625g, c2Var.f306625g) && this.f306626h == c2Var.f306626h;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        int G = measure.G(this.f306622d) + measure.G(this.f306624f);
        int G2 = measure.G(this.f306623e) + measure.G(this.f306625g);
        s1.o1 m17 = measurable.m(p2.d.f(j17, -G, -G2));
        return s1.v0.b(measure, p2.d.e(j17, m17.f483583d + G), p2.d.d(j17, m17.f483584e + G2), null, new d0.b2(this, m17, measure), 4, null);
    }

    /* renamed from: hashCode */
    public int m123195x8cdac1b() {
        return (((((((java.lang.Float.hashCode(this.f306622d) * 31) + java.lang.Float.hashCode(this.f306623e)) * 31) + java.lang.Float.hashCode(this.f306624f)) * 31) + java.lang.Float.hashCode(this.f306625g)) * 31) + java.lang.Boolean.hashCode(this.f306626h);
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }

    @Override // s1.i0
    public int x(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.b(this, uVar, tVar, i17);
    }
}
