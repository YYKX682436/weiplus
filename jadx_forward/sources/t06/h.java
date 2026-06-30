package t06;

/* loaded from: classes15.dex */
public final class h implements g16.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ClassLoader f496071a;

    /* renamed from: b, reason: collision with root package name */
    public final c26.f f496072b;

    public h(java.lang.ClassLoader classLoader) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classLoader, "classLoader");
        this.f496071a = classLoader;
        this.f496072b = new c26.f();
    }

    public g16.j0 a(n16.b classId, m16.g jvmMetadataVersion) {
        t06.g a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jvmMetadataVersion, "jvmMetadataVersion");
        java.lang.String u17 = r26.i0.u(classId.i().b(), '.', '$', false, 4, null);
        if (!classId.h().d()) {
            u17 = classId.h() + '.' + u17;
        }
        java.lang.Class a18 = t06.e.a(this.f496071a, u17);
        if (a18 == null || (a17 = t06.g.f496068c.a(a18)) == null) {
            return null;
        }
        return new g16.i0(a17, null, 2, null);
    }
}
