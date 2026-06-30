package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final nw4.n f269483a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f269484b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f269485c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f269486d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f269487e;

    public y1(nw4.n jsapi) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapi, "jsapi");
        this.f269483a = jsapi;
        this.f269484b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.x1(this));
        this.f269485c = true;
        this.f269486d = "";
        this.f269487e = new java.util.HashMap();
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.w1(this));
    }

    public final void a() {
        this.f269486d = "";
        this.f269485c = true;
        this.f269487e.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 c17 = c();
        synchronized (c17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.e h17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e.h();
            h17.f269317a.clear();
            h17.f269318b.clear();
            if (c17.f269346c) {
                c17.k().a(c17.f269345b);
            }
        }
    }

    public final void b(java.lang.String appId, java.lang.String url, java.util.LinkedList webCompts) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webCompts, "webCompts");
        if (webCompts.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebComponent", "webCompt is null");
            return;
        }
        o25.k2 k2Var = new o25.k2();
        if (this.f269487e.isEmpty() && (!webCompts.isEmpty())) {
            c().f269345b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.f269286q);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        if (this.f269485c) {
            c0Var.f391645d = true;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f269486d, appId)) {
            c().f269345b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.f269287r);
        } else {
            a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 c17 = c();
            if (c17.f269346c) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.z0(c17, "window.WeixinOpenTags && window.WeixinOpenTags.onClean()", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.x0.f269479d));
                c17.f269345b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.f269285p);
            }
            c().f269345b.f269444a.clear();
        }
        this.f269486d = appId;
        this.f269485c = false;
        if (!webCompts.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
            pm0.v.L("MicroMsg.WebComponent", true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.t1(webCompts, this, k2Var, appId, url, c0Var));
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 c() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1) ((jz5.n) this.f269484b).mo141623x754a37bb();
    }

    @android.webkit.JavascriptInterface
    /* renamed from: sendMessage */
    public final void m74945x2936bf5f(java.lang.String webCompt, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webCompt, "webCompt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 c17 = c();
        c17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r f17 = c17.f(webCompt);
        if (f17 != null) {
            c17.h(f17, "WeixinWebCompt.onMessage(" + message + ')');
        }
        c17.f269345b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.H);
    }
}
