package com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44;

/* renamed from: com.tencent.mm.plugin.pwdgroup.ui.widget.MMKeyBoardView */
/* loaded from: classes15.dex */
public class ViewOnClickListenerC16927x3ad0e4cc extends android.widget.LinearLayout implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    public int A;
    public float B;
    public android.content.res.ColorStateList C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f236311J;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f236312d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f236313e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f236314f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f236315g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f236316h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f236317i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f236318m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f236319n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f236320o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f236321p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageButton f236322q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f236323r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f236324s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f236325t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f236326u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f236327v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f236328w;

    /* renamed from: x, reason: collision with root package name */
    public gs3.d f236329x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f236330y;

    /* renamed from: z, reason: collision with root package name */
    public int f236331z;

    public ViewOnClickListenerC16927x3ad0e4cc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16928x94d2c092 c16928x94d2c092;
        gs3.d dVar = this.f236329x;
        if (dVar == null || !this.f236330y || (c16928x94d2c092 = (activityC16925x87b5f55d = ((fs3.p) dVar).f347847a).f236292n) == null) {
            return;
        }
        boolean z17 = activityC16925x87b5f55d.f236286e;
        java.lang.StringBuilder sb6 = c16928x94d2c092.f236332d;
        if (!z17) {
            if (android.text.TextUtils.isEmpty(str) || c16928x94d2c092.f236333e) {
                return;
            }
            sb6.append(str);
            c16928x94d2c092.a();
            c16928x94d2c092.c();
            return;
        }
        c16928x94d2c092.b();
        if (!android.text.TextUtils.isEmpty(str) && !c16928x94d2c092.f236333e) {
            sb6.append(str);
            c16928x94d2c092.a();
            c16928x94d2c092.c();
        }
        activityC16925x87b5f55d.Z6(fs3.u.Normal);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        gs3.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16928x94d2c092 c16928x94d2c092;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f236330y;
        if (!z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view == this.f236312d) {
            a("0");
        } else if (view == this.f236313e) {
            a("1");
        } else if (view == this.f236314f) {
            a("2");
        } else if (view == this.f236315g) {
            a("3");
        } else if (view == this.f236316h) {
            a("4");
        } else if (view == this.f236317i) {
            a("5");
        } else if (view == this.f236318m) {
            a("6");
        } else if (view == this.f236319n) {
            a("7");
        } else if (view == this.f236320o) {
            a("8");
        } else if (view == this.f236321p) {
            a("9");
        } else if (view == this.f236322q && (dVar = this.f236329x) != null && z17 && (c16928x94d2c092 = (activityC16925x87b5f55d = ((fs3.p) dVar).f347847a).f236292n) != null) {
            if (activityC16925x87b5f55d.f236286e) {
                c16928x94d2c092.b();
                activityC16925x87b5f55d.Z6(fs3.u.Normal);
            } else {
                int i17 = c16928x94d2c092.f236334f;
                if (i17 > 0) {
                    c16928x94d2c092.f236332d.deleteCharAt(i17 - 1);
                }
                c16928x94d2c092.a();
                c16928x94d2c092.c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.E = getWidth();
        this.F = getHeight();
        int i28 = this.A;
        int i29 = -i28;
        int i37 = this.I;
        int i38 = (i37 - i28) + 1;
        int i39 = ((i37 * 2) - i28) + 2;
        int i47 = this.f236311J;
        int i48 = i47 + 2;
        int i49 = (i47 * 2) + 3;
        int i57 = (i47 * 3) + 4;
        this.f236313e.layout(i29, 1, this.G + i29, this.H + 1);
        this.f236314f.layout(i38, 1, this.G + i38, this.H + 1);
        this.f236315g.layout(i39, 1, this.G + i39, this.H + 1);
        this.f236316h.layout(i29, i48, this.G + i29, this.H + i48);
        this.f236317i.layout(i38, i48, this.G + i38, this.H + i48);
        this.f236318m.layout(i39, i48, this.G + i39, this.H + i48);
        this.f236319n.layout(i29, i49, this.G + i29, this.H + i49);
        this.f236320o.layout(i38, i49, this.G + i38, this.H + i49);
        this.f236321p.layout(i39, i49, this.G + i39, this.H + i49);
        this.f236312d.layout(i38, i57, this.G + i38, this.H + i57);
        this.f236322q.layout(i39, i57, this.G + i39, this.H + i57);
        android.view.View view = this.f236323r;
        int i58 = this.f236331z;
        view.layout(0, i58 + 1, this.E, i58 + 1 + 1);
        android.view.View view2 = this.f236324s;
        int i59 = this.f236331z;
        view2.layout(0, i48 + i59, this.E, i48 + i59 + 1);
        android.view.View view3 = this.f236325t;
        int i66 = this.f236331z;
        view3.layout(0, i49 + i66, this.E, i49 + i66 + 1);
        android.view.View view4 = this.f236326u;
        int i67 = this.f236331z;
        view4.layout(0, i57 + i67, this.E, i57 + i67 + 1);
        android.view.View view5 = this.f236327v;
        int i68 = this.I;
        view5.layout(i68 + 1, this.f236331z, i68 + 2, this.F);
        android.view.View view6 = this.f236328w;
        int i69 = this.I;
        view6.layout((i69 * 2) + 2, this.f236331z, (i69 * 2) + 3, this.F);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        gs3.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.p1970xd1075a44.C16928x94d2c092 c16928x94d2c092;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view == this.f236322q && (dVar = this.f236329x) != null && this.f236330y && (c16928x94d2c092 = ((fs3.p) dVar).f347847a.f236292n) != null) {
            c16928x94d2c092.b();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.E = getWidth();
        int height = getHeight();
        this.F = height;
        int i19 = this.E;
        if (i19 != 0 && height != 0) {
            int i27 = (i19 - 2) / 3;
            this.I = i27;
            int i28 = this.f236331z;
            int i29 = ((height - i28) - 4) / 4;
            this.f236311J = i29;
            this.G = i27 + (this.A * 2);
            this.H = i29 + (i28 * 2);
        }
        this.f236313e.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236314f.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236315g.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236316h.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236317i.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236318m.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236319n.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236320o.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236321p.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236312d.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236322q.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f236323r.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f236324s.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f236325t.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f236326u.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f236327v.measure(android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
        this.f236328w.measure(android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
    }

    /* renamed from: setKeyBoardEnable */
    public void m67749xbfd5992c(boolean z17) {
        this.f236330y = z17;
        this.f236312d.setEnabled(z17);
        this.f236313e.setEnabled(z17);
        this.f236314f.setEnabled(z17);
        this.f236315g.setEnabled(z17);
        this.f236316h.setEnabled(z17);
        this.f236317i.setEnabled(z17);
        this.f236318m.setEnabled(z17);
        this.f236319n.setEnabled(z17);
        this.f236320o.setEnabled(z17);
        this.f236321p.setEnabled(z17);
        this.f236322q.setEnabled(z17);
    }

    /* renamed from: setOnInputDeleteListener */
    public void m67750xa96d6a48(gs3.d dVar) {
        this.f236329x = dVar;
    }

    public ViewOnClickListenerC16927x3ad0e4cc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f236330y = true;
        this.f236331z = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a3e);
        this.A = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a3f);
        this.B = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a3g);
        this.C = getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560823v6);
        this.D = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560822v5);
        this.f236312d = new android.widget.Button(context);
        this.f236313e = new android.widget.Button(context);
        this.f236314f = new android.widget.Button(context);
        this.f236315g = new android.widget.Button(context);
        this.f236316h = new android.widget.Button(context);
        this.f236317i = new android.widget.Button(context);
        this.f236318m = new android.widget.Button(context);
        this.f236319n = new android.widget.Button(context);
        this.f236320o = new android.widget.Button(context);
        this.f236321p = new android.widget.Button(context);
        this.f236322q = new android.widget.ImageButton(context);
        this.f236323r = new android.view.View(context);
        this.f236323r = new android.view.View(context);
        this.f236324s = new android.view.View(context);
        this.f236325t = new android.view.View(context);
        this.f236326u = new android.view.View(context);
        this.f236327v = new android.view.View(context);
        this.f236328w = new android.view.View(context);
        this.f236312d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236313e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236314f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236315g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236316h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236317i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236318m.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236319n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236320o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236317i.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236321p.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236322q.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563435ai3);
        this.f236322q.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563436ai4);
        this.f236322q.setContentDescription("删除");
        this.f236312d.setText("0");
        this.f236313e.setText("1");
        this.f236314f.setText("2");
        this.f236315g.setText("3");
        this.f236316h.setText("4");
        this.f236317i.setText("5");
        this.f236318m.setText("6");
        this.f236319n.setText("7");
        this.f236320o.setText("8");
        this.f236321p.setText("9");
        this.f236312d.setGravity(17);
        this.f236313e.setGravity(17);
        this.f236314f.setGravity(17);
        this.f236315g.setGravity(17);
        this.f236316h.setGravity(17);
        this.f236317i.setGravity(17);
        this.f236318m.setGravity(17);
        this.f236319n.setGravity(17);
        this.f236320o.setGravity(17);
        this.f236321p.setGravity(17);
        this.f236312d.setTextSize(0, this.B);
        this.f236313e.setTextSize(0, this.B);
        this.f236314f.setTextSize(0, this.B);
        this.f236315g.setTextSize(0, this.B);
        this.f236316h.setTextSize(0, this.B);
        this.f236317i.setTextSize(0, this.B);
        this.f236318m.setTextSize(0, this.B);
        this.f236319n.setTextSize(0, this.B);
        this.f236320o.setTextSize(0, this.B);
        this.f236321p.setTextSize(0, this.B);
        this.f236312d.setTextColor(this.C);
        this.f236313e.setTextColor(this.C);
        this.f236314f.setTextColor(this.C);
        this.f236315g.setTextColor(this.C);
        this.f236316h.setTextColor(this.C);
        this.f236317i.setTextColor(this.C);
        this.f236318m.setTextColor(this.C);
        this.f236319n.setTextColor(this.C);
        this.f236320o.setTextColor(this.C);
        this.f236321p.setTextColor(this.C);
        this.f236312d.setOnClickListener(this);
        this.f236313e.setOnClickListener(this);
        this.f236314f.setOnClickListener(this);
        this.f236315g.setOnClickListener(this);
        this.f236316h.setOnClickListener(this);
        this.f236317i.setOnClickListener(this);
        this.f236318m.setOnClickListener(this);
        this.f236319n.setOnClickListener(this);
        this.f236320o.setOnClickListener(this);
        this.f236321p.setOnClickListener(this);
        this.f236322q.setOnClickListener(this);
        this.f236322q.setOnLongClickListener(this);
        this.f236323r.setBackgroundColor(this.D);
        this.f236323r.setBackgroundColor(this.D);
        this.f236324s.setBackgroundColor(this.D);
        this.f236325t.setBackgroundColor(this.D);
        this.f236326u.setBackgroundColor(this.D);
        this.f236327v.setBackgroundColor(this.D);
        this.f236328w.setBackgroundColor(this.D);
        addView(this.f236312d);
        addView(this.f236313e);
        addView(this.f236314f);
        addView(this.f236315g);
        addView(this.f236316h);
        addView(this.f236317i);
        addView(this.f236318m);
        addView(this.f236319n);
        addView(this.f236320o);
        addView(this.f236321p);
        addView(this.f236322q);
        addView(this.f236323r);
        addView(this.f236324s);
        addView(this.f236325t);
        addView(this.f236326u);
        addView(this.f236327v);
        addView(this.f236328w);
        post(new gs3.c(this));
    }
}
