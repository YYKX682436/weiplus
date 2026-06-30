package v74;

/* loaded from: classes2.dex */
public final class p0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f515408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17763x43ffafc5 f515409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f515410f;

    public p0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17763x43ffafc5 c17763x43ffafc5, int i17) {
        this.f515408d = view;
        this.f515409e = c17763x43ffafc5;
        this.f515410f = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$setBreakFrame$1");
        android.view.View view = this.f515408d;
        if (!view.isAttachedToWindow()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$setBreakFrame$1");
            return true;
        }
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$setBreakFrame$1");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2126x2a10d118.C17763x43ffafc5 c17763x43ffafc5 = this.f515409e;
        android.view.ViewGroup.LayoutParams layoutParams = c17763x43ffafc5 != null ? c17763x43ffafc5.getLayoutParams() : null;
        if (layoutParams == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$setBreakFrame$1");
            return true;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        int width = view.getWidth() + rect.left;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLookbookPagAnimLogic", "onPreDraw, curW=" + view.getWidth() + ", targetW=" + width + ", rect=" + rect);
        if (layoutParams.width != width) {
            layoutParams.height = this.f515410f;
            layoutParams.width = view.getWidth() + rect.left;
            if (c17763x43ffafc5 != null) {
                c17763x43ffafc5.setLayoutParams(layoutParams);
            }
            if (c17763x43ffafc5 != null) {
                c17763x43ffafc5.setTranslationX(-rect.left);
            }
        }
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$setBreakFrame$1");
        return true;
    }
}
