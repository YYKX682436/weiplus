package al1;

/* loaded from: classes7.dex */
public class b extends android.widget.FrameLayout implements al1.k0, al1.i0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v {
    public static final /* synthetic */ int H = 0;
    public al1.e A;
    public al1.i B;
    public android.view.View.OnLongClickListener C;
    public boolean D;
    public final java.util.Set E;
    public final android.view.View.OnClickListener F;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12750x91300698 G;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f87263d;

    /* renamed from: e, reason: collision with root package name */
    public final im5.c f87264e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f87265f;

    /* renamed from: g, reason: collision with root package name */
    public int f87266g;

    /* renamed from: h, reason: collision with root package name */
    public final bm5.x0 f87267h;

    /* renamed from: i, reason: collision with root package name */
    public final bm5.x0 f87268i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f87269m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f87270n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f87271o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f87272p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f87273q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y f87274r;

    /* renamed from: s, reason: collision with root package name */
    public int f87275s;

    /* renamed from: t, reason: collision with root package name */
    public int f87276t;

    /* renamed from: u, reason: collision with root package name */
    public double f87277u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f87278v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f87279w;

    /* renamed from: x, reason: collision with root package name */
    public final al1.j f87280x;

    /* renamed from: y, reason: collision with root package name */
    public al1.g f87281y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec f87282z;

    public b(android.content.Context context) {
        super(context);
        java.lang.String str = "MicroMsg.AppBrandActionBar#" + hashCode();
        this.f87263d = str;
        im5.c cVar = new im5.c();
        this.f87264e = cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g5 g5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g5(hashCode(), cVar);
        this.f87265f = g5Var;
        this.f87267h = new bm5.x0(new bm5.w0() { // from class: al1.b$$a
            @Override // bm5.w0
            public final java.lang.Object a() {
                int i17 = al1.b.H;
                final al1.b bVar = al1.b.this;
                android.view.ViewStub viewStub = (android.view.ViewStub) bVar.findViewById(com.p314xaae8f345.mm.R.id.em8);
                if (viewStub == null) {
                    return null;
                }
                final android.widget.ImageView imageView = (android.widget.ImageView) viewStub.inflate();
                imageView.setId(com.p314xaae8f345.mm.R.id.f564065gy);
                zk1.m.a(imageView, android.widget.Button.class, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f571343cd), false, null, null, null, null, null, null, null, null, null);
                imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: al1.b$$g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i18 = al1.b.H;
                        al1.b bVar2 = al1.b.this;
                        bVar2.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        android.widget.ImageView imageView2 = imageView;
                        arrayList.add(imageView2);
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", bVar2, array);
                        al1.e eVar = bVar2.A;
                        if (eVar != null && !eVar.b(view)) {
                            java.util.HashSet hashSet = bVar2.f87280x.f87310b;
                            if (!hashSet.isEmpty()) {
                                java.util.Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    ((android.view.View.OnClickListener) it.next()).onClick(imageView2);
                                }
                            }
                        }
                        yj0.a.h(bVar2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                imageView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: al1.b$$h
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        int i18 = al1.b.H;
                        al1.b bVar2 = al1.b.this;
                        bVar2.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", bVar2, array);
                        android.view.View.OnLongClickListener onLongClickListener = bVar2.C;
                        if (onLongClickListener == null) {
                            yj0.a.i(false, bVar2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            return false;
                        }
                        boolean onLongClick = onLongClickListener.onLongClick(view);
                        yj0.a.i(onLongClick, bVar2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                        return onLongClick;
                    }
                });
                return imageView;
            }
        });
        this.f87268i = new bm5.x0(new bm5.w0() { // from class: al1.b$$b
            @Override // bm5.w0
            public final java.lang.Object a() {
                int i17 = al1.b.H;
                final al1.b bVar = al1.b.this;
                android.view.ViewStub viewStub = (android.view.ViewStub) bVar.findViewById(com.p314xaae8f345.mm.R.id.dwr);
                if (viewStub == null) {
                    return null;
                }
                android.widget.ImageView imageView = (android.widget.ImageView) viewStub.inflate();
                imageView.setId(com.p314xaae8f345.mm.R.id.f564060gt);
                zk1.m.a(imageView, android.widget.Button.class, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f571343cd), false, null, null, null, null, null, null, null, null, null);
                imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: al1.b$$e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i18 = al1.b.H;
                        al1.b bVar2 = al1.b.this;
                        bVar2.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", bVar2, array);
                        al1.e eVar = bVar2.A;
                        if (eVar != null) {
                            eVar.a(view);
                        }
                        yj0.a.h(bVar2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                imageView.setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: al1.b$$f
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        int i18 = al1.b.H;
                        al1.b bVar2 = al1.b.this;
                        bVar2.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", bVar2, array);
                        android.view.View.OnLongClickListener onLongClickListener = bVar2.C;
                        if (onLongClickListener == null) {
                            yj0.a.i(false, bVar2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            return false;
                        }
                        boolean onLongClick = onLongClickListener.onLongClick(view);
                        yj0.a.i(onLongClick, bVar2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                        return onLongClick;
                    }
                });
                return imageView;
            }
        });
        this.f87280x = new al1.j();
        this.A = new al1.h(this, null);
        this.D = false;
        this.E = new java.util.LinkedHashSet();
        this.F = new al1.c(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "<init>, context: " + context);
        this.f87278v = true;
        this.f87279w = false;
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569533e2, (android.view.ViewGroup) this, true);
        this.f87266g = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561555lv);
        this.f87275s = -1;
        this.f87276t = b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560119bk);
        this.f87277u = 1.0d;
        this.f87269m = findViewById(com.p314xaae8f345.mm.R.id.f564064gx);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564079hc);
        this.f87271o = textView;
        textView.setClickable(false);
        this.f87282z = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec) findViewById(com.p314xaae8f345.mm.R.id.f564046gl);
        this.f87270n = findViewById(com.p314xaae8f345.mm.R.id.em9);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d.f171933e.o9().m127129x5f6d8be8(g5Var, new al1.f(this));
    }

    /* renamed from: setBackgroundColorInternal */
    private void m2205xd15cc9f0(int i17) {
        if (this.f87279w) {
            super.setBackgroundColor(0);
        } else {
            super.setBackgroundColor(i17);
        }
    }

    public final void a() {
        java.util.Objects.requireNonNull(this.f87273q);
        java.util.Objects.requireNonNull(this.f87274r);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar = this.f87274r;
        yVar.f173656h = this.f87275s;
        yVar.invalidateSelf();
        android.view.View view = this.f87273q;
        if (view instanceof android.widget.ProgressBar) {
            ((android.widget.ProgressBar) view).setIndeterminateDrawable(this.f87274r);
            ((android.widget.ProgressBar) this.f87273q).setIndeterminate(true);
        } else if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12699x37a66562)) {
            view.setBackground(this.f87274r);
        } else {
            iz5.a.g(null, this.f87274r instanceof android.graphics.drawable.Animatable2);
            this.f87273q.setForeground(this.f87274r);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar;
        android.view.View view = this.f87273q;
        if (!(view != null && view.getVisibility() == 0) || (yVar = this.f87274r) == null) {
            return;
        }
        yVar.start();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar = this.f87274r;
        if (yVar != null) {
            yVar.stop();
        }
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f87263d, "destroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar = this.f87274r;
        if (yVar != null) {
            yVar.stop();
        }
        removeAllViews();
        this.A = null;
        this.f87264e.mo10668x2efc64();
    }

    public final void g(boolean z17, java.lang.CharSequence charSequence) {
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z17), charSequence};
        java.lang.String str = this.f87263d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "operateDoubleClickEmitter, isAccessibilityEnable: %b, title: %s", objArr);
        if (z17) {
            if (this.D) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "resetDoubleClickEmitter");
                this.f87271o.setOnClickListener(null);
                this.f87271o.setClickable(false);
                this.D = false;
                return;
            }
            return;
        }
        if (this.E.isEmpty() || this.D) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setupDoubleClickEmitter");
        this.f87271o.setOnClickListener(this.F);
        this.D = true;
    }

    @Override // al1.k0
    /* renamed from: getActionView */
    public android.view.View mo2206x5ca2d9f1() {
        return this;
    }

    /* renamed from: getBackgroundAlpha */
    public final double m2207x30fc4a9a() {
        return this.f87277u;
    }

    @Override // al1.k0
    /* renamed from: getBackgroundColor */
    public final int getF87324d() {
        if (this.f87279w) {
            return 0;
        }
        return this.f87276t;
    }

    /* renamed from: getForegroundColor */
    public int m2211xbe2bf9aa() {
        return this.f87275s;
    }

    /* renamed from: getMainTitle */
    public java.lang.CharSequence m2212xefd74969() {
        return this.f87271o.getText();
    }

    /* renamed from: getNavResetStyleListener */
    public al1.e m2213x3bbc543() {
        return this.A;
    }

    @Override // al1.i0
    public boolean h(boolean z17, al1.h0 h0Var) {
        al1.g gVar = this.f87281y;
        return gVar != null ? gVar.h(z17, h0Var) : z17;
    }

    public void i() {
        if (this.A != null) {
            j();
            this.A.d(this, this.f87267h, this.f87268i, this.f87269m);
        }
        this.f87271o.setTextColor(this.f87275s);
        if (this.f87273q != null && this.f87274r != null) {
            a();
        }
        int i17 = this.f87275s;
        al1.j0 j0Var = al1.j0.WHITE;
        if ((i17 == -1 ? j0Var : al1.j0.BLACK) == j0Var) {
            al1.g gVar = this.f87281y;
            if (gVar != null) {
                gVar.k(-1);
                return;
            }
            return;
        }
        al1.g gVar2 = this.f87281y;
        if (gVar2 != null) {
            gVar2.k(-16777216);
        }
    }

    public final void j() {
        int i17 = (this.f87279w || this.f87278v) ? 8 : 0;
        android.view.View view = this.f87269m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetNavVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetNavVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void l(boolean z17, al1.h0 h0Var) {
        boolean h17 = h(z17, h0Var);
        int i17 = h17 ? 0 : 4;
        this.f87282z.setVisibility(i17);
        if (this.f87282z.getLayoutParams() != null) {
            this.f87282z.getLayoutParams().width = h17 ? -2 : 0;
            this.f87282z.requestLayout();
        }
        al1.g gVar = this.f87281y;
        if (gVar != null) {
            gVar.n(this.f87282z.getVisibility());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12750x91300698 c12750x91300698 = this.G;
        if (c12750x91300698 != null) {
            c12750x91300698.setVisibility(i17);
        }
    }

    public void m(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.view.View view = this.f87269m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "showNavArea", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "showNavArea", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
        int i28 = 0;
        if (com.p314xaae8f345.mm.R.id.f564079hc == view.getId()) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
            android.view.View view2 = this.f87269m;
            if (view2 != null && view2.getVisibility() == 0) {
                i28 = java.lang.Math.max(0, this.f87269m.getMeasuredWidth());
            }
            android.view.View view3 = this.f87270n;
            if (view3 != null && view3.getVisibility() == 0) {
                i28 = java.lang.Math.max(i28, this.f87270n.getMeasuredWidth());
            }
            marginLayoutParams.rightMargin = i28;
            marginLayoutParams.leftMargin = i28;
        } else if (com.p314xaae8f345.mm.R.id.f564061gu == view.getId()) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int paddingStart = view.getPaddingStart() + 0;
            android.view.View view4 = this.f87269m;
            if (view4 != null && view4.getVisibility() == 0) {
                paddingStart += this.f87269m.getMeasuredWidth();
            }
            marginLayoutParams2.leftMargin = paddingStart;
            marginLayoutParams2.setMarginStart(paddingStart);
            int paddingEnd = view.getPaddingEnd() + 0;
            if (this.f87271o != null && android.view.View.MeasureSpec.getMode(i17) != 0) {
                paddingEnd = paddingEnd + (android.view.View.MeasureSpec.getSize(i17) / 2) + (this.f87271o.getMeasuredWidth() / 2);
            }
            marginLayoutParams2.rightMargin = paddingEnd;
            marginLayoutParams2.setMarginEnd(paddingEnd);
        }
        super.measureChildWithMargins(view, i17, i18, i19, i27);
    }

    @Override // android.view.View
    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        this.f87269m.cancelPendingInputEvents();
        android.widget.ImageView[] imageViewArr = {(android.widget.ImageView) this.f87267h.d(), (android.widget.ImageView) this.f87268i.d()};
        for (int i17 = 0; i17 < 2; i17++) {
            android.widget.ImageView imageView = imageViewArr[i17];
            if (imageView != null) {
                imageView.cancelPendingInputEvents();
                imageView.setPressed(false);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, this.f87266g), 1073741824));
    }

    /* renamed from: setActionBarHeight */
    public void m2214xe72f08c2(int i17) {
        if (this.f87266g != i17) {
            this.f87266g = i17;
            invalidate();
        }
    }

    @Override // al1.k0
    /* renamed from: setBackButtonClickListener */
    public void mo2215x1ae0b121(android.view.View.OnClickListener onClickListener) {
        al1.j jVar = this.f87280x;
        if (onClickListener == null) {
            jVar.getClass();
        } else {
            jVar.f87310b.add(onClickListener);
        }
    }

    /* renamed from: setBackgroundAlpha */
    public final void m2216x67d2e40e(double d17) {
        this.f87277u = d17;
        if (this.f87279w) {
            return;
        }
        android.graphics.drawable.Drawable background = super.getBackground();
        if (background == null) {
            m2205xd15cc9f0(this.f87276t);
            background = super.getBackground();
        }
        background.setAlpha((int) (d17 * 255.0d));
    }

    @Override // android.view.View, al1.k0
    /* renamed from: setBackgroundColor */
    public final void mo134899x67f06213(int i17) {
        this.f87276t = i17;
        m2205xd15cc9f0(i17);
        m2216x67d2e40e(this.f87277u);
    }

    /* renamed from: setCapsuleBarInteractionDelegate */
    public final void m2217x2f33e7ef(al1.g gVar) {
        this.f87281y = gVar;
        if (gVar != null) {
            final al1.j jVar = this.f87280x;
            java.util.Objects.requireNonNull(jVar);
            gVar.e(new android.view.View.OnClickListener() { // from class: al1.b$$c
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.HashSet hashSet = al1.j.this.f87311c;
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((android.view.View.OnClickListener) it.next()).onClick(view);
                    }
                }
            });
            al1.g gVar2 = this.f87281y;
            java.util.Objects.requireNonNull(jVar);
            gVar2.d(new android.view.View.OnClickListener() { // from class: al1.b$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.HashSet hashSet = al1.j.this.f87309a;
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((android.view.View.OnClickListener) it.next()).onClick(view);
                    }
                }
            });
        }
    }

    @Override // al1.k0
    /* renamed from: setCloseButtonClickListener */
    public void mo2218x262881b4(android.view.View.OnClickListener onClickListener) {
        al1.j jVar = this.f87280x;
        if (onClickListener == null) {
            jVar.getClass();
        } else {
            jVar.f87309a.add(onClickListener);
        }
    }

    @Override // al1.k0
    /* renamed from: setForegroundColor */
    public void mo2219xf502931e(int i17) {
        this.f87275s = i17;
        i();
    }

    @Override // al1.k0
    /* renamed from: setForegroundStyle */
    public void mo2220xf5e6816c(java.lang.String str) {
        this.f87275s = al1.j0.a(str).f87315d;
        i();
    }

    /* renamed from: setFullscreenMode */
    public void m2222xad580900(boolean z17) {
        al1.e eVar;
        boolean z18 = this.f87279w != z17;
        this.f87279w = z17;
        j();
        if (z18 && (eVar = this.A) != null) {
            eVar.d(this, this.f87267h, this.f87268i, this.f87269m);
        }
        this.f87271o.setVisibility(this.f87279w ? 4 : 0);
        if (this.f87279w) {
            android.view.View view = this.f87273q;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetTitleVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetTitleVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            mo2223x5b5c5185(this.f87272p);
        }
        requestLayout();
        mo134899x67f06213(this.f87276t);
        mo2223x5b5c5185(this.f87272p);
    }

    @Override // al1.k0
    /* renamed from: setLoadingIconVisibility */
    public void mo2223x5b5c5185(boolean z17) {
        android.view.ViewStub viewStub;
        this.f87272p = z17;
        al1.i iVar = this.B;
        if (iVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bd) iVar).f167978g = z17;
            return;
        }
        if (this.f87279w) {
            android.view.View view = this.f87273q;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y yVar = this.f87274r;
            if (yVar != null) {
                yVar.stop();
                return;
            }
            return;
        }
        if (this.f87273q == null) {
            if (!z17 || (viewStub = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.f564062gv)) == null) {
                return;
            }
            viewStub.setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569537e6);
            this.f87273q = viewStub.inflate();
        }
        android.view.View view2 = this.f87273q;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!z17) {
            this.f87274r.stop();
            return;
        }
        if (this.f87274r == null) {
            this.f87274r = this.f87273q instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12699x37a66562 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.t(getContext()) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.y(getContext());
        }
        a();
        this.f87274r.b();
        this.f87274r.start();
    }

    @Override // al1.k0
    /* renamed from: setMainTitle */
    public void mo2224x4c2b09dd(java.lang.CharSequence charSequence) {
        java.lang.Object tag;
        float f17;
        boolean isLayoutRequested = isLayoutRequested();
        this.f87271o.setText(charSequence);
        android.widget.TextView textView = this.f87271o;
        boolean z17 = !this.f87279w;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            n3.e1.g(textView, valueOf.booleanValue());
        } else {
            if (i17 >= 28) {
                tag = java.lang.Boolean.valueOf(n3.e1.c(textView));
            } else {
                tag = textView.getTag(com.p314xaae8f345.mm.R.id.nwh);
                if (!java.lang.Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            java.lang.Boolean bool = (java.lang.Boolean) tag;
            if (true ^ ((bool != null && bool.booleanValue()) == (valueOf != null && valueOf.booleanValue()))) {
                n3.l1.d(textView);
                textView.setTag(com.p314xaae8f345.mm.R.id.nwh, valueOf);
                n3.l1.h(textView, 0);
            }
        }
        float f18 = i65.a.f(this.f87271o.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
        android.widget.TextView textView2 = this.f87271o;
        float q17 = i65.a.q(textView2.getContext());
        if (q17 == 0.8f) {
            f17 = 0.91f;
        } else {
            if (q17 != 1.0f) {
                if (q17 == 1.1f || q17 == 1.12f) {
                    f17 = 1.11f;
                } else if (q17 == 1.125f || q17 == 1.4f || q17 == 1.55f || q17 == 1.65f) {
                    f17 = 1.18f;
                } else {
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    if (z65.c.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
                        throw new java.lang.IllegalStateException(java.lang.String.format("unhandled scale[%f]", java.lang.Float.valueOf(q17)));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandActionBarCommon", "getActionBarTextSizeScale: unhandled scale[%f]", java.lang.Float.valueOf(q17));
                }
            }
            f17 = 1.0f;
        }
        textView2.setTextSize(0, f18 * f17);
        g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d.f171933e.mo53086xdac2174d(), charSequence);
        if (isLayoutRequested) {
            requestLayout();
        }
    }

    /* renamed from: setNavButtonLongClickListener */
    public void m2225x2c2358d(android.view.View.OnLongClickListener onLongClickListener) {
        this.C = onLongClickListener;
    }

    /* renamed from: setNavContainerMinimumWidth */
    public void m2226xc8bb9298(int i17) {
        android.view.View view = this.f87269m;
        if (view != null) {
            view.setMinimumWidth(i17);
        }
    }

    @Override // al1.k0
    /* renamed from: setNavHidden */
    public void mo2227x506dbe6b(boolean z17) {
        this.f87278v = z17;
        j();
        i();
    }

    /* renamed from: setNavLoadingIconVisibilityResetListener */
    public void m2228x63bd8add(al1.i iVar) {
        this.B = iVar;
    }

    /* renamed from: setNavResetStyleListener */
    public void m2229xd3ce77b7(al1.e eVar) {
        this.A = eVar;
    }

    /* renamed from: setOptionButtonClickListener */
    public void m2230x9b5ddf53(android.view.View.OnClickListener onClickListener) {
        al1.j jVar = this.f87280x;
        if (onClickListener == null) {
            jVar.getClass();
        } else {
            jVar.f87311c.add(onClickListener);
        }
    }

    /* renamed from: getCapsuleView, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12501xc5d62fec m2209x716f693c() {
        return this.f87282z;
    }

    /* renamed from: setForegroundStyle */
    public void m2221xf5e6816c(boolean z17) {
        this.f87275s = z17 ? -16777216 : -1;
        i();
    }
}
