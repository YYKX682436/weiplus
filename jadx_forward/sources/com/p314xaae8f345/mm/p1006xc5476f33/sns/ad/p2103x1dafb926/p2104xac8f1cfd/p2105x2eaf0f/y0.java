package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class y0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f244518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1 f244519e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1 f1Var, android.view.View view) {
        this.f244519e = f1Var;
        this.f244518d = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int height;
        int width;
        int width2;
        int height2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f1 f1Var = this.f244519e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
        try {
            height = view.getHeight();
            width = view.getWidth();
            width2 = f1Var.f244339z.getWidth();
            height2 = f1Var.f244339z.getHeight();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onLayoutChange, exp=" + e17.toString());
        }
        if (width > 1 && height > 1 && width2 != 0 && height2 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onLayoutChange, video.w=" + view.getWidth() + ", h=" + view.getHeight() + ", container.w=" + width2 + ", h=" + height2 + ", container.padding=" + ca4.m0.K(f1Var.f244339z));
            android.widget.ImageView m69396x4eb0f6e5 = f1Var.A.m69396x4eb0f6e5();
            if (m69396x4eb0f6e5 != null) {
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(width, height);
                layoutParams.addRule(13);
                m69396x4eb0f6e5.setLayoutParams(layoutParams);
            }
            android.view.View view2 = this.f244518d;
            if (height == height2) {
                view2.removeOnLayoutChangeListener(this);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
                return;
            }
            if (height >= width && height2 >= width2 && java.lang.Math.abs(height - height2) <= 2) {
                android.view.ViewGroup.LayoutParams layoutParams2 = f1Var.f244339z.getLayoutParams();
                layoutParams2.height = height;
                f1Var.f244339z.setLayoutParams(layoutParams2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingGeneralVideoComponent", "onLayoutChange, reset VideoContainer.height");
            }
            view2.removeOnLayoutChangeListener(this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChange", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingGeneralVideoComponent$4");
    }
}
