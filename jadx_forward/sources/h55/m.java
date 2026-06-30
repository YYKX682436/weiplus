package h55;

/* loaded from: classes8.dex */
public final class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6261x1674b3 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6261x1674b3) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.g20 g20Var = event.f136512g;
        if (g20Var != null) {
            int i17 = g20Var.f88265b ? 3 : !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g20Var.f88267d, "") ? 2 : g20Var.f88266c > 0 ? 1 : 0;
            f55.g gVar = (f55.g) i95.n0.c(f55.g.class);
            boolean z17 = i17 > 0;
            int i18 = g20Var.f88264a;
            java.lang.String str = g20Var.f88267d;
            int i19 = g20Var.f88266c;
            ((e55.f) gVar).getClass();
            if (e55.e.f331200a.n()) {
                e55.m mVar = e55.m.f331214a;
                int i27 = i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 3 ? -1 : 1012 : 1011 : 1010 : 1009;
                mVar.g().mo50303x856b99f0(i27);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g17 = mVar.g();
                android.os.Message mo50288x733c63a2 = mVar.g().mo50288x733c63a2();
                mo50288x733c63a2.what = i27;
                mo50288x733c63a2.obj = nm5.j.f(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str != null ? str : "", java.lang.Integer.valueOf(i19));
                g17.mo50311x7ab51103(mo50288x733c63a2, 500L);
            }
        }
        return false;
    }
}
