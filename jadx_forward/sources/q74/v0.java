package q74;

/* loaded from: classes4.dex */
public class v0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f442086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q74.x0 f442088c;

    public v0(q74.x0 x0Var, android.widget.ImageView imageView, java.lang.String str) {
        this.f442088c = x0Var;
        this.f442086a = imageView;
        this.f442087b = str;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
        android.widget.ImageView imageView = this.f442086a;
        imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloadError, hash = " + imageView.hashCode() + ", url = " + this.f442087b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.widget.ImageView imageView = this.f442086a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
        try {
            java.lang.String str2 = (java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.n1z);
            java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? "" : za4.t0.l("adId", str2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals(l17)) {
                q74.x0 x0Var = this.f442088c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                x0Var.J(imageView, str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                imageView.hashCode();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloaded, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter$2");
    }
}
