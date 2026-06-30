package b1;

/* loaded from: classes14.dex */
public final class e extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements b1.h {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f98525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yz5.l onDraw, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDraw, "onDraw");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f98525d = onDraw;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // b1.h
    public void P(g1.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        this.f98525d.mo146xb9724478(fVar);
        ((u1.o0) fVar).b();
    }

    /* renamed from: equals */
    public boolean m9556xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1.e)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98525d, ((b1.e) obj).f98525d);
    }

    /* renamed from: hashCode */
    public int m9557x8cdac1b() {
        return this.f98525d.hashCode();
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
}
