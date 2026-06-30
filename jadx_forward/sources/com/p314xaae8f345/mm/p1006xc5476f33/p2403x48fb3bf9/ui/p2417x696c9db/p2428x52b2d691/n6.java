package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class n6 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n6 f267907d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n6();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        nw4.y2 y2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object obj = msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = msg.f422323a.get("sceneNote");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.Object obj3 = msg.f422323a.get("relativeURL");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.Object obj4 = msg.f422323a.get("appVersion");
        java.lang.String str4 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str4 == null) {
            str4 = "";
        }
        java.lang.Object obj5 = msg.f422323a.get("nativeExtraData");
        java.lang.String str5 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.Object obj6 = msg.f422323a.get("privateExtraData");
        java.lang.String str6 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        if (str6 == null) {
            str6 = "";
        }
        java.lang.Object obj7 = msg.f422323a.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        java.lang.String str7 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
        if (str7 == null) {
            str7 = "";
        }
        java.lang.Object obj8 = msg.f422323a.get("sourceAppId");
        java.lang.String str8 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
        if (str8 == null) {
            str8 = "";
        }
        java.lang.String str9 = str8;
        boolean y17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) msg.f422323a.get("useDraft"), false);
        java.lang.Object obj9 = msg.f422323a.get("mpPublishAction");
        java.lang.String str10 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
        if (str10 == null) {
            tk.v vVar = tk.w.f501411e;
            str10 = "openImage";
        }
        java.lang.String str11 = str10;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str);
            jSONObject.put("sceneNote", str2);
            jSONObject.put("relativeURL", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("nativeExtraData", str5);
            jSONObject.put("privateExtraData", str6);
            jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, str7);
            jSONObject.put("sourceAppId", str9);
            jSONObject.put("useDraft", y17);
            jSONObject.put("mpPublishAction", str11);
            y2Var = msg;
            try {
                if (y2Var.f422323a.get("draftScene") instanceof java.lang.String) {
                    jSONObject.put("draftScene", y2Var.f422323a.get("draftScene"));
                }
                if (y2Var.f422323a.get("draftType") instanceof java.lang.String) {
                    jSONObject.put("draftType", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O(y2Var.f422323a.get("draftType"), 0));
                }
            } catch (org.json.JSONException e17) {
                e = e17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBizPublishImage", "generate json error: " + e);
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject.toString()), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l6.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m6(env, y2Var));
                return true;
            }
        } catch (org.json.JSONException e18) {
            e = e18;
            y2Var = msg;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject.toString()), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l6.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m6(env, y2Var));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 536;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openBizPublishImage";
    }
}
