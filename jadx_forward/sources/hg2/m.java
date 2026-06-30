package hg2;

/* loaded from: classes.dex */
public final class m implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f362906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362907g;

    public m(java.lang.String str, java.lang.String str2, gk2.e eVar, java.lang.String str3) {
        this.f362904d = str;
        this.f362905e = str2;
        this.f362906f = eVar;
        this.f362907g = str3;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("identityID", this.f362904d);
        jSONObject.put("targetName", this.f362905e);
        gk2.e eVar = this.f362906f;
        jSONObject.put("finderUsername", ((mm2.c1) eVar.a(mm2.c1.class)).f410385o);
        jSONObject.put("liveID", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        jSONObject.put("objectID", pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f410516m));
        java.lang.String str = this.f362907g;
        if (str != null) {
            jSONObject.put("productImageBase64", str);
        }
        return jSONObject.toString();
    }
}
