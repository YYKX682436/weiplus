package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f244486d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var) {
        this.f244486d = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$mVideoPlayTask$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try play video, cardId=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var = this.f244486d;
        java.lang.String str = f2Var.f244346y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.AdLandingComponent", sb6.toString());
        c54.b O = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2.O(f2Var);
        if (O != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerCardVideoAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            java.util.Iterator it = O.f120203h.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.HalfEggCard.Card", "triggerCardVideoAppeared, not found videoComp, cardId=" + O.c());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerCardVideoAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) ((java.util.Map.Entry) it.next()).getValue();
                if (a2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("triggerCardVideoAppeared, has videoComp, cardId=");
                    sb7.append(O.c());
                    sb7.append(", compId=");
                    ab4.d0 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1) a2Var).p();
                    sb7.append(p17 != null ? p17.f84350d : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.Card", sb7.toString());
                    a2Var.K();
                    a2Var.J();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerCardVideoAppeared", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$mVideoPlayTask$1");
    }
}
