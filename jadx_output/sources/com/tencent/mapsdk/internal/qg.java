package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class qg implements com.tencent.map.tools.json.JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public boolean f50928a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.qi> f50929b;

    private boolean a() {
        return this.f50928a;
    }

    private java.util.List<com.tencent.mapsdk.internal.qi> b() {
        return this.f50929b;
    }

    @Override // com.tencent.map.tools.json.JsonParser
    public void parse(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f50928a = jSONObject.optInt("enable", 0) == 1;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("layers");
            if (optJSONArray != null) {
                this.f50929b = com.tencent.map.tools.json.JsonUtils.parseToList(optJSONArray, com.tencent.mapsdk.internal.qi.class, new java.lang.Object[0]);
            }
        }
    }
}
