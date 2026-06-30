package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public final class p extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f250933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q f250934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n f250935c;

    public p(r45.g92 g92Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar) {
        this.f250933a = g92Var;
        this.f250934b = qVar;
        this.f250935c = nVar;
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposedId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(this.f250933a.m75945x2fec8307(2)) + view.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposedId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
        return E1;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        r45.g92 g92Var = this.f250933a;
        if (g92Var.m75939xb282bd08(13) == 1 && !z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q qVar = this.f250934b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q.F(qVar), "#bindActivityIcon onViewExposedListener false, cancel it");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getRefreshActivityIconJob$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = qVar.f250938s;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getRefreshActivityIconJob$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        }
        if (z17) {
            if (((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(g92Var.m75945x2fec8307(1), view.findViewById(com.p314xaae8f345.mm.R.id.f4x), view.findViewById(com.p314xaae8f345.mm.R.id.f7y), this.f250935c.i())) {
                long Z = pm0.v.Z(g92Var.m75945x2fec8307(2));
                int i17 = qs5.g.f447965a;
                int m75939xb282bd08 = g92Var.m75939xb282bd08(22);
                ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Vi(true, Z, ya.a.f77453x4b357bf, ((m75939xb282bd08 == 2 || m75939xb282bd08 == 8 || m75939xb282bd08 == 16) || g92Var.m75939xb282bd08(22) == 6) ? 1 : 2, 3);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
    }
}
