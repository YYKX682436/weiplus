package uj;

/* loaded from: classes7.dex */
public final class p extends z31.a implements jc3.g0, jc3.u {

    /* renamed from: d, reason: collision with root package name */
    public jc3.j0 f509702d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f509703e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f509704f;

    /* renamed from: g, reason: collision with root package name */
    public x31.a f509705g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f509706h;

    /* renamed from: i, reason: collision with root package name */
    public bf3.p f509707i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f509708m = kz5.c0.i(new vj.c(), new vj.b());

    @Override // z31.a
    public android.widget.FrameLayout C0() {
        return this.f509703e;
    }

    @Override // z31.a
    public x31.a E0() {
        return this.f509705g;
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewCreated canvasId:" + i17);
        android.widget.FrameLayout frameLayout = this.f509704f;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewLayout canvasId:" + i17 + " left:" + i18 + " top:" + i19 + " width:" + i27 + " height:" + i28);
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onJSException msg:".concat(msg));
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewDestroy canvasId:" + i17);
        android.widget.FrameLayout frameLayout = this.f509703e;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        }
    }

    @Override // jc3.u
    public void b1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onConnException");
        x31.a aVar = this.f509705g;
        if (aVar != null) {
            x31.b[] bVarArr = x31.b.f533132d;
            x31.a.a(aVar, 2, "android connException", null, 4, null);
        }
    }

    @Override // jc3.g0
    public void c(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewFirstFrameRendered canvasId:" + i17);
        x31.a aVar = this.f509705g;
        if (aVar != null) {
            x31.b[] bVarArr = x31.b.f533132d;
            x31.a.a(aVar, 1, "", null, 4, null);
        }
        if (this.f509706h) {
            jc3.j0 j0Var = this.f509702d;
            if (j0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
                throw null;
            }
            ((rc3.w0) j0Var).m162152x65825f6();
        }
        uj.m mVar = uj.m.f509698a;
        java.lang.String sessionId = java.lang.String.valueOf(hashCode());
        synchronized (mVar) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = uj.m.f509699b;
            uj.l lVar = (uj.l) concurrentHashMap.get(sessionId);
            if (lVar != null && lVar.f509696a > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayableReporter", "reportRenderFinish sessionId:" + sessionId + " time:" + currentTimeMillis + " currentTime:" + (currentTimeMillis - lVar.f509696a));
                i95.m c17 = i95.n0.c(je3.i.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                je3.i.La((je3.i) c17, sessionId, "MagicPlayable", "", com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37598xf943aa9b, currentTimeMillis - lVar.f509696a, null, null, 96, null);
            }
            concurrentHashMap.remove(sessionId);
        }
    }

    @Override // jc3.u
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onMainScriptInjected");
        this.f509706h = true;
    }

    @Override // jc3.u
    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        java.lang.String e17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onCreated");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "injectPlayableLibrary");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_magic_playable_lib_use_native_js, 0) == 1;
        if (z17) {
            e17 = ik1.f.e("playable/wxgame-playable-lib.js");
        } else {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.T9((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) c17, "MagicAdPlayableBasic", null, 2, null).b();
            e17 = b17 != null ? bf3.r0.e(b17, "/wxgame-playable-lib.js") : null;
        }
        if (e17 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17.substring(0, 200), "substring(...)");
        }
        jc3.j0 j0Var = this.f509702d;
        if (j0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
            throw null;
        }
        if (e17 == null) {
            e17 = "";
        }
        ((rc3.w0) j0Var).l(e17, new uj.n(z17));
        jc3.j0 j0Var2 = this.f509702d;
        if (j0Var2 != null) {
            ((rc3.w0) j0Var2).m162153x68ac462();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
            throw null;
        }
    }

    @Override // jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onDestroy");
    }

    @Override // jc3.u
    /* renamed from: onPause */
    public void mo127084xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onPause");
    }

    @Override // jc3.u
    /* renamed from: onResume */
    public void mo127085x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "onResume");
    }
}
