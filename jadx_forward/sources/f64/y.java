package f64;

/* loaded from: classes4.dex */
public final class y extends g64.d {
    @Override // lc3.c0
    public java.lang.String f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
        return "testAsyncJsApi";
    }

    @Override // g64.d
    public void v(lc3.a0 data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.optInt("param") == 0) {
            u(j(lc3.x.f399470d, "the input test is 0"));
        } else {
            lc3.a0 a0Var = new lc3.a0();
            a0Var.put("result", 100);
            m(a0Var);
            u(a0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiZTestAsync");
    }
}
