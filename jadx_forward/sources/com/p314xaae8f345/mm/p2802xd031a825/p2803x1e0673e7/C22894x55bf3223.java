package com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7;

/* renamed from: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard */
/* loaded from: classes9.dex */
public class C22894x55bf3223 extends android.widget.RelativeLayout {
    public static final /* synthetic */ int S = 0;
    public mp5.w A;
    public mp5.v B;
    public boolean C;
    public final boolean D;
    public java.lang.Runnable E;
    public android.animation.ObjectAnimator F;
    public android.animation.ObjectAnimator G;
    public mp5.u H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f295335J;
    public int K;
    public java.lang.String L;
    public wu5.c M;
    public android.view.inputmethod.InputConnection N;
    public final int P;
    public final int Q;
    public final int R;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f295336d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f295337e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f295338f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f295339g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f295340h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f295341i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f295342m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f295343n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f295344o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f295345p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f295346q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f295347r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f295348s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f295349t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f295350u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f295351v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f295352w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 f295353x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.EditText f295354y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f295355z;

    public C22894x55bf3223(android.content.Context context) {
        super(context);
        this.A = mp5.w.INIT_STATE;
        this.C = false;
        this.D = true;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = false;
        this.f295335J = null;
        this.K = 0;
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = 7;
        this.Q = 2;
        this.R = 7 + 2 + 2;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (((r4 - r2) - 1) >= r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r13 == 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004e, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 r12, int r13) {
        /*
            android.view.inputmethod.InputConnection r0 = r12.N
            if (r0 != 0) goto L6
            goto L9a
        L6:
            java.lang.String r0 = r12.m82973x5325305f()
            android.view.inputmethod.InputConnection r1 = r12.N
            int r2 = r12.R
            r3 = 0
            java.lang.CharSequence r1 = r1.getTextBeforeCursor(r2, r3)
            if (r1 != 0) goto L17
            r1 = r3
            goto L1b
        L17:
            int r1 = r1.length()
        L1b:
            java.lang.String r2 = "."
            int r2 = r0.indexOf(r2)
            int r4 = r0.length()
            int r5 = r12.Q
            r6 = 56
            r7 = 7
            r8 = 1
            r9 = 67
            if (r13 == r9) goto L68
            r10 = 66
            if (r13 == r10) goto L68
            if (r13 == r6) goto L68
            boolean r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r10 != 0) goto L68
            if (r2 < 0) goto L45
            if (r1 <= r2) goto L45
            int r10 = r4 - r2
            int r10 = r10 - r8
            if (r10 < r5) goto L50
            goto L4e
        L45:
            int r10 = r12.P
            if (r2 < 0) goto L4c
            if (r2 < r10) goto L50
            goto L4e
        L4c:
            if (r4 < r10) goto L50
        L4e:
            r10 = r3
            goto L51
        L50:
            r10 = r8
        L51:
            java.lang.String r11 = "0"
            boolean r11 = r0.startsWith(r11)
            if (r11 == 0) goto L69
            if (r1 != 0) goto L5e
            if (r13 != r7) goto L69
            goto L66
        L5e:
            if (r1 != r8) goto L69
            if (r13 != r7) goto L63
            goto L66
        L63:
            r12.m(r9, r13)
        L66:
            r10 = r3
            goto L69
        L68:
            r10 = r8
        L69:
            if (r13 != r6) goto L79
            if (r2 < 0) goto L6e
            goto L78
        L6e:
            int r6 = r4 - r1
            if (r6 <= r5) goto L73
            goto L78
        L73:
            if (r1 != 0) goto L79
            r12.m(r7, r13)
        L78:
            r10 = r3
        L79:
            if (r13 != r9) goto L94
            if (r2 < 0) goto L94
            if (r1 != r8) goto L83
            r12.m(r9, r7)
            r10 = r3
        L83:
            java.lang.String r2 = "0."
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L94
            r0 = 2
            if (r1 != r0) goto L94
            if (r4 <= r0) goto L94
            r12.m(r9, r9)
            goto L95
        L94:
            r3 = r10
        L95:
            if (r3 == 0) goto L9a
            r12.l(r13)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223.a(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getInputConnectionText */
    public java.lang.String m82973x5325305f() {
        android.view.inputmethod.InputConnection inputConnection = this.N;
        if (inputConnection == null) {
            return "";
        }
        int i17 = this.R;
        java.lang.CharSequence textBeforeCursor = inputConnection.getTextBeforeCursor(i17, 0);
        java.lang.CharSequence selectedText = this.N.getSelectedText(0);
        java.lang.CharSequence textAfterCursor = this.N.getTextAfterCursor(i17, 0);
        return (textBeforeCursor == null ? "" : textBeforeCursor.toString()) + (selectedText == null ? "" : selectedText.toString()) + (textAfterCursor != null ? textAfterCursor.toString() : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setWindowViewBottomMargin */
    public void m82974x98a9210(int i17) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f295355z.getLayoutParams();
        layoutParams.bottomMargin = i17;
        this.f295355z.setLayoutParams(layoutParams);
    }

    public void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        com.p314xaae8f345.mm.ui.C21390x7d9495e3 c21390x7d9495e3 = (com.p314xaae8f345.mm.ui.C21390x7d9495e3) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.jlt);
        c21390x7d9495e3.setBackgroundColor(i17);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        c21390x7d9495e3.addView(this, layoutParams);
        setVisibility(8);
        this.f295355z = c21390x7d9495e3.getChildAt(0);
        this.C = true;
    }

    public void e(boolean z17) {
        this.f295347r.setEnabled(z17);
        this.f295353x.setEnabled(z17);
        if (z17) {
            this.f295347r.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.baf);
            this.f295347r.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561085ab3));
        } else if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f295347r.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bag);
            this.f295347r.setTextColor(android.graphics.Color.parseColor("#347051"));
        } else {
            this.f295347r.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.baf);
            this.f295347r.setTextColor(android.graphics.Color.parseColor("#CDF2DF"));
        }
    }

    public final void f(boolean z17, boolean z18) {
        if (z17) {
            this.f295353x.setVisibility(0);
            com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 c22895xa563bc49 = this.f295353x;
            if (c22895xa563bc49.f295376z) {
                int[] iArr = new int[2];
                this.f295347r.getLocationOnScreen(iArr);
                this.f295351v.getLocationOnScreen(new int[2]);
                if (this.f295349t.isShown()) {
                    this.f295349t.getHeight();
                    i65.a.b(getContext(), 24);
                }
                this.f295348s.getHeight();
                i65.a.b(getContext(), 16);
                this.f295353x.b(this.f295347r.getWidth(), this.f295347r.getHeight(), i65.a.b(getContext(), 8), iArr[0]);
            } else {
                c22895xa563bc49.b(c22895xa563bc49.B, c22895xa563bc49.C, c22895xa563bc49.D, c22895xa563bc49.E);
            }
            this.f295353x.f295373w = ((java.lang.Object) this.f295347r.getText()) + "";
            this.f295347r.setVisibility(4);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mp5.s(this));
            return;
        }
        if (!z18) {
            com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 c22895xa563bc492 = this.f295353x;
            c22895xa563bc492.f295365o = i65.a.b(c22895xa563bc492.f295357d, 4);
            c22895xa563bc492.f295369s = c22895xa563bc492.f295364n;
            c22895xa563bc492.f295370t = c22895xa563bc492.f295363m;
            c22895xa563bc492.setTranslationX(c22895xa563bc492.getTranslationX() + c22895xa563bc492.f295366p);
            c22895xa563bc492.invalidate();
            this.f295353x.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 c22895xa563bc493 = this.f295353x;
        if (c22895xa563bc493.N == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c22895xa563bc493, "translationX", c22895xa563bc493.f295374x, c22895xa563bc493.f295375y);
            c22895xa563bc493.N = ofFloat;
            ofFloat.setDuration(c22895xa563bc493.f295371u);
            c22895xa563bc493.N.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        int i17 = c22895xa563bc493.f295367q;
        c22895xa563bc493.f295369s = i17;
        if (c22895xa563bc493.P == null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, c22895xa563bc493.f295364n);
            c22895xa563bc493.P = ofInt;
            ofInt.setDuration(c22895xa563bc493.f295372v);
            c22895xa563bc493.P.addUpdateListener(new mp5.a0(c22895xa563bc493));
        }
        c22895xa563bc493.A = false;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c22895xa563bc493.getLayoutParams();
        layoutParams.height = c22895xa563bc493.f295364n;
        c22895xa563bc493.setLayoutParams(layoutParams);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        c22895xa563bc493.Q = animatorSet;
        animatorSet.play(c22895xa563bc493.P).with(c22895xa563bc493.N);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mp5.t(this));
    }

    public void g(boolean z17) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_pay_keyboard_num_enable_close, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "[isKeyboardNumberEnableClose] switch %s", java.lang.Boolean.valueOf(fj6));
        if (!fj6 || z17) {
            t(this.f295345p, z17);
            t(this.f295336d, z17);
            t(this.f295337e, z17);
            t(this.f295338f, z17);
            t(this.f295339g, z17);
            t(this.f295340h, z17);
            t(this.f295341i, z17);
            t(this.f295342m, z17);
            t(this.f295343n, z17);
            t(this.f295344o, z17);
            t(this.f295346q, z17);
            t(this.f295348s, z17);
        }
    }

    /* renamed from: getEnterPayAmount */
    public java.lang.String m82975xb278e81e() {
        o05.j jVar;
        java.lang.String str = this.L;
        this.L = "";
        wu5.c cVar = this.M;
        if (cVar != null) {
            cVar.cancel(false);
            this.M = null;
        }
        mp5.u uVar = this.H;
        if (uVar != null && (jVar = ((ps4.f) uVar).f439683a) != null) {
            jVar.b(0, "#callpay");
        }
        return str;
    }

    /* renamed from: getInputEditText */
    public android.widget.EditText m82976x3b6b208b() {
        return this.f295354y;
    }

    /* renamed from: getTipsTv */
    public android.widget.TextView m82977x310592d0() {
        return this.f295349t;
    }

    public void h() {
        this.f295349t.setVisibility(8);
        s();
    }

    public void i() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(isShown());
        mp5.w wVar = this.A;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(n());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "hideWcKb() %s %s %s [%s]", valueOf, wVar, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        g(false);
        if (n() || this.A == mp5.w.INIT_STATE || !isShown()) {
            return;
        }
        if (q()) {
            j(true);
        }
        if (r()) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559458fd);
            loadAnimation.setAnimationListener(new mp5.c(this, true));
            this.f295353x.startAnimation(loadAnimation);
        }
    }

    public final void j(boolean z17) {
        if (this.C) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
            loadAnimation.setDuration(330L);
            loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            loadAnimation.setAnimationListener(new mp5.h(this, z17));
            this.f295352w.startAnimation(loadAnimation);
            m82974x98a9210(0);
            return;
        }
        int height = this.f295352w.getHeight();
        if (this.G == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f295352w, "translationY", 0.0f, height);
            this.G = ofFloat;
            ofFloat.setDuration(300L);
            this.G.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        this.G.removeAllListeners();
        this.G.addListener(new mp5.a(this, height, z17));
        this.G.removeAllUpdateListeners();
        this.G.addUpdateListener(new mp5.b(this, height));
        this.G.start();
    }

    public final void k() {
        if (this.D) {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d96, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d98, (android.view.ViewGroup) this, true);
        }
        this.f295352w = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f78274x82a1a429);
        this.f295345p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78261xb63921d8);
        this.f295336d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78262xb63921d9);
        this.f295337e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78263xb63921da);
        this.f295338f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78264xb63921db);
        this.f295339g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78265xb63921dc);
        this.f295340h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78266xb63921dd);
        this.f295341i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78267xb63921de);
        this.f295342m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78268xb63921df);
        this.f295343n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78269xb63921e0);
        this.f295344o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78270xb63921e1);
        this.f295346q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78288xc78dcf1);
        this.f295348s = findViewById(com.p314xaae8f345.mm.R.id.f78279xc78dbb3);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78271x5f31258e);
        this.f295347r = textView;
        if (textView == null) {
            this.f295347r = new android.widget.TextView(getContext());
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 c22895xa563bc49 = (com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49) findViewById(com.p314xaae8f345.mm.R.id.f78272xd9657ca9);
        this.f295353x = c22895xa563bc49;
        if (c22895xa563bc49 == null) {
            this.f295353x = new com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49(getContext());
        }
        this.f295349t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f78294x7fefcffe);
        this.f295350u = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f78295x883e5703);
        this.f295351v = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f78290x10eb203d);
        this.f295347r.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        this.f295347r.setTextSize(1, i65.a.q(getContext()) * 17.0f);
        mp5.k kVar = new mp5.k(this);
        this.f295352w.setOnClickListener(kVar);
        this.f295345p.setOnClickListener(kVar);
        this.f295336d.setOnClickListener(kVar);
        this.f295337e.setOnClickListener(kVar);
        this.f295338f.setOnClickListener(kVar);
        this.f295339g.setOnClickListener(kVar);
        this.f295340h.setOnClickListener(kVar);
        this.f295341i.setOnClickListener(kVar);
        this.f295342m.setOnClickListener(kVar);
        this.f295343n.setOnClickListener(kVar);
        this.f295344o.setOnClickListener(kVar);
        this.f295348s.setOnClickListener(kVar);
        this.f295346q.setOnClickListener(kVar);
        this.f295347r.setOnClickListener(kVar);
        this.f295353x.setOnClickListener(kVar);
        com.p314xaae8f345.mm.p2802xd031a825.e eVar = new com.p314xaae8f345.mm.p2802xd031a825.e();
        eVar.m82972xbdda0201(com.p314xaae8f345.p347x615374d.gen.EnumC3611x9c1951f.BUTTON);
        this.f295347r.setAccessibilityDelegate(eVar);
        this.f295348s.setAccessibilityDelegate(eVar);
    }

    public final void l(int i17) {
        android.view.inputmethod.InputConnection inputConnection = this.N;
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new android.view.KeyEvent(0, i17));
            this.N.sendKeyEvent(new android.view.KeyEvent(1, i17));
        }
    }

    public final void m(int i17, int i18) {
        if (this.N != null) {
            l(i17);
            postDelayed(new mp5.o(this, i18), 10L);
        }
    }

    public boolean n() {
        android.animation.ObjectAnimator objectAnimator = this.G;
        boolean isRunning = objectAnimator == null ? false : objectAnimator.isRunning();
        android.animation.ObjectAnimator objectAnimator2 = this.F;
        if (!(isRunning || (objectAnimator2 == null ? false : objectAnimator2.isRunning()))) {
            com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22895xa563bc49 c22895xa563bc49 = this.f295353x;
            android.animation.AnimatorSet animatorSet = c22895xa563bc49.M;
            if (!((animatorSet == null || c22895xa563bc49.L == null || c22895xa563bc49.K == null || c22895xa563bc49.f295356J == null) ? false : animatorSet.isRunning())) {
                return false;
            }
        }
        return true;
    }

    public boolean o() {
        return getVisibility() == 8 && !p();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (!isShown() || !q()) {
            return false;
        }
        v();
        return true;
    }

    public boolean p() {
        return this.A == mp5.w.INIT_STATE;
    }

    public boolean q() {
        return this.A == mp5.w.NORMAL_STATE;
    }

    public boolean r() {
        return this.A == mp5.w.SINGLE_ACTION_STATE;
    }

    public final void s() {
        if (this.f295352w.isShown()) {
            post(new mp5.r(this));
        }
    }

    /* renamed from: setActionBtnColor */
    public void m82978x37c8dbbf(int i17) {
        this.f295347r.setBackgroundResource(i17);
        this.f295353x.setBackgroundResource(i17);
    }

    /* renamed from: setActionText */
    public void m82979x8ac63285(java.lang.String str) {
        this.f295347r.setText(str);
        this.f295353x.setContentDescription(str);
    }

    /* renamed from: setHeightListener */
    public void m82980x6329d7fd(mp5.v vVar) {
        this.B = vVar;
    }

    /* renamed from: setInnerMode */
    public void m82981x3c4612d7(boolean z17) {
        this.I = z17;
        if (z17 && this.f295335J == null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f567505jq4);
            this.f295335J = viewOnFocusChangeListenerC22907xe18534c2;
            this.f295354y = viewOnFocusChangeListenerC22907xe18534c2.m83169xe7297452();
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = this.f295335J;
            if (viewOnFocusChangeListenerC22907xe18534c22.f295694h != null) {
                int i17 = this.P;
                int i18 = this.Q;
                if (i17 >= 0 || i18 >= 0) {
                    viewOnFocusChangeListenerC22907xe18534c22.f295704r = i17;
                    viewOnFocusChangeListenerC22907xe18534c22.f295705s = i18;
                    viewOnFocusChangeListenerC22907xe18534c22.f295706t = true;
                }
            }
            viewOnFocusChangeListenerC22907xe18534c22.m83217x59dfe8de(true);
            this.f295335J.m83216x7fcb664b(new mp5.l(this));
            this.f295335J.m83209x37562b58(new mp5.n(this));
        }
    }

    /* renamed from: setInputConnection */
    public void m82982xa13e6986(android.view.inputmethod.InputConnection inputConnection) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "setInputConnection");
        this.N = inputConnection;
    }

    /* renamed from: setInputEditText */
    public void m82983xce4186ff(android.widget.EditText editText) {
        if (editText != null) {
            this.f295354y = editText;
            this.I = false;
            this.f295335J = null;
        }
    }

    /* renamed from: setIsOnlySupportInteger */
    public void m82984x1c238f87(boolean z17) {
        if (z17) {
            this.f295346q.setVisibility(8);
            p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) this.f295345p.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f93085b = p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.l(0, 3, p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.f93071w, 1.0f);
                this.f295345p.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f295346q.setVisibility(0);
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams2 = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) this.f295345p.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.f93085b = p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.l(0, 2, p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.f93071w, 1.0f);
            this.f295345p.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: setTipText */
    public void m82985x63103da6(java.lang.String str) {
        this.f295349t.setText(str);
        this.f295349t.setVisibility(0);
        s();
    }

    /* renamed from: setToolBarContent */
    public void m82986xa77281a0(android.view.View view) {
        if (view == null) {
            return;
        }
        this.f295350u.setVisibility(0);
        this.f295350u.removeAllViews();
        this.f295349t.setVisibility(8);
        this.f295350u.addView(view, -1, -2);
        s();
    }

    public final void t(android.view.View view, boolean z17) {
        if (view != null) {
            view.setEnabled(z17);
        }
    }

    public void u() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(isShown());
        mp5.w wVar = this.A;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(n());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", " showNormalStWcKb() %s %s %s [%s]", valueOf, wVar, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        g(true);
        if (n()) {
            if (this.I) {
                this.E = new mp5.q(this);
                return;
            }
            return;
        }
        if (!isShown()) {
            if (r()) {
                f(false, false);
            }
            g(true);
            setVisibility(0);
            this.f295352w.setVisibility(4);
            this.f295352w.post(new mp5.g(this, true));
        } else if (r()) {
            f(false, true);
        }
        this.A = mp5.w.NORMAL_STATE;
    }

    public void v() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(isShown());
        mp5.w wVar = this.A;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(n());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayKeyBoard", "showSingleActionStWcKb() %s %s %s [%s]", valueOf, wVar, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        g(true);
        if (n()) {
            if (this.I) {
                this.E = new mp5.p(this);
                return;
            }
            return;
        }
        if (this.A == mp5.w.INIT_STATE) {
            return;
        }
        if (isShown() && q()) {
            f(true, false);
        } else if (!isShown()) {
            if (q()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WcPayKeyBoard", "showSingleActionStWcKb() why here??");
            } else if (r()) {
                setVisibility(0);
                this.f295353x.setVisibility(0);
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559457fc);
                loadAnimation.setAnimationListener(new mp5.d(this));
                this.f295353x.startAnimation(loadAnimation);
            }
        }
        this.A = mp5.w.SINGLE_ACTION_STATE;
    }

    public C22894x55bf3223(android.content.Context context, boolean z17) {
        super(context);
        this.A = mp5.w.INIT_STATE;
        this.C = false;
        this.D = true;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = false;
        this.f295335J = null;
        this.K = 0;
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = 7;
        this.Q = 2;
        this.R = 7 + 2 + 2;
        this.D = z17;
        k();
    }

    public C22894x55bf3223(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = mp5.w.INIT_STATE;
        this.C = false;
        this.D = true;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = false;
        this.f295335J = null;
        this.K = 0;
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = 7;
        this.Q = 2;
        this.R = 7 + 2 + 2;
        k();
    }

    public C22894x55bf3223(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.A = mp5.w.INIT_STATE;
        this.C = false;
        this.D = true;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = false;
        this.f295335J = null;
        this.K = 0;
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = 7;
        this.Q = 2;
        this.R = 7 + 2 + 2;
        k();
    }
}
