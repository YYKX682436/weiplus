package l63;

@j95.b
/* loaded from: classes9.dex */
public class h extends i95.w implements m63.g {
    public void Ai(com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16074x60a84deb c16074x60a84deb, byte[] bArr, java.lang.String str) {
        ot0.q qVar = new ot0.q();
        qVar.f430187f = c16074x60a84deb.f223644g;
        qVar.f430191g = c16074x60a84deb.f223648n;
        qVar.f430199i = 101;
        java.lang.String str2 = c16074x60a84deb.f223647m;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            qVar.f430179d = str2;
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str2);
            if (h17 != null) {
                qVar.H = h17.f67372x453d1e07;
            }
        }
        qVar.f430207k = "https://support.weixin.qq.com/update/";
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0 h0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 c16075xd72ab138 = c16074x60a84deb.f223641d;
        h0Var.f273198b = c16075xd72ab138.f223649d;
        h0Var.f273199c = c16075xd72ab138.f223650e;
        h0Var.f273200d = c16075xd72ab138.f223651f;
        h0Var.f273201e = c16075xd72ab138.f223653h.intValue();
        qVar.f(h0Var);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0 g0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0();
        g0Var.f273163b = c16075xd72ab138.f223652g;
        g0Var.f273164c = c16075xd72ab138.f223654i;
        g0Var.f273166e = c16074x60a84deb.f223642e;
        g0Var.f273167f = c16074x60a84deb.f223643f;
        g0Var.f273168g = c16074x60a84deb.f223645h;
        g0Var.f273169h = c16074x60a84deb.f223646i;
        qVar.f(g0Var);
        ((ez.w0) ot0.j1.a()).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, "", "", str, "", bArr);
    }

    public void Bi(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18) {
        java.util.HashSet hashSet = n63.a.f416747a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("johnexpose : snsId is ");
        sb6.append(str);
        sb6.append(", snssetlen is ");
        java.util.HashSet hashSet2 = n63.a.f416748b;
        sb6.append(hashSet2.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareCardReport", sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (i18 == 1) {
            if (kz5.n0.O(hashSet2, str)) {
                return;
            }
            if (str != null) {
                hashSet2.add(str);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28466, java.lang.Integer.valueOf(i17 == 0 ? 1 : 2), "", 2, str2, 0, str3, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? 2 : 1));
    }

    public void Di(int i17, java.lang.String url) {
        java.util.HashSet hashSet = n63.a.f416747a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareCardReport", "sourceImgInfoReport : actionId is " + i17 + ", url is " + url);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28466, 1, "", 1, "", 0, "", java.lang.Integer.valueOf(i17), 0, 3, url);
    }

    public void wi(ot0.q content, java.lang.Long l17, int i17) {
        long longValue = l17.longValue();
        java.util.HashSet hashSet = n63.a.f416747a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("johnexpose : msgSvrId is ");
        sb6.append(longValue);
        sb6.append(", chatsetlen is ");
        java.util.HashSet hashSet2 = n63.a.f416747a;
        sb6.append(hashSet2.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareCardReport", sb6.toString());
        if (java.lang.Long.valueOf(longValue).equals(0)) {
            return;
        }
        if (i17 == 1) {
            if (hashSet2.contains(java.lang.Long.valueOf(longValue))) {
                return;
            } else {
                hashSet2.add(java.lang.Long.valueOf(longValue));
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0 g0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0) content.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28466, java.lang.Integer.valueOf(g0Var.f273168g == 0 ? 1 : 2), "", 1, content.f430179d, 0, g0Var.f273166e, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(content.f430179d) ? 2 : 1));
    }
}
