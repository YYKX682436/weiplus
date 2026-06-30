package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public final class i0 implements xg3.h0 {
    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (z65.c.f551991d || l0Var == null) {
            return;
        }
        java.util.ArrayList arrayList = l0Var.f535945c;
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            if (f9Var == null || f9Var.m124847x74d37ac6() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizMainCellExposeHelper", "[update36986] IOnMsgChange callback. msgInfo is null, skip");
            } else {
                java.lang.String Q0 = f9Var.Q0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMainCellExposeHelper", "[update36986] IOnMsgChange callback. onNotifyChange: username:" + Q0);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.i4(Q0)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.a0 a0Var = com.p314xaae8f345.mm.p2621x8fb0427b.a0.f275241g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q0);
                    a1Var.z(a0Var, Q0);
                } else if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(Q0)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
                    com.p314xaae8f345.mm.p2621x8fb0427b.a0 a0Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.a0.f275242h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q0);
                    a1Var2.z(a0Var2, Q0);
                }
            }
        }
    }
}
