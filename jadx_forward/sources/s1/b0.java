package s1;

/* loaded from: classes14.dex */
public final class b0 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.l1, s1.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f483522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.Object layoutId, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutId, "layoutId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f483522d = layoutId;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* renamed from: equals */
    public boolean m163521xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        s1.b0 b0Var = obj instanceof s1.b0 ? (s1.b0) obj : null;
        if (b0Var == null) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f483522d, b0Var.f483522d);
    }

    /* renamed from: hashCode */
    public int m163522x8cdac1b() {
        return this.f483522d.hashCode();
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
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m163523x9616526c() {
        return "LayoutId(id=" + this.f483522d + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }
}
