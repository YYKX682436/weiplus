package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class u3 extends android.widget.LinearLayout implements com.tencent.mm.plugin.appbrand.widget.input.j2, com.tencent.mm.plugin.appbrand.widget.input.u4 {
    public static final /* synthetic */ int D = 0;
    public jg1.b A;
    public boolean B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f91674d;

    /* renamed from: e, reason: collision with root package name */
    public int f91675e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91676f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f91677g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.q3 f91678h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.o3 f91679i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f91680m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.r3 f91681n;

    /* renamed from: o, reason: collision with root package name */
    public int f91682o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f91683p;

    /* renamed from: q, reason: collision with root package name */
    public ol1.o f91684q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f91685r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f91686s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageButton f91687t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f91688u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f91689v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f91690w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.EditText f91691x;

    /* renamed from: y, reason: collision with root package name */
    public android.content.Context f91692y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.input.x4 f91693z;

    static {
        new com.tencent.mm.plugin.appbrand.widget.input.s3(null);
    }

    public u3(android.content.Context context, jg1.b bVar, boolean z17) {
        super(context);
        this.f91674d = new java.util.ArrayList();
        this.f91675e = 0;
        this.f91676f = false;
        this.f91677g = new com.tencent.mm.plugin.appbrand.widget.input.h3(this);
        this.f91680m = false;
        this.f91682o = 2;
        this.f91683p = new com.tencent.mm.plugin.appbrand.widget.input.j3(this, android.os.Looper.getMainLooper());
        this.A = null;
        this.B = false;
        this.C = false;
        this.f91692y = context;
        com.tencent.mm.plugin.appbrand.widget.input.x4 a17 = com.tencent.mm.plugin.appbrand.widget.input.w4.a(context);
        this.f91693z = a17 == null ? new ll1.a() : a17;
        this.A = bVar;
        B(z17);
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.u3 G(android.view.View view, android.content.Context context, jg1.b bVar) {
        com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(view);
        if (d17 == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.widget.input.h1.e(view);
        com.tencent.mm.plugin.appbrand.widget.input.u3 y17 = y(view);
        if (y17 == null) {
            android.content.Context a17 = q75.a.a(view.getContext());
            if (a17 == null) {
                a17 = vj5.o.g(view.getContext());
            }
            if (a17 != null) {
                context = a17;
            }
            y17 = view instanceof com.tencent.mm.plugin.appbrand.widget.input.u3 ? (com.tencent.mm.plugin.appbrand.widget.input.u3) view : new com.tencent.mm.plugin.appbrand.widget.input.u3(context, bVar, false);
        }
        d17.a(y17, false);
        if (y17.A != bVar) {
            y17.A = bVar;
        }
        return y17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPanelHeightImpl(int i17) {
        if (this.f91684q.n(i17)) {
            ((com.tencent.mm.plugin.appbrand.widget.input.h3) this.f91677g).run();
        }
    }

    public static void w(com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var) {
        u3Var.f91684q.onResume();
        if (!com.tencent.mm.plugin.appbrand.ui.na.k(u3Var) || u3Var.f91676f) {
            if (u3Var.isShown()) {
                android.view.View view = u3Var.f91685r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "show", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "show", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (u3Var.f91688u) {
                u3Var.f91684q.o();
            } else {
                u3Var.f91684q.s(true);
            }
        } else {
            u3Var.K(8);
            u3Var.J();
        }
        android.widget.ImageButton imageButton = u3Var.f91687t;
        if (imageButton != null) {
            imageButton.setSelected(true);
        }
        u3Var.f91683p.obtainMessage(1, new com.tencent.mm.plugin.appbrand.widget.input.m3(u3Var, 1, u3Var.f91680m)).sendToTarget();
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.u3 y(android.view.View view) {
        return (com.tencent.mm.plugin.appbrand.widget.input.u3) view.getRootView().findViewById(com.tencent.mm.R.id.f483162y9);
    }

    public final void A() {
        this.f91684q.onPause();
        if (isShown()) {
            android.view.View view = this.f91685r;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "hide", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "hide", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f91684q.s(!this.f91688u);
        android.widget.ImageButton imageButton = this.f91687t;
        if (imageButton != null) {
            imageButton.setSelected(false);
        }
        this.f91683p.obtainMessage(1, new com.tencent.mm.plugin.appbrand.widget.input.m3(this, 0, this.f91680m)).sendToTarget();
    }

    public final void B(boolean z17) {
        android.view.ViewGroup viewGroup;
        super.setId(u());
        setOrientation(1);
        if (this.B) {
            this.f91686s = this.A;
        } else {
            this.f91686s = x();
        }
        android.view.View view = this.f91686s;
        if (view != null && (viewGroup = (android.view.ViewGroup) view.getParent()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSoftKeyboardPanel", "toolbar is already existed in a layout,the class of the parent is %s  the id is : %d", viewGroup.getClass().toString(), java.lang.Integer.valueOf(viewGroup.getId()));
            viewGroup.removeView(this.f91686s);
        }
        addView(this.f91686s);
        this.C = false;
        ol1.c cVar = ((ol1.n) i95.n0.c(ol1.n.class)) == null ? null : new ol1.c(this.f91692y, z17);
        this.f91684q = cVar;
        if (cVar == null) {
            this.f91684q = new ol1.m(this.f91692y);
        }
        int c17 = com.tencent.mm.plugin.appbrand.widget.input.l2.c(getContext());
        if (com.tencent.mm.plugin.appbrand.ui.na.k(this) && !this.f91676f) {
            K(8);
        } else if (this.f91685r != null && c17 > 0) {
            setPanelHeightImpl(c17);
        }
        android.view.View panelView = this.f91684q.getPanelView();
        this.f91685r = panelView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(panelView, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        panelView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(panelView, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f91685r.setBackgroundColor(0);
        addView(this.f91685r);
        L();
    }

    public void C() {
    }

    public void D() {
        setCanSmileyInput(this.f91688u);
        setShowDoneButton(this.f91690w);
        L();
    }

    public void E() {
        G(this, null, this.A);
    }

    public void F(android.view.View view) {
        android.view.ViewGroup viewGroup;
        if (view == null || (viewGroup = (android.view.ViewGroup) view.getParent()) == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    public final android.widget.ImageButton H(android.view.View view) {
        android.widget.ImageButton imageButton;
        if (view == null || (imageButton = (android.widget.ImageButton) view.findViewById(com.tencent.mm.R.id.f486966n15)) == null) {
            return null;
        }
        imageButton.setSelected(false);
        imageButton.setOnClickListener(new com.tencent.mm.plugin.appbrand.widget.input.l3(this));
        return imageButton;
    }

    public void I() {
        if (this.f91691x != null) {
            J();
        }
        D();
        if (isShown()) {
            return;
        }
        K(0);
    }

    public final void J() {
        A();
        if (!com.tencent.mm.plugin.appbrand.widget.input.n.f91551d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandSoftKeyboardPanel", "showKeyboard is false, ignore");
            return;
        }
        android.widget.EditText editText = this.f91691x;
        if (editText == null) {
            this.f91693z.showVKB();
            return;
        }
        android.view.inputmethod.InputMethodManager b17 = com.tencent.mm.plugin.appbrand.widget.input.m5.b(editText);
        if (b17.showSoftInput(this.f91691x, 1)) {
            return;
        }
        b17.showSoftInput(this.f91691x, 2);
    }

    public void K(int i17) {
        if (i17 == 0 && com.tencent.mm.plugin.appbrand.ui.na.k(this) && !this.f91676f) {
            i17 = 8;
        }
        if (getVisibility() == i17) {
            return;
        }
        super.setVisibility(i17);
        if (i17 != 0) {
            com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(this);
            if (d17 == null || d17.getOnLayoutListener() == null) {
                return;
            }
            ((com.tencent.mm.plugin.appbrand.widget.input.l2) d17.getOnLayoutListener()).f91535h = null;
            return;
        }
        E();
        com.tencent.mm.plugin.appbrand.widget.input.h1 d18 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(this);
        if (d18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandSoftKeyboardPanel", "registerSystemSoftKeyboardHeightListener get null rootLayout");
        } else {
            ((com.tencent.mm.plugin.appbrand.widget.input.l2) d18.getOnLayoutListener()).f91535h = this;
        }
    }

    public void L() {
        android.view.KeyEvent.Callback callback = this.f91686s;
        if (callback != null && (callback instanceof com.tencent.mm.plugin.appbrand.widget.input.n3)) {
            com.tencent.mm.plugin.appbrand.widget.input.n3 n3Var = (com.tencent.mm.plugin.appbrand.widget.input.n3) callback;
            boolean z17 = true;
            if (!((!this.f91688u) & (!this.f91690w)) && (!com.tencent.mm.plugin.appbrand.ui.na.k(this) || this.f91676f)) {
                z17 = false;
            }
            n3Var.a(z17);
        }
    }

    public void M() {
        android.view.View view;
        android.view.View view2 = this.f91686s;
        if (view2 == null) {
            return;
        }
        if (this.C) {
            F(view2);
            if (this.B) {
                this.f91686s = this.A;
            } else {
                this.f91686s = x();
            }
            F(this.f91686s);
            addView(this.f91686s, 0);
            this.C = false;
        }
        if (this.B && (view = this.f91686s) != this.A) {
            F(view);
            jg1.b bVar = this.A;
            this.f91686s = bVar;
            F(bVar);
            addView(this.f91686s, 0);
        }
        if (!this.B || this.f91686s.getParent() == this) {
            return;
        }
        F(this.f91686s);
        addView(this.f91686s, 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSoftKeyboardPanel", "onKeyboardStateChanged, kbShown = %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            K(0);
            A();
        } else if (isShown()) {
            com.tencent.mm.plugin.appbrand.widget.input.g3 g3Var = new com.tencent.mm.plugin.appbrand.widget.input.g3(this);
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f91683p;
            if (n3Var.hasMessages(1)) {
                n3Var.post(g3Var);
            } else {
                g3Var.run();
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.k2
    public void d(int i17) {
        if (com.tencent.mm.plugin.appbrand.ui.na.k(this) && !this.f91676f) {
            K(8);
        } else {
            if (this.f91685r == null || i17 <= 0) {
                return;
            }
            setPanelHeightImpl(i17);
        }
    }

    public boolean e(android.widget.EditText editText) {
        if (editText != this.f91691x) {
            return false;
        }
        this.f91691x = null;
        return true;
    }

    public android.widget.EditText getAttachedEditText() {
        return this.f91691x;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        android.view.View view;
        jg1.b bVar;
        if (getVisibility() != 0 || ((view = this.f91686s) != null && (view.getVisibility() != 0 || (this.f91686s.getMeasuredWidth() == 0 && this.f91686s.getMeasuredHeight() == 0)))) {
            return 0;
        }
        if (!this.B || (bVar = this.A) == null) {
            return i65.a.b(getContext(), 48);
        }
        com.tencent.mm.plugin.appbrand.page.ia customViewContainer = bVar.getCustomViewContainer();
        if (customViewContainer != null) {
            android.view.ViewGroup viewGroup = customViewContainer.f86757a;
            if ((viewGroup instanceof android.view.ViewGroup) && viewGroup.getChildCount() > 0 && viewGroup.getChildAt(0).getLayoutParams() != null) {
                return java.lang.Math.max(viewGroup.getChildAt(0).getLayoutParams().height, 0);
            }
        }
        return 0;
    }

    public void k(com.tencent.mm.plugin.appbrand.widget.input.p3 p3Var) {
        java.util.List list = this.f91674d;
        if (((java.util.ArrayList) list).contains(p3Var)) {
            return;
        }
        ((java.util.ArrayList) list).add(p3Var);
    }

    public void m(com.tencent.mm.plugin.appbrand.widget.input.p3 p3Var) {
        ((java.util.ArrayList) this.f91674d).remove(p3Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        E();
        com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(this);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandSoftKeyboardPanel", "registerSystemSoftKeyboardHeightListener get null rootLayout");
        } else {
            ((com.tencent.mm.plugin.appbrand.widget.input.l2) d17.getOnLayoutListener()).f91535h = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K(8);
        if (this.f91692y != null) {
            android.widget.EditText editText = this.f91691x;
            com.tencent.mm.plugin.appbrand.widget.input.x4 x4Var = this.f91693z;
            if (editText != null) {
                x4Var.hideVKB(editText);
            } else {
                x4Var.hideVKB();
            }
        }
        this.f91684q.onDestroy();
        android.widget.ImageButton imageButton = this.f91687t;
        if (imageButton != null) {
            imageButton.setOnClickListener(null);
        }
        this.f91678h = null;
        removeAllViews();
        this.f91692y = null;
        ((java.util.ArrayList) this.f91674d).clear();
        com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(this);
        if (d17 == null || d17.getOnLayoutListener() == null) {
            return;
        }
        ((com.tencent.mm.plugin.appbrand.widget.input.l2) d17.getOnLayoutListener()).f91535h = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int measuredHeight = getMeasuredHeight();
        int i28 = this.f91675e;
        if (measuredHeight != i28) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSoftKeyboardPanel", "update panel height from %d to %d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(measuredHeight));
            this.f91675e = measuredHeight;
            java.util.Iterator it = ((java.util.ArrayList) this.f91674d).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.widget.input.p3 p3Var = (com.tencent.mm.plugin.appbrand.widget.input.p3) it.next();
                if (p3Var != null && p3Var.b() == this.f91691x) {
                    p3Var.a(this.f91675e);
                }
            }
        }
        getMeasuredHeight();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        return this.f91684q.q();
    }

    public void setCanSmileyInput(boolean z17) {
        boolean z18 = z17 && this.f91684q.l();
        this.C = (this.f91688u != z18) | this.C;
        this.f91688u = z18;
        M();
        android.widget.ImageButton imageButton = this.f91687t;
        if (imageButton != null) {
            imageButton.setVisibility(this.f91688u ? 0 : 8);
        }
        L();
    }

    public void setComponentView(boolean z17) {
        if (this.B != z17) {
            this.B = z17;
            this.C = true;
        }
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    public void setMiniGameInSplitOrFloatWindow(boolean z17) {
        this.f91676f = z17;
    }

    public void setOnDoneListener(com.tencent.mm.plugin.appbrand.widget.input.o3 o3Var) {
        this.f91679i = o3Var;
    }

    public void setOnSmileyChosenListener(com.tencent.mm.plugin.appbrand.widget.input.q3 q3Var) {
        boolean z17 = q3Var != this.f91678h;
        this.f91678h = q3Var;
        if (z17) {
            this.f91684q.setOnTextOperationListener(new com.tencent.mm.plugin.appbrand.widget.input.i3(this));
        }
    }

    public void setOnVisibilityChangedListener(com.tencent.mm.plugin.appbrand.widget.input.r3 r3Var) {
        this.f91681n = r3Var;
    }

    public void setShowDoneButton(boolean z17) {
        M();
        this.f91690w = z17;
        android.view.View view = this.f91689v;
        if (view != null) {
            int i17 = z17 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel", "setShowDoneButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel", "setShowDoneButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        L();
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.o3 o3Var;
        if (i17 != 8) {
            if (i17 == 0) {
                I();
                return;
            } else {
                K(i17);
                return;
            }
        }
        if (getVisibility() != i17 && !this.f91680m && (o3Var = this.f91679i) != null) {
            this.f91680m = true;
            o3Var.a(false);
            this.f91680m = false;
        }
        z();
    }

    public int u() {
        return com.tencent.mm.R.id.f483162y9;
    }

    public android.view.View x() {
        com.tencent.mm.plugin.appbrand.widget.input.t3 t3Var = new com.tencent.mm.plugin.appbrand.widget.input.t3(getContext());
        android.widget.ImageButton H = H(t3Var);
        this.f91687t = H;
        if (H != null) {
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, com.tencent.mm.sdk.platformtools.x2.f193075e.getDrawable(com.tencent.mm.R.drawable.cge));
            stateListDrawable.addState(new int[0], com.tencent.mm.sdk.platformtools.x2.f193075e.getDrawable(com.tencent.mm.R.drawable.cgd));
            this.f91687t.setImageDrawable(stateListDrawable);
        }
        android.view.View findViewById = t3Var.findViewById(com.tencent.mm.R.id.f486965n14);
        this.f91689v = findViewById;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.appbrand.widget.input.k3(this));
        return t3Var;
    }

    public void z() {
        if (isShown()) {
            K(8);
            if (this.f91691x != null && !this.f91693z.hideVKBHavingResult()) {
                try {
                    com.tencent.mm.plugin.appbrand.widget.input.m5.b(this).hideSoftInputFromWindow(getWindowToken(), 0);
                } catch (java.lang.Exception unused) {
                }
            }
            A();
            C();
        }
    }
}
