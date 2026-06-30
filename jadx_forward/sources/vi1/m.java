package vi1;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f518938a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f518939b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f518940c;

    public m(java.lang.String appId, java.lang.String apiName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        this.f518938a = appId;
        this.f518939b = apiName;
        this.f518940c = z17;
    }

    public final void a(yz5.r rVar) {
        java.lang.String str = this.f518939b;
        boolean z17 = this.f518940c;
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.object();
            jSONStringer.key("api_name");
            jSONStringer.value(str);
            jSONStringer.key("with_credentials");
            jSONStringer.value(z17);
            jSONStringer.endObject();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetPhoneNumberNew", e17, "", new java.lang.Object[0]);
        }
        java.lang.String jSONStringer2 = jSONStringer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONStringer2, "toString(...)");
        r45.m24 m24Var = new r45.m24();
        java.lang.String str2 = this.f518938a;
        m24Var.f461622d = str2;
        byte[] bytes = jSONStringer2.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        m24Var.f461623e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/getallphone", str2, m24Var, r45.n24.class).n(new vi1.k(rVar))).s(new vi1.l(rVar));
    }
}
