package g16;

/* loaded from: classes15.dex */
public final class t extends g16.g {

    /* renamed from: d, reason: collision with root package name */
    public final o06.v0 f349195d;

    /* renamed from: e, reason: collision with root package name */
    public final o06.c1 f349196e;

    /* renamed from: f, reason: collision with root package name */
    public final b26.g f349197f;

    /* renamed from: g, reason: collision with root package name */
    public m16.g f349198g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o06.v0 module, o06.c1 notFoundClasses, e26.c0 storageManager, g16.k0 kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notFoundClasses, "notFoundClasses");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinClassFinder, "kotlinClassFinder");
        this.f349195d = module;
        this.f349196e = notFoundClasses;
        this.f349197f = new b26.g(module, notFoundClasses);
        this.f349198g = m16.g.f404425g;
    }

    public static final t16.g u(g16.t tVar, n16.g gVar, java.lang.Object obj) {
        t16.g b17 = t16.i.f496148a.b(obj, tVar.f349195d);
        if (b17 != null) {
            return b17;
        }
        java.lang.String message = "Unsupported annotation argument: " + gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        return new t16.l(message);
    }

    @Override // g16.l
    public g16.m0 q(n16.b annotationClassId, o06.x1 source, java.util.List result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotationClassId, "annotationClassId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        return new g16.s(this, o06.l0.c(this.f349195d, annotationClassId, this.f349196e), annotationClassId, result, source);
    }
}
