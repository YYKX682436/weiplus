package d12;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f307248a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f307249b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f307250c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f307251d;

    /* renamed from: e, reason: collision with root package name */
    public final int f307252e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f307253f;

    public b(java.lang.String keyword, java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.String str3, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        keyword = (i18 & 1) != 0 ? "" : keyword;
        str = (i18 & 2) != 0 ? null : str;
        str2 = (i18 & 4) != 0 ? null : str2;
        z17 = (i18 & 8) != 0 ? false : z17;
        i17 = (i18 & 16) != 0 ? 10 : i17;
        str3 = (i18 & 32) != 0 ? null : str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        this.f307248a = keyword;
        this.f307249b = str;
        this.f307250c = str2;
        this.f307251d = z17;
        this.f307252e = i17;
        this.f307253f = str3;
    }

    /* renamed from: equals */
    public boolean m123358xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d12.b)) {
            return false;
        }
        d12.b bVar = (d12.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f307248a, bVar.f307248a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f307249b, bVar.f307249b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f307250c, bVar.f307250c) && this.f307251d == bVar.f307251d && this.f307252e == bVar.f307252e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f307253f, bVar.f307253f);
    }

    /* renamed from: hashCode */
    public int m123359x8cdac1b() {
        int hashCode = this.f307248a.hashCode() * 31;
        java.lang.String str = this.f307249b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f307250c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f307251d)) * 31) + java.lang.Integer.hashCode(this.f307252e)) * 31;
        java.lang.String str3 = this.f307253f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m123360x9616526c() {
        return "LuckyBagInfo(keyword=" + this.f307248a + ", traceId=" + this.f307249b + ", appId=" + this.f307250c + ", hasLuckyBag=" + this.f307251d + ", interval=" + this.f307252e + ", url=" + this.f307253f + ')';
    }
}
