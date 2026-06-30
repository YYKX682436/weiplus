package x44;

/* loaded from: classes4.dex */
public final class i extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        data.optInt("reasonCode");
        data.optString("reasonMsg");
        java.lang.String F = env.b().F();
        android.app.Activity a17 = env.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.Downgrade", "the activity is null in downgrade method!!");
            b(g("the activity is null!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 10);
        env.b().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDowngradeCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDowngradeCode", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        env.b().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDowngradeMsg", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDowngradeMsg", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
        if (m54.c0.f405783a.a(a17, F, env.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.Downgrade", "the downgrade has been handled");
            b(l());
            a17.finish();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
            return;
        }
        m54.y c17 = m54.j.f405815a.c(F);
        java.lang.String b17 = c17.b();
        boolean z17 = false;
        if (b17 == null || b17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.Downgrade", "the old canvas data is empty, don't jump!!!");
            b(w44.d.k(this, -1, "the old canvas xml is empty", null, 4, null));
            a17.finish();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
            return;
        }
        if (!za4.z0.u(c17.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.Downgrade", "the old canvas xml is invalid, don't jump!!!");
            b(w44.d.k(this, -1, "the canvas xml is invalid!", null, 4, null));
            a17.finish();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
            return;
        }
        m54.l b18 = env.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeIntent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_landig_pages_from_source", b18.l());
        intent.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18.k())) {
            intent.putExtra("sns_landing_pages_share_sns_id", b18.k());
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18.i())) {
            intent.putExtra("sns_landing_pages_pageid", b18.i());
        }
        intent.putExtra("sns_landing_is_native_sight_ad", b18.t());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18.B())) {
            intent.putExtra("sns_landing_pages_ad_info", b18.B());
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a54.h.a(b18))) {
            intent.putExtra("sns_landing_pages_ux_info", a54.h.a(b18));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18.j())) {
            intent.putExtra("sns_landing_pages_rawSnsId", b18.j());
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18.c())) {
            intent.putExtra("sns_landing_pages_aid", b18.c());
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18.m())) {
            intent.putExtra("sns_landing_pages_traceid", b18.m());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeIntent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
        android.app.Activity a18 = env.a();
        java.lang.String b19 = c17.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
        a54.g.b(a18, intent, b19);
        intent.putExtra("sns_landing_pages_xml", b19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preCheckIsXmlOverSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        if (b19 != null && b19.length() >= 102400) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preCheckIsXmlOverSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        if (z17) {
            java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.h(b19);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                intent.putExtra("sns_landing_pages_xml", "");
                intent.putExtra("sns_landing_pages_too_large_xml_path", h17);
            }
        }
        a84.d0.e(a18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toOnetimeCanvas", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
        b(l());
        a17.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.Downgrade");
    }
}
