package rv4;

/* loaded from: classes12.dex */
public final class k implements mv4.f {

    /* renamed from: r, reason: collision with root package name */
    public static final rv4.j f482035r = new rv4.j(null);

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f482036a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f482037b;

    /* renamed from: c, reason: collision with root package name */
    public final rv4.h f482038c;

    /* renamed from: d, reason: collision with root package name */
    public final org.json.JSONObject f482039d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f482040e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f482041f;

    /* renamed from: g, reason: collision with root package name */
    public final int f482042g;

    /* renamed from: h, reason: collision with root package name */
    public final long f482043h;

    /* renamed from: i, reason: collision with root package name */
    public final int f482044i;

    /* renamed from: j, reason: collision with root package name */
    public final org.json.JSONArray f482045j;

    /* renamed from: k, reason: collision with root package name */
    public final org.json.JSONArray f482046k;

    /* renamed from: l, reason: collision with root package name */
    public final org.json.JSONObject f482047l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f482048m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f482049n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f482050o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Integer f482051p;

    /* renamed from: q, reason: collision with root package name */
    public int f482052q;

    public k(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, rv4.w session, java.lang.String requestId, rv4.h boxData) {
        java.lang.String optString;
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxData, "boxData");
        this.f482036a = session;
        this.f482037b = requestId;
        this.f482038c = boxData;
        org.json.JSONObject jSONObject3 = jSONObject == null ? jSONObject2 : jSONObject;
        this.f482039d = jSONObject3;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString(dm.i4.f66865x76d1ec5a) : null;
        if (optString2 == null) {
            optString2 = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "toString(...)");
        }
        this.f482040e = optString2;
        if (jSONObject == null || (optString = jSONObject.optString("hotword")) == null) {
            optString = jSONObject2 != null ? jSONObject2.optString("nickname") : null;
            if (optString == null) {
                optString = "";
            }
        }
        this.f482041f = optString;
        this.f482042g = jSONObject != null ? jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) : 101;
        this.f482043h = jSONObject != null ? jSONObject.optLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6) : jSONObject2 != null ? jSONObject2.optLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6) : 0L;
        this.f482044i = jSONObject != null ? jSONObject.optInt("businesstype") : 0;
        this.f482045j = jSONObject3 != null ? jSONObject3.optJSONArray("checkboxes") : null;
        this.f482046k = jSONObject3 != null ? jSONObject3.optJSONArray("extReqParams") : null;
        org.json.JSONObject optJSONObject3 = jSONObject != null ? jSONObject.optJSONObject("extLocalInfo") : null;
        this.f482047l = optJSONObject3;
        this.f482048m = (optJSONObject3 == null || (optJSONObject2 = optJSONObject3.optJSONObject("historyUploadExtInfo")) == null) ? null : optJSONObject2.optString("parentSearchIDKV");
        this.f482049n = (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("historyUploadExtInfo")) == null) ? null : optJSONObject.optString("uploadFileIconName");
        if (jSONObject != null) {
            pv4.a.b(jSONObject, "opType");
        }
        this.f482050o = jSONObject2 != null ? pv4.a.d(jSONObject2, dm.i4.f66875xa013b0d5) : null;
        if (jSONObject2 != null) {
            pv4.a.d(jSONObject2, "headUrl");
        }
        this.f482051p = jSONObject2 != null ? pv4.a.b(jSONObject2, "type") : null;
        if (jSONObject2 != null) {
            pv4.a.b(jSONObject2, "verifyFlag");
        }
    }

    public final ov4.c a(ov4.d dVar) {
        org.json.JSONObject jSONObject;
        rv4.w wVar = this.f482036a;
        jv4.i iVar = wVar.f482090c;
        if (iVar == null || (jSONObject = ((jv4.p) iVar).x()) == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String str = wVar.f413207a;
        java.lang.String str2 = this.f482037b;
        java.lang.String a17 = this.f482038c.i().a();
        java.lang.String b17 = b();
        int i17 = this.f482044i;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return new ov4.c(str, null, str2, 0L, dVar, a17, b17, 0, 0, null, 0, 3, 0, i17, jSONObject2, 6026, null);
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f482052q);
        sb6.append('|');
        sb6.append(this.f482052q);
        sb6.append('|');
        java.lang.String str = this.f482041f;
        sb6.append(fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        sb6.append('|');
        java.lang.String str2 = this.f482050o;
        if (!(str2 == null || str2.length() == 0)) {
            str = str2;
        }
        sb6.append(fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        sb6.append("|1||");
        sb6.append(this.f482042g);
        sb6.append('_');
        sb6.append(this.f482044i);
        sb6.append("||title|");
        java.lang.Integer num = this.f482051p;
        sb6.append(num != null ? num.intValue() : 0);
        return sb6.toString();
    }

    public final org.json.JSONObject d(org.json.JSONArray jSONArray, java.lang.String str) {
        java.lang.String optString;
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject != null && (optString = optJSONObject.optString("key")) != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, optString)) {
                return optJSONObject;
            }
        }
        return null;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return this.f482041f + '-' + this.f482040e;
    }

    @Override // nv4.g
    public void w() {
        this.f482036a.f413208b.d("history-" + this.f482037b + '-' + this.f482041f, a(ov4.d.f430740f));
    }
}
