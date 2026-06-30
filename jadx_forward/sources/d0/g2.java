package d0;

/* loaded from: classes14.dex */
public final class g2 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final d0.d2 f306655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(d0.d2 paddingValues, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paddingValues, "paddingValues");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f306655d = paddingValues;
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
    public boolean m123211xb2c87fbf(java.lang.Object obj) {
        d0.g2 g2Var = obj instanceof d0.g2 ? (d0.g2) obj : null;
        if (g2Var == null) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f306655d, g2Var.f306655d);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        p2.s mo7007x6fcfed3f = measure.mo7007x6fcfed3f();
        d0.d2 d2Var = this.f306655d;
        boolean z17 = false;
        float f17 = 0;
        if (java.lang.Float.compare(((d0.e2) d2Var).a(mo7007x6fcfed3f), f17) >= 0 && java.lang.Float.compare(((d0.e2) d2Var).f306642b, f17) >= 0) {
            if (java.lang.Float.compare(((d0.e2) d2Var).b(measure.mo7007x6fcfed3f()), f17) >= 0 && java.lang.Float.compare(((d0.e2) d2Var).f306644d, f17) >= 0) {
                z17 = true;
            }
        }
        if (!z17) {
            throw new java.lang.IllegalArgumentException("Padding must be non-negative".toString());
        }
        int G = measure.G(((d0.e2) d2Var).a(measure.mo7007x6fcfed3f())) + measure.G(((d0.e2) d2Var).b(measure.mo7007x6fcfed3f()));
        int G2 = measure.G(((d0.e2) d2Var).f306642b) + measure.G(((d0.e2) d2Var).f306644d);
        s1.o1 m17 = measurable.m(p2.d.f(j17, -G, -G2));
        return s1.v0.b(measure, p2.d.e(j17, m17.f483583d + G), p2.d.d(j17, m17.f483584e + G2), null, new d0.f2(m17, measure, this), 4, null);
    }

    /* renamed from: hashCode */
    public int m123212x8cdac1b() {
        return this.f306655d.hashCode();
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
