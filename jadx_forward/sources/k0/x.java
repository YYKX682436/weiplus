package k0;

/* loaded from: classes14.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final j0.u1 f384502a;

    /* renamed from: b, reason: collision with root package name */
    public final long f384503b;

    public x(j0.u1 u1Var, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f384502a = u1Var;
        this.f384503b = j17;
    }

    /* renamed from: equals */
    public boolean m141676xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0.x)) {
            return false;
        }
        k0.x xVar = (k0.x) obj;
        return this.f384502a == xVar.f384502a && d1.e.a(this.f384503b, xVar.f384503b);
    }

    /* renamed from: hashCode */
    public int m141677x8cdac1b() {
        int hashCode = this.f384502a.hashCode() * 31;
        int i17 = d1.e.f307159e;
        return hashCode + java.lang.Long.hashCode(this.f384503b);
    }

    /* renamed from: toString */
    public java.lang.String m141678x9616526c() {
        return "SelectionHandleInfo(handle=" + this.f384502a + ", position=" + ((java.lang.Object) d1.e.h(this.f384503b)) + ')';
    }
}
