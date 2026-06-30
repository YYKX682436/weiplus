package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd;

/* loaded from: classes4.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.w f252941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qb6 f252942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f252943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.w wVar, r45.qb6 qb6Var, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f252941d = wVar;
        this.f252942e = qb6Var;
        this.f252943f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.o(this.f252941d, this.f252942e, this.f252943f, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        return oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        java.lang.Object mo150x989b7ca4 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        long longExtra = this.f252941d.m158359x1e885992().getLongExtra("key_ws_feed_id", 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Qj().y0(longExtra);
        this.f252942e.f465343d.clear();
        this.f252942e.f465343d.addAll(this.f252943f);
        y07.f69423x99016a0b = this.f252942e.mo14344x5f01b1f6();
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Qj().mo9952xce0038c9(y07, new java.lang.String[0]);
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("forceUpdateTimeline$default", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        o75.b eventID = o75.b.f425116d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("forceUpdateTimeline", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventID, "eventID");
        xc4.p Y6 = gVar.Y6(longExtra);
        if (Y6 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("forceUpdateTimeline", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            Y6.S1 = currentTimeMillis;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
            gVar.g7(Y6, eventID);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("forceUpdateTimeline", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("forceUpdateTimeline$default", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$observerLiveListEvent$1$1$3");
        return valueOf;
    }
}
