package za4;

/* loaded from: classes4.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f552767a;

    public static android.content.Intent A(java.util.Map map) {
        da4.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseAppMarketIntent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        try {
            aVar = new da4.a(context, map);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MICROMSG.AdAppMarketHelper", "create aAdAppMarketHelper failed!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("newInstance", "com.tencent.mm.plugin.sns.device.appstore.AdAppMarketHelper");
            aVar = null;
        }
        if (aVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseAppMarketIntent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return null;
        }
        android.content.Intent i17 = aVar.i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseAppMarketIntent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return i17;
    }

    public static void B(ab4.d0 d0Var, java.util.Map map, java.lang.String str, int i17, int i18, int i19) {
        java.lang.String str2;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseBaseInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".type"), 0);
        d0Var.f84351e = D1;
        d0Var.f84360q = D1;
        java.lang.String str3 = (java.lang.String) map.get(str + ".id");
        if (str3 == null) {
            str3 = "";
        }
        d0Var.f84350d = str3;
        d0Var.f84352f = o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str + ".paddingTop")), i17, i18, i19);
        d0Var.f84353g = o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str + ".paddingBottom")), i17, i18, i19);
        d0Var.f84354h = o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str + ".paddingLeft")), i17, i18, i19);
        d0Var.f84355i = o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str + ".paddingRight")), i17, i18, i19);
        d0Var.f84359p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".subType"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + ".cellBackgroundColor");
        if (str4 == null) {
            str4 = "";
        }
        d0Var.f84361r = str4;
        java.lang.String str5 = str + ".if";
        if (map.containsKey(str5)) {
            d0Var.f84366w = "1".equals(map.get(str5));
        } else {
            d0Var.f84366w = true;
        }
        java.lang.String str6 = str + ".noReport";
        if (map.containsKey(str6)) {
            d0Var.f84367x = "1".equals(map.get(str6));
        } else {
            d0Var.f84367x = false;
        }
        java.lang.String str7 = (java.lang.String) map.get(str + ".layoutWidth");
        if (str7 == null) {
            str7 = "";
        }
        java.lang.String str8 = (java.lang.String) map.get(str + ".layoutHeight");
        if (str8 == null) {
            str8 = "";
        }
        if (android.text.TextUtils.isEmpty(str7)) {
            str2 = "";
            d0Var.f84356m = 2.1474836E9f;
        } else {
            str2 = "";
            double A1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1(str7);
            if (A1 < 0.0d) {
                d0Var.f84356m = (float) A1;
            } else {
                d0Var.f84356m = o(A1, i17, i18, i19);
            }
        }
        if (android.text.TextUtils.isEmpty(str8)) {
            d0Var.f84357n = 2.1474836E9f;
        } else {
            double A12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1(str8);
            if (A12 < 0.0d) {
                d0Var.f84357n = (float) A12;
            } else {
                d0Var.f84357n = o(A12, i17, i18, i19);
            }
        }
        java.lang.String str9 = (java.lang.String) map.get(str + ".verticalAlignment");
        java.lang.String str10 = (java.lang.String) map.get(str + ".horizontalAlignment");
        if (android.text.TextUtils.isEmpty(str9)) {
            d0Var.f84364u = -1;
            i27 = 0;
        } else {
            i27 = 0;
            d0Var.f84364u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str9, 0);
        }
        if (android.text.TextUtils.isEmpty(str10)) {
            d0Var.f84365v = -1;
        } else {
            d0Var.f84365v = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str10, i27);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".isTwistAnimView");
        d0Var.f84368y = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb6.toString()), 0) == 1;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str);
        sb7.append(".isDefaultTwistCard");
        d0Var.f84369z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb7.toString()), 0) == 1;
        java.lang.String str11 = (java.lang.String) map.get(str + ".twistCardId");
        if (str11 == null) {
            str11 = str2;
        }
        d0Var.A = str11;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(str);
        sb8.append(".isShakeAnimView");
        d0Var.B = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb8.toString()), 0) == 1;
        java.lang.String str12 = (java.lang.String) map.get(str + ".jumpExtInfo");
        d0Var.C = str12 == null ? str2 : str12;
        java.lang.String str13 = str + ".fileSize";
        if (map.containsKey(str13)) {
            d0Var.D = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str13), 0);
        }
        if (d0Var.f84351e == 148) {
            d0Var.f84357n = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseBaseInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
    }

    public static ab4.x0 C(java.util.Map map, java.lang.String str, int i17, int i18, int i19) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseRadarChart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        ab4.x0 x0Var = new ab4.x0();
        try {
            java.lang.String str3 = str + ".radarChart";
            x0Var.F = (java.lang.String) map.get(str3 + ".borderImg");
            x0Var.M = (java.lang.String) map.get(str3 + ".maskImg");
            x0Var.H = (java.lang.String) map.get(str3 + ".coverColor");
            x0Var.I = android.graphics.Color.parseColor((java.lang.String) map.get(str3 + ".labelFont.$color"));
            x0Var.f84440J = (int) o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str3 + ".labelFont.$size")), i17, i18, i19);
            x0Var.K = android.graphics.Color.parseColor((java.lang.String) map.get(str3 + ".scoreFont.$color"));
            x0Var.L = (int) o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str3 + ".scoreFont.$size")), i17, i18, i19);
            x0Var.G = o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str3 + ".borderImgWidth")), i17, i18, i19);
            java.lang.String str4 = str3 + ".itemList.item";
            int i27 = 0;
            while (true) {
                if (i27 != 0) {
                    str2 = str4 + i27;
                } else {
                    str2 = str4;
                }
                ab4.w0 w0Var = new ab4.w0();
                w0Var.f84436a = (java.lang.String) map.get(str2 + ".label");
                w0Var.f84437b = (java.lang.String) map.get(str2 + ".score");
                w0Var.f84438c = (float) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str2 + ".value"));
                if (android.text.TextUtils.isEmpty(w0Var.f84436a) && android.text.TextUtils.isEmpty(w0Var.f84437b)) {
                    break;
                }
                ((java.util.ArrayList) x0Var.N).add(w0Var);
                i27++;
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseRadarChart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return x0Var;
    }

    public static java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        java.lang.String str = null;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the snsinfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return null;
        }
        if (!c17933xe8d1b226.m70377x3172ed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the snsinfo is not a ad");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 m70351xaa22b9ed = c17933xe8d1b226.m70351xaa22b9ed();
        if (m70351xaa22b9ed == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the adSnsInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        if (m70354x74235b3e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the adxml is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = c17933xe8d1b226.m70346x10413e67();
        if (m70346x10413e67 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the adInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return null;
        }
        if (!m70354x74235b3e.m70146xae00c4ba()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the snsinfo is not a landingpage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return null;
        }
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = m70346x10413e67.f38097xfc334906;
        if (hashMap == null || hashMap.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the mappedCanvasCardExt is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return null;
        }
        java.lang.String str2 = m70351xaa22b9ed.f67593x28cf0d8f;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = m70346x10413e67.f38097xfc334906;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("ControlLandingPagesLinkedSnsInfoImpl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the adLandingPagesXml is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfoImpl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        } else if (hashMap2 == null || hashMap2.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the mappedCanvasCardExt is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfoImpl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        } else {
            java.util.LinkedList linkedList = new za4.x0(str2, dm.n.f67493x36901555).f552747a;
            for (java.lang.String str3 : hashMap2.keySet()) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    java.lang.String str4 = hashMap2.get(str3);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                        java.util.Iterator it = linkedList.iterator();
                        java.lang.String str5 = null;
                        while (it.hasNext()) {
                            java.util.Iterator it6 = ((za4.g0) it.next()).f552616c.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    break;
                                }
                                ab4.d0 d0Var = (ab4.d0) it6.next();
                                if (d0Var instanceof ab4.h) {
                                    ab4.h hVar = (ab4.h) d0Var;
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f84372z1) && hVar.f84372z1.equals(str3)) {
                                        str5 = hVar.A1;
                                        break;
                                    }
                                }
                            }
                            if (str5 != null) {
                                break;
                            }
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesParseHelper", "old card ext is " + str5 + " and new card ext is " + str4);
                            str2 = str2.replace(str5, str4);
                            try {
                                str2 = str2.replace(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str5), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str4));
                            } catch (java.lang.Exception unused) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "the xml is error");
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfoImpl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            str = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return str;
    }

    public static /* synthetic */ ab4.d0 b(java.util.Map map, int i17, int i18, int i19, int i27, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        ab4.d0 g17 = g(map, i17, i18, i19, i27, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return g17;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String... strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (str == null) {
            str = "";
        }
        java.lang.String join = android.text.TextUtils.join("&", strArr);
        java.lang.String str2 = str.contains("?") ? "&" : "?";
        if (!str.contains("#")) {
            java.lang.String str3 = str + str2 + join;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return str3;
        }
        try {
            int indexOf = str.indexOf("#");
            java.lang.String str4 = str.substring(0, indexOf) + str2 + join + str.substring(indexOf + 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return str4;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "append url params failed, %s", e17.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return str;
        }
    }

    public static java.lang.String d(java.lang.String str, java.lang.String... strArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (strArr == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return str;
        }
        java.net.URI uri = new java.net.URI(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str2 : strArr) {
            sb6.append(str2);
            sb6.append("&");
        }
        if (sb6.length() <= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return str;
        }
        java.lang.StringBuilder deleteCharAt = sb6.deleteCharAt(sb6.length() - 1);
        java.lang.String query = uri.getQuery();
        java.lang.String uri2 = new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query == null ? deleteCharAt.toString() : query + "&" + deleteCharAt.toString(), uri.getFragment()).toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return uri2;
    }

    public static void e(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2) it.next();
            if (s(a2Var.p().f84360q)) {
                arrayList.addAll(((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.a) a2Var).O());
            }
        }
        if (!arrayList.isEmpty()) {
            e(arrayList);
            list.addAll(arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
    }

    public static ab4.v f(java.util.Map map, java.lang.String str, int i17, int i18, int i19, int i27) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdLandingPageCompentGroup", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        ab4.v vVar = new ab4.v();
        try {
            vVar.G = (android.graphics.Color.parseColor((java.lang.String) map.get(str + ".bgColorTheme")) & 16777215) | (((int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F((java.lang.String) map.get(str + ".bgColorAlpha"), 0.0d) * 255.0d)) << 24);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            vVar.G = android.graphics.Color.argb(51, 0, 0, 0);
        }
        java.lang.String str3 = (str + ".componentGroupList") + ".componentItem";
        int i28 = 0;
        while (true) {
            if (i28 == 0) {
                str2 = str3;
            } else {
                str2 = str3 + i28;
            }
            ab4.d0 g17 = g(map, i17, i18, i19, i27, str2);
            if (g17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLandingPageCompentGroup", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return vVar;
            }
            if (g17.f84366w) {
                vVar.F.add(g17);
            }
            i28++;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:98|99|100|(1:102)|103|(1:105)|(6:109|110|111|112|113|(13:115|116|117|(1:119)|120|(1:122)|123|(1:125)|126|(1:128)|129|(1:131)|132)(31:134|(1:136)|137|(1:139)|140|(1:142)|143|(1:145)|146|(1:148)|149|(1:151)|152|(1:154)|155|(1:157)|158|(1:160)|161|162|117|(0)|120|(0)|123|(0)|126|(0)|129|(0)|132))|167|111|112|113|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x068e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x068f, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageComponentInfo", "RandomEncoreInfo parseFromXml, exp=" + r0.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingEggCardContainerInfo$RandomPickCardTipInfo");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x053d A[Catch: all -> 0x068e, TRY_ENTER, TryCatch #2 {all -> 0x068e, blocks: (B:113:0x0521, B:134:0x053d, B:137:0x055f, B:140:0x057c, B:143:0x0599, B:146:0x05b6, B:149:0x05d3, B:152:0x05f0, B:155:0x0612, B:158:0x066b, B:161:0x0688), top: B:112:0x0521 }] */
    /* JADX WARN: Type inference failed for: r0v78, types: [ab4.d0, ab4.e0] */
    /* JADX WARN: Type inference failed for: r14v13, types: [ab4.d0, ab4.c0] */
    /* JADX WARN: Type inference failed for: r15v10, types: [ab4.d0] */
    /* JADX WARN: Type inference failed for: r15v11, types: [ab4.d0] */
    /* JADX WARN: Type inference failed for: r15v13, types: [ab4.d0, f54.a] */
    /* JADX WARN: Type inference failed for: r15v6, types: [ab4.b0] */
    /* JADX WARN: Type inference failed for: r15v9, types: [ab4.r0] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v11, types: [ab4.d0, f54.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ab4.d0 g(java.util.Map r21, int r22, int r23, int r24, int r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 2249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: za4.z0.g(java.util.Map, int, int, int, int, java.lang.String):ab4.d0");
    }

    public static java.util.List h(java.util.Map map, java.lang.String str, int i17, int i18, int i19, int i27) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdLandingPageLayoutItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str3 = str + ".layoutItems.componentItem";
        int i28 = 0;
        while (true) {
            if (i28 == 0) {
                str2 = str3;
            } else {
                str2 = str3 + i28;
            }
            ab4.d0 g17 = g(map, i17, i18, i19, i27, str2);
            if (g17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLandingPageLayoutItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return arrayList;
            }
            if (g17.f84366w) {
                arrayList.add(g17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesParseHelper", "comp " + g17.toString() + " ifCondition is false");
            }
            i28++;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x010f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x0116. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0823 A[Catch: Exception -> 0x0850, TryCatch #0 {Exception -> 0x0850, blocks: (B:105:0x07ef, B:107:0x0823, B:109:0x082b), top: B:104:0x07ef }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x089a A[Catch: Exception -> 0x08c7, TryCatch #10 {Exception -> 0x08c7, blocks: (B:112:0x0866, B:114:0x089a, B:116:0x08a2), top: B:111:0x0866 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x2017  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x203a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x2056  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x2091  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x20bf  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x2079  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x203c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x2019  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x223b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0729  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ab4.d0 i(java.util.Map r42, java.lang.String r43, int r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 8854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: za4.z0.i(java.util.Map, java.lang.String, int, int, int, int):ab4.d0");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j() {
        /*
            java.lang.String r0 = "AdLandingPagesParseHelper"
            java.lang.String r1 = "getEnableCanvasValidCache, flag="
            java.lang.String r2 = "getEnableCanvasValidCache"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r4 = 1
            r5 = 0
            java.lang.Class<e42.e0> r6 = e42.e0.class
            i95.m r6 = i95.n0.c(r6)     // Catch: java.lang.Throwable -> L2f
            e42.e0 r6 = (e42.e0) r6     // Catch: java.lang.Throwable -> L2f
            e42.d0 r7 = e42.d0.clicfg_sns_ad_enable_ad_canvas_valid_cache_android     // Catch: java.lang.Throwable -> L2f
            h62.d r6 = (h62.d) r6     // Catch: java.lang.Throwable -> L2f
            int r6 = r6.Ni(r7, r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L2d
            r7.append(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L2d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L2d
            goto L46
        L2d:
            r1 = move-exception
            goto L31
        L2f:
            r1 = move-exception
            r6 = r5
        L31:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "getEnableCanvasValidCache, exp="
            r7.<init>(r8)
            java.lang.String r1 = r1.getMessage()
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L46:
            if (r6 <= 0) goto L49
            goto L4a
        L49:
            r4 = r5
        L4a:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: za4.z0.j():boolean");
    }

    public static ab4.q0 k(java.util.Map map, java.lang.String str, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFloatBarCompInfoFromMediaVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        ab4.q0 q0Var = new ab4.q0();
        B(q0Var, map, str, i17, i18, i19);
        java.lang.String str2 = (java.lang.String) map.get(str + ".desc");
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        q0Var.F = str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".isFullClickable");
        q0Var.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb6.toString()), 0) == 1;
        try {
            java.lang.String str4 = str + ".descColorAlpha";
            java.lang.String str5 = (java.lang.String) map.get(str + ".descColor");
            if (str5 != null) {
                str3 = str5;
            }
            q0Var.G = str3;
            if (map.containsKey(str4) && q0Var.G.length() > 0) {
                q0Var.G = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf((int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str4)) * 255.0d)), q0Var.G.substring(1));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesParseHelper", "AdLandingPageComponetFloatBarInfo parse descColor exp=" + e17.toString());
        }
        ab4.d0 i28 = i(map, str + ".componentItem", i17, i18, i19, i27);
        q0Var.I = i28;
        if (i28 instanceof ab4.c) {
            ((ab4.c) i28).W1 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFloatBarCompInfoFromMediaVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return q0Var;
    }

    public static f54.m l(java.util.Map map, java.lang.String str, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFloatJumpCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        f54.m mVar = new f54.m();
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        mVar.F = str2;
        mVar.G = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".autoJump"), 0);
        mVar.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".swipeJumpOffset"), 0);
        ab4.d0 i28 = i(map, str + ".componentItem", i17, i18, i19, i27);
        if (i28 instanceof ab4.u) {
            mVar.I = (ab4.u) i28;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFloatJumpCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return mVar;
    }

    public static ab4.f m(java.util.Map map, java.lang.String str, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFloatWebViewCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        ab4.f fVar = new ab4.f();
        java.lang.String str2 = (java.lang.String) map.get(str + ".webViewUrl");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        fVar.F = str2;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str + ".webViewHeight"));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str + ".webViewWidth"));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str + ".hideWebViewProgress"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFloatWebViewCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return fVar;
    }

    public static float n(double d17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        float o17 = o(d17, 1, i17, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return o17;
    }

    public static float o(double d17, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (i17 == 0) {
            float f17 = (float) d17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return f17;
        }
        if (i18 == 0) {
            float f18 = (float) d17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return f18;
        }
        int[] c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeParseIntPxFromFloat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        int min = (int) (((((float) d17) * i19) * java.lang.Math.min(c17[0], c17[1])) / i18);
        if (r6 - min > 0.001d) {
            min++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeParseIntPxFromFloat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        float f19 = min;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return f19;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[Catch: all -> 0x00d1, XmlPullParserException -> 0x00d3, IOException -> 0x00d6, TryCatch #8 {IOException -> 0x00d6, XmlPullParserException -> 0x00d3, all -> 0x00d1, blocks: (B:11:0x0030, B:16:0x004a, B:21:0x007e, B:23:0x008a, B:34:0x00a6, B:43:0x005b, B:46:0x0066, B:49:0x0070, B:30:0x00be), top: B:10:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: za4.z0.p():void");
    }

    public static boolean q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isComponentEggCardContainerType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        boolean z17 = i17 == 139;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentEggCardContainerType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return z17;
    }

    public static boolean r(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isComponentFloatLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (i17 == 105) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentFloatLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isComponentFloatLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return false;
    }

    public static boolean s(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isContainerCompentInfoType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (i17 == 101 || i17 == 103 || i17 == 104 || i17 == 105 || i17 == 139 || i17 == 145) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContainerCompentInfoType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContainerCompentInfoType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return false;
    }

    public static boolean t(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isGameShareCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        java.lang.String str3 = (java.lang.String) com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "adCanvasInfo", null).get(".adCanvasInfo.bizId");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str3, 0) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isGameShareCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return z18;
    }

    public static boolean u(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        boolean v17 = v(str, "adCanvasInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return v17;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x035f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean v(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: za4.z0.v(java.lang.String, java.lang.String):boolean");
    }

    public static boolean w(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidLeftCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (c17903x3b438f4 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidLeftCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        }
        java.lang.String str2 = c17903x3b438f4.xml;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str2, str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidLeftCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        }
        if (!str2.contains("<adCanvasInfoLeft>")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidLeftCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        }
        boolean u17 = u(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidLeftCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return u17;
    }

    public static boolean x(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidRightCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (c17903x3b438f4 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidRightCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        }
        java.lang.String str2 = c17903x3b438f4.xml;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str2, str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidRightCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        }
        if (!str2.contains("<adCanvasInfoRight>")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidRightCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        }
        boolean u17 = u(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidRightCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return u17;
    }

    public static boolean y(java.lang.String str, java.lang.String str2, android.content.Context context, boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToShareWebUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, dm.n.f67493x36901555, null);
        java.lang.String str3 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareWebUrl");
        java.lang.String str4 = (java.lang.String) d17.get(".adxml.originUxInfo");
        if (android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToShareWebUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        }
        if (z17) {
            try {
                str3 = d(str3, "exp=_" + i17);
            } catch (java.net.URISyntaxException unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesParseHelper", "canvas jump url " + str3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            str3 = ca4.z0.b(str3, str4);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesParseHelper", "adshare canvas jump url with uxinfo " + str3);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str3);
        intent.putExtra("showShare", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToShareWebUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return true;
    }

    public static boolean z(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, android.app.Activity activity, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        java.lang.String str = c19807x593d1720.f39021x5732e226;
        long longValue = new java.math.BigInteger(c19807x593d1720.Id).longValue();
        java.util.LinkedList linkedList = c19807x593d1720.f39014x86965dde.f451373h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        boolean z18 = false;
        if (!android.text.TextUtils.isEmpty(str)) {
            if (!android.text.TextUtils.isEmpty(str) && u(str)) {
                t(str, dm.n.f67493x36901555);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(longValue);
                android.content.Intent intent = new android.content.Intent();
                if (W0 != null) {
                    intent.putExtra("sns_landing_pages_share_sns_id", W0.m70367x7525eefd());
                    intent.putExtra("sns_landing_pages_rawSnsId", W0.m70371x485d7().Id);
                    intent.putExtra("sns_landing_pages_ux_info", W0.m70375x338a8cc7());
                    intent.putExtra("sns_landing_pages_aid", W0.m70355xb5882a06());
                    intent.putExtra("sns_landing_pages_traceid", W0.m70372xfe2dfcea());
                    intent.putExtra("sns_landing_pages_rec_src", W0.m70350x13c652ad());
                }
                if (linkedList != null && linkedList.size() > 0) {
                    intent.putExtra("sns_landing_pages_share_thumb_url", ((r45.jj4) linkedList.get(0)).f459393i);
                }
                intent.putExtra("sns_landing_pages_expid", "");
                intent.putExtra("sns_landig_pages_from_source", i17);
                a54.g.b(activity, intent, str);
                intent.putExtra("sns_landing_pages_xml", str);
                intent.putExtra("sns_landing_pages_xml_prefix", dm.n.f67493x36901555);
                intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", z17);
                intent.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper", "openCanvas", "(Ljava/lang/String;JLjava/util/List;Landroid/app/Activity;IZ)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activity, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper", "openCanvas", "(Ljava/lang/String;JLjava/util/List;Landroid/app/Activity;IZ)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                z18 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return z18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesParseHelper", "invalid canvas xml %s", str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return z18;
    }
}
