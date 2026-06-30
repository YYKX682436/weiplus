package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

/* loaded from: classes.dex */
public abstract class e {
    public static final java.lang.String a(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        try {
            java.lang.String string = new org.json.JSONObject(str).getString("errMsg");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            z17 = true ^ r26.i0.y(string, str2 + ':', false);
        } catch (org.json.JSONException unused) {
        }
        if (!z17) {
            return str;
        }
        java.lang.String jSONObject = new org.json.JSONObject().put("errMsg", str2 + ':' + str).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject);
        return jSONObject;
    }
}
