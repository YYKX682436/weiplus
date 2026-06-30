package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826;

/* loaded from: classes8.dex */
public abstract class u {
    public static final void a(int i17, r45.n23 n23Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19483xfc85b212 c19483xfc85b212 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19483xfc85b212();
        c19483xfc85b212.f268516d = n23Var;
        if (i17 == 1) {
            java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, c19483xfc85b212, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.d(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.n.f268521d);
        } else {
            if (i17 != 2) {
                return;
            }
            java.lang.String PROCESS_MAIN2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN2, "PROCESS_MAIN");
            com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN2, c19483xfc85b212, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.c(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.m.f268520d);
        }
    }

    public static final void b(sf.f invokeContext, r45.n23 finderVideoInfoForMp) {
        org.json.JSONObject optJSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderVideoInfoForMp, "finderVideoInfoForMp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterFinderFullScreen localFeedId: ");
        sb6.append(finderVideoInfoForMp.m75945x2fec8307(20));
        sb6.append(", extInfo: ");
        org.json.JSONObject c17 = invokeContext.c();
        java.lang.String str = null;
        sb6.append(c17 != null ? c17.optJSONObject("extInfo") : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19482x27941f6f c19482x27941f6f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.C19482x27941f6f();
        c19482x27941f6f.f268514d = finderVideoInfoForMp;
        org.json.JSONObject c18 = invokeContext.c();
        if (c18 != null && (optJSONObject = c18.optJSONObject("extInfo")) != null) {
            str = optJSONObject.toString();
        }
        if (str == null) {
            str = "";
        }
        c19482x27941f6f.f268515e = str;
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, c19482x27941f6f, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.f(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.o(invokeContext));
    }

    public static final void c(java.lang.String localFeedId, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localFeedId, "localFeedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderVideoInfo localFeedId: ".concat(localFeedId));
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(localFeedId), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.j(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.r(localFeedId, callback));
    }

    public static final void d(java.lang.String action, nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "handlerFinderAction action: ".concat(action));
        str = "";
        switch (action.hashCode()) {
            case -1741233496:
                if (action.equals("getFinderFeedInfo")) {
                    java.lang.Object obj2 = msg.f422323a.get("localFeedId");
                    str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    str = str2 != null ? str2 : "";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo localFeedId: %s", str);
                    java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
                    com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.h(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.p(env, msg, str));
                    return;
                }
                return;
            case -327096186:
                if (action.equals("getSearchFinderPlayInfo")) {
                    java.lang.Object obj3 = msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                    if (obj3 != null && (obj = obj3.toString()) != null) {
                        str = obj;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo data: %s", str);
                    java.lang.String PROCESS_MAIN2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN2, "PROCESS_MAIN");
                    com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN2, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.k(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.s(env, msg));
                    return;
                }
                return;
            case 295901137:
                if (action.equals("operateFinderVideo")) {
                    java.lang.Object obj4 = msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                    java.lang.String str3 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    str = str3 != null ? str3 : "";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "operateFinderVideo data: ".concat(str));
                    if (str.length() == 0) {
                        env.f422396d.e(msg.f422546c, msg.f422552i + ":fail", null);
                        return;
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
                    if (msg.f422323a.containsKey("isLike")) {
                        java.lang.Object obj5 = msg.f422323a.get("isLike");
                        java.lang.String str4 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                        jSONObject.put("isLike", str4 != null ? java.lang.Boolean.parseBoolean(str4) : false);
                    }
                    if (msg.f422323a.containsKey("isFav")) {
                        java.lang.Object obj6 = msg.f422323a.get("isFav");
                        str2 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                        jSONObject.put("isFav", str2 != null ? java.lang.Boolean.parseBoolean(str2) : false);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "operateFinderVideo operateData: " + jSONObject);
                    java.lang.String PROCESS_MAIN3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN3, "PROCESS_MAIN");
                    com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN3, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject.toString()), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.l(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.t(env, msg));
                    return;
                }
                return;
            case 329436478:
                if (action.equals("getFinderPlayInfo")) {
                    java.lang.Object obj7 = msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                    str2 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                    str = str2 != null ? str2 : "";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo data: %s", str);
                    java.lang.String PROCESS_MAIN4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN4, "PROCESS_MAIN");
                    com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN4, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.i(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.q(env, msg));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
