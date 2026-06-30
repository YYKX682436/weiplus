package ab4;

/* loaded from: classes4.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f84441a;

    /* renamed from: b, reason: collision with root package name */
    public float f84442b;

    /* renamed from: c, reason: collision with root package name */
    public float f84443c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f84444d;

    /* renamed from: e, reason: collision with root package name */
    public float f84445e;

    public static void a(android.view.View view, ab4.y0 y0Var, float f17) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleBgColorAndCornerWithAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        try {
            java.lang.String str = y0Var.f84441a;
            java.lang.String str2 = y0Var.f84444d;
            float f18 = y0Var.f84442b;
            float f19 = y0Var.f84443c;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || f18 <= 0.0f) {
                gradientDrawable = null;
            } else {
                try {
                    i18 = android.graphics.Color.parseColor(str);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BorderCornerBgInfo", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    i18 = 0;
                }
                gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setStroke((int) f18, i18);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                try {
                    i17 = android.graphics.Color.parseColor(str2);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BorderCornerBgInfo", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BorderCornerBgInfo", "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleBgColorAndCornerWithAlpha", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
    }

    public static ab4.y0 b(java.util.Map map, java.lang.String str, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        ab4.y0 y0Var = new ab4.y0();
        java.lang.String str2 = (java.lang.String) map.get(str + ".borderColor");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        y0Var.f84441a = str2;
        y0Var.f84442b = za4.z0.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str + ".borderSize")), i17, i18, i19);
        y0Var.f84443c = za4.z0.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str + ".cornerRadius")), i17, i18, i19);
        java.lang.String str3 = (java.lang.String) map.get(str + ".bgColor");
        if (str3 == null) {
            str3 = "";
        }
        y0Var.f84444d = str3;
        if (map.containsKey(str + ".bgColorAlpha")) {
            java.lang.String str4 = (java.lang.String) map.get(str + ".bgColorAlpha");
            y0Var.f84445e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1(str4 != null ? str4 : "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.BorderCornerBgInfo");
        return y0Var;
    }
}
