package jw1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.Closeable f383826a;

    /* renamed from: b, reason: collision with root package name */
    public final oz5.l f383827b;

    /* renamed from: c, reason: collision with root package name */
    public final int f383828c;

    public b(java.io.Closeable closable, oz5.l lVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closable, "closable");
        this.f383826a = closable;
        this.f383827b = lVar;
        this.f383828c = i17;
    }

    /* renamed from: equals */
    public boolean m141459xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw1.b)) {
            return false;
        }
        jw1.b bVar = (jw1.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383826a, bVar.f383826a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383827b, bVar.f383827b) && this.f383828c == bVar.f383828c;
    }

    /* renamed from: hashCode */
    public int m141460x8cdac1b() {
        int hashCode = this.f383826a.hashCode() * 31;
        oz5.l lVar = this.f383827b;
        return ((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f383828c);
    }

    /* renamed from: toString */
    public java.lang.String m141461x9616526c() {
        return "ClosableInfo(closable=" + this.f383826a + ", coroutineContext=" + this.f383827b + ", stage=" + this.f383828c + ')';
    }
}
