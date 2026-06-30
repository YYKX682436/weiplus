package b1;

/* loaded from: classes14.dex */
public abstract class s {
    public static z0.t a(z0.t shadow, float f17, e1.a1 a1Var, boolean z17, long j17, long j18, int i17, java.lang.Object obj) {
        e1.a1 shape = (i17 & 2) != 0 ? e1.v0.f327822a : a1Var;
        boolean z18 = (i17 & 4) != 0 ? java.lang.Float.compare(f17, (float) 0) > 0 : z17;
        long j19 = (i17 & 8) != 0 ? e1.f0.f327785a : j17;
        long j27 = (i17 & 16) != 0 ? e1.f0.f327785a : j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shadow, "$this$shadow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shape, "shape");
        if (java.lang.Float.compare(f17, 0) <= 0 && !z18) {
            return shadow;
        }
        boolean z19 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3 e3Var = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d;
        int i18 = z0.t.f550455q1;
        return p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.a(shadow, e3Var, e1.d0.a(z0.p.f550454d, new b1.r(f17, shape, z18, j19, j27)));
    }
}
