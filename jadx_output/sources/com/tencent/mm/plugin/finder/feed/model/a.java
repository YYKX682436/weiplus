package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.plugin.finder.feed.model.internal.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f107688d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107689e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f107690f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f107691g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, cl0.g data) {
        super(j17);
        kotlin.jvm.internal.o.g(data, "data");
        this.f107688d = j17;
        this.f107690f = "";
        this.f107691g = "";
        this.f107689e = data.optString("url");
        kotlin.jvm.internal.o.f(data.optString("uxinfo"), "optString(...)");
        long optLong = data.optLong("aid");
        kotlin.jvm.internal.o.f(data.optString("ad_posid"), "optString(...)");
        com.tencent.mars.xlog.Log.i("Finder.AdMutualCache", "id :" + j17 + " aid:" + optLong);
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(data.optString("crt_info"));
            if (jSONArray.length() > 0) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(0);
                jSONObject.optString("image_url");
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("card_info");
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString("description");
                    kotlin.jvm.internal.o.f(optString, "optString(...)");
                    this.f107690f = optString;
                    java.lang.String optString2 = optJSONObject.optString("caption");
                    kotlin.jvm.internal.o.f(optString2, "optString(...)");
                    this.f107691g = optString2;
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public java.lang.String toString() {
        return "id:" + pm0.v.u(this.f107688d) + " url:" + this.f107689e + " description:" + this.f107690f + " caption:" + this.f107691g + " isExposed:false";
    }
}
