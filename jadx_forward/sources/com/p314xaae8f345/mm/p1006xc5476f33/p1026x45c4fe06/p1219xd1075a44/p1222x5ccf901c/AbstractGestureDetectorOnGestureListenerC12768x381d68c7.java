package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView */
/* loaded from: classes8.dex */
public abstract class AbstractGestureDetectorOnGestureListenerC12768x381d68c7 extends android.widget.FrameLayout implements android.view.GestureDetector.OnGestureListener, android.view.View.OnTouchListener {
    public static float F = Float.MAX_VALUE;
    public boolean A;
    public java.lang.Runnable B;
    public final android.graphics.Rect C;
    public final android.graphics.Paint D;
    public final android.animation.Animator.AnimatorListener E;

    /* renamed from: d, reason: collision with root package name */
    public final int f172636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f172637e;

    /* renamed from: f, reason: collision with root package name */
    public dl1.c f172638f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f172639g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.GestureDetector f172640h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f172641i;

    /* renamed from: m, reason: collision with root package name */
    public int f172642m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Vibrator f172643n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f172644o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f172645p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f172646q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f172647r;

    /* renamed from: s, reason: collision with root package name */
    public final android.os.Vibrator f172648s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f172649t;

    /* renamed from: u, reason: collision with root package name */
    public cl1.i0 f172650u;

    /* renamed from: v, reason: collision with root package name */
    public cl1.i0 f172651v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f172652w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f172653x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f172654y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f172655z;

    public AbstractGestureDetectorOnGestureListenerC12768x381d68c7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172636d = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561571ma) + i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.m_);
        this.f172642m = -1;
        this.f172645p = new android.graphics.Rect();
        this.f172646q = new android.graphics.Rect();
        this.f172647r = new android.graphics.Rect();
        this.f172648s = (android.os.Vibrator) getContext().getSystemService("vibrator");
        this.f172649t = true;
        this.f172652w = false;
        this.f172653x = false;
        this.f172654y = false;
        this.f172655z = true;
        this.A = false;
        this.C = new android.graphics.Rect();
        this.D = new android.graphics.Paint();
        this.E = new cl1.h0(this);
        h(context);
    }

    /* renamed from: setItemDragCallback */
    private void m53364xbc5a04ce(dl1.c cVar) {
        this.f172638f = cVar;
    }

    public abstract dl1.c a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var);

    public boolean b(android.view.MotionEvent motionEvent) {
        if (m53370xc597f9d0().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            if (this.B == null) {
                cl1.f0 f0Var = new cl1.f0(this, true);
                this.B = f0Var;
                postDelayed(f0Var, 250L);
            }
            return true;
        }
        if (m53365x99dbea52().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            if (this.B == null) {
                cl1.f0 f0Var2 = new cl1.f0(this, false);
                this.B = f0Var2;
                postDelayed(f0Var2, 250L);
            }
            return true;
        }
        if (!m53369xd0303729().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return false;
        }
        removeCallbacks(this.f172637e);
        removeCallbacks(this.B);
        this.B = null;
        return true;
    }

    public final boolean c(float f17, float f18) {
        int i17 = (int) f18;
        return m53369xd0303729().contains((int) f17, i17) || m53369xd0303729().top < i17;
    }

    public final boolean d(float f17) {
        return this.f172650u.getVisibility() == 0 && f17 < ((float) m53369xd0303729().centerX());
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        android.graphics.Paint.Style style = android.graphics.Paint.Style.FILL;
        android.graphics.Paint paint = this.D;
        paint.setStyle(style);
        paint.setColor(-65536);
        android.graphics.Rect rect = this.f172645p;
        if (rect != null) {
            canvas.drawRect(rect, paint);
        }
        paint.setColor(-16711936);
        android.graphics.Rect rect2 = this.f172646q;
        if (rect2 != null) {
            canvas.drawRect(rect2, paint);
        }
    }

    public void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "enableStar %b", java.lang.Boolean.valueOf(z17));
        this.f172650u.setVisibility(z17 ? 0 : 8);
        this.f172650u.getParent().requestLayout();
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 g(float f17, float f18, boolean z17) {
        int i17 = (int) f17;
        int i18 = (int) f18;
        if (this.f172645p.contains(i17, i18)) {
            return null;
        }
        for (int i19 = 0; i19 < m53368x4905e9fa().getChildCount(); i19++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = m53368x4905e9fa().w0(m53368x4905e9fa().getChildAt(i19));
            android.view.View view = w07.f3639x46306858;
            android.graphics.Rect rect = this.C;
            view.getGlobalVisibleRect(rect);
            if (rect.contains(i17, i18)) {
                return w07;
            }
        }
        this.f172646q.contains(i17, i18);
        return null;
    }

    /* renamed from: getBottomScrollRect */
    public android.graphics.Rect m53365x99dbea52() {
        return this.f172645p;
    }

    /* renamed from: getItemDragCallback */
    public dl1.c m53366x185d6fc2() {
        return this.f172638f;
    }

    /* renamed from: getRecyclerScrollComputer */
    public cl1.q0 m53367x10fff61d() {
        return null;
    }

    /* renamed from: getRecyclerView */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m53368x4905e9fa() {
        return this.f172639g;
    }

    /* renamed from: getRubbishRect */
    public android.graphics.Rect m53369xd0303729() {
        return this.f172647r;
    }

    /* renamed from: getTopScrollRect */
    public android.graphics.Rect m53370xc597f9d0() {
        return this.f172646q;
    }

    public final void h(android.content.Context context) {
        setVisibility(8);
        this.f172640h = new android.view.GestureDetector(context, this);
        this.f172643n = (android.os.Vibrator) context.getSystemService("vibrator");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55(getContext());
        float f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        c22646x1e9ca55.b(f17, f17, 0.0f, 0.0f);
        c22646x1e9ca55.setId(com.p314xaae8f345.mm.R.id.m8i);
        int i17 = this.f172636d;
        c22646x1e9ca55.setTranslationY(i17);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, i17);
        layoutParams.gravity = 80;
        c22646x1e9ca55.setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        c22646x1e9ca55.addView(linearLayout);
        cl1.i0 i0Var = new cl1.i0(getContext());
        this.f172650u = i0Var;
        i0Var.c(com.p314xaae8f345.mm.R.raw.f78506x26a4248f, com.p314xaae8f345.mm.R.raw.f78507x8da232bf, com.p314xaae8f345.mm.R.C30867xcad56011.f571637l0, com.p314xaae8f345.mm.R.C30867xcad56011.f571638l1, com.p314xaae8f345.mm.R.C30859x5a72f63.f560181d4, com.p314xaae8f345.mm.R.C30859x5a72f63.f560182d5);
        linearLayout.addView(this.f172650u);
        cl1.i0 i0Var2 = new cl1.i0(getContext());
        this.f172651v = i0Var2;
        i0Var2.c(com.p314xaae8f345.mm.R.raw.f79697xe8d412c3, com.p314xaae8f345.mm.R.raw.f79698x7f34c4db, com.p314xaae8f345.mm.R.C30867xcad56011.f571636kz, com.p314xaae8f345.mm.R.C30867xcad56011.f571639l2, com.p314xaae8f345.mm.R.C30859x5a72f63.f560177d0, com.p314xaae8f345.mm.R.C30859x5a72f63.f560178d1);
        linearLayout.addView(this.f172651v);
        addView(c22646x1e9ca55);
    }

    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if (getVisibility() == 8) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "onBindViewHolder %d %d", java.lang.Integer.valueOf(this.f172642m), java.lang.Integer.valueOf(i17));
        if (this.f172642m == i17) {
            android.view.View view = k3Var.f3639x46306858;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = k3Var.f3639x46306858;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "resetRubbishView");
        this.f172652w = false;
        this.f172650u.b(false);
        this.f172651v.b(false);
    }

    public final void k(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "resetStatus %b", java.lang.Boolean.valueOf(z17));
        removeCallbacks(this.f172637e);
        removeCallbacks(this.B);
        mo53360x389f1734(8);
        int i17 = this.f172642m;
        this.f172642m = -1;
        this.f172652w = false;
        ((dl1.f) this.f172638f).b(m53368x4905e9fa(), this.f172641i, i17, z17, true, new cl1.g0(this));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.graphics.Rect rect = this.f172645p;
        getGlobalVisibleRect(rect);
        int i28 = rect.left;
        int i29 = rect.bottom;
        int i37 = this.f172636d;
        rect.set(i28, i29 - (i37 * 2), rect.right, i29 - i37);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m53368x4905e9fa = m53368x4905e9fa();
        android.graphics.Rect rect2 = this.f172646q;
        m53368x4905e9fa.getGlobalVisibleRect(rect2);
        rect2.set(rect2.left, 0, rect2.right, rect2.top + i37);
        findViewById(com.p314xaae8f345.mm.R.id.m8i).getGlobalVisibleRect(this.f172647r);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        android.view.View view;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        if (this.f172654y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DragFeatureView", "DragFeatureView onLongPress is in long press and ignore");
            this.f172654y = false;
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", if1.m.f69928x24728b);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 g17 = g(motionEvent.getRawX(), motionEvent.getRawY(), true);
        if (g17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
            return;
        }
        this.f172654y = true;
        m53364xbc5a04ce(a(g17));
        dl1.c cVar = this.f172638f;
        m53368x4905e9fa();
        if (((dl1.f) cVar).f316713d == null || g17.m8185xcdaf1228() == 2 || g17.m8185xcdaf1228() == 1) {
            dl1.c cVar2 = this.f172638f;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m53368x4905e9fa = m53368x4905e9fa();
            dl1.f fVar = (dl1.f) cVar2;
            fVar.getClass();
            android.view.View view3 = g17.f3639x46306858;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper", "makeFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper", "makeFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View o17 = ((cl1.h) fVar.f316713d).f124404a.o(m53368x4905e9fa, (cl1.z) g17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(o17, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper", "makeFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            o17.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(o17, "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper", "makeFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            o17.setScaleX(1.0f);
            o17.setScaleY(1.0f);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(o17, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper", "makeFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(o17, "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper", "makeFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fVar.f316711b = o17;
            android.widget.FrameLayout frameLayout = fVar.f316710a;
            frameLayout.addView(o17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ItemMoveHelper", "[onDragBegin] position:" + g17.m8183xf806b362());
            if (g17.m8183xf806b362() >= 0 || (view2 = fVar.f316711b) == null) {
                dl1.g gVar = fVar.f316715f;
                if (gVar != null) {
                    java.util.List list = fVar.f316712c;
                    if (list.size() > g17.m8183xf806b362()) {
                        java.lang.Object obj = list.get(g17.m8183xf806b362());
                        int m8183xf806b362 = g17.m8183xf806b362();
                        cl1.k0 k0Var = ((cl1.g) gVar).f124402a.H;
                        if (k0Var != null) {
                            k0Var.f(m8183xf806b362, true, false);
                        }
                        if (obj instanceof cl1.n0) {
                            cl1.n0 n0Var = (cl1.n0) obj;
                            cl1.n0 n0Var2 = new cl1.n0(n0Var.f124422b);
                            n0Var2.f124421a = n0Var.f124421a;
                            obj = n0Var2;
                        }
                        fVar.f316714e = obj;
                        int m8183xf806b3622 = g17.m8183xf806b362();
                        fVar.f316716g = m8183xf806b3622;
                        fVar.f316717h = m8183xf806b3622;
                    }
                }
                view = fVar.f316711b;
            } else {
                frameLayout.removeView(view2);
                view = null;
                fVar.f316711b = null;
            }
            this.f172644o = view;
            if (view != null) {
                setVisibility(8);
                this.f172642m = g17.m8183xf806b362();
                this.f172641i = g17;
                announceForAccessibility(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571634kx));
                this.f172643n.vibrate(30L);
                mo53360x389f1734(0);
                setVisibility(0);
            } else {
                mo53360x389f1734(8);
                setVisibility(8);
            }
        } else {
            setVisibility(8);
        }
        motionEvent.setAction(0);
        android.view.GestureDetector gestureDetector = this.f172640h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(motionEvent);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(gestureDetector, arrayList5.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList5.get(0)), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        motionEvent.setAction(3);
        android.view.GestureDetector gestureDetector2 = this.f172640h;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(motionEvent);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(gestureDetector2, arrayList6.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector2, gestureDetector2.onTouchEvent((android.view.MotionEvent) arrayList6.get(0)), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onScroll(android.view.MotionEvent r24, android.view.MotionEvent r25, float r26, float r27) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r0 != 3) goto L71;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: setRecyclerView */
    public void m53371x7f4ee506(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f172639g = c1163xf1deaba4;
    }

    /* renamed from: setRecyclerViewScrollComputer */
    public void m53372xefd61bae(cl1.q0 q0Var) {
    }

    /* renamed from: setRubbishViewVisible */
    public void mo53360x389f1734(int i17) {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m8i);
        if (findViewById == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "setRubbishViewVisible %d", java.lang.Integer.valueOf(i17));
        android.animation.Animator.AnimatorListener animatorListener = this.E;
        if (i17 == 0) {
            findViewById.requestLayout();
            findViewById.animate().translationY(0.0f).setDuration(300L).setListener(animatorListener).start();
        } else {
            this.A = true;
            findViewById.animate().translationY(findViewById.getHeight()).setDuration(300L).setListener(animatorListener).start();
        }
    }

    /* renamed from: setTouchEnabled */
    public void m53373xd5adfc84(boolean z17) {
        this.f172649t = z17;
    }

    public AbstractGestureDetectorOnGestureListenerC12768x381d68c7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172636d = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561571ma) + i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.m_);
        this.f172642m = -1;
        this.f172645p = new android.graphics.Rect();
        this.f172646q = new android.graphics.Rect();
        this.f172647r = new android.graphics.Rect();
        this.f172648s = (android.os.Vibrator) getContext().getSystemService("vibrator");
        this.f172649t = true;
        this.f172652w = false;
        this.f172653x = false;
        this.f172654y = false;
        this.f172655z = true;
        this.A = false;
        this.C = new android.graphics.Rect();
        this.D = new android.graphics.Paint();
        this.E = new cl1.h0(this);
        h(context);
    }
}
