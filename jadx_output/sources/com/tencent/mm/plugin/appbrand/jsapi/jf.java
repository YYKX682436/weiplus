package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class jf {
    public static void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.appbrand.jsruntime.b0 b0Var;
        if (!(c0Var instanceof com.tencent.mm.plugin.appbrand.jsruntime.t) || (b0Var = (com.tencent.mm.plugin.appbrand.jsruntime.b0) ((com.tencent.mm.plugin.appbrand.jsruntime.t) c0Var).h0(com.tencent.mm.plugin.appbrand.jsruntime.b0.class)) == null) {
            c0Var.evaluateJavascript(c(com.tencent.mm.plugin.appbrand.utils.w2.a(str), str2, i17, i18), null);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
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
        com.tencent.mm.plugin.appbrand.jsruntime.n nVar = (com.tencent.mm.plugin.appbrand.jsruntime.n) b0Var;
        ((cl.a) nVar.c0()).h(new com.tencent.mm.plugin.appbrand.jsruntime.m(nVar, null, str, str3, i17, b(jSONObject)), false);
    }

    public static java.lang.String b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new org.json.JSONObject();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsScriptEvaluator", "makeExtStatJson e = %s", e17);
                return "{}";
            }
        }
        return jSONObject.put("nativeTime", java.lang.System.currentTimeMillis()).toString();
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.String str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.JsScriptEvaluator", "message:%s", format);
            throw new java.lang.OutOfMemoryError(format);
        }
    }
}
