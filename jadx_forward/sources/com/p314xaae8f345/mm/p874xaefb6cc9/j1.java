package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class j1 implements com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25506x8cb63387 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.j1 f150617a = new com.p314xaae8f345.mm.p874xaefb6cc9.j1();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.r6 f150618b = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.q7.c("wvaFiles") + "/config.json");

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f150619c;

    public final void a(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        try {
            org.json.JSONObject b17 = b();
            org.json.JSONArray optJSONArray = b17.optJSONArray("wvaAppIds");
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(appId, optJSONArray.optString(i17))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVAStorageDelegate", "appendWvaAppId already exists, appId=" + appId + ", size=" + optJSONArray.length());
                    return;
                }
            }
            optJSONArray.put(appId);
            b17.put("wvaAppIds", optJSONArray);
            com.p314xaae8f345.mm.vfs.r6 r6Var = f150618b;
            java.lang.String jSONObject = b17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.mm.vfs.s6.d(r6Var, jSONObject, null, 2, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVAStorageDelegate", "appendWvaAppId success, appId=" + appId + ", size=" + optJSONArray.length());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WVA.WVAStorageDelegate", e17, "appendWvaAppId error, appId=".concat(appId), new java.lang.Object[0]);
        }
    }

    public final org.json.JSONObject b() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = f150618b;
        try {
            if (r6Var.m()) {
                java.lang.String b17 = com.p314xaae8f345.mm.vfs.s6.b(r6Var, null, 1, null);
                try {
                    return new org.json.JSONObject(b17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WVA.WVAStorageDelegate", e17, "getWvaConfigJson json error, content: ".concat(b17), new java.lang.Object[0]);
                    r6Var.l();
                }
            }
            r6Var.k();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            com.p314xaae8f345.mm.vfs.s6.d(r6Var, jSONObject2, null, 2, null);
            return jSONObject;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WVA.WVAStorageDelegate", e18, "getWvaConfigJson error", new java.lang.Object[0]);
            return new org.json.JSONObject();
        }
    }

    public final java.lang.String c(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        return com.p314xaae8f345.mm.vfs.q7.c("wvaFiles") + '/' + appId + '/';
    }

    public final void d(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.vfs.r6 r6Var = f150618b;
        try {
            if (!r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVAStorageDelegate", "removeWvaAppId skip, config not exists, appId=".concat(appId));
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
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(appId, optString)) {
                    z17 = true;
                } else {
                    jSONArray.put(optString);
                }
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVAStorageDelegate", "removeWvaAppId not found, appId=" + appId + ", size=" + optJSONArray.length());
                return;
            }
            b17.put("wvaAppIds", jSONArray);
            java.lang.String jSONObject = b17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.mm.vfs.s6.d(r6Var, jSONObject, null, 2, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVAStorageDelegate", "removeWvaAppId success, appId=" + appId + ", size=" + jSONArray.length());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WVA.WVAStorageDelegate", e17, "removeWvaAppId error, appId=".concat(appId), new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25506x8cb63387
    /* renamed from: getDataDirPath */
    public java.lang.String mo46932xe5152a12() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f150619c;
        if (str == null) {
            throw new com.p314xaae8f345.wva.p3204x417d0592.C27797x789ae92d(hx5.e.f367244a, "WVAStorageDelegate appid is null");
        }
        sb6.append(c(str));
        sb6.append("dataFiles/");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.w6.u(sb7);
        return sb7;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25506x8cb63387
    /* renamed from: getExternalDirPath */
    public java.lang.String mo46933x617289d1() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f150619c;
        if (str == null) {
            throw new com.p314xaae8f345.wva.p3204x417d0592.C27797x789ae92d(hx5.e.f367244a, "WVAStorageDelegate appid is null");
        }
        sb6.append(c(str));
        sb6.append("externalFiles/");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.vfs.w6.u(sb7);
        return sb7;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25506x8cb63387
    /* renamed from: getFileSystemPath */
    public java.lang.String mo46934x5b018e86(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.i(kk.v.a(gm0.m.i()), appId).f157758d + "/ahpFiles";
    }
}
