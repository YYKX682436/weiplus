package u06;

/* loaded from: classes16.dex */
public final class j0 extends u06.f0 implements e16.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f505044a;

    public j0(java.lang.Object recordComponent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordComponent, "recordComponent");
        this.f505044a = recordComponent;
    }

    @Override // u06.f0
    public java.lang.reflect.Member c() {
        java.lang.Object recordComponent = this.f505044a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordComponent, "recordComponent");
        u06.a aVar = u06.b.f505021a;
        java.lang.reflect.Method method = null;
        if (aVar == null) {
            java.lang.Class<?> cls = recordComponent.getClass();
            try {
                aVar = new u06.a(cls.getMethod("getType", new java.lang.Class[0]), cls.getMethod("getAccessor", new java.lang.Class[0]));
            } catch (java.lang.NoSuchMethodException unused) {
                aVar = new u06.a(null, null);
            }
            u06.b.f505021a = aVar;
        }
        java.lang.reflect.Method method2 = aVar.f505019b;
        if (method2 != null) {
            java.lang.Object invoke = method2.invoke(recordComponent, new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (java.lang.reflect.Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new java.lang.NoSuchMethodError("Can't find `getAccessor` method");
    }

    public e16.u g() {
        java.lang.Object recordComponent = this.f505044a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordComponent, "recordComponent");
        u06.a aVar = u06.b.f505021a;
        java.lang.Class cls = null;
        if (aVar == null) {
            java.lang.Class<?> cls2 = recordComponent.getClass();
            try {
                aVar = new u06.a(cls2.getMethod("getType", new java.lang.Class[0]), cls2.getMethod("getAccessor", new java.lang.Class[0]));
            } catch (java.lang.NoSuchMethodException unused) {
                aVar = new u06.a(null, null);
            }
            u06.b.f505021a = aVar;
        }
        java.lang.reflect.Method method = aVar.f505018a;
        if (method != null) {
            java.lang.Object invoke = method.invoke(recordComponent, new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (java.lang.Class) invoke;
        }
        if (cls != null) {
            return new u06.z(cls);
        }
        throw new java.lang.NoSuchMethodError("Can't find `getType` method");
    }
}
