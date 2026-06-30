package c1;

/* loaded from: classes14.dex */
public final class c0 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements t1.b, t1.d {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f119262d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.v2 f119263e;

    /* renamed from: f, reason: collision with root package name */
    public final t1.f f119264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.l focusPropertiesScope, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusPropertiesScope, "focusPropertiesScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f119262d = focusPropertiesScope;
        this.f119263e = n0.s4.c(null, null, 2, null);
        this.f119264f = c1.b0.f119261a;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        ((n0.q4) this.f119263e).mo148714x53d8522f((c1.c0) scope.a(c1.b0.f119261a));
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final void a(c1.x focusProperties) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusProperties, "focusProperties");
        this.f119262d.mo146xb9724478(focusProperties);
        c1.c0 c0Var = (c1.c0) ((n0.q4) this.f119263e).mo128745x754a37bb();
        if (c0Var != null) {
            c0Var.a(focusProperties);
        }
    }

    /* renamed from: equals */
    public boolean m13991xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof c1.c0) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f119262d, ((c1.c0) obj).f119262d)) {
                return true;
            }
        }
        return false;
    }

    @Override // t1.d
    /* renamed from: getKey */
    public t1.f mo156xb5884f29() {
        return this.f119264f;
    }

    @Override // t1.d
    /* renamed from: getValue */
    public java.lang.Object mo157x754a37bb() {
        return this;
    }

    /* renamed from: hashCode */
    public int m13992x8cdac1b() {
        return this.f119262d.hashCode();
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
