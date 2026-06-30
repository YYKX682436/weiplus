package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/webview/WebViewTransHelper;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "destroyPageLogicController", "Lcw4/n;", "webviewUIStyleDelegate", "<init>", "(Lcw4/n;)V", "cw4/y0", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.WebViewTransHelper */
/* loaded from: classes8.dex */
public final class C19231x33dc2abd implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final cw4.n f263274d;

    /* renamed from: e, reason: collision with root package name */
    public cw4.m0 f263275e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f263276f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f263277g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f263278h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f263279i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.i0 f263280m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f263281n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f263282o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f263283p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f263284q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Object f263285r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f263286s;

    public C19231x33dc2abd(cw4.n webviewUIStyleDelegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webviewUIStyleDelegate, "webviewUIStyleDelegate");
        this.f263274d = webviewUIStyleDelegate;
        this.f263277g = new java.util.LinkedHashMap();
        this.f263278h = new p012xc85e97e9.p093xedfae76a.j0();
        this.f263279i = new p012xc85e97e9.p093xedfae76a.j0();
        this.f263280m = new p012xc85e97e9.p093xedfae76a.i0();
        this.f263282o = "";
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f263284q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364>(a0Var) { // from class: com.tencent.mm.plugin.webview.WebViewTransHelper$onTranslateLanguageChangedListener$1
            {
                this.f39173x3fe91575 = -348375692;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 c5234x14788364) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 event = c5234x14788364;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event.f135568g == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd.this;
                c19231x33dc2abd.getClass();
                c19231x33dc2abd.f(cw4.n0.f305788e, cw4.o0.f305794h);
                ((java.util.LinkedHashMap) c19231x33dc2abd.f263277g).clear();
                if (c19231x33dc2abd.f263278h.mo3195x754a37bb() != cw4.p0.f305798f) {
                    c19231x33dc2abd.h(null);
                    return false;
                }
                c19231x33dc2abd.g(new cw4.g1(c19231x33dc2abd));
                return false;
            }
        };
        this.f263285r = new java.lang.Object();
        this.f263286s = new java.util.ArrayList();
        this.f263281n = false;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(webviewUIStyleDelegate.c(), java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "fast open");
            d(webviewUIStyleDelegate.mo122969x86b9ebe3());
            c().d();
        }
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd) {
        cw4.n nVar = c19231x33dc2abd.f263274d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nVar.f(0), java.lang.Boolean.FALSE)) {
            nVar.a(cw4.c0.f305735e, cw4.d0.f305739d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "forbid menu!");
            return;
        }
        p012xc85e97e9.p093xedfae76a.j0 j0Var = c19231x33dc2abd.f263278h;
        cw4.p0 p0Var = (cw4.p0) j0Var.mo3195x754a37bb();
        int i17 = p0Var == null ? -1 : cw4.z0.f305843a[p0Var.ordinal()];
        cw4.d0 d0Var = i17 != 1 ? i17 != 2 ? cw4.d0.f305739d : cw4.d0.f305739d : cw4.d0.f305740e;
        if (c19231x33dc2abd.c().f305786v.mo3195x754a37bb() != cw4.y.f305833e && !c19231x33dc2abd.c().f305777m && j0Var.mo3195x754a37bb() != cw4.p0.f305798f) {
            nVar.a(cw4.c0.f305735e, d0Var);
            return;
        }
        if (j0Var.mo3195x754a37bb() == cw4.p0.f305798f) {
            nVar.a(cw4.c0.f305736f, d0Var);
            return;
        }
        p012xc85e97e9.p093xedfae76a.j0 j0Var2 = c19231x33dc2abd.f263279i;
        java.lang.Integer num = j0Var2.mo3195x754a37bb() == null ? 0 : (java.lang.Integer) j0Var2.mo3195x754a37bb();
        if (num != null) {
            if (num.intValue() < 100) {
                nVar.a(cw4.c0.f305736f, d0Var);
            } else {
                nVar.a(cw4.c0.f305735e, d0Var);
            }
        }
    }

    public final void b(java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "get web page content: ".concat(content));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new cw4.a1(this, content));
    }

    public final cw4.m0 c() {
        cw4.m0 m0Var = this.f263275e;
        if (m0Var != null) {
            return m0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pageLogicController");
        throw null;
    }

    public final void d(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "initPage");
        synchronized (this.f263285r) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c27816xac2547f9, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMWebView");
            cw4.m0 m0Var = new cw4.m0((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) c27816xac2547f9);
            m0Var.f305778n = new cw4.f1(this);
            this.f263275e = m0Var;
        }
        this.f263281n = true;
        cw4.n nVar = this.f263274d;
        if (nVar.mo122968x95c7fa5f() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "webViewUIHelper.webViewUI == null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "initObserver");
            p012xc85e97e9.p093xedfae76a.j0 j0Var = c().f305779o;
            p012xc85e97e9.p093xedfae76a.y mo122968x95c7fa5f = nVar.mo122968x95c7fa5f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo122968x95c7fa5f);
            j0Var.mo7806x9d92d11c(mo122968x95c7fa5f, new cw4.b1(this));
            p012xc85e97e9.p093xedfae76a.i0 i0Var = new p012xc85e97e9.p093xedfae76a.i0();
            i0Var.mo3194xffc8101c(c().f305786v, new cw4.c1(this));
            i0Var.mo3194xffc8101c(this.f263278h, new cw4.d1(this));
            p012xc85e97e9.p093xedfae76a.y mo122968x95c7fa5f2 = nVar.mo122968x95c7fa5f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo122968x95c7fa5f2);
            i0Var.mo7806x9d92d11c(mo122968x95c7fa5f2, new cw4.e1(this));
            this.f263280m = i0Var;
        }
        this.f263284q.mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "notifyPageInit");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f263285r) {
            arrayList.addAll(this.f263286s);
            this.f263286s.clear();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).mo152xb9724478();
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: destroyPageLogicController */
    public final void m74135xac0b38b1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "destroy");
        if (this.f263275e != null) {
            c().f305780p.g(p012xc85e97e9.p093xedfae76a.n.DESTROYED);
        }
    }

    public final void e(cw4.b0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (this.f263275e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "pageLogic is not initialized!");
            return;
        }
        if (this.f263274d.mo122968x95c7fa5f() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "webViewUIHelper.webViewUI == null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "onChangeTransStatus Entry Scene " + scene);
        cw4.p0 p0Var = (cw4.p0) this.f263278h.mo3195x754a37bb();
        int i17 = p0Var == null ? -1 : cw4.z0.f305843a[p0Var.ordinal()];
        if (i17 != -1) {
            if (i17 == 1) {
                f(cw4.n0.f305788e, scene == cw4.b0.f305730e ? cw4.o0.f305793g : cw4.o0.f305792f);
                g(null);
                return;
            } else if (i17 != 2 && i17 != 3) {
                return;
            }
        }
        f(cw4.n0.f305788e, scene == cw4.b0.f305730e ? cw4.o0.f305790d : cw4.o0.f305791e);
        cw4.m0 c17 = c();
        java.lang.String b17 = c17.b(c17.f305776i);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewTransHelper", "check js script is null, inject fail!");
        } else {
            c17.f305784t = 0;
            c17.f305771d.mo14660x738236e6(b17, new cw4.h0(c17, b17));
        }
    }

    public final void f(cw4.n0 action, cw4.o0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f263274d.e(action, scene);
    }

    public final void g(yz5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "revertTrans");
        this.f263278h.mo7808x76db6cb1(cw4.p0.f305799g);
        cw4.m0 c17 = c();
        c17.f305779o.mo523x53d8522f(cw4.q0.f305802d);
        cw4.x xVar = c17.f305774g;
        xVar.f305825f.clear();
        xVar.f305823d.g(p012xc85e97e9.p093xedfae76a.n.DESTROYED);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = c17.f305781q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        c17.a(c17.f305771d, "window.WeixinTranslate.revertTrans()", aVar);
        cw4.o oVar = c17.f305778n;
        if (oVar != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("action", "revert");
            ((cw4.f1) oVar).f305751a.f263274d.b("onCallWebTranslateApi", hashMap);
        }
    }

    public final void h(yz5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "startTrans");
        this.f263278h.mo7808x76db6cb1(cw4.p0.f305798f);
        c().c(aVar);
    }
}
