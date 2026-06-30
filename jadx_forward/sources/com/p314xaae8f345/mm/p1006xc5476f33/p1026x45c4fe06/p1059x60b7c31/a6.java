package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class a6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33683x366c91de = 927;

    /* renamed from: NAME */
    public static final java.lang.String f33684x24728b = "getAppContact";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        k91.v5 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 c11825xb74ac8c6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null || jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
        java.lang.String optString2 = jSONObject.optString("appid");
        if (!com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(optString) || !com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(optString2)) {
            if (com.p159x477cd522.p160x333422.p163x10fad5c4.C1519x4e42091.m16636xc53c3619(optString)) {
                b17 = k91.w5.f387346b.b(optString2, new java.lang.String[0]);
            } else {
                k91.w5 w5Var = k91.w5.f387346b;
                w5Var.getClass();
                b17 = w5Var.c(null, java.lang.String.format("%s=?", dm.i4.f66875xa013b0d5), new java.lang.String[]{optString});
            }
            k91.v5 v5Var = b17;
            java.util.HashMap hashMap = new java.util.HashMap();
            if (v5Var != null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("nickName", v5Var.f68913x21f9b213);
                hashMap2.put("iconUrl", v5Var.f68910xea1bd3d4);
                hashMap2.put("appId", v5Var.f68904x28d45f97);
                hashMap2.put(dm.i4.f66875xa013b0d5, v5Var.f68924xdec927b);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 w07 = v5Var.w0();
                hashMap2.put("weappVersion", w07 != null ? java.lang.Integer.valueOf(w07.f158977d) : null);
                hashMap2.put("signature", v5Var.f68919xda9bc3b3);
                hashMap2.put("debugMode", java.lang.Integer.valueOf(e9Var.mo32091x9a3f0ba2().u0().f158814g));
                k91.j5 u07 = v5Var.u0();
                k91.o5 v07 = v5Var.v0();
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.put("originalRedirectUrl", u07 != null ? u07.f387173o : null);
                hashMap3.put("appServiceType", u07 != null ? java.lang.Integer.valueOf(u07.f387162d) : null);
                hashMap3.put("originalFlag", u07 != null ? java.lang.Integer.valueOf(u07.f387172n) : null);
                hashMap3.put("brandOfficialFlag", (v07 == null || (c11825xb74ac8c6 = v07.f387239a) == null) ? null : java.lang.Integer.valueOf(c11825xb74ac8c6.H));
                hashMap3.put("relievedBuyFlag", u07 != null ? java.lang.Integer.valueOf(u07.f387175q) : null);
                hashMap3.put("flagshipFlag", u07 != null ? java.lang.Integer.valueOf(u07.f387176r) : null);
                try {
                    hashMap3.put("gameIconFlagList", new org.json.JSONArray(u07 != null ? u07.f387174p : null));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiGetAppContact", "gameIconFlagList Failed to parse JSON: " + e17.getMessage());
                }
                hashMap3.put("tagsInfo", c75.c.a(k91.n3.f387225a));
                hashMap2.put("appBrandInfo", hashMap3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetAppContact", "get contact from profile, nickName=%s, iconUrl=%s, appId=%s, username=%s, weappVersion=%s, signature=%s, debugMode=%d", v5Var.f68913x21f9b213, v5Var.f68910xea1bd3d4, v5Var.f68904x28d45f97, v5Var.f68924xdec927b, v5Var.f68926x94cd21e1, v5Var.f68919xda9bc3b3, java.lang.Integer.valueOf(e9Var.mo32091x9a3f0ba2().u0().f158814g));
                r8 = hashMap2;
            }
            hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395, r8);
            e9Var.a(i17, p("ok", hashMap));
            return;
        }
        java.lang.String optString3 = jSONObject.optString("keyPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetAppContact", "keyPath=" + optString3);
        k91.v5 b18 = k91.w5.f387346b.b(e9Var.mo48798x74292566(), new java.lang.String[0]);
        if (b18 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            java.util.List f07 = r26.n0.f0(optString3, new java.lang.String[]{"."}, false, 0, 6, null);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(b18.z0());
                java.util.Iterator it = f07.iterator();
                java.lang.String str = null;
                while (true) {
                    if (!it.hasNext()) {
                        r8 = str;
                        break;
                    }
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (jSONObject2 == null) {
                        break;
                    }
                    if (jSONObject2.has(str2)) {
                        java.lang.Object opt = jSONObject2.opt(str2);
                        str = opt;
                        if (opt == 0) {
                            str = "";
                        }
                    } else {
                        str = null;
                    }
                    jSONObject2 = str instanceof org.json.JSONObject ? (org.json.JSONObject) str : null;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("next=");
                sb6.append(r8 == null ? "is null" : java.lang.String.valueOf(r8));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetAppContact", sb6.toString());
                if (r8 == null) {
                    e9Var.a(i17, o("fail: keyPath not found"));
                    return;
                }
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, r8);
                e9Var.a(i17, p("ok", hashMap4));
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("JsApiGetAppContact", e18.getMessage());
                e9Var.a(i17, o("fail:internal error"));
            }
        }
    }
}
