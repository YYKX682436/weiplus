package j94;

/* loaded from: classes4.dex */
public final class e implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f380081a;

    public e(android.content.Context context) {
        this.f380081a = context;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper$jumpFinderLive$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WsFoldJumpFinderLiveHelper", "showLivingRoom, snsId=%s, actionType=%d, errCode=%d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != 0) {
            android.content.Context context = this.f380081a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$showErrorToast", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showErrorToast", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper");
            try {
                db5.t7.g(context, "进入直播间失败");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WsFoldJumpFinderLiveHelper", "showErrorToast exp=%s", th6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showErrorToast", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$showErrorToast", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1837, 5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpFinderLiveHelper$jumpFinderLive$1");
    }
}
