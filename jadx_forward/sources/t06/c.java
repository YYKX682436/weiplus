package t06;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final t06.c f496066a = new t06.c();

    public final t16.f a(java.lang.Class cls) {
        int i17 = 0;
        while (cls.isArray()) {
            i17++;
            cls = cls.getComponentType();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cls, "getComponentType(...)");
        }
        if (cls.isPrimitive()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, java.lang.Void.TYPE)) {
                return new t16.f(n16.b.l(l06.w.f396457e.h()), i17);
            }
            l06.r i18 = w16.e.b(cls.getName()).i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i18, "getPrimitiveType(...)");
            return i17 > 0 ? new t16.f(n16.b.l((n16.c) i18.f396441g.mo141623x754a37bb()), i17 - 1) : new t16.f(n16.b.l((n16.c) i18.f396440f.mo141623x754a37bb()), i17);
        }
        n16.b a17 = u06.i.a(cls);
        n06.d dVar = n06.d.f415486a;
        n16.c b17 = a17.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "asSingleFqName(...)");
        n16.b f17 = dVar.f(b17);
        if (f17 != null) {
            a17 = f17;
        }
        return new t16.f(a17, i17);
    }

    public final void b(java.lang.Class klass, g16.o0 visitor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(klass, "klass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitor, "visitor");
        java.lang.annotation.Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(annotation);
            java.lang.Class b17 = xz5.a.b(xz5.a.a(annotation));
            g16.m0 b18 = visitor.b(u06.i.a(b17), new t06.b(annotation));
            if (b18 != null) {
                f496066a.c(b18, annotation, b17);
            }
        }
        visitor.a();
    }

    public final void c(g16.m0 m0Var, java.lang.annotation.Annotation annotation, java.lang.Class cls) {
        java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethods, "getDeclaredMethods(...)");
        for (java.lang.reflect.Method method : declaredMethods) {
            try {
                java.lang.Object invoke = method.invoke(annotation, new java.lang.Object[0]);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(invoke);
                n16.g k17 = n16.g.k(method.getName());
                java.lang.Class<?> cls2 = invoke.getClass();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, java.lang.Class.class)) {
                    m0Var.f(k17, a((java.lang.Class) invoke));
                } else if (t06.i.f496073a.contains(cls2)) {
                    m0Var.b(k17, invoke);
                } else if (u06.i.e(cls2)) {
                    if (!cls2.isEnum()) {
                        cls2 = cls2.getEnclosingClass();
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cls2);
                    m0Var.c(k17, u06.i.a(cls2), n16.g.k(((java.lang.Enum) invoke).name()));
                } else if (java.lang.annotation.Annotation.class.isAssignableFrom(cls2)) {
                    java.lang.Class<?>[] interfaces = cls2.getInterfaces();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interfaces, "getInterfaces(...)");
                    java.lang.Class cls3 = (java.lang.Class) kz5.z.l0(interfaces);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cls3);
                    g16.m0 e17 = m0Var.e(k17, u06.i.a(cls3));
                    if (e17 != null) {
                        c(e17, (java.lang.annotation.Annotation) invoke, cls3);
                    }
                } else {
                    if (!cls2.isArray()) {
                        throw new java.lang.UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                    g16.n0 d17 = m0Var.d(k17);
                    if (d17 != null) {
                        java.lang.Class<?> componentType = cls2.getComponentType();
                        if (componentType.isEnum()) {
                            n16.b a17 = u06.i.a(componentType);
                            for (java.lang.Object obj : (java.lang.Object[]) invoke) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                d17.e(a17, n16.g.k(((java.lang.Enum) obj).name()));
                            }
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(componentType, java.lang.Class.class)) {
                            for (java.lang.Object obj2 : (java.lang.Object[]) invoke) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                d17.c(a((java.lang.Class) obj2));
                            }
                        } else if (java.lang.annotation.Annotation.class.isAssignableFrom(componentType)) {
                            for (java.lang.Object obj3 : (java.lang.Object[]) invoke) {
                                g16.m0 d18 = d17.d(u06.i.a(componentType));
                                if (d18 != null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                    c(d18, (java.lang.annotation.Annotation) obj3, componentType);
                                }
                            }
                        } else {
                            for (java.lang.Object obj4 : (java.lang.Object[]) invoke) {
                                d17.b(obj4);
                            }
                        }
                        d17.a();
                    }
                }
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        m0Var.a();
    }
}
