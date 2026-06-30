package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.j2 f263031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2 f263032e;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2 h2Var, su4.j2 j2Var) {
        this.f263032e = h2Var;
        this.f263031d = j2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i18;
        long j17;
        java.util.Map map;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.h(0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.StartWebSearchService", "fts h5 template not avail");
            return;
        }
        su4.j2 j2Var = this.f263031d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartWebSearchService", "startWebSearch, scene: %s, query: %s, parentSearchId: %s", java.lang.Integer.valueOf(j2Var.f494472b), j2Var.f494474d, j2Var.f494489s);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2 h2Var = this.f263032e;
        h2Var.getClass();
        if (j2Var.f494477g != null && (map = j2Var.f494492v) != null && ((java.util.HashMap) map).size() > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
                    jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                }
                ((java.util.HashMap) j2Var.f494477g).put("extClientParams", tg0.r2.a(j2Var.f494472b) ? jSONObject.toString() : android.net.Uri.encode(jSONObject.toString()));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.WebSearch.StartWebSearchService", "", e17);
            }
        }
        java.util.Map map2 = j2Var.f494492v;
        if (map2 != null && j2Var.f494479i) {
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) ((java.util.HashMap) map2).get("exposedFingerWord")) || !android.text.TextUtils.isEmpty((java.lang.CharSequence) ((java.util.HashMap) j2Var.f494492v).get("matchedFingerWord"))) {
                j2Var.f494479i = false;
            }
            if (j2Var.f494472b == 77) {
                j2Var.f494479i = false;
            }
        }
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        java.lang.String f17 = su4.r2.f(j2Var.f494472b);
        java.util.Map map3 = j2Var.f494477g;
        if (map3 != null) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) ((java.util.HashMap) map3).get("chatSearch"), 0);
            str = (java.lang.String) ((java.util.HashMap) j2Var.f494477g).get("reqKey");
        } else {
            i17 = 0;
            str = null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j2Var.f494494x)) {
            str2 = tg0.r2.a(j2Var.f494472b) ? j2Var.f494494x : android.net.Uri.encode(j2Var.f494494x);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j2Var.f494489s)) {
            str2 = "";
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("parentSearchID", j2Var.f494489s);
            } catch (java.lang.Exception unused) {
            }
            boolean a17 = tg0.r2.a(j2Var.f494472b);
            str2 = jSONObject2.toString();
            if (!a17) {
                str2 = android.net.Uri.encode(str2);
            }
        }
        if (j2Var.f494493w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartWebSearchService", "preload web search data");
            java.util.HashMap hashMap = new java.util.HashMap(j2Var.f494477g);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j2Var.f494494x)) {
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject(j2Var.f494494x);
                    java.util.Iterator<java.lang.String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        hashMap.put(next, jSONObject3.optString(next, ""));
                    }
                } catch (java.lang.Exception unused2) {
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j2Var.f494495y)) {
                hashMap.put("extReqParams", j2Var.f494495y);
            }
            hashMap.put("isHomePage", java.util.Objects.equals(java.lang.Boolean.valueOf(j2Var.f494476f), java.lang.Boolean.TRUE) ? "1" : "0");
            obj = "1";
            str3 = "";
            obj2 = "parentSearchID";
            su4.r2.n(valueOf, j2Var.f494475e, f17, j2Var.f494474d, j2Var.f494472b, "", -1, j2Var.f494473c, j2Var.f494489s, i17, str, hashMap);
        } else {
            str3 = "";
            obj = "1";
            obj2 = "parentSearchID";
        }
        java.util.Map d17 = su4.r2.d(j2Var.f494472b, j2Var.f494476f, j2Var.f494473c, str2, "", j2Var.f494475e, j2Var.f494474d, "", f17, "", valueOf);
        java.util.Map map4 = j2Var.f494477g;
        if (map4 != null) {
            ((java.util.HashMap) d17).putAll(map4);
        }
        if (tg0.r2.a(j2Var.f494472b)) {
            ((java.util.HashMap) d17).put("query", j2Var.f494474d);
        } else {
            try {
                ((java.util.HashMap) d17).put("query", fp.s0.b(j2Var.f494474d, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            } catch (java.lang.Exception unused3) {
                ((java.util.HashMap) d17).put("query", j2Var.f494474d);
            }
        }
        java.util.HashMap hashMap2 = (java.util.HashMap) d17;
        hashMap2.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, j2Var.f494475e);
        hashMap2.put(obj2, j2Var.f494489s);
        if (!u46.l.e(j2Var.K)) {
            hashMap2.put("thirdExtParam", tg0.r2.a(j2Var.f494472b) ? j2Var.K : fp.s0.a(j2Var.K));
        }
        if (j2Var.B) {
            hashMap2.put("isHalfScreen", obj);
        }
        h2Var.getClass();
        if (j2Var.I) {
            try {
                java.lang.String str4 = (java.lang.String) ((java.util.HashMap) d17).get("pRequestId");
                java.util.Objects.requireNonNull(str4);
                j17 = java.lang.Long.parseLong(str4);
            } catch (java.lang.NullPointerException | java.lang.NumberFormatException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.StartWebSearchService", "parse parallelRequestId failed", e18);
                j17 = 0;
            }
            if (j17 == 0) {
                j17 = java.lang.System.currentTimeMillis();
                hashMap2.put("pRequestId", java.lang.String.valueOf(j17));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartWebSearchService", "[fts] prefetch search teach data, requestId=" + j17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1.class)).Zi()).g(java.lang.String.valueOf(j17), j2Var.f494475e, j2Var.f494470J, j2Var.f494472b, j2Var.f494473c);
        }
        java.lang.String e19 = su4.r2.e(d17, 0);
        android.content.Intent a18 = su4.r2.a();
        a18.putExtra("searchPlaceHolder", !android.text.TextUtils.isEmpty(j2Var.f494496z) ? j2Var.f494496z : str3);
        a18.putExtra("ftsType", j2Var.f494473c);
        a18.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, j2Var.f494487q);
        a18.putExtra("ftsbizscene", j2Var.f494472b);
        a18.putExtra("ftsQuery", j2Var.f494474d);
        a18.putExtra("ftsInitToSearch", !android.text.TextUtils.isEmpty(j2Var.f494474d) || j2Var.f494478h);
        a18.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, j2Var.f494475e);
        a18.putExtra("subSessionId", f17);
        a18.putExtra("rawUrl", e19);
        int i19 = j2Var.f494472b;
        h2Var.getClass();
        a18.putExtra("key_preload_biz", 4);
        a18.putExtra("key_weapp_url", com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2.wi(h2Var, 22, j2Var.f494475e));
        a18.putExtra("hideSearchInput", j2Var.f494479i);
        a18.putExtra("hideSearchInputBackgroundRes", j2Var.f494483m);
        a18.putExtra("fts_need_sos_edittext_tobe_touch_only", j2Var.f494491u);
        a18.putExtra("key_back_btn_type", j2Var.f494484n);
        a18.putExtra("key_hide_shadow_view", j2Var.f494486p);
        a18.putExtra("first_page_result", j2Var.f494488r);
        a18.putExtra("fts_float_ball_key", j2Var.F);
        if (!j2Var.F.isEmpty()) {
            ep1.m.b(j2Var.f494471a, a18, true);
        }
        a18.putExtra("fts_multi_task_info", j2Var.G);
        a18.putExtra("key_multi_task_common_info", j2Var.H);
        j2Var.getClass();
        int i27 = j2Var.f494485o;
        if (i27 != Integer.MAX_VALUE) {
            a18.putExtra("customize_status_bar_color", i27);
        }
        a18.putExtra("key_load_js_without_delay", true);
        a18.putExtra("ftsneedkeyboard", j2Var.A);
        a18.putExtra("forceUseThemeMode", j2Var.f494482l);
        if (j2Var.f494490t) {
            a18.addFlags(67108864);
        }
        if ((j2Var.f494472b == 14 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20667xf38e649e()) == 1) || j2Var.f494481k) {
            a18.putExtra("key_back_and_clear_query", true);
        }
        if (j2Var.f494480j) {
            a18.putExtra("hideSearchInput", true);
            a18.putExtra("hideSearchTitle", true);
        }
        if (j2Var.B && j2Var.C) {
            ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).Ai(new zg0.s3(j2Var.f494471a, a18, !j2Var.f494480j, 0.7d, true, null, null, false));
            i18 = 0;
        } else {
            i18 = 0;
            ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).wi(j2Var.f494471a, a18, j2Var.B, false);
        }
        if (j2Var.L) {
            android.content.Context context = j2Var.f494471a;
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, i18);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2.Ai(h2Var, j2Var.f494472b);
        su4.k2.a(j2Var.f494472b, j2Var.f494475e, f17, j2Var.f494476f, j2Var.f494474d, j2Var.f494473c, "", false, "");
    }
}
