package nx0;

/* loaded from: classes5.dex */
public final class b3 {

    /* renamed from: g, reason: collision with root package name */
    public static final nx0.b3 f422607g;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f422608a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f422609b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f422610c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f422611d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f422612e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f422613f;

    static {
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n1f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
        f422607g = new nx0.b3("", g17, "", false, false, true, 24, null);
    }

    public b3(java.lang.String id6, java.lang.String name, java.lang.String thumbnailURL, boolean z17, boolean z18, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        z18 = (i17 & 16) != 0 ? false : z18;
        z19 = (i17 & 32) != 0 ? false : z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnailURL, "thumbnailURL");
        this.f422608a = id6;
        this.f422609b = name;
        this.f422610c = thumbnailURL;
        this.f422611d = z17;
        this.f422612e = z18;
        this.f422613f = z19;
    }

    /* renamed from: equals */
    public boolean m150234xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0.b3)) {
            return false;
        }
        nx0.b3 b3Var = (nx0.b3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422608a, b3Var.f422608a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422609b, b3Var.f422609b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422610c, b3Var.f422610c) && this.f422611d == b3Var.f422611d && this.f422612e == b3Var.f422612e && this.f422613f == b3Var.f422613f;
    }

    /* renamed from: hashCode */
    public int m150235x8cdac1b() {
        return (((((((((this.f422608a.hashCode() * 31) + this.f422609b.hashCode()) * 31) + this.f422610c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f422611d)) * 31) + java.lang.Boolean.hashCode(this.f422612e)) * 31) + java.lang.Boolean.hashCode(this.f422613f);
    }

    /* renamed from: toString */
    public java.lang.String m150236x9616526c() {
        return "MakeupGroup(id=" + this.f422608a + ", name=" + this.f422609b + ", thumbnailURL=" + this.f422610c + ", isSelected=" + this.f422611d + ", isLoading=" + this.f422612e + ", isLoaded=" + this.f422613f + ')';
    }
}
