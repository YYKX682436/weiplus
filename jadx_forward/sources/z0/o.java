package z0;

/* loaded from: classes14.dex */
public final class o extends z0.j {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f550450e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f550451f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f550452g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f550453h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String fqName, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, yz5.l inspectorInfo, yz5.q factory) {
        super(inspectorInfo, factory);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inspectorInfo, "inspectorInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(factory, "factory");
        this.f550450e = fqName;
        this.f550451f = obj;
        this.f550452g = obj2;
        this.f550453h = obj3;
    }

    /* renamed from: equals */
    public boolean m178220xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof z0.o) {
            z0.o oVar = (z0.o) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550450e, oVar.f550450e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550451f, oVar.f550451f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550452g, oVar.f550452g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550453h, oVar.f550453h)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178221x8cdac1b() {
        int hashCode = this.f550450e.hashCode() * 31;
        java.lang.Object obj = this.f550451f;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        java.lang.Object obj2 = this.f550452g;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        java.lang.Object obj3 = this.f550453h;
        return hashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }
}
