package com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534;

/* loaded from: classes8.dex */
public final class f {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static /* synthetic */ void i(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar, long j17, long j18, long j19, long j27, long j28, long j29, java.lang.String str, long j37, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.Object obj) {
        fVar.f(j17, j18, j19, j27, j28, j29, str, j37, str2, str3, (i18 & 1024) != 0 ? -1 : i17);
    }

    public static /* synthetic */ void j(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar, long j17, long j18, long j19, long j27, long j28, java.lang.String str, long j29, int i17, java.lang.String str2, int i18, java.lang.Object obj) {
        fVar.h(j17, j18, j19, j27, j28, str, j29, i17, (i18 & 256) != 0 ? "{}" : str2);
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e a(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e c6632x56e7d94e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e();
        c6632x56e7d94e.f139854d = j17;
        c6632x56e7d94e.f139855e = j18;
        c6632x56e7d94e.f139856f = j19;
        c6632x56e7d94e.f139857g = j27;
        c6632x56e7d94e.f139858h = j28;
        c6632x56e7d94e.f139859i = j29;
        c6632x56e7d94e.f139860j = j37;
        c6632x56e7d94e.f139869s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149731d, 0L);
        c6632x56e7d94e.f139871u = c6632x56e7d94e.b("session_id", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.b().getString("session_id"), true);
        c6632x56e7d94e.f139872v = java.lang.System.currentTimeMillis();
        return c6632x56e7d94e;
    }

    public final void b(long j17, long j18, long j19, long j27) {
        i(this, 1305L, j17, j18, 0L, j19, j27, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149730c, 0L, "", "", 0, 1024, null);
    }

    public final void c(long j17, long j18, long j19, long j27, java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, title);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        i(this, 1324L, j17, j18, 0L, j19, j27, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149730c, 0L, "", jSONObject2, 0, 1024, null);
    }

    public final void d(long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e a17 = a(13L, j17, 0L, 1L, 0L, j18, j19);
        a17.p(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149729b);
        a17.q(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149730c);
        a17.k();
    }

    public final void e(long j17, long j18, long j19, long j27, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e a17 = a(13L, 1308L, j17, j18, 0L, j19, j27);
        a17.q(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149730c);
        a17.p(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149729b);
        a17.f139866p = a17.b("Username", str, true);
        a17.f139868r = a17.b("ExternInfo", a17.f139868r, true);
        a17.k();
    }

    public final void f(long j17, long j18, long j19, long j27, long j28, long j29, java.lang.String str, long j37, java.lang.String str2, java.lang.String str3, int i17) {
        java.lang.String str4 = str3;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e a17 = a(13L, j17, j18, j19, j27, j28, j29);
        a17.q(str);
        a17.p(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149729b);
        a17.f139863m = j37;
        a17.f139866p = a17.b("Username", str2, true);
        java.lang.String str5 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149732e;
        if (!(str5 == null || str5.length() == 0)) {
            if (str4 == null || str3.length() == 0) {
                str4 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149732e;
            } else {
                try {
                    org.json.JSONObject[] jSONObjectArr = {new org.json.JSONObject(str4), new org.json.JSONObject(com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149732e)};
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    for (int i18 = 0; i18 < 2; i18++) {
                        org.json.JSONObject jSONObject2 = jSONObjectArr[i18];
                        java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            java.lang.String next = keys.next();
                            jSONObject.put(next, jSONObject2.get(next));
                        }
                    }
                    str4 = jSONObject.toString();
                } catch (org.json.JSONException unused) {
                }
            }
        }
        a17.f139868r = a17.b("ExternInfo", str4 != null ? java.net.URLEncoder.encode(str4) : null, true);
        a17.f139870t = i17;
        a17.k();
    }

    public final void g(long j17, long j18, long j19, long j27, long j28, java.lang.String str, long j29, int i17) {
        j(this, j17, j18, j19, j27, j28, str, j29, i17, null, 256, null);
    }

    public final void h(long j17, long j18, long j19, long j27, long j28, java.lang.String str, long j29, int i17, java.lang.String reportJsonStr) {
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportJsonStr, "reportJsonStr");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5597xdd66dc5a c5597xdd66dc5a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5597xdd66dc5a();
        c5597xdd66dc5a.e();
        try {
            jSONObject = new org.json.JSONObject(reportJsonStr);
        } catch (java.lang.Exception unused) {
            jSONObject = new org.json.JSONObject();
        }
        jSONObject.put("belongingtab", i17);
        f(1304L, j17, j18, j29, j19, j27, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149730c, j28, str, jSONObject.toString(), c5597xdd66dc5a.f135922g.f89243a);
    }

    public final void k(long j17, long j18, long j19, long j27, long j28, long j29, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6632x56e7d94e a17 = a(10L, j17, j18, j19, j27, j28, j29);
        a17.q(str);
        a17.p(str2);
        a17.f139868r = a17.b("ExternInfo", str3 != null ? java.net.URLEncoder.encode(str3) : null, true);
        a17.k();
    }

    public final void l(long j17, long j18, long j19, long j27, java.lang.String str) {
        i(this, 1302L, j17, j18, 0L, j19, j27, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149730c, 0L, str, "", 0, 1024, null);
    }

    public final void m(long j17, long j18, long j19, long j27, long j28) {
        n(j17, j18, j19, j27, j28, "{}");
    }

    public final void n(long j17, long j18, long j19, long j27, long j28, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5597xdd66dc5a c5597xdd66dc5a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5597xdd66dc5a();
        c5597xdd66dc5a.e();
        f(1311L, j17, j18, j19, j27, j28, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149730c, 0L, "", str, c5597xdd66dc5a.f135922g.f89243a);
    }

    public final void o(long j17, long j18, long j19, long j27, int i17) {
        java.lang.String str = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149730c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("belongingtab", i17);
        i(this, 1318L, j17, j18, 0L, j19, j27, str, 0L, "", jSONObject.toString(), 0, 1024, null);
    }

    public final void p(long j17, long j18, long j19, long j27, long j28) {
        f(1323L, j17, j18, j19, j27, j28, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149730c, 0L, "", "", 0);
    }
}
