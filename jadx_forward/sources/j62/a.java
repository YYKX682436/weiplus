package j62;

/* loaded from: classes9.dex */
public class a implements j62.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379412d;

    /* renamed from: e, reason: collision with root package name */
    public int f379413e;

    /* renamed from: f, reason: collision with root package name */
    public int f379414f;

    /* renamed from: g, reason: collision with root package name */
    public int f379415g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379416h;

    /* renamed from: i, reason: collision with root package name */
    public long f379417i;

    /* renamed from: m, reason: collision with root package name */
    public long f379418m;

    /* renamed from: n, reason: collision with root package name */
    public int f379419n;

    /* renamed from: o, reason: collision with root package name */
    public int f379420o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f379421p;

    /* renamed from: q, reason: collision with root package name */
    public int f379422q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.HashMap f379423r = null;

    @Override // j62.f
    public java.util.HashMap E() {
        java.util.HashMap hashMap = this.f379423r;
        if (hashMap != null) {
            return hashMap;
        }
        java.util.HashMap hashMap2 = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f379416h)) {
            try {
                java.lang.Object obj = new org.json.JSONObject(this.f379416h).get("Args");
                if (obj == null) {
                    return null;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap();
                try {
                    if (obj instanceof org.json.JSONArray) {
                        org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                            b(hashMap3, jSONArray.getJSONObject(i17), true);
                        }
                    } else if (obj instanceof org.json.JSONObject) {
                        b(hashMap3, (org.json.JSONObject) obj, true);
                    }
                    hashMap2 = hashMap3;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    hashMap2 = hashMap3;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExptAppItem", "get expt item error [%s] exptId[%d]", e.toString(), java.lang.Integer.valueOf(this.f379412d));
                    this.f379423r = hashMap2;
                    return hashMap2;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        }
        this.f379423r = hashMap2;
        return hashMap2;
    }

    @Override // j62.f
    public java.lang.String O(java.lang.String str, java.lang.String str2) {
        return "";
    }

    public boolean a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f379412d = jSONObject.optInt("ExptId");
            this.f379413e = jSONObject.optInt("GroupId");
            this.f379414f = jSONObject.optInt("ExptSequence");
            this.f379415g = jSONObject.optInt("UseFlag");
            this.f379416h = str;
            this.f379417i = jSONObject.optLong("StartTime");
            this.f379418m = jSONObject.optLong("EndTime");
            this.f379419n = jSONObject.optInt("ExptType");
            this.f379420o = jSONObject.optInt("SvrType");
            this.f379421p = jSONObject.optString("ExptCheckSum");
            E();
            m140410x9616526c();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExptAppItem", "%d convertFrom [%s] error [%s]", java.lang.Integer.valueOf(hashCode()), str, e17.toString());
            return false;
        }
    }

    public final void b(java.util.HashMap hashMap, org.json.JSONObject jSONObject, boolean z17) {
        byte[] decode;
        if (jSONObject == null || hashMap == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("Key");
        java.lang.String optString2 = jSONObject.optString("Val");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            return;
        }
        if (z17 && (decode = android.util.Base64.decode(optString2, 0)) != null && decode.length > 0) {
            if (decode.length <= 1048576) {
                try {
                    optString2 = new java.lang.String(decode, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                } catch (java.lang.Error | java.lang.Exception unused) {
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExptAppItem", "data length more 1M don't parse, reset value. key[%s]", optString);
                optString2 = "";
            }
        }
        hashMap.put(optString, optString2);
        if (optString != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(optString, "ECSubType_" + this.f379412d)) {
                this.f379422q = java.lang.Integer.parseInt(optString2);
            }
        }
    }

    public boolean c() {
        if (this.f379414f < 0) {
            return false;
        }
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (i17 < this.f379417i) {
            return false;
        }
        long j17 = this.f379418m;
        return j17 <= 0 || i17 <= j17;
    }

    @Override // j62.f
    public int e0() {
        return this.f379412d;
    }

    @Override // j62.f
    public boolean g0() {
        return false;
    }

    @Override // j62.f
    /* renamed from: getGroupId */
    public int mo140409x4f4a97c4() {
        return this.f379413e;
    }

    /* renamed from: toString */
    public java.lang.String m140410x9616526c() {
        return "ExptAppItem{exptId=" + this.f379412d + ", groupId=" + this.f379413e + ", exptSeq=" + this.f379414f + ", useFlag=" + this.f379415g + ", exptContent='" + this.f379416h + "', startTime=" + this.f379417i + ", endTime=" + this.f379418m + ", exptType=" + this.f379419n + ", svrType=" + this.f379420o + ", exptCheckSum='" + this.f379421p + "'}";
    }
}
