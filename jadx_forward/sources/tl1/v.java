package tl1;

/* loaded from: classes15.dex */
public abstract class v extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f f501751d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f501752e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f501753f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f501754g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f501755h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f501756i;

    /* renamed from: m, reason: collision with root package name */
    public tl1.t f501757m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f501758n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f501759o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f501760p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f501761q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f501762r;

    /* renamed from: s, reason: collision with root package name */
    public int f501763s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f501764t;

    /* renamed from: u, reason: collision with root package name */
    public tl1.u f501765u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p2 f501766v;

    public v(android.content.Context context) {
        super(context);
        this.f501766v = null;
        this.f501763s = getResources().getConfiguration().uiMode;
        setClickable(true);
        setLongClickable(true);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569598fw, (android.view.ViewGroup) this, false);
        this.f501759o = inflate;
        this.f501752e = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564723z3);
        this.f501760p = this.f501759o.findViewById(com.p314xaae8f345.mm.R.id.f564721z1);
        android.view.View findViewById = this.f501759o.findViewById(com.p314xaae8f345.mm.R.id.kvt);
        this.f501755h = findViewById;
        this.f501756i = findViewById.findViewById(com.p314xaae8f345.mm.R.id.f569101p14);
        b();
        this.f501755h.findViewById(com.p314xaae8f345.mm.R.id.azh).setOnClickListener(new tl1.o(this));
        this.f501755h.findViewById(com.p314xaae8f345.mm.R.id.azg).setOnClickListener(new tl1.p(this));
        this.f501755h.setOnClickListener(new tl1.q(this));
        android.view.View findViewById2 = this.f501759o.findViewById(com.p314xaae8f345.mm.R.id.f564723z3);
        findViewById2.setOnClickListener(new tl1.r(this));
        findViewById2.setBackgroundColor(b3.l.m9702x7444d5ad(findViewById2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        addView(this.f501759o, layoutParams);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564720z0);
        this.f501753f = textView;
        textView.setClickable(true);
        this.f501754g = findViewById(com.p314xaae8f345.mm.R.id.f564719yz);
        addOnLayoutChangeListener(new tl1.n(this));
    }

    public final void a() {
        int dimensionPixelSize = e() ? 0 : getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f501760p.getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        this.f501760p.setLayoutParams(layoutParams);
    }

    public final void b() {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        if (e()) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7e);
        } else {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
            dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
            dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7f);
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) this.f501756i.getLayoutParams();
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize2;
        this.f501756i.setLayoutParams(layoutParams);
        this.f501755h.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, dimensionPixelSize3));
    }

    public final void c(boolean z17, java.lang.Object obj) {
        tl1.t tVar;
        if (this.f501758n || (tVar = this.f501757m) == null) {
            return;
        }
        this.f501758n = true;
        tVar.a(z17, obj);
        this.f501758n = false;
    }

    public void d(boolean z17) {
        if (this.f501761q) {
            clearAnimation();
            this.f501761q = false;
        }
        if (this.f501762r || getVisibility() != 0) {
            return;
        }
        c(false, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f fVar = this.f501751d;
        if (fVar != null) {
            fVar.mo51210xc39a57c1(this);
            if (!z17) {
                f();
                return;
            }
            this.f501762r = true;
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559363co);
            this.f501759o.startAnimation(loadAnimation);
            startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559272a0));
            loadAnimation.setAnimationListener(new tl1.m(this));
        }
    }

    public final boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e4 e4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e4.f171956f;
        if (this.f501766v == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandPickerBottomPanelBase", "requireOrientationGetter, orientationGetter is null, use AndroidOrientationGetter as fallback");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            this.f501766v = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o(context);
        }
        return e4Var == this.f501766v.a();
    }

    public final void f() {
        setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        clearAnimation();
        super.setVisibility(8);
        requestLayout();
        this.f501762r = false;
    }

    public final void g(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    /* renamed from: getPicker */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f m166746x2a2c2b84() {
        return this.f501751d;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = configuration.uiMode;
        if (i17 != this.f501763s && this.f501764t == null) {
            this.f501764t = new tl1.s(this);
        }
        this.f501763s = i17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f501757m = null;
        this.f501765u = null;
        removeAllViews();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        if (isShown()) {
            return;
        }
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
    }

    /* renamed from: setHeader */
    public void mo166745xf81398f(java.lang.String str) {
        java.lang.String str2 = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            a();
            android.view.View view = this.f501760p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showNoTitlePlaceHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showNoTitlePlaceHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f501753f.setText("");
            android.view.View view2 = this.f501754g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "hideHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "hideHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f501753f.setVisibility(8);
            return;
        }
        if ("设置时间".equals(str2)) {
            str2 = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571778p5);
        } else if ("设置地区".equals(str2)) {
            str2 = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571777p4);
        } else if ("设置日期".equals(str2)) {
            str2 = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571776p3);
        } else if (str2 == null) {
            str2 = "";
        }
        android.view.View view3 = this.f501760p;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f501754g;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase", "showHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f501753f.setVisibility(0);
        this.f501753f.setText(str2);
    }

    /* renamed from: setOnResultListener */
    public void m166747x3c802832(tl1.t tVar) {
        this.f501757m = tVar;
    }

    /* renamed from: setOnValueUpdateListener */
    public void m166748x4764e8cd(tl1.u uVar) {
        this.f501765u = uVar;
    }

    /* renamed from: setOrientationGetter */
    public void m166749xbc2fc2b9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p2 p2Var) {
        p2Var.mo53131xfb82e301();
        this.f501766v = p2Var;
    }

    /* renamed from: setPickerImpl */
    public void m166750xc7a9edd0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f fVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f fVar3 = this.f501751d;
        if (fVar3 != null) {
            fVar3.mo51209x3f5eee52(this);
        }
        this.f501751d = fVar;
        if (fVar != null) {
            fVar.mo51208x3b13c504(this);
        }
        if (this.f501752e == null || (fVar2 = this.f501751d) == null || fVar2.mo51207xfb86a31b() == null) {
            return;
        }
        this.f501752e.removeAllViews();
        this.f501757m = null;
        this.f501765u = null;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f501752e.addView(this.f501751d.mo51207xfb86a31b(), layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (i17 != 0) {
            d(false);
        } else {
            super.setVisibility(i17);
        }
    }
}
