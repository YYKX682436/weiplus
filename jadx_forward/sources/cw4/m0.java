package cw4;

/* loaded from: classes8.dex */
public final class m0 implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f305771d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f305772e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f305773f;

    /* renamed from: g, reason: collision with root package name */
    public final cw4.x f305774g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f305775h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f305776i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f305777m;

    /* renamed from: n, reason: collision with root package name */
    public cw4.o f305778n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f305779o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f305780p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f305781q;

    /* renamed from: r, reason: collision with root package name */
    public final long f305782r;

    /* renamed from: s, reason: collision with root package name */
    public final int f305783s;

    /* renamed from: t, reason: collision with root package name */
    public int f305784t;

    /* renamed from: u, reason: collision with root package name */
    public final hy4.g0 f305785u;

    /* renamed from: v, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f305786v;

    public m0(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 webView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView, "webView");
        this.f305771d = webView;
        this.f305772e = "MicroMsg.WebTransPageLogic";
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575199l70);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f305773f = string;
        this.f305774g = new cw4.x();
        this.f305775h = "jsapi/doTranslate.js";
        this.f305776i = "jsapi/preCheckNeedTrans.js";
        this.f305779o = new p012xc85e97e9.p093xedfae76a.j0();
        p012xc85e97e9.p093xedfae76a.b0 b0Var = new p012xc85e97e9.p093xedfae76a.b0(this, true);
        this.f305780p = b0Var;
        b0Var.g(p012xc85e97e9.p093xedfae76a.n.CREATED);
        this.f305782r = 500L;
        this.f305783s = 10;
        this.f305785u = new hy4.g0();
        this.f305786v = new p012xc85e97e9.p093xedfae76a.j0();
    }

    public final void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str, yz5.a aVar) {
        try {
            c22633x83752a59.mo14660x738236e6(str, new cw4.g0(this, aVar));
            this.f305777m = true;
        } catch (java.lang.Exception e17) {
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f305772e, "execute js error! " + e17);
        }
    }

    public final java.lang.String b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewTransHelper", "getTransJS: %s", str);
        try {
            return new java.lang.String(s46.d.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open(str)), r26.c.f450398a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewTransHelper", "tryInterceptBridgeScriptRequest, failed, ", e17);
            return "";
        }
    }

    public final void c(yz5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305772e, "injectScriptAndStartTrans");
        this.f305779o.mo523x53d8522f(cw4.q0.f305803e);
        cw4.x xVar = this.f305774g;
        xVar.f305823d.g(p012xc85e97e9.p093xedfae76a.n.STARTED);
        xVar.f305824e.mo7806x9d92d11c(xVar, new cw4.i0(this));
        java.lang.String b17 = b(this.f305775h);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f305771d;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewTransHelper", "check js script is null, inject fail!");
        } else {
            cw4.o oVar = this.f305778n;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar != null ? ((cw4.f1) oVar).f305751a.f263282o : null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewTransHelper", "can't get random id from trans helper!");
            } else {
                cw4.o oVar2 = this.f305778n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar2);
                a(c22633x83752a59, r26.i0.t(b17, "__wx_trans_xxyy", ((cw4.f1) oVar2).f305751a.f263282o, false), null);
            }
        }
        a(c22633x83752a59, "window.WeixinTranslate.startTrans()", aVar);
        cw4.o oVar3 = this.f305778n;
        if (oVar3 != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("action", "trans");
            ((cw4.f1) oVar3).f305751a.f263274d.b("onCallWebTranslateApi", hashMap);
        }
    }

    public final void d() {
        cw4.p0 p0Var;
        this.f305780p.g(p012xc85e97e9.p093xedfae76a.n.STARTED);
        cw4.o oVar = this.f305778n;
        if (oVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.C19231x33dc2abd c19231x33dc2abd = ((cw4.f1) oVar).f305751a;
            if (c19231x33dc2abd.f263278h.mo3195x754a37bb() == null) {
                p0Var = cw4.p0.f305797e;
            } else {
                java.lang.Object mo3195x754a37bb = c19231x33dc2abd.f263278h.mo3195x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo3195x754a37bb);
                p0Var = (cw4.p0) mo3195x754a37bb;
            }
        } else {
            p0Var = null;
        }
        if (p0Var == cw4.p0.f305798f) {
            c(null);
        }
    }

    public final void e(java.lang.String str) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f305781q;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f305781q = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new cw4.f0(2000L, this, null), 3, null);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.lang.String str2 = this.f305772e;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "json.length == 0");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "replaceHTML: " + str);
        a(this.f305771d, "window.WeixinTranslate.replaceText(" + str + ')', null);
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f305780p;
    }
}
