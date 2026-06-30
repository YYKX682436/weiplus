package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class qi implements com.tencent.map.tools.json.JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f50946a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f50947b;

    /* renamed from: c, reason: collision with root package name */
    public int f50948c;

    /* renamed from: d, reason: collision with root package name */
    public int f50949d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f50950e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f50951f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String[] f50952g;

    /* renamed from: h, reason: collision with root package name */
    private org.json.JSONObject f50953h;

    public final java.lang.String a(int i17, int i18, int i19) {
        java.lang.String[] strArr = this.f50952g;
        if (strArr == null || strArr.length == 0) {
            return this.f50951f;
        }
        java.lang.String replace = this.f50951f.replace("{x}", java.lang.String.valueOf(i17)).replace("{y}", java.lang.String.valueOf(i18)).replace("{z}", java.lang.String.valueOf(i19));
        for (java.lang.String str : this.f50952g) {
            java.lang.Object opt = this.f50953h.opt(str);
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

    @Override // com.tencent.map.tools.json.JsonParser
    public void parse(org.json.JSONObject jSONObject) {
        this.f50953h = jSONObject;
        if (jSONObject != null) {
            this.f50946a = jSONObject.optString("layerid");
            this.f50947b = jSONObject.optString("version");
            this.f50951f = jSONObject.optString("url");
            this.f50948c = jSONObject.optInt("zoom_max", 20);
            this.f50949d = jSONObject.optInt("zoom_min", 1);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("params");
            if (optJSONArray != null) {
                this.f50952g = new java.lang.String[optJSONArray.length()];
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    this.f50952g[i17] = optJSONArray.optString(i17);
                }
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CustomLayerModel{mLayerId='");
        stringBuffer.append(this.f50946a);
        stringBuffer.append("', mVersion='");
        stringBuffer.append(this.f50947b);
        stringBuffer.append("', mMaxZoomLevel=");
        stringBuffer.append(this.f50948c);
        stringBuffer.append(", mMinZoomLevel=");
        stringBuffer.append(this.f50949d);
        stringBuffer.append(", mUrl='");
        stringBuffer.append(this.f50951f);
        stringBuffer.append("', mParamsHolders=");
        java.lang.String[] strArr = this.f50952g;
        stringBuffer.append(strArr == null ? "null" : java.util.Arrays.asList(strArr).toString());
        stringBuffer.append(", mVersionUpdated=");
        stringBuffer.append(this.f50950e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
