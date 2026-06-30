package d71;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f308401a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f308402b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f308403c;

    /* renamed from: d, reason: collision with root package name */
    public final int f308404d;

    /* renamed from: e, reason: collision with root package name */
    public final int f308405e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f308406f;

    public a(java.lang.String str, java.lang.String str2, java.util.List arrayFormats, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayFormats, "arrayFormats");
        this.f308401a = str;
        this.f308402b = str2;
        this.f308403c = arrayFormats;
        this.f308404d = i17;
        this.f308405e = i18;
        this.f308406f = z17;
    }

    /* renamed from: equals */
    public boolean m123627xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d71.a)) {
            return false;
        }
        d71.a aVar = (d71.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308401a, aVar.f308401a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308402b, aVar.f308402b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308403c, aVar.f308403c) && this.f308404d == aVar.f308404d && this.f308405e == aVar.f308405e && this.f308406f == aVar.f308406f;
    }

    /* renamed from: hashCode */
    public int m123628x8cdac1b() {
        java.lang.String str = this.f308401a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f308402b;
        return ((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f308403c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f308404d)) * 31) + java.lang.Integer.hashCode(this.f308405e)) * 31) + java.lang.Boolean.hashCode(this.f308406f);
    }

    /* renamed from: toString */
    public java.lang.String m123629x9616526c() {
        return "CountryFormatConfig(nsCountryCode=" + this.f308401a + ", nsISOCode=" + this.f308402b + ", arrayFormats=" + this.f308403c + ", uiMinLength=" + this.f308404d + ", uiMaxLength=" + this.f308405e + ", bHasLeading=" + this.f308406f + ')';
    }
}
