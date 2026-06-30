package gy4;

/* loaded from: classes5.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy4.u f359150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(gy4.u uVar) {
        super(4);
        this.f359150d = uVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r0 r0Var;
        java.lang.String urlPath = (java.lang.String) obj;
        java.util.Map lowercaseHeaders = (java.util.Map) obj2;
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview = (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) obj3;
        com.p314xaae8f345.p3210x3857dc.x0 request = (com.p314xaae8f345.p3210x3857dc.x0) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlPath, "urlPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowercaseHeaders, "lowercaseHeaders");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetChatRecord] start, urlPath: ".concat(urlPath));
        gy4.u uVar = this.f359150d;
        if (uVar.f359161g.getAndSet(true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewChatRecordsUIC", "[handleGetChatRecord] already got chat records, return null");
            return null;
        }
        qg5.r rVar = (qg5.r) ((qg5.l0) uVar.T6()).f444591t.get();
        java.util.List<c01.ob> list = rVar == null ? kz5.p0.f395529d : rVar.f444685c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetChatRecord] got " + list.size() + " records");
        gy4.d U6 = uVar.U6();
        if (U6 != null) {
            str = U6.f359123e;
            if (str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                throw null;
            }
        } else {
            str = "";
        }
        qg5.r rVar2 = (qg5.r) ((qg5.l0) uVar.T6()).f444591t.get();
        java.lang.String str3 = rVar2 == null ? null : rVar2.f444683a;
        java.lang.String str4 = str3 != null ? str3 : "";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (c01.ob obVar : list) {
            java.lang.String str5 = (java.lang.String) p3325xe03a0797.p3326xc267989b.l.f(null, new gy4.h(obVar, null), 1, null);
            if (str5 == null) {
                r0Var = null;
            } else {
                c01.nb nbVar = obVar.f118907b;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = obVar.f118906a;
                java.lang.String str6 = nbVar != null ? nbVar.f118884a : null;
                if (nbVar != null) {
                    try {
                    } catch (java.lang.Exception e17) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildFileCdnInfo, msg: ");
                        sb6.append(f9Var != null ? f9Var.Q0() : null);
                        sb6.append(' ');
                        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewChatRecordsUIC", e17, sb6.toString(), new java.lang.Object[0]);
                    }
                    if (((p3325xe03a0797.p3326xc267989b.c3) nbVar.f118885b).mo143975x62a56b47() || !((java.lang.Boolean) p3325xe03a0797.p3326xc267989b.l.f(null, new gy4.f(nbVar, null), 1, null)).booleanValue()) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append("file is not available in cdn, msg: ");
                        sb7.append(f9Var != null ? f9Var.Q0() : null);
                        sb7.append(' ');
                        sb7.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", sb7.toString());
                        str2 = "localData";
                    } else {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append("file is available in cdn, msg: ");
                        sb8.append(f9Var != null ? f9Var.Q0() : null);
                        sb8.append(' ');
                        sb8.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", sb8.toString());
                        str2 = "cdn";
                    }
                } else {
                    str2 = null;
                }
                r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r0(str5, str6, str2);
            }
            if (r0Var != null) {
                arrayList.add(r0Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q0(str, str4, new java.util.LinkedList(arrayList));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetChatRecord] return response with " + q0Var.j().size() + " records");
        java.lang.String jSONObject = q0Var.mo12245xcc313de3().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        byte[] bytes = jSONObject.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        return new com.p314xaae8f345.p3210x3857dc.y0("application/json", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, new java.io.ByteArrayInputStream(bytes));
    }
}
