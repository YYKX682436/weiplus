package q16;

/* loaded from: classes15.dex */
public final class d implements q16.e {

    /* renamed from: a, reason: collision with root package name */
    public static final q16.d f441256a = new q16.d();

    @Override // q16.e
    public java.lang.String a(o06.j classifier, q16.s renderer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classifier, "classifier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        return b(classifier);
    }

    public final java.lang.String b(o06.j jVar) {
        java.lang.String str;
        n16.g mo132800xfb82e301 = jVar.mo132800xfb82e301();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
        java.lang.String a17 = q16.p0.a(mo132800xfb82e301);
        if (jVar instanceof o06.e2) {
            return a17;
        }
        o06.m e17 = jVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getContainingDeclaration(...)");
        if (e17 instanceof o06.g) {
            str = b((o06.j) e17);
        } else if (e17 instanceof o06.d1) {
            n16.e i17 = ((r06.z0) ((o06.d1) e17)).f450099h.i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "toUnsafe(...)");
            java.util.List f17 = i17.f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "pathSegments(...)");
            str = q16.p0.b(f17);
        } else {
            str = null;
        }
        if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return a17;
        }
        return str + '.' + a17;
    }
}
