package x44;

/* loaded from: classes4.dex */
public final class d1 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x44.e1 f533346a;

    public d1(x44.e1 e1Var) {
        this.f533346a = e1Var;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI$doAction$1");
        x44.e1 e1Var = this.f533346a;
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.OpenFinderLiveUI", "to finder live ui success");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI");
            org.json.JSONObject l17 = e1Var.l();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI");
            e1Var.b(l17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.OpenFinderLiveUI", "to finder live ui failed, error is " + i18);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("livingError", i18);
            e1Var.b(e1Var.j(600013, "open finder living ui failed", jSONObject));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI$doAction$1");
    }
}
