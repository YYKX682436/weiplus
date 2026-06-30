package xj;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f536286a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f536287b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f536288c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f536289d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f536290e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f536291f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f536292g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f536293h;

    public m(java.lang.String aid, java.lang.String hintText, java.lang.String adDescText, java.lang.String iconUrl, java.lang.String iconUrlForDark, java.lang.String str, java.lang.Long l17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aid, "aid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hintText, "hintText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adDescText, "adDescText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrlForDark, "iconUrlForDark");
        this.f536286a = aid;
        this.f536287b = hintText;
        this.f536288c = adDescText;
        this.f536289d = iconUrl;
        this.f536290e = iconUrlForDark;
        this.f536291f = str;
        this.f536292g = l17;
        this.f536293h = z17;
    }

    /* renamed from: equals */
    public boolean m175608xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj.m)) {
            return false;
        }
        xj.m mVar = (xj.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536286a, mVar.f536286a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536287b, mVar.f536287b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536288c, mVar.f536288c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536289d, mVar.f536289d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536290e, mVar.f536290e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536291f, mVar.f536291f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536292g, mVar.f536292g) && this.f536293h == mVar.f536293h;
    }

    /* renamed from: hashCode */
    public int m175609x8cdac1b() {
        int hashCode = ((((((((this.f536286a.hashCode() * 31) + this.f536287b.hashCode()) * 31) + this.f536288c.hashCode()) * 31) + this.f536289d.hashCode()) * 31) + this.f536290e.hashCode()) * 31;
        java.lang.String str = this.f536291f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l17 = this.f536292g;
        return ((hashCode2 + (l17 != null ? l17.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f536293h);
    }

    /* renamed from: toString */
    public java.lang.String m175610x9616526c() {
        return "MagicAdInfo(aid=" + this.f536286a + ", hintText=" + this.f536287b + ", adDescText=" + this.f536288c + ", iconUrl=" + this.f536289d + ", iconUrlForDark=" + this.f536290e + ", pkgName=" + this.f536291f + ", applicationMinVersion=" + this.f536292g + ", matchLetActiveCondition=" + this.f536293h + ')';
    }
}
