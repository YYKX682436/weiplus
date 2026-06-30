package xn4;

/* loaded from: classes11.dex */
public final class x implements com.p314xaae8f345.mm.p947xba6de98f.q0 {
    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(event.f152638c);
        com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = event.f152636a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateHelper", "CdnPLCJavaHelperListener %s %s", m1Var, valueOf);
        int ordinal = m1Var.ordinal();
        java.lang.String str = event.f152637b;
        if (ordinal != 0) {
            if (ordinal == 1) {
                dn.m mVar = event.f152639d;
                java.lang.String str2 = mVar != null ? mVar.f69595x6d25b0d9 : null;
                if (str2 == null) {
                    str2 = "";
                }
                if (android.text.TextUtils.isEmpty(str2)) {
                    xn4.c0.a(xn4.c0.f537137a, str, new xn4.v(event));
                }
                if (event.f152641f != null) {
                    xn4.c0.a(xn4.c0.f537137a, str, new xn4.w(event, str2));
                    return;
                }
                return;
            }
            if (ordinal == 2) {
                dn.g gVar = event.f152640e;
                if (gVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.d0 d0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.d0();
                    long j17 = gVar.f69496x83ec3dd;
                    d0Var.f391647d = (j17 / gVar.f69500x8ab84c59) * 100;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.XUpdateHelper", "progress %s/%s percent:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(gVar.f69500x8ab84c59), java.lang.Double.valueOf(d0Var.f391647d));
                    if (d0Var.f391647d < 0.0d) {
                        d0Var.f391647d = 0.0d;
                    }
                    if (d0Var.f391647d > 100.0d) {
                        d0Var.f391647d = 100.0d;
                    }
                    xn4.c0.a(xn4.c0.f537137a, str, new xn4.u(event, d0Var));
                    return;
                }
                return;
            }
            if (ordinal == 6 || ordinal == 7) {
                xn4.c0.a(xn4.c0.f537137a, str, new xn4.t(event));
                return;
            } else if (ordinal != 10) {
                return;
            }
        }
        xn4.c0.a(xn4.c0.f537137a, str, new xn4.s(event));
    }
}
