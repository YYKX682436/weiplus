package x44;

/* loaded from: classes4.dex */
public final class u1 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x44.v1 f533435a;

    public u1(x44.v1 v1Var) {
        this.f533435a = v1Var;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState$doAction$1");
        x44.v1 v1Var = this.f533435a;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.QueryFinderLivingState", "the living state error is " + i18);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("livingError", i18);
            v1Var.b(v1Var.j(600010, "query finder living state failed", jSONObject));
        } else if (obj instanceof java.lang.Integer) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.QueryFinderLivingState", "the living state is " + obj);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("isLiving", p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 770));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState");
            v1Var.m(jSONObject2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState");
            v1Var.b(jSONObject2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.QueryFinderLivingState", "the living state is not integer!");
            x44.v1 v1Var2 = this.f533435a;
            v1Var2.b(w44.d.k(v1Var2, 600010, "the living state is not integer!", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState$doAction$1");
    }
}
