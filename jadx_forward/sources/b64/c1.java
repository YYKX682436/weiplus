package b64;

/* loaded from: classes4.dex */
public final class c1 implements w44.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f99698a;

    public c1(long j17) {
        this.f99698a = j17;
    }

    @Override // w44.a
    public void a(java.lang.String event, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsEvent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        long j17 = this.f99698a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEvent", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppEventSender");
        try {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(j17, event, data);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEvent", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppEventSender");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.liteapp.jsapi.LiteAppJsEvent");
    }
}
