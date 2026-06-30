package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public final class o implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public java.lang.String a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("action");
            return optString == null ? "" : optString;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public void b(java.lang.String content, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1.class)).Zi()).f262965o).b(0, tag, content, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.n.f263104a);
    }

    public void c(int i17, java.lang.String sessionId, int i18, int i19, java.lang.String cgiAction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiAction, "cgiAction");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 c6367x7875a8e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4();
        c6367x7875a8e4.f137160e = i17;
        c6367x7875a8e4.f137162g = i18;
        c6367x7875a8e4.q("");
        c6367x7875a8e4.p("");
        c6367x7875a8e4.f137165j = 0;
        c6367x7875a8e4.t(sessionId);
        c6367x7875a8e4.f137168m = java.lang.System.currentTimeMillis();
        c6367x7875a8e4.f137169n = i19;
        c6367x7875a8e4.f137170o = c6367x7875a8e4.b("CgiAction", cgiAction, true);
        c6367x7875a8e4.k();
        su4.k3.m(c6367x7875a8e4);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        if (m1Var instanceof su4.x1) {
            su4.x1 x1Var = (su4.x1) m1Var;
            if (android.text.TextUtils.isEmpty(x1Var.f494667n.C)) {
                str2 = x1Var.f494667n.f494618y;
                str3 = "requestId";
            } else {
                str2 = x1Var.f494667n.C;
                str3 = "content";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, str3);
            if (!android.text.TextUtils.isEmpty(x1Var.f494667n.C)) {
                str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.d2) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1.class)).Zi()).f262965o).a(x1Var.f494667n.C);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getContentKey(...)");
            }
            r45.u97 u97Var = x1Var.f494668o;
            su4.r1 r1Var = x1Var.f494667n;
            if (u97Var == null || r1Var == null) {
                return;
            }
            java.lang.String str4 = r1Var.E;
            if (!(str4 == null || str4.length() == 0)) {
                java.lang.String imageSearchSessionId = r1Var.E;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageSearchSessionId, "imageSearchSessionId");
                c(7, imageSearchSessionId, r1Var.f494599f, i18, a(r1Var.C));
            }
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSChatSearchLogic", "net scene fail requestId:" + x1Var.f494667n.f494618y + " reqKey:" + x1Var.f494667n.B);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("ret", -1);
                } catch (java.lang.Exception unused) {
                }
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                b(jSONObject2, str2);
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("net scene success requestId:");
            sb6.append(x1Var.f494667n.f494618y);
            sb6.append(" reqKey:");
            sb6.append(x1Var.f494667n.B);
            sb6.append(" jsonStr:");
            java.lang.String str5 = u97Var.f468696d;
            sb6.append(str5 != null ? java.lang.Integer.valueOf(str5.length()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSChatSearchLogic", sb6.toString());
            java.lang.String json_str = u97Var.f468696d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(json_str, "json_str");
            b(json_str, str2);
        }
    }
}
