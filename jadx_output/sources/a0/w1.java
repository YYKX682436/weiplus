package a0;

/* loaded from: classes14.dex */
public final class w1 implements b1.h {

    /* renamed from: d, reason: collision with root package name */
    public final a0.s1 f327d;

    public w1(a0.s1 indicationInstance) {
        kotlin.jvm.internal.o.g(indicationInstance, "indicationInstance");
        this.f327d = indicationInstance;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // b1.h
    public void P(g1.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        this.f327d.a(fVar);
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
