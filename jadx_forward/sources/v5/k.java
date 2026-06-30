package v5;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f514822a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap.Config f514823b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.ColorSpace f514824c;

    /* renamed from: d, reason: collision with root package name */
    public final d6.g f514825d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f514826e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f514827f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f514828g;

    /* renamed from: h, reason: collision with root package name */
    public final l36.i0 f514829h;

    /* renamed from: i, reason: collision with root package name */
    public final c6.p f514830i;

    /* renamed from: j, reason: collision with root package name */
    public final c6.b f514831j;

    /* renamed from: k, reason: collision with root package name */
    public final c6.b f514832k;

    /* renamed from: l, reason: collision with root package name */
    public final c6.b f514833l;

    public k(android.content.Context context, android.graphics.Bitmap.Config config, android.graphics.ColorSpace colorSpace, d6.g scale, boolean z17, boolean z18, boolean z19, l36.i0 headers, c6.p parameters, c6.b memoryCachePolicy, c6.b diskCachePolicy, c6.b networkCachePolicy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scale, "scale");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameters, "parameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memoryCachePolicy, "memoryCachePolicy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(diskCachePolicy, "diskCachePolicy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(networkCachePolicy, "networkCachePolicy");
        this.f514822a = context;
        this.f514823b = config;
        this.f514824c = colorSpace;
        this.f514825d = scale;
        this.f514826e = z17;
        this.f514827f = z18;
        this.f514828g = z19;
        this.f514829h = headers;
        this.f514830i = parameters;
        this.f514831j = memoryCachePolicy;
        this.f514832k = diskCachePolicy;
        this.f514833l = networkCachePolicy;
    }

    /* renamed from: equals */
    public boolean m171117xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v5.k) {
            v5.k kVar = (v5.k) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514822a, kVar.f514822a) && this.f514823b == kVar.f514823b && ((android.os.Build.VERSION.SDK_INT < 26 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514824c, kVar.f514824c)) && this.f514825d == kVar.f514825d && this.f514826e == kVar.f514826e && this.f514827f == kVar.f514827f && this.f514828g == kVar.f514828g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514829h, kVar.f514829h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f514830i, kVar.f514830i) && this.f514831j == kVar.f514831j && this.f514832k == kVar.f514832k && this.f514833l == kVar.f514833l)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m171118x8cdac1b() {
        int hashCode = ((this.f514822a.hashCode() * 31) + this.f514823b.hashCode()) * 31;
        android.graphics.ColorSpace colorSpace = this.f514824c;
        return ((((((((((((((((((hashCode + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31) + this.f514825d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f514826e)) * 31) + java.lang.Boolean.hashCode(this.f514827f)) * 31) + java.lang.Boolean.hashCode(this.f514828g)) * 31) + this.f514829h.m145024x8cdac1b()) * 31) + this.f514830i.m14217x8cdac1b()) * 31) + this.f514831j.hashCode()) * 31) + this.f514832k.hashCode()) * 31) + this.f514833l.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m171119x9616526c() {
        return "Options(context=" + this.f514822a + ", config=" + this.f514823b + ", colorSpace=" + this.f514824c + ", scale=" + this.f514825d + ", allowInexactSize=" + this.f514826e + ", allowRgb565=" + this.f514827f + ", premultipliedAlpha=" + this.f514828g + ", headers=" + this.f514829h + ", parameters=" + this.f514830i + ", memoryCachePolicy=" + this.f514831j + ", diskCachePolicy=" + this.f514832k + ", networkCachePolicy=" + this.f514833l + ')';
    }
}
