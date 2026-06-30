package ab4;

/* loaded from: classes4.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f2908a;

    /* renamed from: b, reason: collision with root package name */
    public float f2909b;

    /* renamed from: c, reason: collision with root package name */
    public float f2910c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f2911d;

    /* renamed from: e, reason: collision with root package name */
    public float f2912e;

    public static void a(android.view.View view, ab4.y0 y0Var, float f17) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleBgColorAndCornerWithAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        try {
            java.lang.String str = y0Var.f2908a;
            java.lang.String str2 = y0Var.f2911d;
            float f18 = y0Var.f2909b;
            float f19 = y0Var.f2910c;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || f18 <= 0.0f) {
                gradientDrawable = null;
            } else {
                try {
                    i18 = android.graphics.Color.parseColor(str);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("BorderCornerBgInfo", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    i18 = 0;
                }
                gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setStroke((int) f18, i18);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                try {
                    i17 = android.graphics.Color.parseColor(str2);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("BorderCornerBgInfo", com.tencent.mm.sdk.platformtools.z3.c(e18));
                    i17 = 0;
                }
                if (gradientDrawable == null) {
                    android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable = gradientDrawable2;
                }
                gradientDrawable.setColor(i17);
            }
            if (gradientDrawable != null) {
                gradientDrawable.setAlpha((int) (f17 * 255.0f));
            }
            if (gradientDrawable != null && f19 > 0.0f) {
                gradientDrawable.setCornerRadius(f19);
            }
            if (gradientDrawable != null) {
                view.setClipToOutline(true);
                view.setBackgroundDrawable(gradientDrawable);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("BorderCornerBgInfo", "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleBgColorAndCornerWithAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
    }

    public static ab4.y0 b(java.util.Map map, java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        ab4.y0 y0Var = new ab4.y0();
        java.lang.String str2 = (java.lang.String) map.get(str + ".borderColor");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        y0Var.f2908a = str2;
        y0Var.f2909b = za4.z0.o(com.tencent.mm.sdk.platformtools.t8.A1((java.lang.String) map.get(str + ".borderSize")), i17, i18, i19);
        y0Var.f2910c = za4.z0.o(com.tencent.mm.sdk.platformtools.t8.A1((java.lang.String) map.get(str + ".cornerRadius")), i17, i18, i19);
        java.lang.String str3 = (java.lang.String) map.get(str + ".bgColor");
        if (str3 == null) {
            str3 = "";
        }
        y0Var.f2911d = str3;
        if (map.containsKey(str + ".bgColorAlpha")) {
            java.lang.String str4 = (java.lang.String) map.get(str + ".bgColorAlpha");
            y0Var.f2912e = com.tencent.mm.sdk.platformtools.t8.B1(str4 != null ? str4 : "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        return y0Var;
    }
}
