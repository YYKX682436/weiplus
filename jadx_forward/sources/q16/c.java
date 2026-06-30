package q16;

/* loaded from: classes15.dex */
public final class c implements q16.e {

    /* renamed from: a, reason: collision with root package name */
    public static final q16.c f441255a = new q16.c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [o06.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o06.x0, o06.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o06.m] */
    @Override // q16.e
    public java.lang.String a(o06.j classifier, q16.s renderer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classifier, "classifier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        if (classifier instanceof o06.e2) {
            n16.g mo132800xfb82e301 = ((o06.e2) classifier).mo132800xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
            return renderer.u(mo132800xfb82e301, false);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        do {
            arrayList.add(classifier.mo132800xfb82e301());
            classifier = classifier.e();
        } while (classifier instanceof o06.g);
        return q16.p0.b(new kz5.j1(arrayList));
    }
}
