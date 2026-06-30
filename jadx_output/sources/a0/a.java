package a0;

/* loaded from: classes14.dex */
public final class a extends androidx.compose.ui.platform.i3 implements b1.h {

    /* renamed from: d, reason: collision with root package name */
    public final e1.y f51d;

    /* renamed from: e, reason: collision with root package name */
    public final e1.r f52e;

    /* renamed from: f, reason: collision with root package name */
    public final float f53f;

    /* renamed from: g, reason: collision with root package name */
    public final e1.a1 f54g;

    /* renamed from: h, reason: collision with root package name */
    public d1.k f55h;

    /* renamed from: i, reason: collision with root package name */
    public e1.m0 f56i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e1.y yVar, e1.r rVar, float f17, e1.a1 a1Var, yz5.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        super(lVar);
        yVar = (i17 & 1) != 0 ? null : yVar;
        rVar = (i17 & 2) != 0 ? null : rVar;
        f17 = (i17 & 4) != 0 ? 1.0f : f17;
        this.f51d = yVar;
        this.f52e = rVar;
        this.f53f = f17;
        this.f54g = a1Var;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0126  */
    @Override // b1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P(g1.f r33) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.a.P(g1.f):void");
    }

    public boolean equals(java.lang.Object obj) {
        a0.a aVar = obj instanceof a0.a ? (a0.a) obj : null;
        if (aVar != null && kotlin.jvm.internal.o.b(this.f51d, aVar.f51d) && kotlin.jvm.internal.o.b(this.f52e, aVar.f52e)) {
            return ((this.f53f > aVar.f53f ? 1 : (this.f53f == aVar.f53f ? 0 : -1)) == 0) && kotlin.jvm.internal.o.b(this.f54g, aVar.f54g);
        }
        return false;
    }

    public int hashCode() {
        e1.y yVar = this.f51d;
        int hashCode = (yVar != null ? java.lang.Long.hashCode(yVar.f246322a) : 0) * 31;
        e1.r rVar = this.f52e;
        return ((((hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.f53f)) * 31) + this.f54g.hashCode();
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

    public java.lang.String toString() {
        return "Background(color=" + this.f51d + ", brush=" + this.f52e + ", alpha = " + this.f53f + ", shape=" + this.f54g + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
