package sc;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f487165a;

    public j(java.lang.Class clazz, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f487165a = jz5.h.b(new sc.i(clazz, name));
    }

    public final java.lang.Object a(java.lang.Object thisRef, f06.v property) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisRef, "thisRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        return ((java.lang.reflect.Field) ((jz5.n) this.f487165a).mo141623x754a37bb()).get(thisRef);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String className, java.lang.String name) {
        this(java.lang.Class.forName(className), name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(className, "className");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }
}
