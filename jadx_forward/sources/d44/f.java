package d44;

/* loaded from: classes4.dex */
public class f extends d44.d implements vd2.g5 {
    @Override // vd2.g5
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
        if (bool == null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.FinderLivingRequest", "the RequestSuccessCallBack value is null");
            } catch (java.lang.Throwable unused) {
            }
        }
        c(0, bool == null ? false : bool.booleanValue());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
    }

    public final void c(int i17, boolean z17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSuccessCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
        int i19 = this.f307962b;
        if (i19 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                i18 = 513;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNoticeState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                i18 = 257;
            }
        } else if (i19 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLiveState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLiveState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                i18 = 770;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLiveState", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
                i18 = 771;
            }
        } else {
            i18 = 0;
        }
        b(i17, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSuccessCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestSuccessCallBack");
    }
}
