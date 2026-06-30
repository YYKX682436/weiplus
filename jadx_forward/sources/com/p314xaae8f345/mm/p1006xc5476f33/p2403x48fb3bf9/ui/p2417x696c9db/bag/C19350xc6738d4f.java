package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.bag.WebViewBag */
/* loaded from: classes8.dex */
public class C19350xc6738d4f extends android.widget.FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final int f265500v = ((i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) - gx4.e.f358944b) - gx4.e.f358946d) - gx4.e.f358947e;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager f265501d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f265502e;

    /* renamed from: f, reason: collision with root package name */
    public gx4.k f265503f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f265504g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19351x7c5612b9 f265505h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f265506i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f265507m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.PointF f265508n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Point f265509o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Point f265510p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Point f265511q;

    /* renamed from: r, reason: collision with root package name */
    public long f265512r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Point f265513s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f265514t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f265515u;

    public C19350xc6738d4f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f265508n = new android.graphics.PointF();
        this.f265509o = new android.graphics.Point();
        this.f265510p = new android.graphics.Point();
        this.f265511q = new android.graphics.Point();
        this.f265515u = new gx4.j(this);
        this.f265501d = (android.view.WindowManager) context.getSystemService("window");
        this.f265507m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f265513s = new android.graphics.Point(i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d9r, this);
        this.f265504g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h5n);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19351x7c5612b9 c19351x7c5612b9 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19351x7c5612b9) findViewById(com.p314xaae8f345.mm.R.id.agc);
        this.f265505h = c19351x7c5612b9;
        this.f265506i = findViewById(com.p314xaae8f345.mm.R.id.m7g);
        c19351x7c5612b9.m74426xbd13ee23(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aag));
        c19351x7c5612b9.m74425x8e1ea844(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaf));
    }

    public void b(int i17, int i18, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19351x7c5612b9 c19351x7c5612b9 = this.f265505h;
        c19351x7c5612b9.f265526q = false;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBagBgView", "setAngryInfo:%d now:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
        c19351x7c5612b9.f265520h = i17;
        c19351x7c5612b9.f265519g = i18;
        c19351x7c5612b9.f265521i = j17;
        c19351x7c5612b9.a(currentTimeMillis);
        if (j17 > currentTimeMillis) {
            c19351x7c5612b9.postDelayed(new gx4.l(c19351x7c5612b9), j17 - currentTimeMillis);
        } else {
            c19351x7c5612b9.f265526q = true;
        }
        c19351x7c5612b9.invalidate();
    }

    public final void c(int i17, int i18) {
        android.view.WindowManager windowManager = this.f265501d;
        if (windowManager != null) {
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
            layoutParams.x = i17;
            layoutParams.y = i18;
            try {
                windowManager.updateViewLayout(this, layoutParams);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewBag", th6, "", new java.lang.Object[0]);
            }
        }
    }

    public void d() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(100L);
        animationSet.restrictDuration(150L);
        animationSet.setFillAfter(true);
        this.f265506i.startAnimation(animationSet);
    }

    /* renamed from: getLastTouchDownViewPos */
    public android.graphics.Point m74421x44c9dcda() {
        return this.f265509o;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBag", "onConfigurationChanged orientation:%d", java.lang.Integer.valueOf(configuration.orientation));
        android.graphics.Point point = this.f265513s;
        point.x = i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        point.y = i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        gx4.d dVar;
        boolean z17;
        float rawX;
        float rawY;
        float f17;
        if (!this.f265514t) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        android.graphics.Point point = this.f265509o;
        android.graphics.PointF pointF = this.f265508n;
        if (action != 0) {
            android.graphics.Point point2 = this.f265513s;
            if (action != 1) {
                if (action == 2) {
                    c((int) java.lang.Math.max(java.lang.Math.min((point.x + motionEvent.getRawX()) - pointF.x, point2.x), 0.0f), (int) java.lang.Math.max(java.lang.Math.min((point.y + motionEvent.getRawY()) - pointF.y, point2.y), 0.0f));
                }
            } else if (java.lang.Math.abs(motionEvent.getRawX() - pointF.x) >= com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 3.0f) || java.lang.Math.abs(motionEvent.getRawY() - pointF.y) >= com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 3.0f)) {
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                android.graphics.Point point3 = this.f265510p;
                point3.x = (int) java.lang.Math.max(java.lang.Math.min((point.x + rawX2) - pointF.x, point2.x), 0.0f);
                point3.y = (int) java.lang.Math.max(java.lang.Math.min((point.y + rawY2) - pointF.y, point2.y), 0.0f);
                int width = point3.x + (getWidth() / 2);
                int i17 = point2.x;
                int i18 = i17 / 2;
                android.graphics.Point point4 = this.f265511q;
                if (width <= i18) {
                    point4.x = gx4.e.f358947e;
                } else {
                    point4.x = (i17 - getWidth()) - gx4.e.f358947e;
                }
                int i19 = point3.y;
                point4.y = i19;
                if (i19 == 0) {
                    point4.y = gx4.e.f358947e;
                } else {
                    int i27 = f265500v;
                    if (i19 > i27) {
                        point4.y = i27;
                    }
                }
                this.f265512r = java.lang.System.currentTimeMillis();
                this.f265507m.mo50297x7c4d7ca2(this.f265515u, 5L);
                gx4.k kVar = this.f265503f;
                if (kVar != null) {
                    int i28 = point4.x;
                    int i29 = point4.y;
                    gx4.t tVar = ((gx4.q) kVar).f358964a;
                    tVar.k(19);
                    gx4.s sVar = tVar.f358980h;
                    sVar.f358970e = i28;
                    sVar.f358969d = i29;
                    sVar.a();
                }
            } else {
                android.view.View.OnClickListener onClickListener = this.f265502e;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
            }
        } else {
            pointF.x = motionEvent.getRawX();
            pointF.y = motionEvent.getRawY();
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
            point.x = layoutParams.x;
            point.y = layoutParams.y;
        }
        gx4.k kVar2 = this.f265503f;
        if (kVar2 != null && (dVar = ((gx4.q) kVar2).f358964a.f358977e) != null) {
            float rawX3 = motionEvent.getRawX();
            float rawY3 = motionEvent.getRawY();
            int action2 = motionEvent.getAction();
            android.graphics.PointF pointF2 = dVar.f358937d;
            if (action2 == 0) {
                pointF2.x = rawX3;
                pointF2.y = rawY3;
                dVar.f358936c = false;
                dVar.f358938e = false;
            } else if (action2 == 1) {
                if (dVar.f358938e) {
                    gx4.t tVar2 = ((gx4.p) dVar.f358935b).f358963a;
                    tVar2.k(17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.bag.C19350xc6738d4f c19350xc6738d4f = tVar2.f358976d;
                    android.graphics.Point m74421x44c9dcda = c19350xc6738d4f != null ? c19350xc6738d4f.m74421x44c9dcda() : null;
                    tVar2.j();
                    if (m74421x44c9dcda != null) {
                        int i37 = m74421x44c9dcda.x;
                        gx4.s sVar2 = tVar2.f358980h;
                        sVar2.f358970e = i37;
                        sVar2.f358969d = m74421x44c9dcda.y;
                        sVar2.a();
                    }
                } else if (dVar.f358939f) {
                    dVar.f358939f = false;
                    gx4.b bVar = dVar.f358934a;
                    bVar.getClass();
                    float f18 = gx4.e.f358949g;
                    android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, f18, 0.0f, f18);
                    android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                    android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
                    animationSet.addAnimation(alphaAnimation);
                    animationSet.addAnimation(translateAnimation);
                    animationSet.setDuration(300L);
                    animationSet.setAnimationListener(new gx4.a(bVar));
                    bVar.f358930d.startAnimation(animationSet);
                    bVar.f358931e.startAnimation(animationSet);
                }
                dVar.f358936c = false;
                dVar.f358938e = false;
            } else if (action2 == 2) {
                if (dVar.f358936c) {
                    z17 = true;
                } else {
                    float f19 = rawX3 - pointF2.x;
                    float f27 = rawY3 - pointF2.y;
                    z17 = ((f19 * f19) + (f27 * f27)) - 900.0f > 0.0f;
                    dVar.f358936c = z17;
                }
                if (z17) {
                    if (!dVar.f358939f) {
                        int c17 = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BagIndicatorController", "getNavigationBarHeight height:%d", java.lang.Integer.valueOf(c17));
                        gx4.e.f358943a = c17;
                        dVar.f358939f = true;
                        dVar.f358941h = i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        int k17 = i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        dVar.f358940g = k17;
                        boolean z18 = dVar.f358941h > k17;
                        dVar.f358942i = z18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BagCancelController", "updateOrientation mIsLandScape:%b", java.lang.Boolean.valueOf(z18));
                        gx4.b bVar2 = dVar.f358934a;
                        bVar2.setVisibility(0);
                        float f28 = gx4.e.f358949g;
                        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(f28, 0.0f, f28, 0.0f);
                        translateAnimation2.setFillAfter(true);
                        translateAnimation2.setDuration(200L);
                        bVar2.f358930d.startAnimation(translateAnimation2);
                        bVar2.f358931e.startAnimation(translateAnimation2);
                    }
                    boolean z19 = dVar.f358938e;
                    if (dVar.f358942i) {
                        rawX = (dVar.f358941h - motionEvent.getRawX()) - gx4.e.f358943a;
                        rawY = dVar.f358940g;
                        f17 = motionEvent.getRawY();
                    } else {
                        rawX = dVar.f358941h - motionEvent.getRawX();
                        rawY = dVar.f358940g - motionEvent.getRawY();
                        f17 = gx4.e.f358943a;
                    }
                    float f29 = rawY - f17;
                    if ((rawX * rawX) + (f29 * f29) < gx4.d.f358933j) {
                        dVar.f358938e = true;
                    } else {
                        dVar.f358938e = false;
                    }
                    boolean z27 = dVar.f358938e;
                    if (z27 != z19) {
                        gx4.b bVar3 = dVar.f358934a;
                        bVar3.getClass();
                        if (z27) {
                            bVar3.a(1.0f, gx4.e.f358950h);
                            android.os.Vibrator vibrator = bVar3.f358932f;
                            if (vibrator != null) {
                                vibrator.vibrate(10L);
                            }
                        } else {
                            bVar3.a(gx4.e.f358950h, 1.0f);
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: setIcon */
    public void m74422x764b6bfb(java.lang.String str) {
        o11.f fVar = new o11.f();
        fVar.f423629t = true;
        fVar.f423611b = true;
        fVar.f423616g = g83.a.a();
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f81398xce7f1214;
        n11.a.b().h(str, this.f265504g, fVar.a());
    }

    /* renamed from: setListener */
    public void m74423xc6cf6336(gx4.k kVar) {
        this.f265503f = kVar;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f265502e = onClickListener;
    }

    /* renamed from: setTouchEnable */
    public void m74424xbc91ffe0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBag", "setTouchEnable enable:%b", java.lang.Boolean.valueOf(z17));
        this.f265514t = z17;
    }
}
