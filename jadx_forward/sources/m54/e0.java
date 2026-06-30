package m54;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.e0 f405797a = new m54.e0();

    public final void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 webView, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWebViewInputKeyboard", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("supportSettingWebViewInput", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        int u07 = ca4.m0.u0(e42.c0.clicfg_sns_ad_vangogh_webview_keyboard, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicCanvas", "setting webview input method value is " + u07);
        boolean z17 = u07 > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("supportSettingWebViewInput", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasSwitch");
        if (z17) {
            java.lang.Object obj = map != null ? map.get("settingWebViewKeyboard") : null;
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            webView.mo120181x5e593bc7(bool != null ? bool.booleanValue() : false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWebViewInputKeyboard", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghIdUtil");
    }
}
