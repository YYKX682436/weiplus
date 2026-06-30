package n06;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final n16.b f415481a;

    /* renamed from: b, reason: collision with root package name */
    public final n16.b f415482b;

    /* renamed from: c, reason: collision with root package name */
    public final n16.b f415483c;

    public c(n16.b javaClass, n16.b kotlinReadOnly, n16.b kotlinMutable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(javaClass, "javaClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinReadOnly, "kotlinReadOnly");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinMutable, "kotlinMutable");
        this.f415481a = javaClass;
        this.f415482b = kotlinReadOnly;
        this.f415483c = kotlinMutable;
    }

    /* renamed from: equals */
    public boolean m148821xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n06.c)) {
            return false;
        }
        n06.c cVar = (n06.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415481a, cVar.f415481a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415482b, cVar.f415482b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415483c, cVar.f415483c);
    }

    /* renamed from: hashCode */
    public int m148822x8cdac1b() {
        return (((this.f415481a.m148881x8cdac1b() * 31) + this.f415482b.m148881x8cdac1b()) * 31) + this.f415483c.m148881x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m148823x9616526c() {
        return "PlatformMutabilityMapping(javaClass=" + this.f415481a + ", kotlinReadOnly=" + this.f415482b + ", kotlinMutable=" + this.f415483c + ')';
    }
}
