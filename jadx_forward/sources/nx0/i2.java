package nx0;

/* loaded from: classes5.dex */
public final class i2 {

    /* renamed from: f, reason: collision with root package name */
    public static final nx0.i2 f422664f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f422665a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f422666b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f422667c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f422668d;

    /* renamed from: e, reason: collision with root package name */
    public float f422669e;

    static {
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.n1f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
        f422664f = new nx0.i2("", g17, "", false, 0.0f, 24, null);
    }

    public i2(java.lang.String id6, java.lang.String name, java.lang.String thumbnailURL, boolean z17, float f17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        f17 = (i17 & 16) != 0 ? 0.0f : f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnailURL, "thumbnailURL");
        this.f422665a = id6;
        this.f422666b = name;
        this.f422667c = thumbnailURL;
        this.f422668d = z17;
        this.f422669e = f17;
    }

    public final boolean a() {
        return this == f422664f;
    }

    /* renamed from: equals */
    public boolean m150251xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0.i2)) {
            return false;
        }
        nx0.i2 i2Var = (nx0.i2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422665a, i2Var.f422665a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422666b, i2Var.f422666b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422667c, i2Var.f422667c) && this.f422668d == i2Var.f422668d && java.lang.Float.compare(this.f422669e, i2Var.f422669e) == 0;
    }

    /* renamed from: hashCode */
    public int m150252x8cdac1b() {
        return (((((((this.f422665a.hashCode() * 31) + this.f422666b.hashCode()) * 31) + this.f422667c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f422668d)) * 31) + java.lang.Float.hashCode(this.f422669e);
    }

    /* renamed from: toString */
    public java.lang.String m150253x9616526c() {
        return "FilterItem(id=" + this.f422665a + ", name=" + this.f422666b + ", thumbnailURL=" + this.f422667c + ", isSelected=" + this.f422668d + ", intensity=" + this.f422669e + ')';
    }
}
