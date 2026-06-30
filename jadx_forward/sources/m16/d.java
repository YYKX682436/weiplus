package m16;

/* loaded from: classes15.dex */
public final class d extends m16.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f404421a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f404422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String name, java.lang.String desc) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f404421a = name;
        this.f404422b = desc;
    }

    @Override // m16.f
    public java.lang.String a() {
        return this.f404421a + ':' + this.f404422b;
    }

    @Override // m16.f
    public java.lang.String b() {
        return this.f404422b;
    }

    @Override // m16.f
    public java.lang.String c() {
        return this.f404421a;
    }

    /* renamed from: equals */
    public boolean m146665xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16.d)) {
            return false;
        }
        m16.d dVar = (m16.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404421a, dVar.f404421a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404422b, dVar.f404422b);
    }

    /* renamed from: hashCode */
    public int m146666x8cdac1b() {
        return (this.f404421a.hashCode() * 31) + this.f404422b.hashCode();
    }
}
