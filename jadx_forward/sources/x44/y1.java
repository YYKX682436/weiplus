package x44;

/* loaded from: classes4.dex */
public final class y1 implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f533467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f533468b;

    public y1(org.json.JSONObject jSONObject, yz5.l lVar) {
        this.f533467a = jSONObject;
        this.f533468b = lVar;
    }

    @Override // zy2.c6
    public final void a(zy2.dc dcVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDone", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$queryFinderContact$1");
        org.json.JSONObject jSONObject = this.f533467a;
        if (dcVar != null) {
            try {
                jSONObject.put("followType", 1);
                jSONObject.put("followFlag", ((ya2.b2) dcVar).f69313xcad4ef95);
                jSONObject.put("friendFollowCount", ((ya2.b2) dcVar).f69314x82c83a5b);
                jSONObject.put("feedCount", ((ya2.b2) dcVar).f69310x3717790c);
                jSONObject.put("errCode", ((ya2.b2) dcVar).G2 ? 0 : 1);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.FinderUser", "queryFinderContact, exp is " + th6);
            }
        }
        this.f533468b.mo146xb9724478(jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDone", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderUserInfo$queryFinderContact$1");
    }
}
