package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class m1 extends hg5.d implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1, com.p314xaae8f345.mm.ui.fa, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q1, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 {
    public static final /* synthetic */ int R = 0;
    public android.view.View A;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 B;
    public android.view.View C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19490x9ddd173c D;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 E;
    public boolean F;
    public final jz5.g G;
    public final float H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.Integer f268928J;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z1 K;
    public final java.lang.String L;
    public org.json.JSONObject M;
    public final java.util.Set N;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d P;
    public final java.util.ArrayList Q;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f268929r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 f268930s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f268931t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f268932u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f268933v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f268934w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f268935x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f268936y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f268937z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.content.Context activityContext, java.lang.String url, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 option) {
        super(activityContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityContext, "activityContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        this.f268929r = activityContext;
        this.f268930s = option;
        this.f268931t = url;
        this.G = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c1(this));
        this.H = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
        this.K = ((yg0.a) ((zg0.r2) i95.n0.c(zg0.r2.class))).wi((android.app.Activity) activityContext, url, c22633x83752a59, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e0(option.f268951a, option.f268953c, option.f268954d, option.f268962l, null, option.f268963m, this, null, this, false, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.i0.f33730x366c91de, null));
        this.L = "";
        this.N = new java.util.HashSet();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.P = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5634x693cfb9c>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.widget.HalfScreenWebView$halfScreenWebViewCloseEventListener$1
            {
                this.f39173x3fe91575 = -1858943092;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5634x693cfb9c c5634x693cfb9c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5634x693cfb9c event = c5634x693cfb9c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HalfScreenWebViewCloseEvent isShowing=");
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1.this;
                sb6.append(m1Var.isShowing());
                sb6.append(", sameContext=");
                am.eh ehVar = event.f135962g;
                android.content.Context context = ehVar.f88089a;
                android.content.Context context2 = m1Var.f268929r;
                sb6.append(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context2, context));
                sb6.append(", touchOuter true");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebView", sb6.toString());
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context2, ehVar.f88089a) || !m1Var.isShowing()) {
                    return false;
                }
                m1Var.cancel();
                return false;
            }
        };
        this.Q = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0
    public void A() {
        if (!this.f268930s.f268961k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebView", "onOuterViewClick closeWhenClickEmptyArea is false");
            return;
        }
        this.P.mo48814x2efc64();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5634x693cfb9c c5634x693cfb9c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5634x693cfb9c();
        c5634x693cfb9c.f135962g.f88089a = this.f268929r;
        if (c5634x693cfb9c.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new nf.d(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.k1(this)), 200L);
        } else {
            cancel();
        }
    }

    @Override // hg5.d
    public int E() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var = this.f268930s;
        if (!(n1Var.f268951a == 1.0f)) {
            return (int) ((com.p314xaae8f345.mm.ui.bh.a(getContext()).f278669b - com.p314xaae8f345.mm.ui.bl.c(getContext())) * (1 - n1Var.f268951a));
        }
        if (getContext().getResources().getConfiguration().orientation == 2) {
            return 0;
        }
        return com.p314xaae8f345.mm.ui.bl.h(getContext());
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d9u, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        int i17;
        android.view.View findViewById;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i18;
        int i19;
        int i27;
        android.view.View view;
        android.view.Window window;
        android.widget.LinearLayout linearLayout;
        android.widget.TextView textView;
        android.view.View view2;
        android.view.WindowManager.LayoutParams attributes;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initContentView url= ");
        java.lang.String str = this.f268931t;
        sb6.append(str);
        sb6.append(" heightPercent=");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var = this.f268930s;
        sb6.append(n1Var.f268951a);
        sb6.append(" reuse=");
        sb6.append(n1Var.f268954d);
        sb6.append(" immersiveUIStyle=");
        sb6.append(n1Var.f268958h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebView", sb6.toString());
        C(1);
        super.G();
        setCanceledOnTouchOutside(true);
        if (n1Var.f268960j) {
            android.view.Window window2 = getWindow();
            if (window2 != null) {
                window2.setDimAmount(0.3f);
            }
            android.view.Window window3 = getWindow();
            if (window3 != null) {
                window3.addFlags(Integer.MIN_VALUE);
            }
        } else {
            android.view.Window window4 = getWindow();
            if (window4 != null) {
                window4.setDimAmount(0.0f);
            }
        }
        if (1 == n1Var.f268959i) {
            android.view.Window window5 = getWindow();
            if (window5 != null) {
                window5.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f576037ot);
            }
        } else {
            android.view.Window window6 = getWindow();
            if (window6 != null) {
                window6.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
            }
        }
        K();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.Window window7 = getWindow();
            android.view.WindowManager.LayoutParams attributes2 = window7 != null ? window7.getAttributes() : null;
            if (attributes2 != null) {
                attributes2.layoutInDisplayCutoutMode = 1;
            }
            android.view.Window window8 = getWindow();
            if (window8 != null) {
                window8.setAttributes(attributes2);
            }
            int i28 = n1Var.f268973w ? 5890 : 1792;
            android.view.Window window9 = getWindow();
            android.view.View decorView = window9 != null ? window9.getDecorView() : null;
            if (decorView != null) {
                decorView.setSystemUiVisibility(i28);
            }
        }
        android.view.Window window10 = getWindow();
        if (window10 != null && (attributes = window10.getAttributes()) != null) {
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
        }
        android.content.Context context = this.f268929r;
        boolean z17 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        if (z17) {
            if (n1Var.f268967q) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = z17 ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
                if (abstractActivityC21394xb3d2c0cf != null) {
                    abstractActivityC21394xb3d2c0cf.setRequestedOrientation(1);
                }
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = z17 ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf2 != null) {
                abstractActivityC21394xb3d2c0cf2.m78488x9f743232(this);
            }
        }
        android.view.View view3 = this.f362937m;
        if (view3 == null) {
            i17 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i17 = 0;
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if ((n1Var.f268968r == 1 ? 1 : i17) != 0 && n1Var.f268959i == 1) {
            android.view.View view4 = this.f362936i;
            if (view4 != null) {
                findViewById = view4.findViewById(com.p314xaae8f345.mm.R.id.f569239qy0);
            }
            findViewById = null;
        } else if (n1Var.f268972v) {
            android.view.View view5 = this.f362936i;
            if (view5 != null) {
                findViewById = view5.findViewById(com.p314xaae8f345.mm.R.id.f569238vp1);
            }
            findViewById = null;
        } else {
            android.view.View view6 = this.f362936i;
            if (view6 != null) {
                findViewById = view6.findViewById(com.p314xaae8f345.mm.R.id.qxz);
            }
            findViewById = null;
        }
        this.f268935x = findViewById;
        android.view.View view7 = this.f362936i;
        this.f268933v = view7 != null ? view7.findViewById(com.p314xaae8f345.mm.R.id.f569235pi3) : null;
        android.view.View view8 = this.f362936i;
        this.f268932u = view8 != null ? view8.findViewById(com.p314xaae8f345.mm.R.id.f569237pi5) : null;
        android.view.View view9 = this.f362936i;
        this.A = view9 != null ? view9.findViewById(com.p314xaae8f345.mm.R.id.f569233pi1) : null;
        android.view.View view10 = this.f362936i;
        this.B = view10 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view10.findViewById(com.p314xaae8f345.mm.R.id.f569234pi2) : null;
        android.view.View view11 = this.f362936i;
        this.C = view11 != null ? view11.findViewById(com.p314xaae8f345.mm.R.id.pi7) : null;
        android.view.View view12 = this.f362936i;
        this.D = view12 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19490x9ddd173c) view12.findViewById(com.p314xaae8f345.mm.R.id.pi8) : null;
        android.view.View view13 = this.f362936i;
        this.E = view13 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view13.findViewById(com.p314xaae8f345.mm.R.id.f569236pi4) : null;
        android.view.View view14 = this.f362936i;
        this.f268934w = view14 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view14.findViewById(com.p314xaae8f345.mm.R.id.pi6) : null;
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2582x48fb3bf9.C20823x581fcfd6()) == 1) {
            android.view.View view15 = this.f362936i;
            this.f268936y = view15 != null ? (android.widget.TextView) view15.findViewById(com.p314xaae8f345.mm.R.id.ryk) : null;
            android.view.View view16 = this.f362936i;
            android.widget.LinearLayout linearLayout2 = view16 != null ? (android.widget.LinearLayout) view16.findViewById(com.p314xaae8f345.mm.R.id.ryj) : null;
            this.f268937z = linearLayout2;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(i17);
            }
        } else {
            android.view.View view17 = this.f362936i;
            this.f268936y = view17 != null ? (android.widget.TextView) view17.findViewById(com.p314xaae8f345.mm.R.id.odf) : null;
            android.view.View view18 = this.f362936i;
            this.f268937z = view18 != null ? (android.widget.LinearLayout) view18.findViewById(com.p314xaae8f345.mm.R.id.ocp) : null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z1.B6(this.K, null, 1, null);
        if (n1Var.f268958h) {
            this.I = true;
        } else {
            try {
                java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("immersiveUIStyle");
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (queryParameter == null) {
                    queryParameter = "";
                }
                this.I = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(queryParameter, "1");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HalfScreenWebView", "initImmersiveStyle ex " + e17.getMessage());
            }
        }
        java.lang.String str2 = n1Var.f268966p;
        if (((str2 == null || r26.n0.N(str2)) ? 1 : i17) == 0) {
            this.f268928J = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.c(n1Var.f268966p, i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)));
        }
        if (n1Var.f268957g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19490x9ddd173c c19490x9ddd173c = this.D;
            layoutParams = c19490x9ddd173c != null ? c19490x9ddd173c.getLayoutParams() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            if (this.I) {
                layoutParams2.addRule(1, com.p314xaae8f345.mm.R.id.f569239qy0);
                layoutParams2.addRule(6, com.p314xaae8f345.mm.R.id.pi7);
            }
        } else if (this.I) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19490x9ddd173c c19490x9ddd173c2 = this.D;
            layoutParams = c19490x9ddd173c2 != null ? c19490x9ddd173c2.getLayoutParams() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).removeRule(3);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19490x9ddd173c c19490x9ddd173c3 = this.D;
            layoutParams = c19490x9ddd173c3 != null ? c19490x9ddd173c3.getLayoutParams() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(3, com.p314xaae8f345.mm.R.id.pi7);
        }
        U();
        android.view.View view19 = this.f362936i;
        if (view19 != null) {
            view19.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.i1(this));
        }
        boolean z19 = n1Var.f268955e;
        float f17 = this.H;
        if (!z19 || n1Var.f268956f == -1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.E;
            i18 = 8;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
            i19 = i17;
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.E;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(i17);
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.d8.b(this.E, 0.5f);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.E;
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d1(this));
            }
            i19 = ((int) (3 * f17)) + 0;
            i18 = 8;
        }
        int i29 = n1Var.f268956f;
        if (i29 != -1) {
            if (i29 == 1) {
                if ((n1Var.f268968r == 1 ? 1 : i17) == 0 || n1Var.f268959i != 1) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.B;
                    if (c22699x3dcdb3524 != null) {
                        c22699x3dcdb3524.setRotation(180.0f);
                    }
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = this.B;
                    if (c22699x3dcdb3525 != null) {
                        c22699x3dcdb3525.setRotation(0.0f);
                    }
                }
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = this.B;
                if (c22699x3dcdb3526 != null) {
                    c22699x3dcdb3526.setRotation(90.0f);
                }
            }
            if (n1Var.f268957g && (view2 = this.f268935x) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(i17)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i27 = ((int) (3 * f17)) + i17;
        } else {
            android.view.View view20 = this.C;
            if (view20 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view20, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view20.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
                yj0.a.f(view20, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (n1Var.f268957g && n1Var.f268972v && (view = this.f268935x) != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList4.get(i17)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/HalfScreenWebView", "initActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i27 = i17;
        }
        if (n1Var.f268964n) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3527 = this.f268934w;
            if (c22699x3dcdb3527 != null) {
                c22699x3dcdb3527.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e1(this));
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.d8.b(this.f268934w, 0.5f);
            i19 += (int) (f17 * (i19 > 0 ? 5 : 3));
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3528 = this.f268934w;
            if (c22699x3dcdb3528 != null) {
                c22699x3dcdb3528.setVisibility(i18);
            }
        }
        int i37 = i27 - i19;
        if (n1Var.f268965o) {
            if (i37 > 0) {
                android.widget.LinearLayout linearLayout3 = this.f268937z;
                if (linearLayout3 != null) {
                    linearLayout3.setPadding(i17, i17, i37, i17);
                }
            } else if (i37 < 0 && (linearLayout = this.f268937z) != null) {
                linearLayout.setPadding(0 - i37, i17, i17, i17);
            }
            if (com.p314xaae8f345.mm.ui.f.a()) {
                com.p314xaae8f345.mm.ui.f.b(this.f268936y, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
            } else if (i65.a.D(getContext()) && (textView = this.f268936y) != null) {
                textView.setTextSize(i17, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b) * i65.a.m(getContext()));
            }
        } else {
            android.widget.LinearLayout linearLayout4 = this.f268937z;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(i18);
            }
        }
        android.view.View view21 = this.f268933v;
        if (view21 != null) {
            view21.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f1(this));
        }
        P(L());
        f(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.P.mo48813x58998cd();
        if (n1Var.f268969s && (window = getWindow()) != null) {
            window.setFlags(1024, 1024);
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2582x48fb3bf9.C20823x581fcfd6()) == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_aea21419", "WebViewHostShowRuleJson");
            if (Ui != null) {
                T(Ui);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.g1 g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.g1(this);
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
            qVar.c("ilinkres_aea21419");
            java.util.LinkedList linkedList = qVar.f299081e;
            if (linkedList != null) {
                linkedList.add("WebViewHostShowRuleJson");
            }
            ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Di(qVar, g1Var);
        }
    }

    @Override // hg5.d
    public void J() {
        super.J();
        this.P.mo48814x2efc64();
        android.content.Context context = this.f268929r;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78550x87bf02d5(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19490x9ddd173c c19490x9ddd173c = this.D;
        if (c19490x9ddd173c != null && c19490x9ddd173c.f268610r) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = c19490x9ddd173c.f268607o;
            if (c22633x83752a59 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("webView");
                throw null;
            }
            c22633x83752a59.C.remove(c19490x9ddd173c.f268614v);
            c19490x9ddd173c.f268610r = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19490x9ddd173c c19490x9ddd173c2 = this.D;
        if (c19490x9ddd173c2 != null) {
            c19490x9ddd173c2.removeAllViews();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) this.K).l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebView", "onDismiss url= " + this.f268931t + " cacheController=false");
    }

    public final void K() {
        android.view.View decorView;
        android.view.Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setMinimumWidth(com.p314xaae8f345.mm.ui.bh.a(decorView.getContext()).f278668a);
        decorView.setPadding(getContext().getResources().getConfiguration().orientation == 2 ? com.p314xaae8f345.mm.ui.bl.h(decorView.getContext()) : 0, 0, 0, 0);
    }

    public final int L() {
        android.content.Context context;
        int i17;
        if (this.I) {
            context = getContext();
            i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f561086ab4;
        } else {
            context = getContext();
            i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.aaw;
        }
        return i65.a.d(context, i17);
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 M() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) this.K).d();
    }

    public final boolean N() {
        org.json.JSONObject jSONObject;
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2582x48fb3bf9.C20823x581fcfd6()) != 1 || (jSONObject = this.M) == null) {
            return false;
        }
        return jSONObject != null ? jSONObject.optBoolean("EnableWebHostShow", false) : false;
    }

    public void O(java.lang.String result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebView", "onJsApiConfirmDialogDismiss result=".concat(result));
        if (this.F) {
            this.F = false;
            android.view.View view = this.f362935h;
            if (view != null) {
                view.setBackgroundColor(0);
            }
            android.view.View view2 = this.f362934g;
            if (view2 != null) {
                view2.setBackgroundColor(0);
            }
        }
    }

    public void P(int i17) {
        int d17;
        android.view.View view = this.C;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
        android.view.View view2 = this.f268932u;
        if (view2 != null) {
            view2.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l1(this, this.H));
        }
        if (view2 != null) {
            view2.setClipToOutline(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var = this.f268930s;
        if (n1Var.f268970t == 1) {
            android.view.View view3 = this.A;
            if (view3 != null) {
                view3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bat);
            }
            d17 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = null;
            if (android.graphics.Color.red(i17) > 200 && android.graphics.Color.blue(i17) > 200 && android.graphics.Color.green(i17) > 200) {
                if (n1Var.f268970t == 2) {
                    android.view.View view4 = this.A;
                    if (view4 != null) {
                        view4.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.B;
                    if (c22699x3dcdb352 != null) {
                        android.view.ViewGroup.LayoutParams layoutParams2 = c22699x3dcdb352.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                            layoutParams2.width = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                            layoutParams = layoutParams2;
                        }
                        c22699x3dcdb352.setLayoutParams(layoutParams);
                    }
                } else if (n1Var.f268955e) {
                    android.view.View view5 = this.A;
                    if (view5 != null) {
                        view5.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bau);
                    }
                } else {
                    android.view.View view6 = this.A;
                    if (view6 != null) {
                        view6.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bas);
                    }
                }
                d17 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96);
            } else {
                if (n1Var.f268970t == 2) {
                    android.view.View view7 = this.A;
                    if (view7 != null) {
                        view7.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.B;
                    if (c22699x3dcdb3522 != null) {
                        android.view.ViewGroup.LayoutParams layoutParams3 = c22699x3dcdb3522.getLayoutParams();
                        if (layoutParams3 != null) {
                            layoutParams3.height = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                            layoutParams3.width = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
                            layoutParams = layoutParams3;
                        }
                        c22699x3dcdb3522.setLayoutParams(layoutParams);
                    }
                } else if (n1Var.f268955e) {
                    android.view.View view8 = this.A;
                    if (view8 != null) {
                        view8.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bat);
                    }
                } else {
                    android.view.View view9 = this.A;
                    if (view9 != null) {
                        view9.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bar);
                    }
                }
                d17 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.B;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.m82040x7541828(d17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.E;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.m82040x7541828(d17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = this.f268934w;
        if (c22699x3dcdb3525 != null) {
            c22699x3dcdb3525.m82040x7541828(d17);
        }
        android.widget.TextView textView = this.f268936y;
        if (textView != null) {
            if (N()) {
                d17 = -1;
            }
            textView.setTextColor(d17);
        }
    }

    public void R(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) this.K;
        o4Var.getClass();
        o4Var.f269010v = callback;
    }

    public final void S(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        if (this.f268930s.f268956f == 0) {
            boolean z17 = false;
            if (c27816xac2547f9 != null && c27816xac2547f9.mo120129xed1a21df()) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.B;
                if (c22699x3dcdb352 == null) {
                    return;
                }
                c22699x3dcdb352.setRotation(180.0f);
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.B;
            if (c22699x3dcdb3522 == null) {
                return;
            }
            c22699x3dcdb3522.setRotation(90.0f);
        }
    }

    public final void T(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar) {
        if (xVar == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(new com.p314xaae8f345.mm.vfs.r6(xVar.m117639xfb83cc9b()).o()));
            this.M = jSONObject;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("WeiXinHostList");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String optString = optJSONArray.optString(i17);
                    if (optString != null) {
                        ((java.util.HashSet) this.N).add(optString);
                    }
                }
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HalfScreenWebView", "read file error", e17);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HalfScreenWebView", "read file error", e18);
        }
    }

    public final void U() {
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(getContext());
        int i17 = a17.f278668a;
        int i18 = a17.f278669b;
        if (i17 <= i18) {
            i18 = i17;
        }
        android.view.View view = this.f268932u;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var = this.f268930s;
        float f17 = n1Var.f268952b;
        if (f17 > 0.0f) {
            if (layoutParams != null) {
                layoutParams.width = (int) (i17 * f17);
            }
        } else if (layoutParams != null) {
            layoutParams.width = i18;
        }
        android.view.View view2 = this.f268932u;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        if (n1Var.f268968r == 1) {
            android.view.View view3 = this.f268932u;
            java.lang.Object layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                layoutParams3.removeRule(14);
                layoutParams3.addRule(11);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebView", "updateView set contentLayout align parent right!");
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        java.util.Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a1) it.next()).a(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1
    public void e(android.os.Bundle bundle) {
        int i17;
        int i18;
        if (bundle == null) {
            return;
        }
        if (bundle.getBoolean("set_navigation_bar_color_reset", false)) {
            i18 = L();
            i17 = 255;
        } else {
            int i19 = bundle.getInt("set_navigation_bar_color_color");
            i17 = bundle.getInt("set_navigation_bar_color_alpha");
            i18 = i19;
        }
        P((i18 & 16777215) | (i17 << 24));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1
    public void f(int i17) {
        android.view.View view = this.f268932u;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1
    public void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, boolean z17) {
        S(c27816xac2547f9);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19490x9ddd173c c19490x9ddd173c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf c19330x7ca5b1cf = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) this.K).f269000i;
        android.view.ViewParent parent = c19330x7ca5b1cf != null ? c19330x7ca5b1cf.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (this.f268928J != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 M = M();
            java.lang.Integer num = this.f268928J;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            M.setBackgroundColor(num.intValue());
            if (!this.I) {
                java.lang.Integer num2 = this.f268928J;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                P(num2.intValue());
            }
        } else {
            M().setBackgroundColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19490x9ddd173c c19490x9ddd173c2 = this.D;
        if (c19490x9ddd173c2 != null) {
            c19490x9ddd173c2.addView(c19330x7ca5b1cf, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        S(M());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var = this.f268930s;
        boolean z17 = false;
        if (n1Var.f268971u) {
            if ((n1Var.f268968r == 1) && n1Var.f268959i == 1) {
                z17 = true;
            }
        }
        int i17 = (int) (com.p314xaae8f345.mm.ui.bh.a(getContext()).f278669b * n1Var.f268951a * 0.3f);
        jz5.g gVar = this.G;
        hg5.j.a((hg5.j) ((jz5.n) gVar).mo141623x754a37bb(), this.f268935x, this.f362934g, i17, 0.0f, !z17, null, 40, null);
        hg5.j.a((hg5.j) ((jz5.n) gVar).mo141623x754a37bb(), this.f268933v, this.f362934g, i17, 0.5f, false, null, 48, null);
        hg5.j.a((hg5.j) ((jz5.n) gVar).mo141623x754a37bb(), this.C, this.f362934g, i17, 0.0f, false, this.I ? M() : null, 24, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3.f263545a;
        if (((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3.f263553i).mo141623x754a37bb()).booleanValue() && (c19490x9ddd173c = this.D) != null) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 M2 = M();
            android.view.View view = this.f362934g;
            if (view != null) {
                c19490x9ddd173c.f268606n = view;
                c19490x9ddd173c.f268608p = new hg5.j(weakReference);
                c19490x9ddd173c.f268609q = i17;
                c19490x9ddd173c.f268607o = M2;
                M2.D0(c19490x9ddd173c.f268614v);
                c19490x9ddd173c.f268610r = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19490x9ddd173c c19490x9ddd173c3 = this.D;
        if (c19490x9ddd173c3 != null) {
            c19490x9ddd173c3.m74815xeb43f5e5(z17);
        }
        android.view.View view2 = this.f362934g;
        com.p314xaae8f345.mm.p2776x373aa5.C22802xbb89f889 c22802xbb89f889 = view2 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22802xbb89f889 ? (com.p314xaae8f345.mm.p2776x373aa5.C22802xbb89f889) view2 : null;
        if (c22802xbb89f889 == null) {
            return;
        }
        c22802xbb89f889.m82725xd93d254(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h1(z17, this));
    }

    @Override // com.p314xaae8f345.mm.ui.fa
    /* renamed from: onConfigurationChanged */
    public void mo74853x50e1c15d(android.content.res.Configuration configuration) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view = this.f362934g;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j1(this, configuration));
        }
        K();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var;
        nw4.n g07;
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z1 z1Var = this.K;
        if (z1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) z1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var2 = o4Var.G;
            if ((r0Var2 != null ? r0Var2.g0() : null) == null || (r0Var = o4Var.G) == null || (g07 = r0Var.g0()) == null) {
                return;
            }
            g07.u0(z17, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1
    public boolean p() {
        return this.I;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1
    public void r(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        android.widget.TextView textView;
        java.lang.String str2;
        int i17;
        if (!this.f268930s.f268965o) {
            android.widget.TextView textView2 = this.f268936y;
            if (textView2 == null) {
                return;
            }
            textView2.setText("");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) this.K).G;
        java.lang.String str3 = null;
        java.lang.String str4 = r0Var != null ? r0Var.f263497y : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebView", "onReceivedTitle# title = " + str + " loadUrl=" + str4);
        boolean z17 = true;
        boolean z18 = false;
        if (!N()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                android.widget.TextView textView3 = this.f268936y;
                if (textView3 == null) {
                    return;
                }
                textView3.setText("");
                return;
            }
            if (str4 == null) {
                str4 = "";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (r26.i0.n(str4, str, false)) {
                android.widget.TextView textView4 = this.f268936y;
                if (textView4 == null) {
                    return;
                }
                textView4.setText("");
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (!android.webkit.URLUtil.isHttpsUrl(str) && !android.webkit.URLUtil.isHttpUrl(str))) {
                z17 = false;
            }
            if (z17 || r26.i0.y(str, "about:blank", false) || (textView = this.f268936y) == null) {
                return;
            }
            textView.setText(str);
            return;
        }
        java.lang.String str5 = this.f268931t;
        java.lang.String host = android.net.Uri.parse(str5).getHost();
        if (host != null && ((java.util.HashSet) this.N).contains(host)) {
            z18 = true;
        }
        if (z18) {
            str2 = "";
            i17 = 1;
        } else {
            org.json.JSONObject jSONObject = this.M;
            org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("TencentHostList") : null;
            java.lang.String optString = optJSONObject != null ? optJSONObject.optString(host, "") : "";
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                str3 = host == null ? "" : host;
                i17 = 3;
            } else {
                str3 = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3d, optString);
                i17 = 2;
            }
            str2 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? str3 : this.L;
        }
        android.widget.TextView textView5 = this.f268936y;
        if (textView5 != null) {
            textView5.setText(str2);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("webview_display_type", 1);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("webview_statement", str3);
        hashMap.put("webview_url_type", java.lang.Integer.valueOf(i17));
        hashMap.put("webview_url_domain", host != null ? host : "");
        hashMap.put("webview_url", str5);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_webview_display_statement", hashMap, 32337);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1
    public void s(android.os.Bundle bundle) {
        android.widget.TextView textView;
        if (bundle == null || !this.f268930s.f268965o || (textView = this.f268936y) == null) {
            return;
        }
        java.lang.String string = bundle.getString("set_page_title_text");
        if (string != null) {
            textView.setText(string);
        }
        float f17 = bundle.getFloat("set_page_title_alpha", 1.0f);
        textView.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.c(bundle.getString("set_page_title_color"), textView.getCurrentTextColor()));
        double d17 = f17;
        boolean z17 = false;
        if (0.0d <= d17 && d17 <= 1.0d) {
            z17 = true;
        }
        if (z17) {
            textView.setAlpha(f17);
        }
    }

    @Override // android.app.Dialog
    public void setOnShowListener(android.content.DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
    }

    @Override // hg5.d, android.app.Dialog
    public void show() {
        super.show();
        java.util.Iterator it = this.Q.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a1) it.next()).a(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1
    public void t(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1
    public void w(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        S(c27816xac2547f9);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p1
    public void x(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        if (c27816xac2547f9 != null) {
            c27816xac2547f9.mo120156xb5887639();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) this.K;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = o4Var.G;
        if (r0Var != null) {
            r0Var.Z();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var2 = o4Var.G;
        java.lang.String Z = r0Var2 != null ? r0Var2.Z() : null;
        if (Z == null || Z.length() == 0) {
            return;
        }
        java.lang.String mo120156xb5887639 = c27816xac2547f9 != null ? c27816xac2547f9.mo120156xb5887639() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var3 = o4Var.G;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(mo120156xb5887639, r0Var3 != null ? r0Var3.Z() : null)) {
            return;
        }
        P(L());
        f(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ m1(android.content.Context r29, java.lang.String r30, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 r31, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 r32, int r33, p3321xbce91901.jvm.p3324x21ffc6bd.i r34) {
        /*
            r28 = this;
            r0 = r33 & 4
            if (r0 == 0) goto L6
            r0 = 0
            goto L8
        L6:
            r0 = r31
        L8:
            r1 = r33 & 8
            if (r1 == 0) goto L3f
            com.tencent.mm.plugin.webview.ui.tools.widget.n1 r1 = new com.tencent.mm.plugin.webview.ui.tools.widget.n1
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 8388607(0x7fffff, float:1.1754942E-38)
            r27 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = r28
            r3 = r29
            r4 = r30
            goto L47
        L3f:
            r2 = r28
            r3 = r29
            r4 = r30
            r1 = r32
        L47:
            r2.<init>(r3, r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1.<init>(android.content.Context, java.lang.String, com.tencent.mm.ui.widget.MMWebView, com.tencent.mm.plugin.webview.ui.tools.widget.n1, int, kotlin.jvm.internal.i):void");
    }
}
