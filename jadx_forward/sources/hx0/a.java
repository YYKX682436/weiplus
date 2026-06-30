package hx0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final xt0.h f367134a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f367135b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 f367136c;

    public a(xt0.h hVar, boolean z17, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4069xbe747ef4 exportSettings) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportSettings, "exportSettings");
        this.f367134a = hVar;
        this.f367135b = z17;
        this.f367136c = exportSettings;
    }

    /* renamed from: equals */
    public boolean m134230xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx0.a)) {
            return false;
        }
        hx0.a aVar = (hx0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f367134a, aVar.f367134a) && this.f367135b == aVar.f367135b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f367136c, aVar.f367136c);
    }

    /* renamed from: hashCode */
    public int m134231x8cdac1b() {
        xt0.h hVar = this.f367134a;
        return ((((hVar == null ? 0 : hVar.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f367135b)) * 31) + this.f367136c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m134232x9616526c() {
        return "ExportParams(postSource=" + this.f367134a + ", useFinderPostProcess=" + this.f367135b + ", exportSettings=" + this.f367136c + ')';
    }
}
