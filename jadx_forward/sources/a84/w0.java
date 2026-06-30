package a84;

/* loaded from: classes4.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a84.w0 f83904a = new a84.w0();

    public final void a(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportInternal", "com.tencent.mm.plugin.sns.ad.utils.UIInfoReporter");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInternal", "com.tencent.mm.plugin.sns.ad.utils.UIInfoReporter");
            return;
        }
        float f17 = context.getResources().getDisplayMetrics().density;
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        ca4.e0.b("ad_common_ui_info_report", "0", 0, 0, "screenWidth=" + windowManager.getDefaultDisplay().getWidth() + "|screenHeight=" + windowManager.getDefaultDisplay().getHeight() + "|density=" + f17 + "|textScaleSize=" + i65.a.q(context) + "|isDark=" + com.p314xaae8f345.mm.ui.bk.C());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInternal", "com.tencent.mm.plugin.sns.ad.utils.UIInfoReporter");
    }
}
