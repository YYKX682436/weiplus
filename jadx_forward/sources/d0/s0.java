package d0;

/* loaded from: classes14.dex */
public final class s0 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final d0.q0 f306737d;

    /* renamed from: e, reason: collision with root package name */
    public final float f306738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(d0.q0 direction, float f17, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(direction, "direction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f306737d = direction;
        this.f306738e = f17;
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
    public boolean m123256xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof d0.s0)) {
            return false;
        }
        d0.s0 s0Var = (d0.s0) obj;
        if (this.f306737d == s0Var.f306737d) {
            return (this.f306738e > s0Var.f306738e ? 1 : (this.f306738e == s0Var.f306738e ? 0 : -1)) == 0;
        }
        return false;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        int j18;
        int h17;
        int g17;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        boolean d17 = p2.c.d(j17);
        float f17 = this.f306738e;
        d0.q0 q0Var = this.f306737d;
        if (!d17 || q0Var == d0.q0.Vertical) {
            j18 = p2.c.j(j17);
            h17 = p2.c.h(j17);
        } else {
            j18 = e06.p.f(a06.d.b(p2.c.h(j17) * f17), p2.c.j(j17), p2.c.h(j17));
            h17 = j18;
        }
        if (!p2.c.c(j17) || q0Var == d0.q0.Horizontal) {
            int i18 = p2.c.i(j17);
            g17 = p2.c.g(j17);
            i17 = i18;
        } else {
            i17 = e06.p.f(a06.d.b(p2.c.g(j17) * f17), p2.c.i(j17), p2.c.g(j17));
            g17 = i17;
        }
        s1.o1 m17 = measurable.m(p2.d.a(j18, h17, i17, g17));
        return s1.v0.b(measure, m17.f483583d, m17.f483584e, null, new d0.r0(m17), 4, null);
    }

    /* renamed from: hashCode */
    public int m123257x8cdac1b() {
        return (this.f306737d.hashCode() * 31) + java.lang.Float.hashCode(this.f306738e);
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
