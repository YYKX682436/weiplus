package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes3.dex */
public final class z1 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f253194a;

    public z1(int i17) {
        this.f253194a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOutline", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView$RoundCornerOutlineProvider");
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view != null ? view.getMeasuredWidth() : 0.0f, view != null ? view.getMeasuredHeight() : 0.0f);
        int i17 = android.os.Build.VERSION.SDK_INT;
        int i18 = this.f253194a;
        if (i17 >= 32) {
            if (outline != null) {
                outline.setPath(com.p314xaae8f345.mm.ui.dl.c(rectF, i18, i18, i18, i18, 0.6f));
            }
        } else if (outline != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF.roundOut(rect);
            outline.setRoundRect(rect, i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOutline", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView$RoundCornerOutlineProvider");
    }
}
