package eb4;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final eb4.s f332449a = new eb4.s();

    public static final void a(java.lang.String str, yz5.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sns_ad_landing_page_key");
        if (M == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        boolean z17 = M.getBoolean("canAutoFillData", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RequestGeoLocationHelper", "getCanAutoFillData() called " + z17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", "0");
        hashMap.put("status", z17 ? "true" : "false");
        if (qVar != null) {
            qVar.mo147xb9724478(str, "ok", hashMap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }

    public static final void c(java.lang.String str, java.lang.String str2, android.content.Context context, boolean z17, boolean z18, yz5.a aVar, yz5.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sns_ad_landing_page_key");
        if (M == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        if (M.getBoolean("canRequestLBS", false)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            eb4.s sVar = f332449a;
            ab4.n0 b17 = sVar.b(context);
            java.lang.String k17 = b17 != null ? b17.k() : null;
            if (k17 == null) {
                k17 = "";
            }
            jSONObject.put("snsid", k17);
            java.lang.String o17 = b17 != null ? b17.o() : null;
            jSONObject.put("uxinfo", o17 != null ? o17 : "");
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, b17 != null ? b17.l() : 0);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "ad");
            jSONObject2.put("status", "ok");
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("location_ad_auth_report", jSONObject3);
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            sVar.d(str, str2, context, z18, qVar);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLBSAuthDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0);
            z2Var.m(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            z2Var.o(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            eb4.q qVar2 = new eb4.q(qVar, str, z2Var);
            eb4.r rVar = new eb4.r(aVar, str, str2, context, z18, qVar, z2Var);
            eb4.n nVar = new eb4.n(z17, qVar2, c0Var, z2Var);
            eb4.o oVar = new eb4.o(z17, rVar, c0Var, z2Var);
            z2Var.D = nVar;
            z2Var.E = oVar;
            if (z17) {
                z2Var.l(new eb4.p(c0Var, rVar, qVar2));
            }
            z2Var.j(com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571022cp5, (android.view.ViewGroup) null));
            z2Var.C();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLBSAuthDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestGeoLocation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }

    public static final void e(java.lang.String str, java.lang.String str2, yz5.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "true");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sns_ad_landing_page_key");
        if (M == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
            return;
        }
        M.putBoolean("canAutoFillData", b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RequestGeoLocationHelper", "setCanAutoFillData() called " + b17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", "0");
        if (qVar != null) {
            qVar.mo147xb9724478(str2, "ok", hashMap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCanAutoFillData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }

    public final ab4.n0 b(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        ab4.n0 A7 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) context).A7() : context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18152x9f0f53c5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18152x9f0f53c5) context).T6() : new ab4.n0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLandingPageData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        return A7;
    }

    public final void d(java.lang.String str, java.lang.String str2, android.content.Context context, boolean z17, yz5.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestSystemLbs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        eb4.m mVar = new eb4.m(str, qVar, context, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        r54.d dVar = null;
        if (context != null) {
            try {
                dVar = new r54.d(context, mVar);
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        }
        if (dVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = dVar.f474266c;
            java.lang.Runnable runnable = dVar.f474269f;
            try {
                n3Var.mo50300x3fa464aa(runnable);
                n3Var.mo50297x7c4d7ca2(runnable, 20000L);
                dVar.f474268e = str2;
                if (dVar.e()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                    if (str2 == null) {
                        str2 = "";
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69843x7d3b226(str2, dVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
                }
            } catch (java.lang.Throwable unused2) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoClientRequester");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestSystemLbs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
    }
}
