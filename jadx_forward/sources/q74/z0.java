package q74;

/* loaded from: classes4.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.y0 f442131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 f442132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f442133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s34.x0 f442134g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f442135h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q74.b1 f442136i;

    public z0(q74.b1 b1Var, q74.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, s34.x0 x0Var, boolean z17) {
        this.f442136i = b1Var;
        this.f442131d = y0Var;
        this.f442132e = c17808x428917d3;
        this.f442133f = c17933xe8d1b226;
        this.f442134g = x0Var;
        this.f442135h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.FrameLayout frameLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        this.f442136i.f441960j = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        q74.y0 y0Var = this.f442131d;
        if (y0Var != null && (frameLayout = y0Var.f442108h) != null) {
            android.content.Context context = frameLayout.getContext();
            if (!(context instanceof android.app.Activity) || ((android.app.Activity) context).isFinishing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.SlideFullCardVideoPlayHelper", "doPlayVideo, but activity is finishing");
            } else {
                q74.b1 b1Var = this.f442136i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f442132e;
                android.widget.FrameLayout frameLayout2 = y0Var.f442108h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f442133f;
                r45.jj4 jj4Var = this.f442134g.f484361e;
                boolean z17 = this.f442135h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                b1Var.i(c17808x428917d3, frameLayout2, c17933xe8d1b226, jj4Var, z17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper$1");
    }
}
