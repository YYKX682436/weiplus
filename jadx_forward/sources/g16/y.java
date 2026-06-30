package g16;

/* loaded from: classes15.dex */
public final class y implements b26.j {

    /* renamed from: a, reason: collision with root package name */
    public final g16.k0 f349208a;

    /* renamed from: b, reason: collision with root package name */
    public final g16.x f349209b;

    public y(g16.k0 kotlinClassFinder, g16.x deserializedDescriptorResolver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinClassFinder, "kotlinClassFinder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f349208a = kotlinClassFinder;
        this.f349209b = deserializedDescriptorResolver;
    }

    @Override // b26.j
    public b26.i a(n16.b classId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        g16.x xVar = this.f349209b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xVar.c().f99018c, "<this>");
        g16.q0 a17 = g16.l0.a(this.f349208a, classId, m16.g.f404425g);
        if (a17 == null) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((t06.g) a17).a(), classId);
        return xVar.g(a17);
    }
}
