package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class z extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.j.f34003x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        org.json.JSONObject e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.e(str);
        if (e17 == null || context == null || q5Var == null) {
            if (q5Var != null) {
                q5Var.a("invalid_params", null);
                return;
            }
            return;
        }
        java.lang.String optString = e17.optString("signText");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            q5Var.a("signText is null", null);
            return;
        }
        java.lang.String optString2 = e17.optString("h5Url", "");
        if (e17.has("shortPrefix")) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            java.lang.String optString3 = e17.optString("shortPrefix");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            if (r26.n0.B(optString2, optString3, false)) {
                optString2 = e17.optString("shortPrefix");
            }
        }
        java.lang.String str2 = "|" + c01.id.a() + '|' + optString2;
        java.lang.String c17 = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e.c(optString + str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            q5Var.a("client signContent is null", null);
            return;
        }
        java.nio.charset.Charset ISO_8859_1 = java.nio.charset.StandardCharsets.ISO_8859_1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ISO_8859_1, "ISO_8859_1");
        byte[] bytes = c17.getBytes(ISO_8859_1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.Object encodeToString = android.util.Base64.encodeToString(bytes, 2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("signature", encodeToString);
        jSONObject.put("suffix", str2);
        q5Var.a(null, jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
    }
}
