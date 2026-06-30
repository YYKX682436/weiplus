package d0;

/* loaded from: classes14.dex */
public final class q extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final z0.d f306724d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f306725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z0.d alignment, boolean z17, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f306724d = alignment;
        this.f306725e = z17;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* renamed from: equals */
    public boolean m123246xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        d0.q qVar = obj instanceof d0.q ? (d0.q) obj : null;
        if (qVar == null) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f306724d, qVar.f306724d) && this.f306725e == qVar.f306725e;
    }

    /* renamed from: hashCode */
    public int m123247x8cdac1b() {
        return (this.f306724d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f306725e);
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
    public java.lang.String m123248x9616526c() {
        return "BoxChildData(alignment=" + this.f306724d + ", matchParentSize=" + this.f306725e + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }
}
