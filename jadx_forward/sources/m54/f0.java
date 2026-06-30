package m54;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.f0 f405799a = new m54.f0();

    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 a(android.app.Activity activity) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newKeyboardHeightProvider", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghKeyboardHeightHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        m54.h0 h0Var = new m54.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newKeyboardHeightProvider", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghKeyboardHeightHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("supportVangoghKeyboardHeight", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("supportVangoghKeyboardHeight", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        } else {
            int Ni = ((h62.d) e0Var).Ni(e42.c0.clicfg_sns_ad_vangogh_page_support_keyboard_height_provider, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicCanvas", "Vangogh page keyboard height provider: the switch value is " + Ni);
            r6 = Ni > 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("supportVangoghKeyboardHeight", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        }
        if (r6) {
            android.view.Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(48);
            }
            f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(activity);
            f5Var.f291933e = h0Var;
        } else {
            f5Var = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newKeyboardHeightProvider", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghKeyboardHeightHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newKeyboardHeightProvider", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghKeyboardHeightHelper");
        return f5Var;
    }
}
