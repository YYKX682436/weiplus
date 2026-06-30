package x44;

/* loaded from: classes4.dex */
public final class r1 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x44.t1 f533416a;

    public r1(x44.t1 t1Var) {
        this.f533416a = t1Var;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState$doAction$1");
        boolean b17 = obj instanceof java.lang.Integer ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 513) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.FinderLivingNotice", "the living notice state is " + b17);
        if (i18 == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("noticed", b17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
            x44.t1 t1Var = this.f533416a;
            t1Var.m(jSONObject);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
            t1Var.b(jSONObject);
        } else {
            x44.t1 t1Var2 = this.f533416a;
            t1Var2.b(w44.d.k(t1Var2, 600001, "fail: query finder living notice failed: " + i18, null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState$doAction$1");
    }
}
