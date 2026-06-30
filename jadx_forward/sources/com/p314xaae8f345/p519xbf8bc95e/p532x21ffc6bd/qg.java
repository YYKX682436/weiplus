package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class qg implements com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f132461a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi> f132462b;

    private boolean a() {
        return this.f132461a;
    }

    private java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi> b() {
        return this.f132462b;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347
    /* renamed from: parse */
    public void mo35867x6581ab3(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f132461a = jSONObject.optInt("enable", 0) == 1;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("layers");
            if (optJSONArray != null) {
                this.f132462b = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35880xd8ef724c(optJSONArray, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi.class, new java.lang.Object[0]);
            }
        }
    }
}
