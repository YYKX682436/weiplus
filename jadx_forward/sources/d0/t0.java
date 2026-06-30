package d0;

/* loaded from: classes14.dex */
public final class t0 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final z0.b f306741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(z0.b horizontal, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(horizontal, "horizontal");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f306741d = horizontal;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* renamed from: equals */
    public boolean m123259xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        d0.t0 t0Var = obj instanceof d0.t0 ? (d0.t0) obj : null;
        if (t0Var == null) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f306741d, t0Var.f306741d);
    }

    /* renamed from: hashCode */
    public int m123260x8cdac1b() {
        return this.f306741d.hashCode();
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
        z0.b horizontal = this.f306741d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(horizontal, "horizontal");
        k2Var.f306691c = new d0.n0(horizontal);
        return k2Var;
    }

    /* renamed from: toString */
    public java.lang.String m123261x9616526c() {
        return "HorizontalAlignModifier(horizontal=" + this.f306741d + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }
}
