package s34;

/* loaded from: classes4.dex */
public final class y0 {
    public y0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        java.util.List c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
            return false;
        }
        s34.a1 a1Var = c17933xe8d1b226.m70354x74235b3e().f38210x95847c91;
        if (a1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSupportOverSlideJump", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        boolean z17 = a1Var.f76694x80bfd259 != null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportOverSlideJump", "com.tencent.mm.plugin.sns.ad.adxml.AdSliderFullCardInfo");
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdSlideItemProductInfo", "isAdSlideItemProductInfoValid, adSliderFullCardInfo is not support OverSlideJump");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
            return false;
        }
        s34.z0 z0Var = a1Var.f484102f;
        if (z0Var == null || (c17 = z0Var.c()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
            return false;
        }
        if (c17.size() == a1Var.f484097a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdSlideItemProductInfo", "isAdSlideItemProductInfoValid, productInfoList size is " + c17.size() + ", pushAdNum is " + a1Var.f484097a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdSlideItemProductInfoValid", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideItemProductInfo$Companion");
        return false;
    }
}
