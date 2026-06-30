package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class ac extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ac f267481d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ac();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        long j17;
        long j18;
        int intExtra;
        long j19;
        java.lang.String str;
        long j27;
        long parseLong;
        long parseLong2;
        android.content.Intent intent;
        android.content.Intent intent2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSendMessageToLiteApp", "JsApiSendMessageToLiteApp");
        java.lang.Object obj = ((java.util.HashMap) msg.f422323a).get("target");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        org.json.JSONObject jSONObject = str2 != null ? new org.json.JSONObject(str2) : new org.json.JSONObject();
        java.lang.String optString = jSONObject.optString("type", "");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, ya.b.f77502x92235c1b)) {
            android.content.Context context = env.f422393a;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            java.lang.Long valueOf = (activity == null || (intent2 = activity.getIntent()) == null) ? null : java.lang.Long.valueOf(intent2.getLongExtra("liteAppUuid", 0L));
            java.lang.Long valueOf2 = (activity == null || (intent = activity.getIntent()) == null) ? null : java.lang.Long.valueOf(intent.getLongExtra("liteAppPageId", 0L));
            if (valueOf != null && valueOf2 != null) {
                parseLong = valueOf.longValue();
                parseLong2 = valueOf2.longValue();
                j27 = parseLong;
                str = "app.postmessage";
                intExtra = 0;
                j19 = parseLong2;
            }
            j27 = 0;
            j19 = 0;
            str = "app.postmessage";
            intExtra = 0;
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "liteapp")) {
                java.lang.String optString2 = jSONObject.optString(dm.i4.f66865x76d1ec5a, "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                java.util.List f07 = r26.n0.f0(optString2, new java.lang.String[]{"_"}, false, 0, 6, null);
                if (f07.size() == 2) {
                    parseLong = java.lang.Long.parseLong((java.lang.String) f07.get(0));
                    parseLong2 = java.lang.Long.parseLong((java.lang.String) f07.get(1));
                    j27 = parseLong;
                    str = "app.postmessage";
                    intExtra = 0;
                    j19 = parseLong2;
                }
            } else if (optString.equals("parent")) {
                zg0.q2 a17 = env.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17 : null;
                long intExtra2 = r0Var != null ? r0Var.d0().getIntExtra("liteAppAppUuid", 0) : 0L;
                if (r0Var != null) {
                    j17 = intExtra2;
                    j18 = r0Var.d0().getIntExtra("liteAppPageId", 0);
                } else {
                    j17 = intExtra2;
                    j18 = 0;
                }
                intExtra = r0Var != null ? r0Var.d0().getIntExtra("liteAppNodeId", 0) : 0;
                j19 = j18;
                str = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7;
                j27 = j17;
            }
            j27 = 0;
            j19 = 0;
            str = "app.postmessage";
            intExtra = 0;
        }
        nw4.g gVar = env.f422396d;
        if (j27 == 0 || j19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSendMessageToLiteApp", "appUuid or pageId is 0");
            gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
            return false;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("type", "webview");
        jSONObject3.put(dm.i4.f66865x76d1ec5a, java.lang.String.valueOf(gVar.d()));
        jSONObject2.put(ya.b.f77502x92235c1b, jSONObject3);
        java.lang.Object obj2 = ((java.util.HashMap) msg.f422323a).get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str3 != null ? new org.json.JSONObject(str3) : new org.json.JSONObject());
        if (str.equals("app.postmessage")) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(j27, j19, str, jSONObject2);
        } else if (str.equals(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65425x740699c8(j27, j19, intExtra, str, jSONObject2);
        }
        gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 525;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "sendMessageToLiteApp";
    }
}
