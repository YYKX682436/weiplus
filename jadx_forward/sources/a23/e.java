package a23;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f82382a;

    /* renamed from: b, reason: collision with root package name */
    public int f82383b;

    /* renamed from: c, reason: collision with root package name */
    public int f82384c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f82385d;

    /* renamed from: e, reason: collision with root package name */
    public long f82386e;

    /* renamed from: f, reason: collision with root package name */
    public int f82387f;

    /* renamed from: g, reason: collision with root package name */
    public int f82388g;

    /* renamed from: h, reason: collision with root package name */
    public int f82389h;

    /* renamed from: i, reason: collision with root package name */
    public int f82390i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f82391j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f82392k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f82393l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f82394m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f82395n;

    /* renamed from: o, reason: collision with root package name */
    public int f82396o;

    /* renamed from: p, reason: collision with root package name */
    public org.json.JSONArray f82397p;

    /* renamed from: q, reason: collision with root package name */
    public org.json.JSONArray f82398q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f82399r;

    /* renamed from: s, reason: collision with root package name */
    public org.json.JSONObject f82400s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f82401t;

    public e(java.lang.String hotword) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hotword, "hotword");
        this.f82382a = hotword;
        this.f82383b = 1;
        this.f82384c = 1;
        this.f82385d = "";
        this.f82390i = 1;
        this.f82391j = "";
        this.f82392k = "";
        this.f82393l = "";
        this.f82394m = "";
        this.f82395n = "";
        this.f82396o = 35;
        this.f82397p = new org.json.JSONArray();
        this.f82398q = new org.json.JSONArray();
        this.f82399r = "";
        this.f82400s = new org.json.JSONObject();
        this.f82401t = "";
    }

    public final void a(org.json.JSONObject json) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        try {
            this.f82383b = json.optInt("optype", 0);
            java.lang.String optString = json.optString("hotword", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            this.f82382a = optString;
            this.f82384c = json.optInt("deletable", 0);
            java.lang.String optString2 = json.optString(dm.i4.f66865x76d1ec5a, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            this.f82385d = optString2;
            this.f82386e = json.optLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, 0L);
            this.f82387f = json.optInt("clientversion", 0);
            this.f82388g = json.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            this.f82389h = json.optInt("businesstype", 0);
            this.f82390i = json.optInt("guessIntervalHours", 0);
            java.lang.String optString3 = json.optString("mixerCommonContext", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            this.f82391j = optString3;
            java.lang.String optString4 = json.optString("finderCommentJumpReferer", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
            this.f82392k = optString4;
            java.lang.String optString5 = json.optString("localAccInfo", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
            this.f82393l = optString5;
            java.lang.String optString6 = json.optString("extInfo", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString6, "optString(...)");
            this.f82394m = optString6;
            java.lang.String optString7 = json.optString("docPullType", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString7, "optString(...)");
            this.f82395n = optString7;
            this.f82396o = json.optInt("parentType", 0);
            org.json.JSONArray optJSONArray = json.optJSONArray("extReqParams");
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            this.f82397p = optJSONArray;
            org.json.JSONArray optJSONArray2 = json.optJSONArray("checkboxes");
            if (optJSONArray2 == null) {
                optJSONArray2 = new org.json.JSONArray();
            }
            this.f82398q = optJSONArray2;
            java.lang.String optString8 = json.optString("requestId", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString8, "optString(...)");
            this.f82399r = optString8;
            org.json.JSONObject optJSONObject = json.optJSONObject("extLocalInfo");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            this.f82400s = optJSONObject;
            java.lang.String optString9 = json.optString("searchId", "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString9, "optString(...)");
            this.f82401t = optString9;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSBizClickFlow", e17, "", new java.lang.Object[0]);
        }
    }

    public final org.json.JSONObject b() {
        return new org.json.JSONObject(kz5.c1.k(new jz5.l("optype", java.lang.Integer.valueOf(this.f82383b)), new jz5.l("hotword", this.f82382a), new jz5.l("deletable", java.lang.Integer.valueOf(this.f82384c)), new jz5.l(dm.i4.f66865x76d1ec5a, this.f82385d), new jz5.l(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.f82386e)), new jz5.l("clientversion", java.lang.Integer.valueOf(this.f82387f)), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f82388g)), new jz5.l("businesstype", java.lang.Integer.valueOf(this.f82389h)), new jz5.l("guessIntervalHours", java.lang.Integer.valueOf(this.f82390i)), new jz5.l("mixerCommonContext", this.f82391j), new jz5.l("finderCommentJumpReferer", this.f82392k), new jz5.l("localAccInfo", this.f82393l), new jz5.l("extInfo", this.f82394m), new jz5.l("docPullType", this.f82395n), new jz5.l("parentType", java.lang.Integer.valueOf(this.f82396o)), new jz5.l("extReqParams", this.f82397p), new jz5.l("checkboxes", this.f82398q), new jz5.l("requestId", this.f82399r), new jz5.l("extLocalInfo", this.f82400s), new jz5.l("searchId", this.f82401t)));
    }

    /* renamed from: equals */
    public boolean m443xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a23.e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82382a, ((a23.e) obj).f82382a);
    }

    /* renamed from: hashCode */
    public int m444x8cdac1b() {
        return this.f82382a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m445x9616526c() {
        java.lang.String jSONObject = b().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }
}
