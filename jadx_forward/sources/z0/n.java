package z0;

/* loaded from: classes14.dex */
public final class n extends z0.j {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f550447e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f550448f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f550449g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String fqName, java.lang.Object obj, java.lang.Object obj2, yz5.l inspectorInfo, yz5.q factory) {
        super(inspectorInfo, factory);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(factory, "factory");
        this.f550447e = fqName;
        this.f550448f = obj;
        this.f550449g = obj2;
    }

    /* renamed from: equals */
    public boolean m178218xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof z0.n) {
            z0.n nVar = (z0.n) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550447e, nVar.f550447e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550448f, nVar.f550448f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550449g, nVar.f550449g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178219x8cdac1b() {
        int hashCode = this.f550447e.hashCode() * 31;
        java.lang.Object obj = this.f550448f;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        java.lang.Object obj2 = this.f550449g;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }
}
