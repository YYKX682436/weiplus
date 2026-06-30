package g64;

/* loaded from: classes4.dex */
public abstract class d extends lc3.b0 {
    @Override // lc3.b0
    public void t(lc3.a0 data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB.JsApi", "the async jsapi " + f() + " is called");
        java.util.Map map = w44.c.f524429a;
        java.lang.String name = f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jsApi", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.NamedJsApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        w44.d dVar = (w44.d) ((java.util.LinkedHashMap) w44.c.f524429a).get(name);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jsApi", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.NamedJsApi");
        jz5.f0 f0Var = null;
        if (dVar != null) {
            lc3.e eVar = this.f399423a;
            dVar.e(new w44.b(eVar != null ? eVar.B0() : null, new m54.l(), true, new g64.b(this), new g64.c(this)), data);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB.JsApi", "the async jsapi need activity");
            lc3.e eVar2 = this.f399423a;
            if (eVar2 == null || eVar2.B0() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdMB.JsApi", "the async jsapi need activity, but the activity is null");
                u(j(lc3.x.f399470d, "the activity is null, please check it!"));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
                return;
            }
            try {
                v(data);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdMB.JsApi", "there is something exception: " + th6.getMessage());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getERROR_EXCEPTION", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBErrorCodeSnsAd");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getERROR_EXCEPTION", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBErrorCodeSnsAd");
                u(j(g64.a.f350720a, "there is something exception: " + th6.getMessage()));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB.JsApi", "the async jsapi " + f() + " end");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
    }

    public final void u(lc3.a0 data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            s().mo146xb9724478(data);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdMB.JsApi", "call back to js has an exception, " + th6.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
    }

    public void v(lc3.a0 data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
    }
}
