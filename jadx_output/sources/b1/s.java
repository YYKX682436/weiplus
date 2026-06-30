package b1;

/* loaded from: classes14.dex */
public abstract class s {
    public static z0.t a(z0.t shadow, float f17, e1.a1 a1Var, boolean z17, long j17, long j18, int i17, java.lang.Object obj) {
        e1.a1 shape = (i17 & 2) != 0 ? e1.v0.f246289a : a1Var;
        boolean z18 = (i17 & 4) != 0 ? java.lang.Float.compare(f17, (float) 0) > 0 : z17;
        long j19 = (i17 & 8) != 0 ? e1.f0.f246252a : j17;
        long j27 = (i17 & 16) != 0 ? e1.f0.f246252a : j18;
        kotlin.jvm.internal.o.g(shadow, "$this$shadow");
        kotlin.jvm.internal.o.g(shape, "shape");
        if (java.lang.Float.compare(f17, 0) <= 0 && !z18) {
            return shadow;
        }
        boolean z19 = androidx.compose.ui.platform.f3.f10562a;
        androidx.compose.ui.platform.e3 e3Var = androidx.compose.ui.platform.e3.f10553d;
        int i18 = z0.t.f468922q1;
        return androidx.compose.ui.platform.f3.a(shadow, e3Var, e1.d0.a(z0.p.f468921d, new b1.r(f17, shape, z18, j19, j27)));
    }
}
