package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class h9 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 f242633a;

    public h9(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 activityC17415x5f2726f5) {
        this.f242633a = activityC17415x5f2726f5;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        boolean g17 = j65.e.g();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 activityC17415x5f2726f5 = this.f242633a;
        if (!g17 && !j65.e.e() && !j65.e.c() && !z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC17415x5f2726f5.mo55332x76847179());
            u1Var.g(activityC17415x5f2726f5.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574513ij4));
            u1Var.a(true);
            u1Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f9(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g9(this, z17));
            u1Var.q(false);
            return;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, java.lang.Boolean.valueOf(z17));
        j65.e.o();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6360x601cdabd c6360x601cdabd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6360x601cdabd();
        c6360x601cdabd.f137113d = z17 ? 3L : 4L;
        c6360x601cdabd.k();
        l14.a.a("listen_text_msg_btn", z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5.V6(activityC17415x5f2726f5);
    }
}
