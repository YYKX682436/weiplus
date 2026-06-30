package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* renamed from: com.tencent.mm.ui.chatting.ChattingAnimFrame */
/* loaded from: classes15.dex */
public class C21614x5c06ae16 extends android.widget.FrameLayout implements xn5.a0 {
    public static java.lang.String W = "";
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public android.view.animation.Interpolator I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.animation.Interpolator f279722J;
    public int K;
    public int L;
    public android.animation.ValueAnimator M;
    public final android.animation.ValueAnimator.AnimatorUpdateListener N;
    public final android.animation.Animator.AnimatorListener P;
    public boolean Q;
    public f21.e R;
    public d12.b S;
    public android.animation.ObjectAnimator T;
    public final android.view.View.OnClickListener U;
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.b3 V;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f279723d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f279724e;

    /* renamed from: f, reason: collision with root package name */
    public int f279725f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f279726g;

    /* renamed from: h, reason: collision with root package name */
    public int f279727h;

    /* renamed from: i, reason: collision with root package name */
    public int f279728i;

    /* renamed from: m, reason: collision with root package name */
    public int f279729m;

    /* renamed from: n, reason: collision with root package name */
    public int f279730n;

    /* renamed from: o, reason: collision with root package name */
    public int f279731o;

    /* renamed from: p, reason: collision with root package name */
    public int f279732p;

    /* renamed from: q, reason: collision with root package name */
    public int f279733q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f279734r;

    /* renamed from: s, reason: collision with root package name */
    public int f279735s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.ArrayList f279736t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f279737u;

    /* renamed from: v, reason: collision with root package name */
    public int f279738v;

    /* renamed from: w, reason: collision with root package name */
    public int f279739w;

    /* renamed from: x, reason: collision with root package name */
    public final float f279740x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f279741y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f279742z;

    public C21614x5c06ae16(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279724e = new java.util.ArrayList();
        this.f279725f = 0;
        this.f279731o = 30;
        this.f279732p = 30;
        this.f279733q = 40;
        this.f279734r = false;
        this.f279735s = 0;
        this.f279736t = new java.util.ArrayList();
        this.f279740x = 0.2f;
        this.N = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.q2(this);
        this.P = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.r2(this);
        this.U = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.t2(this);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.f279723d = frameLayout;
        addView(frameLayout);
        this.f279729m = i65.a.k(getContext());
        this.f279730n = i65.a.B(getContext());
        this.f279738v = i65.a.b(getContext(), 60);
        this.f279739w = i65.a.b(getContext(), 80);
    }

    public static float a(float f17, float f18) {
        return f17 + (((float) java.lang.Math.random()) * (f18 - f17));
    }

    /* renamed from: getDataEmojiPath */
    private static java.lang.String m79396xb647b14b() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W)) {
            W = lp0.b.h();
            W += "/emoji";
        }
        return W;
    }

    public void b() {
        java.lang.String str;
        f21.e eVar = this.R;
        f21.d dVar = eVar.f340415r;
        if (dVar != null) {
            f21.h0 h0Var = dVar.f340383g;
            this.K = h0Var.f340440e;
            this.L = i65.a.b(getContext(), (int) a(h0Var.f340442g, h0Var.f340443h));
            str = h0Var.f340439d;
        } else {
            f21.i iVar = eVar.f340416s;
            if (iVar != null) {
                f21.h0 h0Var2 = iVar.f340445e;
                this.K = h0Var2.f340440e;
                this.L = i65.a.b(getContext(), (int) a(h0Var2.f340442g, h0Var2.f340443h));
                str = h0Var2.f340439d;
            } else {
                f21.e0 e0Var = eVar.f340412o.f340402x;
                this.K = e0Var.f340422e;
                this.L = i65.a.b(getContext(), e0Var.f340423f);
                str = e0Var.f340421d;
            }
        }
        int i17 = this.L;
        this.f279738v = i17;
        this.f279739w = i17;
        this.A = 0.0f;
        float f17 = this.f279730n;
        this.B = f17;
        this.C = 0.0f;
        float f18 = this.f279729m;
        this.D = f18;
        float f19 = 0.9f - ((i17 * 1.0f) / f17);
        float f27 = ((-i17) * 1.1f) / f18;
        this.f279722J = new android.view.animation.LinearInterpolator();
        int i18 = this.K;
        if (i18 == 1) {
            float a17 = a(0.1f, f19);
            this.A = a17;
            float a18 = a(a17 - 0.25f, a17 + 0.25f);
            this.B = a18;
            this.B = java.lang.Math.max(0.1f, java.lang.Math.min(a18, f19));
            this.C = 1.0f;
            this.D = f27;
        } else if (i18 == 2) {
            float a19 = a(0.1f, f19);
            this.A = a19;
            float a27 = a(a19 - 0.25f, a19 + 0.25f);
            this.B = a27;
            this.B = java.lang.Math.max(0.1f, java.lang.Math.min(a27, f19));
            this.C = f27;
            this.D = 1.0f;
            this.f279722J = new ta5.a();
        } else if (i18 == 3) {
            float a28 = a(0.1f, f19);
            this.A = a28;
            float a29 = a(a28 - 0.25f, a28 + 0.25f);
            this.B = a29;
            this.B = java.lang.Math.max(0.1f, java.lang.Math.min(a29, f19));
            this.C = 1.5f;
            this.D = a(0.25f, 0.55f);
            this.f279722J = new ta5.b(0.5f);
        } else if (i18 != 4) {
            float a37 = a(0.1f, f19);
            this.A = a37;
            float a38 = a(a37 - 0.5f, a37 + 0.5f);
            this.B = a38;
            this.B = java.lang.Math.max(0.1f, java.lang.Math.min(a38, f19));
            this.C = f27;
            this.D = 1.0f;
        } else {
            float a39 = a(f27, 1.0f - ((this.L * 1.0f) / this.f279728i));
            this.A = 1.0f;
            this.B = 0.0f - ((this.L * 1.0f) / this.f279730n);
            this.C = a39;
            this.D = a39;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "luckyBag, s[%s] e[%s].", java.lang.Float.valueOf(this.A), java.lang.Float.valueOf(this.B));
        float f28 = this.f279730n;
        float f29 = this.A * f28;
        this.E = f29;
        this.F = f28 * this.B;
        float f37 = this.f279729m;
        float f38 = this.C;
        this.G = f37 * f38;
        float f39 = this.D;
        this.H = f37 * f39;
        if (this.K == 4) {
            float f47 = this.f279728i;
            this.G = f38 * f47;
            this.H = f47 * f39;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "luckyBag, init: startX[%s] endX[%s] startY[%s] endY[%s].", java.lang.Float.valueOf(f29), java.lang.Float.valueOf(this.F), java.lang.Float.valueOf(this.G), java.lang.Float.valueOf(this.H));
        if (this.f279737u == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = new com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366(getContext(), null);
            this.f279737u = c16077xb54fe366;
            c16077xb54fe366.setOnClickListener(this.U);
        }
        this.f279737u.setPivotX(this.f279738v / 2.0f);
        this.f279737u.setPivotY(this.f279739w / 2.0f);
        this.f279737u.setRotation(0.0f);
        this.f279737u.m64938x75cc54fa(m79396xb647b14b() + "/egg/" + str);
        this.f279737u.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.f279738v, this.f279739w));
        this.f279737u.setX(this.E);
        this.f279737u.setY(this.G);
        int a47 = (int) a(7000.0f, 10000.0f);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.M = ofFloat;
        ofFloat.setDuration(a47);
        this.M.setInterpolator(new android.view.animation.LinearInterpolator());
        this.M.addUpdateListener(this.N);
        this.M.setStartDelay(1500L);
        this.M.addListener(this.P);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f279737u, (android.util.Property<com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366, java.lang.Float>) android.view.View.ROTATION, 0.0f, 15.0f, -15.0f, 15.0f, -15.0f, 0.0f);
        this.T = ofFloat2;
        ofFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.T.setDuration(500L);
        this.T.setRepeatCount(1);
        this.f279741y = false;
        this.f279742z = false;
    }

    public boolean c(f21.e eVar) {
        java.util.List list;
        int i17;
        double abs;
        double d17;
        long j17;
        e();
        boolean z17 = false;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingAnimFrame", "egg info is null. ignore.");
            return false;
        }
        java.util.LinkedList linkedList = eVar.f340413p;
        int size = linkedList.size();
        if (size <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingAnimFrame", "no anim!!!");
            return false;
        }
        f21.h0 h0Var = (f21.h0) linkedList.get(1 != size ? new java.util.Random().nextInt(size) : 0);
        java.lang.String str = m79396xb647b14b() + "/egg/" + h0Var.f340439d;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingAnimFrame", "egg file isn't exist. ignore");
            return false;
        }
        this.R = eVar;
        setVisibility(0);
        int i18 = 3;
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9.d(eVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1263, 3);
        }
        int i19 = h0Var.f340441f;
        if (i19 > 0) {
            this.f279731o = i19;
            if (i19 > 60) {
                this.f279731o = 60;
            }
        } else {
            this.f279731o = 30;
        }
        int i27 = h0Var.f340442g;
        if (i27 > 0) {
            this.f279732p = i27;
        } else {
            this.f279732p = 30;
        }
        int i28 = h0Var.f340443h;
        if (i28 > 0) {
            this.f279733q = i28;
        } else {
            this.f279733q = 40;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "Egg viewCount:%d minSize:%d maxSize:%d AnimType:%d reportType:%d", java.lang.Integer.valueOf(this.f279731o), java.lang.Integer.valueOf(this.f279732p), java.lang.Integer.valueOf(this.f279733q), java.lang.Integer.valueOf(h0Var.f340440e), java.lang.Integer.valueOf(eVar.f340407g));
        f21.l lVar = eVar.f340420w;
        if (lVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f340467g)) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f279726g;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.n();
                removeView(this.f279726g);
            }
            this.f279726g = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(getContext());
            boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20313x85eb58f4()) == 1;
            this.f279726g.o(z18);
            java.lang.String str2 = m79396xb647b14b() + "/egg/" + eVar.f340420w.f340467g;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 49;
            this.f279726g.m82581x764e93a7(str2);
            if (z18) {
                com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906(str2);
                layoutParams.height = (m77391x243906.m77365xb7389127() * ((android.view.ViewGroup) getParent()).getWidth()) / m77391x243906.m77368x6be2dc6();
            } else {
                org.p3363xbe4143f1.C29690xfae77312 m154716x243906 = org.p3363xbe4143f1.C29690xfae77312.m154716x243906(str2);
                layoutParams.height = (m154716x243906.m154680xb7389127() * ((android.view.ViewGroup) getParent()).getWidth()) / m154716x243906.m154689x6be2dc6();
            }
            addView(this.f279726g, 0, layoutParams);
            this.f279726g.g();
        }
        int i29 = this.f279731o;
        float f17 = 0.0f;
        if (i29 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingAnimFrame", "count is zero.");
        } else {
            int i37 = (int) (i29 * 0.1d);
            java.util.ArrayList arrayList = this.f279736t;
            if (arrayList != null) {
                arrayList.clear();
            } else {
                this.f279736t = new java.util.ArrayList();
            }
            while (this.f279736t.size() < i37) {
                int a17 = (int) a(0.0f, i29);
                if (!this.f279736t.contains(java.lang.Integer.valueOf(a17))) {
                    this.f279736t.add(java.lang.Integer.valueOf(a17));
                }
            }
        }
        long j18 = 0;
        int i38 = 0;
        while (true) {
            int i39 = this.f279731o;
            list = this.f279724e;
            if (i38 >= i39) {
                break;
            }
            int b17 = i65.a.b(getContext(), (int) a(this.f279732p, this.f279733q));
            long j19 = j18 + 500;
            int i47 = h0Var.f340440e;
            java.util.ArrayList arrayList2 = this.f279736t;
            int i48 = i38;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3 a3Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3(this, i47, b17, j19, (arrayList2 == null || !arrayList2.contains(java.lang.Integer.valueOf(i38))) ? z17 : true);
            com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = new com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366(getContext(), null);
            c16077xb54fe366.m64938x75cc54fa(str);
            c16077xb54fe366.setAnimation(a3Var);
            c16077xb54fe366.setLayerType(2, null);
            c16077xb54fe366.setVisibility(4);
            a3Var.f279894f = c16077xb54fe366;
            int i49 = a3Var.f279892d;
            c16077xb54fe366.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i49, i49));
            ((java.util.ArrayList) list).add(c16077xb54fe366);
            int i57 = this.f279725f + 1;
            this.f279725f = i57;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "addView counter++: [%s]. %s", java.lang.Integer.valueOf(i57), c16077xb54fe366);
            this.f279723d.addView(c16077xb54fe366);
            int i58 = h0Var.f340440e;
            int i59 = this.f279731o;
            if (i58 == 2) {
                i17 = i48;
                if (i17 < 2) {
                    j17 = 800;
                    j18 += j17;
                    i38 = i17 + 1;
                    z17 = false;
                    i18 = 3;
                    f17 = 0.0f;
                } else {
                    abs = java.lang.Math.abs((i17 - (i59 * 0.5d)) - 5.0d) / (i59 * 3);
                    d17 = 0.01d;
                }
            } else if (i58 != i18) {
                j18 = (int) (a(f17, 4.0f) * 1000.0f);
                i17 = i48;
                i38 = i17 + 1;
                z17 = false;
                i18 = 3;
                f17 = 0.0f;
            } else {
                i17 = i48;
                abs = java.lang.Math.abs((i17 - (i59 * 0.5d)) - 5.0d) / (i59 * 6);
                d17 = 0.06d;
            }
            j17 = (long) ((abs + d17) * 1000.0d);
            j18 += j17;
            i38 = i17 + 1;
            z17 = false;
            i18 = 3;
            f17 = 0.0f;
        }
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                android.view.View view = (android.view.View) it.next();
                if (view != null && (view.getAnimation() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3)) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3 a3Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3) view.getAnimation();
                    a3Var2.setStartOffset(a3Var2.f279893e);
                    a3Var2.start();
                }
            }
        }
        return true;
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = this.f279737u;
        if (c16077xb54fe366 == null || !this.Q) {
            return;
        }
        c16077xb54fe366.y();
        this.f279723d.removeView(this.f279737u);
        this.Q = false;
        this.S = null;
        android.animation.ValueAnimator valueAnimator = this.M;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.M = null;
        }
        android.animation.ObjectAnimator objectAnimator = this.T;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.T = null;
        }
        this.f279737u.setRotation(0.0f);
    }

    public void e() {
        java.util.List list = this.f279724e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "stop: view: %s, count:%s", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), java.lang.Integer.valueOf(this.f279725f));
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) it.next();
            c16077xb54fe366.clearAnimation();
            c16077xb54fe366.t();
            this.f279723d.removeView(c16077xb54fe366);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "stop: remove view %s", c16077xb54fe366);
        }
        ((java.util.ArrayList) list).clear();
        d();
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f279726g;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.n();
            removeView(this.f279726g);
            this.f279726g = null;
        }
        this.f279725f = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "stop: end child count %s", java.lang.Integer.valueOf(getChildCount()));
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f279728i = getMeasuredHeight();
        this.f279727h = getMeasuredWidth();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = i27 - i18;
        this.f279728i = i28;
        int i29 = i19 - i17;
        this.f279727h = i29;
        int i37 = this.f279729m;
        if (i28 < i37) {
            this.f279734r = true;
            this.f279735s = i37 - i28;
        } else {
            this.f279734r = false;
            this.f279735s = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "onLayout width:%d height:%d isKeyBordUp:%b keyBordHeight:%d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(this.f279728i), java.lang.Boolean.valueOf(this.f279734r), java.lang.Integer.valueOf(this.f279735s));
    }

    /* renamed from: setOnLuckyBagClick */
    public void m79397xbc2a8507(com.p314xaae8f345.mm.ui.p2650x55bb7a46.b3 b3Var) {
        this.V = b3Var;
    }
}
