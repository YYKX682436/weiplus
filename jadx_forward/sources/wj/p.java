package wj;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final xj.m f527995a;

    /* renamed from: b, reason: collision with root package name */
    public final wj.o0 f527996b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f527997c;

    public p(xj.m mVar, wj.o0 value, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f527995a = mVar;
        this.f527996b = value;
        this.f527997c = str;
    }

    /* renamed from: equals */
    public boolean m173909xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj.p)) {
            return false;
        }
        wj.p pVar = (wj.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527995a, pVar.f527995a) && this.f527996b == pVar.f527996b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527997c, pVar.f527997c);
    }

    /* renamed from: hashCode */
    public int m173910x8cdac1b() {
        xj.m mVar = this.f527995a;
        int m175609x8cdac1b = (((mVar == null ? 0 : mVar.m175609x8cdac1b()) * 31) + this.f527996b.hashCode()) * 31;
        java.lang.String str = this.f527997c;
        return m175609x8cdac1b + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m173911x9616526c() {
        return "GetAdInfoOutcome(adInfo=" + this.f527995a + ", value=" + this.f527996b + ", extra=" + this.f527997c + ')';
    }
}
