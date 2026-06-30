package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcv4/h;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public final void A(java.lang.String data, su4.a scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        org.json.JSONObject put = new org.json.JSONObject().put("json", data).put("requestId", scene.f494338g).put("newQuery", scene.f494337f == 0).put("isNewSearch", scene.f494337f == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetSearchData", "callback " + put);
        this.f224976f.c(put, false);
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetSearchData", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            su4.r1 r1Var = new su4.r1();
            java.util.LinkedList linkedList = r1Var.f494608o;
            r1Var.f494595b = jSONObject.optString("query");
            r1Var.f494596c = jSONObject.optInt("offset", 0);
            r1Var.f494597d = jSONObject.optInt("type", 0);
            r1Var.f494599f = optInt;
            r1Var.f494602i = jSONObject.optString("sugId");
            r1Var.f494604k = jSONObject.optInt("sugType", 0);
            r1Var.f494603j = jSONObject.optString("prefixSug");
            r1Var.f494617x = jSONObject.optString("poiInfo");
            r1Var.H = jSONObject.optInt("version", 0);
            r1Var.f494594a = jSONObject.optBoolean("isHomePage", false) ? 1 : 0;
            r1Var.f494600g = jSONObject.optString("searchId");
            if (jSONObject.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
                r1Var.f494615v = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            }
            r1Var.f494601h = jSONObject.optInt("sceneActionType", 1);
            jSONObject.optInt("displayPattern", 2);
            r1Var.f494606m = jSONObject.optInt("sugPosition", 0);
            jSONObject.optString("sugBuffer");
            r1Var.f494618y = jSONObject.optString("requestId");
            r1Var.f494615v = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            r1Var.f494616w = jSONObject.optString("subSessionId");
            jSONObject.optString("tagId");
            r1Var.D = jSONObject.optBoolean("fromTagSearch", false);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(java.net.URLDecoder.decode(jSONObject.optString("extClientParams"), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
                r1Var.F = jSONObject2.optString("ShareSceneId");
                r1Var.G = jSONObject2.optInt("SnsContentType");
                java.lang.String optString = jSONObject2.optString("exposedFingerWord");
                java.lang.String optString2 = jSONObject2.optString("matchedFingerWord");
                if (!android.text.TextUtils.isEmpty(optString) && !android.text.TextUtils.isEmpty(optString2)) {
                    r45.x50 x50Var = new r45.x50();
                    x50Var.f471321d = "exposedFingerWord";
                    x50Var.f471323f = optString;
                    r45.x50 x50Var2 = new r45.x50();
                    x50Var2.f471321d = "matchedFingerWord";
                    x50Var2.f471323f = optString2;
                    linkedList.add(x50Var);
                    linkedList.add(x50Var2);
                }
            } catch (java.lang.Throwable unused) {
            }
            java.lang.String optString3 = jSONObject.optString("extReqParams");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(optString3);
                    int length = jSONArray.length();
                    int i17 = 0;
                    while (i17 < length) {
                        org.json.JSONObject jSONObject3 = jSONArray.getJSONObject(i17);
                        r45.x50 x50Var3 = new r45.x50();
                        x50Var3.f471321d = jSONObject3.optString("key", "");
                        int i18 = length;
                        x50Var3.f471322e = jSONObject3.optInt("uintValue", 0);
                        x50Var3.f471323f = jSONObject3.optString("textValue", "");
                        linkedList.add(x50Var3);
                        i17++;
                        length = i18;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiGetSearchData", e17, "commKvJSONArray", new java.lang.Object[0]);
                }
            }
            java.lang.String optString4 = jSONObject.optString("matchUser");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
                try {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject(optString4);
                    r45.fw6 fw6Var = new r45.fw6();
                    fw6Var.f456192d = jSONObject4.optString("userName");
                    fw6Var.f456193e = jSONObject4.optString("matchWord");
                    if (!android.text.TextUtils.isEmpty(fw6Var.f456192d)) {
                        r1Var.f494598e.add(fw6Var);
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiGetSearchData", e18, "matchUserJSONArray", new java.lang.Object[0]);
                }
            }
            java.lang.String optString5 = jSONObject.optString("prefixQuery");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString5)) {
                try {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray(optString5);
                    int length2 = jSONArray2.length();
                    for (int i19 = 0; i19 < length2; i19++) {
                        r1Var.f494605l.add(jSONArray2.getString(i19));
                    }
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiGetSearchData", e19, "prefixQueryJSONArray", new java.lang.Object[0]);
                }
            }
            java.lang.String optString6 = jSONObject.optString("tagInfo");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString6)) {
                try {
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject(optString6);
                    r45.dk6 dk6Var = new r45.dk6();
                    r1Var.f494607n = dk6Var;
                    dk6Var.f454077e = jSONObject5.optString("tagText");
                    r1Var.f494607n.f454076d = jSONObject5.optInt("tagType");
                    r1Var.f494607n.f454078f = jSONObject5.optString("tagExtValue");
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiGetSearchData", e27, "tagInfoObj", new java.lang.Object[0]);
                }
            }
            java.lang.String optString7 = jSONObject.optString("numConditions");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString7)) {
                try {
                    org.json.JSONArray jSONArray3 = new org.json.JSONArray(optString7);
                    int length3 = jSONArray3.length();
                    for (int i27 = 0; i27 < length3; i27++) {
                        org.json.JSONObject optJSONObject = jSONArray3.optJSONObject(i27);
                        r45.hx4 hx4Var = new r45.hx4();
                        hx4Var.f458072e = optJSONObject.optLong("from");
                        hx4Var.f458073f = optJSONObject.optLong("to");
                        hx4Var.f458071d = optJSONObject.optInt("field");
                        r1Var.f494609p.add(hx4Var);
                    }
                } catch (java.lang.Exception e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiGetSearchData", e28, "numConditionsArray", new java.lang.Object[0]);
                }
            }
            r1Var.f494610q = hashCode();
            r1Var.f494611r = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            jSONObject.optInt("subType", 0);
            r1Var.f494612s = jSONObject.optInt("isWeAppMore", 0);
            int optInt2 = jSONObject.optInt("h5Version", 0);
            if (r1Var.f494612s == 1) {
                r45.bf7 bf7Var = new r45.bf7();
                r1Var.f494613t = bf7Var;
                if (optInt2 == 0) {
                    bf7Var.f452264d = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(3);
                } else {
                    bf7Var.f452264d = optInt2;
                }
                r45.bf7 bf7Var2 = r1Var.f494613t;
                bf7Var2.f452267g = k01.n.f384581a;
                bf7Var2.f452265e = jSONObject.optInt("subType", 0);
                r45.bf7 bf7Var3 = r1Var.f494613t;
                bf7Var3.f452266f = null;
                bf7Var3.f452269i = r1Var.f494606m;
                java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_SEARCH_INPUT_HINT_CONTENT_ID_STRING_SYNC, null);
                if (m17 != null && (m17 instanceof java.lang.String)) {
                    r1Var.f494613t.f452268h = (java.lang.String) m17;
                }
            }
            java.lang.String optString8 = jSONObject.optString("specialSearch");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString8)) {
                try {
                    org.json.JSONObject jSONObject6 = new org.json.JSONObject(optString8);
                    r1Var.A = jSONObject6.optInt("type", 0);
                    r1Var.B = jSONObject6.optJSONObject("params").optString("reqKey");
                } catch (java.lang.Exception unused2) {
                }
            }
            su4.a l1Var = r1Var.A == 2 ? new su4.l1(r1Var) : new su4.w1(r1Var);
            l1Var.f494335d = r1Var.f494610q;
            gm0.j1.d().g(l1Var);
            gm0.j1.d().a(l1Var.mo808xfb85f7b0(), this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof su4.a) {
            su4.a aVar = (su4.a) m1Var;
            if (aVar.f494335d == hashCode()) {
                gm0.j1.d().q(aVar.mo808xfb85f7b0(), this);
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiGetSearchData", "net scene fail %s", aVar.f494336e);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("ret", -1);
                    } catch (org.json.JSONException unused) {
                    }
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    A(jSONObject2, aVar);
                    return;
                }
                java.lang.String H = aVar.H();
                if (H == null) {
                    H = "{}";
                }
                int J2 = aVar.J();
                A(H, aVar);
                if (J2 > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiGetSearchData", "updateCode %d, need update", java.lang.Integer.valueOf(J2));
                    ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(27);
                }
            }
        }
    }
}
