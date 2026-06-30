package kn0;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f391129a;

    /* renamed from: b, reason: collision with root package name */
    public int f391130b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f391131c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f391132d;

    public r(java.lang.String url, int i17, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        this.f391129a = url;
        this.f391130b = i17;
        this.f391131c = str;
        this.f391132d = str2;
    }

    /* renamed from: equals */
    public boolean m143770xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.r)) {
            return false;
        }
        kn0.r rVar = (kn0.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391129a, rVar.f391129a) && this.f391130b == rVar.f391130b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391131c, rVar.f391131c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391132d, rVar.f391132d);
    }

    /* renamed from: hashCode */
    public int m143771x8cdac1b() {
        int hashCode = ((this.f391129a.hashCode() * 31) + java.lang.Integer.hashCode(this.f391130b)) * 31;
        java.lang.String str = this.f391131c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f391132d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m143772x9616526c() {
        return "url:" + this.f391129a + ", level:" + this.f391130b + ", desc:" + this.f391131c + " backUrl: " + this.f391132d;
    }
}
