package gy4;

/* loaded from: classes5.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy4.u f359152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(gy4.u uVar) {
        super(4);
        this.f359152d = uVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String c17;
        com.p314xaae8f345.p3210x3857dc.y0 y0Var;
        java.lang.String urlPath = (java.lang.String) obj;
        java.util.Map lowercaseHeaders = (java.util.Map) obj2;
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview = (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) obj3;
        com.p314xaae8f345.p3210x3857dc.x0 request = (com.p314xaae8f345.p3210x3857dc.x0) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlPath, "urlPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowercaseHeaders, "lowercaseHeaders");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] start, urlPath: ".concat(urlPath));
        java.lang.String lowerCase = "File-ID".toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String str = (java.lang.String) lowercaseHeaders.get(lowerCase);
        java.io.InputStream inputStream = null;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] no fileId in headers, return null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] fileId: ".concat(str));
        gy4.u uVar = this.f359152d;
        if (uVar.f359162h.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] fileId already requested, return null");
            return null;
        }
        qg5.l0 l0Var = (qg5.l0) uVar.T6();
        l0Var.getClass();
        qg5.r rVar = (qg5.r) l0Var.f444591t.get();
        c01.ob obVar = rVar == null ? null : (c01.ob) ((java.util.Map) ((jz5.n) rVar.f444686d).mo141623x754a37bb()).get(str);
        if (obVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] chat record not found for fileId: " + str + ", return not found");
            byte[] bytes = "404 Not Found".getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            return new com.p314xaae8f345.p3210x3857dc.y0("text/plain", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, 404, "Not Found", null, new java.io.BufferedInputStream(new java.io.ByteArrayInputStream(bytes)));
        }
        uVar.f359162h.put(str, java.lang.Boolean.TRUE);
        java.lang.String str2 = (java.lang.String) p3325xe03a0797.p3326xc267989b.l.f(null, new gy4.n(obVar, null), 1, null);
        if (str2 == null) {
            c17 = null;
        } else {
            c17 = q75.g.c(str2);
            if (c17 == null) {
                c17 = q75.g.d(str2);
            }
        }
        if (c17 == null) {
            c17 = "application/octet-stream";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] mime type: ".concat(c17));
        java.lang.String str3 = (java.lang.String) p3325xe03a0797.p3326xc267989b.l.f(null, new gy4.s(obVar, null), 1, null);
        if (str3 != null) {
            try {
                if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewChatRecordsUIC", "[loadFileStream] file exists: ".concat(str3));
                    try {
                        java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(str3);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(E);
                        inputStream = E;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewChatRecordsUIC", "[loadFileStream] openRead fail: " + e17);
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewChatRecordsUIC", "[loadFileStream] " + e18);
            }
        }
        if (inputStream != null) {
            y0Var = new com.p314xaae8f345.p3210x3857dc.y0(c17, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, inputStream);
            y0Var.f302154a = c17;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewChatRecordsUIC", "[handleGetFileData] file stream not available for fileId: " + str + ", return not found");
            byte[] bytes2 = "404 Not Found".getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            y0Var = new com.p314xaae8f345.p3210x3857dc.y0("text/plain", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, 404, "Not Found", null, new java.io.BufferedInputStream(new java.io.ByteArrayInputStream(bytes2)));
        }
        return y0Var;
    }
}
