package sg0;

@j95.b
/* loaded from: classes8.dex */
public final class h3 extends i95.w implements su4.f1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f489255d = new java.util.concurrent.ConcurrentHashMap();

    public void Ai(int i17, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        su4.h2 Ni = Ni(i17);
        if (Ni == null) {
            return;
        }
        if (!Ni.b(false) && i17 != 20) {
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "try preload wearch webView for scene: " + i17);
                if (i17 == 123) {
                    ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                    if (su4.r2.h(false) != 0) {
                        su4.r2.p(0L, false, true, 1);
                        return;
                    }
                }
                su4.r2.o();
                return;
            }
            return;
        }
        boolean z17 = Ni.f494443e;
        java.lang.String str = Ni.f494439a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "not preload liteApp for config, " + i17 + " appid: " + str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "try preload liteapp for scene " + i17 + " appid: " + str);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = str;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var == null) {
            return;
        }
        Di(i17);
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Cj((java.lang.String) h0Var.f391656d) != null) {
            Bi(context, (java.lang.String) h0Var.f391656d, Ni);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "checkLiteApp, liteAppId: " + ((java.lang.String) h0Var.f391656d));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj((java.lang.String) h0Var.f391656d, new sg0.c3(this, context, h0Var, Ni));
    }

    public final void Bi(android.content.Context context, java.lang.String str, su4.h2 h2Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f489255d;
        wu5.c cVar = (wu5.c) concurrentHashMap.get(h2Var.a());
        if (cVar != null) {
            cVar.cancel(false);
        }
        concurrentHashMap.remove(h2Var.a());
        ku5.u0 u0Var = ku5.t0.f394148d;
        sg0.d3 d3Var = new sg0.d3(str, h2Var, context);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(d3Var, 500L, false);
    }

    public void Di(int i17) {
        su4.h2 Ni = Ni(i17);
        if (Ni == null) {
            return;
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        boolean z17 = false;
        if (g0Var != null && ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).tk(Ni.f494439a)) {
            z17 = true;
        }
        if (z17) {
            wi(Ni);
            return;
        }
        q80.g0 g0Var2 = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var2 != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var2).qj(Ni.f494439a, 300, true, 10L, new sg0.e3(Ni, this));
        }
    }

    public final su4.h2 Ni(int i17) {
        java.lang.String optString;
        if (((tg0.p1) i95.n0.c(tg0.p1.class)) != null) {
            java.util.HashMap hashMap = su4.o2.f494561a;
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            org.json.JSONObject d17 = su4.o2.d("exptConfig");
            if (!d17.isNull("items") && (optString = d17.optString("items")) != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
                    for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                        if (jSONObject != null && jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811) == i17) {
                            java.lang.String string = jSONObject.getString("exptKey");
                            java.lang.String string2 = jSONObject.getString("appId");
                            java.lang.String string3 = jSONObject.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
                            if (string2 != null && string3 != null) {
                                su4.h2 h2Var = new su4.h2(i17, string2, string3);
                                h2Var.f494441c = string;
                                h2Var.f494443e = jSONObject.optInt("preloadLiteApp") > 0;
                                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                                h2Var.f494442d = jSONObject.optString("preloadParams");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject.optString("query"), "<set-?>");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchConfigLogic", "get search route info scene: %d, appid: %s, exptKey: %s, page: %s, preloadLiteApp: %b", java.lang.Integer.valueOf(i17), string2, string, string3, java.lang.Boolean.valueOf(h2Var.f494443e));
                                return h2Var;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchConfigLogic", "can not find route item for scene %d", java.lang.Integer.valueOf(i17));
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchConfigLogic", e17, "failed get search route item for params %s", optString);
                }
            }
            if (i17 == 20) {
                su4.h2 h2Var2 = new su4.h2(i17, "wxalite2fd372f050eecd471a4392786dfae78c", "pages/s1s-index/entry");
                h2Var2.f494441c = "clicfg_discover_search_use_liteapp";
                h2Var2.f494443e = true;
                return h2Var2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchConfigLogic", "no config route item for scene %d", java.lang.Integer.valueOf(i17));
        }
        return null;
    }

    public final void wi(su4.h2 routeItem) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(routeItem, "routeItem");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("preloadParams", routeItem.f494442d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Search.Entrance");
        if (L0 != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.lang.String str = L0.f65880x11c19d58;
            if (str == null) {
                str = "";
            }
            jSONObject2.putOpt("redPointMsgId", str);
            r45.ez2 D0 = L0.D0();
            java.lang.String i17 = (D0 == null || (m75934xbce7f2f = D0.m75934xbce7f2f(4)) == null) ? null : m75934xbce7f2f.i();
            jSONObject2.putOpt("byPassInfo", i17 != null ? i17 : "");
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            jSONObject.putOpt("reddotParams", jSONObject3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "did dispatch page info: " + jSONObject);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).rj(routeItem.f494439a, "preloadSearchTeachData", jSONObject);
        }
    }
}
