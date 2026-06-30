package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public abstract class a extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 {
    public a(android.content.Context context, ab4.d dVar, android.view.ViewGroup viewGroup) {
        super(context, dVar, viewGroup);
    }

    public void O(android.widget.LinearLayout linearLayout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingBorderedComp");
        ab4.d dVar = (ab4.d) this.f246583e;
        if (linearLayout == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingBorderedComp");
            return;
        }
        double d17 = dVar.F;
        double d18 = dVar.G;
        int compare = java.lang.Double.compare(d17, d18);
        double d19 = dVar.F;
        int i17 = (int) d19;
        int i18 = (int) d18;
        if (compare != 0) {
            if (i17 == 0 && d19 != 0.0d) {
                i17 = 1;
            }
            if (i18 == 0 && d18 != 0.0d) {
                i18 = 1;
            }
        } else if (i17 == 0) {
            i17 = 1;
            i18 = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingBorderedComp", "border width top %d,bottom %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = dVar.H;
        if (i17 > 0) {
            android.view.View linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
            linearLayout2.setBackgroundColor(i19);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i17);
            layoutParams.gravity = 48;
            linearLayout.addView(linearLayout2, 0, layoutParams);
        }
        if (i18 > 0) {
            android.view.View linearLayout3 = new android.widget.LinearLayout(linearLayout.getContext());
            linearLayout3.setBackgroundColor(i19);
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, i18);
            layoutParams2.gravity = 80;
            linearLayout.addView(linearLayout3, layoutParams2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addBorder", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingBorderedComp");
    }
}
