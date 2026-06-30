package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f f244392d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f c17730x4c10861f) {
        this.f244392d = c17730x4c10861f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f c17730x4c10861f = this.f244392d;
        android.content.Context context = c17730x4c10861f.f246582d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) {
            f54.p R = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShageGiveCardXMLInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            java.lang.String str = "<giveHBCardInfo><twistCardId>" + R.A + "</twistCardId><giveCardId>" + R.F + "</giveCardId><senderUserName>" + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69872xaa2fb6d8() + "</senderUserName><senderNickName>" + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69870xbe3cd670() + "</senderNickName><subCardType>4</subCardType><shareTime>" + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69888xb09a0e75() + "</shareTime></giveHBCardInfo>";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShageGiveCardXMLInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f).L;
            java.lang.String m69870xbe3cd670 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69870xbe3cd670();
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                android.content.Context context2 = c17730x4c10861f.f246582d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                str2 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7e);
            }
            if (!android.text.TextUtils.isEmpty(m69870xbe3cd670)) {
                str2 = m69870xbe3cd670 + str2;
            }
            java.lang.String str3 = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingHBCardComponent", "onShareGiveCard, xml=" + str + ", shareTitle=" + str3 + ", compSubType=" + com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f).f84359p);
            java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f).f69693x58a2a8b8;
            if (android.text.TextUtils.isEmpty(str4)) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f).f84359p == 0) {
                    str4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f).f69692xf65ed046;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingHBCardComponent", "shareThumbUrl is empty, use hbImgUrl");
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f).f84359p == 1 && com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f).G != null && !android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f).G.f4x5d6543b9)) {
                    str4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f).G.f4x5d6543b9;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingHBCardComponent", "shareThumbUrl is empty, use video.thumbUrl");
                }
            }
            java.lang.String str5 = str4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            android.content.Context context3 = c17730x4c10861f.f246582d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) context3;
            java.lang.String str6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.R(c17730x4c10861f).H;
            activityC18007x6d5e9773.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shareGiveHbCard", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.Y7()) {
                activityC18007x6d5e9773.o7(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kc(activityC18007x6d5e9773, str, str3, str6, str5));
            } else {
                activityC18007x6d5e9773.n8(activityC18007x6d5e9773.C, null, str, str3, str6, str5);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shareGiveHbCard", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.P(c17730x4c10861f) != 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.S(c17730x4c10861f).d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.P(c17730x4c10861f), false, 2);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.C17730x4c10861f.S(c17730x4c10861f).d(2, true, 2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$4");
    }
}
