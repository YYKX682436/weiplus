package com.tencent.mm.plugin.appbrand.jsapi.video;

/* loaded from: classes15.dex */
public class AppBrandVideoView extends android.widget.RelativeLayout {
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
    public double f83526J;
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
    public int f83527d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f83528e;

    /* renamed from: f, reason: collision with root package name */
    public final oe1.o1 f83529f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f83530g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView f83531h;

    /* renamed from: i, reason: collision with root package name */
    public oe1.f1 f83532i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f83533l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f83534m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f83535n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f83536o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f83537p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f83538p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f83539p1;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.video.ui.AppBrandDotPercentIndicator f83540q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f83541r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f83542s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f83543t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f83544u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f83545v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f83546w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f83547x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f83548x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f83549x1;

    /* renamed from: y, reason: collision with root package name */
    public int f83550y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f83551y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f83552y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f83553z;

    /* renamed from: z1, reason: collision with root package name */
    public int f83554z1;

    /* JADX WARN: Multi-variable type inference failed */
    public AppBrandVideoView(android.content.Context context, android.view.View view) {
        super(context);
        this.f83527d = -1;
        this.f83551y0 = false;
        this.f83533l1 = true;
        this.f83539p1 = false;
        this.f83549x1 = false;
        this.f83554z1 = 0;
        this.A1 = -16777216;
        this.C1 = null;
        this.f83529f = (oe1.o1) view;
        j(context);
        this.f83528e.addView(view);
    }

    public static void a(com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView) {
        boolean e17 = appBrandVideoView.f83532i.e();
        if (appBrandVideoView.B && appBrandVideoView.P && appBrandVideoView.f83533l1 && !e17 && !appBrandVideoView.n()) {
            if (!(appBrandVideoView.f83534m.getVisibility() == 0)) {
                appBrandVideoView.f83546w.setVisibility(0);
                return;
            }
        }
        appBrandVideoView.f83546w.setVisibility(8);
    }

    private void setCover(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            ik1.h0.a().postToWorker(new oe1.q(this, str));
        } else {
            o("setCover mCoverUrl not null", new java.lang.Object[0]);
        }
    }

    public boolean b(java.lang.String str, java.lang.String str2) {
        if (this.f83531h == null) {
            p(" addDanmaku mDanmakuView null", new java.lang.Object[0]);
            l();
        }
        int a17 = ik1.w.a(str2);
        if (a17 == 0) {
            a17 = -1;
        }
        we1.a aVar = new we1.a(getContext(), new android.text.SpannableString(str), a17, 0, 3.0f, this.f83529f.getCurrPosSec());
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView = this.f83531h;
        synchronized (danmuView.f83585q) {
            ((java.util.LinkedList) danmuView.f83585q).offerFirst(aVar);
            ((ku5.t0) ku5.t0.f312615d).h(new we1.d(danmuView, aVar), "DanmuView-addItemToWaitingHead");
        }
        return true;
    }

    public final void c(boolean z17) {
        xe1.p pVar = this.C;
        if (pVar == null) {
            return;
        }
        int i17 = this.f83550y;
        int i18 = this.D1;
        pVar.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Video.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%d", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
            org.json.JSONObject b17 = pVar.b();
            b17.put("fullScreen", z17);
            b17.put("videoPlayerId", i17);
            b17.put(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, i18);
            pVar.a(new xe1.f(null), b17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Video.JsApiVideoCallback", "onVideoFullScreenChange e=%s", e17);
        }
    }

    public final boolean d() {
        if (!(this.f83534m.getVisibility() == 0)) {
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
        if (!this.N || this.f83529f.j()) {
            return false;
        }
        return !(this.f83534m.getVisibility() == 0);
    }

    public void f() {
        o("clean", new java.lang.Object[0]);
        y();
        this.f83529f.d();
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView = this.f83531h;
        if (danmuView != null) {
            danmuView.f83588t = 3;
            danmuView.b();
            ((java.util.LinkedList) danmuView.f83586r).clear();
            danmuView.invalidate();
        }
        this.f83532i.onDestroy();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f83552y1;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    public void g(boolean z17) {
        o("enableProgressGesture %b", java.lang.Boolean.valueOf(z17));
        this.N = z17;
    }

    public int getCacheTimeSec() {
        oe1.o1 o1Var = this.f83529f;
        if (o1Var != null) {
            return o1Var.getCacheTimeSec();
        }
        return 0;
    }

    public xe1.p getCallback() {
        return this.C;
    }

    public java.lang.String getCookieData() {
        return this.f83547x;
    }

    public int getCurrPosMs() {
        return this.f83529f.getCurrPosMs();
    }

    public int getCurrPosSec() {
        return this.f83529f.getCurrPosSec();
    }

    public int getDuration() {
        int i17 = this.K;
        return i17 > 0 ? i17 : this.f83529f.getVideoDurationSec();
    }

    public final java.lang.String h(int i17) {
        return q(i17 / 60) + ":" + q(i17 % 60);
    }

    public final void i() {
        this.f83532i.d();
    }

    public final void j(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488111hg, this);
        setBackgroundColor(this.A1);
        this.f83528e = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.p0x);
        this.f83530g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lbi);
        this.f83534m = findViewById(com.tencent.mm.R.id.ckn);
        this.f83535n = findViewById(com.tencent.mm.R.id.clb);
        this.f83536o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.clh);
        this.f83537p = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f482762nc);
        this.f83540q = (com.tencent.mm.plugin.appbrand.jsapi.video.ui.AppBrandDotPercentIndicator) findViewById(com.tencent.mm.R.id.f482763nd);
        this.f83541r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n_);
        this.f83542s = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482761nb);
        this.f83543t = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cki);
        this.f83544u = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kxe);
        this.f83545v = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kxd);
        this.f83546w = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.kxf);
        this.f83540q.setDotsNum(8);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.cla)).setOnClickListener(new oe1.o(this));
        this.F = new ef1.e(getContext(), this, new oe1.s(this));
        this.f83529f.setIMMVideoViewCallback(new oe1.t(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(oe1.f1 f1Var) {
        this.f83532i = f1Var;
        if ((f1Var instanceof android.view.View) && f1Var != 0) {
            android.view.View view = (android.view.View) f1Var;
            if (view.getId() != -1) {
                view.setId(com.tencent.mm.R.id.a0w);
            }
        }
        this.f83532i.hide();
        this.f83532i.setFullScreenBtnOnClickListener(new oe1.v(this));
        this.f83532i.setIplaySeekCallback(new oe1.w(this));
        this.f83532i.setOnPlayButtonClickListener(new oe1.x(this));
        this.f83532i.setStatePorter(new oe1.i(this));
        this.f83532i.setMuteBtnOnClickListener(new oe1.j(this));
        this.f83532i.setExitFullScreenBtnOnClickListener(new oe1.k(this));
        this.f83532i.k(new oe1.l(this));
        this.f83532i.setOnUpdateProgressLenListener(new oe1.m(this));
    }

    public final void l() {
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView = (com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView) findViewById(com.tencent.mm.R.id.cqa);
        this.f83531h = danmuView;
        danmuView.setDanmuViewCallBack(new oe1.u(this));
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView2 = this.f83531h;
        danmuView2.f83579h = 0.0f;
        danmuView2.f83580i = 0.8f;
        danmuView2.setMaxRunningPerRow(5);
        this.f83531h.setPickItemInterval(200);
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView3 = this.f83531h;
        danmuView3.f83588t = 4;
        danmuView3.invalidate();
        java.lang.Object obj = this.f83529f;
        if (obj != null) {
            if (((android.view.View) obj).getHeight() > 0) {
                this.f83531h.setMaxRow((int) (((int) (this.f83531h.getYOffset() * r0.getHeight())) / (i65.a.b(getContext(), 18) * 2.0f)));
            }
        }
    }

    public boolean m() {
        oe1.y yVar = this.G;
        if (yVar == null) {
            p("isInFullScreen mFullScreenDelegate null", new java.lang.Object[0]);
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d dVar = (com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d) yVar;
        com.tencent.mm.plugin.appbrand.page.ia iaVar = (com.tencent.mm.plugin.appbrand.page.ia) dVar.f83610a.M(dVar.f83611b);
        int i17 = iaVar.f86765i;
        int i18 = dVar.f83612c;
        return i17 == i18 || iaVar.f86760d == i18;
    }

    public final boolean n() {
        return this.H || this.f83529f.j();
    }

    public final void o(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.AppBrandVideoView", this.C1 + " " + str, objArr);
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
            if (motionEvent.getAction() == 0 && this.B && this.f83534m.getVisibility() != 0) {
                this.f83532i.j();
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
            ef1.d dVar = eVar.f252393e;
            dVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            android.content.Context context = eVar.f252389a;
            if (actionMasked == 0) {
                eVar.f252396h = motionEvent.getRawX();
                eVar.f252395g = ((android.media.AudioManager) context.getSystemService("audio")).getStreamVolume(3);
                eVar.f252394f = oe1.x1.b(context);
            }
            android.view.GestureDetector gestureDetector = eVar.f252392d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            if (actionMasked == 1 || actionMasked == 3) {
                ef1.c cVar = eVar.f252391c;
                if (cVar == ef1.c.FastBackwardOrForward) {
                    int i17 = eVar.f252398j;
                    float rawX = motionEvent.getRawX() - eVar.f252396h;
                    com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView = ((oe1.s) dVar).f344737a;
                    if (appBrandVideoView.e()) {
                        appBrandVideoView.f83530g.setVisibility(8);
                        appBrandVideoView.f83532i.f();
                        appBrandVideoView.o("onEndDragProgress: dragPosition=%d currentPositon=%d totalDistanceX=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(appBrandVideoView.f83529f.getCurrPosSec()), java.lang.Float.valueOf(rawX));
                        appBrandVideoView.u(i17, false);
                    }
                    eVar.f252397i = -1;
                    eVar.f252398j = 0;
                    eVar.f252396h = 0.0f;
                } else if (cVar == ef1.c.Volume) {
                    ((android.media.AudioManager) context.getSystemService("audio")).getStreamMaxVolume(3);
                    oe1.s sVar = (oe1.s) dVar;
                    if (sVar.f344737a.d()) {
                        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView2 = sVar.f344737a;
                        appBrandVideoView2.f83537p.setVisibility(8);
                        appBrandVideoView2.f83532i.f();
                    }
                } else if (cVar == ef1.c.Brightness) {
                    oe1.s sVar2 = (oe1.s) dVar;
                    if (sVar2.f344737a.d()) {
                        com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView appBrandVideoView3 = sVar2.f344737a;
                        appBrandVideoView3.f83537p.setVisibility(8);
                        appBrandVideoView3.f83532i.f();
                    }
                }
                eVar.f252391c = ef1.c.None;
            }
        }
        return true;
    }

    public final void p(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.w("MicroMsg.Video.AppBrandVideoView", this.C1 + " " + str, objArr);
    }

    public final java.lang.String q(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    public void r() {
        o("onUIResume", new java.lang.Object[0]);
        if (!this.f83551y0) {
            this.f83529f.g();
        } else {
            o("onUIResume, should skip ui resume", new java.lang.Object[0]);
            this.f83551y0 = false;
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
            i17 = this.f83527d;
            if (i17 == -1) {
                i17 = 90;
            }
            o("operateFullScreen target direction:%d", java.lang.Integer.valueOf(i17));
        }
        if (z17) {
            this.D1 = i17;
            com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d dVar = (com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d) this.G;
            ((com.tencent.mm.plugin.appbrand.page.ia) dVar.f83610a.M(dVar.f83611b)).i(dVar.f83612c, dVar.f83613d, i17);
            this.f83532i.enterFullScreen();
            c(true);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d dVar2 = (com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.d) this.G;
        ((com.tencent.mm.plugin.appbrand.page.ia) dVar2.f83610a.M(dVar2.f83611b)).j(dVar2.f83612c);
        this.f83532i.l();
    }

    public void setAutoPauseIfNavigate(boolean z17) {
        this.f83538p0 = z17;
    }

    public void setAutoPauseIfOpenNative(boolean z17) {
        this.f83548x0 = z17;
    }

    public void setAutoPlay(boolean z17) {
        o("setAutoPlay %b", java.lang.Boolean.valueOf(z17));
        this.A = z17;
    }

    public void setCallback(xe1.p pVar) {
        this.C = pVar;
    }

    public void setComponent(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f83553z = lVar;
        lVar.getAppId();
        oe1.o1 o1Var = this.f83529f;
        if (o1Var instanceof com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper) {
            ((com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper) o1Var).setHostComponent(lVar);
        }
    }

    public void setConsumeTouchEvent(boolean z17) {
        o("setConsumeTouchEvent game=%s", java.lang.Boolean.valueOf(z17));
        this.M = z17;
    }

    public void setCookieData(java.lang.String str) {
        this.f83547x = str;
    }

    public void setDanmakuEnable(boolean z17) {
        o("setDanmakuEnable %b", java.lang.Boolean.valueOf(z17));
        this.f83532i.setDanmakuBtnOpen(z17);
    }

    public void setDanmakuItemList(org.json.JSONArray jSONArray) {
        we1.a aVar;
        if (jSONArray == null) {
            return;
        }
        o("setDanmakuItemList length=%d", java.lang.Integer.valueOf(jSONArray.length()));
        if (this.f83531h == null) {
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
                java.lang.String optString = optJSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "");
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
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView = this.f83531h;
        danmuView.getClass();
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            danmuView.f83589u = true;
        } else {
            danmuView.post(new we1.b(danmuView));
        }
        danmuView.b();
        ((java.util.LinkedList) danmuView.f83586r).clear();
        danmuView.f();
        if (arrayList.isEmpty()) {
            danmuView.g();
        } else {
            ((ku5.t0) ku5.t0.f312615d).q(new we1.e(danmuView, arrayList));
            danmuView.g();
        }
    }

    public void setDuration(int i17) {
        if (i17 <= 0) {
            o("setDuration error duration=%d", java.lang.Integer.valueOf(i17));
        } else {
            this.f83536o.setText(h(i17));
            this.K = i17;
        }
    }

    public void setEnablePlayGesture(boolean z17) {
        o("setEnablePlayGesture %b", java.lang.Boolean.valueOf(z17));
        this.W = z17;
    }

    public void setFullScreenDelegate(oe1.y yVar) {
        this.G = yVar;
    }

    public void setFullScreenDirection(int i17) {
        o("setFullScreenDirection %d", java.lang.Integer.valueOf(i17));
        this.f83527d = i17;
    }

    public void setFullScreenState(boolean z17) {
        if (z17) {
            this.f83532i.enterFullScreen();
        } else {
            this.f83532i.l();
        }
    }

    public void setIMMVideoViewCallback(oe1.h1 h1Var) {
        this.B1 = h1Var;
    }

    public void setInitialTime(double d17) {
        o("setInitialTime %s", java.lang.Double.valueOf(d17));
        this.f83526J = d17;
    }

    public void setIsEnableBottomProgressBar(boolean z17) {
        this.f83533l1 = z17;
    }

    public void setIsShowBasicControls(boolean z17) {
        o("setIsShowBasicControls %b", java.lang.Boolean.valueOf(z17));
        this.B = z17;
        oe1.f1 f1Var = this.f83532i;
        if (f1Var != null) {
            if (z17) {
                f1Var.g();
            } else {
                f1Var.hide();
            }
        }
    }

    public void setLoop(boolean z17) {
        o("setLoop %b", java.lang.Boolean.valueOf(z17));
        this.I = z17;
    }

    public void setMinBufferDuration(long j17) {
        oe1.o1 o1Var = this.f83529f;
        if (o1Var != null) {
            o1Var.setMinBufferDuration(j17);
        }
    }

    public void setMute(boolean z17) {
        o("setMute %b", java.lang.Boolean.valueOf(z17));
        this.U = z17;
        this.f83529f.setMute(z17);
        this.f83532i.setMuteBtnState(z17);
    }

    public void setObjectFit(java.lang.String str) {
        o("setObjectFit %s", str);
        boolean equalsIgnoreCase = "fill".equalsIgnoreCase(str);
        oe1.o1 o1Var = this.f83529f;
        if (equalsIgnoreCase) {
            o1Var.setScaleType(oe1.m1.FILL);
            this.f83543t.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        } else if ("cover".equalsIgnoreCase(str)) {
            o1Var.setScaleType(oe1.m1.COVER);
            this.f83543t.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else {
            o1Var.setScaleType(oe1.m1.CONTAIN);
            this.f83543t.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
    }

    public void setPageGesture(boolean z17) {
        o("setPageGesture %b", java.lang.Boolean.valueOf(z17));
        this.D = z17;
    }

    public void setPageGestureInFullscreen(boolean z17) {
        o("setPageGestureInFullscreen %b", java.lang.Boolean.valueOf(z17));
        this.E = z17;
    }

    public void setPlayBtnPosition(java.lang.String str) {
        o("setPlayBtnPosition %s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equalsIgnoreCase("center")) {
            this.f83532i.setPlayBtnInCenterPosition(false);
        } else {
            this.f83532i.setPlayBtnInCenterPosition(true);
        }
    }

    public void setShowCenterPlayBtn(boolean z17) {
        oe1.f1 f1Var;
        o("setShowCenterPlayBtn %b", java.lang.Boolean.valueOf(z17));
        this.R = z17;
        android.view.View view = this.f83534m;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f83535n;
        int i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowCenterPlayBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!this.R || (f1Var = this.f83532i) == null) {
            return;
        }
        f1Var.hide();
    }

    public void setShowControlProgress(boolean z17) {
        o("setShowControlProgress %b", java.lang.Boolean.valueOf(z17));
        this.f83532i.setShowControlProgress(z17 && !n());
    }

    public void setShowDanmakuBtn(boolean z17) {
        o("setShowDanmakuBtn %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (this.f83531h == null) {
                l();
            }
            this.f83532i.setDanmakuBtnOnClickListener(new oe1.r(this));
        }
        this.f83532i.setShowDanmakuBtn(z17);
    }

    public void setShowFullScreenBtn(boolean z17) {
        o("setShowFullScreenBtn %b", java.lang.Boolean.valueOf(z17));
        this.f83532i.setShowFullScreenBtn(z17);
    }

    public void setShowMuteBtn(boolean z17) {
        o("showMuteBtn %b", java.lang.Boolean.valueOf(z17));
        this.f83532i.setShowMuteBtn(z17);
    }

    public void setShowPlayBtn(boolean z17) {
        o("setShowPlayBtn %b", java.lang.Boolean.valueOf(z17));
        this.f83532i.setShowPlayBtn(z17);
    }

    public void setShowPoster(boolean z17) {
        o("setShowPoster %b", java.lang.Boolean.valueOf(z17));
        android.view.View view = this.f83534m;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowPoster", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "setShowPoster", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setShowProgress(boolean z17) {
        o("setShowProgress %b", java.lang.Boolean.valueOf(z17));
        this.P = z17;
        this.f83532i.setShowProgress((z17 || this.Q) && !n());
    }

    public void setShowProgressBarInControlMode(boolean z17) {
        o("setShowProgressInControlMode %b", java.lang.Boolean.valueOf(z17));
        this.Q = z17;
        this.f83532i.setShowProgress((this.P || z17) && !n());
    }

    public void setTitle(java.lang.String str) {
        o("setTitle %s", str);
        this.f83532i.setTitle(str);
    }

    public void setVideoContext(oe1.s1 s1Var) {
        this.C1 = s1Var;
        oe1.o1 o1Var = this.f83529f;
        if (o1Var != null) {
            o1Var.setVideoContext(s1Var);
        }
    }

    public void setVideoPlayerId(int i17) {
        this.f83550y = i17;
    }

    public void setVideoSource(int i17) {
        o("setVideoSource %d", java.lang.Integer.valueOf(i17));
        this.S = i17;
    }

    public void t() {
        o("pause", new java.lang.Object[0]);
        if (!this.f83539p1) {
            o("pause, video not prepared", new java.lang.Object[0]);
            this.f83549x1 = false;
            return;
        }
        oe1.o1 o1Var = this.f83529f;
        if (!o1Var.isPlaying()) {
            o("pause, video not playing", new java.lang.Object[0]);
            return;
        }
        o1Var.pause();
        if (this.f83531h == null || !this.f83532i.h()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView = this.f83531h;
        danmuView.f83588t = 2;
        danmuView.invalidate();
    }

    public void u(double d17, boolean z17) {
        int currPosSec = this.f83529f.getCurrPosSec();
        o("seek to position=%s current=%d isLive=%b", java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(currPosSec), java.lang.Boolean.valueOf(this.H));
        if (n()) {
            return;
        }
        android.view.View view = this.f83534m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "seekTo", "(DZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "seekTo", "(DZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z17) {
            this.f83529f.a(d17, z17);
        } else {
            this.f83529f.b(d17);
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView = this.f83531h;
        if (danmuView == null || currPosSec <= d17) {
            return;
        }
        int i17 = (int) d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.DanmuView", "seekToPlayTime playTime=%d", java.lang.Integer.valueOf(i17));
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            danmuView.f83589u = true;
        } else {
            danmuView.post(new we1.b(danmuView));
        }
        danmuView.b();
        danmuView.f();
        ((ku5.t0) ku5.t0.f312615d).g(new we1.f(danmuView, i17));
    }

    public void v(java.lang.String str, java.lang.String str2) {
        o("setCover:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.L = str;
        l01.d0.f314761a.b(this.f83543t, str, null, null);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView.w(java.lang.String, boolean, int):void");
    }

    public void x() {
        o("start", new java.lang.Object[0]);
        if (this.f83539p1) {
            o("start, video prepared, reset control flag", new java.lang.Object[0]);
            this.f83549x1 = false;
        } else {
            o("start, video not prepared", new java.lang.Object[0]);
            this.f83549x1 = true;
        }
        oe1.o1 o1Var = this.f83529f;
        if (o1Var.isPlaying()) {
            o("start, video is playing", new java.lang.Object[0]);
            return;
        }
        if (this.B) {
            this.f83532i.n();
        }
        android.view.View view = this.f83534m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "start", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView", "start", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        o1Var.start();
        if (this.f83531h == null || !this.f83532i.h()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView = this.f83531h;
        danmuView.f83588t = 1;
        danmuView.invalidate();
    }

    public void y() {
        o("stop", new java.lang.Object[0]);
        if (!this.f83539p1) {
            o("stop, video not prepared", new java.lang.Object[0]);
            this.f83549x1 = false;
            return;
        }
        oe1.o1 o1Var = this.f83529f;
        if (!o1Var.isPlaying()) {
            o("stop, video not playing", new java.lang.Object[0]);
            return;
        }
        o1Var.stop();
        this.f83532i.i();
        com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView danmuView = this.f83531h;
        if (danmuView != null) {
            danmuView.f83588t = 4;
            danmuView.invalidate();
        }
    }

    public AppBrandVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83527d = -1;
        this.f83551y0 = false;
        this.f83533l1 = true;
        this.f83539p1 = false;
        this.f83549x1 = false;
        this.f83554z1 = 0;
        this.A1 = -16777216;
        this.C1 = null;
        j(context);
    }

    public AppBrandVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f83527d = -1;
        this.f83551y0 = false;
        this.f83533l1 = true;
        this.f83539p1 = false;
        this.f83549x1 = false;
        this.f83554z1 = 0;
        this.A1 = -16777216;
        this.C1 = null;
        j(context);
    }
}
