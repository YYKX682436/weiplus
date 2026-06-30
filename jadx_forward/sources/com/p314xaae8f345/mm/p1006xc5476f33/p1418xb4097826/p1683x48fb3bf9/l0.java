package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class l0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n0 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f218413n;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f218414a;

    /* renamed from: b, reason: collision with root package name */
    public final oy2.l f218415b;

    /* renamed from: c, reason: collision with root package name */
    public final oy2.p f218416c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f218417d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f218418e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f218419f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f218420g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f218421h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f218422i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f218423j;

    /* renamed from: k, reason: collision with root package name */
    public final oy2.a0 f218424k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.p0 f218425l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15493x798adbb7 f218426m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.lifecycle.x, com.tencent.mm.plugin.finder.webview.FinderWebViewScrollViewWrapper$lifecycleObserver$1] */
    public l0(android.content.Context context, java.lang.String url, oy2.l dialog, int i17, java.lang.String str, oy2.p scConfig, java.util.Map map) {
        zg0.q2 webViewController;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scConfig, "scConfig");
        this.f218414a = context;
        this.f218415b = dialog;
        this.f218416c = scConfig;
        oy2.a0 a0Var = new oy2.a0(this);
        this.f218424k = a0Var;
        r45.sn snVar = new r45.sn();
        snVar.f467384e = java.util.UUID.randomUUID().toString();
        snVar.f467385f = url;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 c15492xb61be281 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281(context, snVar, null, i17, scConfig.f431530f, 4, null);
        c15492xb61be281.m63384xb4d53cda(dialog.m157401x3622fee6());
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 c17262x2289077 = a0Var.f431477i;
        if (c17262x2289077 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("codeMaskView");
            throw null;
        }
        c15492xb61be281.m63383x2008c240(c17262x2289077);
        c15492xb61be281.getWebViewEnv().f218465d = str;
        c15492xb61be281.m63387xc6f44885(map);
        this.f218425l = c15492xb61be281;
        ?? r17 = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.webview.FinderWebViewScrollViewWrapper$lifecycleObserver$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m63389xac79a11b() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onDestroy");
                oy2.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l0.this.f218415b;
                if (lVar.isAttachedToWindow()) {
                    lVar.b();
                }
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
            /* renamed from: onPause */
            public final void m63390xb01dfb57() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.l0.f218413n = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onPause");
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onResume */
            public final void m63391x57429eec() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onResume");
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
            /* renamed from: onStop */
            public final void m63392xc39f8281() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onStop");
            }
        };
        this.f218426m = r17;
        c15492xb61be281.mo63358x80670f0d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.i0(this));
        this.f218417d = c15492xb61be281.mo63376x7be6c20d();
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qa0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qa0.class)) != null && (context instanceof android.app.Activity) && (webViewController = c15492xb61be281.getWebViewController()) != null && (c22633x83752a59 = this.f218417d) != null) {
            c22633x83752a59.mo81410x6fd49b97(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.r(new java.lang.ref.WeakReference(context), new java.lang.ref.WeakReference(webViewController)));
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.j0(this));
        dialog.m157411xc07e953d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.f0(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = this.f218417d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22633x83752a592);
        a0Var.f431472d = c22633x83752a592;
        c22633x83752a592.D0(new oy2.t(a0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead c15494xd57adead = a0Var.f431471c;
        if (c15494xd57adead == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWebViewContainer");
            throw null;
        }
        c15494xd57adead.addView(a0Var.f431472d, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a593 = a0Var.f431472d;
        if (c22633x83752a593 != null) {
            c22633x83752a593.mo120189xb61559a7(a0Var.f431482n);
        }
        a0Var.f431479k = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.g0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.k0(this);
        if (z65.c.a()) {
            a0Var.f431481m = k0Var;
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            this.f218421h = abstractActivityC21394xb3d2c0cf;
            abstractActivityC21394xb3d2c0cf.mo273xed6858b4().a(r17);
        } else if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656 abstractC15133xf6dcb656 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656) context;
            if (abstractC15133xf6dcb656.mo7430x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = abstractC15133xf6dcb656.mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                this.f218421h = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x19263085;
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = abstractC15133xf6dcb656.mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7430x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7430x192630852).mo273xed6858b4().a(r17);
            }
        }
        dialog.m157403x56914ec6(c15492xb61be281.getScrollHeightListener());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n0
    public oy2.m a() {
        return this.f218415b;
    }

    public final void b() {
        android.view.Window window;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "realShow");
        oy2.l lVar = this.f218415b;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderScrollDialog", "show");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        android.content.Context context = lVar.getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        android.view.KeyEvent.Callback decorView = (abstractActivityC21394xb3d2c0cf == null || (window = abstractActivityC21394xb3d2c0cf.getWindow()) == null) ? null : window.getDecorView();
        android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
        if (frameLayout != null) {
            frameLayout.addView(lVar, layoutParams);
        }
        f218413n = true;
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdCenterDialog", "showDialog showAfterWebViewReady: %b, webViewReady: %b", java.lang.Boolean.valueOf(this.f218420g), java.lang.Boolean.valueOf(this.f218418e));
        if (!this.f218420g) {
            b();
        } else if (this.f218418e) {
            b();
        } else {
            this.f218419f = true;
        }
    }
}
