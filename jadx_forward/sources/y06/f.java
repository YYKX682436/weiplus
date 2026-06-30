package y06;

/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final y06.f f540204a = new y06.f();

    /* renamed from: b, reason: collision with root package name */
    public static final n16.g f540205b = n16.g.k(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);

    /* renamed from: c, reason: collision with root package name */
    public static final n16.g f540206c = n16.g.k("allowedTargets");

    /* renamed from: d, reason: collision with root package name */
    public static final n16.g f540207d = n16.g.k("value");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f540208e = kz5.c1.k(new jz5.l(l06.w.f396473u, x06.p0.f532819c), new jz5.l(l06.w.f396476x, x06.p0.f532820d), new jz5.l(l06.w.f396477y, x06.p0.f532822f));

    public final p06.c a(n16.c kotlinName, e16.d annotationOwner, a16.l c17) {
        e16.a a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinName, "kotlinName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotationOwner, "annotationOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kotlinName, l06.w.f396466n)) {
            n16.c DEPRECATED_ANNOTATION = x06.p0.f532821e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            e16.a a18 = annotationOwner.a(DEPRECATED_ANNOTATION);
            if (a18 != null || annotationOwner.b()) {
                return new y06.j(a18, c17);
            }
        }
        n16.c cVar = (n16.c) f540208e.get(kotlinName);
        if (cVar == null || (a17 = annotationOwner.a(cVar)) == null) {
            return null;
        }
        return f540204a.b(a17, c17, false);
    }

    public final p06.c b(e16.a annotation, a16.l c17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotation, "annotation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        n16.b a17 = u06.i.a(xz5.a.b(xz5.a.a(((u06.j) annotation).f505043a)));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, n16.b.l(x06.p0.f532819c))) {
            return new y06.r(annotation, c17);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, n16.b.l(x06.p0.f532820d))) {
            return new y06.p(annotation, c17);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, n16.b.l(x06.p0.f532822f))) {
            return new y06.e(c17, annotation, l06.w.f396477y);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, n16.b.l(x06.p0.f532821e))) {
            return null;
        }
        return new b16.k(c17, annotation, z17);
    }
}
