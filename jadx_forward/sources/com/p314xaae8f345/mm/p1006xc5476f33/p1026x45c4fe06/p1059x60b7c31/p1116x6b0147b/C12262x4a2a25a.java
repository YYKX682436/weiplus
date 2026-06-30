package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView */
/* loaded from: classes15.dex */
public class C12262x4a2a25a extends android.widget.RelativeLayout {
    public static final /* synthetic */ int E1 = 0;
    public boolean A;
    public final int A1;
    public boolean B;
    public oe1.h1 B1;
    public xe1.p C;
    public oe1.s1 C1;
    public boolean D;
    public int D1;
    public boolean E;
    public ef1.e F;
    public oe1.y G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public double f165059J;
    public int K;
    public java.lang.String L;
    public boolean M;
    public boolean N;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public java.lang.String T;
    public boolean U;
    public boolean V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public int f165060d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f165061e;

    /* renamed from: f, reason: collision with root package name */
    public final oe1.o1 f165062f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f165063g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e f165064h;

    /* renamed from: i, reason: collision with root package name */
    public oe1.f1 f165065i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f165066l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f165067m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f165068n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f165069o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f165070p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f165071p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f165072p1;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.ui.C12276x3f9aaacd f165073q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f165074r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f165075s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f165076t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f165077u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f165078v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f165079w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f165080x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f165081x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f165082x1;

    /* renamed from: y, reason: collision with root package name */
    public int f165083y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f165084y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f165085y1;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f165086z;

    /* renamed from: z1, reason: collision with root package name */
    public int f165087z1;

    /* JADX WARN: Multi-variable type inference failed */
    public C12262x4a2a25a(android.content.Context context, android.view.View view) {
        super(context);
        this.f165060d = -1;
        this.f165084y0 = false;
        this.f165066l1 = true;
        this.f165072p1 = false;
        this.f165082x1 = false;
        this.f165087z1 = 0;
        this.A1 = -16777216;
        this.C1 = null;
        this.f165062f = (oe1.o1) view;
        j(context);
        this.f165061e.addView(view);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a) {
        boolean e17 = c12262x4a2a25a.f165065i.e();
        if (c12262x4a2a25a.B && c12262x4a2a25a.P && c12262x4a2a25a.f165066l1 && !e17 && !c12262x4a2a25a.n()) {
            if (!(c12262x4a2a25a.f165067m.getVisibility() == 0)) {
                c12262x4a2a25a.f165079w.setVisibility(0);
                return;
            }
        }
        c12262x4a2a25a.f165079w.setVisibility(8);
    }

    /* renamed from: setCover */
    private void m51329x52d31475(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L)) {
            ik1.h0.a().m77784x795fa299(new oe1.q(this, str));
        } else {
            o("setCover mCoverUrl not null", new java.lang.Object[0]);
        }
    }

    public boolean b(java.lang.String str, java.lang.String str2) {
        if (this.f165064h == null) {
            p(" addDanmaku mDanmakuView null", new java.lang.Object[0]);
            l();
        }
        int a17 = ik1.w.a(str2);
        if (a17 == 0) {
            a17 = -1;
        }
        we1.a aVar = new we1.a(getContext(), new android.text.SpannableString(str), a17, 0, 3.0f, this.f165062f.mo51377x898ffe25());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e = this.f165064h;
        synchronized (c12264x3a069b1e.f165118q) {
            ((java.util.LinkedList) c12264x3a069b1e.f165118q).offerFirst(aVar);
            ((ku5.t0) ku5.t0.f394148d).h(new we1.d(c12264x3a069b1e, aVar), "DanmuView-addItemToWaitingHead");
        }
        return true;
    }

    public final void c(boolean z17) {
        xe1.p pVar = this.C;
        if (pVar == null) {
            return;
        }
        int i17 = this.f165083y;
        int i18 = this.D1;
        pVar.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%d", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
            org.json.JSONObject b17 = pVar.b();
            b17.put("fullScreen", z17);
            b17.put("videoPlayerId", i17);
            b17.put(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, i18);
            pVar.a(new xe1.f(null), b17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoFullScreenChange e=%s", e17);
        }
    }

    public final boolean d() {
        if (!(this.f165067m.getVisibility() == 0)) {
            if (!m() && this.D) {
                return true;
            }
            if (m() && this.E) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        if (!this.N || this.f165062f.j()) {
            return false;
        }
        return !(this.f165067m.getVisibility() == 0);
    }

    public void f() {
        o("clean", new java.lang.Object[0]);
        y();
        this.f165062f.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e = this.f165064h;
        if (c12264x3a069b1e != null) {
            c12264x3a069b1e.f165121t = 3;
            c12264x3a069b1e.b();
            ((java.util.LinkedList) c12264x3a069b1e.f165119r).clear();
            c12264x3a069b1e.invalidate();
        }
        this.f165065i.mo51422xac79a11b();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f165085y1;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    public void g(boolean z17) {
        o("enableProgressGesture %b", java.lang.Boolean.valueOf(z17));
        this.N = z17;
    }

    /* renamed from: getCacheTimeSec */
    public int m51330x8a3f46d8() {
        oe1.o1 o1Var = this.f165062f;
        if (o1Var != null) {
            return o1Var.mo51375x8a3f46d8();
        }
        return 0;
    }

    /* renamed from: getCallback */
    public xe1.p m51331x71965dbb() {
        return this.C;
    }

    /* renamed from: getCookieData */
    public java.lang.String m51332x900d5424() {
        return this.f165080x;
    }

    /* renamed from: getCurrPosMs */
    public int m51333x25784152() {
        return this.f165062f.mo51376x25784152();
    }

    /* renamed from: getCurrPosSec */
    public int m51334x898ffe25() {
        return this.f165062f.mo51377x898ffe25();
    }

    /* renamed from: getDuration */
    public int m51335x51e8b0a() {
        int i17 = this.K;
        return i17 > 0 ? i17 : this.f165062f.mo51380x6d590e18();
    }

    public final java.lang.String h(int i17) {
        return q(i17 / 60) + ":" + q(i17 % 60);
    }

    public final void i() {
        this.f165065i.d();
    }

    public final void j(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569644hg, this);
        setBackgroundColor(this.A1);
        this.f165061e = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.p0x);
        this.f165063g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lbi);
        this.f165067m = findViewById(com.p314xaae8f345.mm.R.id.ckn);
        this.f165068n = findViewById(com.p314xaae8f345.mm.R.id.clb);
        this.f165069o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.clh);
        this.f165070p = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f564295nc);
        this.f165073q = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.ui.C12276x3f9aaacd) findViewById(com.p314xaae8f345.mm.R.id.f564296nd);
        this.f165074r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.n_);
        this.f165075s = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564294nb);
        this.f165076t = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cki);
        this.f165077u = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.kxe);
        this.f165078v = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.kxd);
        this.f165079w = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.kxf);
        this.f165073q.m51445x1f2fbc1a(8);
        ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cla)).setOnClickListener(new oe1.o(this));
        this.F = new ef1.e(getContext(), this, new oe1.s(this));
        this.f165062f.mo51389x526554de(new oe1.t(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(oe1.f1 f1Var) {
        this.f165065i = f1Var;
        if ((f1Var instanceof android.view.View) && f1Var != 0) {
            android.view.View view = (android.view.View) f1Var;
            if (view.getId() != -1) {
                view.setId(com.p314xaae8f345.mm.R.id.a0w);
            }
        }
        this.f165065i.mo51420x30dd42();
        this.f165065i.mo51427x71354d7e(new oe1.v(this));
        this.f165065i.m151118xbdcdae58(new oe1.w(this));
        this.f165065i.mo51417xb892d55(new oe1.x(this));
        this.f165065i.mo51438xb1e0831d(new oe1.i(this));
        this.f165065i.mo51428x2fdf2dbc(new oe1.j(this));
        this.f165065i.mo51426xe81cd0bc(new oe1.k(this));
        this.f165065i.k(new oe1.l(this));
        this.f165065i.mo51430x46e95712(new oe1.m(this));
    }

    public final void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e) findViewById(com.p314xaae8f345.mm.R.id.cqa);
        this.f165064h = c12264x3a069b1e;
        c12264x3a069b1e.m51402xe0cee981(new oe1.u(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e2 = this.f165064h;
        c12264x3a069b1e2.f165112h = 0.0f;
        c12264x3a069b1e2.f165113i = 0.8f;
        c12264x3a069b1e2.m51404x68c2ff9a(5);
        this.f165064h.m51405x316da83b(200);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e3 = this.f165064h;
        c12264x3a069b1e3.f165121t = 4;
        c12264x3a069b1e3.invalidate();
        java.lang.Object obj = this.f165062f;
        if (obj != null) {
            if (((android.view.View) obj).getHeight() > 0) {
                this.f165064h.m51403x17db48d8((int) (((int) (this.f165064h.m51401xcb3b8e36() * r0.getHeight())) / (i65.a.b(getContext(), 18) * 2.0f)));
            }
        }
    }

    public boolean m() {
        oe1.y yVar = this.G;
        if (yVar == null) {
            p("isInFullScreen mFullScreenDelegate null", new java.lang.Object[0]);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.d) yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) dVar.f165143a.M(dVar.f165144b);
        int i17 = iaVar.f168298i;
        int i18 = dVar.f165145c;
        return i17 == i18 || iaVar.f168293d == i18;
    }

    public final boolean n() {
        return this.H || this.f165062f.j();
    }

    public final void o(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.AppBrandVideoView", this.C1 + " " + str, objArr);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean e17;
        if (this.W) {
            e17 = true;
        } else {
            e17 = e();
            if (!d()) {
                e17 = false;
            }
        }
        if (!e17) {
            if (motionEvent.getAction() == 0 && this.B && this.f165067m.getVisibility() != 0) {
                this.f165065i.j();
                if (this.V) {
                    i();
                }
            }
            if (this.M) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        ef1.e eVar = this.F;
        if (eVar != null) {
            ef1.d dVar = eVar.f333926e;
            dVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            android.content.Context context = eVar.f333922a;
            if (actionMasked == 0) {
                eVar.f333929h = motionEvent.getRawX();
                eVar.f333928g = ((android.media.AudioManager) context.getSystemService("audio")).getStreamVolume(3);
                eVar.f333927f = oe1.x1.b(context);
            }
            android.view.GestureDetector gestureDetector = eVar.f333925d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            if (actionMasked == 1 || actionMasked == 3) {
                ef1.c cVar = eVar.f333924c;
                if (cVar == ef1.c.FastBackwardOrForward) {
                    int i17 = eVar.f333931j;
                    float rawX = motionEvent.getRawX() - eVar.f333929h;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a = ((oe1.s) dVar).f426270a;
                    if (c12262x4a2a25a.e()) {
                        c12262x4a2a25a.f165063g.setVisibility(8);
                        c12262x4a2a25a.f165065i.f();
                        c12262x4a2a25a.o("onEndDragProgress: dragPosition=%d currentPositon=%d totalDistanceX=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c12262x4a2a25a.f165062f.mo51377x898ffe25()), java.lang.Float.valueOf(rawX));
                        c12262x4a2a25a.u(i17, false);
                    }
                    eVar.f333930i = -1;
                    eVar.f333931j = 0;
                    eVar.f333929h = 0.0f;
                } else if (cVar == ef1.c.Volume) {
                    ((android.media.AudioManager) context.getSystemService("audio")).getStreamMaxVolume(3);
                    oe1.s sVar = (oe1.s) dVar;
                    if (sVar.f426270a.d()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a2 = sVar.f426270a;
                        c12262x4a2a25a2.f165070p.setVisibility(8);
                        c12262x4a2a25a2.f165065i.f();
                    }
                } else if (cVar == ef1.c.Brightness) {
                    oe1.s sVar2 = (oe1.s) dVar;
                    if (sVar2.f426270a.d()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a3 = sVar2.f426270a;
                        c12262x4a2a25a3.f165070p.setVisibility(8);
                        c12262x4a2a25a3.f165065i.f();
                    }
                }
                eVar.f333924c = ef1.c.None;
            }
        }
        return true;
    }

    public final void p(java.lang.String str, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Video.AppBrandVideoView", this.C1 + " " + str, objArr);
    }

    public final java.lang.String q(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    public void r() {
        o("onUIResume", new java.lang.Object[0]);
        if (!this.f165084y0) {
            this.f165062f.g();
        } else {
            o("onUIResume, should skip ui resume", new java.lang.Object[0]);
            this.f165084y0 = false;
        }
    }

    public void s(boolean z17, int i17) {
        o("operateFullScreen toFullScreen:%b direction:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (this.G == null) {
            p("operateFullScreen mFullScreenDelegate null", new java.lang.Object[0]);
            return;
        }
        if (z17 == m()) {
            o("operateFullScreen current same", new java.lang.Object[0]);
            return;
        }
        if (i17 == -1) {
            i17 = this.f165060d;
            if (i17 == -1) {
                i17 = 90;
            }
            o("operateFullScreen target direction:%d", java.lang.Integer.valueOf(i17));
        }
        if (z17) {
            this.D1 = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.d) this.G;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) dVar.f165143a.M(dVar.f165144b)).i(dVar.f165145c, dVar.f165146d, i17);
            this.f165065i.mo51419x31f09cd3();
            c(true);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.d dVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1119x60b7c31.d) this.G;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) dVar2.f165143a.M(dVar2.f165144b)).j(dVar2.f165145c);
        this.f165065i.l();
    }

    /* renamed from: setAutoPauseIfNavigate */
    public void m51336xe1cd92d3(boolean z17) {
        this.f165071p0 = z17;
    }

    /* renamed from: setAutoPauseIfOpenNative */
    public void m51337x40e23fe3(boolean z17) {
        this.f165081x0 = z17;
    }

    /* renamed from: setAutoPlay */
    public void m51338xcc520c05(boolean z17) {
        o("setAutoPlay %b", java.lang.Boolean.valueOf(z17));
        this.A = z17;
    }

    /* renamed from: setCallback */
    public void m51339x6c4ebec7(xe1.p pVar) {
        this.C = pVar;
    }

    /* renamed from: setComponent */
    public void m51340x8504ebb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f165086z = lVar;
        lVar.mo48798x74292566();
        oe1.o1 o1Var = this.f165062f;
        if (o1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12263xadf304be) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12263xadf304be) o1Var).m51388x437c46f3(lVar);
        }
    }

    /* renamed from: setConsumeTouchEvent */
    public void m51341x5e96f375(boolean z17) {
        o("setConsumeTouchEvent game=%s", java.lang.Boolean.valueOf(z17));
        this.M = z17;
    }

    /* renamed from: setCookieData */
    public void m51342xbe31a230(java.lang.String str) {
        this.f165080x = str;
    }

    /* renamed from: setDanmakuEnable */
    public void m51343xa57d4630(boolean z17) {
        o("setDanmakuEnable %b", java.lang.Boolean.valueOf(z17));
        this.f165065i.mo51425x76647fb9(z17);
    }

    /* renamed from: setDanmakuItemList */
    public void m51344x1f8e87be(org.json.JSONArray jSONArray) {
        we1.a aVar;
        if (jSONArray == null) {
            return;
        }
        o("setDanmakuItemList length=%d", java.lang.Integer.valueOf(jSONArray.length()));
        if (this.f165064h == null) {
            p("setDanmakuItemList mDanmakuView null", new java.lang.Object[0]);
            l();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject == null) {
                aVar = null;
            } else {
                int optInt = optJSONObject.optInt("time", 0);
                java.lang.String optString = optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "");
                int a17 = ik1.w.a(optJSONObject.optString("color", ""));
                if (a17 == 0) {
                    a17 = -1;
                }
                aVar = new we1.a(getContext(), new android.text.SpannableString(optString), a17, 0, 3.0f, optInt);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e = this.f165064h;
        c12264x3a069b1e.getClass();
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            c12264x3a069b1e.f165122u = true;
        } else {
            c12264x3a069b1e.post(new we1.b(c12264x3a069b1e));
        }
        c12264x3a069b1e.b();
        ((java.util.LinkedList) c12264x3a069b1e.f165119r).clear();
        c12264x3a069b1e.f();
        if (arrayList.isEmpty()) {
            c12264x3a069b1e.g();
        } else {
            ((ku5.t0) ku5.t0.f394148d).q(new we1.e(c12264x3a069b1e, arrayList));
            c12264x3a069b1e.g();
        }
    }

    /* renamed from: setDuration */
    public void m51345xffd6ec16(int i17) {
        if (i17 <= 0) {
            o("setDuration error duration=%d", java.lang.Integer.valueOf(i17));
        } else {
            this.f165069o.setText(h(i17));
            this.K = i17;
        }
    }

    /* renamed from: setEnablePlayGesture */
    public void m51346x5672bdb0(boolean z17) {
        o("setEnablePlayGesture %b", java.lang.Boolean.valueOf(z17));
        this.W = z17;
    }

    /* renamed from: setFullScreenDelegate */
    public void m51347xda608282(oe1.y yVar) {
        this.G = yVar;
    }

    /* renamed from: setFullScreenDirection */
    public void m51348x4e6a0222(int i17) {
        o("setFullScreenDirection %d", java.lang.Integer.valueOf(i17));
        this.f165060d = i17;
    }

    /* renamed from: setFullScreenState */
    public void m51349x616988b4(boolean z17) {
        if (z17) {
            this.f165065i.mo51419x31f09cd3();
        } else {
            this.f165065i.l();
        }
    }

    /* renamed from: setIMMVideoViewCallback */
    public void m51350x526554de(oe1.h1 h1Var) {
        this.B1 = h1Var;
    }

    /* renamed from: setInitialTime */
    public void m51351xb9bf966f(double d17) {
        o("setInitialTime %s", java.lang.Double.valueOf(d17));
        this.f165059J = d17;
    }

    /* renamed from: setIsEnableBottomProgressBar */
    public void m51352x1a460d6c(boolean z17) {
        this.f165066l1 = z17;
    }

    /* renamed from: setIsShowBasicControls */
    public void m51353xc2e9d13b(boolean z17) {
        o("setIsShowBasicControls %b", java.lang.Boolean.valueOf(z17));
        this.B = z17;
        oe1.f1 f1Var = this.f165065i;
        if (f1Var != null) {
            if (z17) {
                f1Var.g();
            } else {
                f1Var.mo51420x30dd42();
            }
        }
    }

    /* renamed from: setLoop */
    public void m51354x764cf626(boolean z17) {
        o("setLoop %b", java.lang.Boolean.valueOf(z17));
        this.I = z17;
    }

    /* renamed from: setMinBufferDuration */
    public void m51355x3dc294a4(long j17) {
        oe1.o1 o1Var = this.f165062f;
        if (o1Var != null) {
            o1Var.mo51391x3dc294a4(j17);
        }
    }

    /* renamed from: setMute */
    public void m51356x764d819b(boolean z17) {
        o("setMute %b", java.lang.Boolean.valueOf(z17));
        this.U = z17;
        this.f165062f.mo51392x764d819b(z17);
        this.f165065i.mo51429x9b890a50(z17);
    }

    /* renamed from: setObjectFit */
    public void m51357x2f76610(java.lang.String str) {
        o("setObjectFit %s", str);
        boolean equalsIgnoreCase = "fill".equalsIgnoreCase(str);
        oe1.o1 o1Var = this.f165062f;
        if (equalsIgnoreCase) {
            o1Var.mo51395xebd28962(oe1.m1.FILL);
            this.f165076t.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        } else if ("cover".equalsIgnoreCase(str)) {
            o1Var.mo51395xebd28962(oe1.m1.COVER);
            this.f165076t.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else {
            o1Var.mo51395xebd28962(oe1.m1.CONTAIN);
            this.f165076t.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
    }

    /* renamed from: setPageGesture */
    public void m51358x263c1df8(boolean z17) {
        o("setPageGesture %b", java.lang.Boolean.valueOf(z17));
        this.D = z17;
    }

    /* renamed from: setPageGestureInFullscreen */
    public void m51359x3c3538d8(boolean z17) {
        o("setPageGestureInFullscreen %b", java.lang.Boolean.valueOf(z17));
        this.E = z17;
    }

    /* renamed from: setPlayBtnPosition */
    public void m51360xb1769f0f(java.lang.String str) {
        o("setPlayBtnPosition %s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equalsIgnoreCase("center")) {
            this.f165065i.mo51431xa239d909(false);
        } else {
            this.f165065i.mo51431xa239d909(true);
        }
    }

    /* renamed from: setShowCenterPlayBtn */
    public void m51361x2a96dc34(boolean z17) {
        oe1.f1 f1Var;
        o("setShowCenterPlayBtn %b", java.lang.Boolean.valueOf(z17));
        this.R = z17;
        android.view.View view = this.f165067m;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f165068n;
        int i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!this.R || (f1Var = this.f165065i) == null) {
            return;
        }
        f1Var.mo51420x30dd42();
    }

    /* renamed from: setShowControlProgress */
    public void m51362xb4d85e2b(boolean z17) {
        o("setShowControlProgress %b", java.lang.Boolean.valueOf(z17));
        this.f165065i.mo51432xb4d85e2b(z17 && !n());
    }

    /* renamed from: setShowDanmakuBtn */
    public void m51363x8498f2ac(boolean z17) {
        o("setShowDanmakuBtn %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (this.f165064h == null) {
                l();
            }
            this.f165065i.mo51424x69e685ee(new oe1.r(this));
        }
        this.f165065i.mo51433x8498f2ac(z17);
    }

    /* renamed from: setShowFullScreenBtn */
    public void m51364x1cf93842(boolean z17) {
        o("setShowFullScreenBtn %b", java.lang.Boolean.valueOf(z17));
        this.f165065i.mo51434x1cf93842(z17);
    }

    /* renamed from: setShowMuteBtn */
    public void m51365xdb9e6204(boolean z17) {
        o("showMuteBtn %b", java.lang.Boolean.valueOf(z17));
        this.f165065i.mo51435xdb9e6204(z17);
    }

    /* renamed from: setShowPlayBtn */
    public void m51366x69f2cf09(boolean z17) {
        o("setShowPlayBtn %b", java.lang.Boolean.valueOf(z17));
        this.f165065i.mo51436x69f2cf09(z17);
    }

    /* renamed from: setShowPoster */
    public void m51367x45add8ac(boolean z17) {
        o("setShowPoster %b", java.lang.Boolean.valueOf(z17));
        android.view.View view = this.f165067m;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowPoster", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowPoster", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setShowProgress */
    public void m51368x28c841cc(boolean z17) {
        o("setShowProgress %b", java.lang.Boolean.valueOf(z17));
        this.P = z17;
        this.f165065i.mo51437x28c841cc((z17 || this.Q) && !n());
    }

    /* renamed from: setShowProgressBarInControlMode */
    public void m51369x18e116d4(boolean z17) {
        o("setShowProgressInControlMode %b", java.lang.Boolean.valueOf(z17));
        this.Q = z17;
        this.f165065i.mo51437x28c841cc((this.P || z17) && !n());
    }

    /* renamed from: setTitle */
    public void m51370x53bfe316(java.lang.String str) {
        o("setTitle %s", str);
        this.f165065i.mo51439x53bfe316(str);
    }

    /* renamed from: setVideoContext */
    public void m51371xc72d5636(oe1.s1 s1Var) {
        this.C1 = s1Var;
        oe1.o1 o1Var = this.f165062f;
        if (o1Var != null) {
            o1Var.mo51396xc72d5636(s1Var);
        }
    }

    /* renamed from: setVideoPlayerId */
    public void m51372xb0516035(int i17) {
        this.f165083y = i17;
    }

    /* renamed from: setVideoSource */
    public void m51373xae209ab4(int i17) {
        o("setVideoSource %d", java.lang.Integer.valueOf(i17));
        this.S = i17;
    }

    public void t() {
        o("pause", new java.lang.Object[0]);
        if (!this.f165072p1) {
            o("pause, video not prepared", new java.lang.Object[0]);
            this.f165082x1 = false;
            return;
        }
        oe1.o1 o1Var = this.f165062f;
        if (!o1Var.mo51382xc00617a4()) {
            o("pause, video not playing", new java.lang.Object[0]);
            return;
        }
        o1Var.mo51383x65825f6();
        if (this.f165064h == null || !this.f165065i.h()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e = this.f165064h;
        c12264x3a069b1e.f165121t = 2;
        c12264x3a069b1e.invalidate();
    }

    public void u(double d17, boolean z17) {
        int mo51377x898ffe25 = this.f165062f.mo51377x898ffe25();
        o("seek to position=%s current=%d isLive=%b", java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(mo51377x898ffe25), java.lang.Boolean.valueOf(this.H));
        if (n()) {
            return;
        }
        android.view.View view = this.f165067m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "seekTo", "(DZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "seekTo", "(DZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            this.f165062f.a(d17, z17);
        } else {
            this.f165062f.b(d17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e = this.f165064h;
        if (c12264x3a069b1e == null || mo51377x898ffe25 <= d17) {
            return;
        }
        int i17 = (int) d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DanmuView", "seekToPlayTime playTime=%d", java.lang.Integer.valueOf(i17));
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            c12264x3a069b1e.f165122u = true;
        } else {
            c12264x3a069b1e.post(new we1.b(c12264x3a069b1e));
        }
        c12264x3a069b1e.b();
        c12264x3a069b1e.f();
        ((ku5.t0) ku5.t0.f394148d).g(new we1.f(c12264x3a069b1e, i17));
    }

    public void v(java.lang.String str, java.lang.String str2) {
        o("setCover:%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.L = str;
        l01.d0.f396294a.b(this.f165076t, str, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(java.lang.String r17, boolean r18, int r19) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a.w(java.lang.String, boolean, int):void");
    }

    public void x() {
        o("start", new java.lang.Object[0]);
        if (this.f165072p1) {
            o("start, video prepared, reset control flag", new java.lang.Object[0]);
            this.f165082x1 = false;
        } else {
            o("start, video not prepared", new java.lang.Object[0]);
            this.f165082x1 = true;
        }
        oe1.o1 o1Var = this.f165062f;
        if (o1Var.mo51382xc00617a4()) {
            o("start, video is playing", new java.lang.Object[0]);
            return;
        }
        if (this.B) {
            this.f165065i.n();
        }
        android.view.View view = this.f165067m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "start", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "start", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        o1Var.mo51399x68ac462();
        if (this.f165064h == null || !this.f165065i.h()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e = this.f165064h;
        c12264x3a069b1e.f165121t = 1;
        c12264x3a069b1e.invalidate();
    }

    public void y() {
        o("stop", new java.lang.Object[0]);
        if (!this.f165072p1) {
            o("stop, video not prepared", new java.lang.Object[0]);
            this.f165082x1 = false;
            return;
        }
        oe1.o1 o1Var = this.f165062f;
        if (!o1Var.mo51382xc00617a4()) {
            o("stop, video not playing", new java.lang.Object[0]);
            return;
        }
        o1Var.mo51400x360802();
        this.f165065i.i();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1117x5aef0f9.C12264x3a069b1e c12264x3a069b1e = this.f165064h;
        if (c12264x3a069b1e != null) {
            c12264x3a069b1e.f165121t = 4;
            c12264x3a069b1e.invalidate();
        }
    }

    public C12262x4a2a25a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f165060d = -1;
        this.f165084y0 = false;
        this.f165066l1 = true;
        this.f165072p1 = false;
        this.f165082x1 = false;
        this.f165087z1 = 0;
        this.A1 = -16777216;
        this.C1 = null;
        j(context);
    }

    public C12262x4a2a25a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165060d = -1;
        this.f165084y0 = false;
        this.f165066l1 = true;
        this.f165072p1 = false;
        this.f165082x1 = false;
        this.f165087z1 = 0;
        this.A1 = -16777216;
        this.C1 = null;
        j(context);
    }
}
