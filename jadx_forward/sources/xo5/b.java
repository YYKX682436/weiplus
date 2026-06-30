package xo5;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.Closeable f537307a;

    /* renamed from: b, reason: collision with root package name */
    public final oz5.l f537308b;

    /* renamed from: c, reason: collision with root package name */
    public final int f537309c;

    public b(java.io.Closeable closable, oz5.l lVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closable, "closable");
        this.f537307a = closable;
        this.f537308b = lVar;
        this.f537309c = i17;
    }

    /* renamed from: equals */
    public boolean m175752xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo5.b)) {
            return false;
        }
        xo5.b bVar = (xo5.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537307a, bVar.f537307a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537308b, bVar.f537308b) && this.f537309c == bVar.f537309c;
    }

    /* renamed from: hashCode */
    public int m175753x8cdac1b() {
        int hashCode = this.f537307a.hashCode() * 31;
        oz5.l lVar = this.f537308b;
        return ((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f537309c);
    }

    /* renamed from: toString */
    public java.lang.String m175754x9616526c() {
        return "ClosableInfo(closable=" + this.f537307a + ", coroutineContext=" + this.f537308b + ", stage=" + this.f537309c + ')';
    }
}
