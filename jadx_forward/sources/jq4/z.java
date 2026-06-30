package jq4;

/* loaded from: classes3.dex */
public final class z implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.a0 f382764d;

    public z(jq4.a0 a0Var) {
        this.f382764d = a0Var;
    }

    @Override // xg3.h0
    public final void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (m0Var == null || l0Var == null) {
            return;
        }
        jq4.a0 a0Var = this.f382764d;
        java.lang.String x17 = ((yb5.d) a0Var.f545128d).x();
        java.lang.String str = l0Var.f535943a;
        if (str == null || r26.n0.N(x17) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, x17) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0Var.f535944b, "insert")) {
            return;
        }
        java.util.ArrayList msgList = l0Var.f535945c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgList, "msgList");
        java.util.Iterator it = msgList.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()).A0() == 1) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("view_id", "send_msg_half_screen");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 26804);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(a0Var.f382653e);
                return;
            }
        }
    }
}
