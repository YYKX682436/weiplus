package d0;

/* loaded from: classes14.dex */
public final class x1 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final float f306771d;

    /* renamed from: e, reason: collision with root package name */
    public final float f306772e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f306773f;

    public x1(float f17, float f18, boolean z17, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(lVar);
        this.f306771d = f17;
        this.f306772e = f18;
        this.f306773f = z17;
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
    public boolean m123273xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        d0.x1 x1Var = obj instanceof d0.x1 ? (d0.x1) obj : null;
        if (x1Var == null) {
            return false;
        }
        return p2.h.a(this.f306771d, x1Var.f306771d) && p2.h.a(this.f306772e, x1Var.f306772e) && this.f306773f == x1Var.f306773f;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        return s1.v0.b(measure, m17.f483583d, m17.f483584e, null, new d0.w1(this, m17, measure), 4, null);
    }

    /* renamed from: hashCode */
    public int m123274x8cdac1b() {
        return (((java.lang.Float.hashCode(this.f306771d) * 31) + java.lang.Float.hashCode(this.f306772e)) * 31) + java.lang.Boolean.hashCode(this.f306773f);
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

    /* renamed from: toString */
    public java.lang.String m123275x9616526c() {
        return "OffsetModifier(x=" + ((java.lang.Object) p2.h.b(this.f306771d)) + ", y=" + ((java.lang.Object) p2.h.b(this.f306772e)) + ", rtlAware=" + this.f306773f + ')';
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
