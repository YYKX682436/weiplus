package b26;

/* loaded from: classes16.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f17466c = kz5.o1.c(n16.b.l(l06.w.f314922d.h()));

    /* renamed from: a, reason: collision with root package name */
    public final b26.q f17467a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f17468b;

    public m(b26.q components) {
        kotlin.jvm.internal.o.g(components, "components");
        this.f17467a = components;
        this.f17468b = ((e26.u) components.f17483a).d(new b26.l(this));
    }

    public final o06.g a(n16.b classId, b26.i iVar) {
        kotlin.jvm.internal.o.g(classId, "classId");
        return (o06.g) ((e26.q) this.f17468b).invoke(new b26.k(classId, iVar));
    }
}
