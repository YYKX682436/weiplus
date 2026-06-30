package ki4;

/* loaded from: classes9.dex */
public final class d0 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hi4.e f389660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389661f;

    public d0(java.lang.String str, hi4.e eVar, java.lang.String str2) {
        this.f389659d = str;
        this.f389660e = eVar;
        this.f389661f = str2;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = this.f389659d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("enc_username", str);
        hi4.e eVar = this.f389660e;
        if (eVar != null) {
            jSONObject.put("session_id", eVar.f76597x1c3513c9);
            jSONObject.put("hash_username", eVar.f76593x5ef57e62);
            jSONObject.put("tag", eVar.f76600x4b6e82d5);
            jSONObject.put("source_id", eVar.f76598x35627aba);
            jSONObject.put("plain", eVar.f76596x29a5ba45);
            jSONObject.put("status_id", eVar.f76599x1f396f83);
            jSONObject.put("modify_count", eVar.f76594x2b07e86f);
            jSONObject.put("card_key", eVar.f76590x1d4a4a55);
        }
        java.lang.String str2 = this.f389661f;
        if (!(str2 == null || r26.n0.N(str2))) {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str2);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
