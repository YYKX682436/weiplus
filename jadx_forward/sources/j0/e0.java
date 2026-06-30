package j0;

/* loaded from: classes13.dex */
public abstract class e0 {
    public static final void a(k0.y0 manager, yz5.p content, n0.o oVar, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-1985516685);
        if ((i17 & 112) == 0) {
            i18 = (y0Var.e(content) ? 32 : 16) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 81) == 16 && y0Var.v()) {
            y0Var.O();
        } else {
            content.mo149xb9724478(y0Var, java.lang.Integer.valueOf((i18 >> 3) & 14));
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new j0.d0(manager, content, i17);
    }
}
