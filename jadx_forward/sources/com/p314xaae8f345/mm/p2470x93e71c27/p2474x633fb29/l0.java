package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

@j95.b
/* loaded from: classes4.dex */
public final class l0 extends i95.w implements o72.t3 {
    public java.lang.String wi(java.lang.String str) {
        java.lang.String str2;
        int D1;
        java.lang.String str3;
        java.lang.String str4 = "convertTransmitXmlToAdParamsJson, pageId is ";
        java.lang.String str5 = "convertTransmitXmlToAdParamsJson";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertTransmitXmlToAdParamsJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "convertTransmitXmlToAdParamsJson, xml is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertTransmitXmlToAdParamsJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return "";
        }
        if (!s64.a.f484949a.e()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "convertTransmitXmlToAdParamsJson, not support combine share");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertTransmitXmlToAdParamsJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            return "";
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, dm.n.f67493x36901555, null);
            try {
                if (d17 != null && !d17.isEmpty()) {
                    java.lang.String str6 = (java.lang.String) d17.get(".adxml.canvasShareInfo.canvasId");
                    if (str6 == null) {
                        str6 = "";
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                        str6 = (java.lang.String) d17.get(".adxml.adCanvasInfo.pageID");
                        if (str6 == null) {
                            str6 = "";
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CombineShareHelper", "canvasShareInfo canvasId is null but pageId is not null");
                    }
                    java.lang.String str7 = (java.lang.String) d17.get(".adxml.canvasShareInfo.uxInfo");
                    if (str7 == null) {
                        str7 = "";
                    }
                    java.lang.String str8 = (java.lang.String) d17.get(".adxml.canvasShareInfo.canvasDynamicInfo");
                    if (str8 == null) {
                        str8 = "";
                    }
                    java.lang.String str9 = (java.lang.String) d17.get(".adxml.canvasShareInfo.canvasDynamicExtInfo");
                    if (str9 == null) {
                        str9 = "";
                    }
                    java.lang.String str10 = (java.lang.String) d17.get(".adxml.canvasShareInfo.canvasDynamicLoadExtInfo");
                    if (str10 == null) {
                        str10 = "";
                    }
                    java.lang.String str11 = (java.lang.String) d17.get(".adxml.originSnsId");
                    if (str11 == null) {
                        str11 = "";
                    }
                    java.lang.String str12 = (java.lang.String) d17.get(".adxml.originUxInfo");
                    if (str12 == null) {
                        str12 = "";
                    }
                    str2 = "";
                    try {
                        try {
                            D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".adxml.originAdType"), 0);
                            str3 = (java.lang.String) d17.get(".adxml.originAid");
                            if (str3 == null) {
                                str3 = str2;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            str5 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
                            str4 = "convertTransmitXmlToAdParamsJson";
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        str4 = "convertTransmitXmlToAdParamsJson";
                        str5 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
                    }
                    try {
                        java.lang.String str13 = (java.lang.String) d17.get(".adxml.originTraceId");
                        if (str13 == null) {
                            str13 = str2;
                        }
                        java.lang.String str14 = (java.lang.String) d17.get(".adxml.originAdCanvasExt");
                        java.lang.String str15 = str10;
                        if (str14 == null) {
                            str14 = str2;
                        }
                        java.lang.String str16 = str9;
                        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".adxml.adCanvasInfo.isInteractiveCanvas"), 0);
                        o44.d b17 = o44.d.b(d17, ".adxml.adCanvasInfo");
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CombineShareHelper", "uxInfo is null but originUxInfo is not null");
                            str7 = str12;
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("null", str3))) {
                            str3 = ca4.m0.D(str12);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CombineShareHelper", "originAid is null but originUxInfo is not null");
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("null", str13))) {
                            str13 = ca4.m0.P(str12);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CombineShareHelper", "originTraceId is null but originUxInfo is not null");
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "convertTransmitXmlToAdParamsJson, pageId is " + str6 + ", uxInfo is " + str7 + ", snsId is " + str11 + ", originUxInfo is " + str12 + ", originAdType is " + D1 + ", originAid is " + str3 + ", originTraceId is " + str13 + ", originAdCanvasExt is " + str14 + ", isInteractiveCanvas is " + D12 + ", canvasDynamicInfo is " + str8 + ", canvasDynamicExtInfo is " + str16 + ", canvasDynamicLoadExtInfo is " + str15 + ", costTime is " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("type", "ad_canvas_page");
                        jSONObject.put("pageId", str6);
                        jSONObject.put("uxInfo", str7);
                        jSONObject.put("canvasDynamicInfo", str8);
                        jSONObject.put("canvasDynamicExtInfo", str16);
                        jSONObject.put("canvasDynamicLoadExtInfo", str15);
                        jSONObject.put("originSnsId", str11);
                        jSONObject.put("originUxInfo", str12);
                        jSONObject.put("originAdType", D1);
                        jSONObject.put("originAid", str3);
                        jSONObject.put("originTraceId", str13);
                        jSONObject.put("originAdCanvasExt", str14);
                        jSONObject.put("isInteractiveCanvas", D12);
                        if (b17 != null) {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put("twistCardId", b17.f424419a);
                            jSONObject2.put("giveCardId", b17.f424420b);
                            jSONObject2.put("senderUserName", b17.f424421c);
                            jSONObject2.put("senderNickName", b17.f424422d);
                            jSONObject2.put("subCardType", b17.f424423e);
                            jSONObject2.put("shareTime", b17.f424424f);
                            jSONObject.put("giveHBCardInfo", jSONObject2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CombineShareHelper", "convertTransmitXmlToAdParamsJson, twistCardId is " + b17.f424419a + ", giveCardId is " + b17.f424420b + ", senderUserName is " + b17.f424421c + ", senderNickName is " + b17.f424422d + ", subCardType is " + b17.f424423e + ", shareTime is " + b17.f424424f);
                        }
                        java.lang.String jSONObject3 = jSONObject.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertTransmitXmlToAdParamsJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
                        return jSONObject3;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        str4 = "convertTransmitXmlToAdParamsJson";
                        str5 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CombineShareHelper", "convertTransmitXmlToAdParamsJson, exp is " + th);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str5);
                        return str2;
                    }
                }
                str2 = "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CombineShareHelper", "convertTransmitXmlToAdParamsJson, values is null or empty");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertTransmitXmlToAdParamsJson", "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper");
            } catch (java.lang.Throwable th9) {
                th = th9;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            str4 = "convertTransmitXmlToAdParamsJson";
            str5 = "com.tencent.mm.plugin.sns.ad.share.CombineShareHelper";
            str2 = "";
        }
        return str2;
    }
}
