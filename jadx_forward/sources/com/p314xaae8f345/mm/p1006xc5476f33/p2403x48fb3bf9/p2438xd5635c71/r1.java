package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f269427a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f269428b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 f269429c;

    /* renamed from: d, reason: collision with root package name */
    public final nw4.e f269430d;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 webComponent, java.lang.String webComptName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webComponent, "webComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webComptName, "webComptName");
        this.f269427a = webComponent;
        this.f269428b = webComptName;
        this.f269430d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.m1(this);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.r1 r1Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r f17 = r1Var.f269427a.f(r1Var.f269428b);
        if (f17 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) f17).mo14660x738236e6(str, null);
        }
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.r1 r1Var, java.lang.String str) {
        nw4.n nVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        java.lang.ref.WeakReference weakReference = r1Var.f269427a.f269344a;
        if (weakReference == null || (nVar = (nw4.n) weakReference.get()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = r1Var.f269429c;
        if (c19775x58fd37b3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsPerm");
            throw null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, r1Var.f269428b);
        nw4.e eVar = r1Var.f269430d;
        boolean z17 = false;
        nw4.y2 y2Var = (nw4.y2) ((java.util.LinkedList) nw4.z2.b("[" + str + "]", false, nVar.f422437r)).remove(0);
        if (y2Var != null) {
            try {
                z17 = nVar.f422432m.ja(nVar.f422439t);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandler", "isBusy, ex = " + e17.getMessage());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "checkIsMsgQueueBusy isBusy = " + z17);
            if (z17 && (n3Var = nVar.f422425f) != null) {
                y2Var.f422548e = bundle;
                y2Var.f422549f = c19775x58fd37b3;
                y2Var.f422550g = eVar;
                n3Var.mo50293x3498a0(new nw4.m2(nVar, y2Var));
                return;
            }
        }
        if (nVar.f422427h) {
            return;
        }
        nVar.m(y2Var, c19775x58fd37b3, bundle, eVar);
    }

    @android.webkit.JavascriptInterface
    public final void cgi(java.lang.String callbackId, java.lang.String request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackId, "callbackId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.s1 s1Var = this.f269427a.f269345b;
        if (s1Var != null) {
            s1Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.f269276J);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x xVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.g97 g97Var = new r45.g97();
        g97Var.f456562d = request;
        lVar.f152197a = g97Var;
        lVar.f152198b = new r45.h97();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/webcompt/webcomptcommcgi";
        lVar.f152200d = 2936;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        ((h80.i) xVar).wi(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.n1(this, callbackId));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: errReport */
    public final void m74933xe17d6af9(java.lang.String errMsg, java.lang.String errStack, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errStack, "errStack");
        this.f269427a.g(this.f269428b, errMsg, errStack, i17, i18);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: idkey */
    public final void m74934x5f6b764(long j17, long j18, long j19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, j18, j19);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: idkeyList */
    public final void m74935x33688a22(java.lang.String list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        cl0.e eVar = new cl0.e(list);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
        for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
            cl0.e a17 = eVar.a(i17);
            linkedList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(a17.mo15053xfb822ef2(0), a17.mo15053xfb822ef2(1), a17.mo15053xfb822ef2(2)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(new java.util.ArrayList(linkedList), false, false);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: invoke */
    public final void m74936xb9724478(java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        if (message.length() == 0) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            b(this, message);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.o1(this, message));
        }
    }

    @android.webkit.JavascriptInterface
    public final void kv(int i17, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, data);
    }

    @android.webkit.JavascriptInterface
    public final void log(int i17, java.lang.String tag, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = "webCompt[" + tag + ']';
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, msg);
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, msg);
        } else if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, msg);
        } else {
            if (i17 != 5) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f(str, msg);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: performance */
    public final java.lang.String m74937xa7c31030(java.lang.String frontEndPerformance) {
        java.lang.String str;
        o25.k2 k2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frontEndPerformance, "frontEndPerformance");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f1Var = this.f269427a;
        f1Var.getClass();
        java.lang.String webCompt = this.f269428b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webCompt, "webCompt");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) f1Var.k().get(webCompt);
        if (k0Var == null || (k2Var = k0Var.f269382l) == null) {
            str = "";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.j0> i17 = kz5.c0.i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.j0.f269361f, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.j0.f269363h, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.j0.f269364i, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.j0.f269362g);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.j0 j0Var : i17) {
                java.lang.String str2 = j0Var.f269366d + "_START";
                long j17 = k2Var.f424083a;
                linkedList.add(java.lang.String.valueOf(k2Var.b(str2, j17) - j17));
                linkedList.add(java.lang.String.valueOf(k2Var.b(j0Var.f269366d + "_END", j17) - j17));
            }
            sb6.append(kz5.n0.g0(linkedList, ",", null, ",", 0, null, null, 58, null) + r26.i0.s("0,", (9 - i17.size()) * 2));
            sb6.append(frontEndPerformance);
            str = sb6.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComponent", "performance: " + str);
            java.lang.Object[] objArr = new java.lang.Object[6];
            nw4.n nVar = (nw4.n) f1Var.f269344a.get();
            java.lang.String str3 = nVar != null ? nVar.f422421b : null;
            if (str3 == null) {
                str3 = "";
            }
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.a.f269270a;
            objArr[0] = fp.s0.b(str3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            java.lang.String str4 = k0Var.f269378h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<this>");
            objArr[1] = fp.s0.b(str4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            objArr[2] = k0Var.f269377g;
            objArr[3] = webCompt;
            objArr[4] = java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e.j().f269356b).mo141623x754a37bb()).intValue());
            objArr[5] = k0Var.f269381k;
            java.lang.String g07 = kz5.n0.g0(kz5.c0.i(objArr), ",", null, ",", 0, null, null, 58, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(18151, g07 + str);
        }
        return str == null ? "" : str;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: refreshA8Key */
    public final void m74938xfb7c90cd(java.lang.String callbackId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackId, "callbackId");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.p1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.q1 q1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.q1(this, callbackId);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f1Var = this.f269427a;
        f1Var.getClass();
        java.lang.String webCompt = this.f269428b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webCompt, "webCompt");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.k0) f1Var.k().get(webCompt);
        if (k0Var == null || !(!r26.n0.N(k0Var.f269379i))) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.d1(f1Var, k0Var, q1Var, p1Var, null), 3, null);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: sendMessage */
    public final void m74939x2936bf5f(java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f1Var = this.f269427a;
        f1Var.getClass();
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.z0(f1Var, "window.WeixinOpenTags && window.WeixinOpenTags.onMessage(" + data + ')', com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.x0.f269479d));
        f1Var.f269345b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.I);
    }
}
