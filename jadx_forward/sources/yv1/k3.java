package yv1;

/* loaded from: classes12.dex */
public final class k3 implements xg3.i0 {
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 notify) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notify, "notify");
        if (z65.c.f551991d || (arrayList = notify.f535945c) == null || arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var != null && f9Var.m124847x74d37ac6() != 0) {
                mt1.b0 b0Var = mt1.b0.f412724a;
                if (mt1.e0.f412746a.get(java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0())) != null) {
                    z17 = true;
                }
                java.lang.String Q0 = f9Var.Q0();
                if (Q0 == null) {
                    Q0 = "talker-ignore";
                }
                b0Var.r(f9Var.m124847x74d37ac6(), Q0);
            }
        }
        if (z17) {
            yv1.f1 f1Var = yv1.g1.f547573p;
        }
    }
}
