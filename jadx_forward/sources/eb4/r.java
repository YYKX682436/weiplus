package eb4;

/* loaded from: classes4.dex */
public final class r implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f332442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f332445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f332447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f332448g;

    public r(yz5.a aVar, java.lang.String str, java.lang.String str2, android.content.Context context, boolean z17, yz5.q qVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f332442a = aVar;
        this.f332443b = str;
        this.f332444c = str2;
        this.f332445d = context;
        this.f332446e = z17;
        this.f332447f = qVar;
        this.f332448g = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$rightClickFunc$1");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("sns_ad_landing_page_key");
        if (M == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$rightClickFunc$1");
            return;
        }
        M.putBoolean("canRequestLBS", true);
        eb4.s sVar = eb4.s.f332449a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RequestGeoLocationHelper", "showLBSAuthDialog and confirm!");
        yz5.a aVar = this.f332442a;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        sVar.d(this.f332443b, this.f332444c, this.f332445d, this.f332446e, this.f332447f);
        this.f332448g.B();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ab4.n0 b17 = sVar.b(this.f332445d);
        java.lang.String k17 = b17 != null ? b17.k() : null;
        if (k17 == null) {
            k17 = "";
        }
        jSONObject.put("snsid", k17);
        java.lang.String o17 = b17 != null ? b17.o() : null;
        jSONObject.put("uxinfo", o17 != null ? o17 : "");
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, b17 != null ? b17.l() : 0);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "ad");
        jSONObject2.put("status", "ok");
        jSONObject.put("extInfo", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("location_ad_auth_report", jSONObject3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$rightClickFunc$1");
    }
}
