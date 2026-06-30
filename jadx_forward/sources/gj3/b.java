package gj3;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.Closeable f353916a;

    /* renamed from: b, reason: collision with root package name */
    public final oz5.l f353917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f353918c;

    public b(java.io.Closeable closable, oz5.l lVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closable, "closable");
        this.f353916a = closable;
        this.f353917b = lVar;
        this.f353918c = i17;
    }

    /* renamed from: equals */
    public boolean m131673xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj3.b)) {
            return false;
        }
        gj3.b bVar = (gj3.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f353916a, bVar.f353916a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f353917b, bVar.f353917b) && this.f353918c == bVar.f353918c;
    }

    /* renamed from: hashCode */
    public int m131674x8cdac1b() {
        int hashCode = this.f353916a.hashCode() * 31;
        oz5.l lVar = this.f353917b;
        return ((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f353918c);
    }

    /* renamed from: toString */
    public java.lang.String m131675x9616526c() {
        return "ClosableInfo(closable=" + this.f353916a + ", coroutineContext=" + this.f353917b + ", stage=" + this.f353918c + ')';
    }
}
