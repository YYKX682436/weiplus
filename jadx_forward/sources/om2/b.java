package om2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427804a;

    /* renamed from: b, reason: collision with root package name */
    public final int f427805b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f427806c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f427807d;

    public b(java.lang.String id6, int i17, java.lang.String url, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f427804a = id6;
        this.f427805b = i17;
        this.f427806c = url;
        this.f427807d = name;
    }

    /* renamed from: equals */
    public boolean m151652xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.b)) {
            return false;
        }
        om2.b bVar = (om2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427804a, bVar.f427804a) && this.f427805b == bVar.f427805b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427806c, bVar.f427806c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427807d, bVar.f427807d);
    }

    /* renamed from: hashCode */
    public int m151653x8cdac1b() {
        return (((((this.f427804a.hashCode() * 31) + java.lang.Integer.hashCode(this.f427805b)) * 31) + this.f427806c.hashCode()) * 31) + this.f427807d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151654x9616526c() {
        return "KTVReverbData(id=" + this.f427804a + ", reverbType=" + this.f427805b + ", url=" + this.f427806c + ", name=" + this.f427807d + ')';
    }
}
