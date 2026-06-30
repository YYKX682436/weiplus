package aw4;

/* loaded from: classes.dex */
public abstract class b0 extends aw4.w {

    /* renamed from: g, reason: collision with root package name */
    public static final aw4.z f96382g = new aw4.z(null);

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f96383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(aw4.p uiComponent) {
        super(uiComponent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponent, "uiComponent");
        this.f96383f = "MicroMsg.WebSearch.TagSearchJSApi";
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getMMWebSearchData */
    public final java.lang.String m9164x7a1f2810(java.lang.String str) {
        aw4.y c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96383f, "getSearchDataMore " + str);
        if (str == null) {
            java.lang.String jSONObject = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        aw4.p o17 = o();
        if (o17 != null && (c17 = o17.c()) != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                hashMap.put(next, jSONObject2.opt(next));
            }
            gm0.j1.d().g(new su4.n1(c17.g(hashMap)));
        }
        java.lang.String jSONObject3 = g().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getSearchData */
    public java.lang.String m9165xc3e06d68(java.lang.String str) {
        aw4.y c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96383f, "getSearchData " + str);
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
    /* renamed from: getSearchSuggestionData */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m9166xc43d740c(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getSearchSuggestionData "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r11.f96383f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
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
            r12.f494595b = r3     // Catch: java.lang.Exception -> L3b
        L3b:
            java.lang.String r3 = "type"
            r4 = 0
            int r3 = r2.optInt(r3, r4)     // Catch: java.lang.Exception -> Le0
            r12.f494597d = r3     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "scene"
            int r3 = r2.optInt(r3, r4)     // Catch: java.lang.Exception -> Le0
            r12.f494599f = r3     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "isHomePage"
            int r3 = r2.optInt(r3, r4)     // Catch: java.lang.Exception -> Le0
            r12.f494594a = r3     // Catch: java.lang.Exception -> Le0
            int r0 = r0.a()     // Catch: java.lang.Exception -> Le0
            r12.f494610q = r0     // Catch: java.lang.Exception -> Le0
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
            java.util.LinkedList r3 = r12.f494605l     // Catch: java.lang.Exception -> Le0
            r3.add(r0)     // Catch: java.lang.Exception -> Le0
        L7b:
            java.lang.String r0 = "requestType"
            int r0 = r2.optInt(r0, r4)     // Catch: java.lang.Exception -> Le0
            java.lang.String r3 = "extReqParams"
            java.lang.String r3 = r2.optString(r3, r1)     // Catch: java.lang.Exception -> Le0
            java.lang.String r5 = "optString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r5)     // Catch: java.lang.Exception -> Le0
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)     // Catch: java.lang.Exception -> Le0
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
            r8.f471321d = r9     // Catch: java.lang.Exception -> Lcb
            java.lang.String r9 = "uintValue"
            int r9 = r7.optInt(r9, r4)     // Catch: java.lang.Exception -> Lcb
            long r9 = (long) r9     // Catch: java.lang.Exception -> Lcb
            r8.f471322e = r9     // Catch: java.lang.Exception -> Lcb
            java.lang.String r9 = "textValue"
            java.lang.String r7 = r7.optString(r9, r1)     // Catch: java.lang.Exception -> Lcb
            r8.f471323f = r7     // Catch: java.lang.Exception -> Lcb
            java.util.LinkedList r7 = r12.f494608o     // Catch: java.lang.Exception -> Lcb
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
        throw new UnsupportedOperationException("Method not decompiled: aw4.b0.m9166xc43d740c(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getTeachSearchData */
    public java.lang.String m9167xdb011d91(java.lang.String str) {
        aw4.y c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96383f, "getTeachSearchData = %s", str);
        if (str == null) {
            return f().toString();
        }
        aw4.p o17 = o();
        if (o17 != null && (c17 = o17.c()) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                hashMap.put(next, jSONObject.opt(next));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchQueryData", "RcmGuideSearchWebData, getTeachSearchData: %s", hashMap);
            int e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(hashMap, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            int e18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(hashMap, "type", 0);
            java.lang.String str2 = (java.lang.String) hashMap.get("requestId");
            java.lang.String str3 = (java.lang.String) hashMap.get("guideInfo");
            java.lang.String str4 = (java.lang.String) hashMap.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            gm0.j1.d().g(new su4.z1(e17, e18, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(9), 0, f17, su4.o2.d("discoverSearchEntry").optLong("guideParam"), str2, str4, str3, c17.i()));
        }
        return g().toString();
    }

    public final aw4.p o() {
        av4.j jVar = this.f95859a;
        if (jVar instanceof aw4.p) {
            return (aw4.p) jVar;
        }
        return null;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openEmojiDesignerPage */
    public final java.lang.String m9168x10689256(java.lang.String str) {
        java.lang.String str2 = "";
        java.lang.String str3 = this.f96383f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "openEmojiDesignerPage %s", str);
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
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            qk.v vVar = new qk.v();
            vVar.f445688a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(optInt));
            vVar.f445575v = optBoolean;
            if (optString == null) {
                optString = "";
            }
            vVar.f445570q = optString;
            if (optString2 == null) {
                optString2 = "";
            }
            vVar.f445571r = optString2;
            if (optString3 == null) {
                optString3 = "";
            }
            vVar.f445561h = optString3;
            if (optString4 == null) {
                optString4 = "";
            }
            vVar.f445563j = optString4;
            if (optString5 != null) {
                str2 = optString5;
            }
            vVar.f445564k = str2;
            vVar.f445689b = true;
            aw4.p o17 = o();
            if (o17 == null) {
                java.lang.String jSONObject2 = f().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                return jSONObject2;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6 q6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6.class);
            if (q6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "emoticon page service not found");
                java.lang.String jSONObject3 = f().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                return jSONObject3;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h4) q6Var).wi(o17.H(), vVar);
            java.lang.String jSONObject4 = g().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, e17, "openEmojiDesignerPage", new java.lang.Object[0]);
            java.lang.String jSONObject5 = f().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openEmojiProductPage */
    public final java.lang.String m9169x92c68a62(java.lang.String str) {
        java.lang.String str2 = this.f96383f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "openEmojiProductPage %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("productId");
            int optInt = jSONObject.optInt("precedingScene", 0);
            int optInt2 = jSONObject.optInt("entranceScene", 0);
            boolean optBoolean = jSONObject.optBoolean("fromPop", true);
            java.lang.String optString2 = jSONObject.optString("searchId", "");
            java.lang.String optString3 = jSONObject.optString("docId", "");
            jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            qk.c0 c0Var = new qk.c0(optString);
            c0Var.f445731g = optInt;
            c0Var.f445688a = optInt2;
            c0Var.f445738n = optBoolean;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            c0Var.f445734j = optString2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
            c0Var.f445735k = optString3;
            aw4.p o17 = o();
            if (o17 == null) {
                return f().toString();
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
            if (p6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "emoticon liteapp service not found");
                return f().toString();
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(o17.H(), c0Var);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e17, "openEmojiProductPage", new java.lang.Object[0]);
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
    /* renamed from: openWeAppPage */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m9170x114daa78(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw4.b0.m9170x114daa78(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: openWeAppProfile */
    public final java.lang.String m9171xba85cd20(java.lang.String str) {
        java.lang.String str2 = this.f96383f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "openWeAppProfile %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("searchId", "");
            java.lang.String optString2 = jSONObject.optString("docId", "");
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e17, me1.c.f72883x24728b, new java.lang.Object[0]);
            return f().toString();
        }
    }

    public final void p(boolean z17, java.lang.String json, java.lang.String requestId) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("newQuery", z17);
            jSONObject.put("json", json);
            jSONObject.put("requestId", requestId);
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f95859a;
        if (jVar == null || (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onMMWebSearchDataReady", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onMMWebSearchDataReady", "onMMWebSearchDataReady", jSONObject2}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    public final void q(boolean z17, java.lang.String json, java.lang.String requestId) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("newQuery", z17);
            jSONObject.put("json", json);
            jSONObject.put("requestId", requestId);
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f95859a;
        if (jVar == null || (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchDataReady", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchDataReady", "onSearchDataReady", jSONObject2}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    public final void r(java.lang.String query, java.lang.String custom) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(custom, "custom");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("query", query);
            jSONObject.put("custom", custom);
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f95859a;
        if (jVar == null || (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchInputChange", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchInputChange", "onSearchInputChange", jSONObject2}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    public final void s(java.lang.String query, java.lang.String custom, java.lang.Integer num) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(custom, "custom");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("query", query);
            jSONObject.put("custom", custom);
            if (num != null) {
                jSONObject.put("fromRecommendSearchQuery", num.intValue());
            }
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f95859a;
        if (jVar == null || (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchInputConfirm", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchInputConfirm", "onSearchInputConfirm", jSONObject2}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: setSearchInputWord */
    public java.lang.String m9172x1183a06a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96383f, "setSearchInputWord " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            pm0.v.X(new aw4.a0(this, jSONObject.optString("word", ""), jSONObject.optBoolean("isInputChange", false)));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: startSearchItemDetailPage */
    public java.lang.String m9173xd056593d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f96383f, "startSearchItemDetailPage " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            int optInt2 = jSONObject.optInt("type", 0);
            int optInt3 = jSONObject.optInt("subType", 0);
            java.lang.String optString = jSONObject.optString("srcUserName", "");
            java.lang.String optString2 = jSONObject.optString("jumpUrl", "");
            java.lang.String optString3 = jSONObject.optString("cookie", "");
            java.lang.String optString4 = jSONObject.optString("publishId", "");
            int optInt4 = jSONObject.optInt("payScene", 0);
            aw4.z zVar = f96382g;
            if (optInt2 == 1) {
                zVar.b(jSONObject);
            } else if (optInt2 == 2 || optInt2 == 4 || optInt2 == 16) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                aw4.z.a(zVar, optString2, optString4, optInt4, optString, optInt, optInt3, optString3);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    public final void t(java.lang.String json) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("json", json);
        } catch (java.lang.Exception unused) {
        }
        av4.j jVar = this.f95859a;
        if (jVar == null || (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) == null) {
            return;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onSearchSuggestionDataReady", jSONObject2);
            java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onSearchSuggestionDataReady", "onSearchSuggestionDataReady", jSONObject2}, 3));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }
}
