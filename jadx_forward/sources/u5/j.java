package u5;

/* loaded from: classes14.dex */
public final class j extends u5.k {

    /* renamed from: a, reason: collision with root package name */
    public final h1.c f506243a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.q f506244b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h1.c painter, c6.q result) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(painter, "painter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f506243a = painter;
        this.f506244b = result;
    }

    @Override // u5.k
    public h1.c a() {
        return this.f506243a;
    }

    /* renamed from: equals */
    public boolean m167581xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5.j)) {
            return false;
        }
        u5.j jVar = (u5.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f506243a, jVar.f506243a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f506244b, jVar.f506244b);
    }

    /* renamed from: hashCode */
    public int m167582x8cdac1b() {
        return (this.f506243a.hashCode() * 31) + this.f506244b.m14220x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m167583x9616526c() {
        return "Success(painter=" + this.f506243a + ", result=" + this.f506244b + ')';
    }
}
