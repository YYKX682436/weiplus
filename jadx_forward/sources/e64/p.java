package e64;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f331371a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f331372b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f331373c = jz5.h.b(e64.o.f331370d);

    public static final java.util.List a(android.app.Activity activity, java.lang.String mbCompId) {
        h64.a a17;
        java.util.Collection values;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        java.util.List list = null;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdMB", "getJsCompInfoInAdLandingMbComp: the activity is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            return null;
        }
        if (mbCompId == null || r26.n0.N(mbCompId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdMB", "getJsCompInfoInAdLandingMbComp: the magic component id is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            return null;
        }
        e64.e eVar = (e64.e) ((java.util.LinkedHashMap) f331371a).get(java.lang.Integer.valueOf(activity.hashCode()));
        if (eVar == null || (a17 = eVar.a()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdMB", "the ad landing page helper is null, can't obtain the js component inf ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getJsComponentInformation", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbCompId, "mbCompId");
        java.util.Map map = (java.util.Map) ((java.util.LinkedHashMap) a17.f360843c).get(mbCompId);
        if (map == null || (values = map.values()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LandingPageMagic", "there is no js component in magic brush component: [" + mbCompId + ']');
        } else {
            list = kz5.n0.S0(values);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJsComponentInformation", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getJsCompInfoInAdLandingMbComp", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        return list;
    }
}
