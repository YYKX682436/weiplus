package mw4;

/* loaded from: classes7.dex */
public final class w extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean l(int i17, java.lang.String reqUrl, r45.s83 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (i17 != 11) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String mo120156xb5887639 = c().f263449a.mo120156xb5887639();
        h0Var.f391656d = mo120156xb5887639;
        boolean z17 = true;
        if (!r26.i0.p(reqUrl, mo120156xb5887639, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizMpVideoInterceptor", "url changed after do get A8key, webUrl:" + ((java.lang.String) h0Var.f391656d) + ", reqUrl:" + reqUrl);
            return false;
        }
        if ((resp.f467084m.f472371d & 2097152) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMpVideoInterceptor", "on spa auth resp handle start");
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new mw4.v(resp, this, reqUrl, h0Var, null), 3, null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMpVideoInterceptor", "spa auth getA8key not allow");
        nw4.n jsApiHandler = c().g0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiHandler, "jsApiHandler");
        java.lang.String str = "doAuthCurrentUrl:fail a8key not allow";
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o0.f267935e;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDoAuthCurrentUrl", "lastCallBackID is null");
        } else {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n0(jsApiHandler, str));
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean n() {
        java.lang.String Z = c().Z();
        boolean z17 = true;
        if (Z != null && r26.i0.y(Z, "https", false)) {
            java.lang.String Z2 = c().Z();
            if (Z2 == null || Z2.length() == 0) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMpVideoInterceptor", "RequestAuthCurrentUrl startGetA8Key:" + Z2);
            c().V0(Z2, true, 11);
            return true;
        }
        nw4.n jsApiHandler = c().g0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiHandler, "jsApiHandler");
        java.lang.String str = "doAuthCurrentUrl:fail url is invalid";
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o0.f267935e;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDoAuthCurrentUrl", "lastCallBackID is null");
        } else {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n0(jsApiHandler, str));
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3
    public boolean s(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullUrl, "fullUrl");
        return !z17 && i17 == 11;
    }
}
