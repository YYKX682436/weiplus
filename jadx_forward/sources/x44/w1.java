package x44;

/* loaded from: classes4.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.z1 f533448d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x44.z1 z1Var) {
        super(1);
        this.f533448d = z1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$doAction$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$doAction$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.optInt("errCode", 1) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
            x44.z1 z1Var = this.f533448d;
            z1Var.m(it);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo");
            z1Var.b(it);
        } else {
            x44.z1 z1Var2 = this.f533448d;
            z1Var2.b(w44.d.k(z1Var2, 600005, "fail: query finder user info failed!", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$doAction$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$doAction$1");
        return f0Var;
    }
}
