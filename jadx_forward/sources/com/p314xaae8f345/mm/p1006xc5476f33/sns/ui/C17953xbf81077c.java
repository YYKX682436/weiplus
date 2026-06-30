package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.CollapsibleTextView */
/* loaded from: classes4.dex */
public class C17953xbf81077c extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f247786y = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f247787d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f247788e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18422x36b32e92 f247789f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18117xa07b66ea f247790g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f247791h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f247792i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f247793m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f247794n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f247795o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f247796p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f247797q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f247798r;

    /* renamed from: s, reason: collision with root package name */
    public int f247799s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns f247800t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a f247801u;

    /* renamed from: v, reason: collision with root package name */
    public int f247802v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View.OnClickListener f247803w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Runnable f247804x;

    public C17953xbf81077c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247787d = false;
        this.f247792i = true;
        this.f247795o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f247799s = 0;
        this.f247804x = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.s1(this);
        this.f247788e = context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f247793m = this.f247788e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_3);
        this.f247794n = this.f247788e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_2);
        if (ld4.a.f399638a.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inflateXml", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            setPadding(0, -3, 0, 0);
            setOrientation(1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18117xa07b66ea c18117xa07b66ea = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18117xa07b66ea(this.f247788e);
            this.f247790g = c18117xa07b66ea;
            c18117xa07b66ea.setId(com.p314xaae8f345.mm.R.id.cuu);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            int b17 = i65.a.b(this.f247788e, 1);
            layoutParams.topMargin = b17;
            layoutParams.gravity = 16;
            int i17 = b17 * 2;
            int i18 = b17 * 3;
            this.f247790g.setPadding(i17, i18, i17, i18);
            this.f247790g.setMaxLines(1);
            this.f247790g.setTextColor(i65.a.d(this.f247788e, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            this.f247790g.setTextSize(0, i65.a.p(this.f247788e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            this.f247790g.setBackground(i65.a.i(this.f247788e, com.p314xaae8f345.mm.R.C30861xcebc809e.f563660b26));
            addView(this.f247790g, layoutParams);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18422x36b32e92 c18422x36b32e92 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18422x36b32e92(this.f247788e);
            this.f247789f = c18422x36b32e92;
            c18422x36b32e92.setId(com.p314xaae8f345.mm.R.id.cut);
            this.f247789f.setBackground(i65.a.i(this.f247788e, com.p314xaae8f345.mm.R.C30861xcebc809e.b2i));
            this.f247789f.m46347x1c5c5ff4(i65.a.d(this.f247788e, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            this.f247789f.f150014d.k(0, i65.a.p(this.f247788e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = b17;
            layoutParams2.gravity = 16;
            addView(this.f247789f, layoutParams2);
            android.widget.TextView textView = new android.widget.TextView(this.f247788e);
            this.f247791h = textView;
            textView.setId(com.p314xaae8f345.mm.R.id.cup);
            this.f247791h.setBackground(i65.a.i(this.f247788e, com.p314xaae8f345.mm.R.C30861xcebc809e.b1h));
            this.f247791h.setGravity(17);
            this.f247791h.setMaxLines(1);
            this.f247791h.setTextColor(i65.a.d(this.f247788e, com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
            this.f247791h.setTextSize(0, i65.a.p(this.f247788e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            this.f247790g.setTextSize(0, i65.a.p(this.f247788e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams3.topMargin = b17 * 4;
            addView(this.f247791h, layoutParams3);
            this.f247791h.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateXml", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        } else {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f247788e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570160yx, this);
            inflate.setPadding(0, -3, 0, 0);
            this.f247789f = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18422x36b32e92) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
            this.f247791h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cup);
            this.f247790g = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18117xa07b66ea) inflate.findViewById(com.p314xaae8f345.mm.R.id.cuu);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    public void c(int i17, java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType, java.util.HashMap hashMap, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar, java.lang.String str3, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f247788e = bsVar.f249575h;
        this.f247796p = hashMap;
        this.f247787d = z17;
        this.f247797q = str;
        this.f247798r = str2;
        this.f247799s = i17;
        this.f247789f.m71287xe99d769b(hashMap);
        this.f247789f.m71288x764ba26f(z17);
        this.f247793m = this.f247788e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_3);
        this.f247794n = this.f247788e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_2);
        this.f247790g.m70801xac166b75(str3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go goVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go(this.f247798r, this.f247797q, false, false, 1);
        goVar.f249983f = this.f247800t.f251584w;
        if (i17 == 0) {
            this.f247789f.mo46318x765074af(charSequence);
            this.f247790g.setVisibility(8);
            this.f247791h.setVisibility(0);
            this.f247789f.setVisibility(0);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0 y0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this.f247788e);
            y0Var.f272844q = new android.view.View.OnLongClickListener() { // from class: com.tencent.mm.plugin.sns.ui.CollapsibleTextView$$a
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17953xbf81077c.f247786y;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17953xbf81077c c17953xbf81077c = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17953xbf81077c.this;
                    c17953xbf81077c.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/CollapsibleTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", c17953xbf81077c, array);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$setText$0", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/CollapsibleTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", c17953xbf81077c, array2);
                    c17953xbf81077c.f247789f.performLongClick();
                    yj0.a.i(false, c17953xbf81077c, "com/tencent/mm/plugin/sns/ui/CollapsibleTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$setText$0", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                    yj0.a.i(false, c17953xbf81077c, "com/tencent/mm/plugin/sns/ui/CollapsibleTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return false;
                }
            };
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a aVar = this.f247801u;
            int i18 = this.f247802v;
            y0Var.f272841n = aVar;
            y0Var.f272842o = i18;
            y0Var.f272843p = 30;
            y0Var.f272847t = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r1(this);
            this.f247789f.setOnTouchListener(y0Var);
            this.f247789f.setTag(goVar);
            if (hashMap.get(str) == null) {
                this.f247792i = false;
                this.f247791h.setVisibility(8);
                this.f247789f.mo46343x8dd5167d(8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                return;
            }
            this.f247792i = true;
            int intValue = ((java.lang.Integer) hashMap.get(str)).intValue();
            if (intValue == 0) {
                this.f247791h.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                return;
            } else {
                if (intValue == 1) {
                    this.f247789f.mo46343x8dd5167d(6);
                    this.f247791h.setVisibility(0);
                    this.f247791h.setText(this.f247793m);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                    return;
                }
                if (intValue == 2) {
                    this.f247789f.mo46343x8dd5167d(Integer.MAX_VALUE);
                    this.f247791h.setVisibility(0);
                    this.f247791h.setText(this.f247794n);
                }
            }
        } else {
            this.f247790g.setText(charSequence, bufferType);
            this.f247790g.setTag(goVar);
            this.f247790g.setVisibility(0);
            this.f247791h.setVisibility(8);
            this.f247789f.setVisibility(8);
            this.f247790g.setOnClickListener(bsVar.f249572e.H);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    /* renamed from: getSpreadHeight */
    public int m70564xc860def0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSpreadHeight", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollapsibleTextView", "count:" + this.f247789f.m46322x92d2fac5() + "  height:" + this.f247789f.m46323xcf821e31());
        int m46322x92d2fac5 = (this.f247789f.m46322x92d2fac5() + (-7)) * this.f247789f.m46323xcf821e31();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSpreadHeight", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        return m46322x92d2fac5;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f247799s == 0 && !this.f247787d) {
            if (this.f247792i) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
                return;
            }
            this.f247792i = true;
            if (this.f247789f.m46322x92d2fac5() <= 7) {
                this.f247796p.put(this.f247797q, 0);
            } else {
                this.f247796p.put(this.f247797q, 1);
                this.f247795o.mo50293x3498a0(this.f247804x);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    @Override // android.view.View
    public void setClickable(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f247791h.setClickable(z17);
        this.f247790g.setClickable(z17);
        this.f247789f.setClickable(z17);
        super.setClickable(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    /* renamed from: setContentTextColor */
    public void m70565x8abc0e3f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentTextColor", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f247789f.m46347x1c5c5ff4(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentTextColor", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    @Override // android.view.View
    public void setLongClickable(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLongClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f247791h.setLongClickable(z17);
        this.f247790g.setLongClickable(z17);
        this.f247789f.setLongClickable(z17);
        super.setLongClickable(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLongClickable", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    /* renamed from: setOnNormalClickListener */
    public void m70566x8d5ca514(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnNormalClickListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        this.f247803w = onClickListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnNormalClickListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    /* renamed from: setOpClickListener */
    public void m70567x6485c939(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOpClickListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        android.widget.TextView textView = this.f247791h;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        setOnClickListener(onClickListener);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOpClickListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }

    /* renamed from: setShrinkOrSpreadListener */
    public void m70568x4dbb335(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g3 g3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShrinkOrSpreadListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18422x36b32e92 c18422x36b32e92 = this.f247789f;
        if (c18422x36b32e92 != null) {
            c18422x36b32e92.m71289x4dbb335(g3Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShrinkOrSpreadListener", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
    }
}
