package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8;

/* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView */
/* loaded from: classes13.dex */
public class C18380xc0117007 extends android.widget.GridView {
    public C18380xc0117007(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void invalidate() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invalidate", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
        super.invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invalidate", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
        if (getLayoutParams().height == -2) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
    }

    @Override // android.widget.AbsListView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestLayout", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
        super.requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestLayout", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
    }

    public C18380xc0117007(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
