package r5;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f474046a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f474047b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f474048c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f474049d;

    public b(r5.c registry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(registry, "registry");
        this.f474046a = kz5.n0.V0(registry.f474050a);
        this.f474047b = kz5.n0.V0(registry.f474051b);
        this.f474048c = kz5.n0.V0(registry.f474052c);
        this.f474049d = kz5.n0.V0(registry.f474053d);
    }

    public final r5.b a(x5.g fetcher, java.lang.Class type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fetcher, "fetcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f474048c.add(new jz5.l(fetcher, type));
        return this;
    }

    public final r5.b b(z5.b mapper, java.lang.Class type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mapper, "mapper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f474047b.add(new jz5.l(mapper, type));
        return this;
    }
}
