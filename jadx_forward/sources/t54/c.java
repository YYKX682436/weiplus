package t54;

/* loaded from: classes4.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final t54.c f497378d = new t54.c();

    public c() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
        android.os.Parcelable obj2 = (android.os.Parcelable) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj2, "obj");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PreloadSnsAdHelper", th6, " processPreload error", new java.lang.Object[0]);
        }
        if (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2112xed046e09.C17746x3d28c237) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getXml", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getXml", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2112xed046e09.C17746x3d28c237) obj2).f244689d;
            if (str == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
                jz5.f0 f0Var = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
                return f0Var;
            }
            t54.d dVar = t54.d.f497379a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = t54.d.f497380b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            if (r2Var.k(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                java.lang.Object obj3 = r2Var.get(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                a17 = ((java.lang.Boolean) obj3).booleanValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreloadSnsAdHelper", "already checked! " + a17);
            } else {
                a17 = t54.d.a(t54.d.f497379a, str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            r2Var.put(str, java.lang.Boolean.valueOf(a17));
            if (a17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0.e0();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
        return f0Var2;
    }
}
