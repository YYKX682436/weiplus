package s1;

/* loaded from: classes14.dex */
public final class k1 extends p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i3 implements s1.j1 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f483557d;

    /* renamed from: e, reason: collision with root package name */
    public long f483558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(yz5.l onSizeChanged, yz5.l inspectorInfo) {
        super(inspectorInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSizeChanged, "onSizeChanged");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        this.f483557d = onSizeChanged;
        this.f483558e = p2.r.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* renamed from: equals */
    public boolean m163542xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1.k1)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f483557d, ((s1.k1) obj).f483557d);
    }

    /* renamed from: hashCode */
    public int m163543x8cdac1b() {
        return this.f483557d.hashCode();
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

    @Override // s1.j1
    public void y(long j17) {
        if (p2.q.a(this.f483558e, j17)) {
            return;
        }
        this.f483557d.mo146xb9724478(new p2.q(j17));
        this.f483558e = j17;
    }
}
