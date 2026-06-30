package g64;

/* loaded from: classes4.dex */
public final class c implements w44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g64.d f350722a;

    public c(g64.d dVar) {
        this.f350722a = dVar;
    }

    @Override // w44.a
    public final void a(java.lang.String event, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase$invoke$1$jsApiEnv$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lc3.e eVar = this.f350722a.f399423a;
        if (eVar instanceof hq0.i0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB.JsApi", "[" + event + "]: " + data);
            java.lang.String jSONObject = data.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            ((hq0.i0) eVar).N0(event, jSONObject);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase$invoke$1$jsApiEnv$2");
    }
}
