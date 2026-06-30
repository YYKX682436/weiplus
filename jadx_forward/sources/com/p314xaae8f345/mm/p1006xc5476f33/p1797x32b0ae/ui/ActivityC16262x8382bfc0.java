package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppSheetUI;", "Landroidx/appcompat/app/AppCompatActivity;", "Lq80/z;", "Lcom/tencent/mm/plugin/lite/LiteAppCenter$IFragmentCallback;", "Lcom/tencent/mm/sdk/platformtools/f7;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI */
/* loaded from: classes14.dex */
public final class ActivityC16262x8382bfc0 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 implements q80.z, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f225885x = 0;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONObject f225887e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f225889g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f225890h;

    /* renamed from: i, reason: collision with root package name */
    public double f225891i;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View.OnLayoutChangeListener f225900u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f225901v;

    /* renamed from: w, reason: collision with root package name */
    public q80.x f225902w;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f225886d = "MicroMsg.WxaLiteAppSheetUI";

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 f225888f = (com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063) new com.p314xaae8f345.p362xadfe2b3.ui.j(com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063.class).a();

    /* renamed from: m, reason: collision with root package name */
    public long f225892m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f225893n = -1;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 f225894o = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34();

    /* renamed from: p, reason: collision with root package name */
    public final int f225895p = 1;

    /* renamed from: q, reason: collision with root package name */
    public final int f225896q = 2;

    /* renamed from: r, reason: collision with root package name */
    public final int f225897r = 3;

    /* renamed from: s, reason: collision with root package name */
    public int f225898s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.l2 f225899t = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.l2(this, new android.os.Handler(android.os.Looper.getMainLooper()));

    public final void P6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) findViewById(com.p314xaae8f345.mm.R.id.gd9);
        if (c16237x250976b0 == null) {
            kd.c.e(this.f225886d, "applyHalfScreenLayout: contentView is null, skip layout update", new java.lang.Object[0]);
            return;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        android.view.View rootView = findViewById(android.R.id.content).getRootView();
        int width = rootView != null ? rootView.getWidth() : 0;
        int height = rootView != null ? rootView.getHeight() : 0;
        if (width > 0) {
            i17 = width;
        }
        if (height <= 0) {
            height = i18;
        }
        boolean z18 = height >= i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f34 = this.f225894o;
        double d17 = c16190x27388f34 == null ? 1.0d : z18 ? c16190x27388f34.f224943d : c16190x27388f34.f224945f;
        if (d17 <= 0.0d || d17 > 1.0d) {
            d17 = 1.0d;
        }
        double d18 = z18 ? c16190x27388f34.f224944e : c16190x27388f34.f224946g;
        if (d18 <= 0.0d || d18 > 1.0d) {
            d18 = 0.75d;
        }
        double d19 = i18;
        double d27 = d18 * d19;
        this.f225891i = d27;
        double d28 = (c16190x27388f34.f224948i || z17) ? d19 : d27;
        double d29 = d19 - d27;
        int i19 = (int) (i17 * d17);
        if (i19 < 1) {
            i19 = 1;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i19, (int) d28);
        layoutParams.gravity = 49;
        layoutParams.topMargin = (int) d29;
        c16237x250976b0.setLayoutParams(layoutParams);
        c16237x250976b0.m65877x5755d9d7((float) d29);
        c16237x250976b0.setTranslationY((float) (z17 ? -d29 : 0.0d));
        R6(c16237x250976b0, ((int) (((double) (-c16237x250976b0.getTranslationY())) + d27)) == i18);
    }

    public final void Q6() {
        mo65528x3f895349();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.gd9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) findViewById).h();
    }

    @Override // q80.z
    public void R1(q80.x onActResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onActResult, "onActResult");
        this.f225902w = onActResult;
    }

    public final void R6(android.view.View view, boolean z17) {
        if (z17) {
            getWindow().addFlags(1024);
        } else {
            getWindow().clearFlags(1024);
        }
        view.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.n2(z17));
        view.setClipToOutline(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback
    /* renamed from: closeWindow */
    public void mo65524x10864c08(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (intent.hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            try {
                this.f225887e = new org.json.JSONObject(intent.getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099));
            } catch (java.lang.Exception unused) {
            }
        }
        runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.c2(this));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        if (this.f225889g) {
            return;
        }
        this.f225889g = true;
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = this.f225888f;
        if (c3719xb0aa2063 != null && c3719xb0aa2063.f127596p == 0) {
            kd.c.b(this.f225886d, "finish appUuid=0", new java.lang.Object[0]);
            super.finish();
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
        if (this.f225890h) {
            super.finish();
            return;
        }
        Q6();
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.d2(new java.lang.ref.WeakReference(this), this), 330L);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.lang.Object systemService = super.getSystemService(name);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("layout_inflater", name)) {
            return systemService;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        return com.p314xaae8f345.mm.ui.id.c((android.view.LayoutInflater) systemService);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback
    /* renamed from: halfScreenScrollToBottom */
    public void mo65525x6851f6d2() {
        super.mo65525x6851f6d2();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.gd9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) findViewById).h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback
    /* renamed from: halfScreenScrollToResume */
    public void mo65526x831224d4() {
        super.mo65526x831224d4();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.gd9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) findViewById).g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback
    /* renamed from: halfScreenScrollToTop */
    public void mo65527xc117fe0e() {
        super.mo65527xc117fe0e();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.gd9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) findViewById).i();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback
    /* renamed from: hideKeyboard */
    public void mo65528x3f895349() {
        java.lang.Object systemService = getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.gd9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(((android.widget.FrameLayout) findViewById).getWindowToken(), 0);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        q80.x xVar = this.f225902w;
        if (xVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xVar);
            xVar.mo55562x9d4787cb(i17, i18, intent);
            this.f225902w = null;
        }
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        this.f225888f.f127556e.d(true, false);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) findViewById(com.p314xaae8f345.mm.R.id.gd9);
        if (c16237x250976b0 != null) {
            P6(c16237x250976b0.getHasArrivedTop());
        } else {
            kd.c.e(this.f225886d, "onConfigurationChanged: contentView is null, skip layout update", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        final q80.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225683b.get()) {
            kd.c.b(this.f225886d, "LiteAppProcessProfileInit has no init.", new java.lang.Object[0]);
            super.onCreate(bundle);
            finish();
            return;
        }
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = this.f225888f;
        c3719xb0aa2063.f127604x = true;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.TRUE);
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570750bq1);
        overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = mo7595x9cdc264();
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264 != null ? mo7595x9cdc264.m7630xb2c12e75() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.gd9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        h0Var.f391656d = findViewById;
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        if (bundleExtra != null) {
            getWindowManager().getDefaultDisplay().getRealMetrics(new android.util.DisplayMetrics());
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f34 = bundleExtra.containsKey("halfScreenConfig") ? (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34) bundleExtra.getParcelable("halfScreenConfig") : null;
            if (c16190x27388f34 != null) {
                this.f225894o = c16190x27388f34;
            } else {
                double d17 = 0.75d;
                double d18 = bundleExtra.containsKey("heightPercent") ? bundleExtra.getDouble("heightPercent") : 0.75d;
                if (d18 > 0.0d && d18 < 1.0d) {
                    d17 = d18;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f342 = this.f225894o;
                c16190x27388f342.f224944e = d17;
                c16190x27388f342.f224947h = bundleExtra.containsKey("enableDragToCloseInHalfScreen") && bundleExtra.getBoolean("enableDragToCloseInHalfScreen");
                this.f225894o.f224948i = bundleExtra.containsKey("enableDragToFullScreenInHalfScreen") && bundleExtra.getBoolean("enableDragToFullScreenInHalfScreen");
                this.f225894o.f224949m = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588) bundleExtra.getParcelable("halfScreenStatusChangeListener");
            }
            c3719xb0aa2063.A = this.f225894o.f224947h;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) h0Var.f391656d).m65869x164ae21(true);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) h0Var.f391656d).m65870x9b36211f(this.f225894o.f224948i);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) h0Var.f391656d).m65871x2293f010(this.f225894o.f224948i);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) h0Var.f391656d).m65872xab00861a(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.e2(this));
            if (bundleExtra.containsKey("liteappReferrerInfo")) {
                com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80) bundleExtra.getParcelable("liteappReferrerInfo");
                if (c3708xc1f46f80 != null && c3708xc1f46f80.f14310xe0809720.has("appUuid")) {
                    this.f225892m = c3708xc1f46f80.f14310xe0809720.getLong("appUuid");
                }
                if (c3708xc1f46f80 != null && c3708xc1f46f80.f14310xe0809720.has("pageId")) {
                    this.f225893n = c3708xc1f46f80.f14310xe0809720.getLong("pageId");
                }
            } else if (bundleExtra.containsKey("referrerFromUuid") && bundleExtra.containsKey("referrerFromPageId")) {
                this.f225892m = bundleExtra.getLong("referrerFromUuid");
                this.f225893n = bundleExtra.getLong("referrerFromPageId");
            }
        }
        R6((android.view.View) h0Var.f391656d, false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) h0Var.f391656d).m65873xc1df46a9(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.f2(this));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) h0Var.f391656d).m65878xde8d3e78(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.g2(this, h0Var));
        final long longExtra = getIntent().getLongExtra("callbackUuid", -1L);
        if (longExtra > 0 && (f0Var = (q80.f0) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226051u.get(java.lang.Long.valueOf(longExtra))) != null) {
            c3719xb0aa2063.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI$onCreate$4
                @Override // p012xc85e97e9.p093xedfae76a.v
                /* renamed from: onStateChanged */
                public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    if (event == p012xc85e97e9.p093xedfae76a.m.ON_CREATE) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0 activityC16262x8382bfc0 = this;
                        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa20632 = activityC16262x8382bfc0.f225888f;
                        q80.f0.this.mo25804x3e5a77bb(c3719xb0aa20632.f127596p, c3719xb0aa20632.f127562n);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226051u.remove(java.lang.Long.valueOf(longExtra));
                        activityC16262x8382bfc0.f225888f.mo273xed6858b4().c(this);
                    }
                }
            });
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf149588 = this.f225894o.f224949m;
        if (c16191xaf149588 != null) {
            c16191xaf149588.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.ON_CREATE);
        }
        if (m7630xb2c12e75 != null) {
            m7630xb2c12e75.h(com.p314xaae8f345.mm.R.id.gd9, c3719xb0aa2063, null, 1);
        }
        if (m7630xb2c12e75 != null) {
            m7630xb2c12e75.d();
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f567091i41);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById2;
        if (bundleExtra == null) {
            frameLayout.setBackgroundColor(2130706432);
        } else {
            frameLayout.setBackgroundColor(bundleExtra.getInt("KHalfScreenBackGroundColor", this.f225894o.f224950n ? 0 : 2130706432));
        }
        frameLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.h2(this));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) h0Var.f391656d).post(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.i2(this));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 0;
        riVar.f89352c = c3719xb0aa2063.f127559h;
        riVar.f89353d = java.lang.Long.valueOf(c3719xb0aa2063.f127596p);
        riVar.f89351b = this.f225887e;
        c5675xda3892c3.e();
        android.view.View rootView = findViewById(android.R.id.content).getRootView();
        this.f225901v = rootView;
        if (rootView != null) {
            rootView.setBackgroundColor(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.k2(this);
        this.f225900u = k2Var;
        android.view.View view = this.f225901v;
        if (view != null) {
            view.addOnLayoutChangeListener(k2Var);
        }
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        n3.h2.a(getWindow(), true);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.view.View view;
        super.onDestroy();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 3;
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = this.f225888f;
        riVar.f89352c = c3719xb0aa2063.f127559h;
        riVar.f89353d = java.lang.Long.valueOf(c3719xb0aa2063.f127596p);
        riVar.f89351b = this.f225887e;
        c5675xda3892c3.e();
        android.view.View.OnLayoutChangeListener onLayoutChangeListener = this.f225900u;
        if (onLayoutChangeListener != null && (view = this.f225901v) != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        this.f225900u = null;
        this.f225901v = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf149588 = this.f225894o.f224949m;
        if (c16191xaf149588 != null) {
            c16191xaf149588.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.ON_STOP);
        }
        if (this.f225892m <= 0 || this.f225893n <= 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", "hide");
        jSONObject.put(ya.b.f77502x92235c1b, "halfPage");
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(this.f225892m, this.f225893n, "overlayStateChange", jSONObject);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 2;
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = this.f225888f;
        riVar.f89352c = c3719xb0aa2063.f127559h;
        riVar.f89353d = java.lang.Long.valueOf(c3719xb0aa2063.f127596p);
        riVar.f89351b = this.f225887e;
        c5675xda3892c3.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf149588 = this.f225894o.f224949m;
        if (c16191xaf149588 != null) {
            c16191xaf149588.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.ON_PAUSE);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf149588 = this.f225894o.f224949m;
        if (c16191xaf149588 != null) {
            c16191xaf149588.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.ON_RESUME);
        }
        if (this.f225892m > 0 && this.f225893n > 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", "show");
            jSONObject.put(ya.b.f77502x92235c1b, "halfPage");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(this.f225892m, this.f225893n, "overlayStateChange", jSONObject);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 1;
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = this.f225888f;
        riVar.f89352c = c3719xb0aa2063.f127559h;
        riVar.f89353d = java.lang.Long.valueOf(c3719xb0aa2063.f127596p);
        riVar.f89351b = this.f225887e;
        c5675xda3892c3.e();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        getContentResolver().registerContentObserver(android.provider.Settings.System.getUriFor("accelerometer_rotation"), false, this.f225899t);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf149588 = this.f225894o.f224949m;
        if (c16191xaf149588 != null) {
            c16191xaf149588.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.ON_START);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        getContentResolver().unregisterContentObserver(this.f225899t);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16191xaf149588 c16191xaf149588 = this.f225894o.f224949m;
        if (c16191xaf149588 != null) {
            c16191xaf149588.a(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.m.ON_STOP);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) d3Var).wi(context, this);
            return;
        }
        ct.d3 d3Var2 = (ct.d3) i95.n0.c(ct.d3.class);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) d3Var2).Bi(context2, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IFragmentCallback
    /* renamed from: setPageOrientation */
    public void mo65529xdaac6ff(int i17) {
        runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.m2(this, i17));
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(this.f225888f.f127596p, "app.screenshot", (org.json.JSONObject) null);
    }
}
