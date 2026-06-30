package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class j1 implements com.tencent.shadow.core.common.IWVAStorageDelegate {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.minigame.j1 f69084a = new com.tencent.mm.minigame.j1();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f69085b = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("wvaFiles") + "/config.json");

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f69086c;

    public final void a(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        try {
            org.json.JSONObject b17 = b();
            org.json.JSONArray optJSONArray = b17.optJSONArray("wvaAppIds");
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                if (kotlin.jvm.internal.o.b(appId, optJSONArray.optString(i17))) {
                    com.tencent.mars.xlog.Log.i("WVA.WVAStorageDelegate", "appendWvaAppId already exists, appId=" + appId + ", size=" + optJSONArray.length());
                    return;
                }
            }
            optJSONArray.put(appId);
            b17.put("wvaAppIds", optJSONArray);
            com.tencent.mm.vfs.r6 r6Var = f69085b;
            java.lang.String jSONObject = b17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mm.vfs.s6.d(r6Var, jSONObject, null, 2, null);
            com.tencent.mars.xlog.Log.i("WVA.WVAStorageDelegate", "appendWvaAppId success, appId=" + appId + ", size=" + optJSONArray.length());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WVA.WVAStorageDelegate", e17, "appendWvaAppId error, appId=".concat(appId), new java.lang.Object[0]);
        }
    }

    public final org.json.JSONObject b() {
        com.tencent.mm.vfs.r6 r6Var = f69085b;
        try {
            if (r6Var.m()) {
                java.lang.String b17 = com.tencent.mm.vfs.s6.b(r6Var, null, 1, null);
                try {
                    return new org.json.JSONObject(b17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("WVA.WVAStorageDelegate", e17, "getWvaConfigJson json error, content: ".concat(b17), new java.lang.Object[0]);
                    r6Var.l();
                }
            }
            r6Var.k();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            com.tencent.mm.vfs.s6.d(r6Var, jSONObject2, null, 2, null);
            return jSONObject;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WVA.WVAStorageDelegate", e18, "getWvaConfigJson error", new java.lang.Object[0]);
            return new org.json.JSONObject();
        }
    }

    public final java.lang.String c(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        return com.tencent.mm.vfs.q7.c("wvaFiles") + '/' + appId + '/';
    }

    public final void d(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.vfs.r6 r6Var = f69085b;
        try {
            if (!r6Var.m()) {
                com.tencent.mars.xlog.Log.i("WVA.WVAStorageDelegate", "removeWvaAppId skip, config not exists, appId=".concat(appId));
                return;
            }
            org.json.JSONObject b17 = b();
            org.json.JSONArray optJSONArray = b17.optJSONArray("wvaAppIds");
            if (optJSONArray == null) {
                return;
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            int length = optJSONArray.length();
            boolean z17 = false;
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String optString = optJSONArray.optString(i17);
                if (kotlin.jvm.internal.o.b(appId, optString)) {
                    z17 = true;
                } else {
                    jSONArray.put(optString);
                }
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i("WVA.WVAStorageDelegate", "removeWvaAppId not found, appId=" + appId + ", size=" + optJSONArray.length());
                return;
            }
            b17.put("wvaAppIds", jSONArray);
            java.lang.String jSONObject = b17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mm.vfs.s6.d(r6Var, jSONObject, null, 2, null);
            com.tencent.mars.xlog.Log.i("WVA.WVAStorageDelegate", "removeWvaAppId success, appId=" + appId + ", size=" + jSONArray.length());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("WVA.WVAStorageDelegate", e17, "removeWvaAppId error, appId=".concat(appId), new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.shadow.core.common.IWVAStorageDelegate
    public java.lang.String getDataDirPath() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f69086c;
        if (str == null) {
            throw new com.tencent.wva.hostsdk.WVAException(hx5.e.f285711a, "WVAStorageDelegate appid is null");
        }
        sb6.append(c(str));
        sb6.append("dataFiles/");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.w6.u(sb7);
        return sb7;
    }

    @Override // com.tencent.shadow.core.common.IWVAStorageDelegate
    public java.lang.String getExternalDirPath() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f69086c;
        if (str == null) {
            throw new com.tencent.wva.hostsdk.WVAException(hx5.e.f285711a, "WVAStorageDelegate appid is null");
        }
        sb6.append(c(str));
        sb6.append("externalFiles/");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.w6.u(sb7);
        return sb7;
    }

    @Override // com.tencent.shadow.core.common.IWVAStorageDelegate
    public java.lang.String getFileSystemPath(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        return com.tencent.mm.plugin.appbrand.jsapi.file.l2.i(kk.v.a(gm0.m.i()), appId).f76225d + "/ahpFiles";
    }
}
