package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f244480d;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var) {
        this.f244480d = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$mOnRepeatPickClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent$mOnRepeatPickClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRepeatPickCardClick, curShowCard=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var = this.f244480d;
        java.lang.String str = f2Var.f244346y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.HalfEggCard.AdLandingComponent", sb6.toString());
        c54.b O = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2.O(f2Var);
        if (O != null) {
            O.i();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        f2Var.f244346y = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMCurrentShowCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMCardRequestInterface$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.s1 s1Var = f2Var.f244345x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMCardRequestInterface$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        if (s1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("repeatPickCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController$mCardRequestInterface$1");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("repeatPickCard, pageId=");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPageId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            c54.j jVar = ((c54.i) s1Var).f120222a;
            java.lang.String str2 = jVar.f120225c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPageId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            sb7.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.ComponentController", sb7.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMHalfEggCardComponent$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMHalfEggCardComponent$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPageId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPageId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doStartAnimAndRequestCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            jVar.a(jVar.f120223a, jVar.f120225c);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doStartAnimAndRequestCardId", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1970, 19);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("repeatPickCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardComponentController$mCardRequestInterface$1");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHalfEggCardComponent$mOnRepeatPickClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$mOnRepeatPickClickListener$1");
    }
}
