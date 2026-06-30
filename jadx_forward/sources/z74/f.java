package z74;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f552129a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f552130b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f552131c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f552132d;

    public f(java.lang.String str) {
        this.f552129a = android.text.TextUtils.isEmpty(str) ? "OnlineVideoChecker" : str;
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        android.view.ViewGroup viewGroup = this.f552130b;
        java.lang.String str = this.f552129a;
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "OnlineVideoChecker: the container is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f552131c;
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "OnlineVideoChecker: the timeline object is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        } else {
            try {
                b(viewGroup, c19807x593d1720, this.f552132d);
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        }
    }

    public final void b(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        boolean e17 = a84.y0.e(viewGroup);
        java.lang.String str = this.f552129a;
        if (!e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "OnlineVideoChecker: there is no child video view in container!!");
        } else if (z17) {
            android.view.View childAt = viewGroup.getChildAt(0);
            if ((childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807) childAt).f252174m2, c19807x593d1720.Id)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "OnlineVideoChecker: the online video container has child, but the time line id is different!!");
                a84.y0.c(viewGroup);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "OnlineVideoChecker: it doesn't use online video container!!");
            a84.y0.c(viewGroup);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
    }

    public z74.f c(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        this.f552130b = viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        return this;
    }

    public z74.f d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("timeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        this.f552131c = c19807x593d1720;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("timeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        return this;
    }

    public z74.f e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        this.f552132d = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        return this;
    }
}
