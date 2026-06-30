package z0;

/* loaded from: classes14.dex */
public class j extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements z0.s {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.q f550444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.l inspectorInfo, yz5.q factory) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(factory, "factory");
        this.f550444d = factory;
    }

    @Override // z0.t
    public boolean E(yz5.l lVar) {
        return z0.r.a(this, lVar);
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
