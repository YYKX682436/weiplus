package p06;

/* loaded from: classes15.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final n16.g f432293a = n16.g.k(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);

    /* renamed from: b, reason: collision with root package name */
    public static final n16.g f432294b = n16.g.k("replaceWith");

    /* renamed from: c, reason: collision with root package name */
    public static final n16.g f432295c = n16.g.k(ya.b.f77487x44fa364);

    /* renamed from: d, reason: collision with root package name */
    public static final n16.g f432296d = n16.g.k("expression");

    /* renamed from: e, reason: collision with root package name */
    public static final n16.g f432297e = n16.g.k("imports");

    public static p06.c a(l06.o oVar, java.lang.String message, java.lang.String replaceWith, java.lang.String level, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            replaceWith = "";
        }
        if ((i17 & 4) != 0) {
            level = "WARNING";
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replaceWith, "replaceWith");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        return new p06.o(oVar, l06.w.f396466n, kz5.c1.k(new jz5.l(f432293a, new t16.b0(message)), new jz5.l(f432294b, new t16.a(new p06.o(oVar, l06.w.f396468p, kz5.c1.k(new jz5.l(f432296d, new t16.b0(replaceWith)), new jz5.l(f432297e, new t16.b(kz5.p0.f395529d, new p06.f(oVar)))), false))), new jz5.l(f432295c, new t16.k(n16.b.l(l06.w.f396467o), n16.g.k(level)))), z17);
    }
}
