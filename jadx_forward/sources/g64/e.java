package g64;

/* loaded from: classes4.dex */
public abstract class e extends lc3.d0 {
    @Override // lc3.d0
    public final lc3.a0 r(lc3.a0 data) {
        lc3.a0 i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB.JsApi", "the jsapi " + f() + " is called");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        lc3.e eVar = this.f399423a;
        if (eVar == null || eVar.B0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdMB.JsApi", "the activity is null");
            lc3.a0 i18 = i(lc3.x.f399470d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
            return i18;
        }
        try {
            i17 = s(data);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB.JsApi", "the jsapi " + f() + " end, result is " + i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB.JsApi", "there is something exception: " + e17.getMessage());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getERROR_EXCEPTION", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBErrorCodeSnsAd");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getERROR_EXCEPTION", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBErrorCodeSnsAd");
            i17 = i(g64.a.f350720a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        return i17;
    }

    public abstract lc3.a0 s(lc3.a0 a0Var);
}
