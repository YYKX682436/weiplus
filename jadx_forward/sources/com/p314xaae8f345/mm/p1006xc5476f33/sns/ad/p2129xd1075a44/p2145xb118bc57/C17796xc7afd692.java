package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout */
/* loaded from: classes2.dex */
public class C17796xc7afd692 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f245108d;

    public C17796xc7afd692(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
        super.onLayout(z17, i17, i18, i19, i27);
        android.widget.FrameLayout frameLayout = this.f245108d;
        if (frameLayout != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getParentPaddingLeft", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            int i28 = 0;
            for (android.view.ViewParent parent = frameLayout.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                i28 += ((android.view.View) parent).getPaddingLeft();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParentPaddingLeft", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            android.widget.FrameLayout frameLayout2 = this.f245108d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getParentPaddingRight", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            int i29 = 0;
            for (android.view.ViewParent parent2 = frameLayout2.getParent(); parent2 instanceof android.view.View; parent2 = parent2.getParent()) {
                i29 += ((android.view.View) parent2).getPaddingRight();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getParentPaddingRight", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            int i37 = this.f245108d.getLayoutParams().height;
            if (i37 <= 0) {
                i37 = getHeight();
            }
            this.f245108d.layout(-i28, 0, getWidth() + i29, i37);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLinearLayout", "w=" + getWidth() + ",h=" + getHeight() + ", container.w=" + this.f245108d.getWidth() + ", container.h=" + this.f245108d.getHeight() + ", paddingLeft=" + i28 + ", paddingRight=" + i29);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
    }

    /* renamed from: setAdFullFrameContainer */
    public void m69585xfb3ae708(android.widget.FrameLayout frameLayout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdFullFrameContainer", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
        this.f245108d = frameLayout;
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(0, 0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdFullFrameContainer", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
    }

    public C17796xc7afd692(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
