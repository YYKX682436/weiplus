package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public final class n9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f246914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f246915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(3);
        this.f246914d = c0Var;
        this.f246915e = qVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
        java.util.Map map = (java.util.Map) obj3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
        p3325xe03a0797.p3326xc267989b.q qVar = this.f246915e;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f246914d;
        if (map == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(map.get("ret"), 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x9.f247356e.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingQRCodeBtnCompDelegate", "requestGeoLocation failed");
            if (!c0Var.f391645d) {
                c0Var.f391645d = true;
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k9(false, null)));
            }
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("latitude", map.get("latitude"));
            jSONObject.put("longitude", map.get("longitude"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x9.f247356e.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingQRCodeBtnCompDelegate", "requestGeoLocation res = " + jSONObject);
            if (!c0Var.f391645d) {
                c0Var.f391645d = true;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.k9(true, jSONObject.toString())));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
        return f0Var;
    }
}
