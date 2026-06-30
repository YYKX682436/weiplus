package o25;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f424014a;

    /* renamed from: b, reason: collision with root package name */
    public final int f424015b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f424016c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f424017d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f424018e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f424019f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f424020g;

    public c(java.util.List coverUrls, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrls, "coverUrls");
        this.f424014a = coverUrls;
        this.f424015b = i17;
        this.f424016c = str;
        this.f424017d = str2;
        this.f424018e = str3;
        this.f424019f = str4;
        this.f424020g = str5;
    }

    /* renamed from: equals */
    public boolean m150480xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o25.c)) {
            return false;
        }
        o25.c cVar = (o25.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424014a, cVar.f424014a) && this.f424015b == cVar.f424015b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424016c, cVar.f424016c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424017d, cVar.f424017d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424018e, cVar.f424018e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424019f, cVar.f424019f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f424020g, cVar.f424020g);
    }

    /* renamed from: hashCode */
    public int m150481x8cdac1b() {
        int hashCode = ((this.f424014a.hashCode() * 31) + java.lang.Integer.hashCode(this.f424015b)) * 31;
        java.lang.String str = this.f424016c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f424017d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f424018e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f424019f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f424020g;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m150482x9616526c() {
        return "CoverFields(coverUrls=" + this.f424014a + ", coversDisplayMode=" + this.f424015b + ", cover=" + this.f424016c + ", cover11=" + this.f424017d + ", cover34=" + this.f424018e + ", cover1235=" + this.f424019f + ", cover169=" + this.f424020g + ')';
    }
}
