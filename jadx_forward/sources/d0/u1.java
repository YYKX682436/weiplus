package d0;

/* loaded from: classes14.dex */
public final class u1 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final float f306747d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f306748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(float f17, boolean z17, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f306747d = f17;
        this.f306748e = z17;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* renamed from: equals */
    public boolean m123267xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        d0.u1 u1Var = obj instanceof d0.u1 ? (d0.u1) obj : null;
        if (u1Var == null) {
            return false;
        }
        return ((this.f306747d > u1Var.f306747d ? 1 : (this.f306747d == u1Var.f306747d ? 0 : -1)) == 0) && this.f306748e == u1Var.f306748e;
    }

    /* renamed from: hashCode */
    public int m123268x8cdac1b() {
        return (java.lang.Float.hashCode(this.f306747d) * 31) + java.lang.Boolean.hashCode(this.f306748e);
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

    @Override // s1.l1
    public java.lang.Object s(p2.f fVar, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        d0.k2 k2Var = obj instanceof d0.k2 ? (d0.k2) obj : null;
        if (k2Var == null) {
            k2Var = new d0.k2(0.0f, false, null, 7, null);
        }
        k2Var.f306689a = this.f306747d;
        k2Var.f306690b = this.f306748e;
        return k2Var;
    }

    /* renamed from: toString */
    public java.lang.String m123269x9616526c() {
        return "LayoutWeightImpl(weight=" + this.f306747d + ", fill=" + this.f306748e + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }
}
