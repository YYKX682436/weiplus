package b16;

/* loaded from: classes15.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final n16.g f98727a;

    /* renamed from: b, reason: collision with root package name */
    public final e16.g f98728b;

    public j0(n16.g name, e16.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f98727a = name;
        this.f98728b = gVar;
    }

    /* renamed from: equals */
    public boolean m9604xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof b16.j0) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98727a, ((b16.j0) obj).f98727a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m9605x8cdac1b() {
        return this.f98727a.m148892x8cdac1b();
    }
}
