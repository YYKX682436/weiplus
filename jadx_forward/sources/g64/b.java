package g64;

/* loaded from: classes4.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g64.d f350721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g64.d dVar) {
        super(1);
        this.f350721d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase$invoke$1$jsApiEnv$1");
        org.json.JSONObject obj2 = (org.json.JSONObject) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase$invoke$1$jsApiEnv$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj2, "obj");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toMBJSONObject", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBaseKt");
        lc3.a0 a0Var = new lc3.a0();
        java.util.Iterator<java.lang.String> keys = obj2.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            a0Var.put(next, obj2.opt(next));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toMBJSONObject", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBaseKt");
        this.f350721d.u(a0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase$invoke$1$jsApiEnv$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase$invoke$1$jsApiEnv$1");
        return f0Var;
    }
}
