package a0;

/* loaded from: classes14.dex */
public final class w1 implements b1.h {

    /* renamed from: d, reason: collision with root package name */
    public final a0.s1 f81860d;

    public w1(a0.s1 indicationInstance) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indicationInstance, "indicationInstance");
        this.f81860d = indicationInstance;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // b1.h
    public void P(g1.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        this.f81860d.a(fVar);
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
