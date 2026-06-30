package yd2;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final yd2.m f542609a = new yd2.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f542610b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.Class paramsClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsClass, "paramsClass");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1475xa34feb2f.InterfaceC14171x60ced579 interfaceC14171x60ced579 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1475xa34feb2f.InterfaceC14171x60ced579) paramsClass.getAnnotation(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1475xa34feb2f.InterfaceC14171x60ced579.class);
        if (interfaceC14171x60ced579 == null) {
            throw new java.lang.IllegalArgumentException(paramsClass.getSimpleName().concat(" must be annotated with @ToolSchema"));
        }
        java.lang.String name = interfaceC14171x60ced579.m56750x337a8b();
        java.lang.String version = interfaceC14171x60ced579.m56752x14f51cd8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(version, "version");
        java.lang.String str = name + '@' + version;
        if (((java.lang.Class) f542610b.putIfAbsent(str, paramsClass)) == null) {
            return;
        }
        throw new java.lang.IllegalStateException("Tool already registered: " + str);
    }
}
