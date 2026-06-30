package y00;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f540078a;

    /* renamed from: b, reason: collision with root package name */
    public final long f540079b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f540080c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f540081d;

    public s(java.lang.String talker, long j17, java.util.List products, java.lang.String reportExtraInfoJson) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(products, "products");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExtraInfoJson, "reportExtraInfoJson");
        this.f540078a = talker;
        this.f540079b = j17;
        this.f540080c = products;
        this.f540081d = reportExtraInfoJson;
    }

    /* renamed from: equals */
    public boolean m176269xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00.s)) {
            return false;
        }
        y00.s sVar = (y00.s) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540078a, sVar.f540078a) && this.f540079b == sVar.f540079b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540080c, sVar.f540080c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540081d, sVar.f540081d);
    }

    /* renamed from: hashCode */
    public int m176270x8cdac1b() {
        return (((((this.f540078a.hashCode() * 31) + java.lang.Long.hashCode(this.f540079b)) * 31) + this.f540080c.hashCode()) * 31) + this.f540081d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176271x9616526c() {
        return "EcsKfProductCardRequest(talker=" + this.f540078a + ", msgSvrId=" + this.f540079b + ", products=" + this.f540080c + ", reportExtraInfoJson=" + this.f540081d + ')';
    }
}
