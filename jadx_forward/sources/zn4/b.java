package zn4;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f556026a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f556027b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f556028c;

    public b(yz5.a get, yz5.l set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(get, "get");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        this.f556026a = get;
        this.f556027b = set;
    }

    public final java.lang.Object a(java.lang.Object obj, f06.v property) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        return this.f556026a.mo152xb9724478();
    }

    public final void b(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, this.f556026a.mo152xb9724478())) {
            return;
        }
        this.f556028c = true;
        this.f556027b.mo146xb9724478(obj2);
    }
}
