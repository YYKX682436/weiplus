package dd5;

/* loaded from: classes9.dex */
public final class m implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310740a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310741b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310742c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f310743d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f310744e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f310745f;

    /* renamed from: g, reason: collision with root package name */
    public final int f310746g;

    /* renamed from: h, reason: collision with root package name */
    public final int f310747h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310748i;

    public m(java.lang.CharSequence title, java.lang.CharSequence desc, java.lang.String str, java.lang.String imgPath, java.lang.String weAppUsername, java.lang.String appId, int i17, int i18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppUsername, "weAppUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310740a = title;
        this.f310741b = desc;
        this.f310742c = str;
        this.f310743d = imgPath;
        this.f310744e = weAppUsername;
        this.f310745f = appId;
        this.f310746g = i17;
        this.f310747h = i18;
        this.f310748i = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310740a, this.f310741b);
    }

    /* renamed from: equals */
    public boolean m124049xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.m)) {
            return false;
        }
        dd5.m mVar = (dd5.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310740a, mVar.f310740a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310741b, mVar.f310741b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310742c, mVar.f310742c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310743d, mVar.f310743d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310744e, mVar.f310744e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310745f, mVar.f310745f) && this.f310746g == mVar.f310746g && this.f310747h == mVar.f310747h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310748i, mVar.f310748i);
    }

    /* renamed from: hashCode */
    public int m124050x8cdac1b() {
        int hashCode = ((this.f310740a.hashCode() * 31) + this.f310741b.hashCode()) * 31;
        java.lang.String str = this.f310742c;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f310743d.hashCode()) * 31) + this.f310744e.hashCode()) * 31) + this.f310745f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f310746g)) * 31) + java.lang.Integer.hashCode(this.f310747h)) * 31) + this.f310748i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124051x9616526c() {
        return "ViewModel(title=" + ((java.lang.Object) this.f310740a) + ", desc=" + ((java.lang.Object) this.f310741b) + ", imgUrl=" + this.f310742c + ", imgPath=" + this.f310743d + ", weAppUsername=" + this.f310744e + ", appId=" + this.f310745f + ", version=" + this.f310746g + ", pkgDebugType=" + this.f310747h + ", msgInfo=" + this.f310748i + ')';
    }
}
