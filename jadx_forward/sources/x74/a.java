package x74;

/* loaded from: classes4.dex */
public final class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x74.b f533982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f533983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533984f;

    public a(x74.b bVar, android.view.View view, java.lang.String str) {
        this.f533982d = bVar;
        this.f533983e = view;
        this.f533984f = str;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$update$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setHasPreDrawListenerAdded$p", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        x74.b bVar = this.f533982d;
        bVar.f533990f = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setHasPreDrawListenerAdded$p", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        android.view.View view = this.f533983e;
        java.lang.String str = this.f533984f;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getItemRootWidth", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            bVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemRootWidth", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            android.view.ViewGroup viewGroup = bVar.f533986b;
            int width = viewGroup != null ? viewGroup.getWidth() : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemRootWidth", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getItemRootWidth", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getItemRootHeight", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemRootHeight", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            android.view.ViewGroup viewGroup2 = bVar.f533986b;
            int height = viewGroup2 != null ? viewGroup2.getHeight() : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemRootHeight", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getItemRootHeight", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PreviewHelper", "the root width is " + width + ", height is " + height);
            if (height > 0 && width > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setSnsId$p", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
                bVar.f533988d = str;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setSnsId$p", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
                x74.b.a(bVar, width, height);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PreviewHelper", "the water mark view has been calculated!!");
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$update$1");
        return true;
    }
}
