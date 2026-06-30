package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93;

/* loaded from: classes4.dex */
public final class l implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y f244879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f244880e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f244879d = yVar;
        this.f244880e = c17933xe8d1b226;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.d0 d0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$handleInteractType$1$1$1");
        l44.e0 e0Var = (l44.e0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$handleInteractType$1$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y yVar = this.f244879d;
        java.lang.String j18 = yVar.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactType is ");
        sb6.append(e0Var);
        sb6.append(", model snsId is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f244880e;
        sb6.append(c17933xe8d1b226.m70367x7525eefd());
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        sb6.append(", mInPAGPlayingPeriod is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        boolean z17 = yVar.f244909y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j18, sb6.toString());
        if (e0Var == l44.e0.f397635p) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            boolean z18 = yVar.f244909y;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            if (!z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                yVar.f244909y = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                android.os.Handler handler = yVar.f244908x;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.k(yVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.a y17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y.y(yVar);
                if (y17 == null || (d0Var = y17.f244860d) == null) {
                    j17 = 2000;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStartDelayTime", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo");
                    j17 = d0Var.f244869g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStartDelayTime", "com.tencent.mm.plugin.sns.ad.widget.adpag.AnimationPagInfo");
                }
                handler.postDelayed(kVar, j17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$handleInteractType$1$1$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$handleInteractType$1$1$1");
        return f0Var;
    }
}
