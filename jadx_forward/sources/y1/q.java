package y1;

/* loaded from: classes14.dex */
public final class q implements y1.o {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f540318f;

    /* renamed from: d, reason: collision with root package name */
    public final int f540319d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.l f540320e;

    static {
        new y1.p(null);
        f540318f = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public q(int i17, boolean z17, boolean z18, yz5.l properties) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(properties, "properties");
        this.f540319d = i17;
        y1.l lVar = new y1.l();
        lVar.f540300e = z17;
        lVar.f540301f = z18;
        properties.mo146xb9724478(lVar);
        this.f540320e = lVar;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* renamed from: equals */
    public boolean m176349xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1.q)) {
            return false;
        }
        y1.q qVar = (y1.q) obj;
        if (this.f540319d != qVar.f540319d) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540320e, qVar.f540320e);
    }

    /* renamed from: hashCode */
    public int m176350x8cdac1b() {
        return (this.f540320e.m176341x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f540319d);
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
