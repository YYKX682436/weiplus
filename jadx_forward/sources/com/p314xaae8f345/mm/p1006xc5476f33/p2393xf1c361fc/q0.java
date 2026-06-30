package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public class q0 implements com.p314xaae8f345.mm.p944x882e457a.u0, su4.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f263124d;

    /* renamed from: f, reason: collision with root package name */
    public long f263126f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f263127g;

    /* renamed from: h, reason: collision with root package name */
    public volatile su4.z1 f263128h;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f263132o;

    /* renamed from: p, reason: collision with root package name */
    public final rk4.o5 f263133p;

    /* renamed from: q, reason: collision with root package name */
    public dv4.k f263134q;

    /* renamed from: r, reason: collision with root package name */
    public dv4.l f263135r;

    /* renamed from: s, reason: collision with root package name */
    public su4.q1 f263136s;

    /* renamed from: e, reason: collision with root package name */
    public final o13.x f263125e = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.f0(this);

    /* renamed from: i, reason: collision with root package name */
    public final su4.j1 f263129i = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h0(this);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f263130m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final su4.q0 f263131n = new su4.q0();

    public q0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.j0(this);
        this.f263133p = j0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "create FTSWebViewLogic");
        this.f263127g = new java.util.HashMap();
        this.f263124d = java.util.Collections.synchronizedSet(new java.util.HashSet());
        ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).wi(j0Var);
        gm0.j1.d().a(2975, this);
    }

    public boolean a(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "doSearchWebQuery %s", map.toString());
        gm0.j1.d().g(new su4.s1(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "requestId"), com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "commReq"), com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "webview_instance_id", -1)));
        return false;
    }

    public su4.c b(int i17, int i18, boolean z17) {
        java.lang.String a17 = su4.c.a(ys3.l.a(), i17, i18, true);
        java.util.HashMap hashMap = this.f263127g;
        if (hashMap.get(a17) == null) {
            su4.c cVar = new su4.c();
            cVar.d(ys3.l.a(), i17, i18);
            hashMap.put(a17, cVar);
        }
        return (su4.c) hashMap.get(a17);
    }

    public java.lang.String c(int i17, int i18, boolean z17) {
        java.lang.String a17 = su4.c.a(ys3.l.a(), i17, i18, z17);
        java.util.HashMap hashMap = this.f263127g;
        if (hashMap.get(a17) == null) {
            su4.c cVar = new su4.c();
            cVar.d(ys3.l.a(), i17, i18);
            hashMap.put(a17, cVar);
        }
        su4.c cVar2 = (su4.c) hashMap.get(a17);
        java.lang.String str = cVar2.c() ? cVar2.f494359c : "";
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : str;
    }

    public final void d(dv4.l lVar, int i17, int i18, int i19) {
        java.lang.String str;
        lVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (lVar.f325549e && i17 >= 0 && i18 > 0) {
            int i27 = (i18 + i17) - 1;
            if (i27 > lVar.f325547c.size() - 1) {
                i27 = lVar.f325547c.size() - 1;
            }
            if (i27 >= i17) {
                try {
                    jSONObject.put("continueFlag", i27 == lVar.f325547c.size() - 1 ? 0 : 1);
                    jSONObject.put("offset", i27 + 1);
                    jSONObject.put("query", lVar.f325530a);
                    jSONObject.put("ret", 0);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("count", (i27 - i17) + 1);
                    jSONObject2.put("totalCount", c01.e2.p());
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    while (i17 <= i27) {
                        p13.y yVar = (p13.y) lVar.f325547c.get(i17);
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f432720e, true);
                        jSONObject3.put("userName", n17.d1());
                        jSONObject3.put("nickName", n17.P0());
                        lVar.b(yVar, n17, jSONObject3);
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(n17.d1());
                        if (n07 != null) {
                            str = n07.d();
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                str = n07.c();
                            }
                        } else {
                            str = "";
                        }
                        jSONObject3.put("thumbUrl", str);
                        jSONArray.put(jSONObject3);
                        i17++;
                    }
                    jSONObject2.put("items", jSONArray);
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(jSONObject2);
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray2);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("JsapiFtsMatchContact", e17, "", new java.lang.Object[0]);
                }
            }
        }
        ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i19);
        a17.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fts_key_json_data", jSONObject.toString());
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = a17.f266531y;
            if (z0Var != null) {
                z0Var.mo70207xf5bc2045(137, bundle);
            }
        } catch (android.os.RemoteException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + e18.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap] */
    public java.lang.String e(java.lang.String str) {
        ?? emptyMap;
        if (android.text.TextUtils.isEmpty(str)) {
            emptyMap = java.util.Collections.emptyMap();
        } else {
            emptyMap = new java.util.HashMap();
            android.net.Uri parse = android.net.Uri.parse(str);
            new java.util.HashSet();
            for (java.lang.String str2 : parse.getQueryParameterNames()) {
                emptyMap.put(str2, parse.getQueryParameter(str2));
            }
        }
        if (emptyMap == 0) {
            return null;
        }
        java.lang.Object obj = emptyMap.get("search_click_id");
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public boolean f(java.util.Map map) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "getTeachSearchData: %s", map);
        int e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        int e18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "type", 0);
        int e19 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "requestType", 0);
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(map.get("webview_instance_id"), -1);
        java.lang.String str = (java.lang.String) map.get("requestId");
        java.lang.String str2 = (java.lang.String) map.get("guideInfo");
        java.lang.String str3 = (java.lang.String) map.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        int e27 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "nativeReqType", 0);
        boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "ignoreCache", false);
        if (e19 == 0) {
            su4.c b17 = b(e17, e18, true);
            if (!b17.c() || c17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1.class)).Zi()).f262965o).d(2, str, java.lang.Integer.valueOf(o17), new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.g0(this, o17, map, e17, e18, str, str3, str2, e27), this.f263129i);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "getTeachSearchData hit the cache: webviewID = %d %d %d %d %d, data %s", java.lang.Integer.valueOf(o17), java.lang.Integer.valueOf(b17.f494357a), java.lang.Long.valueOf(b17.f494360d), java.lang.Long.valueOf(b17.f494361e), java.lang.Integer.valueOf(b17.f494358b), b17.f494359c);
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Zi(o17, e19, b17.f494359c, 1, str);
                int i18 = b17.f494357a;
                if (i18 == 20 && (i17 = b17.f494358b) == 0) {
                    su4.k3.b(i18, 0, b17.f494362f, i17, 2, b17.b(), 1);
                } else {
                    su4.k3.b(i18, 0, b17.f494362f, b17.f494358b, 1, "", 0);
                }
            }
        } else {
            r45.hq4 c18 = su4.t2.c();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (int size = c18.f457919d.size() - 1; size >= 0; size--) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    r45.gq4 gq4Var = (r45.gq4) c18.f457919d.get(size);
                    if (c01.e2.J(gq4Var.f457016d)) {
                        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                        java.lang.String str4 = gq4Var.f457016d;
                        ((qv.o) u2Var).getClass();
                        java.lang.String str5 = r01.z.b(str4).f66734xea1bd3d4;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                            jSONObject3.put("avatarUrl", str5);
                            jSONObject3.put("userName", gq4Var.f457016d);
                            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                            java.lang.String str6 = gq4Var.f457016d;
                            ((sg3.a) v0Var).getClass();
                            jSONObject3.put("nickName", c01.a2.e(str6));
                            jSONArray2.put(jSONObject3);
                        }
                    }
                }
                jSONObject2.put("items", jSONArray2);
                jSONObject2.put("type", 5);
                jSONObject2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
                jSONArray.put(jSONObject2);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONArray);
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Zi(o17, 1, jSONObject.toString(), 1, str);
            } catch (java.lang.Exception e28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.FTSWebViewLogic", e28, "gen mostSearchBizContactList error", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public java.lang.String g(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("searchClickId", str);
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.FTSWebViewLogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final org.json.JSONObject h(r45.e64 e64Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("latitude", e64Var.f454580e);
            jSONObject.put("longitude", e64Var.f454579d);
            jSONObject.put("precision", e64Var.f454581f);
            jSONObject.put("macAddr", e64Var.f454580e);
            jSONObject.put("cellId", e64Var.f454580e);
            jSONObject.put("gpsSource", e64Var.f454580e);
            jSONObject.put("address", e64Var.f454580e);
            return jSONObject;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.FTSWebViewLogic", e17, "", new java.lang.Object[0]);
            return new org.json.JSONObject();
        }
    }

    public final su4.e i(java.util.Map map) {
        su4.e eVar = new su4.e();
        eVar.f494396a = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "userName");
        eVar.f494397b = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "nickName");
        eVar.f494398c = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "alias");
        eVar.f494400e = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "signature");
        eVar.f494399d = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "sex", 0);
        eVar.f494401f = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "country");
        eVar.f494403h = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "city");
        eVar.f494402g = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "province");
        eVar.f494404i = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "snsFlag", 0);
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "query");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            eVar.f494406k = 3;
        } else {
            int i17 = java.lang.Character.isDigit(f17.charAt(0)) ? 15 : 3;
            eVar.f494406k = i17;
            if (i17 == 15) {
                if ("mobile".equals(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "matchType"))) {
                    eVar.f494405j = f17;
                } else {
                    eVar.f494406k = 1;
                }
            }
        }
        return eVar;
    }

    public final su4.d j(java.util.Map map) {
        su4.d dVar = new su4.d();
        dVar.f494367a = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "userName");
        dVar.f494368b = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "nickName");
        dVar.f494369c = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "headHDImgUrl");
        dVar.f494371e = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "verifyFlag", 0);
        dVar.f494370d = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "signature");
        dVar.f494372f = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        dVar.f494373g = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "sceneActionType", 1);
        r45.va0 va0Var = new r45.va0();
        dVar.f494374h = va0Var;
        va0Var.f469554d = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "brandFlag", 0);
        dVar.f494374h.f469557g = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "iconUrl");
        dVar.f494374h.f469556f = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "brandInfo");
        dVar.f494374h.f469555e = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "externalInfo");
        dVar.f494375i = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "searchId");
        dVar.f494376j = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "searchClickId");
        dVar.f494377k = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "query");
        dVar.f494378l = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "position", 0);
        dVar.f494379m = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "isCurrentDetailPage", false);
        dVar.f494380n = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "extraParams");
        dVar.f494381o = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "friendScene", 0);
        dVar.f494383q = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "bizType", 0);
        dVar.f494384r = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "isFromWebSearch", false));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "bizTabType", 0) == 2) {
            dVar.f494382p = 1;
        } else {
            dVar.f494382p = 0;
        }
        return dVar;
    }

    public void k(vu4.k kVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(kVar);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("requestId", java.util.UUID.randomUUID().toString());
        linkedHashMap.put("commReq", new org.json.JSONObject(kz5.c1.k(new jz5.l("cgiName", "MMDataReport"), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, kz5.c1.k(new jz5.l("clientversion", java.lang.Integer.valueOf(o45.wf.f424562g)), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280, java.lang.Integer.valueOf(o45.wf.f424556a)), new jz5.l(ya.b.f77483x2837e24a, arrayList.toString())))).toString()));
        a(linkedHashMap);
    }

    public boolean l(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "reportSearchRealTimeReport: %s", map.toString());
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f461289t = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "logString");
        gm0.j1.d().a(1134, this);
        gm0.j1.d().g(new su4.a2(lq5Var));
        return false;
    }

    public boolean m(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "reportSearchStatistics: %s", map.toString());
        int e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "logId", 0);
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "logString");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "isReportNow", false));
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "isImportant", false));
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "isIgnoreFreq", false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "reportSearchStatistics reporting %d, logString %s, isReportNow %s, isImportant %s, isIgnoreFreq %s", java.lang.Integer.valueOf(e17), f17, valueOf, valueOf2, valueOf3);
        jx3.f.INSTANCE.p(e17, f17, valueOf.booleanValue(), valueOf2.booleanValue(), valueOf3.booleanValue());
        return false;
    }

    public boolean n(java.util.Map map, int i17) {
        int parseColor;
        boolean z17;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "startSearchItemDetailPage %s", map.toString());
        this.f263131n.f494576d = true;
        boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "isTeachPage", false);
        boolean c18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "isMoreButton", false);
        boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "isFeedBack", 0) == 1;
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "srcUserName");
        java.lang.String f18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        java.lang.String str = (java.lang.String) map.get("navBarColor");
        int e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "subType", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "searchPlaceHolder");
        java.lang.String f19 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "jumpUrl");
        java.lang.String f27 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "searchClickId");
        int i18 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f19) || !(f19.contains("http://mp.weixin.qq.com/imgretrieval") || f19.contains("https://mp.weixin.qq.com/imgretrieval"))) ? -1 : 3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            parseColor = 0;
        } else {
            try {
                parseColor = android.graphics.Color.parseColor(str);
            } catch (java.lang.IllegalArgumentException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.FTSWebViewLogic", "startSearchItemDetailPage: " + e18.getMessage());
                return true;
            }
        }
        java.lang.String str2 = (java.lang.String) map.get("statusBarStyle");
        if (z18) {
            java.lang.String f28 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "jumpUrl");
            if (i17 != -1) {
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).getClass();
                bundle3 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17).z6();
            } else {
                bundle3 = null;
            }
            r(f28, bundle3, 0, "", "", 0, "", 0, 0, "");
        } else {
            int e19 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "type", 0);
            int i19 = i18;
            int e27 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "opType", 0);
            if (e27 > 0) {
                if (e27 == 2) {
                    o(j(map), c17);
                } else if (e27 == 3) {
                    su4.d j17 = j(map);
                    if (c01.e2.J(j17.f494367a)) {
                        java.lang.String f29 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "url");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "startSearchItemDetailPageBizChatting: " + j17.f494367a);
                        su4.t2.a(j17.f494367a);
                        if (!av4.r0.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, j17.f494367a)) {
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("Chat_User", j17.f494367a);
                            intent.putExtra("finish_direct", true);
                            intent.putExtra("key_temp_session_show_type", 0);
                            intent.putExtra("preChatTYPE", 9);
                            int i27 = 7;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f29) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f29)) {
                                try {
                                    i27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(android.net.Uri.parse(f29).getQueryParameter("openArticleScene"), 7);
                                } catch (java.lang.Exception e28) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "getOpenArticleSceneFromUrl exp:%s", e28);
                                }
                            }
                            intent.putExtra("KOpenArticleSceneFromScene", i27);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "startSearchItemDetailPageBizChatting openArticleScene:%d", java.lang.Integer.valueOf(i27));
                            intent.putExtra("specific_chat_from_scene", 3);
                            if (java.util.Objects.equals(j17.f494367a, "gh_25d9ac85a4bc") && ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ui()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "startSearchItemDetailPageBizChatting with GamePlugin and LiteApp!");
                                intent.putExtra("game_plugun_click_time", java.lang.System.currentTimeMillis());
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).hj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent);
                            } else {
                                j45.l.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, ".ui.chatting.ChattingUI", intent, null);
                            }
                        }
                    } else {
                        o(j17, c17);
                    }
                } else if (e27 == 4) {
                    java.lang.String f37 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "jumpUrl");
                    if (i17 != -1) {
                        ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).getClass();
                        bundle2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17).z6();
                    } else {
                        bundle2 = null;
                    }
                    r(f37, bundle2, 0, "", "", 0, "", 0, 0, "");
                }
            } else {
                if (!c18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "doStartSearchItemDetailPage: type=%d link=%s", java.lang.Integer.valueOf(e19), (java.lang.String) map.get("url"));
                    if (e19 == 1) {
                        z17 = false;
                        o(j(map), false);
                    } else if (e19 == 8) {
                        z17 = false;
                        q(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "snsid"), com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "objectXmlDesc"), com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "userName"), com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.c(map, "fromMusicItem", false));
                    } else if (e19 != 32) {
                        java.lang.String f38 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "jumpUrl");
                        java.lang.String f39 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "publishId");
                        int e29 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "payScene", 0);
                        int e37 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "jump url = %s, publishId = %s, payScene = %d", f38, f39, java.lang.Integer.valueOf(e29));
                        java.lang.String f47 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "cookie");
                        if (i17 != -1) {
                            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).getClass();
                            bundle = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i17).z6();
                        } else {
                            bundle = null;
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f38)) {
                            s(f38, bundle, parseColor, str2, f39, e29, f17, e37, e17, f47, i19, f27);
                        }
                    } else {
                        p(i(map));
                    }
                    return z17;
                }
                java.lang.String f48 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "query");
                int e38 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
                java.lang.String f49 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "searchId");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                intent2.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
                intent2.putExtra("neverGetA8Key", true);
                intent2.putExtra("key_load_js_without_delay", true);
                intent2.putExtra("ftsQuery", f48);
                intent2.putExtra("ftsType", e19);
                intent2.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f18);
                java.util.Map c19 = su4.r2.c(e38, false, e19, "");
                if (tg0.r2.a(e38)) {
                    ((java.util.HashMap) c19).put("query", f48);
                } else {
                    try {
                        ((java.util.HashMap) c19).put("query", fp.s0.b(f48, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                    } catch (java.lang.Exception unused) {
                        ((java.util.HashMap) c19).put("query", f48);
                    }
                }
                java.util.HashMap hashMap = (java.util.HashMap) c19;
                hashMap.put("searchId", f49);
                hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f18);
                java.lang.String f57 = su4.r2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), 0));
                hashMap.put("subSessionId", f57);
                intent2.putExtra("subSessionId", f57);
                intent2.putExtra("rawUrl", su4.r2.e(c19, 0));
                intent2.putExtra("key_session_id", f18);
                intent2.putExtra("searchId", f49);
                if (e38 == 20 || e38 == 22 || e38 == 24 || e38 == 33) {
                    j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.fts.MMFTSSOSMoreWebViewUI", intent2, null);
                } else {
                    j45.l.z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent2, null);
                }
            }
        }
        z17 = false;
        return z17;
    }

    public final void o(su4.d dVar, boolean z17) {
        int i17 = dVar.f494381o;
        if (i17 == 0) {
            if (dVar.f494373g == 2) {
                i17 = 89;
            } else if (z17) {
                i17 = 85;
            } else {
                int i18 = dVar.f494372f;
                i17 = (i18 == 3 || i18 == 16) ? dVar.f494379m ? 88 : 87 : 39;
            }
        }
        su4.t2.a(dVar.f494367a);
        if (av4.r0.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, dVar.f494367a)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", dVar.f494367a);
        intent.putExtra("Contact_Nick", dVar.f494368b);
        intent.putExtra("Contact_BrandIconURL", dVar.f494369c);
        intent.putExtra("Contact_Signature", dVar.f494370d);
        intent.putExtra("Contact_VUser_Info_Flag", dVar.f494371e);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("is_from_web_search", dVar.f494384r);
        r45.va0 va0Var = dVar.f494374h;
        if (va0Var != null) {
            try {
                intent.putExtra("Contact_customInfo", va0Var.mo14344x5f01b1f6());
            } catch (java.io.IOException unused) {
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("Contact_Ext_Args_Search_Id", dVar.f494375i);
        bundle.putString("Contact_Ext_Args_Search_Click_Id", dVar.f494376j);
        bundle.putString("Contact_Ext_Args_Query_String", dVar.f494377k);
        intent.putExtra("KOpenArticleSceneFromScene", 7);
        bundle.putInt("Contact_Scene", i17);
        bundle.putInt("Contact_Ext_Args_Index", dVar.f494378l);
        bundle.putString("Contact_Ext_Extra_Params", dVar.f494380n);
        intent.putExtra("preChatTYPE", 10);
        intent.putExtra("Contact_Ext_Args", bundle);
        intent.putExtra("biz_profile_tab_type", dVar.f494382p);
        intent.putExtra("biz_type", dVar.f494383q);
        intent.putExtra("force_get_contact", true);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof su4.z1) {
            if (m1Var == this.f263128h) {
                gm0.j1.d().q(1048, this);
                this.f263128h = null;
            } else {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(m1Var.hashCode());
                objArr[1] = this.f263128h != null ? java.lang.String.valueOf(this.f263128h.hashCode()) : "null";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.FTSWebViewLogic", "onSceneEnd NetSceneWebSearchGuide mismatch, scene=%d, current=%s, skip removeListener", objArr);
            }
            su4.z1 z1Var = (su4.z1) m1Var;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1.class)).Zi()).f262965o).b(2, z1Var.f494686m, new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p0(i17, i18, z1Var), this.f263129i);
            return;
        }
        if (m1Var instanceof su4.a2) {
            gm0.j1.d().q(1134, this);
            return;
        }
        if (m1Var instanceof su4.v1) {
            gm0.j1.d().q(1866, this);
            if (i17 == 0 && i18 == 0) {
                su4.v1 v1Var = (su4.v1) m1Var;
                if (v1Var.f494650h != -1) {
                    ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Ri(v1Var.f494650h, ((r45.o77) v1Var.f494646d.f152244b.f152233a).f463546d, 0, 0, 0);
                }
                su4.g2 g2Var = v1Var.f494651i;
                if (g2Var != null) {
                    ((java.util.HashMap) this.f263130m).put(java.lang.Integer.valueOf(g2Var.f494430a), v1Var.f494651i);
                    return;
                }
                return;
            }
            return;
        }
        try {
            if (m1Var instanceof su4.q1) {
                gm0.j1.d().q(2999, this);
                su4.q1 q1Var = (su4.q1) m1Var;
                java.lang.String str2 = q1Var.f494582o.f456462d;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str3 = str2 != null ? str2 : "";
                if (q1Var.f494581n == -1) {
                    return;
                }
                zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
                int i19 = q1Var.f494581n;
                ((jw4.e) l3Var).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i19);
                a17.getClass();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("fts_key_json_data", str3);
                bundle.putString("fts_key_err_msg", str);
                bundle.putInt("fts_key_ret_code", i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = a17.f266531y;
                if (z0Var != null) {
                    z0Var.mo70207xf5bc2045(152, bundle);
                }
            } else {
                if (!(m1Var instanceof su4.s1)) {
                    return;
                }
                su4.s1 s1Var = (su4.s1) m1Var;
                java.lang.String str4 = ((r45.e97) s1Var.f494622e.f152244b.f152233a).f454714d;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str4 == null) {
                    str4 = "";
                }
                if (s1Var.f494625h == -1) {
                    return;
                }
                zg0.l3 l3Var2 = (zg0.l3) i95.n0.c(zg0.l3.class);
                int i27 = s1Var.f494625h;
                java.lang.String str5 = s1Var.f494624g;
                ((jw4.e) l3Var2).getClass();
                qx4.d0 a18 = qx4.d0.f448925m.a(i27);
                if (a18 != null) {
                    pm0.v.X(new qx4.v(str4, a18, str5, i18, str));
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a19 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(i27);
                a19.getClass();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("fts_key_id", str5);
                bundle2.putString("fts_key_json_data", str4);
                bundle2.putString("fts_key_err_msg", str);
                bundle2.putInt("fts_key_ret_code", i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var2 = a19.f266531y;
                if (z0Var2 != null) {
                    z0Var2.mo70207xf5bc2045(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5, bundle2);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void p(su4.e eVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", eVar.f494396a);
        intent.putExtra("Contact_Nick", eVar.f494397b);
        intent.putExtra("Contact_Alias", eVar.f494398c);
        intent.putExtra("Contact_Sex", eVar.f494399d);
        intent.putExtra("Contact_Scene", eVar.f494406k);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("Contact_RegionCode", com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(eVar.f494401f, eVar.f494402g, eVar.f494403h));
        intent.putExtra("Contact_Signature", eVar.f494400e);
        intent.putExtra("Contact_KSnsIFlag", eVar.f494404i);
        intent.putExtra("Contact_full_Mobile_MD5", eVar.f494405j);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public final void q(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 Ai = ((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).Ai(str2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("INTENT_TALKER", str3);
        intent.putExtra("INTENT_SNSID", new java.math.BigInteger(Ai.Id).longValue());
        intent.putExtra("SNS_FROM_MUSIC_ITEM", z17);
        try {
            intent.putExtra("INTENT_SNS_TIMELINEOBJECT", Ai.mo14344x5f01b1f6());
        } catch (java.io.IOException unused) {
        }
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "sns", ".ui.SnsCommentDetailUI", intent, null);
    }

    public final void r(java.lang.String str, android.os.Bundle bundle, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, int i19, int i27, java.lang.String str5) {
        s(str, bundle, i17, str2, str3, i18, str4, i19, i27, str5, -1, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.String r17, android.os.Bundle r18, int r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, int r24, int r25, java.lang.String r26, int r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0.s(java.lang.String, android.os.Bundle, int, java.lang.String, java.lang.String, int, java.lang.String, int, int, java.lang.String, int, java.lang.String):void");
    }

    public void t() {
        if (this.f263128h != null) {
            gm0.j1.d().q(1048, this);
            gm0.j1.d().d(this.f263128h);
            this.f263128h = null;
        }
    }
}
