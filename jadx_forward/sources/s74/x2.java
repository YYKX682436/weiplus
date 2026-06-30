package s74;

/* loaded from: classes4.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final s74.x2 f486122a = new s74.x2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f486123b = kz5.c0.k(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "image", "button", "layout", "mainElement", "easyBuyIconContainer", "separator", "tagContainer", "tagElement", "downloadComplianceContainer", "gridElementContainer", "gridElement", "liveStatusContainer", "liveLikeAnimationContainer", "promotionContainer", "rollContainer", "adBulletScreenContainer");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f486124c = kz5.c0.k("color", "background-color", "hover-color", "hover-background-color", "scalex", "scaley", "translatex", "translatey", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, "rotatex", "rotatey", "alpha");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f486125d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f486126e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f486127f = new java.util.LinkedHashMap();

    public static final boolean a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        boolean z17 = false;
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return false;
        }
        java.util.Map map = f486126e;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.LinkedHashMap) map).get(str), java.lang.Boolean.TRUE);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                    return b17;
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                org.json.JSONObject c17 = f486122a.c(str);
                if (c17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.DynamicInfoChecker", "parse json error!!");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                    return false;
                }
                s74.t2 t2Var = new s74.t2(c17);
                s74.u2 u2Var = new s74.u2(c17);
                s74.s2 s2Var = new s74.s2(c17);
                if (((java.lang.Boolean) t2Var.mo152xb9724478()).booleanValue() && ((java.lang.Boolean) u2Var.mo152xb9724478()).booleanValue() && ((java.lang.Boolean) s2Var.mo152xb9724478()).booleanValue()) {
                    z17 = true;
                }
                synchronized (map) {
                    try {
                        map.put(str, java.lang.Boolean.valueOf(z17));
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                        throw th6;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.DynamicInfoChecker", "checkLayoutDynamicInfo end! cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                return z17;
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                throw th7;
            }
        }
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleDebugDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        if (c17903x3b438f4 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDebugDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return;
        }
        if (!ca4.m0.d0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDebugDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return;
        }
        try {
            int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19913x85fbbb26());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.DynamicInfoChecker.debug", "debug, RepairerConfigDynamicAd value=" + h17);
            if (h17 == 1) {
                java.lang.String b17 = n84.y.b(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalFilesDir(""), "json"));
                if (android.text.TextUtils.isEmpty(b17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DynamicView.DynamicInfoChecker.debug", "debug, local dynamicInfo empty");
                } else {
                    c17903x3b438f4.f38169xb503b96a = b17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DynamicView.DynamicInfoChecker.debug", "debug, overwrite dynamicInfo");
                }
            } else if (h17 == 2) {
                c17903x3b438f4.f38169xb503b96a = "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DynamicView.DynamicInfoChecker.debug", "debug, forbid dynamic ad");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.DynamicInfoChecker.debug", "debug, handleDebugDynamicInfo, exp=" + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDebugDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e() {
        /*
            java.lang.String r0 = "DynamicView.DynamicInfoChecker"
            java.lang.String r1 = "isCacheDynamicViewDisabled called "
            java.lang.String r2 = "isCacheDynamicViewDisabled"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r4 = 0
            java.lang.Class<e42.e0> r5 = e42.e0.class
            i95.m r5 = i95.n0.c(r5)     // Catch: java.lang.Throwable -> L30
            e42.e0 r5 = (e42.e0) r5     // Catch: java.lang.Throwable -> L30
            e42.c0 r6 = e42.c0.clicfg_ad_timeline_dynamic_feed_cache_view_disbaled_android     // Catch: java.lang.Throwable -> L30
            h62.d r5 = (h62.d) r5     // Catch: java.lang.Throwable -> L30
            int r5 = r5.Ni(r6, r4)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r6.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2e
            goto L44
        L2e:
            r1 = move-exception
            goto L32
        L30:
            r1 = move-exception
            r5 = r4
        L32:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "isCacheDynamicViewDisabled, exp="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L44:
            if (r5 <= 0) goto L47
            r4 = 1
        L47:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.x2.e():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean g() {
        /*
            java.lang.String r0 = "the cover end support value is "
            java.lang.String r1 = "supportDynamicViewEndCover"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
            r3 = 0
            kotlin.Result$Companion r4 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<e42.e0> r4 = e42.e0.class
            i95.m r4 = i95.n0.c(r4)     // Catch: java.lang.Throwable -> L3c
            e42.e0 r4 = (e42.e0) r4     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L21
            e42.c0 r5 = e42.c0.clicfg_sns_ad_dynamic_template_end_cover_support     // Catch: java.lang.Throwable -> L3c
            h62.d r4 = (h62.d) r4     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.Ni(r5, r3)     // Catch: java.lang.Throwable -> L3c
            goto L22
        L21:
            r4 = r3
        L22:
            java.lang.String r5 = "DynamicView.DynamicInfoChecker"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L3a
            r6.append(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L3a
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)     // Catch: java.lang.Throwable -> L3a
            jz5.f0 r0 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)     // Catch: java.lang.Throwable -> L3a
            goto L48
        L3a:
            r0 = move-exception
            goto L3e
        L3c:
            r0 = move-exception
            r4 = r3
        L3e:
            kotlin.Result$Companion r5 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r0 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r0)
            java.lang.Object r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)
        L48:
            boolean r5 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(r0)
            if (r5 == 0) goto L57
            java.lang.Throwable r5 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r0)
            java.lang.String r6 = "catching_tag"
            ca4.q.c(r6, r5)
        L57:
            p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(r0)
            if (r4 <= 0) goto L5d
            r3 = 1
        L5d:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.x2.g():boolean");
    }

    public final boolean b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.DynamicInfoChecker", "error obj is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return false;
        }
        if (!f486123b.contains(jSONObject.optString("type"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.DynamicInfoChecker", "error type " + jSONObject.optString("type") + ", id=" + jSONObject.optString(dm.i4.f66865x76d1ec5a));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return false;
        }
        if (jSONObject.has("children")) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("children");
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                    return false;
                }
                if (!b(optJSONObject)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                    return false;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLayoutDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        return true;
    }

    public final org.json.JSONObject c(java.lang.String str) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return null;
        }
        java.util.Map map = f486125d;
        synchronized (map) {
            try {
                jSONObject = ((java.util.LinkedHashMap) map).get(str) != null ? (org.json.JSONObject) ((java.util.LinkedHashMap) map).get(str) : null;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                throw th6;
            }
        }
        if (jSONObject == null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
                synchronized (map) {
                    try {
                        if (((java.util.LinkedHashMap) map).get(str) != null) {
                            jSONObject2 = (org.json.JSONObject) ((java.util.LinkedHashMap) map).get(str);
                        } else {
                            map.put(str, jSONObject2);
                        }
                    } catch (java.lang.Throwable th7) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
                        throw th7;
                    }
                }
                jSONObject = jSONObject2;
            } catch (java.lang.Throwable th8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("DynamicView.DynamicInfoChecker", th8, "json error!", new java.lang.Object[0]);
            }
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.DynamicInfoChecker", "parse json error!!");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2008, 10);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        return jSONObject;
    }

    public final java.lang.String f(org.json.JSONObject jSONObject, java.lang.String jsonKey, i64.q adDataModel) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseStringValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonKey, "jsonKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adDataModel, "adDataModel");
        java.lang.String optString = jSONObject.optString(jsonKey);
        s74.q4 q4Var = s74.q4.f486046a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        java.lang.String w17 = q4Var.w(adDataModel, optString);
        if (w17 != null) {
            optString = w17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseStringValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        return optString;
    }

    public final void h(org.json.JSONObject jSONObject, i64.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("traversalObjAndPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.DynamicInfoChecker", "error obj is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("traversalObjAndPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4 = qVar.f370821b;
        if (jSONObject.has("bind-click-action-info")) {
            java.lang.String optString = jSONObject.optString("bind-click-action-info");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(c17903x3b438f4.f38257x4d212eed, c17903x3b438f4.f38256xfef403e4 + '.' + optString).g(qVar.f370820a);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("type"), "image")) {
            java.lang.String f17 = f(jSONObject, "url", qVar);
            a84.m.d(f17, new s74.v2(f17));
            java.lang.String f18 = f(jSONObject, "url-dark", qVar);
            if ((!r26.n0.N(f18)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f18, f17)) {
                a84.m.d(f18, new s74.w2(f18));
            }
        }
        if (jSONObject.has("children")) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("children");
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                h(jSONArray.optJSONObject(i17), qVar);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("traversalObjAndPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker");
    }
}
