package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class m implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t f290878d;

    public m(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t tVar) {
        this.f290878d = tVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        wi5.n0 n0Var;
        java.util.HashMap hashMap;
        j75.f m67437x4bd5310;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t tVar = this.f290878d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.w8 w8Var = ((com.p314xaae8f345.mm.ui.p2690x38b72420.v8) tVar.f290898d.get(i17)).f288753d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentForwardListViewUIC", "onItemClick() called with: adapter = " + adapter + ", view = " + view + ", position = " + i17 + ", holder = " + holder);
        if (((com.p314xaae8f345.mm.ui.p2690x38b72420.v8) tVar.f290898d.get(i17)).f288754e == 1) {
            tVar.X6(!w8Var.f288768e);
            if (w8Var.f288768e) {
                com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.t();
            }
            adapter.m8146xced61ae5();
            return;
        }
        boolean z17 = w8Var.f288768e;
        java.lang.String str = w8Var.f288764a;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.t.T6(tVar, str, i17);
            com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.r(i17, str);
            return;
        }
        int i18 = i17 < b95.b.a() ? 4 : 3;
        if (w8Var.f288767d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = tVar.P6();
            if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
                return;
            }
            java.lang.Object obj = tVar.f290902h.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            m67437x4bd5310.B3(new wi5.t0((ri5.j) obj, -1, i18));
            return;
        }
        j75.f Q6 = tVar.Q6();
        if (Q6 != null && (n0Var = (wi5.n0) Q6.mo140437x75286adb()) != null && (hashMap = n0Var.E) != null) {
            wi5.l0 l0Var = new wi5.l0();
            l0Var.f527838a = i18;
        }
        j75.f Q62 = tVar.Q6();
        if (Q62 != null) {
            if (str == null) {
                str = "";
            }
            Q62.B3(new wi5.c0(kz5.b0.c(str), -1));
        }
    }
}
