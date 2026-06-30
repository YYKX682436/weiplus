package m2;

/* loaded from: classes14.dex */
public abstract class d0 {
    public static final void a(m2.a0 compositionDataRecord, yz5.p content, n0.o oVar, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compositionDataRecord, "compositionDataRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.Object obj = n0.e1.f415025a;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.V(-913922352);
        if ((i17 & 14) == 0) {
            i18 = (y0Var.e(compositionDataRecord) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 112) == 0) {
            i18 |= y0Var.e(content) ? 32 : 16;
        }
        if ((i18 & 91) == 18 && y0Var.v()) {
            y0Var.O();
        } else {
            y0Var.f415309q = true;
            java.util.Set set = ((m2.b0) compositionDataRecord).f404436a;
            set.add(y0Var.f415296d);
            n0.n1.a(new n0.i3[]{p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h3.f92110a.b(java.lang.Boolean.TRUE), y0.d.f540022a.b(set)}, content, y0Var, (i18 & 112) | 8);
        }
        n0.f4 q17 = y0Var.q();
        if (q17 == null) {
            return;
        }
        ((n0.l3) q17).f415141d = new m2.c0(compositionDataRecord, content, i17);
    }
}
