package y31;

/* loaded from: classes7.dex */
public final class f extends z31.a implements jc3.g0, jc3.u {

    /* renamed from: d, reason: collision with root package name */
    public jc3.j0 f540696d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f540697e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f540698f;

    /* renamed from: g, reason: collision with root package name */
    public x31.a f540699g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f540700h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f540701i;

    /* renamed from: n, reason: collision with root package name */
    public bf3.p f540703n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f540704o;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f540702m = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f540705p = kz5.c0.i(new z31.b(), new vj.b(), new ce3.d("MagicNewAdPlayable"), new ce3.a("MagicNewAdPlayable"), new z31.c());

    @Override // z31.a
    public android.widget.FrameLayout C0() {
        return this.f540697e;
    }

    @Override // z31.a
    public x31.a E0() {
        return this.f540699g;
    }

    public final void F0(java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        pm0.v.X(new y31.d(this, key, value));
    }

    public final void G0(android.widget.FrameLayout containerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setContainerView playableContainerView null:");
        sb6.append(this.f540697e == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", sb6.toString());
        this.f540697e = containerView;
        bf3.p pVar = this.f540703n;
        if (pVar != null) {
            pVar.a(containerView);
        }
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786 c4973xdc3db786 = new com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31.C4973xdc3db786(context, null, 0, 6, null);
        this.f540698f = c4973xdc3db786;
        android.widget.FrameLayout frameLayout = this.f540697e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
        c4973xdc3db786.setLayoutParams(frameLayout.getLayoutParams());
        android.widget.FrameLayout frameLayout2 = this.f540697e;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.f540698f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "add playableCanvasView");
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onCanvasViewCreated canvasId:" + i17);
        android.widget.FrameLayout frameLayout = this.f540698f;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onCanvasViewLayout canvasId:" + i17 + " left:" + i18 + " top:" + i19 + " width:" + i27 + " height:" + i28);
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envId, "envId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onJSException msg:".concat(msg));
        com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11190x9d4f7c6d c11190x9d4f7c6d = new com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11190x9d4f7c6d();
        cl0.g gVar = new cl0.g();
        gVar.h(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, msg);
        gVar.h("stack", msg);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        F0(c11190x9d4f7c6d.f229414d, gVar2);
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onCanvasViewDestroy canvasId:" + i17);
        android.widget.FrameLayout frameLayout = this.f540697e;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        }
    }

    @Override // jc3.u
    public void b1() {
        android.widget.FrameLayout frameLayout;
        android.content.Context context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onConnException");
        x31.a aVar = this.f540699g;
        if (aVar != null) {
            x31.b[] bVarArr = x31.b.f533132d;
            x31.a.a(aVar, 2, "android connException", null, 4, null);
        }
        com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11190x9d4f7c6d c11190x9d4f7c6d = new com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11190x9d4f7c6d();
        cl0.g gVar = new cl0.g();
        gVar.h(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "onConnException");
        gVar.h("stack", "");
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        F0(c11190x9d4f7c6d.f229414d, gVar2);
        yz5.a aVar2 = this.f540704o;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
        if (!z65.c.a() || (frameLayout = this.f540697e) == null || (context = frameLayout.getContext()) == null) {
            return;
        }
        pm0.v.X(new y31.b(context));
    }

    @Override // jc3.g0
    public void c(int i17, boolean z17) {
        jc3.j0 j0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onCanvasViewFirstFrameRendered canvasId:" + i17);
        x31.a aVar = this.f540699g;
        if (aVar != null) {
            x31.b[] bVarArr = x31.b.f533132d;
            x31.a.a(aVar, 1, "", null, 4, null);
        }
        com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0 c11191xe67ddda0 = new com.p314xaae8f345.mm.p972xa642c151.mb.p973x60b7c31.p974xb1584af1.C11191xe67ddda0();
        cl0.g gVar = new cl0.g();
        gVar.h("eventName", "playableFirstFrame");
        gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "");
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        F0(c11191xe67ddda0.f229414d, gVar2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "pauseJsThread manualPause:" + this.f540700h);
        if (!this.f540700h || (j0Var = this.f540696d) == null) {
            return;
        }
        ((rc3.w0) j0Var).m162152x65825f6();
    }

    @Override // jc3.u
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onMainScriptInjected");
        jc3.j0 j0Var = this.f540696d;
        if (j0Var != null) {
            synchronized (j0Var) {
                for (y31.a aVar : this.f540702m) {
                    ((rc3.w0) j0Var).k(aVar.f540688a, aVar.f540689b);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("sendEvent pending:");
                    sb6.append(aVar.f540688a);
                    sb6.append(" value:");
                    java.lang.String str = aVar.f540689b;
                    int length = str.length();
                    if (length > 200) {
                        length = 200;
                    }
                    java.lang.String substring = str.substring(0, length);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    sb6.append(substring);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", sb6.toString());
                }
                this.f540702m.clear();
                this.f540701i = true;
            }
        }
    }

    @Override // jc3.u
    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onCreated");
    }

    @Override // jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onDestroy reason:" + i17);
    }

    @Override // jc3.u
    /* renamed from: onPause */
    public void mo127084xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onPause");
    }

    @Override // jc3.u
    /* renamed from: onResume */
    public void mo127085x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "onResume");
    }

    /* renamed from: release */
    public final void m176445x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "release");
        this.f540699g = null;
        pm0.v.X(new y31.c(this));
        this.f540698f = null;
        this.f540697e = null;
        this.f540700h = false;
        this.f540701i = false;
        this.f540702m.clear();
        bf3.p pVar = this.f540703n;
        if (pVar != null) {
            pVar.b();
        }
        jc3.j0 j0Var = this.f540696d;
        if (j0Var != null) {
            ((rc3.w0) j0Var).m162151x5cd39ffa();
        }
        this.f540696d = null;
    }
}
