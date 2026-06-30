package k84;

/* loaded from: classes3.dex */
public final class b3 extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOutline", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$1");
        float a17 = a84.d0.a(4);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view != null ? view.getMeasuredWidth() : 0.0f, (view != null ? view.getMeasuredHeight() : 0.0f) + a17);
        if (outline != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF.roundOut(rect);
            outline.setRoundRect(rect, a17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOutline", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$setLikedAttitudeView$1");
    }
}
