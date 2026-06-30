package a84;

/* loaded from: classes4.dex */
public abstract class v0 {
    public static final void a(android.content.Context context, android.view.View view, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scaleWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
            return;
        }
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
            return;
        }
        if (view.getLayoutParams() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
            return;
        }
        float b17 = i65.a.b(context, i17) * i65.a.q(context);
        float b18 = i65.a.b(context, i18) * i65.a.q(context);
        view.getLayoutParams().width = (int) b17;
        view.getLayoutParams().height = (int) b18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
    }

    public static final void b(android.widget.TextView textView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextWeight", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.graphics.Typeface create = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, i17, false);
            kotlin.jvm.internal.o.f(create, "create(...)");
            if (textView != null) {
                textView.setTypeface(create, 0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextWeight", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
    }
}
