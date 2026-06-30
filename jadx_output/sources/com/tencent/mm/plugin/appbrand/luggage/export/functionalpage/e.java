package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes.dex */
public abstract class e {
    public static final java.lang.String a(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        try {
            java.lang.String string = new org.json.JSONObject(str).getString("errMsg");
            kotlin.jvm.internal.o.f(string, "getString(...)");
            z17 = true ^ r26.i0.y(string, str2 + ':', false);
        } catch (org.json.JSONException unused) {
        }
        if (!z17) {
            return str;
        }
        java.lang.String jSONObject = new org.json.JSONObject().put("errMsg", str2 + ':' + str).toString();
        kotlin.jvm.internal.o.d(jSONObject);
        return jSONObject;
    }
}
