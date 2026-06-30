package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public abstract class g5 {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i0 a(r45.m43 m43Var) {
        if (m43Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i0 i0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.i0();
        i0Var.f226861d = m43Var.f461672d;
        java.util.Iterator it = m43Var.f461673e.iterator();
        while (it.hasNext()) {
            r45.if0 if0Var = (r45.if0) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k();
            kVar.f226894d = if0Var.f458514d;
            kVar.f226895e = if0Var.f458515e;
            kVar.f226896f = if0Var.f458516f;
            i0Var.f226862e.add(kVar);
        }
        return i0Var;
    }

    public static r45.wv3 b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        r45.wv3 wv3Var = new r45.wv3();
        wv3Var.f471032e = jSONObject.optInt("subType", -1);
        wv3Var.f471031d = jSONObject.optString("corpName");
        wv3Var.f471033f = jSONObject.optString("materialId");
        wv3Var.f471035h = jSONObject.optString("expire_desc");
        wv3Var.f471036i = jSONObject.optInt("is_expired");
        wv3Var.f471043s = jSONObject.optInt("detail_link_type");
        wv3Var.f471044t = jSONObject.optString("detail_link_appname");
        wv3Var.f471045u = jSONObject.optString("detail_link_url");
        wv3Var.f471046v = jSONObject.optString("detail_link_title");
        wv3Var.f471047w = jSONObject.optString("exchange_title");
        wv3Var.f471048x = jSONObject.optString("exchange_url");
        wv3Var.f471049y = jSONObject.optInt("has_source");
        wv3Var.f471050z = jSONObject.optLong("last_obtain_time");
        wv3Var.A = jSONObject.optInt("disable");
        wv3Var.B = jSONObject.optString("disable_text");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("sourceObject");
        if (optJSONObject != null) {
            r45.xv3 xv3Var = new r45.xv3();
            xv3Var.f472011e = optJSONObject.optString("bubbleImage");
            xv3Var.f472014h = optJSONObject.optString("bubbleImageMd5");
            xv3Var.f472010d = optJSONObject.optString("corpLogo");
            xv3Var.f472017n = optJSONObject.optString("corpLogoMd5");
            xv3Var.f472012f = optJSONObject.optString("coverImage");
            xv3Var.f472015i = optJSONObject.optString("coverImageMd5");
            xv3Var.f472013g = optJSONObject.optString("detailImage");
            xv3Var.f472016m = optJSONObject.optString("detailImageMd5");
            wv3Var.f471034g = xv3Var;
        }
        return wv3Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 c(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 s5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5();
        s5Var.f227152n = jSONObject.optString("spidLogo");
        s5Var.f227153o = jSONObject.optString("spidWishing");
        s5Var.f227154p = jSONObject.optString("spidName");
        s5Var.f227152n = jSONObject.optString("spidLogo");
        s5Var.f227155q = jSONObject.optInt("hbStatus");
        s5Var.f227156r = jSONObject.optInt("receiveStatus");
        s5Var.f227157s = jSONObject.optString("statusMess");
        jSONObject.optString("hintMess");
        s5Var.f227158t = jSONObject.optString("watermark");
        s5Var.f227150i = jSONObject.optString("sendId");
        s5Var.f227159u = jSONObject.optInt("focusFlag");
        s5Var.f227160v = jSONObject.optString("focusWording");
        s5Var.f227161w = jSONObject.optString("focusAppidUserName");
        s5Var.f227162x = jSONObject.optInt("isFocus");
        s5Var.f227163y = jSONObject.optInt("hbType");
        s5Var.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("atomicFunc");
        if (optJSONObject != null) {
            s5Var.B.f226837d = optJSONObject.optInt("enable");
            s5Var.B.f226839f = optJSONObject.optString("fissionContent");
            s5Var.B.f226838e = optJSONObject.optString("fissionUrl");
        }
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("agree_duty");
        if (optJSONObject2 != null) {
            optJSONObject2.optString("agreed_flag", "-1");
            optJSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
            optJSONObject2.optString("service_protocol_wording", "");
            optJSONObject2.optString("service_protocol_url", "");
            optJSONObject2.optString("button_wording", "");
            s5Var.A = optJSONObject2.optLong("delay_expired_time", 0L);
        }
        if (s5Var.A > 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REALNAME_DISCLAIMER_QUERY_EXPIRED_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + (s5Var.A * 1000)));
        }
        h(jSONObject.optJSONObject("operationTail"));
        return s5Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 d(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1();
        if (jSONObject != null) {
            e1Var.f226767d = jSONObject.optInt("hbType");
            e1Var.f226768e = jSONObject.optInt("hbStatus");
            e1Var.f226769f = jSONObject.optString("statusMess");
            e1Var.f226770g = jSONObject.optString("gameMess");
            e1Var.f226771h = jSONObject.optString("wishing");
            e1Var.f226772i = jSONObject.optString("sendNick");
            e1Var.f226773m = jSONObject.optString("sendHeadImg");
            e1Var.f226774n = jSONObject.optString("sendId");
            e1Var.f226775o = jSONObject.optString("adMessage");
            e1Var.f226776p = jSONObject.optString("adUrl");
            e1Var.f226778q = jSONObject.optLong("amount");
            e1Var.f226779r = jSONObject.optLong("recNum");
            e1Var.f226780s = jSONObject.optLong("recAmount");
            e1Var.f226781t = jSONObject.optInt("totalNum");
            e1Var.f226782u = jSONObject.optLong("totalAmount");
            e1Var.f226783v = jSONObject.optString("receiveId");
            e1Var.f226784w = jSONObject.optInt("hasWriteAnswer");
            e1Var.f226785x = jSONObject.optInt("isSender");
            e1Var.f226786y = jSONObject.optInt("isContinue");
            e1Var.f226787z = jSONObject.optString("headTitle");
            e1Var.A = jSONObject.optInt("receiveStatus");
            e1Var.B = jSONObject.optInt("canShare");
            e1Var.D = jSONObject.optInt("jumpChange");
            e1Var.E = jSONObject.optString("changeWording");
            e1Var.N = jSONObject.optString("changeUrl");
            e1Var.f226766J = jSONObject.optInt("hbKind");
            e1Var.L = jSONObject.optString("externMess");
            e1Var.Q = jSONObject.optString("sendUserName");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f226772i)) {
                e1Var.Y = true;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f226772i) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.Q)) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str = e1Var.Q;
                ((sg3.a) v0Var).getClass();
                e1Var.f226772i = c01.a2.e(str);
            }
            e1Var.Z = jSONObject.optInt("not_show_avatar", 0);
            e1Var.X = jSONObject.optString("sendsuffix");
            e1Var.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("atomicFunc");
            if (optJSONObject != null) {
                e1Var.C.f226837d = optJSONObject.optInt("enable");
                e1Var.C.f226839f = optJSONObject.optString("fissionContent");
                e1Var.C.f226838e = optJSONObject.optString("fissionUrl");
            }
            e1Var.F = new java.util.LinkedList();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("operationHeader");
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    e1Var.F.add(h(optJSONArray.getJSONObject(i17)));
                }
            }
            e1Var.H = jSONObject.optString("watermark");
            e1Var.I = jSONObject.optString("context");
            e1Var.P = jSONObject.optString("contextMd5");
            e1Var.K = jSONObject.optInt("resourceId");
            e1Var.G = h(jSONObject.optJSONObject("operationTail"));
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("record");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (optJSONArray2 != null) {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    org.json.JSONObject jSONObject2 = optJSONArray2.getJSONObject(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 h5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5();
                    if (jSONObject2 != null) {
                        h5Var.f226845d = jSONObject2.optString("receiveName");
                        h5Var.f226846e = jSONObject2.optString("receiveHeadImg");
                        h5Var.f226847f = jSONObject2.optLong("receiveAmount");
                        h5Var.f226848g = jSONObject2.optString("receiveTime");
                        h5Var.f226849h = jSONObject2.optString("answer");
                        h5Var.f226850i = jSONObject2.optString("receiveId");
                        h5Var.f226851m = jSONObject2.optString("gameTips");
                        h5Var.f226852n = jSONObject2.optString("userName");
                        h5Var.f226854p = jSONObject2.optString("receivesuffix");
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226845d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226852n)) {
                            gm0.j1.i();
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(h5Var.f226852n).d1())) {
                                h5Var.f226855q = true;
                            } else {
                                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                                java.lang.String str2 = h5Var.f226852n;
                                ((sg3.a) v0Var2).getClass();
                                h5Var.f226845d = c01.a2.e(str2);
                            }
                        }
                    }
                    linkedList.add(h5Var);
                }
            }
            e1Var.M = linkedList;
            e1Var.R = jSONObject.optInt("jumpChangeType");
            e1Var.S = jSONObject.optString("changeIconUrl");
            e1Var.T = jSONObject.optString("showSourceOpen");
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("amount_info_page");
            if (optJSONObject2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r0 r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r0();
                e1Var.f226777p0 = r0Var;
                r0Var.f227100d = optJSONObject2.optString("wording");
                e1Var.f226777p0.f227101e = optJSONObject2.optString("route_info");
            }
        }
        return e1Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e(r45.p43 p43Var) {
        if (p43Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1();
        e1Var.f226767d = p43Var.f464271r;
        e1Var.f226768e = p43Var.f464273t;
        e1Var.f226769f = p43Var.f464275v;
        e1Var.f226771h = p43Var.f464267n;
        e1Var.f226774n = p43Var.f464265i;
        e1Var.f226778q = p43Var.f464266m;
        e1Var.U = p43Var.f464259J;
        e1Var.f226779r = p43Var.f464262f;
        e1Var.f226780s = p43Var.f464278y;
        e1Var.f226781t = p43Var.f464263g;
        e1Var.f226782u = p43Var.f464264h;
        e1Var.f226783v = p43Var.f464269p;
        e1Var.f226785x = p43Var.f464268o;
        e1Var.f226786y = p43Var.f464272s;
        e1Var.f226787z = p43Var.f464276w;
        e1Var.A = p43Var.f464274u;
        e1Var.D = p43Var.B;
        e1Var.E = p43Var.C;
        e1Var.N = p43Var.E;
        java.lang.String str = p43Var.D;
        e1Var.Q = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = e1Var.Q;
            ((sg3.a) v0Var).getClass();
            e1Var.f226772i = c01.a2.e(str2);
        }
        e1Var.R = p43Var.F;
        e1Var.S = p43Var.G;
        e1Var.F = new java.util.LinkedList();
        java.util.LinkedList linkedList = p43Var.f464270q;
        if (!linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.s43 s43Var = (r45.s43) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6();
                o6Var.f227053g = s43Var.f467028f;
                o6Var.f227056m = s43Var.f467032m;
                o6Var.f227050d = s43Var.f467029g;
                o6Var.f227055i = s43Var.f467030h;
                o6Var.f227051e = s43Var.f467026d;
                o6Var.f227054h = s43Var.f467031i;
                int i17 = s43Var.f467027e;
                if (i17 == 1) {
                    o6Var.f227052f = "Appid";
                } else if (i17 == 2) {
                    o6Var.f227052f = "Text";
                } else if (i17 == 3) {
                    o6Var.f227052f = "Pic";
                } else if (i17 == 4) {
                    o6Var.f227052f = "Native";
                }
                e1Var.F.add(o6Var);
            }
        }
        if (p43Var.A != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6();
            e1Var.G = o6Var2;
            r45.s43 s43Var2 = p43Var.A;
            o6Var2.f227053g = s43Var2.f467028f;
            o6Var2.f227056m = s43Var2.f467032m;
            o6Var2.f227050d = s43Var2.f467029g;
            o6Var2.f227055i = s43Var2.f467030h;
            o6Var2.f227051e = s43Var2.f467026d;
            o6Var2.f227054h = s43Var2.f467031i;
            int i18 = s43Var2.f467027e;
            if (i18 == 1) {
                o6Var2.f227052f = "Appid";
            } else if (i18 == 2) {
                o6Var2.f227052f = "Text";
            } else if (i18 == 3) {
                o6Var2.f227052f = "Pic";
            } else if (i18 == 4) {
                o6Var2.f227052f = "Native";
            }
        }
        e1Var.W = a(p43Var.L);
        e1Var.M = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = p43Var.f464279z;
        if (!linkedList2.isEmpty()) {
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                r45.n43 n43Var = (r45.n43) it6.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 h5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5();
                h5Var.f226851m = n43Var.f462605h;
                h5Var.f226850i = n43Var.f462603f;
                h5Var.f226847f = n43Var.f462601d;
                h5Var.f226848g = n43Var.f462602e;
                h5Var.f226852n = n43Var.f462606i;
                h5Var.f226853o = n43Var.f462607m;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226845d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226852n)) {
                    tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String str3 = h5Var.f226852n;
                    ((sg3.a) v0Var2).getClass();
                    h5Var.f226845d = c01.a2.e(str3);
                }
                e1Var.M.add(h5Var);
            }
        }
        return e1Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4 f(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4 n4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4();
        if (jSONObject != null) {
            n4Var.f227004d = jSONObject.optInt("recTotalNum");
            n4Var.f227005e = jSONObject.optLong("recTotalAmount");
            n4Var.f227006f = jSONObject.optInt("sendTotalNum");
            n4Var.f227007g = jSONObject.optLong("sendTotalAmount");
            n4Var.f227009i = jSONObject.optInt("isContinue");
            n4Var.f227008h = jSONObject.optInt("gameCount");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("record");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4 o4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4();
                    o4Var.f227029d = jSONObject2.optString("sendName");
                    o4Var.f227030e = jSONObject2.optString("sendHeadImg");
                    o4Var.f227031f = jSONObject2.optLong("receiveAmount");
                    o4Var.f227032g = jSONObject2.optString("receiveTime");
                    o4Var.f227033h = jSONObject2.optInt("hbType");
                    o4Var.f227034i = jSONObject2.optString("sendTitle");
                    o4Var.f227035m = jSONObject2.optString("sendTime");
                    o4Var.f227036n = jSONObject2.optLong("totalAmount");
                    o4Var.f227037o = jSONObject2.optLong("totalNum");
                    o4Var.f227038p = jSONObject2.optLong("recNum");
                    o4Var.f227039q = jSONObject2.optInt("status");
                    o4Var.f227040r = jSONObject2.optInt("thxCount");
                    o4Var.f227041s = jSONObject2.optString("receiveId");
                    o4Var.f227042t = jSONObject2.optString("sendId");
                    o4Var.f227043u = jSONObject2.optInt("hbKind");
                    o4Var.f227044v = jSONObject2.optString("sendsuffix");
                    o4Var.f227045w = jSONObject2.optString("sendDesc");
                    linkedList.add(o4Var);
                }
            }
            n4Var.f227010m = linkedList;
        }
        return n4Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s4 g(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s4 s4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s4();
        if (jSONObject != null) {
            s4Var.f227137d = jSONObject.optString("cdnFileId");
            s4Var.f227138e = jSONObject.optString("cdnAesKey");
            s4Var.f227140g = jSONObject.optString("pagName");
            s4Var.f227146p = jSONObject.optString("maskPagName");
            s4Var.f227139f = jSONObject.optString("wishKeyWord");
            s4Var.f227141h = jSONObject.optString("videoUrl");
            s4Var.f227142i = jSONObject.optString("videoThumbUrl");
            s4Var.f227143m = jSONObject.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b);
            s4Var.f227144n = jSONObject.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122);
            s4Var.f227145o = jSONObject.optString("verifyInfo");
            s4Var.f227147q = jSONObject.optString("videoUrlWithVoice");
            s4Var.f227148r = jSONObject.optString("videoThumbUrlWithVoice");
        }
        return s4Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 h(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6 o6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o6();
        if (jSONObject != null) {
            o6Var.f227050d = jSONObject.optInt("enable", 0);
            o6Var.f227053g = jSONObject.optString("content");
            o6Var.f227055i = jSONObject.optString("iconUrl");
            o6Var.f227052f = jSONObject.optString("type");
            o6Var.f227051e = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            o6Var.f227054h = jSONObject.optInt("ossKey");
            o6Var.f227056m = jSONObject.optInt("focus");
        }
        return o6Var;
    }

    public static java.util.ArrayList i(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new org.json.JSONArray();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyParseHelper", "parseOptionItemList res：%s", jSONArray.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                if (jSONObject != null) {
                    arrayList.add(j(jSONObject));
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyParseHelper", "parseOptionItemList error：%s", e17.getMessage());
            }
        }
        return arrayList;
    }

    public static r45.aw3 j(org.json.JSONObject jSONObject) {
        r45.aw3 aw3Var = new r45.aw3();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        aw3Var.f451826d = jSONObject.optString("wording");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("jump_info");
        r45.yv3 yv3Var = new r45.yv3();
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        yv3Var.f472933d = optJSONObject.optInt("type");
        yv3Var.f472934e = optJSONObject.optString("url");
        yv3Var.f472935f = optJSONObject.optString(dm.i4.f66875xa013b0d5);
        yv3Var.f472936g = optJSONObject.optString("pagepath");
        aw3Var.f451827e = yv3Var;
        return aw3Var;
    }
}
