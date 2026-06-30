package g1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public p2.f f349033a;

    /* renamed from: b, reason: collision with root package name */
    public p2.s f349034b;

    /* renamed from: c, reason: collision with root package name */
    public e1.u f349035c;

    /* renamed from: d, reason: collision with root package name */
    public long f349036d;

    public a(p2.f fVar, p2.s sVar, e1.u uVar, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        fVar = (i17 & 1) != 0 ? g1.e.f349044a : fVar;
        sVar = (i17 & 2) != 0 ? p2.s.Ltr : sVar;
        uVar = (i17 & 4) != 0 ? new g1.l() : uVar;
        if ((i17 & 8) != 0) {
            int i18 = d1.k.f307176d;
            j17 = d1.k.f307174b;
        }
        this.f349033a = fVar;
        this.f349034b = sVar;
        this.f349035c = uVar;
        this.f349036d = j17;
    }

    /* renamed from: equals */
    public boolean m130617xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1.a)) {
            return false;
        }
        g1.a aVar = (g1.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349033a, aVar.f349033a) && this.f349034b == aVar.f349034b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349035c, aVar.f349035c) && d1.k.a(this.f349036d, aVar.f349036d);
    }

    /* renamed from: hashCode */
    public int m130618x8cdac1b() {
        int hashCode = ((((this.f349033a.hashCode() * 31) + this.f349034b.hashCode()) * 31) + this.f349035c.hashCode()) * 31;
        long j17 = this.f349036d;
        int i17 = d1.k.f307176d;
        return hashCode + java.lang.Long.hashCode(j17);
    }

    /* renamed from: toString */
    public java.lang.String m130619x9616526c() {
        return "DrawParams(density=" + this.f349033a + ", layoutDirection=" + this.f349034b + ", canvas=" + this.f349035c + ", size=" + ((java.lang.Object) d1.k.f(this.f349036d)) + ')';
    }
}
