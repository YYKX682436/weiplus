package d0;

/* loaded from: classes14.dex */
public abstract class k0 {
    public static z0.t a(d0.l0 l0Var, z0.t tVar, float f17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        ((d0.m0) l0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tVar, "<this>");
        if (((double) f17) > 0.0d) {
            boolean z18 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
            return tVar.k(new d0.u1(f17, z17, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d));
        }
        throw new java.lang.IllegalArgumentException(("invalid weight " + f17 + "; must be greater than zero").toString());
    }
}
