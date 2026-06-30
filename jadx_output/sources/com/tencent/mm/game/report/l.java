package com.tencent.mm.game.report;

/* loaded from: classes8.dex */
public abstract class l {
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.sdk.platformtools.t8.K0(str3) && map == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                jSONObject.put("function_type", str);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                jSONObject.put("function_value", str2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                jSONObject.put("ext_data", str3);
            }
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    try {
                        jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                    } catch (java.lang.Exception unused) {
                        return "";
                    }
                }
            }
        } catch (org.json.JSONException unused2) {
        }
        return nj0.a.d(jSONObject.toString());
    }

    public static java.lang.String b(java.util.Map map) {
        if (map == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
        return nj0.a.d(jSONObject.toString());
    }

    public static void c(android.content.Context context, int i17, int i18, int i19, int i27, int i28, java.lang.String str) {
        d(context, i17, i18, i19, i27, 0, null, i28, 0, null, null, str);
    }

    public static void d(android.content.Context context, int i17, int i18, int i19, int i27, int i28, java.lang.String str, int i29, int i37, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        e(context, i17, i18, i19, i27, i28, str, i29, i37, str2, str3, str4, 0L, 0L, 0L);
    }

    public static void e(android.content.Context context, int i17, int i18, int i19, int i27, int i28, java.lang.String str, int i29, int i37, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, long j19) {
        jj0.b a17 = jj0.b.a(12909, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), str, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), str2, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(str3, 0)), java.lang.Integer.valueOf(nj0.a.a(context)), str4, "", "", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), com.tencent.mm.plugin.game.commlib.util.i.b().getString("session_id"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.plugin.game.commlib.util.i.b().getString("session_id");
        ((com.tencent.mm.game.report.c) jj0.a.a()).getClass();
        com.tencent.mm.game.report.k.a(a17);
    }

    public static void f(android.content.Context context, int i17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2) {
        d(context, i17, i18, i19, i27, 0, str, i28, 0, null, null, str2);
    }

    public static void g(android.content.Context context, int i17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2, java.lang.String str3) {
        d(context, i17, i18, i19, i27, 0, str, i28, 0, null, str2, str3);
    }
}
