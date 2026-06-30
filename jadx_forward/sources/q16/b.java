package q16;

/* loaded from: classes15.dex */
public final class b implements q16.e {

    /* renamed from: a, reason: collision with root package name */
    public static final q16.b f441236a = new q16.b();

    @Override // q16.e
    public java.lang.String a(o06.j classifier, q16.s renderer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classifier, "classifier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        if (classifier instanceof o06.e2) {
            n16.g mo132800xfb82e301 = ((o06.e2) classifier).mo132800xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
            return renderer.u(mo132800xfb82e301, false);
        }
        n16.e g17 = r16.i.g(classifier);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getFqName(...)");
        return renderer.t(g17);
    }
}
