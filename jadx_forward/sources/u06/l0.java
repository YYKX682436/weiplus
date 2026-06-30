package u06;

/* loaded from: classes16.dex */
public final class l0 extends u06.b0 implements e16.d, e16.v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.TypeVariable f505047a;

    public l0(java.lang.reflect.TypeVariable typeVariable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeVariable, "typeVariable");
        this.f505047a = typeVariable;
    }

    @Override // e16.d
    public e16.a a(n16.c fqName) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.lang.reflect.TypeVariable typeVariable = this.f505047a;
        java.lang.reflect.AnnotatedElement annotatedElement = typeVariable instanceof java.lang.reflect.AnnotatedElement ? (java.lang.reflect.AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return u06.m.a(declaredAnnotations, fqName);
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    /* renamed from: equals */
    public boolean m167319xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof u06.l0) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f505047a, ((u06.l0) obj).f505047a)) {
                return true;
            }
        }
        return false;
    }

    @Override // e16.d
    /* renamed from: getAnnotations */
    public java.util.Collection mo126781xa083c1ee() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.lang.reflect.TypeVariable typeVariable = this.f505047a;
        java.lang.reflect.AnnotatedElement annotatedElement = typeVariable instanceof java.lang.reflect.AnnotatedElement ? (java.lang.reflect.AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? kz5.p0.f395529d : u06.m.b(declaredAnnotations);
    }

    /* renamed from: hashCode */
    public int m167320x8cdac1b() {
        return this.f505047a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167321x9616526c() {
        return u06.l0.class.getName() + ": " + this.f505047a;
    }
}
