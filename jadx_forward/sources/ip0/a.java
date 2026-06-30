package ip0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f375106a;

    /* renamed from: b, reason: collision with root package name */
    public final ip0.b f375107b;

    public a(java.lang.String str) {
        this.f375106a = str;
        this.f375107b = ip0.b.URI;
    }

    /* renamed from: equals */
    public boolean m139672xb2c87fbf(java.lang.Object obj) {
        java.lang.Object obj2 = this.f375106a;
        if (obj2 != null) {
            if ((obj2 instanceof ip0.c) && (obj instanceof ip0.a)) {
                ip0.a aVar = (ip0.a) obj;
                if (aVar.f375106a instanceof ip0.c) {
                    return ((ip0.c) obj2).n().equals(((ip0.c) aVar.f375106a).n());
                }
            }
            if (obj instanceof ip0.a) {
                return obj2.equals(((ip0.a) obj).f375106a);
            }
        }
        return super.equals(obj);
    }

    /* renamed from: hashCode */
    public int m139673x8cdac1b() {
        java.lang.Object obj = this.f375106a;
        return obj != null ? obj.hashCode() : super.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m139674x9616526c() {
        java.lang.Object obj = this.f375106a;
        return obj == null ? "" : obj instanceof ip0.c ? ((ip0.c) obj).n() : obj.toString();
    }

    public a(ip0.c cVar) {
        this.f375106a = cVar;
        this.f375107b = ip0.b.URI;
    }

    public a(java.lang.String str, ip0.b bVar) {
        this.f375106a = str;
        this.f375107b = bVar;
    }
}
