package yj;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f544158a;

    /* renamed from: b, reason: collision with root package name */
    public int f544159b;

    /* renamed from: c, reason: collision with root package name */
    public int f544160c;

    /* renamed from: d, reason: collision with root package name */
    public int f544161d;

    /* renamed from: e, reason: collision with root package name */
    public int f544162e;

    public a(com.p314xaae8f345.mm.p2495xc50a8b8b.g reportLink, int i17, int i18, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        reportLink = (i28 & 1) != 0 ? com.p314xaae8f345.mm.p2495xc50a8b8b.g.c("") : reportLink;
        i17 = (i28 & 2) != 0 ? 0 : i17;
        i18 = (i28 & 4) != 0 ? 0 : i18;
        i19 = (i28 & 8) != 0 ? 0 : i19;
        i27 = (i28 & 16) != 0 ? 0 : i27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportLink, "reportLink");
        this.f544158a = reportLink;
        this.f544159b = i17;
        this.f544160c = i18;
        this.f544161d = i19;
        this.f544162e = i27;
    }

    /* renamed from: equals */
    public boolean m177195xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj.a)) {
            return false;
        }
        yj.a aVar = (yj.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544158a, aVar.f544158a) && this.f544159b == aVar.f544159b && this.f544160c == aVar.f544160c && this.f544161d == aVar.f544161d && this.f544162e == aVar.f544162e;
    }

    /* renamed from: hashCode */
    public int m177196x8cdac1b() {
        return (((((((this.f544158a.hashCode() * 31) + java.lang.Integer.hashCode(this.f544159b)) * 31) + java.lang.Integer.hashCode(this.f544160c)) * 31) + java.lang.Integer.hashCode(this.f544161d)) * 31) + java.lang.Integer.hashCode(this.f544162e);
    }

    /* renamed from: toString */
    public java.lang.String m177197x9616526c() {
        return "ReportProcessData(reportLink=" + this.f544158a + ", notDisplayAdReason=" + this.f544159b + ", clickPosId=" + this.f544160c + ", exposeType=" + this.f544161d + ", exposeTime=" + this.f544162e + ')';
    }
}
