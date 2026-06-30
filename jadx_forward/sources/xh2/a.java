package xh2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public km2.q f536053a;

    /* renamed from: b, reason: collision with root package name */
    public xh2.i f536054b;

    public a(km2.q qVar, xh2.i layoutInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutInfo, "layoutInfo");
        this.f536053a = qVar;
        this.f536054b = layoutInfo;
    }

    public final xh2.a a() {
        km2.q qVar = this.f536053a;
        return new xh2.a(qVar != null ? qVar.a() : null, this.f536054b.a());
    }

    public final java.lang.String b() {
        java.lang.String str;
        km2.q qVar = this.f536053a;
        return (qVar == null || (str = qVar.f390703a) == null) ? "" : str;
    }

    /* renamed from: equals */
    public boolean m175533xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.a)) {
            return false;
        }
        xh2.a aVar = (xh2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536053a, aVar.f536053a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536054b, aVar.f536054b);
    }

    /* renamed from: hashCode */
    public int m175534x8cdac1b() {
        km2.q qVar = this.f536053a;
        return ((qVar == null ? 0 : qVar.m143684x8cdac1b()) * 31) + this.f536054b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175535x9616526c() {
        return "sdkUserId: " + b() + " layoutInfo: " + this.f536054b;
    }
}
