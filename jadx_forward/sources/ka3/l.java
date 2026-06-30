package ka3;

/* loaded from: classes15.dex */
public final class l implements ka3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.nfc.hce.C16230x33263ac4 f387613c;

    public l(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.nfc.hce.C16230x33263ac4 c16230x33263ac4) {
        this.f387611a = str;
        this.f387612b = str2;
        this.f387613c = c16230x33263ac4;
    }

    @Override // ka3.i
    public void a(org.json.JSONObject resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (ka3.b.a(resp)) {
            ka3.e eVar = ka3.g.f387600g;
            java.lang.String uin = this.f387611a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uin, "$uin");
            java.lang.String appId = this.f387612b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "$appId");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ra3.q.f475060a;
            java.lang.String key = eVar.b(uin, appId);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            ra3.q.f475060a.remove(key);
        }
        this.f387613c.m10168x71965dbb().a(resp, false, false);
    }
}
