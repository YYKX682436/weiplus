package d0;

/* loaded from: classes14.dex */
public final class l3 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final d0.q0 f306699d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f306700e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f306701f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f306702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(d0.q0 direction, boolean z17, yz5.p alignmentCallback, java.lang.Object align, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(direction, "direction");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignmentCallback, "alignmentCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(align, "align");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f306699d = direction;
        this.f306700e = z17;
        this.f306701f = alignmentCallback;
        this.f306702g = align;
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
    public boolean m123236xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof d0.l3)) {
            return false;
        }
        d0.l3 l3Var = (d0.l3) obj;
        return this.f306699d == l3Var.f306699d && this.f306700e == l3Var.f306700e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f306702g, l3Var.f306702g);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measure, "$this$measure");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurable, "measurable");
        d0.q0 q0Var = d0.q0.Vertical;
        d0.q0 q0Var2 = this.f306699d;
        int j18 = q0Var2 != q0Var ? 0 : p2.c.j(j17);
        d0.q0 q0Var3 = d0.q0.Horizontal;
        int i17 = q0Var2 == q0Var3 ? p2.c.i(j17) : 0;
        boolean z17 = this.f306700e;
        s1.o1 m17 = measurable.m(p2.d.a(j18, (q0Var2 == q0Var || !z17) ? p2.c.h(j17) : Integer.MAX_VALUE, i17, (q0Var2 == q0Var3 || !z17) ? p2.c.g(j17) : Integer.MAX_VALUE));
        int f17 = e06.p.f(m17.f483583d, p2.c.j(j17), p2.c.h(j17));
        int f18 = e06.p.f(m17.f483584e, p2.c.i(j17), p2.c.g(j17));
        return s1.v0.b(measure, f17, f18, null, new d0.k3(this, f17, m17, f18, measure), 4, null);
    }

    /* renamed from: hashCode */
    public int m123237x8cdac1b() {
        return (((this.f306699d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f306700e)) * 31) + this.f306702g.hashCode();
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
