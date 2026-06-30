package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a {

    /* renamed from: d, reason: collision with root package name */
    public final long f189221d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f189222e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f189223f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f189224g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, cl0.g data) {
        super(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f189221d = j17;
        this.f189223f = "";
        this.f189224g = "";
        this.f189222e = data.mo15082x48bce8a4("url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data.mo15082x48bce8a4("uxinfo"), "optString(...)");
        long optLong = data.optLong("aid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data.mo15082x48bce8a4("ad_posid"), "optString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdMutualCache", "id :" + j17 + " aid:" + optLong);
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(data.mo15082x48bce8a4("crt_info"));
            if (jSONArray.length() > 0) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(0);
                jSONObject.optString("image_url");
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("card_info");
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString("description");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                    this.f189223f = optString;
                    java.lang.String optString2 = optJSONObject.optString("caption");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                    this.f189224g = optString2;
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: toString */
    public java.lang.String m56310x9616526c() {
        return "id:" + pm0.v.u(this.f189221d) + " url:" + this.f189222e + " description:" + this.f189223f + " caption:" + this.f189224g + " isExposed:false";
    }
}
