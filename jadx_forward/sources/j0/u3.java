package j0;

/* loaded from: classes14.dex */
public abstract class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f378114a = r26.i0.s("H", 10);

    public static final long a(a2.o1 style, p2.f density, f2.g fontFamilyResolver, java.lang.String text, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontFamilyResolver, "fontFamilyResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        kz5.p0 p0Var = kz5.p0.f395529d;
        long b17 = p2.d.b(0, 0, 0, 0, 15, null);
        i2.e eVar = new i2.e(text, style, p0Var, p0Var, fontFamilyResolver, density);
        return p2.r.a(a06.d.b((float) java.lang.Math.ceil(eVar.b())), a06.d.b((float) java.lang.Math.ceil(new i2.c(eVar, i17, false, b17, null).b())));
    }
}
