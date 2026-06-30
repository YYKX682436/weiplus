package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public abstract class jf {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0 b0Var;
        if (!(c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t) || (b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t) c0Var).h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b0.class)) == null) {
            c0Var.mo14660x738236e6(c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str), str2, i17, i18), null);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = "{}";
        }
        java.lang.String str3 = str2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (i18 != 0) {
            try {
                jSONObject.put("__subscribe_webviewId", i18);
            } catch (org.json.JSONException unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) b0Var;
        ((cl.a) nVar.c0()).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.m(nVar, null, str, str3, i17, b(jSONObject)), false);
    }

    public static java.lang.String b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new org.json.JSONObject();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsScriptEvaluator", "makeExtStatJson e = %s", e17);
                return "{}";
            }
        }
        return jSONObject.put("nativeTime", java.lang.System.currentTimeMillis()).toString();
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.String str3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = "{}";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (i18 != 0) {
                try {
                    jSONObject.put("__subscribe_webviewId", i18);
                } catch (org.json.JSONException unused) {
                }
            }
            java.util.Locale locale = java.util.Locale.ENGLISH;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            if (i17 == 0) {
                str3 = "undefined";
            } else {
                str3 = i17 + "";
            }
            objArr[2] = str3;
            objArr[3] = b(jSONObject);
            return java.lang.String.format(locale, "WeixinJSCoreAndroid.subscribeHandler(\"%s\", %s, %s, %s)", objArr);
        } catch (java.lang.OutOfMemoryError e17) {
            java.util.Locale locale2 = java.util.Locale.ENGLISH;
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = e17.getMessage();
            objArr2[1] = str;
            objArr2[2] = java.lang.Integer.valueOf((str2 != null ? str2 : "").length());
            java.lang.String format = java.lang.String.format(locale2, "oom:%s, event:%s, data.size:%d", objArr2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsScriptEvaluator", "message:%s", format);
            throw new java.lang.OutOfMemoryError(format);
        }
    }
}
