package s64;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final s64.a f484949a = new s64.a();

    public static final boolean a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkParseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "checkParseCombineShareJson, xml is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkParseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("type") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("ad_canvas_page", jSONObject.optString("type"))) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkParseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
                return true;
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CombineShareHelper", "checkParseCombineShareJson, exp is " + e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkParseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        return false;
    }

    public static final boolean b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CombineShareHelper", "doJumpAdLandingPageNativeUI, context is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "doJumpAdLandingPageNativeUI, adParams is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
        if (!f484949a.e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "doJumpAdLandingPageNativeUI, not support combine share");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
        try {
            if (a(str)) {
                boolean f17 = a84.o0.f(f(str), 5, context, l17, str4, str2, str3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
                return f17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "doJumpAdLandingPageNativeUI, adParams type is not support");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CombineShareHelper", "doJumpAdLandingPageNativeUI, exp is " + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpAdLandingPageNativeUI", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static final s64.b f(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "parseCombineShareJson, xml is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return null;
        }
        try {
            str3 = new org.json.JSONObject(str);
            java.lang.String optString = str3.optString("pageId");
            java.lang.String str4 = optString == null ? "" : optString;
            java.lang.String optString2 = str3.optString("uxInfo");
            java.lang.String str5 = optString2 == null ? "" : optString2;
            java.lang.String optString3 = str3.optString("canvasDynamicInfo");
            java.lang.String str6 = optString3 == null ? "" : optString3;
            java.lang.String optString4 = str3.optString("canvasDynamicExtInfo");
            java.lang.String str7 = optString4 == null ? "" : optString4;
            java.lang.String optString5 = str3.optString("canvasDynamicLoadExtInfo");
            java.lang.String str8 = optString5 == null ? "" : optString5;
            java.lang.String optString6 = str3.optString("originSnsId");
            java.lang.String str9 = optString6 == null ? "" : optString6;
            java.lang.String optString7 = str3.optString("originUxInfo");
            if (optString7 == null) {
                optString7 = "";
            }
            int optInt = str3.optInt("originAdType");
            java.lang.String optString8 = str3.optString("originAid");
            if (optString8 == null) {
                optString8 = "";
            }
            java.lang.String optString9 = str3.optString("originTraceId");
            if (optString9 == null) {
                optString9 = "";
            }
            try {
                java.lang.String optString10 = str3.optString("originAdCanvasExt");
                if (optString10 == null) {
                    optString10 = "";
                }
                try {
                    int optInt2 = str3.optInt("isInteractiveCanvas");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseCombineShareJson, pageId is ");
                    sb6.append(str4);
                    sb6.append(", uxInfo is ");
                    sb6.append(str5);
                    sb6.append(", canvasDynamicInfo is ");
                    sb6.append(str6);
                    sb6.append(", canvasDynamicExtInfo is ");
                    sb6.append(str7);
                    sb6.append(", canvasDynamicLoadExtInfo is ");
                    sb6.append(str8);
                    sb6.append("originSnsId is ");
                    sb6.append(str9);
                    sb6.append(", originUxInfo is ");
                    sb6.append(optString7);
                    sb6.append(", originAdType is ");
                    sb6.append(optInt);
                    sb6.append(", originAid is ");
                    sb6.append(optString8);
                    sb6.append(", originTraceId is ");
                    sb6.append(optString9);
                    sb6.append(", originAdCanvasExt is ");
                    sb6.append(optString10);
                    str2 = ", isInteractiveCanvas is ";
                    sb6.append(", isInteractiveCanvas is ");
                    sb6.append(optInt2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", sb6.toString());
                    org.json.JSONObject optJSONObject = str3.optJSONObject("giveHBCardInfo");
                    try {
                        if (optJSONObject == null) {
                            s64.b bVar = new s64.b(str4, str5, str6, str7, str8, str9, optString7, optInt, optString8, optString9, optString10, optInt2, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
                            return bVar;
                        }
                        o44.d dVar = new o44.d();
                        dVar.f424419a = optJSONObject.optString("twistCardId");
                        dVar.f424420b = optJSONObject.optString("giveCardId");
                        dVar.f424421c = optJSONObject.optString("senderUserName");
                        dVar.f424422d = optJSONObject.optString("senderNickName");
                        dVar.f424423e = optJSONObject.optInt("subCardType");
                        dVar.f424424f = optJSONObject.optLong("shareTime");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "parseCombineShareJson, twistCardId is " + dVar.f424419a + ", giveCardId is " + dVar.f424420b + ", senderUserName is " + dVar.f424421c + ", senderNickName is " + dVar.f424422d + ", subCardType is " + dVar.f424423e + ", shareTime is " + dVar.f424424f);
                        s64.b bVar2 = new s64.b(str4, str5, str6, str7, str8, str9, optString7, optInt, optString8, optString9, optString10, optInt2, dVar);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseCombineShareJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
                        return bVar2;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CombineShareHelper", "parseCombineShareJson, exp is " + th);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str3);
                        return null;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    str2 = "parseCombineShareJson";
                    str3 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                str3 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
                str2 = "parseCombineShareJson";
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            str2 = "parseCombineShareJson";
            str3 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
        }
    }

    public final java.lang.String c(s64.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generateAdCanvasShareXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CombineShareHelper", "generateAdCanvasShareXml, combineShareParams is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateAdCanvasShareXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<canvasShareInfo>");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageId", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageId", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        java.lang.String format = java.lang.String.format("<canvasId>%s</canvasId>", java.util.Arrays.copyOf(new java.lang.Object[]{bVar.f484950a}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        stringBuffer.append(format);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUxInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUxInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        java.lang.String format2 = java.lang.String.format("<uxInfo>%s</uxInfo>", java.util.Arrays.copyOf(new java.lang.Object[]{bVar.f484951b}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        stringBuffer.append(format2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanvasDynamicInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanvasDynamicInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = bVar.f484952c;
        if (str == null) {
            str = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.lang.String format3 = java.lang.String.format("<canvasDynamicInfo>%s</canvasDynamicInfo>", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, "format(...)");
            stringBuffer.append(format3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanvasDynamicExtInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        java.lang.String str2 = bVar.f484953d;
        if (str2 == null) {
            str2 = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.lang.String format4 = java.lang.String.format("<canvasDynamicExtInfo>%s</canvasDynamicExtInfo>", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str2)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format4, "format(...)");
            stringBuffer.append(format4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanvasDynamicLoadExtInfo", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        java.lang.String str3 = bVar.f484954e;
        java.lang.String str4 = str3 != null ? str3 : "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            java.lang.String format5 = java.lang.String.format("<canvasDynamicLoadExtInfo>%s</canvasDynamicLoadExtInfo>", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str4)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format5, "format(...)");
            stringBuffer.append(format5);
        }
        stringBuffer.append("</canvasShareInfo>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "generateAdCanvasShareXml, replacedXml is " + ((java.lang.Object) stringBuffer));
        java.lang.String stringBuffer2 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateAdCanvasShareXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        return stringBuffer2;
    }

    public final java.lang.String d(s64.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generateAdCanvasXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CombineShareHelper", "generateAdCanvasXml, combineShareParams is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateAdCanvasXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<adCanvasInfo>");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInteractiveCanvas", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInteractiveCanvas", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
        int i17 = bVar.f484961l;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInteractiveCanvas", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInteractiveCanvas", "com.tencent.mm.plugin.sns.ad.share.CombineShareParams");
            java.lang.String format = java.lang.String.format("<isInteractiveCanvas>%s</isInteractiveCanvas>", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            stringBuffer.append(format);
        }
        if (bVar.a() != null) {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("<giveHBCardInfo><twistCardId>");
            stringBuffer2.append(bVar.a().f424419a);
            stringBuffer2.append("</twistCardId><giveCardId>");
            stringBuffer2.append(bVar.a().f424420b);
            stringBuffer2.append("</giveCardId><senderUserName>");
            stringBuffer2.append(bVar.a().f424421c);
            stringBuffer2.append("</senderUserName><senderNickName>");
            stringBuffer2.append(bVar.a().f424422d);
            stringBuffer2.append("</senderNickName><subCardType>");
            stringBuffer2.append(bVar.a().f424423e);
            stringBuffer2.append("</subCardType><shareTime>");
            stringBuffer2.append(bVar.a().f424424f);
            stringBuffer2.append("</shareTime></giveHBCardInfo>");
            stringBuffer.append(stringBuffer2.toString());
        }
        stringBuffer.append("</adCanvasInfo>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "generateAdCanvasXml, replacedXml is " + ((java.lang.Object) stringBuffer));
        java.lang.String stringBuffer3 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer3, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateAdCanvasXml", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        return stringBuffer3;
    }

    public final boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSupportCombineShare", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        try {
            boolean z17 = true;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_combine_share_landing_page, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "isSupportCombineShare is " + Ni);
            if (Ni != 1) {
                z17 = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportCombineShare", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CombineShareHelper", "isSupportCombineShare, exp is " + th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSupportCombineShare", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return false;
        }
    }
}
