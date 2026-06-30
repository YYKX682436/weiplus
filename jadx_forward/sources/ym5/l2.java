package ym5;

/* loaded from: classes15.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ym5.l2 f544957a = new ym5.l2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f544958b = jz5.h.b(ym5.k2.f544947d);

    static {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(android.view.View view, double d17, int i17) {
        if (view == null) {
            return;
        }
        ym5.i2 i2Var = (ym5.i2) ((jz5.n) f544958b).mo141623x754a37bb();
        i2Var.getClass();
        if (i2Var.f544915a == 0) {
            return;
        }
        if (view instanceof org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b) {
            ym5.h2 h2Var = i2Var.f544916b;
            h2Var.f544901f++;
            h2Var.f544902g += i17;
            h2Var.f544904i += d17;
            double d18 = d17 / i17;
            if (d18 > h2Var.f544903h) {
                h2Var.f544903h = d18;
                return;
            }
            return;
        }
        if (view instanceof com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17) {
            ym5.h2 h2Var2 = i2Var.f544916b;
            h2Var2.f544897b++;
            h2Var2.f544898c += i17;
            h2Var2.f544900e += d17;
            double d19 = d17 / i17;
            if (d19 > h2Var2.f544899d) {
                h2Var2.f544899d = d19;
            }
        }
    }
}
