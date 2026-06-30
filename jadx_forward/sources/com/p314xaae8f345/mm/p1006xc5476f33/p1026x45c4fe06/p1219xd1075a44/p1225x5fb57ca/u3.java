package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class u3 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4 {
    public static final /* synthetic */ int D = 0;
    public jg1.b A;
    public boolean B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f173207d;

    /* renamed from: e, reason: collision with root package name */
    public int f173208e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f173209f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f173210g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q3 f173211h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o3 f173212i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f173213m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r3 f173214n;

    /* renamed from: o, reason: collision with root package name */
    public int f173215o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f173216p;

    /* renamed from: q, reason: collision with root package name */
    public ol1.o f173217q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f173218r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f173219s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageButton f173220t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f173221u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f173222v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f173223w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.EditText f173224x;

    /* renamed from: y, reason: collision with root package name */
    public android.content.Context f173225y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4 f173226z;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.s3(null);
    }

    public u3(android.content.Context context, jg1.b bVar, boolean z17) {
        super(context);
        this.f173207d = new java.util.ArrayList();
        this.f173208e = 0;
        this.f173209f = false;
        this.f173210g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h3(this);
        this.f173213m = false;
        this.f173215o = 2;
        this.f173216p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j3(this, android.os.Looper.getMainLooper());
        this.A = null;
        this.B = false;
        this.C = false;
        this.f173225y = context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w4.a(context);
        this.f173226z = a17 == null ? new ll1.a() : a17;
        this.A = bVar;
        B(z17);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 G(android.view.View view, android.content.Context context, jg1.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.d(view);
        if (d17 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.e(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 y17 = y(view);
        if (y17 == null) {
            android.content.Context a17 = q75.a.a(view.getContext());
            if (a17 == null) {
                a17 = vj5.o.g(view.getContext());
            }
            if (a17 != null) {
                context = a17;
            }
            y17 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3) view : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3(context, bVar, false);
        }
        d17.a(y17, false);
        if (y17.A != bVar) {
            y17.A = bVar;
        }
        return y17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPanelHeightImpl */
    public void m53526x25c11849(int i17) {
        if (this.f173217q.n(i17)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h3) this.f173210g).run();
        }
    }

    public static void w(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var) {
        u3Var.f173217q.mo133175x57429eec();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.k(u3Var) || u3Var.f173209f) {
            if (u3Var.isShown()) {
                android.view.View view = u3Var.f173218r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "show", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "show", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (u3Var.f173221u) {
                u3Var.f173217q.o();
            } else {
                u3Var.f173217q.s(true);
            }
        } else {
            u3Var.K(8);
            u3Var.J();
        }
        android.widget.ImageButton imageButton = u3Var.f173220t;
        if (imageButton != null) {
            imageButton.setSelected(true);
        }
        u3Var.f173216p.mo50292x733c63a2(1, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m3(u3Var, 1, u3Var.f173213m)).sendToTarget();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 y(android.view.View view) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3) view.getRootView().findViewById(com.p314xaae8f345.mm.R.id.f564695y9);
    }

    public final void A() {
        this.f173217q.mo133174xb01dfb57();
        if (isShown()) {
            android.view.View view = this.f173218r;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "hide", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "hide", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f173217q.s(!this.f173221u);
        android.widget.ImageButton imageButton = this.f173220t;
        if (imageButton != null) {
            imageButton.setSelected(false);
        }
        this.f173216p.mo50292x733c63a2(1, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m3(this, 0, this.f173213m)).sendToTarget();
    }

    public final void B(boolean z17) {
        android.view.ViewGroup viewGroup;
        super.setId(u());
        setOrientation(1);
        if (this.B) {
            this.f173219s = this.A;
        } else {
            this.f173219s = x();
        }
        android.view.View view = this.f173219s;
        if (view != null && (viewGroup = (android.view.ViewGroup) view.getParent()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSoftKeyboardPanel", "toolbar is already existed in a layout,the class of the parent is %s  the id is : %d", viewGroup.getClass().toString(), java.lang.Integer.valueOf(viewGroup.getId()));
            viewGroup.removeView(this.f173219s);
        }
        addView(this.f173219s);
        this.C = false;
        ol1.c cVar = ((ol1.n) i95.n0.c(ol1.n.class)) == null ? null : new ol1.c(this.f173225y, z17);
        this.f173217q = cVar;
        if (cVar == null) {
            this.f173217q = new ol1.m(this.f173225y);
        }
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2.c(getContext());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.k(this) && !this.f173209f) {
            K(8);
        } else if (this.f173218r != null && c17 > 0) {
            m53526x25c11849(c17);
        }
        android.view.View mo133172xa7118813 = this.f173217q.mo133172xa7118813();
        this.f173218r = mo133172xa7118813;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo133172xa7118813, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo133172xa7118813.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo133172xa7118813, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f173218r.setBackgroundColor(0);
        addView(this.f173218r);
        L();
    }

    public void C() {
    }

    public void D() {
        m53528x5b5172eb(this.f173221u);
        m53534xc4cc2133(this.f173223w);
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
        if (view == null || (imageButton = (android.widget.ImageButton) view.findViewById(com.p314xaae8f345.mm.R.id.f568499n15)) == null) {
            return null;
        }
        imageButton.setSelected(false);
        imageButton.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l3(this));
        return imageButton;
    }

    public void I() {
        if (this.f173224x != null) {
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
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n.f173084d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandSoftKeyboardPanel", "showKeyboard is false, ignore");
            return;
        }
        android.widget.EditText editText = this.f173224x;
        if (editText == null) {
            this.f173226z.mo26063x7b383410();
            return;
        }
        android.view.inputmethod.InputMethodManager b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.b(editText);
        if (b17.showSoftInput(this.f173224x, 1)) {
            return;
        }
        b17.showSoftInput(this.f173224x, 2);
    }

    public void K(int i17) {
        if (i17 == 0 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.k(this) && !this.f173209f) {
            i17 = 8;
        }
        if (getVisibility() == i17) {
            return;
        }
        super.setVisibility(i17);
        if (i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.d(this);
            if (d17 == null || d17.m53479xdaa76933() == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) d17.m53479xdaa76933()).f173068h = null;
            return;
        }
        E();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.d(this);
        if (d18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandSoftKeyboardPanel", "registerSystemSoftKeyboardHeightListener get null rootLayout");
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) d18.m53479xdaa76933()).f173068h = this;
        }
    }

    public void L() {
        android.view.KeyEvent.Callback callback = this.f173219s;
        if (callback != null && (callback instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n3)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n3 n3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n3) callback;
            boolean z17 = true;
            if (!((!this.f173221u) & (!this.f173223w)) && (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.k(this) || this.f173209f)) {
                z17 = false;
            }
            n3Var.a(z17);
        }
    }

    public void M() {
        android.view.View view;
        android.view.View view2 = this.f173219s;
        if (view2 == null) {
            return;
        }
        if (this.C) {
            F(view2);
            if (this.B) {
                this.f173219s = this.A;
            } else {
                this.f173219s = x();
            }
            F(this.f173219s);
            addView(this.f173219s, 0);
            this.C = false;
        }
        if (this.B && (view = this.f173219s) != this.A) {
            F(view);
            jg1.b bVar = this.A;
            this.f173219s = bVar;
            F(bVar);
            addView(this.f173219s, 0);
        }
        if (!this.B || this.f173219s.getParent() == this) {
            return;
        }
        F(this.f173219s);
        addView(this.f173219s, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSoftKeyboardPanel", "onKeyboardStateChanged, kbShown = %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            K(0);
            A();
        } else if (isShown()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.g3 g3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.g3(this);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f173216p;
            if (n3Var.mo50285x8fc9be06(1)) {
                n3Var.mo50293x3498a0(g3Var);
            } else {
                g3Var.run();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k2
    public void d(int i17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.k(this) && !this.f173209f) {
            K(8);
        } else {
            if (this.f173218r == null || i17 <= 0) {
                return;
            }
            m53526x25c11849(i17);
        }
    }

    public boolean e(android.widget.EditText editText) {
        if (editText != this.f173224x) {
            return false;
        }
        this.f173224x = null;
        return true;
    }

    /* renamed from: getAttachedEditText */
    public android.widget.EditText mo53527xb5567791() {
        return this.f173224x;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        android.view.View view;
        jg1.b bVar;
        if (getVisibility() != 0 || ((view = this.f173219s) != null && (view.getVisibility() != 0 || (this.f173219s.getMeasuredWidth() == 0 && this.f173219s.getMeasuredHeight() == 0)))) {
            return 0;
        }
        if (!this.B || (bVar = this.A) == null) {
            return i65.a.b(getContext(), 48);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia mo51311x3eebbc35 = bVar.mo51311x3eebbc35();
        if (mo51311x3eebbc35 != null) {
            android.view.ViewGroup viewGroup = mo51311x3eebbc35.f168290a;
            if ((viewGroup instanceof android.view.ViewGroup) && viewGroup.getChildCount() > 0 && viewGroup.getChildAt(0).getLayoutParams() != null) {
                return java.lang.Math.max(viewGroup.getChildAt(0).getLayoutParams().height, 0);
            }
        }
        return 0;
    }

    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 p3Var) {
        java.util.List list = this.f173207d;
        if (((java.util.ArrayList) list).contains(p3Var)) {
            return;
        }
        ((java.util.ArrayList) list).add(p3Var);
    }

    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 p3Var) {
        ((java.util.ArrayList) this.f173207d).remove(p3Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        E();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.d(this);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandSoftKeyboardPanel", "registerSystemSoftKeyboardHeightListener get null rootLayout");
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) d17.m53479xdaa76933()).f173068h = this;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K(8);
        if (this.f173225y != null) {
            android.widget.EditText editText = this.f173224x;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4 x4Var = this.f173226z;
            if (editText != null) {
                x4Var.mo53060x36654fab(editText);
            } else {
                x4Var.mo48674x36654fab();
            }
        }
        this.f173217q.mo133173xac79a11b();
        android.widget.ImageButton imageButton = this.f173220t;
        if (imageButton != null) {
            imageButton.setOnClickListener(null);
        }
        this.f173211h = null;
        removeAllViews();
        this.f173225y = null;
        ((java.util.ArrayList) this.f173207d).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.d(this);
        if (d17 == null || d17.m53479xdaa76933() == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) d17.m53479xdaa76933()).f173068h = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int measuredHeight = getMeasuredHeight();
        int i28 = this.f173208e;
        if (measuredHeight != i28) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSoftKeyboardPanel", "update panel height from %d to %d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(measuredHeight));
            this.f173208e = measuredHeight;
            java.util.Iterator it = ((java.util.ArrayList) this.f173207d).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 p3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3) it.next();
                if (p3Var != null && p3Var.b() == this.f173224x) {
                    p3Var.a(this.f173208e);
                }
            }
        }
        getMeasuredHeight();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        return this.f173217q.q();
    }

    /* renamed from: setCanSmileyInput */
    public void m53528x5b5172eb(boolean z17) {
        boolean z18 = z17 && this.f173217q.l();
        this.C = (this.f173221u != z18) | this.C;
        this.f173221u = z18;
        M();
        android.widget.ImageButton imageButton = this.f173220t;
        if (imageButton != null) {
            imageButton.setVisibility(this.f173221u ? 0 : 8);
        }
        L();
    }

    /* renamed from: setComponentView */
    public void m53529xb5ed2800(boolean z17) {
        if (this.B != z17) {
            this.B = z17;
            this.C = true;
        }
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    /* renamed from: setMiniGameInSplitOrFloatWindow */
    public void m53530x6a8abc9f(boolean z17) {
        this.f173209f = z17;
    }

    /* renamed from: setOnDoneListener */
    public void m53531x87046ad7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o3 o3Var) {
        this.f173212i = o3Var;
    }

    /* renamed from: setOnSmileyChosenListener */
    public void m53532xc90eaa98(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q3 q3Var) {
        boolean z17 = q3Var != this.f173211h;
        this.f173211h = q3Var;
        if (z17) {
            this.f173217q.mo133180x5e04422d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.i3(this));
        }
    }

    /* renamed from: setOnVisibilityChangedListener */
    public void m53533x5913ff35(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r3 r3Var) {
        this.f173214n = r3Var;
    }

    /* renamed from: setShowDoneButton */
    public void m53534xc4cc2133(boolean z17) {
        M();
        this.f173223w = z17;
        android.view.View view = this.f173222v;
        if (view != null) {
            int i17 = z17 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.o3 o3Var;
        if (i17 != 8) {
            if (i17 == 0) {
                I();
                return;
            } else {
                K(i17);
                return;
            }
        }
        if (getVisibility() != i17 && !this.f173213m && (o3Var = this.f173212i) != null) {
            this.f173213m = true;
            o3Var.a(false);
            this.f173213m = false;
        }
        z();
    }

    public int u() {
        return com.p314xaae8f345.mm.R.id.f564695y9;
    }

    public android.view.View x() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t3 t3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.t3(getContext());
        android.widget.ImageButton H = H(t3Var);
        this.f173220t = H;
        if (H != null) {
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cge));
            stateListDrawable.addState(new int[0], com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cgd));
            this.f173220t.setImageDrawable(stateListDrawable);
        }
        android.view.View findViewById = t3Var.findViewById(com.p314xaae8f345.mm.R.id.f568498n14);
        this.f173222v = findViewById;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k3(this));
        return t3Var;
    }

    public void z() {
        if (isShown()) {
            K(8);
            if (this.f173224x != null && !this.f173226z.mo53061x30be3ed()) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.b(this).hideSoftInputFromWindow(getWindowToken(), 0);
                } catch (java.lang.Exception unused) {
                }
            }
            A();
            C();
        }
    }
}
