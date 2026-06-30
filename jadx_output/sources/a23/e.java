package a23;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f849a;

    /* renamed from: b, reason: collision with root package name */
    public int f850b;

    /* renamed from: c, reason: collision with root package name */
    public int f851c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f852d;

    /* renamed from: e, reason: collision with root package name */
    public long f853e;

    /* renamed from: f, reason: collision with root package name */
    public int f854f;

    /* renamed from: g, reason: collision with root package name */
    public int f855g;

    /* renamed from: h, reason: collision with root package name */
    public int f856h;

    /* renamed from: i, reason: collision with root package name */
    public int f857i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f858j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f859k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f860l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f861m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f862n;

    /* renamed from: o, reason: collision with root package name */
    public int f863o;

    /* renamed from: p, reason: collision with root package name */
    public org.json.JSONArray f864p;

    /* renamed from: q, reason: collision with root package name */
    public org.json.JSONArray f865q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f866r;

    /* renamed from: s, reason: collision with root package name */
    public org.json.JSONObject f867s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f868t;

    public e(java.lang.String hotword) {
        kotlin.jvm.internal.o.g(hotword, "hotword");
        this.f849a = hotword;
        this.f850b = 1;
        this.f851c = 1;
        this.f852d = "";
        this.f857i = 1;
        this.f858j = "";
        this.f859k = "";
        this.f860l = "";
        this.f861m = "";
        this.f862n = "";
        this.f863o = 35;
        this.f864p = new org.json.JSONArray();
        this.f865q = new org.json.JSONArray();
        this.f866r = "";
        this.f867s = new org.json.JSONObject();
        this.f868t = "";
    }

    public final void a(org.json.JSONObject json) {
        kotlin.jvm.internal.o.g(json, "json");
        try {
            this.f850b = json.optInt("optype", 0);
            java.lang.String optString = json.optString("hotword", "");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            this.f849a = optString;
            this.f851c = json.optInt("deletable", 0);
            java.lang.String optString2 = json.optString(dm.i4.COL_ID, "");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            this.f852d = optString2;
            this.f853e = json.optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, 0L);
            this.f854f = json.optInt("clientversion", 0);
            this.f855g = json.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            this.f856h = json.optInt("businesstype", 0);
            this.f857i = json.optInt("guessIntervalHours", 0);
            java.lang.String optString3 = json.optString("mixerCommonContext", "");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            this.f858j = optString3;
            java.lang.String optString4 = json.optString("finderCommentJumpReferer", "");
            kotlin.jvm.internal.o.f(optString4, "optString(...)");
            this.f859k = optString4;
            java.lang.String optString5 = json.optString("localAccInfo", "");
            kotlin.jvm.internal.o.f(optString5, "optString(...)");
            this.f860l = optString5;
            java.lang.String optString6 = json.optString("extInfo", "");
            kotlin.jvm.internal.o.f(optString6, "optString(...)");
            this.f861m = optString6;
            java.lang.String optString7 = json.optString("docPullType", "");
            kotlin.jvm.internal.o.f(optString7, "optString(...)");
            this.f862n = optString7;
            this.f863o = json.optInt("parentType", 0);
            org.json.JSONArray optJSONArray = json.optJSONArray("extReqParams");
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            this.f864p = optJSONArray;
            org.json.JSONArray optJSONArray2 = json.optJSONArray("checkboxes");
            if (optJSONArray2 == null) {
                optJSONArray2 = new org.json.JSONArray();
            }
            this.f865q = optJSONArray2;
            java.lang.String optString8 = json.optString("requestId", "");
            kotlin.jvm.internal.o.f(optString8, "optString(...)");
            this.f866r = optString8;
            org.json.JSONObject optJSONObject = json.optJSONObject("extLocalInfo");
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            this.f867s = optJSONObject;
            java.lang.String optString9 = json.optString("searchId", "");
            kotlin.jvm.internal.o.f(optString9, "optString(...)");
            this.f868t = optString9;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSBizClickFlow", e17, "", new java.lang.Object[0]);
        }
    }

    public final org.json.JSONObject b() {
        return new org.json.JSONObject(kz5.c1.k(new jz5.l("optype", java.lang.Integer.valueOf(this.f850b)), new jz5.l("hotword", this.f849a), new jz5.l("deletable", java.lang.Integer.valueOf(this.f851c)), new jz5.l(dm.i4.COL_ID, this.f852d), new jz5.l(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.f853e)), new jz5.l("clientversion", java.lang.Integer.valueOf(this.f854f)), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f855g)), new jz5.l("businesstype", java.lang.Integer.valueOf(this.f856h)), new jz5.l("guessIntervalHours", java.lang.Integer.valueOf(this.f857i)), new jz5.l("mixerCommonContext", this.f858j), new jz5.l("finderCommentJumpReferer", this.f859k), new jz5.l("localAccInfo", this.f860l), new jz5.l("extInfo", this.f861m), new jz5.l("docPullType", this.f862n), new jz5.l("parentType", java.lang.Integer.valueOf(this.f863o)), new jz5.l("extReqParams", this.f864p), new jz5.l("checkboxes", this.f865q), new jz5.l("requestId", this.f866r), new jz5.l("extLocalInfo", this.f867s), new jz5.l("searchId", this.f868t)));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a23.e) && kotlin.jvm.internal.o.b(this.f849a, ((a23.e) obj).f849a);
    }

    public int hashCode() {
        return this.f849a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String jSONObject = b().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }
}
