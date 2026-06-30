package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4;

/* renamed from: com.tencent.mm.plugin.recharge.ui.form.MallFormView */
/* loaded from: classes9.dex */
public final class ViewOnFocusChangeListenerC16962x770823dd extends android.widget.LinearLayout implements android.view.View.OnFocusChangeListener, xn5.a0 {
    public int A;
    public java.lang.String B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f236694J;
    public int K;
    public boolean L;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f236695d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f236696e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.EditText f236697f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e f236698g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f236699h;

    /* renamed from: i, reason: collision with root package name */
    public ws3.q f236700i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f236701m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View.OnClickListener f236702n;

    /* renamed from: o, reason: collision with root package name */
    public ws3.b f236703o;

    /* renamed from: p, reason: collision with root package name */
    public int f236704p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f236705q;

    /* renamed from: r, reason: collision with root package name */
    public int f236706r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f236707s;

    /* renamed from: t, reason: collision with root package name */
    public int f236708t;

    /* renamed from: u, reason: collision with root package name */
    public int f236709u;

    /* renamed from: v, reason: collision with root package name */
    public int f236710v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f236711w;

    /* renamed from: x, reason: collision with root package name */
    public int f236712x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f236713y;

    /* renamed from: z, reason: collision with root package name */
    public int f236714z;

    public ViewOnFocusChangeListenerC16962x770823dd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f236695d = null;
        this.f236696e = null;
        this.f236697f = null;
        this.f236698g = null;
        this.f236699h = null;
        this.f236700i = null;
        this.f236701m = null;
        this.f236702n = null;
        this.f236703o = null;
        this.f236704p = -1;
        this.f236705q = "";
        this.f236706r = 0;
        this.f236707s = "";
        this.f236708t = 8;
        this.f236709u = -1;
        this.f236710v = 4;
        this.f236711w = "";
        this.f236712x = 8;
        this.f236713y = "";
        this.f236714z = 19;
        this.A = com.p314xaae8f345.mm.R.C30859x5a72f63.a0c;
        this.B = "";
        this.C = Integer.MAX_VALUE;
        this.D = 1;
        this.E = com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3;
        this.F = true;
        this.G = false;
        this.H = true;
        this.I = 1;
        this.f236694J = 5;
        this.K = com.p314xaae8f345.mm.R.C30859x5a72f63.f560846vt;
        this.L = true;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270114d, i17, 0);
        this.f236704p = obtainStyledAttributes.getResourceId(17, this.f236704p);
        int resourceId = obtainStyledAttributes.getResourceId(23, 0);
        if (resourceId != 0) {
            this.f236705q = context.getString(resourceId);
        }
        this.f236709u = obtainStyledAttributes.getResourceId(14, this.f236709u);
        int resourceId2 = obtainStyledAttributes.getResourceId(21, 0);
        if (resourceId2 != 0) {
            this.f236711w = context.getString(resourceId2);
        }
        this.f236710v = obtainStyledAttributes.getInteger(15, this.f236710v);
        this.f236706r = obtainStyledAttributes.getInteger(25, this.f236706r);
        this.f236712x = obtainStyledAttributes.getInteger(22, this.f236712x);
        this.f236708t = obtainStyledAttributes.getInteger(20, this.f236708t);
        int resourceId3 = obtainStyledAttributes.getResourceId(18, 0);
        if (resourceId3 != 0) {
            this.f236707s = context.getString(resourceId3);
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(8, 0);
        if (resourceId4 != 0) {
            this.f236713y = context.getString(resourceId4);
        }
        this.f236714z = obtainStyledAttributes.getInteger(7, this.f236714z);
        this.A = obtainStyledAttributes.getColor(13, this.A);
        int resourceId5 = obtainStyledAttributes.getResourceId(12, 0);
        if (resourceId5 != 0) {
            this.B = context.getString(resourceId5);
        }
        this.C = obtainStyledAttributes.getInteger(10, this.C);
        this.D = obtainStyledAttributes.getInteger(11, this.D);
        this.E = obtainStyledAttributes.getResourceId(2, this.E);
        this.F = obtainStyledAttributes.getBoolean(4, this.F);
        this.G = obtainStyledAttributes.getBoolean(3, this.G);
        this.H = obtainStyledAttributes.getBoolean(4, this.H);
        this.I = obtainStyledAttributes.getInteger(0, this.I);
        this.f236694J = obtainStyledAttributes.getInteger(1, this.f236694J);
        this.K = obtainStyledAttributes.getInteger(9, this.K);
        obtainStyledAttributes.recycle();
        iz5.a.g(null, this.f236704p > 0);
        setOrientation(1);
        android.view.View.inflate(context, this.f236704p, this);
        this.f236695d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567381jb1);
        this.f236696e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j_h);
        this.f236697f = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.j9h);
        this.f236698g = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e) findViewById(com.p314xaae8f345.mm.R.id.j9w);
        this.f236699h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567380jb0);
    }

    public final boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        if (view != null && view.getVisibility() == 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getHitRect(rect);
            if (view == this.f236698g) {
                rect.left -= 50;
                rect.right += 50;
                rect.top -= 25;
                rect.bottom += 25;
            }
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        android.widget.EditText editText = this.f236697f;
        if (editText == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletFormView", "hy: no content edit text. true as default");
            return true;
        }
        int length = editText.getText() == null ? 0 : this.f236697f.getText().length();
        if (length > this.C || length < this.D) {
            return false;
        }
        ws3.b bVar = this.f236703o;
        if (bVar == null) {
            return true;
        }
        ((ws3.c) bVar).getClass();
        return android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(vs3.b.a(m67852xfb85ada3().toString()));
    }

    public void c() {
        android.widget.EditText editText;
        if (this.f236698g != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m67852xfb85ada3()) && (editText = this.f236697f) != null && editText.isEnabled() && this.f236697f.isClickable() && this.f236697f.isFocusable() && this.f236697f.isFocused()) {
            this.f236698g.m75916xed5ee0a1(new ws3.l(this));
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e c19757x2454ae8e = this.f236698g;
        if (c19757x2454ae8e != null) {
            c19757x2454ae8e.t();
        }
    }

    /* renamed from: getContentEditText */
    public android.widget.EditText m67842xd454f3ba() {
        return this.f236697f;
    }

    /* renamed from: getEventDelegate */
    public ws3.a m67843x7c6f3689() {
        return null;
    }

    /* renamed from: getInfoIv */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2490xd09a53f9.C19757x2454ae8e m67844x1e821d71() {
        return this.f236698g;
    }

    /* renamed from: getInputLength */
    public int m67845xbad2461a() {
        android.widget.EditText editText = this.f236697f;
        if (editText != null) {
            return editText.getText().length();
        }
        return 0;
    }

    /* renamed from: getInputValidChangeListener */
    public ws3.q m67846x3bf408ec() {
        return this.f236700i;
    }

    /* renamed from: getKeyListener */
    public android.text.method.KeyListener m67847xded63efd() {
        android.widget.EditText editText = this.f236697f;
        if (editText != null) {
            return editText.getKeyListener();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletFormView", "hy: no content et");
        return null;
    }

    /* renamed from: getLogicDelegate */
    public ws3.b m67848x57f7af4d() {
        return this.f236703o;
    }

    /* renamed from: getMaxInputLength */
    public int m67849x59574842() {
        return this.C;
    }

    /* renamed from: getMinInputLength */
    public int m67850x807f0694() {
        return this.D;
    }

    /* renamed from: getPrefilledTv */
    public android.widget.TextView m67851x1a2b8df1() {
        return this.f236696e;
    }

    /* renamed from: getText */
    public java.lang.String m67852xfb85ada3() {
        android.widget.EditText editText = this.f236697f;
        if (editText == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletFormView", "hy: no content et. return nil");
            return "";
        }
        java.lang.String obj = editText.getText().toString();
        ws3.b bVar = this.f236703o;
        if (bVar == null) {
            return obj;
        }
        bVar.getClass();
        ((ws3.c) this.f236703o).getClass();
        return obj == null ? "" : obj.replaceAll(" ", "");
    }

    /* renamed from: getTipsTv */
    public android.widget.TextView m67853x310592d0() {
        return this.f236699h;
    }

    /* renamed from: getTitleTv */
    public android.widget.TextView m67854xefe232c4() {
        return this.f236695d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        if (m67854xefe232c4() != null) {
            m67854xefe232c4().setText(this.f236705q);
            m67854xefe232c4().setVisibility(this.f236706r);
        }
        if (m67851x1a2b8df1() != null) {
            m67851x1a2b8df1().setText(this.f236707s);
            m67851x1a2b8df1().setVisibility(this.f236708t);
        }
        if (m67844x1e821d71() != null) {
            m67844x1e821d71().setImageResource(this.f236709u);
            m67844x1e821d71().setVisibility(this.f236710v);
        }
        if (m67853x310592d0() != null) {
            m67853x310592d0().setText(this.f236711w);
            m67853x310592d0().setVisibility(this.f236712x);
        }
        getContext();
        android.widget.EditText editText = this.f236697f;
        if (editText != null) {
            editText.setHint(this.f236713y);
            this.f236697f.setGravity(this.f236714z);
            this.f236697f.setTextColor(this.A);
            m67868x765074af(this.B);
            this.f236697f.setBackgroundResource(this.E);
            this.f236697f.setEnabled(this.F);
            this.f236697f.setFocusable(this.H);
            this.f236697f.setClickable(this.G);
            this.f236697f.setHintTextColor(this.K);
            m67858x843d819f(this.f236694J);
            m67859xc17f97e2(this.I);
            this.f236697f.addTextChangedListener(new ws3.k(this));
            this.f236697f.setOnFocusChangeListener(this);
        }
        c();
        android.widget.EditText editText2 = this.f236697f;
        if (editText2 != null) {
            int i17 = this.I;
            if (i17 == 2) {
                editText2.setKeyListener(new ws3.m(this));
            } else if (i17 == 4) {
                editText2.setKeyListener(new ws3.n(this));
            } else if (i17 == 128) {
                editText2.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
                this.f236697f.setKeyListener(new ws3.o(this));
                this.f236697f.setRawInputType(18);
            } else if (i17 == 3) {
                editText2.setKeyListener(new ws3.p(this));
            } else {
                editText2.setInputType(i17);
            }
            if (this.C != -1) {
                this.f236697f.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.C)});
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f236701m;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        if (b()) {
            android.widget.TextView textView = this.f236695d;
            if (textView != null) {
                textView.setEnabled(true);
            }
        } else {
            android.widget.TextView textView2 = this.f236695d;
            if (textView2 != null) {
                textView2.setEnabled(false);
            }
        }
        c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.widget.EditText editText = this.f236697f;
        if (editText != null && a(editText, motionEvent) && !this.f236697f.isClickable()) {
            return true;
        }
        if (!a(this.f236698g, motionEvent) || motionEvent.getAction() != 1) {
            return false;
        }
        this.f236698g.performClick();
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    /* renamed from: setEventDelegate */
    public void m67855xf459cfd(ws3.a aVar) {
    }

    /* renamed from: setFilters */
    public void m67856x7e4f2d39(android.text.InputFilter[] inputFilterArr) {
        android.widget.EditText editText = this.f236697f;
        if (editText != null) {
            editText.setFilters(inputFilterArr);
        }
    }

    /* renamed from: setHint */
    public void m67857x764b0e09(java.lang.String str) {
        android.widget.EditText editText = this.f236697f;
        if (editText != null) {
            editText.setHint(str);
        }
    }

    /* renamed from: setImeOptions */
    public void m67858x843d819f(int i17) {
        android.widget.EditText editText = this.f236697f;
        if (editText != null) {
            editText.setImeOptions(i17);
        }
    }

    /* renamed from: setInputType */
    public void m67859xc17f97e2(int i17) {
        android.widget.EditText editText = this.f236697f;
        if (editText != null) {
            editText.setInputType(i17);
        }
    }

    /* renamed from: setKeyListener */
    public void m67860x753bb271(android.text.method.KeyListener keyListener) {
        android.widget.EditText editText = this.f236697f;
        if (editText != null) {
            editText.setKeyListener(keyListener);
        }
    }

    /* renamed from: setLogicDelegate */
    public void m67861xeace15c1(ws3.b bVar) {
        this.f236703o = bVar;
    }

    /* renamed from: setMaxInputLength */
    public void m67862x214db04e(int i17) {
        this.C = i17;
    }

    /* renamed from: setMinInputLength */
    public void m67863x48756ea0(int i17) {
        this.D = i17;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    /* renamed from: setOnEditorActionListener */
    public void m67864x37562b58(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
        this.f236697f.setOnEditorActionListener(onEditorActionListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f236701m = onFocusChangeListener;
    }

    /* renamed from: setOnInfoIvClickListener */
    public void m67865x25bc1800(android.view.View.OnClickListener onClickListener) {
        this.f236702n = onClickListener;
        if (m67844x1e821d71() != null) {
            m67844x1e821d71().setOnClickListener(this.f236702n);
        }
    }

    /* renamed from: setOnInputValidChangeListener */
    public void m67866x749e7e77(ws3.q qVar) {
        this.f236700i = qVar;
    }

    /* renamed from: setSelection */
    public void m67867xf579a34a(int i17) {
        android.widget.EditText editText = this.f236697f;
        if (editText != null) {
            editText.setSelection(i17);
        }
    }

    /* renamed from: setText */
    public void m67868x765074af(java.lang.String str) {
        if (this.f236697f != null) {
            ws3.b bVar = this.f236703o;
            if (bVar != null) {
                bVar.getClass();
            }
            this.f236697f.setText(str);
            this.f236697f.setSelection(m67845xbad2461a());
        }
    }

    public ViewOnFocusChangeListenerC16962x770823dd(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
