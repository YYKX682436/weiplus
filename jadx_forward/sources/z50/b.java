package z50;

/* loaded from: classes12.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, java.lang.String str, r45.jo0 jo0Var, int i17, java.util.Map map, org.json.JSONObject jSONObject) {
        java.lang.String str2;
        int i18;
        r45.di6 di6Var;
        java.lang.String str3;
        java.util.Iterator<java.lang.String> it;
        org.json.JSONObject jSONObject2 = jSONObject;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildAndStartRelatedWebSearch query:");
        sb6.append(str);
        sb6.append(" url:");
        r45.di6 di6Var2 = jo0Var.f459519d;
        java.lang.String str4 = "";
        if (di6Var2 == null || (str2 = di6Var2.f454045d) == null) {
            str2 = "";
        }
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSJumpHelper", sb6.toString());
        ((s50.k0) ((u50.w) i95.n0.c(u50.w.class))).aj(str, 1L);
        int i19 = 0;
        boolean optBoolean = jSONObject2.optBoolean("hideSearchBar", false);
        map.put("prefixSug", str);
        map.put("sceneActionType", "6");
        if (i17 == 238) {
            jSONObject2.put("globalVoiceDirectSearch", j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20672x8f1bd40b()));
            map.put("clientFromNewVoiceSearch", "1");
        }
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        map.put("extParams", jSONObject3);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject2.get(next);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                map.put(next, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, org.json.JSONObject.NULL) ? "null" : obj.toString());
                if (obj instanceof java.lang.String) {
                    try {
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.put("key", next);
                        jSONObject4.put("textValue", obj);
                        jSONArray.put(jSONObject4);
                    } catch (org.json.JSONException e17) {
                        e = e17;
                        i18 = i19;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSJumpHelper", e, "", new java.lang.Object[i18]);
                        su4.a1 a1Var = (su4.a1) i95.n0.c(su4.a1.class);
                        di6Var = jo0Var.f459519d;
                        if (di6Var != null) {
                            str4 = str3;
                        }
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) a1Var).Ui(context, i17, str4, java.lang.String.valueOf(o13.p.f423783c), true, map, false, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), "", 0, false, optBoolean, 0, false, jSONArray.toString());
                    }
                } else if (obj instanceof java.lang.Number) {
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put("key", next);
                    jSONObject5.put("uintValue", obj);
                    jSONArray.put(jSONObject5);
                } else if (obj instanceof java.lang.Boolean) {
                    org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                    jSONObject6.put("key", next);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        jSONObject6.put("uintValue", 1);
                    } else {
                        jSONObject6.put("uintValue", i19);
                    }
                    jSONArray.put(jSONObject6);
                } else {
                    if ((obj instanceof org.json.JSONArray) && next.equals("checkboxes")) {
                        int length = ((org.json.JSONArray) obj).length();
                        int i27 = i19;
                        while (i27 < length) {
                            org.json.JSONObject optJSONObject = ((org.json.JSONArray) obj).optJSONObject(i27);
                            if (optJSONObject == null) {
                                it = keys;
                            } else {
                                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                                it = keys;
                                jSONObject7.put("key", optJSONObject.get("key"));
                                jSONObject7.put("uintValue", optJSONObject.optInt("selected", 0));
                                jSONArray.put(jSONObject7);
                            }
                            i27++;
                            keys = it;
                            i19 = 0;
                        }
                    }
                    jSONObject2 = jSONObject;
                }
            }
        } catch (org.json.JSONException e18) {
            e = e18;
            i18 = 0;
        }
        su4.a1 a1Var2 = (su4.a1) i95.n0.c(su4.a1.class);
        di6Var = jo0Var.f459519d;
        if (di6Var != null && (str3 = di6Var.f454045d) != null) {
            str4 = str3;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) a1Var2).Ui(context, i17, str4, java.lang.String.valueOf(o13.p.f423783c), true, map, false, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), "", 0, false, optBoolean, 0, false, jSONArray.toString());
    }

    public final void b(android.content.Context context, java.lang.String liteAppId, java.lang.String liteAppPath, java.lang.String liteAppQueryJson, java.lang.String minVersion, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppId, "liteAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppPath, "liteAppPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppQueryJson, "liteAppQueryJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(minVersion, "minVersion");
        q80.d0 d0Var = new q80.d0();
        d0Var.f442182a = liteAppId;
        d0Var.f442184c = liteAppQueryJson;
        d0Var.f442183b = liteAppPath;
        d0Var.f442187f = minVersion;
        d0Var.f442185d = java.lang.Boolean.valueOf(z17);
        d0Var.f442204w = j17;
        d0Var.f442188g = new android.os.Bundle();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSJumpHelper", "[aisearch] open liteapp:" + liteAppId + ",page:" + liteAppPath);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new z50.a());
    }

    public final void c(g23.i inputSheet, long j17, android.content.Context context, org.json.JSONObject extParams, org.json.JSONObject reportExtInfo, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputSheet, "inputSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extParams, "extParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExtInfo, "reportExtInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        try {
            java.lang.String str = inputSheet.f349457b;
            if (str != null) {
                int hashCode = str.hashCode();
                z50.d dVar = z50.e.f551696a;
                switch (hashCode) {
                    case -1422510894:
                        if (!str.equals("addbiz")) {
                            break;
                        } else {
                            dVar.b(vu4.a.G, vu4.b.f521801r, reportExtInfo, query);
                            break;
                        }
                    case -1148045923:
                        if (!str.equals("addfile")) {
                            break;
                        } else {
                            dVar.b(vu4.a.G, vu4.b.f521800q, reportExtInfo, query);
                            break;
                        }
                    case -847050311:
                        if (!str.equals("phototake")) {
                            break;
                        } else {
                            dVar.b(vu4.a.G, vu4.b.f521796m, reportExtInfo, query);
                            break;
                        }
                    case 534524935:
                        if (!str.equals("addfinder")) {
                            break;
                        } else {
                            dVar.b(vu4.a.G, vu4.b.f521802s, reportExtInfo, query);
                            break;
                        }
                    case 2003535278:
                        if (!str.equals("photoselect")) {
                            break;
                        } else {
                            dVar.b(vu4.a.G, vu4.b.f521797n, reportExtInfo, query);
                            break;
                        }
                }
            }
            org.json.JSONObject jSONObject = inputSheet.f349460e;
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            jSONObject.put("query", query);
            jSONObject.put("extParams", extParams.toString());
            java.lang.String liteAppId = inputSheet.f349459d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liteAppId, "liteAppId");
            java.lang.String liteAppPath = inputSheet.f349458c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liteAppPath, "liteAppPath");
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            java.lang.String minVersion = inputSheet.f349462g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(minVersion, "minVersion");
            b(context, liteAppId, liteAppPath, jSONObject2, minVersion, inputSheet.f349461f, j17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSJumpHelper", e17, "", new java.lang.Object[0]);
        }
    }

    public final void d(android.content.Context context, java.lang.String query, int i17, int i18, org.json.JSONObject extParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extParams, "extParams");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSJumpHelper", "wsJumpToResultPage: ".concat(query));
            boolean optBoolean = extParams.optBoolean("hideSearchBar", false);
            boolean optBoolean2 = extParams.optBoolean("hideNavBar", false);
            su4.j2 j2Var = new su4.j2();
            j2Var.f494471a = context;
            j2Var.f494476f = true;
            j2Var.f494478h = true;
            j2Var.f494472b = i17;
            j2Var.f494473c = i18;
            j2Var.f494475e = java.lang.String.valueOf(o13.p.f423783c);
            j2Var.f494479i = optBoolean;
            j2Var.f494480j = optBoolean2;
            j2Var.f494483m = com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c;
            j2Var.f494487q = query;
            j2Var.f494494x = extParams.toString();
            t50.h hVar = t50.h.f497239a;
            java.util.Map extParams2 = j2Var.f494477g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams2, "extParams");
            hVar.a(extParams2, extParams);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSJumpHelper", e17, "", new java.lang.Object[0]);
        }
    }

    public final void e(android.content.Context context, java.lang.String query, int i17, int i18, org.json.JSONObject reportExtInfo, org.json.JSONObject extParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExtInfo, "reportExtInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extParams, "extParams");
        r45.jo0 jo0Var = new r45.jo0();
        jo0Var.f459521f = query.hashCode();
        jo0Var.f459520e = 0;
        r45.di6 di6Var = new r45.di6();
        di6Var.f454046e = query;
        di6Var.f454045d = query;
        jo0Var.f459519d = di6Var;
        f(context, query, jo0Var, i17, i18, reportExtInfo, extParams);
    }

    public final void f(android.content.Context context, java.lang.String query, r45.jo0 relatedSugItem, int i17, int i18, org.json.JSONObject reportExtInfo, org.json.JSONObject extParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(relatedSugItem, "relatedSugItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExtInfo, "reportExtInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extParams, "extParams");
        java.lang.String jSONObject = reportExtInfo.toString();
        java.nio.charset.Charset charset = vv5.d.f522083a;
        java.lang.String encode = java.net.URLEncoder.encode(java.net.URLEncoder.encode(jSONObject, charset.toString()), charset.toString());
        int optInt = reportExtInfo.optInt("isFromVoice", 0);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Long.valueOf(relatedSugItem.f459521f);
        r45.di6 di6Var = relatedSugItem.f459519d;
        objArr[2] = di6Var != null ? di6Var.f454046e : null;
        objArr[3] = java.lang.Long.valueOf(relatedSugItem.f459521f);
        objArr[4] = encode;
        java.lang.String format = java.lang.String.format("%s:%s:%s:%s:%s", java.util.Arrays.copyOf(objArr, 5));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        hashMap.put("parentSearchID", format);
        hashMap.put("isFromVoice", java.lang.String.valueOf(optInt));
        hashMap.put("clickType", i17 == 17 ? "17" : "7");
        a(context, query, relatedSugItem, i18, hashMap, extParams);
    }
}
