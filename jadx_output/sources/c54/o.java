package c54;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final c54.o f38714a = new c54.o();

    /* renamed from: b, reason: collision with root package name */
    public static float f38715b = 1.0f;

    public final void a(android.widget.FrameLayout frameLayout, android.view.View child, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fitCenterChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        kotlin.jvm.internal.o.g(frameLayout, "<this>");
        kotlin.jvm.internal.o.g(child, "child");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.UIUtils", "fitCenterChild, exp=" + th6);
        }
        if (!kotlin.jvm.internal.o.b(child.getParent(), frameLayout)) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.UIUtils", "fitCenterChild, child.parent != container");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fitCenterChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            return;
        }
        if (!(f17 == 0.0f) && frameLayout.getLayoutParams().width != 0 && frameLayout.getLayoutParams().height != 0) {
            if (f17 < (frameLayout.getLayoutParams().width * 1.0f) / frameLayout.getLayoutParams().height) {
                int i17 = (int) (f17 * frameLayout.getLayoutParams().height);
                int i18 = (frameLayout.getLayoutParams().width - i17) / 2;
                android.view.ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = i17;
                layoutParams2.height = frameLayout.getLayoutParams().height;
                layoutParams2.leftMargin = i18;
                layoutParams2.gravity = 3;
            } else {
                int i19 = (int) (frameLayout.getLayoutParams().width / f17);
                int i27 = (frameLayout.getLayoutParams().height - i19) / 2;
                android.view.ViewGroup.LayoutParams layoutParams3 = child.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.width = frameLayout.getLayoutParams().width;
                layoutParams4.height = i19;
                layoutParams4.topMargin = i27;
                layoutParams4.gravity = 48;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fitCenterChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            return;
        }
        com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.UIUtils", "fitCenterChild, err size, ratio=" + f17 + ", w=" + frameLayout.getLayoutParams().width + ", h=" + frameLayout.getLayoutParams() + ".height}");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fitCenterChild", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
    }

    public final int b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        int i17 = (int) (f17 * f38715b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        return i17;
    }

    public final void c(android.view.View view, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeBottomMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        kotlin.jvm.internal.o.g(view, "<this>");
        int b17 = b(f17);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeBottomMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
    }

    public final void d(android.widget.TextView textView, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeFontSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        kotlin.jvm.internal.o.g(textView, "<this>");
        textView.setTextSize(0, b(f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeFontSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
    }

    public final void e(android.view.View view, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        kotlin.jvm.internal.o.g(view, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            c54.o oVar = f38714a;
            if (f17 >= 0.0f) {
                layoutParams.width = oVar.b(f17);
            }
            if (f18 >= 0.0f) {
                layoutParams.height = oVar.b(f18);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
    }

    public final void f(android.view.View view, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        kotlin.jvm.internal.o.g(view, "<this>");
        int b17 = b(f17);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
    }
}
