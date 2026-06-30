package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1;

/* loaded from: classes8.dex */
public abstract class a {
    public static java.lang.String a(java.lang.Object... objArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = objArr.length - 1;
        for (int i17 = 0; i17 < length; i17++) {
            sb6.append(java.lang.String.valueOf(objArr[i17]));
            sb6.append(',');
        }
        sb6.append(java.lang.String.valueOf(objArr[length]));
        return sb6.toString();
    }

    public static void b(java.lang.String str, int i17, java.lang.String str2, long j17) {
        wz4.a y07 = wz4.b.z0().y0(str);
        if (y07 != null) {
            java.lang.String a17 = a(str, y07.f67175x8987ca93, 0, java.lang.Integer.valueOf(i17), 0, 0, str2, "", y07.f67172x3e015116, 4, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(y07.f67174x55b5eda8));
            jj0.a a18 = jj0.a.a();
            jj0.b bVar = new jj0.b(14229, a17);
            ((com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.c) a18).getClass();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.k.a(bVar);
        }
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, java.lang.String str5) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                str5 = java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } else {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(java.net.URLDecoder.decode(str5, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                jSONObject2.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                str5 = java.net.URLEncoder.encode(jSONObject2.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str2 = java.net.URLEncoder.encode(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            }
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13980, str, str2, str3, str4, java.lang.Long.valueOf(j17), str5, java.lang.Long.valueOf(j18));
    }

    public static java.lang.String d(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("subCode", i17);
            return java.net.URLEncoder.encode(jSONObject.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException | org.json.JSONException unused) {
            return null;
        }
    }
}
