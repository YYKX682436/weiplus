package hx5;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f367240a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f367241b;

    /* renamed from: c, reason: collision with root package name */
    public final int f367242c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f367243d;

    public d(java.lang.String appId, java.lang.String UUID, int i17, java.lang.String versionName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(UUID, "UUID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionName, "versionName");
        this.f367240a = appId;
        this.f367241b = UUID;
        this.f367242c = i17;
        this.f367243d = versionName;
    }

    /* renamed from: equals */
    public boolean m134240xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx5.d)) {
            return false;
        }
        hx5.d dVar = (hx5.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f367240a, dVar.f367240a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f367241b, dVar.f367241b) && this.f367242c == dVar.f367242c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f367243d, dVar.f367243d);
    }

    /* renamed from: hashCode */
    public int m134241x8cdac1b() {
        return (((((this.f367240a.hashCode() * 31) + this.f367241b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f367242c)) * 31) + this.f367243d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m134242x9616526c() {
        return "WVAAppInfo(appId=" + this.f367240a + ", UUID=" + this.f367241b + ", versionCode=" + this.f367242c + ", versionName=" + this.f367243d + ')';
    }
}
