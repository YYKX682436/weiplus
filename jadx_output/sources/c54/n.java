package c54;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final c54.n f38713a = new c54.n();

    public final void a(c54.k kVar, f54.r cardInfo, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustLayoutByCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        kotlin.jvm.internal.o.g(cardInfo, "cardInfo");
        if (kVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustLayoutByCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
            return;
        }
        if (cardInfo.d()) {
            android.widget.LinearLayout c17 = kVar.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i17 = (int) (32.0f * c54.o.f38715b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            android.view.ViewGroup.LayoutParams layoutParams = c17.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        } else if (z17) {
            android.widget.LinearLayout c18 = kVar.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i18 = (int) (32.0f * c54.o.f38715b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            android.view.ViewGroup.LayoutParams layoutParams2 = c18.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        } else {
            android.widget.LinearLayout c19 = kVar.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i19 = (int) (60.0f * c54.o.f38715b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            android.view.ViewGroup.LayoutParams layoutParams3 = c19.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).topMargin = i19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("relativeTopMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustLayoutByCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
    }

    public final android.widget.TextView b(android.content.Context context, java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createTextView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        int s17 = ca4.m0.s(24);
        android.widget.TextView textView = new android.widget.TextView(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = ca4.m0.s(i18);
        layoutParams.leftMargin = s17;
        layoutParams.rightMargin = s17;
        textView.setLayoutParams(layoutParams);
        ca4.m0.x0(textView, i17);
        textView.setTextColor(android.graphics.Color.parseColor(str));
        textView.setSingleLine(true);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createTextView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        return textView;
    }

    public final android.widget.TextView c(android.content.Context context, java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createTextViewWithBottomMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        int s17 = ca4.m0.s(24);
        android.widget.TextView textView = new android.widget.TextView(context);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = ca4.m0.s(i18);
        layoutParams.leftMargin = s17;
        layoutParams.rightMargin = s17;
        textView.setLayoutParams(layoutParams);
        ca4.m0.x0(textView, i17);
        textView.setTextColor(android.graphics.Color.parseColor(str));
        textView.setSingleLine(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createTextViewWithBottomMargin", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder");
        return textView;
    }
}
