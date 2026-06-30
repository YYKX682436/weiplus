package df;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f311015a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f311016b;

    /* renamed from: c, reason: collision with root package name */
    public final int f311017c;

    /* renamed from: d, reason: collision with root package name */
    public final int f311018d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f311019e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f311020f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f311021g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.p2936x80def495.EnumC25558x9d00a2c8 f311022h;

    public i(long j17, boolean z17, int i17, int i18, boolean z18, java.lang.String splashAppId, java.lang.String splashPath, com.p314xaae8f345.p2936x80def495.EnumC25558x9d00a2c8 colorScheme) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(splashAppId, "splashAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(splashPath, "splashPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorScheme, "colorScheme");
        this.f311015a = j17;
        this.f311016b = z17;
        this.f311017c = i17;
        this.f311018d = i18;
        this.f311019e = z18;
        this.f311020f = splashAppId;
        this.f311021g = splashPath;
        this.f311022h = colorScheme;
    }

    /* renamed from: equals */
    public boolean m124136xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df.i)) {
            return false;
        }
        df.i iVar = (df.i) obj;
        return this.f311015a == iVar.f311015a && this.f311016b == iVar.f311016b && this.f311017c == iVar.f311017c && this.f311018d == iVar.f311018d && this.f311019e == iVar.f311019e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311020f, iVar.f311020f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311021g, iVar.f311021g) && this.f311022h == iVar.f311022h;
    }

    /* renamed from: hashCode */
    public int m124137x8cdac1b() {
        return (((((((((((((java.lang.Long.hashCode(this.f311015a) * 31) + java.lang.Boolean.hashCode(this.f311016b)) * 31) + java.lang.Integer.hashCode(this.f311017c)) * 31) + java.lang.Integer.hashCode(this.f311018d)) * 31) + java.lang.Boolean.hashCode(this.f311019e)) * 31) + this.f311020f.hashCode()) * 31) + this.f311021g.hashCode()) * 31) + this.f311022h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124138x9616526c() {
        return "SkylineConstructArgs(runtimePtr=" + this.f311015a + ", createRuntime=" + this.f311016b + ", width=" + this.f311017c + ", height=" + this.f311018d + ", useSplashCache=" + this.f311019e + ", splashAppId=" + this.f311020f + ", splashPath=" + this.f311021g + ", colorScheme=" + this.f311022h + ')';
    }
}
