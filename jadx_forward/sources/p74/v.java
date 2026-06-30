package p74;

/* loaded from: classes4.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p74.w f434134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f434135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 f434136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f434137g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s34.x0 f434138h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f434139i;

    public v(p74.w wVar, android.widget.FrameLayout frameLayout, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, s34.x0 x0Var, boolean z17) {
        this.f434134d = wVar;
        this.f434135e = frameLayout;
        this.f434136f = c17808x428917d3;
        this.f434137g = c17933xe8d1b226;
        this.f434138h = x0Var;
        this.f434139i = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$doPlayVideo$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMIsDelayVideoPlay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        this.f434134d.f434145f = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMIsDelayVideoPlay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        android.content.Context context = this.f434135e.getContext();
        if (!(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdSlideCardVideoPlayHelper", "doPlayVideo, but activity is finishing");
        } else {
            p74.w wVar = this.f434134d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f434136f;
            android.widget.FrameLayout frameLayout = this.f434135e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f434137g;
            r45.jj4 jj4Var = this.f434138h.f484361e;
            boolean z17 = this.f434139i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$playVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.j(c17808x428917d3, frameLayout, c17933xe8d1b226, jj4Var, z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$playVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper$doPlayVideo$1");
    }
}
