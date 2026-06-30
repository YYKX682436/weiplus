package m16;

/* loaded from: classes15.dex */
public final class e extends m16.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f404423a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f404424b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String name, java.lang.String desc) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f404423a = name;
        this.f404424b = desc;
    }

    @Override // m16.f
    public java.lang.String a() {
        return this.f404423a + this.f404424b;
    }

    @Override // m16.f
    public java.lang.String b() {
        return this.f404424b;
    }

    @Override // m16.f
    public java.lang.String c() {
        return this.f404423a;
    }

    /* renamed from: equals */
    public boolean m146667xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16.e)) {
            return false;
        }
        m16.e eVar = (m16.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404423a, eVar.f404423a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404424b, eVar.f404424b);
    }

    /* renamed from: hashCode */
    public int m146668x8cdac1b() {
        return (this.f404423a.hashCode() * 31) + this.f404424b.hashCode();
    }
}
