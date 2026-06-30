package hh;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f362961a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f362962b;

    /* renamed from: c, reason: collision with root package name */
    public final f06.l f362963c;

    public a(yz5.a receiver, f06.l backingProperty) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backingProperty, "backingProperty");
        this.f362961a = null;
        this.f362962b = receiver;
        this.f362963c = backingProperty;
    }

    public final java.lang.Object a(java.lang.Object obj, f06.v property) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        java.lang.Object obj2 = this.f362961a;
        if (obj2 == null) {
            yz5.a aVar = this.f362962b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            obj2 = aVar.mo152xb9724478();
        }
        return this.f362963c.get(obj2);
    }

    public final void b(java.lang.Object obj, f06.v property, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        java.lang.Object obj3 = this.f362961a;
        if (obj3 == null) {
            yz5.a aVar = this.f362962b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            obj3 = aVar.mo152xb9724478();
        }
        this.f362963c.I(obj3, obj2);
    }
}
