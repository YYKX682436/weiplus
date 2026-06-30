package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton */
/* loaded from: classes10.dex */
public class C16551xff789360 extends android.widget.FrameLayout {
    public static final int M = android.view.ViewConfiguration.getTapTimeout();
    public static final float N = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a5z) / com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a5y);
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.i0 A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.g0 B;
    public android.graphics.drawable.Drawable C;
    public android.graphics.drawable.Drawable D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f230726J;
    public final java.lang.Runnable K;
    public final java.lang.Runnable L;

    /* renamed from: d, reason: collision with root package name */
    public long f230727d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f230728e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f230729f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f230730g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16550xff5236a f230731h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f230732i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f230733m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f230734n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f230735o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f230736p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f230737q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.ValueAnimator f230738r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.ValueAnimator f230739s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f230740t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f230741u;

    /* renamed from: v, reason: collision with root package name */
    public int f230742v;

    /* renamed from: w, reason: collision with root package name */
    public final int f230743w;

    /* renamed from: x, reason: collision with root package name */
    public final int f230744x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.j0 f230745y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0 f230746z;

    public C16551xff789360(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f230727d = -1L;
        this.f230732i = false;
        this.f230733m = false;
        this.f230734n = false;
        this.f230735o = false;
        this.f230741u = false;
        this.f230743w = -1;
        this.f230744x = -2130706433;
        this.E = -1.0f;
        this.F = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f230726J = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.K = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.d0(this);
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e0(this);
        e();
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360 c16551xff789360) {
        if (c16551xff789360.I) {
            if (c16551xff789360.f230732i) {
                c16551xff789360.f230732i = false;
                c16551xff789360.f230746z.c();
                return;
            }
            c16551xff789360.f230732i = true;
            c16551xff789360.j(null);
            c16551xff789360.f230734n = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0 h0Var = c16551xff789360.f230746z;
            if (h0Var != null) {
                h0Var.a();
            }
        }
    }

    public void c() {
        if (!this.I) {
            this.f230731h.a();
            this.f230731h.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16550xff5236a c16550xff5236a = this.f230731h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e2 e2Var = c16550xff5236a.f230722w;
        if (e2Var != null) {
            e2Var.f230852g = false;
            e2Var.f230849d = 0L;
            c16550xff5236a.f230722w = null;
        }
        if (c16550xff5236a.f230716q > 0.0f) {
            java.util.ArrayList arrayList = c16550xff5236a.f230724y;
            if ((arrayList.size() > 0 && c16550xff5236a.f230716q > ((java.lang.Float) arrayList.get(arrayList.size() - 1)).floatValue()) || arrayList.size() == 0) {
                arrayList.add(java.lang.Float.valueOf(c16550xff5236a.f230716q));
            }
        }
        c16550xff5236a.invalidate();
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "hideProgressBar");
        android.view.View view = this.f230730g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "init, longPressTimeout: %s, tapTimeout: %s", 500, java.lang.Integer.valueOf(M));
        this.C = getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.apc);
        this.D = getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.apd);
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c1w, (android.view.ViewGroup) this, true);
        this.f230728e = findViewById(com.p314xaae8f345.mm.R.id.f566876hd2);
        this.f230729f = findViewById(com.p314xaae8f345.mm.R.id.kn_);
        this.f230730g = findViewById(com.p314xaae8f345.mm.R.id.lbl);
        this.f230731h = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16550xff5236a) findViewById(com.p314xaae8f345.mm.R.id.bwr);
        this.f230728e.setBackgroundDrawable(this.C);
        this.f230729f.setBackgroundDrawable(this.D);
        this.F = true;
    }

    public void f() {
        setClipChildren(false);
        this.F = true;
        this.f230728e.setScaleX(1.0f);
        this.f230728e.setScaleY(1.0f);
        this.f230729f.setScaleX(1.0f);
        this.f230729f.setScaleY(1.0f);
        android.view.View view = this.f230730g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c();
        this.f230731h.a();
    }

    public final void g(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f230735o = true;
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f230740t;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f230740t = null;
        }
        android.view.ViewPropertyAnimator scaleY = this.f230728e.animate().scaleX(1.0f).scaleY(1.0f);
        this.f230740t = scaleY;
        scaleY.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.b0(this, animatorListenerAdapter)).setDuration(150L).start();
        this.f230729f.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        android.animation.ValueAnimator valueAnimator = this.f230739s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(this.C, "color", this.f230744x, this.f230743w);
        this.f230739s = ofInt;
        ofInt.setDuration(150L);
        android.animation.ValueAnimator valueAnimator2 = this.f230739s;
        android.animation.ArgbEvaluator argbEvaluator = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.b.f230825a;
        valueAnimator2.setEvaluator(argbEvaluator);
        this.f230739s.start();
        if (this.f230742v != 0) {
            android.animation.ValueAnimator valueAnimator3 = this.f230738r;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            android.animation.ObjectAnimator ofInt2 = android.animation.ObjectAnimator.ofInt(this.D, "color", 0, this.f230742v);
            this.f230738r = ofInt2;
            ofInt2.setDuration(150L);
            this.f230738r.setEvaluator(argbEvaluator);
            this.f230738r.start();
        }
    }

    /* renamed from: getSubProgress */
    public java.util.List<java.lang.Float> m66969xec84eb57() {
        return this.f230731h.m66961xec84eb57();
    }

    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "showLoading");
        android.view.View view = this.f230730g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mmsight/ui/MMSightRecordButton", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void i(int i17, int i18, int i19, int i27, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.x xVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MMSightRecordButton", "startProgress, initProgress: %s, maxProgress: %s, duration: %s, callback: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), xVar);
        this.f230732i = true;
        this.f230731h.m66965xe2ae08df(i17);
        this.f230731h.m66966xadb2e1ef(i18);
        this.f230731h.m66963xffd6ec16(i19);
        if (!this.I) {
            this.f230731h.setVisibility(0);
        }
        this.f230731h.m66962xe2eba6c2(i27);
        this.f230731h.m66967x61e5c614(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z(this, xVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16550xff5236a c16550xff5236a = this.f230731h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "start, initProgress: %s, maxProgress: %s, duration: %s currentProgress:%s", java.lang.Integer.valueOf(c16550xff5236a.f230717r), java.lang.Integer.valueOf(c16550xff5236a.f230718s), java.lang.Integer.valueOf(c16550xff5236a.f230719t), java.lang.Float.valueOf(c16550xff5236a.f230716q));
        c16550xff5236a.f230720u = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e2 e2Var = c16550xff5236a.f230722w;
        if (e2Var != null) {
            e2Var.f230852g = false;
            e2Var.f230849d = 0L;
            c16550xff5236a.f230722w = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e2 e2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e2(c16550xff5236a.f230716q, c16550xff5236a.f230718s, c16550xff5236a.f230719t);
        c16550xff5236a.f230722w = e2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.w(c16550xff5236a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProgressHandlerAnimator", "setAnimationCallback: %s", wVar);
        e2Var2.f230853h = wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e2 e2Var3 = c16550xff5236a.f230722w;
        e2Var3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProgressHandlerAnimator", "Start");
        e2Var3.f230852g = true;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        e2Var3.f230849d = android.os.SystemClock.elapsedRealtime();
        e2Var3.f230846a.c(20L, 20L);
    }

    public final void j(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f230735o = true;
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f230736p;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f230736p = null;
        }
        android.view.ViewPropertyAnimator scaleY = this.f230728e.animate().scaleX(0.5f).scaleY(0.5f);
        this.f230736p = scaleY;
        scaleY.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a0(this, animatorListenerAdapter)).setDuration(150L).start();
        android.view.ViewPropertyAnimator viewPropertyAnimator2 = this.f230737q;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            this.f230737q = null;
        }
        android.view.ViewPropertyAnimator animate = this.f230729f.animate();
        float f17 = N;
        android.view.ViewPropertyAnimator scaleY2 = animate.scaleX(f17).scaleY(f17);
        this.f230737q = scaleY2;
        scaleY2.setDuration(150L).start();
        if (this.f230742v != 0) {
            android.animation.ValueAnimator valueAnimator = this.f230738r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(this.D, "color", this.f230742v, 0);
            this.f230738r = ofInt;
            ofInt.setDuration(150L);
            this.f230738r.setEvaluator(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.b.f230825a);
            this.f230738r.start();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f230739s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        android.animation.ObjectAnimator ofInt2 = android.animation.ObjectAnimator.ofInt(this.C, "color", this.f230743w, this.f230744x);
        this.f230739s = ofInt2;
        ofInt2.setDuration(150L);
        this.f230739s.setEvaluator(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.b.f230825a);
        this.f230739s.start();
    }

    public void k() {
        if (!this.f230732i || this.f230741u) {
            return;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        onTouchEvent(obtain);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0 != 3) goto L64;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16551xff789360.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setErrorPressCallback */
    public void m66970x27310482(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.g0 g0Var) {
        this.B = g0Var;
    }

    /* renamed from: setHighLightOuter */
    public void m66971x4b4a8549(int i17) {
        this.f230742v = i17;
        android.graphics.drawable.Drawable drawable = this.D;
        if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i17);
        }
    }

    /* renamed from: setInnerColor */
    public void m66972x4bef7caf(int i17) {
        android.graphics.drawable.Drawable drawable = this.C;
        if (drawable instanceof android.graphics.drawable.GradientDrawable) {
            ((android.graphics.drawable.GradientDrawable) drawable).setColor(i17);
        }
    }

    /* renamed from: setLongPressCallback */
    public void m66973x86d19c4a(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0 h0Var) {
        this.f230746z = h0Var;
    }

    /* renamed from: setLongPressScrollCallback */
    public void m66974x7f8af277(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.i0 i0Var) {
        this.A = i0Var;
    }

    /* renamed from: setSimpleTapCallback */
    public void m66975xee2457b4(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.j0 j0Var) {
        this.f230745y = j0Var;
    }

    /* renamed from: setTouchEnable */
    public void m66976xbc91ffe0(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "setTouchEnable: %s", java.lang.Boolean.valueOf(z17));
        this.F = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecordButton", "setVisibility, isAnimating: %s", java.lang.Boolean.valueOf(this.f230735o));
        if (this.f230735o) {
            postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.c0(this, i17), 150L);
        } else {
            super.setVisibility(i17);
        }
    }

    public C16551xff789360(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230727d = -1L;
        this.f230732i = false;
        this.f230733m = false;
        this.f230734n = false;
        this.f230735o = false;
        this.f230741u = false;
        this.f230743w = -1;
        this.f230744x = -2130706433;
        this.E = -1.0f;
        this.F = true;
        this.G = false;
        this.H = false;
        this.I = false;
        this.f230726J = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.K = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.d0(this);
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e0(this);
        e();
    }
}
