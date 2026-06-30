package pj;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final pj.d f436435a = new pj.d();

    public final java.lang.reflect.Method a(java.lang.Class javaClass, java.lang.String name, java.lang.Class[] clsArr) {
        java.lang.Object obj;
        java.lang.reflect.Method b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(javaClass, "javaClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.util.Iterator it = g06.f.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(javaClass)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((f06.g) obj).mo9624xfb82e301(), name)) {
                break;
            }
        }
        f06.g gVar = (f06.g) obj;
        if (gVar != null && (b17 = h06.c.b(gVar)) != null) {
            return b17;
        }
        if (clsArr == null) {
            java.lang.reflect.Method method = javaClass.getMethod(name, new java.lang.Class[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(method, "getMethod(...)");
            return method;
        }
        java.lang.reflect.Method method2 = javaClass.getMethod(name, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(method2, "getMethod(...)");
        return method2;
    }
}
