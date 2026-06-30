package k54;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final k54.s f385982a = new k54.s();

    public final java.lang.String a(java.lang.String str, m54.l lVar) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeUpUrlWithParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
        java.lang.String a17 = a54.h.a(lVar);
        if (!(a17.length() > 0) || r26.n0.D(str, "&uxinfo=", false, 2, null) || (str2 = ca4.z0.b(str, a17)) == null) {
            str2 = str;
        }
        if (!(str2.length() == 0)) {
            str = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeUpUrlWithParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
        return str;
    }

    public final void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, boolean z17) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInputOutOfKeyboardEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
        if (c22633x83752a59 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInputOutOfKeyboardEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.WebView", "setInputOutOfKeyboardEnable, settingWebViewKeyboard is " + z17);
            c22633x83752a59.mo120181x5e593bc7(z17);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("SnsAd.WebView", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInputOutOfKeyboardEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewFactory");
    }
}
