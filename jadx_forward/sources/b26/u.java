package b26;

/* loaded from: classes16.dex */
public final class u implements b26.j {

    /* renamed from: a, reason: collision with root package name */
    public final o06.e1 f99057a;

    public u(o06.e1 packageFragmentProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFragmentProvider, "packageFragmentProvider");
        this.f99057a = packageFragmentProvider;
    }

    @Override // b26.j
    public b26.i a(n16.b classId) {
        b26.i a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        n16.c h17 = classId.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getPackageFqName(...)");
        java.util.Iterator it = ((java.util.ArrayList) o06.i1.c(this.f99057a, h17)).iterator();
        while (it.hasNext()) {
            o06.d1 d1Var = (o06.d1) it.next();
            if ((d1Var instanceof b26.v) && (a17 = ((b26.y) ((b26.v) d1Var)).f99076p.a(classId)) != null) {
                return a17;
            }
        }
        return null;
    }
}
