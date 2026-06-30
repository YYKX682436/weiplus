package s1;

/* loaded from: classes14.dex */
public final class g1 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.f1 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f483544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yz5.l callback, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f483544d = callback;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* renamed from: equals */
    public boolean m163534xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1.g1)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f483544d, ((s1.g1) obj).f483544d);
    }

    /* renamed from: hashCode */
    public int m163535x8cdac1b() {
        return this.f483544d.hashCode();
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // s1.f1
    public void l(s1.z coordinates) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinates, "coordinates");
        this.f483544d.mo146xb9724478(coordinates);
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
