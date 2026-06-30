package nf5;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f418414a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f418415b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f418416c;

    public a(java.lang.String name, java.lang.String light, java.lang.String dark) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(light, "light");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dark, "dark");
        this.f418414a = name;
        this.f418415b = light;
        this.f418416c = dark;
    }

    /* renamed from: equals */
    public boolean m149524xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf5.a)) {
            return false;
        }
        nf5.a aVar = (nf5.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418414a, aVar.f418414a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418415b, aVar.f418415b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418416c, aVar.f418416c);
    }

    /* renamed from: hashCode */
    public int m149525x8cdac1b() {
        return (((this.f418414a.hashCode() * 31) + this.f418415b.hashCode()) * 31) + this.f418416c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149526x9616526c() {
        return "WeUIColorToken(name=" + this.f418414a + ", light=" + this.f418415b + ", dark=" + this.f418416c + ')';
    }
}
