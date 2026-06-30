package g44;

/* loaded from: classes4.dex */
public final class f implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g44.g f350352d;

    public f(g44.g gVar) {
        this.f350352d = gVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public final void mo889xb349b3ab() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDismiss", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper$showBottomSheet$3");
        g44.g gVar = this.f350352d;
        ca4.d e17 = gVar.e();
        if (e17 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            long j17 = gVar.f379238w;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMLoadFinishTime", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
            e17.a((int) (currentTimeMillis - j17));
        }
        l44.z.n(gVar.e());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDismiss", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper$showBottomSheet$3");
    }
}
