package t95;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f498118a;

    /* renamed from: b, reason: collision with root package name */
    public final t95.g f498119b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f498120c;

    /* renamed from: d, reason: collision with root package name */
    public t95.g f498121d;

    public b(java.lang.String path, t95.g range, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
        this.f498118a = path;
        this.f498119b = range;
        this.f498120c = z17;
        this.f498121d = new t95.g(0L, 0L);
    }

    /* renamed from: equals */
    public boolean m166027xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t95.b)) {
            return false;
        }
        t95.b bVar = (t95.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f498118a, bVar.f498118a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f498119b, bVar.f498119b) && this.f498120c == bVar.f498120c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m166028x8cdac1b() {
        int hashCode = ((this.f498118a.hashCode() * 31) + this.f498119b.m166033x8cdac1b()) * 31;
        boolean z17 = this.f498120c;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    /* renamed from: toString */
    public java.lang.String m166029x9616526c() {
        return "ItemRan(path=" + this.f498118a + ", range=" + this.f498119b + ", isDeflateCompressed=" + this.f498120c + ')';
    }
}
