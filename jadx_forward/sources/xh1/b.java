package xh1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f536022a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f536023b;

    public b(p3325xe03a0797.p3326xc267989b.q continuation, java.lang.Class respClazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respClazz, "respClazz");
        this.f536022a = continuation;
        this.f536023b = respClazz;
    }

    /* renamed from: equals */
    public boolean m175526xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh1.b)) {
            return false;
        }
        xh1.b bVar = (xh1.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536022a, bVar.f536022a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536023b, bVar.f536023b);
    }

    /* renamed from: hashCode */
    public int m175527x8cdac1b() {
        return (this.f536022a.hashCode() * 31) + this.f536023b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175528x9616526c() {
        return "RequestContext(continuation=" + this.f536022a + ", respClazz=" + this.f536023b + ')';
    }
}
