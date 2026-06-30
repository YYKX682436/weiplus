package a2;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final a2.t f82345a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.s f82346b;

    public u(a2.t tVar, a2.s sVar) {
        this.f82345a = tVar;
        this.f82346b = sVar;
    }

    /* renamed from: equals */
    public boolean m409xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.u)) {
            return false;
        }
        a2.u uVar = (a2.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82346b, uVar.f82346b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82345a, uVar.f82345a);
    }

    /* renamed from: hashCode */
    public int m410x8cdac1b() {
        a2.t tVar = this.f82345a;
        int m406x8cdac1b = (tVar != null ? tVar.m406x8cdac1b() : 0) * 31;
        a2.s sVar = this.f82346b;
        return m406x8cdac1b + (sVar != null ? sVar.m401x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m411x9616526c() {
        return "PlatformTextStyle(spanStyle=" + this.f82345a + ", paragraphSyle=" + this.f82346b + ')';
    }
}
