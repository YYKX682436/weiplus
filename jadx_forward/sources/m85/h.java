package m85;

/* loaded from: classes14.dex */
public abstract class h {
    public static final void a(yz5.p content, n0.o oVar, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(419765489);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(content) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            java.lang.Object obj = n0.e1.f415025a;
            l0.i iVar = (l0.i) y0Var.i(l0.k.f395847a);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            l0.r0.a(l0.i.a(iVar, 0L, 0L, 0L, 0L, 0L, rz0.a.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c, context), 0L, 0L, 0L, 0L, 0L, 0L, false, 8159, null), null, null, content, y0Var, (i18 << 9) & 7168, 6);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 != null) {
            ((n0.l3) q17).f415141d = new m85.g(content, i17);
        }
    }
}
