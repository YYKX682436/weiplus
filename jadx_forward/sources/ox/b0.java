package ox;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430978a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f430979b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f430980c;

    public b0(java.lang.String bizCntWording, java.lang.String coverImgUrl, java.lang.String aggrUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizCntWording, "bizCntWording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverImgUrl, "coverImgUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aggrUrl, "aggrUrl");
        this.f430978a = bizCntWording;
        this.f430979b = coverImgUrl;
        this.f430980c = aggrUrl;
    }

    /* renamed from: equals */
    public boolean m157283xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox.b0)) {
            return false;
        }
        ox.b0 b0Var = (ox.b0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430978a, b0Var.f430978a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430979b, b0Var.f430979b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430980c, b0Var.f430980c);
    }

    /* renamed from: hashCode */
    public int m157284x8cdac1b() {
        return (((this.f430978a.hashCode() * 31) + this.f430979b.hashCode()) * 31) + this.f430980c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157285x9616526c() {
        return "MomentPoiInfo(bizCntWording=" + this.f430978a + ", coverImgUrl=" + this.f430979b + ", aggrUrl=" + this.f430980c + ')';
    }
}
