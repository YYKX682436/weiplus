package x5;

/* loaded from: classes14.dex */
public final class n extends x5.f {

    /* renamed from: a, reason: collision with root package name */
    public final x36.m f533492a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f533493b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.d f533494c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x36.m source, java.lang.String str, v5.d dataSource) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        this.f533492a = source;
        this.f533493b = str;
        this.f533494c = dataSource;
    }

    /* renamed from: equals */
    public boolean m175007xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5.n)) {
            return false;
        }
        x5.n nVar = (x5.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f533492a, nVar.f533492a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f533493b, nVar.f533493b) && this.f533494c == nVar.f533494c;
    }

    /* renamed from: hashCode */
    public int m175008x8cdac1b() {
        int hashCode = this.f533492a.hashCode() * 31;
        java.lang.String str = this.f533493b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f533494c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175009x9616526c() {
        return "SourceResult(source=" + this.f533492a + ", mimeType=" + ((java.lang.Object) this.f533493b) + ", dataSource=" + this.f533494c + ')';
    }
}
