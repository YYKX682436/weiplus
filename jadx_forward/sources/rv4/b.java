package rv4;

/* loaded from: classes12.dex */
public final class b implements mv4.b {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.a f481965a;

    /* renamed from: b, reason: collision with root package name */
    public final rv4.w f481966b;

    /* renamed from: c, reason: collision with root package name */
    public int f481967c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f481968d;

    /* renamed from: e, reason: collision with root package name */
    public final int f481969e;

    /* renamed from: f, reason: collision with root package name */
    public final int f481970f;

    public b(mv4.a boxData, rv4.g0 config, rv4.w session) {
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxData, "boxData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        this.f481965a = boxData;
        this.f481966b = session;
        this.f481968d = config.f481999b;
        this.f481969e = config.f482003f;
        this.f481970f = config.f482002e;
        try {
            new org.json.JSONObject(config.f482000c);
        } catch (org.json.JSONException unused) {
            new org.json.JSONObject();
        }
        try {
            jSONObject = new org.json.JSONObject(config.f482001d);
        } catch (org.json.JSONException unused2) {
            jSONObject = new org.json.JSONObject();
        }
        jSONObject.optBoolean("hideSearchBar", true);
        jSONObject.optBoolean("hideNavBar", false);
    }

    public final ov4.c a(ov4.d dVar) {
        org.json.JSONObject jSONObject;
        java.lang.String str;
        rv4.w wVar = this.f481966b;
        jv4.i iVar = wVar.f482090c;
        if (iVar == null || (jSONObject = ((jv4.p) iVar).x()) == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String str2 = wVar.f413207a;
        rv4.a aVar = (rv4.a) this.f481965a;
        java.lang.String str3 = aVar.f481958b;
        int i17 = aVar.f481959c;
        mv4.b bVar = (mv4.b) kz5.n0.Z(aVar.f481957a);
        if (bVar == null || (str = ((rv4.b) bVar).f481968d) == null) {
            str = "";
        }
        java.lang.String str4 = i17 + "|63|" + fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f481967c);
        sb6.append('|');
        sb6.append(this.f481967c);
        sb6.append('|');
        java.lang.String str5 = this.f481968d;
        sb6.append(fp.s0.b(str5, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        sb6.append("|||");
        sb6.append(fp.s0.b(str5, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        sb6.append("||||");
        java.lang.String sb7 = sb6.toString();
        int intValue = java.lang.Integer.valueOf(this.f481970f).intValue();
        int intValue2 = java.lang.Integer.valueOf(this.f481969e).intValue();
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return new ov4.c(str2, null, str3, 0L, dVar, str4, sb7, 0, 0, null, 0, intValue, 0, intValue2, jSONObject2, 6026, null);
    }

    @Override // nv4.g
    public void w() {
        ov4.c a17 = a(ov4.d.f430740f);
        this.f481966b.f413208b.d("ai-search-" + ((rv4.a) this.f481965a).f481958b + '-' + this.f481968d, a17);
    }
}
