package a84;

/* loaded from: classes4.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a84.w0 f2371a = new a84.w0();

    public final void a(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportInternal", "com.tencent.mm.plugin.sns.ad.utils.UIInfoReporter");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInternal", "com.tencent.mm.plugin.sns.ad.utils.UIInfoReporter");
            return;
        }
        float f17 = context.getResources().getDisplayMetrics().density;
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        ca4.e0.b("ad_common_ui_info_report", "0", 0, 0, "screenWidth=" + windowManager.getDefaultDisplay().getWidth() + "|screenHeight=" + windowManager.getDefaultDisplay().getHeight() + "|density=" + f17 + "|textScaleSize=" + i65.a.q(context) + "|isDark=" + com.tencent.mm.ui.bk.C());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportInternal", "com.tencent.mm.plugin.sns.ad.utils.UIInfoReporter");
    }
}
