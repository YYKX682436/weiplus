package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class qi implements com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f132479a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f132480b;

    /* renamed from: c, reason: collision with root package name */
    public int f132481c;

    /* renamed from: d, reason: collision with root package name */
    public int f132482d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f132483e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f132484f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String[] f132485g;

    /* renamed from: h, reason: collision with root package name */
    private org.json.JSONObject f132486h;

    public final java.lang.String a(int i17, int i18, int i19) {
        java.lang.String[] strArr = this.f132485g;
        if (strArr == null || strArr.length == 0) {
            return this.f132484f;
        }
        java.lang.String replace = this.f132484f.replace("{x}", java.lang.String.valueOf(i17)).replace("{y}", java.lang.String.valueOf(i18)).replace("{z}", java.lang.String.valueOf(i19));
        for (java.lang.String str : this.f132485g) {
            java.lang.Object opt = this.f132486h.opt(str);
            if (opt instanceof org.json.JSONArray) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                int length = jSONArray.length() - 0;
                replace = replace.replace("{" + str + "}", jSONArray.optString(length > 0 ? new java.security.SecureRandom().nextInt(length) + 0 : 0, ""));
            } else if ((opt instanceof java.lang.String) || (opt instanceof java.lang.Number)) {
                replace = replace.replace("{" + str + "}", java.lang.String.valueOf(opt));
            }
        }
        return replace;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347
    /* renamed from: parse */
    public void mo35867x6581ab3(org.json.JSONObject jSONObject) {
        this.f132486h = jSONObject;
        if (jSONObject != null) {
            this.f132479a = jSONObject.optString("layerid");
            this.f132480b = jSONObject.optString("version");
            this.f132484f = jSONObject.optString("url");
            this.f132481c = jSONObject.optInt("zoom_max", 20);
            this.f132482d = jSONObject.optInt("zoom_min", 1);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("params");
            if (optJSONArray != null) {
                this.f132485g = new java.lang.String[optJSONArray.length()];
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    this.f132485g[i17] = optJSONArray.optString(i17);
                }
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m36934x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CustomLayerModel{mLayerId='");
        stringBuffer.append(this.f132479a);
        stringBuffer.append("', mVersion='");
        stringBuffer.append(this.f132480b);
        stringBuffer.append("', mMaxZoomLevel=");
        stringBuffer.append(this.f132481c);
        stringBuffer.append(", mMinZoomLevel=");
        stringBuffer.append(this.f132482d);
        stringBuffer.append(", mUrl='");
        stringBuffer.append(this.f132484f);
        stringBuffer.append("', mParamsHolders=");
        java.lang.String[] strArr = this.f132485g;
        stringBuffer.append(strArr == null ? "null" : java.util.Arrays.asList(strArr).toString());
        stringBuffer.append(", mVersionUpdated=");
        stringBuffer.append(this.f132483e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
