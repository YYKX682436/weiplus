package f31;

/* loaded from: classes9.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final f31.f a(java.lang.String username, java.lang.String appId, java.lang.String subscribeUrl, java.util.List templateIds, java.lang.String extInfo, f31.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subscribeUrl, "subscribeUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateIds, "templateIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        f31.f fVar = new f31.f(username, appId, 2);
        e(extInfo, fVar);
        fVar.f340810f = eVar;
        fVar.f340812h = subscribeUrl;
        java.util.Iterator it = templateIds.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.List list = fVar.f340808d;
            r45.th6 th6Var = new r45.th6();
            th6Var.f467975d = str;
            ((java.util.ArrayList) list).add(th6Var);
        }
        return fVar;
    }

    public final f31.f b(java.lang.String username, java.lang.String appId, java.util.List templates, java.lang.String extInfo, f31.e eVar, boolean z17, byte[] byteArray, com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e c11157x9b46987e) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templates, "templates");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteArray, "byteArray");
        return c(username, appId, z17, eVar, templates, 6, byteArray, c11157x9b46987e, extInfo);
    }

    public final f31.f c(java.lang.String str, java.lang.String str2, boolean z17, f31.e eVar, java.util.List list, int i17, byte[] bArr, com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e c11157x9b46987e, java.lang.String str3) {
        f31.f fVar = new f31.f(str, i17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        fVar.f340806b = str2;
        fVar.f340810f = eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bArr, "<set-?>");
        fVar.f340817m = bArr;
        fVar.f340813i = c11157x9b46987e;
        e(str3, fVar);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
            java.util.List list2 = fVar.f340808d;
            r45.th6 th6Var = new r45.th6();
            th6Var.f467975d = c11159x8f55e6d3.f153336f;
            th6Var.f467976e = c11159x8f55e6d3.f153337g;
            th6Var.f467980i = c11159x8f55e6d3.f153340m;
            th6Var.f467988t = c11159x8f55e6d3.f153348u ? 1 : 0;
            th6Var.f467991w = c11159x8f55e6d3.f153351x ? 1 : 0;
            th6Var.C = c11159x8f55e6d3.A ? 1 : 0;
            th6Var.f467982n = c11159x8f55e6d3.f153341n ? 1 : 0;
            th6Var.f467993y = c11159x8f55e6d3.f153352y;
            th6Var.B = c11159x8f55e6d3.C ? 1 : 0;
            ((java.util.ArrayList) list2).add(th6Var);
        }
        return fVar;
    }

    public final void e(java.lang.String str, f31.f fVar) {
        if (str.length() > 0) {
            fVar.f340816l = str;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                fVar.f340814j = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                java.lang.String optString = jSONObject.optString("sessionid");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                fVar.f340815k = optString;
                java.lang.String optString2 = jSONObject.optString(dm.i4.f66875xa013b0d5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                if (optString2.length() > 0) {
                    fVar.f340805a = optString2;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneSubscribeMsg", "parseExtInfo scene: %s, sessionId: %s, username: %s, extInfo: %s", java.lang.Integer.valueOf(fVar.f340814j), fVar.f340815k, fVar.f340805a, str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("NetSceneSubscribeMsg", e17, "parse extInfo exception", new java.lang.Object[0]);
            }
        }
    }
}
