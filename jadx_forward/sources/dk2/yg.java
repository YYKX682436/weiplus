package dk2;

/* loaded from: classes10.dex */
public final class yg {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f315926a;

    /* renamed from: b, reason: collision with root package name */
    public long f315927b;

    /* renamed from: c, reason: collision with root package name */
    public int f315928c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f315929d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f315930e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f315931f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f315932g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f315933h;

    /* renamed from: i, reason: collision with root package name */
    public final int f315934i;

    public yg(java.lang.String songName, long j17, int i17, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songName, "songName");
        this.f315926a = songName;
        this.f315927b = j17;
        this.f315928c = i17;
        this.f315929d = z17;
        this.f315930e = z18;
        this.f315931f = z19;
        this.f315932g = z27;
        this.f315933h = str;
        this.f315934i = i18;
    }

    public final boolean a() {
        return this.f315934i == 0;
    }

    /* renamed from: equals */
    public boolean m124691xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.yg)) {
            return false;
        }
        dk2.yg ygVar = (dk2.yg) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315926a, ygVar.f315926a) && this.f315927b == ygVar.f315927b && this.f315928c == ygVar.f315928c && this.f315929d == ygVar.f315929d && this.f315930e == ygVar.f315930e && this.f315931f == ygVar.f315931f && this.f315932g == ygVar.f315932g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315933h, ygVar.f315933h) && this.f315934i == ygVar.f315934i;
    }

    /* renamed from: hashCode */
    public int m124692x8cdac1b() {
        int hashCode = ((((((((((((this.f315926a.hashCode() * 31) + java.lang.Long.hashCode(this.f315927b)) * 31) + java.lang.Integer.hashCode(this.f315928c)) * 31) + java.lang.Boolean.hashCode(this.f315929d)) * 31) + java.lang.Boolean.hashCode(this.f315930e)) * 31) + java.lang.Boolean.hashCode(this.f315931f)) * 31) + java.lang.Boolean.hashCode(this.f315932g)) * 31;
        java.lang.String str = this.f315933h;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f315934i);
    }

    /* renamed from: toString */
    public java.lang.String m124693x9616526c() {
        return "songName :" + this.f315926a + ", heat: " + this.f315927b + ", select:" + this.f315929d;
    }

    public /* synthetic */ yg(java.lang.String str, long j17, int i17, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String str2, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, j17, (i19 & 4) != 0 ? 3 : i17, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? true : z18, (i19 & 32) != 0 ? false : z19, (i19 & 64) != 0 ? false : z27, (i19 & 128) != 0 ? null : str2, (i19 & 256) != 0 ? 0 : i18);
    }
}
