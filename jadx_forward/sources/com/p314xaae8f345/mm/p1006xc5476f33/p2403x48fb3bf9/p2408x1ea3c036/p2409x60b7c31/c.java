package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes7.dex */
public abstract class c extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2 = null;
        if (e17 == null || context == null || q5Var == null) {
            if (q5Var != null) {
                q5Var.a("invalid_params", null);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePrefetchJsApiTransferRequestBase", "[game-web-prefetch] " + f() + " invokeInOwn, data: " + e17);
        e17.put("type", g());
        zq1.f0 f0Var = (zq1.f0) gm0.j1.s(zq1.f0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.b(q5Var, this);
        js1.m mVar = (js1.m) f0Var;
        mVar.getClass();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d22 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2();
            c12965xc9712d22.f175446d = e17.optInt("type", -1);
            c12965xc9712d22.f175447e = e17.optString("h5Url");
            c12965xc9712d22.f175448f = e17.optString("scope");
            r45.y24 y24Var = new r45.y24();
            c12965xc9712d22.f175450h = y24Var;
            y24Var.f472258d = e17.optString("reqUrl");
            c12965xc9712d22.f175450h.f472260f = e17.optInt("cgiCmdId");
            org.json.JSONObject optJSONObject = e17.optJSONObject("reqBody");
            c12965xc9712d22.f175450h.f472259e = optJSONObject != null ? optJSONObject.toString() : "";
            c12965xc9712d22.f175450h.f472262h = e17.optInt(ya.b.f77491x8758c4e1);
            c12965xc9712d22.f175453n = e17.optBoolean("needVerifySignature", false);
            c12965xc9712d22.f175451i = e17.optBoolean("is_security_check", false);
            if (e17.has("signText") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17.optString("signText"))) {
                java.lang.String str2 = "|" + c01.id.a() + "|" + ((e17.has("shortPrefix") && c12965xc9712d22.f175447e.contains(e17.optString("shortPrefix"))) ? e17.optString("shortPrefix") : e17.optString("h5Url"));
                java.lang.String c17 = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e.c(e17.optString("signText") + str2);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                    java.lang.String encodeToString = android.util.Base64.encodeToString(c17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), 2);
                    r45.cw3 cw3Var = new r45.cw3();
                    cw3Var.f453393d = e17.optString("signSignatureHeaderKey", "X-WXGAME-TRANSFER-SIGATURE");
                    cw3Var.f453394e = encodeToString;
                    c12965xc9712d22.f175450h.f472261g.push(cw3Var);
                    r45.cw3 cw3Var2 = new r45.cw3();
                    cw3Var2.f453393d = e17.optString("signSuffixHeaderKey", "X-WXGAME-TRANSFER-SIGATURE-SUFFIX");
                    cw3Var2.f453394e = str2;
                    c12965xc9712d22.f175450h.f472261g.push(cw3Var2);
                }
            }
            java.lang.String optString = e17.optString("header");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(optString);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.String optString2 = jSONObject.optString(next);
                    r45.cw3 cw3Var3 = new r45.cw3();
                    cw3Var3.f453393d = next;
                    cw3Var3.f453394e = optString2;
                    c12965xc9712d22.f175450h.f472261g.push(cw3Var3);
                }
            }
            c12965xc9712d2 = c12965xc9712d22;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TransferRequestInfo", e18, "parseTransferRequestInfo from json exception", new java.lang.Object[0]);
        }
        mVar.c(c12965xc9712d2, bVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }

    public abstract java.lang.String f();

    public abstract int g();
}
