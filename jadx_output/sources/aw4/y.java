package aw4;

/* loaded from: classes.dex */
public abstract class y extends aw4.v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(aw4.p uiComponent) {
        super(uiComponent);
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
        gm0.j1.d().a(719, this);
        gm0.j1.d().a(1161, this);
        gm0.j1.d().a(1048, this);
    }

    public void e() {
        gm0.j1.d().q(2975, this);
        com.tencent.mm.app.w.INSTANCE.p(this);
        dead();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ni().remove(this);
        gm0.j1.d().q(719, this);
        gm0.j1.d().q(1161, this);
        gm0.j1.d().q(1048, this);
    }

    public final aw4.p f() {
        aw4.q qVar = this.f14844d;
        kotlin.jvm.internal.o.e(qVar, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.webview.IWebSearchQueryUIComponent<T of com.tencent.mm.plugin.websearch.webview.WebSearchQueryData>");
        return (aw4.p) qVar;
    }

    public final su4.r1 g(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        int e17 = com.tencent.mm.plugin.websearch.l2.e(params, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        su4.r1 r1Var = new su4.r1();
        r1Var.f413062b = com.tencent.mm.plugin.websearch.l2.f(params, "query");
        r1Var.f413063c = com.tencent.mm.plugin.websearch.l2.e(params, "offset", 0);
        r1Var.f413064d = com.tencent.mm.plugin.websearch.l2.e(params, "type", 0);
        r1Var.f413066f = e17;
        r1Var.f413069i = com.tencent.mm.plugin.websearch.l2.f(params, "sugId");
        r1Var.f413071k = com.tencent.mm.plugin.websearch.l2.e(params, "sugType", 0);
        r1Var.f413070j = com.tencent.mm.plugin.websearch.l2.f(params, "prefixSug");
        r1Var.f413084x = com.tencent.mm.plugin.websearch.l2.f(params, "poiInfo");
        r1Var.f413061a = com.tencent.mm.plugin.websearch.l2.c(params, "isHomePage", false) ? 1 : 0;
        r1Var.f413067g = com.tencent.mm.plugin.websearch.l2.f(params, "searchId");
        if (params.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            r1Var.f413082v = com.tencent.mm.plugin.websearch.l2.f(params, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        }
        r1Var.f413068h = com.tencent.mm.plugin.websearch.l2.e(params, "sceneActionType", 1);
        com.tencent.mm.plugin.websearch.l2.e(params, "displayPattern", 2);
        r1Var.f413073m = com.tencent.mm.plugin.websearch.l2.e(params, "sugPosition", 0);
        com.tencent.mm.plugin.websearch.l2.f(params, "sugBuffer");
        r1Var.f413085y = com.tencent.mm.plugin.websearch.l2.f(params, "requestId");
        r1Var.f413082v = com.tencent.mm.plugin.websearch.l2.f(params, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        r1Var.f413083w = com.tencent.mm.plugin.websearch.l2.f(params, "subSessionId");
        com.tencent.mm.plugin.websearch.l2.f(params, "tagId");
        r1Var.f413077q = a();
        r1Var.H = com.tencent.mm.plugin.websearch.l2.e(params, "version", 0);
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(params, "extReqParams");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(f17);
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    r45.x50 x50Var = new r45.x50();
                    x50Var.f389788d = jSONObject.optString("key", "");
                    x50Var.f389789e = jSONObject.optInt("uintValue", 0);
                    x50Var.f389790f = jSONObject.optString("textValue", "");
                    r1Var.f413075o.add(x50Var);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchQueryData", e18, "commKvJSONArray", new java.lang.Object[0]);
            }
        }
        java.lang.String f18 = com.tencent.mm.plugin.websearch.l2.f(params, "matchUser");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f18)) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(f18);
                r45.fw6 fw6Var = new r45.fw6();
                fw6Var.f374659d = jSONObject2.optString("userName");
                fw6Var.f374660e = jSONObject2.optString("matchWord");
                if (!android.text.TextUtils.isEmpty(fw6Var.f374659d)) {
                    r1Var.f413065e.add(fw6Var);
                }
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchQueryData", e19, "matchUserJSONArray", new java.lang.Object[0]);
            }
        }
        java.lang.String f19 = com.tencent.mm.plugin.websearch.l2.f(params, "prefixQuery");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f19)) {
            try {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray(f19);
                int length2 = jSONArray2.length();
                for (int i18 = 0; i18 < length2; i18++) {
                    r1Var.f413072l.add(jSONArray2.getString(i18));
                }
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchQueryData", e27, "prefixQueryJSONArray", new java.lang.Object[0]);
            }
        }
        java.lang.String f27 = com.tencent.mm.plugin.websearch.l2.f(params, "tagInfo");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f27)) {
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(f27);
                r45.dk6 dk6Var = new r45.dk6();
                r1Var.f413074n = dk6Var;
                dk6Var.f372544e = jSONObject3.optString("tagText");
                r1Var.f413074n.f372543d = jSONObject3.optInt("tagType");
                r1Var.f413074n.f372545f = jSONObject3.optString("tagExtValue");
            } catch (java.lang.Exception e28) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchQueryData", e28, "tagInfoObj", new java.lang.Object[0]);
            }
        }
        java.lang.String f28 = com.tencent.mm.plugin.websearch.l2.f(params, "numConditions");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f28)) {
            try {
                org.json.JSONArray jSONArray3 = new org.json.JSONArray(f28);
                int length3 = jSONArray3.length();
                for (int i19 = 0; i19 < length3; i19++) {
                    org.json.JSONObject optJSONObject = jSONArray3.optJSONObject(i19);
                    r45.hx4 hx4Var = new r45.hx4();
                    hx4Var.f376539e = optJSONObject.optLong("from");
                    hx4Var.f376540f = optJSONObject.optLong("to");
                    hx4Var.f376538d = optJSONObject.optInt("field");
                    r1Var.f413076p.add(hx4Var);
                }
            } catch (java.lang.Exception e29) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchQueryData", e29, "numConditionsArray", new java.lang.Object[0]);
            }
        }
        r1Var.f413078r = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.websearch.l2.e(params, "subType", 0);
        java.lang.String f29 = com.tencent.mm.plugin.websearch.l2.f(params, "specialSearch");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f29)) {
            try {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject(f29);
                r1Var.A = jSONObject4.optInt("type", 0);
                r1Var.B = jSONObject4.optJSONObject("params").optString("reqKey");
            } catch (java.lang.Exception unused) {
            }
        }
        return r1Var;
    }

    public void h(java.lang.String paramsStr) {
        kotlin.jvm.internal.o.g(paramsStr, "paramsStr");
    }

    public java.util.List i() {
        return null;
    }

    public final void j(int i17, java.lang.String str, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchQueryData", "onTeachSearchDataReady");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("requestType", i17);
        jSONObject.put("json", str);
        jSONObject.put("isCacheData", i18);
        jSONObject.put("requestId", str2);
        ((ku5.t0) ku5.t0.f312615d).B(new aw4.x(this, jSONObject));
    }

    @Override // aw4.a, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        super.onSceneEnd(i17, i18, str, m1Var);
        boolean z18 = m1Var instanceof su4.n1;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z18) {
            su4.n1 n1Var = (su4.n1) m1Var;
            if (n1Var.f413015g.f413077q != a()) {
                aw4.b0 b17 = f().b();
                if (b17 != null) {
                    su4.r1 r1Var = n1Var.f413015g;
                    z17 = r1Var.f413063c == 0;
                    java.lang.String requestId = r1Var.f413085y;
                    kotlin.jvm.internal.o.f(requestId, "requestId");
                    b17.p(z17, "{\"ret\":-1}", requestId);
                    return;
                }
                return;
            }
            r45.aa7 aa7Var = n1Var.f413014f;
            if (aa7Var != null) {
                aw4.b0 b18 = f().b();
                if (b18 != null) {
                    su4.r1 r1Var2 = n1Var.f413015g;
                    boolean z19 = r1Var2.f413063c == 0;
                    java.lang.String str2 = aa7Var.f369877f;
                    java.lang.String str3 = str2 != null ? str2 : "{}";
                    java.lang.String requestId2 = r1Var2.f413085y;
                    kotlin.jvm.internal.o.f(requestId2, "requestId");
                    b18.p(z19, str3, requestId2);
                } else {
                    f0Var = null;
                }
                if (f0Var != null) {
                    return;
                }
            }
            aw4.b0 b19 = f().b();
            if (b19 != null) {
                su4.r1 r1Var3 = n1Var.f413015g;
                z17 = r1Var3.f413063c == 0;
                java.lang.String requestId3 = r1Var3.f413085y;
                kotlin.jvm.internal.o.f(requestId3, "requestId");
                b19.p(z17, "{\"ret\":-1}", requestId3);
                return;
            }
            return;
        }
        if (!(m1Var instanceof su4.o1)) {
            if (m1Var instanceof su4.z1) {
                if (i17 == 0 && i18 == 0) {
                    su4.z1 z1Var = (su4.z1) m1Var;
                    j(0, z1Var.f413149f.f386438d, 0, z1Var.f413153m);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchQueryData", "onSceneEnd errType %d,errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    j(0, "", 0, ((su4.z1) m1Var).f413153m);
                    return;
                }
            }
            return;
        }
        su4.o1 o1Var = (su4.o1) m1Var;
        if (o1Var.f413027h.f413077q == a()) {
            if (i17 != 0 || i18 != 0) {
                aw4.b0 b27 = f().b();
                if (b27 != null) {
                    b27.t("{\"ret\":-1}");
                    return;
                }
                return;
            }
            r45.aa7 aa7Var2 = o1Var.f413026g;
            if (aa7Var2 != null) {
                aw4.b0 b28 = f().b();
                if (b28 != null) {
                    java.lang.String str4 = aa7Var2.f369877f;
                    b28.t(str4 != null ? str4 : "{}");
                } else {
                    f0Var = null;
                }
                if (f0Var != null) {
                    return;
                }
            }
            aw4.b0 b29 = f().b();
            if (b29 != null) {
                b29.t("{\"ret\":-1}");
            }
        }
    }
}
