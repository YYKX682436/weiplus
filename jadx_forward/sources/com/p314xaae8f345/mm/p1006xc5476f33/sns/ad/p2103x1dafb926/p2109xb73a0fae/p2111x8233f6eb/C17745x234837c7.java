package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2111x8233f6eb;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper */
/* loaded from: classes4.dex */
public final class C17745x234837c7 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2111x8233f6eb.AbstractC17744x50e8acb<f54.m, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.t0> {

    /* renamed from: h, reason: collision with root package name */
    public int f244688h;

    public C17745x234837c7(f54.m mVar, android.view.ViewGroup viewGroup) {
        super(mVar, viewGroup);
        this.f244688h = -1;
    }

    public static int d(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSysNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
            if (identifier > 0) {
                int dimensionPixelSize = android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSysNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                return dimensionPixelSize;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FloatJumpCompHelper", "getSysNavigationBarHeight, exp=" + th6.toString());
        }
        int b17 = i65.a.b(context, 30);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSysNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return b17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2111x8233f6eb.AbstractC17744x50e8acb
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a(android.content.Context context, ab4.d0 d0Var, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        f54.m mVar = (f54.m) d0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        if (context != null && mVar != null) {
            int i17 = mVar.H;
            if (i17 <= 0) {
                i17 = 130;
            }
            this.f244688h = i65.a.b(context, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.t0(context, mVar, viewGroup, this.f244688h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return t0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2111x8233f6eb.AbstractC17744x50e8acb
    public void b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FloatJumpCompHelper", "prepareContentViewLayoutParams");
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 81;
                layoutParams2.bottomMargin += c();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
    }

    public final int c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            android.content.Context context = this.f244687g;
            if (context != null) {
                if (f(context)) {
                    int d17 = d(context);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                    return d17;
                }
                int b17 = i65.a.b(context, 12);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                return b17;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FloatJumpCompHelper", "the getNavigationBarHeight has something wrong!!, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return 0;
    }

    public void e(int i17) {
        android.view.View x17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBottomFixedMargin", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var = this.f244685e;
            if (a2Var != null && (x17 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.t0) a2Var).x()) != null) {
                android.view.ViewGroup.LayoutParams layoutParams = x17.getLayoutParams();
                if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                    if (layoutParams2.bottomMargin != i17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FloatJumpCompHelper", "setBottomFixedMargin, margin=" + i17);
                        layoutParams2.bottomMargin = i17;
                        x17.setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FloatJumpCompHelper", "setBottomFixedMargin, e=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBottomFixedMargin", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
    }

    public final boolean f(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
            return false;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int max = java.lang.Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int min = java.lang.Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
        if (min == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.FloatJumpCompHelper", "the width is zero!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
            return true;
        }
        boolean z17 = java.lang.Float.compare(((float) max) / ((float) min), 1.7777778f) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return z17;
    }
}
