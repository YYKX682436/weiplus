package e0;

/* loaded from: classes14.dex */
public final class n0 implements t1.d, p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final e0.l0 f327185f = new e0.l0();

    /* renamed from: d, reason: collision with root package name */
    public final e0.f1 f327186d;

    /* renamed from: e, reason: collision with root package name */
    public final e0.j f327187e;

    public n0(e0.f1 state, e0.j beyondBoundsInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beyondBoundsInfo, "beyondBoundsInfo");
        this.f327186d = state;
        this.f327187e = beyondBoundsInfo;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // t1.d
    /* renamed from: getKey */
    public t1.f mo156xb5884f29() {
        return p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.f0.f91933a;
    }

    @Override // t1.d
    /* renamed from: getValue */
    public java.lang.Object mo157x754a37bb() {
        return this;
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
