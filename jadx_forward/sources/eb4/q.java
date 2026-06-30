package eb4;

/* loaded from: classes.dex */
public final class q implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f332439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f332441c;

    public q(yz5.q qVar, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f332439a = qVar;
        this.f332440b = str;
        this.f332441c = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$leftClickFunc$1");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", 4);
        hashMap.put("err_msg", "get_location:user_cancel");
        yz5.q qVar = this.f332439a;
        if (qVar != null) {
            qVar.mo147xb9724478(this.f332440b, "GEO", hashMap);
        }
        this.f332441c.B();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$leftClickFunc$1");
    }
}
