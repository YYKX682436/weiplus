package n74;

/* loaded from: classes4.dex */
public abstract class o0 {
    public static boolean a(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAdTagClickable", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdTagClickable", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
            return false;
        }
        boolean z18 = i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 9 || i17 == 19 || i17 == 45;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAdTagClickable", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        return z18;
    }

    public static void b(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i18, i64.b1 b1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, i18, 45);
        ca4.m0.f(c11137xb05b06ad, b1Var, c17933xe8d1b226, i18);
        ca4.z0.x0(c11137xb05b06ad);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
    }

    public static void c(android.app.Activity activity, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i18) {
        i64.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdTagClickableHelper", th6.toString());
        }
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac activityC18022x27bfedac = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) activity;
            activityC18022x27bfedac.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            b1Var = activityC18022x27bfedac.f248402l1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
            b(i17, c17933xe8d1b226, i18, b1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        }
        b1Var = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
        b(i17, c17933xe8d1b226, i18, b1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAdTagReport", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdTagClickableHelper");
    }
}
