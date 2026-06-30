package u06;

/* loaded from: classes16.dex */
public abstract class f0 extends u06.b0 implements e16.d, e16.p {
    @Override // e16.d
    public e16.a a(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.lang.reflect.Member c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        java.lang.annotation.Annotation[] declaredAnnotations = ((java.lang.reflect.AnnotatedElement) c17).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return u06.m.a(declaredAnnotations, fqName);
        }
        return null;
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    public abstract java.lang.reflect.Member c();

    public n16.g d() {
        java.lang.String name = c().getName();
        n16.g k17 = name != null ? n16.g.k(name) : null;
        return k17 == null ? n16.i.f415706a : k17;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u06.f0.e(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.List");
    }

    /* renamed from: equals */
    public boolean m167304xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof u06.f0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c(), ((u06.f0) obj).c());
    }

    public o06.y2 f() {
        int modifiers = c().getModifiers();
        return java.lang.reflect.Modifier.isPublic(modifiers) ? o06.v2.f423533c : java.lang.reflect.Modifier.isPrivate(modifiers) ? o06.s2.f423516c : java.lang.reflect.Modifier.isProtected(modifiers) ? java.lang.reflect.Modifier.isStatic(modifiers) ? s06.c.f483515c : s06.b.f483514c : s06.a.f483513c;
    }

    @Override // e16.d
    /* renamed from: getAnnotations */
    public java.util.Collection mo126781xa083c1ee() {
        java.lang.reflect.Member c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        java.lang.annotation.Annotation[] declaredAnnotations = ((java.lang.reflect.AnnotatedElement) c17).getDeclaredAnnotations();
        return declaredAnnotations != null ? u06.m.b(declaredAnnotations) : kz5.p0.f395529d;
    }

    /* renamed from: hashCode */
    public int m167305x8cdac1b() {
        return c().hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167306x9616526c() {
        return getClass().getName() + ": " + c();
    }
}
