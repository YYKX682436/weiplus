package a84;

/* loaded from: classes4.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f2349a;

    static {
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
        kotlin.jvm.internal.o.f(synchronizedSet, "synchronizedSet(...)");
        f2349a = synchronizedSet;
    }

    public static final void a(android.content.Context context, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, android.widget.TextView textView, int i17, int i18) {
        int b17;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
            return;
        }
        if (aDInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
            return;
        }
        if (textView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
            return;
        }
        com.tencent.mm.plugin.sns.storage.i0 i0Var = aDInfo.adChainExtInfo;
        if (i0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
            return;
        }
        java.lang.String str2 = aDInfo.adActionExtTailLink;
        int i19 = 0;
        boolean z17 = str2 == null || str2.length() == 0;
        if (z17) {
            textView.setOnClickListener(null);
        }
        int i27 = z17 ? com.tencent.mm.R.color.FG_2 : com.tencent.mm.R.color.f479515a62;
        textView.setTextColor(context.getColor(i27));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdChainTextColor", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        java.lang.String str3 = i0Var.f166019c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdChainTextColor", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        if (str3.length() > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdChainTextColorDark", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            java.lang.String str4 = i0Var.f166020d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdChainTextColorDark", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            if (str4.length() > 0) {
                if (com.tencent.mm.ui.bk.C()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdChainTextColorDark", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
                    str = i0Var.f166020d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdChainTextColorDark", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdChainTextColor", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
                    str = i0Var.f166019c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdChainTextColor", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
                }
                textView.setTextColor(ca4.n0.e(str, context.getColor(i27)));
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdChainTopMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        int i28 = i0Var.f166017a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdChainTopMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        if (i28 > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdChainTopMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            int i29 = i0Var.f166017a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdChainTopMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            b17 = i65.a.b(context, i29);
        } else {
            b17 = i65.a.b(context, i17);
        }
        marginLayoutParams.topMargin = b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdChainBottomMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        int i37 = i0Var.f166018b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdChainBottomMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
        if (i37 > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdChainBottomMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            int i38 = i0Var.f166018b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdChainBottomMargin", "com.tencent.mm.plugin.sns.storage.AdChainExtInfo");
            i19 = i65.a.b(context, i38 - i18);
        }
        marginLayoutParams.bottomMargin = i19;
        textView.setLayoutParams(marginLayoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdChainUI", "com.tencent.mm.plugin.sns.ad.utils.SnsAdChainHelper");
    }
}
