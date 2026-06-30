package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class u0 {
    public u0(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, org.json.JSONArray jSONArray, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.appcache.y3 y3Var, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.file.v0 v0Var) {
        java.lang.String str2;
        java.net.URL url;
        int i17;
        int i18;
        boolean[] zArr;
        java.lang.Object[] objArr;
        boolean[] zArr2;
        int i19;
        org.json.JSONArray jSONArray2 = jSONArray;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        if (jSONArray2 == null || jSONArray.length() <= 0) {
            if (v0Var != null) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                v0Var.l(str, new com.tencent.luggage.sdk.jsapi.component.n[0], new boolean[0], new java.lang.Object[0], java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis());
                return;
            }
            return;
        }
        if (tVar == null || y3Var == null) {
            return;
        }
        java.lang.String str3 = runtime.f74803n;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.luggage.sdk.jsapi.component.n[] nVarArr = new com.tencent.luggage.sdk.jsapi.component.n[jSONArray.length()];
        int length = jSONArray.length();
        boolean[] zArr3 = new boolean[length];
        for (int i27 = 0; i27 < length; i27++) {
            zArr3[i27] = false;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[jSONArray.length()];
        int length2 = jSONArray.length();
        int i28 = 0;
        while (i28 < length2) {
            com.tencent.mm.plugin.appbrand.jsapi.file.t0 t0Var = null;
            java.lang.String optString = jSONArray2.optString(i28, null);
            if (optString == null) {
                i19 = i28;
                i18 = length2;
                zArr2 = zArr3;
                objArr = objArr2;
            } else {
                if (i28 == jSONArray.length() - 1) {
                    str2 = optString;
                    url = null;
                    i17 = i28;
                    i18 = length2;
                    zArr = zArr3;
                    objArr = objArr2;
                    t0Var = new com.tencent.mm.plugin.appbrand.jsapi.file.t0(v0Var, str, nVarArr, zArr3, objArr2, currentTimeMillis);
                } else {
                    str2 = optString;
                    url = null;
                    i17 = i28;
                    i18 = length2;
                    zArr = zArr3;
                    objArr = objArr2;
                }
                com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = y3Var.openReadPartialInfo(str2);
                if (openReadPartialInfo == null) {
                    com.tencent.mars.xlog.Log.e("Luggage.WXA.JsApiLoadJsFiles", "loadJsFiles appId[" + str3 + "] path[" + str2 + "] EMPTY");
                    if (t0Var != null) {
                        t0Var.onReceiveValue("404");
                    }
                    nVarArr[i17] = url;
                    zArr2 = zArr;
                    zArr2[i17] = false;
                    objArr[i17] = url;
                    i19 = i17;
                } else {
                    zArr2 = zArr;
                    com.tencent.luggage.sdk.jsapi.component.n nVar = new com.tencent.luggage.sdk.jsapi.component.n();
                    nVar.f76040a = openReadPartialInfo.f76040a;
                    nVar.f76041b = openReadPartialInfo.f76041b;
                    nVar.f76042c = openReadPartialInfo.f76042c;
                    nVar.f76043d = openReadPartialInfo.f76043d;
                    nVar.f76044e = openReadPartialInfo.f76044e;
                    nVar.f76045f = openReadPartialInfo.f76045f;
                    nVar.f76046g = openReadPartialInfo.f76046g;
                    nVar.f76047h = openReadPartialInfo.f76047h;
                    nVar.f47354k = openReadPartialInfo.f76047h;
                    nVar.f47352i = str2;
                    nVarArr[i17] = nVar;
                    java.io.InputStream i29 = y3Var.i(str2);
                    kotlin.jvm.internal.o.d(i29);
                    java.lang.String d17 = s46.d.d(i29, r26.c.f368865a);
                    if (d17 == null) {
                        d17 = "";
                    }
                    nVar.f47353j = d17;
                    nVar.f47354k = d17.length();
                    i19 = i17;
                    com.tencent.mm.plugin.appbrand.utils.d3.b(tVar, url, d17, new com.tencent.mm.plugin.appbrand.jsapi.file.s0(zArr2, i17, t0Var));
                }
            }
            i28 = i19 + 1;
            jSONArray2 = jSONArray;
            zArr3 = zArr2;
            length2 = i18;
            objArr2 = objArr;
        }
    }
}
