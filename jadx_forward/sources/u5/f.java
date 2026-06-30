package u5;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final u5.k f506236a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.j f506237b;

    /* renamed from: c, reason: collision with root package name */
    public final long f506238c;

    public f(u5.k kVar, c6.j jVar, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f506236a = kVar;
        this.f506237b = jVar;
        this.f506238c = j17;
    }

    /* renamed from: equals */
    public boolean m167571xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5.f)) {
            return false;
        }
        u5.f fVar = (u5.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f506236a, fVar.f506236a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f506237b, fVar.f506237b) && d1.k.a(this.f506238c, fVar.f506238c);
    }

    /* renamed from: hashCode */
    public int m167572x8cdac1b() {
        int hashCode = ((this.f506236a.hashCode() * 31) + this.f506237b.m14208x8cdac1b()) * 31;
        int i17 = d1.k.f307176d;
        return hashCode + java.lang.Long.hashCode(this.f506238c);
    }

    /* renamed from: toString */
    public java.lang.String m167573x9616526c() {
        return "Snapshot(state=" + this.f506236a + ", request=" + this.f506237b + ", size=" + ((java.lang.Object) d1.k.f(this.f506238c)) + ')';
    }
}
