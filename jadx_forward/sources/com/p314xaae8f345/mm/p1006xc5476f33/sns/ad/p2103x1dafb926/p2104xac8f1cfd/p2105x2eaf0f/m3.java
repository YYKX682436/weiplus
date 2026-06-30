package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class m3 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 {
    public final f54.d0 B;
    public final s34.y C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.l3 D;
    public n74.d E;
    public int F;
    public int G;
    public int H;

    public m3(android.content.Context context, f54.d0 d0Var, android.view.ViewGroup viewGroup) {
        super(context, d0Var, viewGroup);
        this.F = 0;
        this.B = d0Var;
        s34.y yVar = d0Var.f341241z1;
        this.C = yVar;
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.l3(this);
        if (yVar != null) {
            this.f246919t.b("finderExportId", yVar.f484367f);
            this.f246919t.b("finderUsername", yVar.f484362a);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        s34.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
        super.K();
        if (this.B == null || (yVar = this.C) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingQuickAddFinderBtnComp", "viewWillAppear, mLastFollowFlg is " + this.F);
        h0(this.F);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69847x4f02f381(yVar.f484362a, this.D);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void U() {
        s34.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
        f54.d0 d0Var = this.B;
        if (d0Var == null || (yVar = this.C) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        if (this.F == 0) {
            if (this.E == null) {
                this.E = new n74.d(this.f246582d, 1000, null);
            }
            this.f246919t.a("opType", 0L);
            n74.d dVar = this.E;
            java.lang.String str = d0Var.F;
            int i17 = this.G;
            int i18 = this.H;
            dVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            dVar.f416862f = yVar;
            dVar.f416874r = str;
            dVar.f416863g = this.D;
            dVar.d(yVar, i17, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        } else {
            java.lang.String o17 = u().o();
            java.lang.String k17 = u().k();
            this.f246919t.a("opType", 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingQuickAddFinderBtnComp", "doBtnClick, uxInfo = " + o17 + ", snsId = " + k17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69818x1e004a23(this.f246582d, yVar.f484362a, o17, k17, 5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
    }

    public void h0(int i17) {
        s34.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
        this.F = i17;
        f54.d0 d0Var = this.B;
        if (d0Var == null || (yVar = this.C) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        android.widget.Button W = W();
        if (W == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
            return;
        }
        if (i17 == 0) {
            W.setText(d0Var.F);
        } else {
            W.setText(yVar.f484366e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
    }
}
