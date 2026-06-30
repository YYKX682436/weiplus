package pm4;

/* loaded from: classes15.dex */
public abstract class w {
    public static final r45.un6 a(r45.un6 un6Var) {
        r45.un6 un6Var2 = new r45.un6();
        un6Var2.f469045r = un6Var.f469045r;
        un6Var2.f469039i = un6Var.f469039i;
        un6Var2.f469041n = un6Var.f469041n;
        un6Var2.f469040m = un6Var.f469040m;
        un6Var2.f469042o = un6Var.f469042o;
        un6Var2.f469038h = un6Var.f469038h;
        un6Var2.f469035e = un6Var.f469035e;
        un6Var2.f469036f = un6Var.f469036f;
        un6Var2.f469037g = un6Var.f469037g;
        un6Var2.f469034d = un6Var.f469034d;
        un6Var2.f469044q.addAll(un6Var.f469044q);
        un6Var2.f469051x = un6Var.f469051x;
        un6Var2.f469052y = un6Var.f469052y;
        un6Var2.f469053z = un6Var.f469053z;
        return un6Var2;
    }

    public static java.util.List b(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            r45.x56 x56Var = new r45.x56();
            x56Var.f471328d = optJSONObject.optString(dm.i4.f66865x76d1ec5a, "");
            x56Var.f471329e = optJSONObject.optString("wording", "");
            x56Var.f471330f = optJSONObject.optLong("category", 0L);
            x56Var.f471331g = optJSONObject.optInt("actionType", 0);
            x56Var.f471332h = optJSONObject.optString("url", "");
            x56Var.f471333i = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
            x56Var.f471334m = optJSONObject.optString("subTitle", "");
            x56Var.f471335n = optJSONObject.optString("icon", "");
            arrayList.add(x56Var);
        }
        return arrayList;
    }

    public static java.lang.String c(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, int i19, java.lang.String str6, java.lang.String str7, boolean z17, long j17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (j17 > 0) {
            hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.String.valueOf(j17));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            hashMap.put("redPointMsgId", str4);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            hashMap.put("query", str2);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            hashMap.put("requestId", str3);
            hashMap.put("pRequestId", str3);
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, str3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            hashMap.put("extParams", str7);
        }
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(i17));
        hashMap.put("isPrerender", z17 ? "0" : "1");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            hashMap.put("tabInfo", str5);
        }
        if (i18 > 0) {
            hashMap.put("contentReddot", "" + i18);
        }
        if (i19 > 0) {
            hashMap.put("numberReddot", "" + i19);
        }
        hashMap.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, "1");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            hashMap.put("homeMsgId", str6);
        }
        try {
            hashMap.put("deviceName", java.net.URLEncoder.encode(o45.wf.f424559d, "utf8"));
            hashMap.put("deviceBrand", java.net.URLEncoder.encode(android.os.Build.BRAND, "utf8"));
            hashMap.put("deviceModel", java.net.URLEncoder.encode(wo.w0.m(), "utf8"));
            hashMap.put("ostype", wo.q.f529317e);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryApiLogic", e17, "", new java.lang.Object[0]);
        }
        return e(hashMap);
    }

    public static java.util.HashMap d(android.content.Context context) {
        java.util.HashMap hashMap = new java.util.HashMap();
        r(hashMap);
        int i17 = o45.wf.f424556a;
        hashMap.put("ostype", wo.q.f529317e);
        try {
            hashMap.put("deviceName", java.net.URLEncoder.encode(o45.wf.f424559d, "utf8"));
            hashMap.put("deviceBrand", java.net.URLEncoder.encode(android.os.Build.BRAND, "utf8"));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryApiLogic", e17, "", new java.lang.Object[0]);
        }
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        hashMap.put("imei", "");
        hashMap.put("isOverseaApp", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(context) ? "1" : "0");
        return hashMap;
    }

    public static java.lang.String e(java.util.HashMap hashMap) {
        r(hashMap);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
        stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(1).l());
        stringBuffer.append("/app.html?");
        stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.k(hashMap));
        return stringBuffer.toString();
    }

    public static final r45.zn6 f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.zn6 zn6Var = (r45.zn6) it.next();
            if (zn6Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zn6Var.f473777d)) {
                return zn6Var;
            }
        }
        return null;
    }

    public static java.lang.String g() {
        return lp0.b.h() + "topstory/homecache/";
    }

    public static java.lang.String h() {
        return lp0.b.h() + "topstory/negcache/";
    }

    public static java.lang.String i() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir() + "/topstory/";
    }

    public static java.lang.String j(java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir() + "/topstory/" + str + "/";
    }

    public static final boolean k(int i17) {
        return i17 == 20002;
    }

    public static final boolean l(int i17) {
        return i17 == 110 || i17 == 700;
    }

    public static final boolean m(int i17) {
        return i17 == 100;
    }

    public static final boolean n(int i17) {
        return i17 == 666;
    }

    public static final void o(java.util.List list, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                r45.x50 x50Var = new r45.x50();
                x50Var.f471321d = jSONObject.optString("key", "");
                x50Var.f471322e = jSONObject.optInt("uintValue", 0);
                x50Var.f471323f = jSONObject.optString("textValue", "");
                list.add(x50Var);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final r45.un6 p(org.json.JSONObject jSONObject) {
        r45.un6 un6Var = new r45.un6();
        un6Var.f469041n = jSONObject.optString("query", "");
        un6Var.f469039i = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 21);
        un6Var.f469045r = java.util.UUID.randomUUID().toString();
        un6Var.f469036f = jSONObject.optString("searchId", "");
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) && !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            un6Var.f469047t = true;
        }
        java.lang.String optString = jSONObject.optString("videoId", "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("videoUrls", ""));
            if (jSONArray.length() > 0) {
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    r45.zn6 zn6Var = new r45.zn6();
                    zn6Var.f473777d = jSONArray.getString(i17);
                    arrayList.add(zn6Var);
                }
            }
        } catch (org.json.JSONException unused) {
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            r45.xn6 xn6Var = new r45.xn6();
            un6Var.f469042o = xn6Var;
            xn6Var.f471788d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
            un6Var.f469042o.f471790f = jSONObject.optString("thumbUrl", "");
            un6Var.f469042o.f471791g = jSONObject.optInt("mediaDuration", 0);
            r45.xn6 xn6Var2 = un6Var.f469042o;
            xn6Var2.f471792h = optString;
            xn6Var2.f471807y = jSONObject.optString("strPlayCount", "");
            un6Var.f469042o.f471795n = jSONObject.optString("shareUrl", "");
            un6Var.f469042o.f471796o = jSONObject.optString("shareTitle", "");
            un6Var.f469042o.f471808z = jSONObject.optString("titleUrl", "");
            un6Var.f469042o.f471797p = jSONObject.optString("shareDesc", "");
            un6Var.f469042o.f471799q = jSONObject.optString("shareImgUrl", "");
            un6Var.f469042o.f471800r = jSONObject.optString("shareString", "");
            un6Var.f469042o.f471801s = jSONObject.optString("shareStringUrl", "");
            un6Var.f469042o.f471802t = jSONObject.optString(ya.b.f77502x92235c1b, "");
            un6Var.f469042o.f471803u = jSONObject.optString("sourceUrl", "");
            un6Var.f469042o.f471804v = jSONObject.optInt("relevant_category", -1);
            un6Var.f469042o.f471805w = jSONObject.optString("shareOpenId", "");
            un6Var.f469042o.G = jSONObject.optString("docID", "");
            un6Var.f469042o.f471787J = jSONObject.optInt("videoSize", 0);
            un6Var.f469042o.E = android.os.SystemClock.elapsedRealtime();
            un6Var.f469042o.A = jSONObject.optInt("itemType", 0);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("block", ""));
                un6Var.f469042o.H = jSONObject2.optLong("resultType");
                un6Var.f469042o.I = jSONObject2.optLong("type");
            } catch (org.json.JSONException unused2) {
            }
            un6Var.f469042o.f471806x = jSONObject.optString("expand", "");
            un6Var.f469042o.K.addAll(arrayList);
            r45.zn6 f17 = f(arrayList);
            if (f17 != null) {
                r45.xn6 xn6Var3 = un6Var.f469042o;
                xn6Var3.f471789e = f17.f473777d;
                xn6Var3.U = f17.f473778e;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(un6Var.f469042o.f471790f)) {
                un6Var.f469042o.f471790f = "http://shp.qpic.cn/qqvideo_ori/0/" + un6Var.f469042o.f471792h + java.lang.String.format("_%s_%s/0", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de), 280);
            }
            java.lang.String optString2 = jSONObject.optString("tagList", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                try {
                    un6Var.f469042o.D.addAll(b(new org.json.JSONArray(optString2)));
                } catch (java.lang.Exception unused3) {
                }
            }
            if (!jSONObject.optBoolean("not_show_feedback", false)) {
                un6Var.f469042o.T = new r45.vn6();
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("feedbackObj");
                if (optJSONObject != null) {
                    un6Var.f469042o.T.f469932d = optJSONObject.optString("detailWording");
                    un6Var.f469042o.T.f469933e = optJSONObject.optString("detailUrl");
                    org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("feedbackData");
                    if (optJSONArray != null) {
                        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                            r45.ir0 ir0Var = new r45.ir0();
                            ir0Var.f458810d = optJSONArray.optJSONObject(i18).optString(dm.i4.f66865x76d1ec5a, "");
                            ir0Var.f458811e = optJSONArray.optJSONObject(i18).optString("wording", "");
                            un6Var.f469042o.T.f469934f.add(ir0Var);
                        }
                    }
                }
            }
            java.lang.String optString3 = jSONObject.optString("show_tag_list", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
                try {
                    un6Var.f469042o.D.addAll(b(new org.json.JSONArray(optString3)));
                } catch (org.json.JSONException unused4) {
                }
            }
            un6Var.f469038h = un6Var.f469042o.f471804v;
            un6Var.f469035e = jSONObject.optString("expand", "");
            un6Var.f469040m = "";
            r45.xn6 xn6Var4 = un6Var.f469042o;
            un6Var.f469034d = xn6Var4.f471792h;
            xn6Var4.L = jSONObject.optInt("switchFlag", 0);
            un6Var.f469042o.R = jSONObject.optJSONObject("colikeInfo") != null && jSONObject.optJSONObject("colikeInfo").optBoolean("isSelfThumb");
            un6Var.f469042o.S = jSONObject.optJSONObject("colikeInfo") != null ? jSONObject.optJSONObject("colikeInfo").optString("byPass", "") : "";
            if (un6Var.f469038h == 100203) {
                r45.xn6 xn6Var5 = un6Var.f469042o;
                xn6Var5.f471793i = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
                xn6Var5.f471794m = 640;
            } else {
                r45.xn6 xn6Var6 = un6Var.f469042o;
                xn6Var6.f471793i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de;
                xn6Var6.f471794m = 280;
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("secondVideoInfo");
            if (optJSONObject2 != null) {
                un6Var.f469042o.N = new r45.sn6();
                un6Var.f469042o.N.f467400d = optJSONObject2.optInt("videoSecondType");
                un6Var.f469042o.N.f467403g = optJSONObject2.optInt("requestDuration");
                un6Var.f469042o.N.f467404h = optJSONObject2.optInt("requestPercent");
            }
            java.lang.String optString4 = jSONObject.optString("videoChannelTitle", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString4)) {
                long j17 = un6Var.f469038h;
                if (j17 == 100202 || j17 == 100204 || j17 == 100205) {
                    r45.x56 x56Var = new r45.x56();
                    un6Var.f469043p = x56Var;
                    x56Var.f471333i = optString4;
                }
            }
            java.lang.String optString5 = jSONObject.optString("extReqParams", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString5)) {
                try {
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray(optString5);
                    for (int i19 = 0; i19 < jSONArray2.length(); i19++) {
                        org.json.JSONObject jSONObject3 = jSONArray2.getJSONObject(i19);
                        r45.x50 x50Var = new r45.x50();
                        x50Var.f471321d = jSONObject3.optString("key", "");
                        x50Var.f471322e = jSONObject3.optInt("uintValue", 0);
                        x50Var.f471323f = jSONObject3.optString("textValue", "");
                        un6Var.f469044q.add(x50Var);
                    }
                } catch (java.lang.Exception unused5) {
                }
            }
            java.lang.String optString6 = jSONObject.optString("preNetType", "");
            un6Var.f469052y = optString6;
            if (optString6.equals("wangka")) {
                un6Var.f469053z = 1;
            } else if (un6Var.f469052y.equals("2g") || un6Var.f469052y.equals("3g") || un6Var.f469052y.equals("4g")) {
                un6Var.f469053z = 2;
            } else {
                un6Var.f469053z = 0;
            }
        }
        return un6Var;
    }

    public static final r45.un6 q(r45.y97 y97Var, int i17, java.lang.String str) {
        r45.un6 un6Var = new r45.un6();
        un6Var.f469045r = java.util.UUID.randomUUID().toString();
        r45.xn6 xn6Var = new r45.xn6();
        un6Var.f469042o = xn6Var;
        xn6Var.f471788d = y97Var.f472438n;
        xn6Var.G = "video-" + y97Var.f472431d;
        r45.xn6 xn6Var2 = un6Var.f469042o;
        xn6Var2.f471792h = y97Var.f472431d;
        java.lang.String str2 = y97Var.f472449y;
        xn6Var2.f471790f = str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            un6Var.f469042o.f471790f = "http://shp.qpic.cn/qqvideo_ori/0/" + y97Var.f472431d + java.lang.String.format("_%s_%s/0", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de), 280);
        }
        r45.xn6 xn6Var3 = un6Var.f469042o;
        xn6Var3.f471807y = y97Var.f472436i;
        xn6Var3.f471802t = y97Var.f472443s;
        xn6Var3.f471803u = y97Var.f472444t;
        java.lang.String str3 = y97Var.f472432e;
        xn6Var3.f471806x = str3;
        xn6Var3.B = str3;
        xn6Var3.f471800r = y97Var.f472441q;
        if (y97Var.f472448x == 100203) {
            xn6Var3.f471793i = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            xn6Var3.f471794m = 640;
        } else {
            xn6Var3.f471793i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de;
            xn6Var3.f471794m = 280;
        }
        xn6Var3.E = java.lang.System.currentTimeMillis();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y97Var.f472447w)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(y97Var.f472447w);
                for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                    r45.x56 x56Var = new r45.x56();
                    x56Var.f471328d = jSONObject.optString(dm.i4.f66865x76d1ec5a);
                    x56Var.f471329e = jSONObject.optString("wording");
                    x56Var.f471330f = jSONObject.optLong("category");
                    x56Var.f471331g = jSONObject.optInt("actionType");
                    x56Var.f471332h = jSONObject.optString("url");
                    x56Var.f471333i = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                    x56Var.f471334m = jSONObject.optString("subTitle");
                    x56Var.f471335n = jSONObject.optString("icon");
                    un6Var.f469042o.D.add(x56Var);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        un6Var.f469034d = y97Var.f472431d;
        un6Var.f469035e = y97Var.f472432e;
        un6Var.f469036f = y97Var.f472433f;
        un6Var.f469037g = y97Var.f472434g;
        long j17 = y97Var.f472448x;
        un6Var.f469038h = j17;
        if (j17 <= 0) {
            un6Var.f469038h = 100201L;
        }
        un6Var.f469047t = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y97Var.f472446v)) {
            o(un6Var.f469044q, y97Var.f472446v);
        }
        un6Var.f469040m = "";
        un6Var.f469039i = i17;
        un6Var.f469041n = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y97Var.f472450z)) {
            r45.x56 x56Var2 = new r45.x56();
            un6Var.f469043p = x56Var2;
            x56Var2.f471333i = y97Var.f472450z;
        }
        return un6Var;
    }

    public static void r(java.util.HashMap hashMap) {
        hashMap.put("lang", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        hashMap.put("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        hashMap.put("version", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(1).b()));
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b());
        hashMap.put("isClientLoading", "1");
        hashMap.put("wechatVersion", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
        float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (q17 != 1.0f && q17 != 0.8f && q17 != 1.1f && q17 != 1.12f && q17 != 1.125f && q17 != 1.4f && q17 != 1.55f && q17 != 1.65f) {
            q17 = 1.0f;
        }
        hashMap.put("fontRatio", java.lang.String.valueOf(q17));
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        hashMap.put("showNewlife", "0");
        boolean Ri = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ri();
        hashMap.put("enableUniformReddot", Ri ? "1" : "0");
        if (Ri) {
            java.lang.String str = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).f336857d;
            java.lang.String str2 = "";
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("NewLife.Entrance");
                if (L0 != null) {
                    kn3.b bVar = new kn3.b();
                    r45.vs2 vs2Var = L0.f65874xb5f7102a;
                    java.lang.String str3 = vs2Var != null ? vs2Var.f470023h : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    bVar.l(str3);
                    ((wm4.z) ((pm4.v) i95.n0.c(pm4.v.class))).getClass();
                    int h17 = wm4.u.h(L0);
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = L0.N.m75934xbce7f2f(7);
                    if (m75934xbce7f2f != null) {
                        r45.ez2 ez2Var = new r45.ez2();
                        ez2Var.mo11468x92b714fd(m75934xbce7f2f.f273689a);
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = ez2Var.m75934xbce7f2f(4);
                        java.lang.String i17 = m75934xbce7f2f2 != null ? m75934xbce7f2f2.i() : null;
                        if (i17 == null) {
                            i17 = "";
                        }
                        bVar.j(i17);
                        bVar.k(h17);
                    }
                    java.lang.String jSONObject = bVar.mo126745xcc31ba03().toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getRedDotParamsJson: jsonString:".concat(jSONObject));
                    str2 = jSONObject;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "getRedDotParamsJson " + e17);
            }
            hashMap.put("reddotParams", android.net.Uri.encode(str2));
        }
    }

    public static org.json.JSONArray s(java.util.List list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i17 = 0; i17 < list.size(); i17++) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                r45.x56 x56Var = (r45.x56) list.get(i17);
                jSONObject.put(dm.i4.f66865x76d1ec5a, x56Var.f471328d);
                jSONObject.put("wording", x56Var.f471329e);
                jSONObject.put("category", x56Var.f471330f);
                jSONObject.put("actionType", x56Var.f471331g);
                jSONObject.put("url", x56Var.f471332h);
                jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, x56Var.f471333i);
                jSONObject.put("subTitle", x56Var.f471334m);
                jSONObject.put("icon", x56Var.f471335n);
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception unused) {
            }
        }
        return jSONArray;
    }
}
