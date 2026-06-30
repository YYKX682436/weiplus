package yx4;

/* loaded from: classes7.dex */
public abstract class e extends qw4.a {
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String mo120156xb5887639;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.s1.f263505a.a()) {
                dp.a.m125854x26a183b(env.f422393a, c() + " called", 0).show();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiTransferRequestBase", e17, "showToast exception", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2();
        c12965xc9712d2.f175446d = e();
        java.lang.Object obj = msg.f422323a.get("scope");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        c12965xc9712d2.f175448f = str;
        zg0.q2 a17 = env.a();
        if (a17 == null || (mo120156xb5887639 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z()) == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
            mo120156xb5887639 = c22633x83752a59 != null ? c22633x83752a59.mo120156xb5887639() : null;
            if (mo120156xb5887639 == null) {
                mo120156xb5887639 = "";
            }
        }
        zq1.q0 q0Var = zq1.q0.f556552a;
        if (mo120156xb5887639.length() == 0) {
            mo120156xb5887639 = "";
        } else if (r26.i0.y(mo120156xb5887639, "file", false)) {
            java.util.Iterator it = ((java.util.HashMap) ((jz5.n) zq1.q0.f556553b).mo141623x754a37bb()).entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (r26.i0.y(mo120156xb5887639, (java.lang.String) entry.getKey(), false)) {
                    java.lang.String str2 = (java.lang.String) entry.getValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TransferRequestUrlInterceptor", "transferRequest interceptUrl url: %s, result: %s", mo120156xb5887639, str2);
                    mo120156xb5887639 = str2;
                    break;
                }
            }
        }
        c12965xc9712d2.f175447e = mo120156xb5887639;
        r45.y24 y24Var = new r45.y24();
        java.lang.Object obj2 = msg.f422323a.get("reqUrl");
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str3 == null) {
            str3 = "";
        }
        y24Var.f472258d = str3;
        java.lang.Object obj3 = msg.f422323a.get("reqBody");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str4 == null) {
            str4 = "";
        }
        y24Var.f472259e = str4;
        java.lang.Object obj4 = msg.f422323a.get("cgiCmdId");
        y24Var.f472260f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null, 0);
        java.lang.Object obj5 = msg.f422323a.get(ya.b.f77491x8758c4e1);
        y24Var.f472262h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null, 0);
        c12965xc9712d2.f175450h = y24Var;
        c12965xc9712d2.f175451i = java.lang.Boolean.parseBoolean((java.lang.String) msg.f422323a.get("is_security_check"));
        zq1.f0 f0Var = (zq1.f0) gm0.j1.s(zq1.f0.class);
        java.lang.Object obj6 = msg.f422323a.get("debug_env");
        java.lang.String str5 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String b17 = ((js1.m) f0Var).b(str5);
        if (b17 == null) {
            b17 = "";
        }
        c12965xc9712d2.f175457r = b17;
        try {
            java.lang.Object obj7 = msg.f422323a.get("header");
            java.lang.String str6 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
            if (str6 == null) {
                str6 = "";
            }
            if (str6.length() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str6);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.String optString = jSONObject.optString(next);
                    if (optString == null) {
                        optString = "";
                    }
                    java.util.LinkedList linkedList = c12965xc9712d2.f175450h.f472261g;
                    r45.cw3 cw3Var = new r45.cw3();
                    cw3Var.f453393d = next;
                    cw3Var.f453394e = optString;
                    linkedList.push(cw3Var);
                }
            }
            java.lang.Object obj8 = msg.f422323a.get("debug_cookies");
            java.lang.String str7 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
            if (str7 == null) {
                str7 = "";
            }
            if (str7.length() > 0) {
                c12965xc9712d2.f175458s = new org.json.JSONObject(str7).optString("route_tag", "");
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiTransferRequestBase", e18, "parseTransferRequestInfo exception", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1454L, 183L, 1L);
        zq1.f0 f0Var2 = (zq1.f0) gm0.j1.s(zq1.f0.class);
        java.lang.String str8 = msg.f422546c;
        ((js1.m) f0Var2).c(c12965xc9712d2, new yx4.d(str8 != null ? str8 : "", c(), new java.lang.ref.WeakReference(env.f422396d)));
        return true;
    }

    public abstract int e();
}
