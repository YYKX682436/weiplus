package h64;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f360841a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f360842b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f360843c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f360844d = "";

    public final void a(java.lang.String canvasId, java.lang.String mbNodeValue, java.util.Map values) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convert", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasId, "canvasId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbNodeValue, "mbNodeValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LandingPageMagic", "parse mb node info failed! exception: [" + e17.getMessage() + ']');
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f360844d, canvasId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LandingPageMagic", "the canvas mb info has been parsed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
            return;
        }
        this.f360844d = canvasId;
        if (e(mbNodeValue)) {
            f(values);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LandingPageMagic", "the value, return from parse mb node, is false");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convert", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
    }

    public final h64.b b(org.json.JSONObject jSONObject, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generateMBNodeInfo", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        java.lang.String optString = jSONObject.optString(dm.i4.f66865x76d1ec5a);
        java.lang.String optString2 = jSONObject.optString("linkId");
        java.lang.String optString3 = jSONObject.optString("frameSetName");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        int optInt3 = jSONObject.optInt("fullScreen");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("componentItem");
        if (optJSONObject != null) {
            if (!(optString3 == null || r26.n0.N(optString3))) {
                if (!(optString == null || r26.n0.N(optString))) {
                    if (!(optString2 == null || r26.n0.N(optString2))) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                        h64.b bVar = new h64.b(optString3, optString, optString2, optInt, optInt2, optInt3, optJSONObject, str);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateMBNodeInfo", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                        return bVar;
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LandingPageMagic", "generateMBNodeInfo::dsl, frameSetName, id or linkId are null or empty!! ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateMBNodeInfo", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        return null;
    }

    public final boolean c(h64.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseAndCheckMBNode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        java.lang.String a17 = bVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComponents", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComponents", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseAndCheckJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        boolean d17 = d(bVar.f360851g, linkedHashMap);
        if (d17) {
            this.f360843c.put(a17, linkedHashMap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseAndCheckJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        if (d17) {
            java.util.Map map = this.f360841a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFrameSetName", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFrameSetName", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            java.lang.String a18 = bVar.a();
            java.lang.String str = bVar.f360845a;
            java.lang.String str2 = (java.lang.String) map.put(str, a18);
            if (str2 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("there is already an id [");
                sb6.append(str2);
                sb6.append("] with frame set name [");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFrameSetName", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFrameSetName", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                sb6.append(str);
                sb6.append("], the new id is [");
                sb6.append(bVar.a());
                sb6.append(']');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LandingPageMagic", sb6.toString());
            }
            h64.b bVar2 = (h64.b) this.f360842b.put(bVar.a(), bVar);
            if (bVar2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LandingPageMagic", "there is already an node [" + bVar2 + "] with id [" + bVar.a() + "], the new node is [" + bVar + ']');
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LandingPageMagic", "the parseAndCheckJSComponentSummary return false");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseAndCheckMBNode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        return d17;
    }

    public final boolean d(org.json.JSONObject jSONObject, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        int optInt = jSONObject.optInt("type");
        int optInt2 = jSONObject.optInt("subType");
        java.lang.String optString = jSONObject.optString(dm.i4.f66865x76d1ec5a);
        boolean z17 = false;
        if (optInt != 0) {
            boolean z18 = true;
            if (!(optString == null || r26.n0.N(optString))) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("type", optInt);
                jSONObject2.put("cid", optString);
                if (optInt2 > 0) {
                    jSONObject2.put("subType", optInt2);
                }
                map.put(optString, jSONObject2);
                if (!jSONObject.has("layoutItems")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                    return true;
                }
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("layoutItems");
                java.lang.Object opt = optJSONObject != null ? optJSONObject.opt("componentItem") : null;
                if (opt instanceof org.json.JSONObject) {
                    z17 = d((org.json.JSONObject) opt, map);
                } else if (opt instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.Object opt2 = jSONArray.opt(i17);
                        if (opt2 instanceof org.json.JSONObject) {
                            z18 = d((org.json.JSONObject) opt2, map);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LandingPageMagic", "the element is not a json object, sure???");
                            z18 = false;
                        }
                        if (!z18) {
                            break;
                        }
                    }
                    z17 = z18;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LandingPageMagic", "the componentItem is not JSON ???");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                return z17;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LandingPageMagic", "the type is 0 or id is empty!!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d A[LOOP:0: B:13:0x0038->B:20:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[EDGE_INSN: B:21:0x0080->B:26:0x0080 BREAK  A[LOOP:0: B:13:0x0038->B:20:0x007d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "parseMBNodeInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            org.json.JSONTokener r2 = new org.json.JSONTokener
            r2.<init>(r10)
            java.lang.Object r2 = r2.nextValue()
            boolean r3 = r2 instanceof org.json.JSONObject
            java.lang.String r4 = "LandingPageMagic"
            r5 = 0
            if (r3 == 0) goto L2c
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            h64.b r10 = r9.b(r2, r10)
            if (r10 == 0) goto L25
            boolean r5 = r9.c(r10)
            goto L81
        L25:
            java.lang.String r10 = "mb node value is null!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r10)
            goto L81
        L2c:
            boolean r3 = r2 instanceof org.json.JSONArray
            r6 = 1
            if (r3 == 0) goto L80
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            int r3 = r2.length()
            r7 = r5
        L38:
            if (r7 >= r3) goto L80
            java.lang.Object r6 = r2.get(r7)
            boolean r8 = r6 instanceof org.json.JSONObject
            if (r8 == 0) goto L67
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            h64.b r6 = r9.b(r6, r10)
            if (r6 == 0) goto L4f
            boolean r6 = r9.c(r6)
            goto L7a
        L4f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "mb node value is null, the idx is "
            r6.<init>(r8)
            r6.append(r7)
            r8 = 33
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r6)
            goto L79
        L67:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "there is an element that is not JSONObject object!! idx is "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r6)
        L79:
            r6 = r5
        L7a:
            if (r6 != 0) goto L7d
            goto L80
        L7d:
            int r7 = r7 + 1
            goto L38
        L80:
            r5 = r6
        L81:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h64.a.e(java.lang.String):boolean");
    }

    public final void f(java.util.Map map) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceNormalLinkedNodeWithMBNode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        java.util.Map map2 = this.f360842b;
        if (map2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LandingPageMagic", "the magic node is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceNormalLinkedNodeWithMBNode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
            return;
        }
        for (h64.b bVar : ((java.util.LinkedHashMap) map2).values()) {
            bVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLinkId", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLinkId", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findValueKeyWithId", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
            java.util.Iterator it = map.entrySet().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findValueKeyWithId", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getValue(), bVar.f360847c) && r26.i0.o((java.lang.String) entry.getKey(), ".id", false, 2, null)) {
                    str = (java.lang.String) entry.getKey();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findValueKeyWithId", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                    break;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LandingPageMagic", "the found key is [" + str + ']');
            if (str != null) {
                java.lang.String s07 = r26.n0.s0(str, ".id", str);
                java.lang.String concat = s07.concat(".type");
                if (map.containsKey(concat)) {
                    map.put(concat, "150");
                    map.put(str, bVar.a());
                    java.lang.String concat2 = s07.concat(".layoutWidth");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWidth", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWidth", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                    map.put(concat2, java.lang.String.valueOf(bVar.f360848d));
                    java.lang.String concat3 = s07.concat(".layoutHeight");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeight", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeight", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                    map.put(concat3, java.lang.String.valueOf(bVar.f360849e));
                    java.lang.String concat4 = s07.concat(".dsl");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCompDsl", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCompDsl", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                    map.put(concat4, bVar.f360852h);
                    java.lang.String concat5 = s07.concat(".frameSetName");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFrameSetName", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFrameSetName", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                    map.put(concat5, bVar.f360845a);
                    java.lang.String concat6 = s07.concat(".fullScreen");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFullScreen", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFullScreen", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                    map.put(concat6, java.lang.String.valueOf(bVar.f360850f));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceNormalLinkedNodeWithMBNode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
    }
}
