package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class u1 implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18234x6d04b321 f250535d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18234x6d04b321 c18234x6d04b321) {
        this.f250535d = c18234x6d04b321;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        xc4.p n17;
        java.lang.String m125483x6bf53a6c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$contactObserver$1");
        o75.c event = (o75.c) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$contactObserver$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18234x6d04b321.O6(this.f250535d).O6().iterator();
        while (it.hasNext()) {
            tc4.s0 s0Var = (tc4.s0) it.next();
            if (s0Var instanceof tc4.e) {
                tc4.k2 k2Var = (tc4.k2) ((tc4.e) s0Var);
                k2Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("contactChangeCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) event.f425123d;
                if (z3Var != null) {
                    zc4.b m166188xfb7e5820 = k2Var.m166188xfb7e5820();
                    if (((m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null || (m125483x6bf53a6c = n17.m125483x6bf53a6c()) == null || z3Var.d1().hashCode() != m125483x6bf53a6c.hashCode()) ? false : true) && z3Var.g2().hashCode() != k2Var.m166229xa3a57151().getF213058i().hashCode()) {
                        k2Var.x("MicroMsg.Improve.Notify", "contactObserver: refresh nickname old:" + ((java.lang.Object) k2Var.m166229xa3a57151().getF213058i()) + ", new:" + z3Var.g2());
                        k2Var.u();
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("contactChangeCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$contactObserver$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$contactObserver$1");
    }
}
