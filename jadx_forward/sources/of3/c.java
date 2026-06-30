package of3;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final of3.a f426628a;

    /* renamed from: b, reason: collision with root package name */
    public final of3.a f426629b;

    public c(of3.a loader, of3.a manager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        this.f426628a = loader;
        this.f426629b = manager;
    }

    /* renamed from: equals */
    public boolean m151237xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of3.c)) {
            return false;
        }
        of3.c cVar = (of3.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426628a, cVar.f426628a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426629b, cVar.f426629b);
    }

    /* renamed from: hashCode */
    public int m151238x8cdac1b() {
        return (this.f426628a.hashCode() * 31) + this.f426629b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151239x9616526c() {
        return "ImageKitBuilder(loader=" + this.f426628a + ", manager=" + this.f426629b + ')';
    }
}
