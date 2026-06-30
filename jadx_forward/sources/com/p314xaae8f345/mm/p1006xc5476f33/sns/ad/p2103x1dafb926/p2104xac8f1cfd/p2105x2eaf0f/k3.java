package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f244406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.l3 f244407e;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.l3 l3Var, java.lang.Object obj) {
        this.f244407e = l3Var;
        this.f244406d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        n74.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.l3 l3Var = this.f244407e;
        java.lang.ref.WeakReference weakReference = l3Var.f244417a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        java.lang.ref.WeakReference weakReference2 = l3Var.f244417a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.m3 m3Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.m3) weakReference2.get();
        if (m3Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
            return;
        }
        java.lang.Object obj = this.f244406d;
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            try {
                java.lang.String k17 = m3Var.u().k();
                java.lang.String o17 = m3Var.u().o();
                java.lang.String a17 = m3Var.u().a();
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                int optInt = jSONObject.optInt("followType");
                if (optInt == 1) {
                    int optInt2 = jSONObject.optInt("followFlg");
                    int optInt3 = jSONObject.optInt("followNum");
                    int optInt4 = jSONObject.optInt("feedNum");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFinderFollowFlag", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingQuickAddFinderBtnComp", "request ad finder contract status, followFlg is " + optInt2);
                    m3Var.G = optInt3;
                    m3Var.H = optInt4;
                    m3Var.h0(optInt2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFinderFollowFlag", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                } else if (optInt == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                    n74.d dVar2 = m3Var.E;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                    if (dVar2 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
                        return;
                    }
                    boolean optBoolean = jSONObject.optBoolean("followRet");
                    java.lang.String b17 = dVar2.b();
                    if (optBoolean) {
                        dVar = dVar2;
                        n74.s.b(k17, o17, a17, b17, 0, 2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingQuickAddFinderBtnComp", "add finder contract success, followFlg is 1");
                        m3Var.h0(1);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e m69779x9cf0d20b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                        android.content.Context context = m3Var.f246582d;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                        s34.y yVar = m3Var.C;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp");
                        m69779x9cf0d20b.m69818x1e004a23(context, yVar.f484362a, o17, k17, 5);
                    } else {
                        dVar = dVar2;
                        n74.s.b(k17, o17, a17, b17, 1, 2);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                    n74.d dVar3 = dVar;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = dVar3.f416858b;
                    if (k0Var != null && k0Var.i()) {
                        dVar3.f416858b.u();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
                    dVar3.c();
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingQuickAddFinderBtnComp", "FinderLogicCallback callback, exp is " + th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingQuickAddFinderBtnComp$FinderLogicCallback$1");
    }
}
