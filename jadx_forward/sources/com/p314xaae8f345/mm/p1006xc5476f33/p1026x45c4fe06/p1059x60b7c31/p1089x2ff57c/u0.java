package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class u0 {
    public u0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, org.json.JSONArray jSONArray, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 y3Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.v0 v0Var) {
        java.lang.String str2;
        java.net.URL url;
        int i17;
        int i18;
        boolean[] zArr;
        java.lang.Object[] objArr;
        boolean[] zArr2;
        int i19;
        org.json.JSONArray jSONArray2 = jSONArray;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        if (jSONArray2 == null || jSONArray.length() <= 0) {
            if (v0Var != null) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                v0Var.l(str, new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[0], new boolean[0], new java.lang.Object[0], java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis());
                return;
            }
            return;
        }
        if (tVar == null || y3Var == null) {
            return;
        }
        java.lang.String str3 = runtime.f156336n;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[] nVarArr = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[jSONArray.length()];
        int length = jSONArray.length();
        boolean[] zArr3 = new boolean[length];
        for (int i27 = 0; i27 < length; i27++) {
            zArr3[i27] = false;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[jSONArray.length()];
        int length2 = jSONArray.length();
        int i28 = 0;
        while (i28 < length2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.t0 t0Var = null;
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
                    t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.t0(v0Var, str, nVarArr, zArr3, objArr2, currentTimeMillis);
                } else {
                    str2 = optString;
                    url = null;
                    i17 = i28;
                    i18 = length2;
                    zArr = zArr3;
                    objArr = objArr2;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af = y3Var.mo49254xc00e82af(str2);
                if (mo49254xc00e82af == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.JsApiLoadJsFiles", "loadJsFiles appId[" + str3 + "] path[" + str2 + "] EMPTY");
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
                    com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n();
                    nVar.f157573a = mo49254xc00e82af.f157573a;
                    nVar.f157574b = mo49254xc00e82af.f157574b;
                    nVar.f157575c = mo49254xc00e82af.f157575c;
                    nVar.f157576d = mo49254xc00e82af.f157576d;
                    nVar.f157577e = mo49254xc00e82af.f157577e;
                    nVar.f157578f = mo49254xc00e82af.f157578f;
                    nVar.f157579g = mo49254xc00e82af.f157579g;
                    nVar.f157580h = mo49254xc00e82af.f157580h;
                    nVar.f128887k = mo49254xc00e82af.f157580h;
                    nVar.f128885i = str2;
                    nVarArr[i17] = nVar;
                    java.io.InputStream i29 = y3Var.i(str2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i29);
                    java.lang.String d17 = s46.d.d(i29, r26.c.f450398a);
                    if (d17 == null) {
                        d17 = "";
                    }
                    nVar.f128886j = d17;
                    nVar.f128887k = d17.length();
                    i19 = i17;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d3.b(tVar, url, d17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.s0(zArr2, i17, t0Var));
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
