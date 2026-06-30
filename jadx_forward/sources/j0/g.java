package j0;

/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final float f377827a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f377828b;

    static {
        float f17 = 25;
        f377827a = f17;
        f377828b = (f17 * 2.0f) / 2.4142137f;
    }

    public static final void a(long j17, z0.t modifier, yz5.p pVar, n0.o oVar, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-5185995);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.d(j17) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(modifier) ? 32 : 16;
        }
        if ((i17 & ce1.h.f4368x366c91de) == 0) {
            i18 |= y0Var.e(pVar) ? 256 : 128;
        }
        if ((i18 & 731) == 146 && y0Var.v()) {
            y0Var.O();
        } else {
            k0.i.b(j17, k0.m.TopMiddle, u0.j.b(y0Var, -1458480226, true, new j0.a(pVar, modifier, i18)), y0Var, (i18 & 14) | com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new j0.b(j17, modifier, pVar, i17);
    }

    public static final void b(z0.t modifier, n0.o oVar, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifier, "modifier");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(694251107);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(modifier) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i18 & 11) == 2 && y0Var.v()) {
            y0Var.O();
        } else {
            z0.t i19 = d0.a3.i(modifier, f377828b, f377827a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i19, "<this>");
            d0.e3.a(z0.m.b(i19, null, j0.f.f377816d, 1, null), y0Var, 0);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new j0.c(modifier, i17);
    }
}
