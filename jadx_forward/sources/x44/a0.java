package x44;

/* loaded from: classes4.dex */
public final class a0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        jz5.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("canvasKey");
        if (optString == null || optString.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.DynamicCanvas", "the dynamic canvas key is empty!!!");
            b(g("the key is empty!!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvas");
            return;
        }
        m54.l b17 = env.b();
        java.lang.String h17 = b17.h();
        java.lang.String a17 = h17 == null || h17.length() == 0 ? "" : l64.a.a(b17.h());
        m54.j jVar = m54.j.f405815a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        m54.y c17 = jVar.c(optString);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScreenSize", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvas");
        android.graphics.Point h18 = com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        try {
            lVar = new jz5.l(java.lang.Integer.valueOf(h18.x), java.lang.Integer.valueOf(h18.y));
        } catch (java.lang.Throwable unused) {
            lVar = new jz5.l(0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScreenSize", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvas");
        if (m54.j.h(c17)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("dynamicCanvas", c17.a());
            jSONObject.put("dynamicInfo", b17.D());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicCanvasExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            java.lang.String str = b17.F;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicCanvasExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            jSONObject.put("dynamicExtInfo", str != null ? str : "");
            jSONObject.put("adType", b17.C());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOutIndex", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            int i17 = b17.D;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOutIndex", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            jSONObject.put("outIndex", i17);
            jSONObject.put("canvasKey", b17.F());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecSrc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            int i18 = b17.C;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecSrc", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            jSONObject.put("isRecSrc", i18 == 2);
            jSONObject.put("openAudio", b17.t());
            jSONObject.put("aid", b17.c());
            jSONObject.put("traceId", b17.m());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOriginSource", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            int g17 = b17.g();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOriginSource", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            jSONObject.put("originSource", g17);
            jSONObject.put(ya.b.f77502x92235c1b, b17.l());
            jSONObject.put("uxInfo", a54.h.a(b17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            java.lang.String str2 = b17.f84396f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            jSONObject.put("uin", str2);
            jSONObject.put("pId", ca4.m0.L(a54.h.a(b17)));
            jSONObject.put("commonDeviceInfo", v34.b.b());
            jSONObject.put("screenWidth", ((java.lang.Number) lVar.f384366d).intValue());
            jSONObject.put("screenHeight", ((java.lang.Number) lVar.f384367e).intValue());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            long j17 = b17.f84408r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdSightVideoSeekTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
            jSONObject.put("outPlaybackTime", j17);
            jSONObject.put("bizAppId", a17);
            if (b17.E() == 1) {
                jSONObject.put("halfScreenMode", false);
                jSONObject.put("halfScreenPageHeight", 0);
            } else {
                jSONObject.put("halfScreenMode", b17.s());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                int i19 = b17.B;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
                jSONObject.put("halfScreenPageHeight", i19);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getForbidBackToBizApp", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            boolean z18 = b17.O;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getForbidBackToBizApp", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageParameter");
            jSONObject.put("forbidBackToBizApp", z18);
            m(jSONObject);
            b(jSONObject);
        } else {
            b(w44.d.k(this, -1, "there is no page data", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetDynamicCanvas");
    }
}
