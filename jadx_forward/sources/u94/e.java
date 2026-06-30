package u94;

/* loaded from: classes4.dex */
public class e implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f507377a;

    /* renamed from: b, reason: collision with root package name */
    public final int f507378b;

    public e(u94.f fVar, int i17, u94.a aVar) {
        this.f507377a = new java.lang.ref.WeakReference(fVar);
        this.f507378b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        if (!(obj instanceof java.lang.String)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
            return;
        }
        try {
            jSONObject = new org.json.JSONObject((java.lang.String) obj);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfScreenAddBrandController", th6.toString());
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new u94.d(this, i18, jSONObject.optString("errMsg"), i17, jSONObject.optString("respUsername")));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        }
    }
}
