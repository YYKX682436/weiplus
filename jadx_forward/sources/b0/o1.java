package b0;

/* loaded from: classes14.dex */
public final class o1 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements b1.h {

    /* renamed from: d, reason: collision with root package name */
    public final b0.c2 f97993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(b0.c2 overScrollController, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(overScrollController, "overScrollController");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f97993d = overScrollController;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // b1.h
    public void P(g1.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        ((u1.o0) fVar).b();
        this.f97993d.b(fVar);
    }

    /* renamed from: equals */
    public boolean m9430xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0.o1)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f97993d, ((b0.o1) obj).f97993d);
    }

    /* renamed from: hashCode */
    public int m9431x8cdac1b() {
        return this.f97993d.hashCode();
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
    public java.lang.String m9432x9616526c() {
        return "DrawOverScrollModifier(overScrollController=" + this.f97993d + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }
}
