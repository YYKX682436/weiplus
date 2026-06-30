package f64;

/* loaded from: classes4.dex */
public final class c extends g64.e {
    @Override // lc3.c0
    public java.lang.String f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        return "getAdPageDataSync";
    }

    @Override // g64.e
    public lc3.a0 s(lc3.a0 data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lc3.e eVar = this.f399423a;
        android.app.Activity B0 = eVar != null ? eVar.B0() : null;
        ab4.n0 A7 = B0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) B0).A7() : B0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18152x9f0f53c5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18152x9f0f53c5) B0).T6() : new m54.l();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(java.lang.Integer.valueOf(A7.l()), 0)));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(java.lang.Integer.valueOf(A7.l()), 0)));
        hashMap.put("originScene", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(A7.g()))));
        hashMap.put("uxinfo", a54.h.a(A7));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        java.lang.String str = A7.f84396f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUin", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData");
        if (str == null) {
            str = "";
        }
        hashMap.put("uin", str);
        hashMap.put("bizId", java.lang.Integer.valueOf(A7.d()));
        java.lang.String c17 = A7.c();
        if (c17 == null) {
            c17 = "";
        }
        hashMap.put("aid", c17);
        java.lang.String m17 = A7.m();
        if (m17 == null) {
            m17 = "";
        }
        hashMap.put("traceId", m17);
        hashMap.put("canvasId", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(A7.e())));
        java.lang.String p17 = A7.p();
        if (p17 == null) {
            p17 = "";
        }
        hashMap.put("viewId", p17);
        java.lang.String j17 = A7.j();
        if (j17 == null) {
            j17 = "";
        }
        hashMap.put("snsId", j17);
        java.lang.String j18 = A7.j();
        if (j18 == null) {
            j18 = "";
        }
        hashMap.put("rawSnsId", j18);
        java.lang.String f17 = A7.f();
        if (f17 == null) {
            f17 = "";
        }
        hashMap.put("commInfo", f17);
        java.lang.String a17 = A7.a();
        if (a17 == null) {
            a17 = "";
        }
        hashMap.put("adExtInfo", a17);
        java.lang.String i17 = A7.i();
        hashMap.put("pageId", i17 != null ? i17 : "");
        hashMap.put("isHalfScreenMode", java.lang.Boolean.valueOf(A7.s()));
        hashMap.put("isNativeAd", java.lang.Boolean.valueOf(A7.t()));
        lc3.a0 l17 = l(hashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetAdPageDataSync");
        return l17;
    }
}
