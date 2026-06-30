package al1;

/* loaded from: classes7.dex */
public class b extends android.widget.FrameLayout implements al1.k0, al1.i0, com.tencent.mm.plugin.appbrand.jsapi.x, com.tencent.mm.plugin.appbrand.jsapi.v {
    public static final /* synthetic */ int H = 0;
    public al1.e A;
    public al1.i B;
    public android.view.View.OnLongClickListener C;
    public boolean D;
    public final java.util.Set E;
    public final android.view.View.OnClickListener F;
    public com.tencent.mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView G;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f5730d;

    /* renamed from: e, reason: collision with root package name */
    public final im5.c f5731e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.y f5732f;

    /* renamed from: g, reason: collision with root package name */
    public int f5733g;

    /* renamed from: h, reason: collision with root package name */
    public final bm5.x0 f5734h;

    /* renamed from: i, reason: collision with root package name */
    public final bm5.x0 f5735i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f5736m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f5737n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f5738o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5739p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f5740q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.y f5741r;

    /* renamed from: s, reason: collision with root package name */
    public int f5742s;

    /* renamed from: t, reason: collision with root package name */
    public int f5743t;

    /* renamed from: u, reason: collision with root package name */
    public double f5744u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5745v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5746w;

    /* renamed from: x, reason: collision with root package name */
    public final al1.j f5747x;

    /* renamed from: y, reason: collision with root package name */
    public al1.g f5748y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView f5749z;

    public b(android.content.Context context) {
        super(context);
        java.lang.String str = "MicroMsg.AppBrandActionBar#" + hashCode();
        this.f5730d = str;
        im5.c cVar = new im5.c();
        this.f5731e = cVar;
        com.tencent.mm.plugin.appbrand.utils.g5 g5Var = new com.tencent.mm.plugin.appbrand.utils.g5(hashCode(), cVar);
        this.f5732f = g5Var;
        this.f5734h = new bm5.x0(new bm5.w0() { // from class: al1.b$$a
            @Override // bm5.w0
            public final java.lang.Object a() {
                int i17 = al1.b.H;
                final al1.b bVar = al1.b.this;
                android.view.ViewStub viewStub = (android.view.ViewStub) bVar.findViewById(com.tencent.mm.R.id.em8);
                if (viewStub == null) {
                    return null;
                }
                final android.widget.ImageView imageView = (android.widget.ImageView) viewStub.inflate();
                imageView.setId(com.tencent.mm.R.id.f482532gy);
                zk1.m.a(imageView, android.widget.Button.class, java.lang.Integer.valueOf(com.tencent.mm.R.string.f489810cd), false, null, null, null, null, null, null, null, null, null);
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
                            java.util.HashSet hashSet = bVar2.f5747x.f5777b;
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
        this.f5735i = new bm5.x0(new bm5.w0() { // from class: al1.b$$b
            @Override // bm5.w0
            public final java.lang.Object a() {
                int i17 = al1.b.H;
                final al1.b bVar = al1.b.this;
                android.view.ViewStub viewStub = (android.view.ViewStub) bVar.findViewById(com.tencent.mm.R.id.dwr);
                if (viewStub == null) {
                    return null;
                }
                android.widget.ImageView imageView = (android.widget.ImageView) viewStub.inflate();
                imageView.setId(com.tencent.mm.R.id.f482527gt);
                zk1.m.a(imageView, android.widget.Button.class, java.lang.Integer.valueOf(com.tencent.mm.R.string.f489810cd), false, null, null, null, null, null, null, null, null, null);
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
        this.f5747x = new al1.j();
        this.A = new al1.h(this, null);
        this.D = false;
        this.E = new java.util.LinkedHashSet();
        this.F = new al1.c(this);
        com.tencent.mars.xlog.Log.i(str, "<init>, context: " + context);
        this.f5745v = true;
        this.f5746w = false;
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488000e2, (android.view.ViewGroup) this, true);
        this.f5733g = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480022lv);
        this.f5742s = -1;
        this.f5743t = b3.l.getColor(getContext(), com.tencent.mm.R.color.f478586bk);
        this.f5744u = 1.0d;
        this.f5736m = findViewById(com.tencent.mm.R.id.f482531gx);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482546hc);
        this.f5738o = textView;
        textView.setClickable(false);
        this.f5749z = (com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView) findViewById(com.tencent.mm.R.id.f482513gl);
        this.f5737n = findViewById(com.tencent.mm.R.id.em9);
        com.tencent.mm.plugin.appbrand.utils.d.f90400e.o9().uiObserve(g5Var, new al1.f(this));
    }

    private void setBackgroundColorInternal(int i17) {
        if (this.f5746w) {
            super.setBackgroundColor(0);
        } else {
            super.setBackgroundColor(i17);
        }
    }

    public final void a() {
        java.util.Objects.requireNonNull(this.f5740q);
        java.util.Objects.requireNonNull(this.f5741r);
        com.tencent.mm.plugin.appbrand.widget.y yVar = this.f5741r;
        yVar.f92123h = this.f5742s;
        yVar.invalidateSelf();
        android.view.View view = this.f5740q;
        if (view instanceof android.widget.ProgressBar) {
            ((android.widget.ProgressBar) view).setIndeterminateDrawable(this.f5741r);
            ((android.widget.ProgressBar) this.f5740q).setIndeterminate(true);
        } else if (!(view instanceof com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar)) {
            view.setBackground(this.f5741r);
        } else {
            iz5.a.g(null, this.f5741r instanceof android.graphics.drawable.Animatable2);
            this.f5740q.setForeground(this.f5741r);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        com.tencent.mm.plugin.appbrand.widget.y yVar;
        android.view.View view = this.f5740q;
        if (!(view != null && view.getVisibility() == 0) || (yVar = this.f5741r) == null) {
            return;
        }
        yVar.start();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        com.tencent.mm.plugin.appbrand.widget.y yVar = this.f5741r;
        if (yVar != null) {
            yVar.stop();
        }
    }

    public void f() {
        com.tencent.mars.xlog.Log.i(this.f5730d, "destroy");
        com.tencent.mm.plugin.appbrand.widget.y yVar = this.f5741r;
        if (yVar != null) {
            yVar.stop();
        }
        removeAllViews();
        this.A = null;
        this.f5731e.dead();
    }

    public final void g(boolean z17, java.lang.CharSequence charSequence) {
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z17), charSequence};
        java.lang.String str = this.f5730d;
        com.tencent.mars.xlog.Log.i(str, "operateDoubleClickEmitter, isAccessibilityEnable: %b, title: %s", objArr);
        if (z17) {
            if (this.D) {
                com.tencent.mars.xlog.Log.i(str, "resetDoubleClickEmitter");
                this.f5738o.setOnClickListener(null);
                this.f5738o.setClickable(false);
                this.D = false;
                return;
            }
            return;
        }
        if (this.E.isEmpty() || this.D) {
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "setupDoubleClickEmitter");
        this.f5738o.setOnClickListener(this.F);
        this.D = true;
    }

    @Override // al1.k0
    public android.view.View getActionView() {
        return this;
    }

    public final double getBackgroundAlpha() {
        return this.f5744u;
    }

    @Override // al1.k0
    /* renamed from: getBackgroundColor */
    public final int getF5791d() {
        if (this.f5746w) {
            return 0;
        }
        return this.f5743t;
    }

    public int getForegroundColor() {
        return this.f5742s;
    }

    public java.lang.CharSequence getMainTitle() {
        return this.f5738o.getText();
    }

    public al1.e getNavResetStyleListener() {
        return this.A;
    }

    @Override // al1.i0
    public boolean h(boolean z17, al1.h0 h0Var) {
        al1.g gVar = this.f5748y;
        return gVar != null ? gVar.h(z17, h0Var) : z17;
    }

    public void i() {
        if (this.A != null) {
            j();
            this.A.d(this, this.f5734h, this.f5735i, this.f5736m);
        }
        this.f5738o.setTextColor(this.f5742s);
        if (this.f5740q != null && this.f5741r != null) {
            a();
        }
        int i17 = this.f5742s;
        al1.j0 j0Var = al1.j0.WHITE;
        if ((i17 == -1 ? j0Var : al1.j0.BLACK) == j0Var) {
            al1.g gVar = this.f5748y;
            if (gVar != null) {
                gVar.k(-1);
                return;
            }
            return;
        }
        al1.g gVar2 = this.f5748y;
        if (gVar2 != null) {
            gVar2.k(-16777216);
        }
    }

    public final void j() {
        int i17 = (this.f5746w || this.f5745v) ? 8 : 0;
        android.view.View view = this.f5736m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetNavVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetNavVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void l(boolean z17, al1.h0 h0Var) {
        boolean h17 = h(z17, h0Var);
        int i17 = h17 ? 0 : 4;
        this.f5749z.setVisibility(i17);
        if (this.f5749z.getLayoutParams() != null) {
            this.f5749z.getLayoutParams().width = h17 ? -2 : 0;
            this.f5749z.requestLayout();
        }
        al1.g gVar = this.f5748y;
        if (gVar != null) {
            gVar.n(this.f5749z.getVisibility());
        }
        com.tencent.mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView appBrandActionBarCustomImageView = this.G;
        if (appBrandActionBarCustomImageView != null) {
            appBrandActionBarCustomImageView.setVisibility(i17);
        }
    }

    public void m(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.view.View view = this.f5736m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        if (com.tencent.mm.R.id.f482546hc == view.getId()) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
            android.view.View view2 = this.f5736m;
            if (view2 != null && view2.getVisibility() == 0) {
                i28 = java.lang.Math.max(0, this.f5736m.getMeasuredWidth());
            }
            android.view.View view3 = this.f5737n;
            if (view3 != null && view3.getVisibility() == 0) {
                i28 = java.lang.Math.max(i28, this.f5737n.getMeasuredWidth());
            }
            marginLayoutParams.rightMargin = i28;
            marginLayoutParams.leftMargin = i28;
        } else if (com.tencent.mm.R.id.f482528gu == view.getId()) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int paddingStart = view.getPaddingStart() + 0;
            android.view.View view4 = this.f5736m;
            if (view4 != null && view4.getVisibility() == 0) {
                paddingStart += this.f5736m.getMeasuredWidth();
            }
            marginLayoutParams2.leftMargin = paddingStart;
            marginLayoutParams2.setMarginStart(paddingStart);
            int paddingEnd = view.getPaddingEnd() + 0;
            if (this.f5738o != null && android.view.View.MeasureSpec.getMode(i17) != 0) {
                paddingEnd = paddingEnd + (android.view.View.MeasureSpec.getSize(i17) / 2) + (this.f5738o.getMeasuredWidth() / 2);
            }
            marginLayoutParams2.rightMargin = paddingEnd;
            marginLayoutParams2.setMarginEnd(paddingEnd);
        }
        super.measureChildWithMargins(view, i17, i18, i19, i27);
    }

    @Override // android.view.View
    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        this.f5736m.cancelPendingInputEvents();
        android.widget.ImageView[] imageViewArr = {(android.widget.ImageView) this.f5734h.d(), (android.widget.ImageView) this.f5735i.d()};
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
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, this.f5733g), 1073741824));
    }

    public void setActionBarHeight(int i17) {
        if (this.f5733g != i17) {
            this.f5733g = i17;
            invalidate();
        }
    }

    @Override // al1.k0
    public void setBackButtonClickListener(android.view.View.OnClickListener onClickListener) {
        al1.j jVar = this.f5747x;
        if (onClickListener == null) {
            jVar.getClass();
        } else {
            jVar.f5777b.add(onClickListener);
        }
    }

    public final void setBackgroundAlpha(double d17) {
        this.f5744u = d17;
        if (this.f5746w) {
            return;
        }
        android.graphics.drawable.Drawable background = super.getBackground();
        if (background == null) {
            setBackgroundColorInternal(this.f5743t);
            background = super.getBackground();
        }
        background.setAlpha((int) (d17 * 255.0d));
    }

    @Override // android.view.View, al1.k0
    public final void setBackgroundColor(int i17) {
        this.f5743t = i17;
        setBackgroundColorInternal(i17);
        setBackgroundAlpha(this.f5744u);
    }

    public final void setCapsuleBarInteractionDelegate(al1.g gVar) {
        this.f5748y = gVar;
        if (gVar != null) {
            final al1.j jVar = this.f5747x;
            java.util.Objects.requireNonNull(jVar);
            gVar.e(new android.view.View.OnClickListener() { // from class: al1.b$$c
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.HashSet hashSet = al1.j.this.f5778c;
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((android.view.View.OnClickListener) it.next()).onClick(view);
                    }
                }
            });
            al1.g gVar2 = this.f5748y;
            java.util.Objects.requireNonNull(jVar);
            gVar2.d(new android.view.View.OnClickListener() { // from class: al1.b$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    java.util.HashSet hashSet = al1.j.this.f5776a;
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
    public void setCloseButtonClickListener(android.view.View.OnClickListener onClickListener) {
        al1.j jVar = this.f5747x;
        if (onClickListener == null) {
            jVar.getClass();
        } else {
            jVar.f5776a.add(onClickListener);
        }
    }

    @Override // al1.k0
    public void setForegroundColor(int i17) {
        this.f5742s = i17;
        i();
    }

    @Override // al1.k0
    public void setForegroundStyle(java.lang.String str) {
        this.f5742s = al1.j0.a(str).f5782d;
        i();
    }

    public void setFullscreenMode(boolean z17) {
        al1.e eVar;
        boolean z18 = this.f5746w != z17;
        this.f5746w = z17;
        j();
        if (z18 && (eVar = this.A) != null) {
            eVar.d(this, this.f5734h, this.f5735i, this.f5736m);
        }
        this.f5738o.setVisibility(this.f5746w ? 4 : 0);
        if (this.f5746w) {
            android.view.View view = this.f5740q;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetTitleVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "resetTitleVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            setLoadingIconVisibility(this.f5739p);
        }
        requestLayout();
        setBackgroundColor(this.f5743t);
        setLoadingIconVisibility(this.f5739p);
    }

    @Override // al1.k0
    public void setLoadingIconVisibility(boolean z17) {
        android.view.ViewStub viewStub;
        this.f5739p = z17;
        al1.i iVar = this.B;
        if (iVar != null) {
            ((com.tencent.mm.plugin.appbrand.page.bd) iVar).f86445g = z17;
            return;
        }
        if (this.f5746w) {
            android.view.View view = this.f5740q;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.appbrand.widget.y yVar = this.f5741r;
            if (yVar != null) {
                yVar.stop();
                return;
            }
            return;
        }
        if (this.f5740q == null) {
            if (!z17 || (viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.f482529gv)) == null) {
                return;
            }
            viewStub.setLayoutResource(com.tencent.mm.R.layout.f488004e6);
            this.f5740q = viewStub.inflate();
        }
        android.view.View view2 = this.f5740q;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandActionBar", "setLoadingIconVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!z17) {
            this.f5741r.stop();
            return;
        }
        if (this.f5741r == null) {
            this.f5741r = this.f5740q instanceof com.tencent.mm.plugin.appbrand.ui.SimplifiedLoadingProgressBar ? new com.tencent.mm.plugin.appbrand.widget.t(getContext()) : new com.tencent.mm.plugin.appbrand.widget.y(getContext());
        }
        a();
        this.f5741r.b();
        this.f5741r.start();
    }

    @Override // al1.k0
    public void setMainTitle(java.lang.CharSequence charSequence) {
        java.lang.Object tag;
        float f17;
        boolean isLayoutRequested = isLayoutRequested();
        this.f5738o.setText(charSequence);
        android.widget.TextView textView = this.f5738o;
        boolean z17 = !this.f5746w;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            n3.e1.g(textView, valueOf.booleanValue());
        } else {
            if (i17 >= 28) {
                tag = java.lang.Boolean.valueOf(n3.e1.c(textView));
            } else {
                tag = textView.getTag(com.tencent.mm.R.id.nwh);
                if (!java.lang.Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            java.lang.Boolean bool = (java.lang.Boolean) tag;
            if (true ^ ((bool != null && bool.booleanValue()) == (valueOf != null && valueOf.booleanValue()))) {
                n3.l1.d(textView);
                textView.setTag(com.tencent.mm.R.id.nwh, valueOf);
                n3.l1.h(textView, 0);
            }
        }
        float f18 = i65.a.f(this.f5738o.getContext(), com.tencent.mm.R.dimen.f479559b);
        android.widget.TextView textView2 = this.f5738o;
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
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    if (z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192974b) {
                        throw new java.lang.IllegalStateException(java.lang.String.format("unhandled scale[%f]", java.lang.Float.valueOf(q17)));
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandActionBarCommon", "getActionBarTextSizeScale: unhandled scale[%f]", java.lang.Float.valueOf(q17));
                }
            }
            f17 = 1.0f;
        }
        textView2.setTextSize(0, f18 * f17);
        g(com.tencent.mm.plugin.appbrand.utils.d.f90400e.isEnable(), charSequence);
        if (isLayoutRequested) {
            requestLayout();
        }
    }

    public void setNavButtonLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.C = onLongClickListener;
    }

    public void setNavContainerMinimumWidth(int i17) {
        android.view.View view = this.f5736m;
        if (view != null) {
            view.setMinimumWidth(i17);
        }
    }

    @Override // al1.k0
    public void setNavHidden(boolean z17) {
        this.f5745v = z17;
        j();
        i();
    }

    public void setNavLoadingIconVisibilityResetListener(al1.i iVar) {
        this.B = iVar;
    }

    public void setNavResetStyleListener(al1.e eVar) {
        this.A = eVar;
    }

    public void setOptionButtonClickListener(android.view.View.OnClickListener onClickListener) {
        al1.j jVar = this.f5747x;
        if (onClickListener == null) {
            jVar.getClass();
        } else {
            jVar.f5778c.add(onClickListener);
        }
    }

    public com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView getCapsuleView() {
        return this.f5749z;
    }

    public void setForegroundStyle(boolean z17) {
        this.f5742s = z17 ? -16777216 : -1;
        i();
    }
}
