package c54;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final c54.o f120247a = new c54.o();

    /* renamed from: b, reason: collision with root package name */
    public static float f120248b = 1.0f;

    public final void a(android.widget.FrameLayout frameLayout, android.view.View child, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fitCenterChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfEggCard.UIUtils", "fitCenterChild, exp=" + th6);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(child.getParent(), frameLayout)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfEggCard.UIUtils", "fitCenterChild, child.parent != container");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fitCenterChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            return;
        }
        if (!(f17 == 0.0f) && frameLayout.getLayoutParams().width != 0 && frameLayout.getLayoutParams().height != 0) {
            if (f17 < (frameLayout.getLayoutParams().width * 1.0f) / frameLayout.getLayoutParams().height) {
                int i17 = (int) (f17 * frameLayout.getLayoutParams().height);
                int i18 = (frameLayout.getLayoutParams().width - i17) / 2;
                android.view.ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = i17;
                layoutParams2.height = frameLayout.getLayoutParams().height;
                layoutParams2.leftMargin = i18;
                layoutParams2.gravity = 3;
            } else {
                int i19 = (int) (frameLayout.getLayoutParams().width / f17);
                int i27 = (frameLayout.getLayoutParams().height - i19) / 2;
                android.view.ViewGroup.LayoutParams layoutParams3 = child.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.width = frameLayout.getLayoutParams().width;
                layoutParams4.height = i19;
                layoutParams4.topMargin = i27;
                layoutParams4.gravity = 48;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fitCenterChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfEggCard.UIUtils", "fitCenterChild, err size, ratio=" + f17 + ", w=" + frameLayout.getLayoutParams().width + ", h=" + frameLayout.getLayoutParams() + ".height}");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fitCenterChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
    }

    public final int b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        int i17 = (int) (f17 * f120248b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        return i17;
    }

    public final void c(android.view.View view, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relativeBottomMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int b17 = b(f17);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relativeBottomMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
    }

    public final void d(android.widget.TextView textView, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relativeFontSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        textView.setTextSize(0, b(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relativeFontSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
    }

    public final void e(android.view.View view, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relativeLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            c54.o oVar = f120247a;
            if (f17 >= 0.0f) {
                layoutParams.width = oVar.b(f17);
            }
            if (f18 >= 0.0f) {
                layoutParams.height = oVar.b(f18);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relativeLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
    }

    public final void f(android.view.View view, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int b17 = b(f17);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
    }
}
