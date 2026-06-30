package a0;

/* loaded from: classes14.dex */
public final class w2 implements a0.s2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0.w2 f81861a = new a0.w2();

    @Override // a0.s2
    public a0.r2 a(a0.j2 style, android.view.View view, p2.f density, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(style, a0.j2.f81721d)) {
            return new a0.v2(new android.widget.Magnifier(view));
        }
        long t17 = density.t(style.f81723b);
        float R = density.R(Float.NaN);
        float R2 = density.R(Float.NaN);
        android.widget.Magnifier.Builder builder = new android.widget.Magnifier.Builder(view);
        if (t17 != d1.k.f307175c) {
            builder.setSize(a06.d.b(d1.k.d(t17)), a06.d.b(d1.k.b(t17)));
        }
        if (!java.lang.Float.isNaN(R)) {
            builder.setCornerRadius(R);
        }
        if (!java.lang.Float.isNaN(R2)) {
            builder.setElevation(R2);
        }
        if (!java.lang.Float.isNaN(f17)) {
            builder.setInitialZoom(f17);
        }
        builder.setClippingEnabled(true);
        android.widget.Magnifier build = builder.build();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "Builder(view).run {\n    …    build()\n            }");
        return new a0.v2(build);
    }

    @Override // a0.s2
    public boolean b() {
        return true;
    }
}
