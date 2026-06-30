package w16;

/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a16.k f523784a;

    public c(a16.k packageFragmentProvider, y06.n javaResolverCache) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFragmentProvider, "packageFragmentProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(javaResolverCache, "javaResolverCache");
        this.f523784a = packageFragmentProvider;
    }

    public final o06.g a(e16.g javaClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(javaClass, "javaClass");
        u06.x xVar = (u06.x) javaClass;
        n16.c d17 = xVar.d();
        e16.z[] zVarArr = e16.z.f327985d;
        java.lang.Class<?> declaringClass = xVar.f505066a.getDeclaringClass();
        u06.x xVar2 = declaringClass != null ? new u06.x(declaringClass) : null;
        if (xVar2 != null) {
            o06.g a17 = a(xVar2);
            y16.s z17 = a17 != null ? a17.z() : null;
            o06.j e17 = z17 != null ? z17.e(xVar.f(), w06.d.f523486n) : null;
            if (e17 instanceof o06.g) {
                return (o06.g) e17;
            }
            return null;
        }
        n16.c e18 = d17.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e18, "parent(...)");
        b16.i0 i0Var = (b16.i0) kz5.n0.Z(this.f523784a.b(e18));
        if (i0Var == null) {
            return null;
        }
        b16.q0 q0Var = i0Var.f98722p.f98710d;
        q0Var.getClass();
        return q0Var.v(xVar.f(), javaClass);
    }
}
