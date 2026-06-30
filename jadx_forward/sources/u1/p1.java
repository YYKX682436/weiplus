package u1;

/* loaded from: classes14.dex */
public abstract class p1 {
    public static void a(u1.r1 r1Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988) r1Var;
        yz5.a aVar = z17 ? c1059xa8272988.L1 : null;
        u1.d1 d1Var = c1059xa8272988.f91989J;
        if (d1Var.e(aVar)) {
            c1059xa8272988.requestLayout();
        }
        d1Var.b(false);
    }
}
