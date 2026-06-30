package bu2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f106024a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f106025b;

    /* renamed from: c, reason: collision with root package name */
    public r45.i31 f106026c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f106027d;

    public a(int i17, java.lang.String name, r45.i31 page, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 8) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        this.f106024a = i17;
        this.f106025b = name;
        this.f106026c = page;
        this.f106027d = z17;
    }

    /* renamed from: equals */
    public boolean m11281xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2.a)) {
            return false;
        }
        bu2.a aVar = (bu2.a) obj;
        return this.f106024a == aVar.f106024a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106025b, aVar.f106025b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106026c, aVar.f106026c) && this.f106027d == aVar.f106027d;
    }

    /* renamed from: hashCode */
    public int m11282x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f106024a) * 31) + this.f106025b.hashCode()) * 31) + this.f106026c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f106027d);
    }

    /* renamed from: toString */
    public java.lang.String m11283x9616526c() {
        return "CachePage(type=" + this.f106024a + ", name=" + this.f106025b + ", page=" + this.f106026c + ", read=" + this.f106027d + ')';
    }
}
