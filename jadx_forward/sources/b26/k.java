package b26;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final n16.b f98989a;

    /* renamed from: b, reason: collision with root package name */
    public final b26.i f98990b;

    public k(n16.b classId, b26.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        this.f98989a = classId;
        this.f98990b = iVar;
    }

    /* renamed from: equals */
    public boolean m9687xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof b26.k) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98989a, ((b26.k) obj).f98989a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m9688x8cdac1b() {
        return this.f98989a.m148881x8cdac1b();
    }
}
