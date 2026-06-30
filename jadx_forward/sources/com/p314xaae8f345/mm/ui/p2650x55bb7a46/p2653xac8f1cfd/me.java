package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class me implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oe f281037d;

    public me(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oe oeVar) {
        this.f281037d = oeVar;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oe oeVar = this.f281037d;
        if (oeVar.f281173e || m0Var == null || l0Var == null || l0Var.f535943a == null || (arrayList = l0Var.f535945c) == null || arrayList.isEmpty()) {
            return;
        }
        yb5.d dVar = oeVar.f280113d;
        java.lang.String str = dVar.f542249k;
        java.lang.String x17 = dVar.x();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            java.lang.String y07 = f9Var.y0();
            java.lang.String Q0 = f9Var.Q0();
            if (y07 != null && Q0 != null && str != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, y07) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Q0, x17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HasSentMsgComponent", "has sent msg from " + y07 + ", to " + Q0);
                boolean z17 = true;
                oeVar.f281173e = true;
                long longExtra = oeVar.f280113d.g().getIntent().getLongExtra("from_create_group_exit_type", 0L);
                int intExtra = oeVar.f280113d.g().getIntent().getIntExtra("from_create_group_scene", 0);
                if (!(longExtra == 5 || longExtra == 6) && longExtra != 7) {
                    z17 = false;
                }
                if (z17) {
                    pm0.v.K(null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ne(oeVar, longExtra, intExtra));
                    return;
                }
                return;
            }
        }
    }
}
