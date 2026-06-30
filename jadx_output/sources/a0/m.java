package a0;

/* loaded from: classes14.dex */
public abstract class m {
    public static final void a(z0.t modifier, yz5.l onDraw, n0.o oVar, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(modifier, "modifier");
        kotlin.jvm.internal.o.g(onDraw, "onDraw");
        java.lang.Object obj = n0.e1.f333492a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-932836462);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(modifier) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(onDraw) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            d0.e3.a(b1.j.a(modifier, onDraw), y0Var, 0);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f333608d = new a0.l(modifier, onDraw, i17);
    }
}
