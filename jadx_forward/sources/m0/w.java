package m0;

/* loaded from: classes14.dex */
public abstract class w implements a0.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final m0.d0 f404056d;

    public w(boolean z17, n0.e5 rippleAlpha) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rippleAlpha, "rippleAlpha");
        this.f404056d = new m0.d0(z17, rippleAlpha);
    }

    public abstract void e(c0.r rVar, p3325xe03a0797.p3326xc267989b.y0 y0Var);

    public final void f(g1.i drawStateLayer, float f17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawStateLayer, "$this$drawStateLayer");
        m0.d0 d0Var = this.f404056d;
        d0Var.getClass();
        boolean isNaN = java.lang.Float.isNaN(f17);
        boolean z17 = d0Var.f403988a;
        float a17 = isNaN ? m0.s.a(drawStateLayer, z17, drawStateLayer.a()) : drawStateLayer.R(f17);
        float floatValue = ((java.lang.Number) d0Var.f403990c.d()).floatValue();
        if (floatValue > 0.0f) {
            long b17 = e1.y.b(j17, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!z17) {
                g1.h.b(drawStateLayer, b17, a17, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float d17 = d1.k.d(drawStateLayer.a());
            float b18 = d1.k.b(drawStateLayer.a());
            g1.b bVar = (g1.b) drawStateLayer.p();
            long b19 = bVar.b();
            bVar.a().c();
            ((g1.d) bVar.f349037a).a(0.0f, 0.0f, d17, b18, 1);
            g1.h.b(drawStateLayer, b17, a17, 0L, 0.0f, null, null, 0, 124, null);
            bVar.a().b();
            bVar.c(b19);
        }
    }

    public abstract void g(c0.r rVar);
}
