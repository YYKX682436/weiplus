package nx0;

/* loaded from: classes5.dex */
public final class r1 {

    /* renamed from: g, reason: collision with root package name */
    public static final nx0.r1 f422742g;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f422743a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f422744b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f422745c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f422746d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f422747e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f422748f;

    static {
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n1f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
        f422742g = new nx0.r1("", g17, "", false, false, true, 24, null);
    }

    public r1(java.lang.String id6, java.lang.String name, java.lang.String thumbnailURL, boolean z17, boolean z18, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        z18 = (i17 & 16) != 0 ? false : z18;
        z19 = (i17 & 32) != 0 ? false : z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnailURL, "thumbnailURL");
        this.f422743a = id6;
        this.f422744b = name;
        this.f422745c = thumbnailURL;
        this.f422746d = z17;
        this.f422747e = z18;
        this.f422748f = z19;
    }

    /* renamed from: equals */
    public boolean m150265xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0.r1)) {
            return false;
        }
        nx0.r1 r1Var = (nx0.r1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422743a, r1Var.f422743a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422744b, r1Var.f422744b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422745c, r1Var.f422745c) && this.f422746d == r1Var.f422746d && this.f422747e == r1Var.f422747e && this.f422748f == r1Var.f422748f;
    }

    /* renamed from: hashCode */
    public int m150266x8cdac1b() {
        return (((((((((this.f422743a.hashCode() * 31) + this.f422744b.hashCode()) * 31) + this.f422745c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f422746d)) * 31) + java.lang.Boolean.hashCode(this.f422747e)) * 31) + java.lang.Boolean.hashCode(this.f422748f);
    }

    /* renamed from: toString */
    public java.lang.String m150267x9616526c() {
        return "FaceEffectGroup(id=" + this.f422743a + ", name=" + this.f422744b + ", thumbnailURL=" + this.f422745c + ", isSelected=" + this.f422746d + ", isLoading=" + this.f422747e + ", isLoaded=" + this.f422748f + ')';
    }
}
