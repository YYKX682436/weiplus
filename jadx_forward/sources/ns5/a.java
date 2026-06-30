package ns5;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f421225a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONArray f421226b;

    public a(java.lang.String detectorSource, org.json.JSONArray traceDump) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectorSource, "detectorSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceDump, "traceDump");
        this.f421225a = detectorSource;
        this.f421226b = traceDump;
    }

    /* renamed from: equals */
    public boolean m149955xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns5.a)) {
            return false;
        }
        ns5.a aVar = (ns5.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421225a, aVar.f421225a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421226b, aVar.f421226b);
    }

    /* renamed from: hashCode */
    public int m149956x8cdac1b() {
        return (this.f421225a.hashCode() * 31) + this.f421226b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149957x9616526c() {
        return "DetectParams(detectorSource=" + this.f421225a + ", traceDump=" + this.f421226b + ')';
    }
}
