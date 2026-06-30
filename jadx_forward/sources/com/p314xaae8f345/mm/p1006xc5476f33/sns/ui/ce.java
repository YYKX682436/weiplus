package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ce implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f249654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28 f249655e;

    public ce(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28 activityC18010xd5ae6b28, java.lang.String str) {
        this.f249655e = activityC18010xd5ae6b28;
        this.f249654d = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onImageFinish */
    public void mo852x876bfa6f(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        java.lang.String str2 = this.f249654d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2) && str.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "download image finish %s", str);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28.K;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28 activityC18010xd5ae6b28 = this.f249655e;
            java.lang.String str3 = activityC18010xd5ae6b28.f248313m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str3, null);
            if (J2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28.T6(activityC18010xd5ae6b28).mo64626x52d31475(J2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSetbg */
    public void mo853xb04a0d88(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSightFinish */
    public void mo854x822e7131(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onThumbFinish */
    public void mo855x8dbd7aaa(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$CDNMediaDownloadListener");
    }
}
