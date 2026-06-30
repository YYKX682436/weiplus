package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public final class c0 {
    public c0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0 a(java.util.Map map, java.lang.String str) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s1 s1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o1 o1Var;
        java.lang.Float f17;
        java.lang.Float f18;
        java.lang.Float f19;
        java.lang.Float f27;
        java.lang.Integer h17;
        java.lang.Integer h18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1 a1Var = null;
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion");
            return null;
        }
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str.concat(".mediaType"));
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String concat = str.concat(".alphaVideoInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo$Companion");
        if (concat == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo$Companion");
            obj = "";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k1 k1Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k1.f247569a;
            r45.jj4 a17 = k1Var.a(concat.concat(".media"), map);
            r45.jj4 a18 = k1Var.a(concat.concat(".oneToOneHighMedia"), map);
            r45.jj4 a19 = k1Var.a(concat.concat(".oneToOneLowMedia"), map);
            java.lang.String concat2 = concat.concat(".playModeInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion");
            if (concat2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion");
                o1Var = null;
                obj = "";
            } else {
                java.lang.String str3 = (java.lang.String) map.get(concat2.concat(".playMode"));
                int intValue = (str3 == null || (h17 = r26.h0.h(str3)) == null) ? 0 : h17.intValue();
                java.lang.String str4 = (java.lang.String) map.get(concat2.concat(".startOffset"));
                float f28 = 0.0f;
                float floatValue = (str4 == null || (f27 = r26.g0.f(str4)) == null) ? 0.0f : f27.floatValue();
                java.lang.String str5 = (java.lang.String) map.get(concat2.concat(".loopStartTime"));
                float floatValue2 = (str5 == null || (f19 = r26.g0.f(str5)) == null) ? 0.0f : f19.floatValue();
                java.lang.String str6 = (java.lang.String) map.get(concat2.concat(".loopEndTime"));
                float floatValue3 = (str6 == null || (f18 = r26.g0.f(str6)) == null) ? 0.0f : f18.floatValue();
                if (intValue == 1) {
                    java.lang.String concat3 = concat2.concat(".playStateInfo");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                    if (concat3 == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                    } else {
                        java.lang.String str7 = (java.lang.String) map.get(concat3.concat(".breakHideDuration"));
                        if (str7 != null && (f17 = r26.g0.f(str7)) != null) {
                            f28 = f17.floatValue();
                        }
                        float f29 = f28;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q1 q1Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r1.f247650d;
                        obj = "";
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r1 a27 = q1Var.a(map, concat3.concat(".breakState"));
                        if (a27 == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r1 a28 = q1Var.a(map, concat3.concat(".stopState"));
                            if (a28 == null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r1 a29 = q1Var.a(map, concat3.concat(".likeState"));
                                if (a29 == null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r1 a37 = q1Var.a(map, concat3.concat(".commentState"));
                                    if (a37 == null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                                    } else {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s1 s1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s1(f29, a27, a28, a29, a37, q1Var.a(map, concat3.concat(".cancelLikeState")));
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                                        s1Var = s1Var2;
                                        o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o1(intValue, floatValue, floatValue2, floatValue3, s1Var);
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion");
                                    }
                                }
                            }
                        }
                        s1Var = null;
                        o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o1(intValue, floatValue, floatValue2, floatValue3, s1Var);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion");
                    }
                }
                obj = "";
                s1Var = null;
                o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.o1(intValue, floatValue, floatValue2, floatValue3, s1Var);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.PlayModeInfo$Companion");
            }
            if (o1Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo$Companion");
                a1Var = null;
            } else {
                java.lang.String str8 = (java.lang.String) map.get(concat.concat(".videoCompositeType"));
                a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a1(a17, a18, a19, o1Var, (str8 == null || (h18 = r26.h0.h(str8)) == null) ? 0 : h18.intValue());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo$Companion");
            }
        }
        if (a1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a0 a0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b0.f247463i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b0 a38 = a0Var.a(map, str.concat(".clickInfo"));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseClickInfoList", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo$Companion");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String concat4 = str.concat(".clickInfoList");
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(concat4);
            sb6.append(".clickInfoItem");
            sb6.append(i17 == 0 ? obj : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBreakFrameClickInfo.adClickArea", "parseClickInfoList, size=" + arrayList.size());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseClickInfoList", "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0 d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d0(str2, a1Var, a38, arrayList);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.storage.AdBreakFrameInfo$Companion");
                return d0Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b0 a39 = a0Var.a(map, sb7);
            if (a39 != null) {
                arrayList.add(a39);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdBreakFrameClickInfo.adClickArea", "parseClickInfoList, clickInfo==null, itemKey=" + sb7);
            }
            i17++;
        }
    }
}
