package du3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final du3.a f325046e = new du3.a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.l f325047f = new jz5.l("c06ea14e737d3990e1d27c218cd1d524", i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.pdn));

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.l f325048g = new jz5.l("379c04e07d05f131d63ac559e54bf6e8", i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.pdo));

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.l f325049h = new jz5.l("023cf761adaff2e38afaa5b5b952848c", i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.pdl));

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.l f325050i = new jz5.l("c9255a86d6c422c1859284674af617fd", i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.pdm));

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f325051j = "0";

    /* renamed from: k, reason: collision with root package name */
    public static final int f325052k = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f325053a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f325054b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f325055c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f325056d;

    public b(int i17, java.lang.String template, java.lang.String title, java.lang.String hostUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(template, "template");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostUrl, "hostUrl");
        this.f325053a = i17;
        this.f325054b = template;
        this.f325055c = title;
        this.f325056d = hostUrl;
    }

    /* renamed from: equals */
    public boolean m126256xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du3.b)) {
            return false;
        }
        du3.b bVar = (du3.b) obj;
        return this.f325053a == bVar.f325053a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325054b, bVar.f325054b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325055c, bVar.f325055c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325056d, bVar.f325056d);
    }

    /* renamed from: hashCode */
    public int m126257x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f325053a) * 31) + this.f325054b.hashCode()) * 31) + this.f325055c.hashCode()) * 31) + this.f325056d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m126258x9616526c() {
        return "AiFeature(type=" + this.f325053a + ", template=" + this.f325054b + ", title=" + this.f325055c + ", hostUrl=" + this.f325056d + ')';
    }
}
