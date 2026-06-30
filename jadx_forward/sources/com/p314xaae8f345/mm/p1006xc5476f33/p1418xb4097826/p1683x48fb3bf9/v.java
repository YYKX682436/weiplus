package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public float f218462a;

    /* renamed from: b, reason: collision with root package name */
    public float f218463b;

    /* renamed from: c, reason: collision with root package name */
    public float f218464c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218465d = "";

    @android.webkit.JavascriptInterface
    /* renamed from: getEnv */
    public final java.lang.String m63434xb58839b7() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("peekHeight", java.lang.Float.valueOf(this.f218462a));
        jSONObject.put("maxHeight", java.lang.Float.valueOf(this.f218463b));
        jSONObject.put("currHeight", java.lang.Float.valueOf(this.f218464c));
        java.lang.String str = this.f218465d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("jumperExtInfo", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WebViewEnv", "getEnv ");
        return jSONObject2;
    }
}
