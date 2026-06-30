package u06;

/* loaded from: classes16.dex */
public final class j extends u06.b0 implements e16.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.annotation.Annotation f505043a;

    public j(java.lang.annotation.Annotation annotation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotation, "annotation");
        this.f505043a = annotation;
    }

    public java.util.Collection c() {
        java.lang.annotation.Annotation annotation = this.f505043a;
        java.lang.reflect.Method[] declaredMethods = xz5.a.b(xz5.a.a(annotation)).getDeclaredMethods();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethods, "getDeclaredMethods(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(declaredMethods.length);
        for (java.lang.reflect.Method method : declaredMethods) {
            java.lang.Object invoke = method.invoke(annotation, new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(invoke, "invoke(...)");
            n16.g k17 = n16.g.k(method.getName());
            arrayList.add(u06.i.e(invoke.getClass()) ? new u06.c0(k17, (java.lang.Enum) invoke) : invoke instanceof java.lang.annotation.Annotation ? new u06.l(k17, (java.lang.annotation.Annotation) invoke) : invoke instanceof java.lang.Object[] ? new u06.n(k17, (java.lang.Object[]) invoke) : invoke instanceof java.lang.Class ? new u06.y(k17, (java.lang.Class) invoke) : new u06.e0(k17, invoke));
        }
        return arrayList;
    }

    /* renamed from: equals */
    public boolean m167313xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof u06.j) {
            if (this.f505043a == ((u06.j) obj).f505043a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m167314x8cdac1b() {
        return java.lang.System.identityHashCode(this.f505043a);
    }

    /* renamed from: toString */
    public java.lang.String m167315x9616526c() {
        return u06.j.class.getName() + ": " + this.f505043a;
    }
}
