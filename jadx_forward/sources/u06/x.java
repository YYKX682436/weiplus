package u06;

/* loaded from: classes16.dex */
public final class x extends u06.b0 implements e16.d, e16.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f505066a;

    public x(java.lang.Class klass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(klass, "klass");
        this.f505066a = klass;
    }

    @Override // e16.d
    public e16.a a(n16.c fqName) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.lang.Class cls = this.f505066a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return u06.m.a(declaredAnnotations, fqName);
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    public java.util.Collection c() {
        java.lang.reflect.Field[] declaredFields = this.f505066a.getDeclaredFields();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields, "getDeclaredFields(...)");
        return q26.h0.y(q26.h0.o(q26.h0.j(kz5.z.C(declaredFields), u06.r.f505060d), u06.s.f505061d));
    }

    public n16.c d() {
        n16.c b17 = u06.i.a(this.f505066a).b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "asSingleFqName(...)");
        return b17;
    }

    public java.util.Collection e() {
        java.lang.reflect.Method[] declaredMethods = this.f505066a.getDeclaredMethods();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethods, "getDeclaredMethods(...)");
        return q26.h0.y(q26.h0.o(q26.h0.i(kz5.z.C(declaredMethods), new u06.v(this)), u06.w.f505065d));
    }

    /* renamed from: equals */
    public boolean m167330xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof u06.x) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505066a, ((u06.x) obj).f505066a)) {
                return true;
            }
        }
        return false;
    }

    public n16.g f() {
        java.lang.Class cls = this.f505066a;
        if (!cls.isAnonymousClass()) {
            return n16.g.k(cls.getSimpleName());
        }
        java.lang.String name = cls.getName();
        return n16.g.k(r26.n0.p0(name, ".", name));
    }

    public java.util.Collection g() {
        java.lang.Class clazz = this.f505066a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        u06.c cVar = u06.d.f505027a;
        if (cVar == null) {
            try {
                cVar = new u06.c(java.lang.Class.class.getMethod("isSealed", new java.lang.Class[0]), java.lang.Class.class.getMethod("getPermittedSubclasses", new java.lang.Class[0]), java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]), java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]));
            } catch (java.lang.NoSuchMethodException unused) {
                cVar = new u06.c(null, null, null, null);
            }
            u06.d.f505027a = cVar;
        }
        java.lang.reflect.Method method = cVar.f505025d;
        java.lang.Object[] objArr = method != null ? (java.lang.Object[]) method.invoke(clazz, new java.lang.Object[0]) : null;
        if (objArr == null) {
            objArr = new java.lang.Object[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(new u06.j0(obj));
        }
        return arrayList;
    }

    @Override // e16.d
    /* renamed from: getAnnotations */
    public java.util.Collection mo126781xa083c1ee() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.lang.Class cls = this.f505066a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? kz5.p0.f395529d : u06.m.b(declaredAnnotations);
    }

    @Override // e16.w
    /* renamed from: getTypeParameters */
    public java.util.List mo126782xb121b9ba() {
        java.lang.reflect.TypeVariable[] typeParameters = this.f505066a.getTypeParameters();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable typeVariable : typeParameters) {
            arrayList.add(new u06.l0(typeVariable));
        }
        return arrayList;
    }

    public boolean h() {
        return this.f505066a.isAnnotation();
    }

    /* renamed from: hashCode */
    public int m167331x8cdac1b() {
        return this.f505066a.hashCode();
    }

    public boolean i() {
        return this.f505066a.isEnum();
    }

    public boolean j() {
        java.lang.Class clazz = this.f505066a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        u06.c cVar = u06.d.f505027a;
        java.lang.Boolean bool = null;
        if (cVar == null) {
            try {
                cVar = new u06.c(java.lang.Class.class.getMethod("isSealed", new java.lang.Class[0]), java.lang.Class.class.getMethod("getPermittedSubclasses", new java.lang.Class[0]), java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]), java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]));
            } catch (java.lang.NoSuchMethodException unused) {
                cVar = new u06.c(null, null, null, null);
            }
            u06.d.f505027a = cVar;
        }
        java.lang.reflect.Method method = cVar.f505024c;
        if (method != null) {
            java.lang.Object invoke = method.invoke(clazz, new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (java.lang.Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public boolean k() {
        java.lang.Class clazz = this.f505066a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        u06.c cVar = u06.d.f505027a;
        java.lang.Boolean bool = null;
        if (cVar == null) {
            try {
                cVar = new u06.c(java.lang.Class.class.getMethod("isSealed", new java.lang.Class[0]), java.lang.Class.class.getMethod("getPermittedSubclasses", new java.lang.Class[0]), java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]), java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]));
            } catch (java.lang.NoSuchMethodException unused) {
                cVar = new u06.c(null, null, null, null);
            }
            u06.d.f505027a = cVar;
        }
        java.lang.reflect.Method method = cVar.f505022a;
        if (method != null) {
            java.lang.Object invoke = method.invoke(clazz, new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (java.lang.Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m167332x9616526c() {
        return u06.x.class.getName() + ": " + this.f505066a;
    }
}
