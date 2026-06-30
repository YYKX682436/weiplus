package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class i1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 f155453a;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 m1Var) {
        this.f155453a = m1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public void mo2069x63a3b28a() {
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai("fingerprint_login_logout", "view_clk", null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m1 m1Var = this.f155453a;
        if (m1Var.f155564g == null || m1Var.f155563f) {
            return;
        }
        m1Var.f155563f = true;
        m1Var.f155561d.a(true);
        wd0.e1 e1Var = new wd0.e1();
        wd0.d1[] d1VarArr = wd0.d1.f526235d;
        e1Var.f526236a = 9;
        e1Var.f526237b = "user canceled";
        m1Var.f155564g.a(e1Var);
    }
}
