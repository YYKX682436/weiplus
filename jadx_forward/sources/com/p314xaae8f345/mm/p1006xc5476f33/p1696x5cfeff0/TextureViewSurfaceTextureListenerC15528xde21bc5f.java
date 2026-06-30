package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* renamed from: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout */
/* loaded from: classes14.dex */
public class TextureViewSurfaceTextureListenerC15528xde21bc5f extends android.widget.RelativeLayout implements com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener, android.view.TextureView.SurfaceTextureListener, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTBaseFunctionListener {
    public static final /* synthetic */ int P = 0;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public long G;
    public boolean H;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 I;

    /* renamed from: J, reason: collision with root package name */
    public long f218551J;
    public final java.util.List K;
    public java.lang.String L;
    public java.lang.String M;
    public final android.os.CountDownTimer N;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15539x128d01d6 f218552d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f218553e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f218554f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 f218555g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f218556h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f218557i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15540x683732f0 f218558m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f218559n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f218560o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f218561p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547 f218562q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p f218563r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f218564s;

    /* renamed from: t, reason: collision with root package name */
    public tz2.u f218565t;

    /* renamed from: u, reason: collision with root package name */
    public final tz2.j f218566u;

    /* renamed from: v, reason: collision with root package name */
    public sz2.b f218567v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode f218568w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f218569x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f218570y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f218571z;

    static {
        rz2.g.a();
    }

    public TextureViewSurfaceTextureListenerC15528xde21bc5f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getDegree */
    private int m63467x157b91c2() {
        int rotation = ((android.app.Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public final void a() {
        this.f218559n.setVisibility(4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "resetWithoutPreview");
        vz2.b.b(this.f218568w);
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15539x128d01d6 c15539x128d01d6 = this.f218552d;
        c15539x128d01d6.getClass();
        c15539x128d01d6.mo63489x83f16419(new android.graphics.ColorMatrixColorFilter(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        int d17 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547 viewOnClickListenerC15531xcd76b547 = this.f218562q;
        viewOnClickListenerC15531xcd76b547.Z6(d17);
        this.f218553e.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        this.f218569x = false;
        this.f218570y = false;
        this.G = 0L;
        this.C = 0;
        this.f218552d.m63490x3ae760af(0.0f);
        this.f218557i.setVisibility(8);
        this.f218558m.a();
        this.f218558m.removeAllViews();
        android.view.View view = this.f218560o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = this.f218571z;
        tz2.j jVar = this.f218566u;
        if (z17) {
            if (jVar.f504829m == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "recordManager reset abort");
                this.f218565t.mo167283x6761d4f();
                viewOnClickListenerC15531xcd76b547.Z6(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
                e(i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f81499x6786c610));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "recordManager reset");
        jVar.c();
        this.f218565t.mo167283x6761d4f();
        viewOnClickListenerC15531xcd76b547.Z6(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        e(i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f81499x6786c610));
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onPause");
        if (this.f218570y) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120763xed82fe04(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p pVar = this.f218563r;
        pVar.a();
        pVar.f218773a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "releaseYTSdk");
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120760xb056bd31();
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var = pVar.f218774b;
        if (d0Var != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = d0Var.f218733c;
            if (n3Var != null) {
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.a0(d0Var));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerCamera", "back thread is not running");
            }
        }
        g();
        a();
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTBaseFunctionListener
    /* renamed from: base64Encode */
    public java.lang.String mo63468xbce55045(byte[] bArr, int i17) {
        return null;
    }

    public void c() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onResume");
        if (getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p pVar = this.f218563r;
            pVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.r();
            pVar.f218773a = rVar;
            if (rVar.c()) {
                vz2.c.j("initSdk");
                vz2.c.m(10);
                z17 = true;
            } else {
                vz2.c.k("initSdk", -1);
                vz2.c.b().B = 2;
                pVar.f218775c.W6(90013, "init lib failed");
                z17 = false;
            }
            if (z17) {
                if (this.f218555g.isAvailable()) {
                    onSurfaceTextureAvailable(this.f218555g.getSurfaceTexture(), this.f218555g.getWidth(), this.f218555g.getHeight());
                }
                this.f218555g.setSurfaceTextureListener(this);
                this.N.start();
                if (this.E == -1) {
                    this.E = m63467x157b91c2();
                }
            }
        }
    }

    public final void d() {
        if (this.f218552d.m63486x6c781953() <= 0.0f) {
            this.f218552d.m63487x6c4ebec7(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.g(this));
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f218556h.getLayoutParams();
        marginLayoutParams.topMargin = (int) (this.f218552d.m63486x6c781953() - (this.f218556h.getHeight() / 2));
        this.f218556h.setLayoutParams(marginLayoutParams);
        this.f218557i.getHeight();
    }

    public final void e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "resetTranslateAnimation prepareVerifying:%s", java.lang.Boolean.valueOf(this.f218569x));
        f(this.f218553e, str);
        this.f218553e.setTextColor(android.graphics.Color.parseColor("#000000"));
        if (!android.text.TextUtils.isEmpty(this.L)) {
            if (android.text.TextUtils.isEmpty(this.M)) {
                this.f218554f.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            } else {
                this.f218554f.setTextColor(android.graphics.Color.parseColor(this.M));
            }
        }
        this.f218553e.clearAnimation();
        this.f218553e.setVisibility(0);
        this.f218558m.setVisibility(4);
    }

    public final void f(android.widget.TextView textView, java.lang.String str) {
        wz2.a.j(textView, str);
        tz2.e eVar = (tz2.e) this.f218565t;
        eVar.getClass();
        eVar.f504807s = java.lang.System.currentTimeMillis();
    }

    public final void g() {
        this.f218558m.a();
        this.f218566u.f(((tz2.e) this.f218565t).f504798g);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6435x3e5b6070 b17 = vz2.c.b();
        b17.f137733y = b17.b("BioId", java.lang.String.valueOf(((tz2.e) this.f218565t).f504798g), true);
        tz2.u uVar = this.f218565t;
        if (uVar instanceof tz2.i) {
            ((tz2.i) uVar).p();
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTBaseFunctionListener
    /* renamed from: getVoiceData */
    public byte[] mo63469xc2a8cd46() {
        g();
        int i17 = -1;
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(((tz2.i) this.f218565t).F.f331426c, -1, -1);
        if (N != null && N.length > 0) {
            i17 = 0;
        }
        vz2.c.k("voiceData", java.lang.Integer.valueOf(i17));
        return N;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.f218555g.setRotation(-(m63467x157b91c2() - this.E));
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener
    /* renamed from: onFrameworkEvent */
    public void mo63470x53c0c6fb(java.util.HashMap hashMap) {
        if (hashMap.containsKey(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61552x12652331)) {
            java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61552x12652331);
            if (vz2.c.f523195e == null) {
                vz2.c.f523195e = new org.json.JSONArray();
            }
            if ((vz2.c.f523195e.toString().length() <= 1000) && hashMap2 != null && hashMap2.size() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerReport", "updateFaceSdkState:%s", jSONObject);
                if (vz2.c.f523195e.length() >= 5) {
                    vz2.c.f523195e.remove(0);
                    vz2.c.f523195e.put(jSONObject);
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.j(this, hashMap));
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener
    /* renamed from: onGetAppBrightness */
    public float mo63471xee427d9b() {
        return 1.0f;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitFrameworkEventListener
    /* renamed from: onNetworkRequestEvent */
    public void mo63472x2ed2023a(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        this.f218565t.mo63480x2ed2023a(str, str2, hashMap, iYtSDKKitNetResponseParser);
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener
    /* renamed from: onReflectEvent */
    public void mo63473xbd8fe55c(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "change color :%s isVerifying:%s", colorMatrixColorFilter, java.lang.Boolean.valueOf(this.f218570y));
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.b(this, colorMatrixColorFilter));
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYTReflectListener
    /* renamed from: onReflectStart */
    public void mo63474xbe543724(long j17) {
        vz2.c.j("reflect");
        this.F = (float) j17;
        this.G = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.c(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onReflectStart duration:%s", java.lang.Long.valueOf(j17));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onSurfaceTextureAvailable width:%s,height:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p pVar = this.f218563r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var = pVar.f218774b;
        if ((d0Var == null ? false : d0Var.f218741k) || this.f218570y || getVisibility() != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var2 = pVar.f218774b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "jump start preview again. isPreviewing:%s isVerifying:%s", java.lang.Boolean.valueOf(d0Var2 != null ? d0Var2.f218741k : false), java.lang.Boolean.valueOf(this.f218570y));
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 c21518xd171d8a0 = this.f218555g;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = this.f218568w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.e(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0 d0Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.d0(pVar.f218775c);
        pVar.f218774b = d0Var3;
        d0Var3.d(c21518xd171d8a0, new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.o(pVar, this, this, ytSDKKitFrameworkWorkMode, this, surfaceTexture, eVar));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onSurfaceTextureDestroyed");
        this.f218563r.a();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "onSurfaceTextureSizeChanged width:%s,height:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewSurfaceTextureListenerC15528xde21bc5f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        android.hardware.SensorManager sensorManager;
        int i18 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547 viewOnClickListenerC15531xcd76b547 = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547) getContext();
        this.f218562q = viewOnClickListenerC15531xcd76b547;
        this.f218563r = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p(viewOnClickListenerC15531xcd76b547);
        this.f218564s = getContext();
        tz2.j jVar = new tz2.j();
        this.f218566u = jVar;
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
        this.f218568w = ytSDKKitFrameworkWorkMode;
        this.f218569x = false;
        this.f218570y = false;
        this.f218571z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = -1;
        this.E = -1;
        this.F = 0.0f;
        this.G = 0L;
        this.H = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("face-flash");
        this.I = M;
        this.f218551J = M.q("show-dialog", 0L);
        this.K = java.util.Arrays.asList(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61576x2413b570, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61580x44e0fc45, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61573x744b58f, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61577xe1e24402, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61578x749d118, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61575xc75b789e, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61579x5d0f8329, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61584xfb5a423a, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61587xecc5c7cc, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61586x4913e2d1, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61585xb1de3edd, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61581x80931aef, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61582x6fa5edcf, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61583x274251f0, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61588x8645643a, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61572x9f190f25, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61559xcc75bcf6, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61563x6752e4f8, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61565x2cba061f, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61562xaef86602, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61566x44bffbb, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61564x600e48d6);
        this.L = null;
        this.M = null;
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.a(this, 25000L, 1000L);
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aa8, (android.view.ViewGroup) this, true);
        this.f218552d = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15539x128d01d6) findViewById(com.p314xaae8f345.mm.R.id.f566542g82);
        this.f218553e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g89);
        this.f218554f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g8_);
        this.f218556h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dme);
        this.f218557i = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.dnv);
        this.f218558m = (com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15540x683732f0) findViewById(com.p314xaae8f345.mm.R.id.g7x);
        this.f218560o = findViewById(com.p314xaae8f345.mm.R.id.g7u);
        this.f218559n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dod);
        this.f218561p = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dno);
        android.content.Intent intent = ((android.app.Activity) getContext()).getIntent();
        int intExtra = intent.getIntExtra("check_alive_type", 4);
        if (intExtra == 1) {
            this.f218568w = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "biz choose REFLECTION");
            this.D = 2;
            i18 = intExtra;
        } else if (intExtra == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX");
            wz2.f fVar = wz2.e.f532303a;
            fVar.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            wz2.d dVar = fVar.f532305b;
            float f17 = dVar != null ? dVar.f532302d : -1.0f;
            if (fVar.f532306c && (sensorManager = fVar.f532304a) != null) {
                fVar.f532306c = false;
                sensorManager.unregisterListener(dVar);
            }
            if (f17 < intent.getFloatExtra("mLight_threshold", -1.0f)) {
                this.f218568w = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE;
                this.D = 5;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX  REFLECTION");
                i18 = 1;
            } else {
                this.f218568w = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE;
                this.D = 6;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX  READ_NUMBER");
            }
        } else if (intExtra != 4) {
            this.f218568w = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE;
            this.D = 3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "biz choose READ_NUMBER");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX  ACTREFLECT");
            this.f218568w = ytSDKKitFrameworkWorkMode;
            this.D = 4;
            i18 = 4;
        }
        vz2.c.b().f137713e = this.D;
        tz2.u a17 = tz2.f.a(i18);
        this.f218565t = a17;
        a17.c(intent, (android.app.Activity) getContext());
        jVar.a(intent, i18);
        this.L = intent.getStringExtra("business_tips");
        this.M = intent.getStringExtra("business_tips_color");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "face detect type:%s  after type:%s topTip: %s, topTipColor: %s", this.f218568w, java.lang.Integer.valueOf(i18), this.L, this.M);
        if (android.text.TextUtils.isEmpty(this.L)) {
            this.f218554f.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f218553e.getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.topMargin = i65.a.b(getContext(), 100);
            this.f218553e.setLayoutParams(layoutParams);
        } else {
            this.f218554f.setText(this.L);
            if (!android.text.TextUtils.isEmpty(this.M)) {
                this.f218554f.setTextColor(android.graphics.Color.parseColor(this.M));
            }
            this.f218554f.setVisibility(4);
        }
        this.f218552d.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f = com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManager", "faceReflectMask post faceTipTextView.getHeight(): %d, top: %d ", java.lang.Integer.valueOf(textureViewSurfaceTextureListenerC15528xde21bc5f.f218553e.getHeight()), java.lang.Integer.valueOf(textureViewSurfaceTextureListenerC15528xde21bc5f.f218553e.getTop()));
                textureViewSurfaceTextureListenerC15528xde21bc5f.f218552d.m63488x98ef2439(textureViewSurfaceTextureListenerC15528xde21bc5f.f218553e.getTop() + textureViewSurfaceTextureListenerC15528xde21bc5f.f218553e.getHeight() + i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 24));
                textureViewSurfaceTextureListenerC15528xde21bc5f.f218552d.invalidate();
                textureViewSurfaceTextureListenerC15528xde21bc5f.d();
            }
        });
        f(this.f218553e, i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f81501xf4eda2fd));
        this.f218555g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0) findViewById(com.p314xaae8f345.mm.R.id.g7v);
        this.f218567v = new sz2.b(getContext());
    }
}
