package aw4;

/* loaded from: classes.dex */
public abstract class b0 extends aw4.w {

    /* renamed from: g, reason: collision with root package name */
    public static final aw4.z f14849g = new aw4.z(null);

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f14850f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(aw4.p uiComponent) {
        super(uiComponent);
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
        this.f14850f = "MicroMsg.WebSearch.TagSearchJSApi";
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getMMWebSearchData(java.lang.String str) {
        aw4.y c17;
        com.tencent.mars.xlog.Log.i(this.f14850f, "getSearchDataMore " + str);
        if (str == null) {
            java.lang.String jSONObject = f().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        aw4.p o17 = o();
        if (o17 != null && (c17 = o17.c()) != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                kotlin.jvm.internal.o.d(next);
                hashMap.put(next, jSONObject2.opt(next));
            }
            gm0.j1.d().g(new su4.n1(c17.g(hashMap)));
        }
        java.lang.String jSONObject3 = g().toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getSearchData(java.lang.String str) {
        aw4.y c17;
        com.tencent.mars.xlog.Log.i(this.f14850f, "getSearchData " + str);
        if (str == null) {
            return f().toString();
        }
        aw4.p o17 = o();
        if (o17 != null && (c17 = o17.c()) != null) {
            c17.h(str);
        }
        return g().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:9:0x0023, B:12:0x003b, B:14:0x0065, B:18:0x006f, B:22:0x0076, B:23:0x007b, B:25:0x00cb, B:28:0x00d4), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4 A[Catch: Exception -> 0x00e0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e0, blocks: (B:9:0x0023, B:12:0x003b, B:14:0x0065, B:18:0x006f, B:22:0x0076, B:23:0x007b, B:25:0x00cb, B:28:0x00d4), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getSearchSuggestionData(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getSearchSuggestionData "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r11.f14850f
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r12 == 0) goto Le9
            aw4.p r0 = r11.o()
            if (r0 == 0) goto Le0
            aw4.y r0 = r0.c()
            if (r0 == 0) goto Le0
            java.lang.String r1 = ""
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le0
            r2.<init>(r12)     // Catch: java.lang.Exception -> Le0
            su4.r1 r12 = new su4.r1     // Catch: java.lang.Exception -> Le0
            r12.<init>()     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "query"
            java.lang.String r3 = r2.optString(r3, r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r4)     // Catch: java.lang.Exception -> L3b
            r12.f413062b = r3     // Catch: java.lang.Exception -> L3b
        L3b:
            java.lang.String r3 = "type"
            r4 = 0
            int r3 = r2.optInt(r3, r4)     // Catch: java.lang.Exception -> Le0
            r12.f413064d = r3     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "scene"
            int r3 = r2.optInt(r3, r4)     // Catch: java.lang.Exception -> Le0
            r12.f413066f = r3     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "isHomePage"
            int r3 = r2.optInt(r3, r4)     // Catch: java.lang.Exception -> Le0
            r12.f413061a = r3     // Catch: java.lang.Exception -> Le0
            int r0 = r0.a()     // Catch: java.lang.Exception -> Le0
            r12.f413077q = r0     // Catch: java.lang.Exception -> Le0
            java.lang.String r0 = "prefixQuery"
            java.lang.String r0 = r2.optString(r0, r1)     // Catch: java.lang.Exception -> Le0
            r3 = 1
            if (r0 == 0) goto L6e
            int r5 = r0.length()     // Catch: java.lang.Exception -> Le0
            if (r5 != 0) goto L6c
            goto L6e
        L6c:
            r5 = r4
            goto L6f
        L6e:
            r5 = r3
        L6f:
            r3 = r3 ^ r5
            if (r3 == 0) goto L73
            goto L74
        L73:
            r0 = 0
        L74:
            if (r0 == 0) goto L7b
            java.util.LinkedList r3 = r12.f413072l     // Catch: java.lang.Exception -> Le0
            r3.add(r0)     // Catch: java.lang.Exception -> Le0
        L7b:
            java.lang.String r0 = "requestType"
            int r0 = r2.optInt(r0, r4)     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "extReqParams"
            java.lang.String r3 = r2.optString(r3, r1)     // Catch: java.lang.Exception -> Le0
            java.lang.String r5 = "optString(...)"
            kotlin.jvm.internal.o.f(r3, r5)     // Catch: java.lang.Exception -> Le0
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r3)     // Catch: java.lang.Exception -> Le0
            if (r5 != 0) goto Lcb
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lcb
            r5.<init>(r3)     // Catch: java.lang.Exception -> Lcb
            int r3 = r5.length()     // Catch: java.lang.Exception -> Lcb
            r6 = r4
        L9d:
            if (r6 >= r3) goto Lcb
            org.json.JSONObject r7 = r5.getJSONObject(r6)     // Catch: java.lang.Exception -> Lcb
            r45.x50 r8 = new r45.x50     // Catch: java.lang.Exception -> Lcb
            r8.<init>()     // Catch: java.lang.Exception -> Lcb
            java.lang.String r9 = "key"
            java.lang.String r9 = r7.optString(r9, r1)     // Catch: java.lang.Exception -> Lcb
            r8.f389788d = r9     // Catch: java.lang.Exception -> Lcb
            java.lang.String r9 = "uintValue"
            int r9 = r7.optInt(r9, r4)     // Catch: java.lang.Exception -> Lcb
            long r9 = (long) r9     // Catch: java.lang.Exception -> Lcb
            r8.f389789e = r9     // Catch: java.lang.Exception -> Lcb
            java.lang.String r9 = "textValue"
            java.lang.String r7 = r7.optString(r9, r1)     // Catch: java.lang.Exception -> Lcb
            r8.f389790f = r7     // Catch: java.lang.Exception -> Lcb
            java.util.LinkedList r7 = r12.f413075o     // Catch: java.lang.Exception -> Lcb
            r7.add(r8)     // Catch: java.lang.Exception -> Lcb
            int r6 = r6 + 1
            goto L9d
        Lcb:
            java.lang.String r1 = "subtype"
            r2.optInt(r1, r4)     // Catch: java.lang.Exception -> Le0
            if (r0 == 0) goto Ld4
            goto Le0
        Ld4:
            su4.o1 r0 = new su4.o1     // Catch: java.lang.Exception -> Le0
            r0.<init>(r12)     // Catch: java.lang.Exception -> Le0
            com.tencent.mm.modelbase.r1 r12 = gm0.j1.d()     // Catch: java.lang.Exception -> Le0
            r12.g(r0)     // Catch: java.lang.Exception -> Le0
        Le0:
            org.json.JSONObject r12 = r11.g()
            java.lang.String r12 = r12.toString()
            return r12
        Le9:
            org.json.JSONObject r12 = r11.f()
            java.lang.String r12 = r12.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: aw4.b0.getSearchSuggestionData(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getTeachSearchData(java.lang.String str) {
        aw4.y c17;
        com.tencent.mars.xlog.Log.i(this.f14850f, "getTeachSearchData = %s", str);
        if (str == null) {
            return f().toString();
        }
        aw4.p o17 = o();
        if (o17 != null && (c17 = o17.c()) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                kotlin.jvm.internal.o.d(next);
                hashMap.put(next, jSONObject.opt(next));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchQueryData", "RcmGuideSearchWebData, getTeachSearchData: %s", hashMap);
            int e17 = com.tencent.mm.plugin.websearch.l2.e(hashMap, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int e18 = com.tencent.mm.plugin.websearch.l2.e(hashMap, "type", 0);
            java.lang.String str2 = (java.lang.String) hashMap.get("requestId");
            java.lang.String str3 = (java.lang.String) hashMap.get("guideInfo");
            java.lang.String str4 = (java.lang.String) hashMap.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            gm0.j1.d().g(new su4.z1(e17, e18, com.tencent.mm.plugin.websearch.l2.a(9), 0, f17, su4.o2.d("discoverSearchEntry").optLong("guideParam"), str2, str4, str3, c17.i()));
        }
        return g().toString();
    }

    public final aw4.p o() {
        av4.j jVar = this.f14326a;
        if (jVar instanceof aw4.p) {
            return (aw4.p) jVar;
        }
        return null;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String openEmojiDesignerPage(java.lang.String str) {
        java.lang.String str2 = "";
        java.lang.String str3 = this.f14850f;
        com.tencent.mars.xlog.Log.i(str3, "openEmojiDesignerPage %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            jSONObject.optInt("precedingScene", 0);
            jSONObject.optInt("entranceScene", 0);
            boolean optBoolean = jSONObject.optBoolean("fromPop", true);
            java.lang.String optString = jSONObject.optString("searchId", "");
            java.lang.String optString2 = jSONObject.optString("docId", "");
            java.lang.String optString3 = jSONObject.optString("designerId", "");
            java.lang.String optString4 = jSONObject.optString("designerName", "");
            java.lang.String optString5 = jSONObject.optString("designerThumbUrl", "");
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            qk.v vVar = new qk.v();
            vVar.f364155a = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(optInt));
            vVar.f364042v = optBoolean;
            if (optString == null) {
                optString = "";
            }
            vVar.f364037q = optString;
            if (optString2 == null) {
                optString2 = "";
            }
            vVar.f364038r = optString2;
            if (optString3 == null) {
                optString3 = "";
            }
            vVar.f364028h = optString3;
            if (optString4 == null) {
                optString4 = "";
            }
            vVar.f364030j = optString4;
            if (optString5 != null) {
                str2 = optString5;
            }
            vVar.f364031k = str2;
            vVar.f364156b = true;
            aw4.p o17 = o();
            if (o17 == null) {
                java.lang.String jSONObject2 = f().toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                return jSONObject2;
            }
            com.tencent.mm.feature.emoji.api.q6 q6Var = (com.tencent.mm.feature.emoji.api.q6) i95.n0.c(com.tencent.mm.feature.emoji.api.q6.class);
            if (q6Var == null) {
                com.tencent.mars.xlog.Log.e(str3, "emoticon page service not found");
                java.lang.String jSONObject3 = f().toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                return jSONObject3;
            }
            ((com.tencent.mm.feature.emoji.h4) q6Var).wi(o17.H(), vVar);
            java.lang.String jSONObject4 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str3, e17, "openEmojiDesignerPage", new java.lang.Object[0]);
            java.lang.String jSONObject5 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String openEmojiProductPage(java.lang.String str) {
        java.lang.String str2 = this.f14850f;
        com.tencent.mars.xlog.Log.i(str2, "openEmojiProductPage %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("productId");
            int optInt = jSONObject.optInt("precedingScene", 0);
            int optInt2 = jSONObject.optInt("entranceScene", 0);
            boolean optBoolean = jSONObject.optBoolean("fromPop", true);
            java.lang.String optString2 = jSONObject.optString("searchId", "");
            java.lang.String optString3 = jSONObject.optString("docId", "");
            jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            kotlin.jvm.internal.o.d(optString);
            qk.c0 c0Var = new qk.c0(optString);
            c0Var.f364198g = optInt;
            c0Var.f364155a = optInt2;
            c0Var.f364205n = optBoolean;
            kotlin.jvm.internal.o.d(optString2);
            c0Var.f364201j = optString2;
            kotlin.jvm.internal.o.d(optString3);
            c0Var.f364202k = optString3;
            aw4.p o17 = o();
            if (o17 == null) {
                return f().toString();
            }
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var == null) {
                com.tencent.mars.xlog.Log.e(str2, "emoticon liteapp service not found");
                return f().toString();
            }
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(o17.H(), c0Var);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str2, e17, "openEmojiProductPage", new java.lang.Object[0]);
            return f().toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9 A[Catch: Exception -> 0x017d, TryCatch #0 {Exception -> 0x017d, blocks: (B:3:0x0012, B:54:0x0075, B:5:0x007a, B:10:0x00bc, B:12:0x00c9, B:13:0x00d0, B:15:0x00eb, B:16:0x00f0, B:32:0x0111, B:33:0x012e, B:37:0x0116, B:38:0x011b, B:39:0x0120, B:40:0x0125, B:41:0x012a, B:42:0x00ee), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb A[Catch: Exception -> 0x017d, TryCatch #0 {Exception -> 0x017d, blocks: (B:3:0x0012, B:54:0x0075, B:5:0x007a, B:10:0x00bc, B:12:0x00c9, B:13:0x00d0, B:15:0x00eb, B:16:0x00f0, B:32:0x0111, B:33:0x012e, B:37:0x0116, B:38:0x011b, B:39:0x0120, B:40:0x0125, B:41:0x012a, B:42:0x00ee), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012a A[Catch: Exception -> 0x017d, TryCatch #0 {Exception -> 0x017d, blocks: (B:3:0x0012, B:54:0x0075, B:5:0x007a, B:10:0x00bc, B:12:0x00c9, B:13:0x00d0, B:15:0x00eb, B:16:0x00f0, B:32:0x0111, B:33:0x012e, B:37:0x0116, B:38:0x011b, B:39:0x0120, B:40:0x0125, B:41:0x012a, B:42:0x00ee), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee A[Catch: Exception -> 0x017d, TryCatch #0 {Exception -> 0x017d, blocks: (B:3:0x0012, B:54:0x0075, B:5:0x007a, B:10:0x00bc, B:12:0x00c9, B:13:0x00d0, B:15:0x00eb, B:16:0x00f0, B:32:0x0111, B:33:0x012e, B:37:0x0116, B:38:0x011b, B:39:0x0120, B:40:0x0125, B:41:0x012a, B:42:0x00ee), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String openWeAppPage(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw4.b0.openWeAppPage(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String openWeAppProfile(java.lang.String str) {
        java.lang.String str2 = this.f14850f;
        com.tencent.mars.xlog.Log.i(str2, "openWeAppProfile %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("searchId", "");
            java.lang.String optString2 = jSONObject.optString("docId", "");
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int optInt2 = jSONObject.optInt("fromScene", 0);
            int optInt3 = jSONObject.optInt("type", 0);
            java.lang.String optString3 = jSONObject.optString("weAppUsername", "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("stat_scene", 8);
            bundle.putString("stat_search_id", optString);
            java.lang.String str3 = optString + ':' + optString2 + ':' + optInt + ':' + optInt3;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_username", optString3);
            intent.putExtra("key_can_swipe_back", true);
            intent.putExtra("key_from_scene", optInt2);
            intent.putExtra("key_scene_note", str3);
            intent.putExtra("_stat_obj", bundle);
            aw4.p o17 = o();
            if (o17 == null) {
                return f().toString();
            }
            j45.l.j(o17.H(), "appbrand", ".ui.AppBrandProfileUI", intent, null);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str2, e17, me1.c.NAME, new java.lang.Object[0]);
            return f().toString();
        }
    }

    public final void p(boolean z17, java.lang.String json, java.lang.String requestId) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(json, "json");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("newQuery", z17);
            jSONObject.put("json", json);
            jSONObject.put("requestId", requestId);
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f14326a;
        if (jVar == null || (webView = jVar.getWebView()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onMMWebSearchDataReady", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onMMWebSearchDataReady", "onMMWebSearchDataReady", jSONObject2}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(webView, format));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    public final void q(boolean z17, java.lang.String json, java.lang.String requestId) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(json, "json");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("newQuery", z17);
            jSONObject.put("json", json);
            jSONObject.put("requestId", requestId);
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f14326a;
        if (jVar == null || (webView = jVar.getWebView()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchDataReady", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchDataReady", "onSearchDataReady", jSONObject2}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(webView, format));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    public final void r(java.lang.String query, java.lang.String custom) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(custom, "custom");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("query", query);
            jSONObject.put("custom", custom);
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f14326a;
        if (jVar == null || (webView = jVar.getWebView()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchInputChange", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchInputChange", "onSearchInputChange", jSONObject2}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(webView, format));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    public final void s(java.lang.String query, java.lang.String custom, java.lang.Integer num) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(custom, "custom");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("query", query);
            jSONObject.put("custom", custom);
            if (num != null) {
                jSONObject.put("fromRecommendSearchQuery", num.intValue());
            }
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f14326a;
        if (jVar == null || (webView = jVar.getWebView()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchInputConfirm", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchInputConfirm", "onSearchInputConfirm", jSONObject2}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(webView, format));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String setSearchInputWord(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f14850f, "setSearchInputWord " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            pm0.v.X(new aw4.a0(this, jSONObject.optString("word", ""), jSONObject.optBoolean("isInputChange", false)));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String startSearchItemDetailPage(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f14850f, "startSearchItemDetailPage " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int optInt2 = jSONObject.optInt("type", 0);
            int optInt3 = jSONObject.optInt("subType", 0);
            java.lang.String optString = jSONObject.optString("srcUserName", "");
            java.lang.String optString2 = jSONObject.optString("jumpUrl", "");
            java.lang.String optString3 = jSONObject.optString("cookie", "");
            java.lang.String optString4 = jSONObject.optString("publishId", "");
            int optInt4 = jSONObject.optInt("payScene", 0);
            aw4.z zVar = f14849g;
            if (optInt2 == 1) {
                zVar.b(jSONObject);
            } else if (optInt2 == 2 || optInt2 == 4 || optInt2 == 16) {
                kotlin.jvm.internal.o.d(optString2);
                kotlin.jvm.internal.o.d(optString4);
                kotlin.jvm.internal.o.d(optString);
                kotlin.jvm.internal.o.d(optString3);
                aw4.z.a(zVar, optString2, optString4, optInt4, optString, optInt, optInt3, optString3);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    public final void t(java.lang.String json) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(json, "json");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("json", json);
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f14326a;
        if (jVar == null || (webView = jVar.getWebView()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchSuggestionDataReady", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchSuggestionDataReady", "onSearchSuggestionDataReady", jSONObject2}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(webView, format));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }
}
