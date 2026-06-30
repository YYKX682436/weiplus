package kf2;

/* loaded from: classes.dex */
public final class w {
    public w(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.Boolean a(java.lang.Object obj, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        try {
            org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                jSONObject = new org.json.JSONObject((java.lang.String) obj);
            }
            return java.lang.Boolean.valueOf(jSONObject.getBoolean(name));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("GamePendantLiteAppApi", th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final java.lang.Integer b(java.lang.Object obj, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        try {
            org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                jSONObject = new org.json.JSONObject((java.lang.String) obj);
            }
            return java.lang.Integer.valueOf(jSONObject.getInt(name));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("GamePendantLiteAppApi", th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final java.lang.String c(java.lang.Object obj, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        try {
            org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                jSONObject = new org.json.JSONObject((java.lang.String) obj);
            }
            return jSONObject.getString(name);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("GamePendantLiteAppApi", th6, "", new java.lang.Object[0]);
            return null;
        }
    }
}
