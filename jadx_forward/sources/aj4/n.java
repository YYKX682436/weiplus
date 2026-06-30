package aj4;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f86872a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86873b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f86874c;

    public n(java.util.List items, long j17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f86872a = items;
        this.f86873b = j17;
        this.f86874c = errMsg;
    }

    /* renamed from: equals */
    public boolean m2137xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj4.n)) {
            return false;
        }
        aj4.n nVar = (aj4.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86872a, nVar.f86872a) && this.f86873b == nVar.f86873b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86874c, nVar.f86874c);
    }

    /* renamed from: hashCode */
    public int m2138x8cdac1b() {
        return (((this.f86872a.hashCode() * 31) + java.lang.Long.hashCode(this.f86873b)) * 31) + this.f86874c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m2139x9616526c() {
        return "Result(items=" + this.f86872a + ", errCode=" + this.f86873b + ", errMsg=" + this.f86874c + ')';
    }

    public /* synthetic */ n(java.util.List list, long j17, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(list, (i17 & 2) != 0 ? 0L : j17, (i17 & 4) != 0 ? "" : str);
    }
}
