package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class g1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.p3210x3857dc.y0 f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview, com.p314xaae8f345.p3210x3857dc.x0 request) {
        com.p314xaae8f345.p3210x3857dc.y0 y0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.lang.String uri = request.mo120512xb5887639().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
        if (!r26.i0.y(uri, "webcompt://", false)) {
            return null;
        }
        nw4.n g07 = c().g0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g07, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y1 y17 = g07.y();
        if (y17 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 c17 = y17.c();
        c17.getClass();
        android.net.Uri mo120512xb5887639 = request.mo120512xb5887639();
        java.lang.String host = mo120512xb5887639.getHost();
        if (host == null) {
            host = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComponent", "getInterceptResponse " + mo120512xb5887639);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.s1 s1Var = c17.f269345b;
        s1Var.a(bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) c17.k().get(host);
        if (k0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("['");
            java.util.List list = (java.util.List) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269333h).mo141623x754a37bb();
            java.security.SecureRandom secureRandom = new java.security.SecureRandom();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bArr = new byte[((java.lang.Number) it.next()).intValue()];
                secureRandom.nextBytes(bArr);
                arrayList.add(kz5.z.a0(bArr, "", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b1.f269298d, 30, null));
            }
            sb6.append(kz5.n0.g0(arrayList, "','", null, null, 0, null, null, 62, null));
            sb6.append("']");
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComponent", "buildMatrix " + sb7 + ", " + mo120512xb5887639);
            java.lang.String x17 = r26.i0.x((java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269334i).mo141623x754a37bb(), "$__IFRAME_MATRIX__$", sb7, false, 4, null);
            java.lang.String name = k0Var.f269372b.f453539d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
            java.lang.String x18 = r26.i0.x(x17, "$__WEB_COMPT_NAME__$", name, false, 4, null);
            c17.h(k0Var.a(), "WeixinWebCompt.onBind.apply(WeixinWebCompt, " + sb7 + ')');
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("ready to response ");
            sb8.append(mo120512xb5887639);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComponent", sb8.toString());
            byte[] bytes = x18.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            y0Var = new com.p314xaae8f345.p3210x3857dc.y0("text/html", "utf8", new java.io.ByteArrayInputStream(bytes));
            k0Var.f269374d = true;
            s1Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.F);
        } else {
            s1Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.G);
            byte[] bytes2 = ("webCompt: " + host + " not found").getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            y0Var = new com.p314xaae8f345.p3210x3857dc.y0("text/html", "utf8", new java.io.ByteArrayInputStream(bytes2));
        }
        return y0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean j(java.lang.String url, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
        return r26.i0.y(url, "webcompt://", false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean l(int i17, java.lang.String reqUrl, r45.s83 resp) {
        byte[] d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        r45.cu5 cu5Var = resp.D;
        if (cu5Var != null && (d17 = x51.j1.d(cu5Var)) != null) {
            try {
                r45.f97 f97Var = new r45.f97();
                f97Var.mo11468x92b714fd(d17);
                java.lang.String FullURL = resp.f467078d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(FullURL, "FullURL");
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h1.a(FullURL, f97Var.f455651d);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebComponentInterceptor", e17, "parse WebComponentInfo", new java.lang.Object[0]);
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3 r(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webView, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
        return r26.i0.y(url, "webcompt://", false) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.h3(true, false) : super.r(webView, url);
    }
}
