package v74;

/* loaded from: classes4.dex */
public final class y0 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f515476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d f515477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v74.z0 f515478c;

    public y0(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d, v74.z0 z0Var) {
        this.f515476a = i17;
        this.f515477b = c17983xb14a9c8d;
        this.f515478c = z0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStart, pos=");
        int i18 = this.f515476a;
        sb6.append(i18);
        sb6.append(", durationSecond=");
        sb6.append(i17);
        sb6.append(", view.duration=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = this.f515477b;
        sb6.append(c17983xb14a9c8d.m70621x51e8b0a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookVideoManager", sb6.toString());
        if (i18 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v74.x0 x0Var = this.f515478c.f515483d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            android.os.Message obtainMessage = x0Var.obtainMessage(1, i18, c17983xb14a9c8d.m70621x51e8b0a());
            if (obtainMessage != null) {
                obtainMessage.sendToTarget();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
        int i18 = this.f515476a;
        if (i18 != -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v74.x0 x0Var = this.f515478c.f515483d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            android.os.Message obtainMessage = x0Var.obtainMessage(3, i18, i17);
            if (obtainMessage != null) {
                obtainMessage.sendToTarget();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(dm.i4.f66874x4c6b1f55, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d.IVideoViewCallback
    /* renamed from: onCompletion */
    public void mo70662xa6db431b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion, pos=");
        int i17 = this.f515476a;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookVideoManager", sb6.toString());
        if (i17 != -1) {
            this.f515477b.M(0, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            v74.x0 x0Var = this.f515478c.f515483d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMVideoPlayNotifyHandler$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager");
            android.os.Message obtainMessage = x0Var.obtainMessage(2, i17, 0);
            if (obtainMessage != null) {
                obtainMessage.sendToTarget();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCompletion", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$startPlay$1");
    }
}
