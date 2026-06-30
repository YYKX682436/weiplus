package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter */
/* loaded from: classes8.dex */
public class C19494x6eecdedb extends android.widget.LinearLayout {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public ey4.u f268825d;

    /* renamed from: e, reason: collision with root package name */
    public ey4.t f268826e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f268827f;

    /* renamed from: g, reason: collision with root package name */
    public int f268828g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f268829h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f268830i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f268831m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f268832n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f268833o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageButton f268834p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f268835q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f268836r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f268837s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf f268838t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.FrameLayout f268839u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f268840v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f268841w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f268842x;

    /* renamed from: y, reason: collision with root package name */
    public int f268843y;

    /* renamed from: z, reason: collision with root package name */
    public int f268844z;

    public C19494x6eecdedb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268828g = 0;
        this.f268843y = Integer.MAX_VALUE;
        this.f268844z = Integer.MAX_VALUE;
        this.f268840v = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        g();
    }

    public void a(java.lang.String str) {
        if (str == null) {
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.g(((java.lang.Object) this.f268833o.getText()) + str) <= this.f268843y) {
            this.f268833o.n(str);
        }
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewInputFooter", "hide all");
        android.view.View view = this.f268827f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setVisibility(8);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f268840v;
        java.lang.String str = "";
        if (abstractActivityC21394xb3d2c0cf != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f268833o;
            if (c22621x7603e017 != null) {
                abstractActivityC21394xb3d2c0cf.mo53060x36654fab(c22621x7603e017);
                str = this.f268833o.getText().toString();
            }
            this.f268840v.mo48674x36654fab();
        }
        this.f268828g = 0;
        c(true);
        e();
        ey4.u uVar = this.f268825d;
        if (uVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ua) uVar).a(str);
        }
    }

    public final void c(boolean z17) {
        this.f268834p.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
        this.f268828g = 0;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f268829h;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.setVisibility(8);
        }
        if (z17) {
            android.view.View view = this.f268842x;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideSmileyPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "hideSmileyPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void d(java.util.Map map) {
        boolean equals = java.util.Objects.equals(map.get("switchToSmile"), "true");
        this.f268841w = false;
        if (equals) {
            this.f268828g = 1;
            this.f268840v.mo48674x36654fab();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewInputFooter", "hideVKB and show smiley");
            if (!this.f268841w) {
                this.f268833o.requestFocus();
            }
            j();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f268833o;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setFocusable(true);
            this.f268833o.setFocusableInTouchMode(true);
            this.f268833o.requestFocus();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewInputFooter", "showVKB");
        i();
        this.f268828g = 0;
    }

    public void e() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f268833o;
        if (c22621x7603e017 != null) {
            c22621x7603e017.clearFocus();
            this.f268833o.setFocusable(false);
            this.f268833o.setFocusableInTouchMode(false);
        }
    }

    public int f(int i17, boolean z17) {
        android.view.View view;
        android.view.ViewGroup.LayoutParams layoutParams = this.f268839u.getLayoutParams();
        if (layoutParams != null) {
            if (i17 != 0) {
                layoutParams.height = i17;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19330x7ca5b1cf c19330x7ca5b1cf = this.f268838t;
                if (c19330x7ca5b1cf == null || c19330x7ca5b1cf.m74396xfc829cc4() <= 0) {
                    layoutParams.height = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
                } else {
                    layoutParams.height = this.f268838t.m74396xfc829cc4();
                }
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f268829h;
            if (abstractC19636xc6b37291 != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = abstractC19636xc6b37291.getLayoutParams();
                layoutParams2.height = layoutParams.height;
                this.f268829h.setLayoutParams(layoutParams2);
            }
            this.f268839u.setLayoutParams(layoutParams);
        }
        if (z17 && this.f268835q.getTag() != null && this.f268835q.getTag().equals("writeMessage") && this.f268839u.getHeight() == 0 && (view = this.f268835q) != null) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new ey4.s());
            alphaAnimation.setDuration(600L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "doAlphaAnimation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", "doAlphaAnimation", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.startAnimation(alphaAnimation);
        }
        if (layoutParams != null) {
            return layoutParams.height;
        }
        return 0;
    }

    public void g() {
        removeAllViews();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(this.f268840v, com.p314xaae8f345.mm.R.C30864xbddafb2a.d9y, this);
        this.f268836r = viewGroup;
        this.f268835q = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pi_);
        this.f268831m = (android.widget.Button) this.f268836r.findViewById(com.p314xaae8f345.mm.R.id.pih);
        this.f268832n = (android.widget.Button) this.f268836r.findViewById(com.p314xaae8f345.mm.R.id.pid);
        this.f268830i = this.f268836r.findViewById(com.p314xaae8f345.mm.R.id.pii);
        this.f268833o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) this.f268836r.findViewById(com.p314xaae8f345.mm.R.id.pia);
        this.f268837s = (android.widget.TextView) this.f268836r.findViewById(com.p314xaae8f345.mm.R.id.piz);
        this.f268834p = (android.widget.ImageButton) this.f268836r.findViewById(com.p314xaae8f345.mm.R.id.pik);
        this.f268839u = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.pic);
        h();
    }

    /* renamed from: getEditText */
    public java.lang.String m74832xdb574fcd() {
        return this.f268833o.getText().toString();
    }

    /* renamed from: getInputContainerHeight */
    public int m74833xeb7cf454() {
        android.view.View view = this.f268835q;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    /* renamed from: getMMEditText */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 m74834xed72bbed() {
        return this.f268833o;
    }

    /* renamed from: getSmilePanelHeight */
    public int m74835x25689b99() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f268829h;
        if (abstractC19636xc6b37291 == null) {
            return 0;
        }
        return abstractC19636xc6b37291.getLayoutParams().height;
    }

    public final void h() {
        android.widget.ImageButton imageButton = this.f268834p;
        if (imageButton != null) {
            imageButton.setOnClickListener(new ey4.n(this));
            com.p314xaae8f345.mm.ui.p2740x696c9db.d8.b(this.f268834p, 0.5f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || gm0.j1.a()) {
            com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 c17 = qk.w9.c(this.f268840v, false);
            this.f268829h = c17;
            c17.mo75331xef640234(0);
            this.f268829h.mo75351x4aab89d0(true);
            this.f268829h.p(false, false);
            this.f268829h.o(false, false);
            this.f268829h.mo75352xe9a5b5a2(false);
            this.f268829h.setBackgroundColor(this.f268840v.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf));
            this.f268829h.setVisibility(8);
            this.f268829h.mo75339x5e04422d(new ey4.q(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewInputFooter", "can not show smileyPanel in main pro when not login");
        }
        android.view.View view = new android.view.View(this.f268840v);
        this.f268842x = view;
        view.setBackgroundColor(this.f268840v.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf));
        this.f268839u.addView(this.f268842x, -1, -1);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f268829h;
        if (abstractC19636xc6b37291 != null) {
            this.f268839u.addView(abstractC19636xc6b37291, -1, -1);
        }
        android.widget.Button button = this.f268832n;
        if (button != null) {
            button.setOnClickListener(new ey4.o(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f268833o;
        if (c22621x7603e017 != null) {
            c22621x7603e017.addTextChangedListener(new ey4.p(this));
        }
    }

    public boolean i() {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f268840v.getSystemService("input_method");
        if (inputMethodManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewInputFooter", "imm == null");
            return false;
        }
        if (this.f268833o == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewInputFooter", "contentEditText == null");
        }
        inputMethodManager.showSoftInput(this.f268833o, 0);
        return true;
    }

    @Override // android.view.View
    public boolean isShown() {
        return getVisibility() == 0;
    }

    public final int j() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f268833o;
        if (c22621x7603e017 != null) {
            this.f268840v.mo53060x36654fab(c22621x7603e017);
        }
        android.view.View view = this.f268842x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", hc1.i.f69827x24728b, "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewRedesignInputFooter", hc1.i.f69827x24728b, "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f268829h;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.setVisibility(0);
        }
        this.f268834p.setImageResource(com.p314xaae8f345.mm.R.raw.f80142x4a505d3f);
        return f(0, false);
    }

    /* renamed from: setInputShadowView */
    public void m74836x92a5828d(android.view.View view) {
        this.f268827f = view;
        if (view != null) {
            view.setOnClickListener(new ey4.k(this, view));
        }
    }

    /* renamed from: setMaxCount */
    public void m74837x8d59188d(int i17) {
        this.f268843y = 0;
        if (i17 <= 0) {
            this.f268833o.mo81583x7e4f2d39(new android.text.InputFilter[0]);
        } else {
            this.f268843y = i17;
            this.f268833o.mo81583x7e4f2d39(new android.text.InputFilter[]{new ey4.r(this, i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_3)});
        }
    }

    /* renamed from: setOnSmileyChosenListener */
    public void m74838xc90eaa98(ey4.t tVar) {
        this.f268826e = tVar;
    }

    /* renamed from: setOnTextSendListener */
    public void m74839x6cbdc62a(ey4.u uVar) {
        this.f268825d = uVar;
    }

    /* renamed from: setPlaceholder */
    public void m74840x93e43fb1(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f268833o;
        if (c22621x7603e017 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewInputFooter", "contentEditText is null!");
            return;
        }
        c22621x7603e017.setHint("");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            this.f268833o.setHint(str);
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: setShowRemindWordCount */
    public void m74841x660f8421(int i17) {
        this.f268844z = i17;
    }

    /* renamed from: setText */
    public void m74842x765074af(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f268833o;
        if (c22621x7603e017 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewInputFooter", "contentEditText is null!");
            return;
        }
        c22621x7603e017.setText("");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            a(str);
            this.f268833o.mo81549xf579a34a(str.length());
        } catch (java.lang.Exception unused) {
        }
    }
}
