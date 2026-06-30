package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView */
/* loaded from: classes12.dex */
public class C17920x4ea080ae extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 {
    public C17920x4ea080ae(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generatePageControl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView");
        removeAllViews();
        int i18 = this.f279047e;
        if (i17 >= i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generatePageControl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView");
            return;
        }
        for (int i19 = 0; i19 < i18; i19++) {
            this.f279049g = null;
            java.util.Map map = this.f279048f;
            if (i17 == i19) {
                if (((java.util.HashMap) map).size() > i19) {
                    this.f279049g = (android.widget.ImageView) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i19));
                }
                if (this.f279049g == null) {
                    this.f279049g = (android.widget.ImageView) android.view.View.inflate(this.f279046d, this.f279050h, null).findViewById(com.p314xaae8f345.mm.R.id.jmn);
                    ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i19), this.f279049g);
                }
                this.f279049g.setSelected(true);
            } else {
                if (((java.util.HashMap) map).size() > i19) {
                    this.f279049g = (android.widget.ImageView) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i19));
                }
                if (this.f279049g == null) {
                    this.f279049g = (android.widget.ImageView) android.view.View.inflate(this.f279046d, this.f279050h, null).findViewById(com.p314xaae8f345.mm.R.id.jmn);
                    ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i19), this.f279049g);
                }
                this.f279049g.setSelected(false);
            }
            addView(this.f279049g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generatePageControl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView");
    }
}
