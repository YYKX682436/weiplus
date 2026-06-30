package com.tencent.mm.plugin.appbrand.widget.desktop;

/* loaded from: classes8.dex */
public abstract class DragFeatureView extends android.widget.FrameLayout implements android.view.GestureDetector.OnGestureListener, android.view.View.OnTouchListener {
    public static float F = Float.MAX_VALUE;
    public boolean A;
    public java.lang.Runnable B;
    public final android.graphics.Rect C;
    public final android.graphics.Paint D;
    public final android.animation.Animator.AnimatorListener E;

    /* renamed from: d, reason: collision with root package name */
    public final int f91103d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f91104e;

    /* renamed from: f, reason: collision with root package name */
    public dl1.c f91105f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f91106g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.GestureDetector f91107h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.k3 f91108i;

    /* renamed from: m, reason: collision with root package name */
    public int f91109m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Vibrator f91110n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f91111o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f91112p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f91113q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f91114r;

    /* renamed from: s, reason: collision with root package name */
    public final android.os.Vibrator f91115s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f91116t;

    /* renamed from: u, reason: collision with root package name */
    public cl1.i0 f91117u;

    /* renamed from: v, reason: collision with root package name */
    public cl1.i0 f91118v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f91119w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f91120x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f91121y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f91122z;

    public DragFeatureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91103d = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480038ma) + i65.a.f(getContext(), com.tencent.mm.R.dimen.m_);
        this.f91109m = -1;
        this.f91112p = new android.graphics.Rect();
        this.f91113q = new android.graphics.Rect();
        this.f91114r = new android.graphics.Rect();
        this.f91115s = (android.os.Vibrator) getContext().getSystemService("vibrator");
        this.f91116t = true;
        this.f91119w = false;
        this.f91120x = false;
        this.f91121y = false;
        this.f91122z = true;
        this.A = false;
        this.C = new android.graphics.Rect();
        this.D = new android.graphics.Paint();
        this.E = new cl1.h0(this);
        h(context);
    }

    private void setItemDragCallback(dl1.c cVar) {
        this.f91105f = cVar;
    }

    public abstract dl1.c a(androidx.recyclerview.widget.k3 k3Var);

    public boolean b(android.view.MotionEvent motionEvent) {
        if (getTopScrollRect().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            if (this.B == null) {
                cl1.f0 f0Var = new cl1.f0(this, true);
                this.B = f0Var;
                postDelayed(f0Var, 250L);
            }
            return true;
        }
        if (getBottomScrollRect().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            if (this.B == null) {
                cl1.f0 f0Var2 = new cl1.f0(this, false);
                this.B = f0Var2;
                postDelayed(f0Var2, 250L);
            }
            return true;
        }
        if (!getRubbishRect().contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return false;
        }
        removeCallbacks(this.f91104e);
        removeCallbacks(this.B);
        this.B = null;
        return true;
    }

    public final boolean c(float f17, float f18) {
        int i17 = (int) f18;
        return getRubbishRect().contains((int) f17, i17) || getRubbishRect().top < i17;
    }

    public final boolean d(float f17) {
        return this.f91117u.getVisibility() == 0 && f17 < ((float) getRubbishRect().centerX());
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        android.graphics.Paint.Style style = android.graphics.Paint.Style.FILL;
        android.graphics.Paint paint = this.D;
        paint.setStyle(style);
        paint.setColor(-65536);
        android.graphics.Rect rect = this.f91112p;
        if (rect != null) {
            canvas.drawRect(rect, paint);
        }
        paint.setColor(-16711936);
        android.graphics.Rect rect2 = this.f91113q;
        if (rect2 != null) {
            canvas.drawRect(rect2, paint);
        }
    }

    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "enableStar %b", java.lang.Boolean.valueOf(z17));
        this.f91117u.setVisibility(z17 ? 0 : 8);
        this.f91117u.getParent().requestLayout();
    }

    public androidx.recyclerview.widget.k3 g(float f17, float f18, boolean z17) {
        int i17 = (int) f17;
        int i18 = (int) f18;
        if (this.f91112p.contains(i17, i18)) {
            return null;
        }
        for (int i19 = 0; i19 < getRecyclerView().getChildCount(); i19++) {
            androidx.recyclerview.widget.k3 w07 = getRecyclerView().w0(getRecyclerView().getChildAt(i19));
            android.view.View view = w07.itemView;
            android.graphics.Rect rect = this.C;
            view.getGlobalVisibleRect(rect);
            if (rect.contains(i17, i18)) {
                return w07;
            }
        }
        this.f91113q.contains(i17, i18);
        return null;
    }

    public android.graphics.Rect getBottomScrollRect() {
        return this.f91112p;
    }

    public dl1.c getItemDragCallback() {
        return this.f91105f;
    }

    public cl1.q0 getRecyclerScrollComputer() {
        return null;
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return this.f91106g;
    }

    public android.graphics.Rect getRubbishRect() {
        return this.f91114r;
    }

    public android.graphics.Rect getTopScrollRect() {
        return this.f91113q;
    }

    public final void h(android.content.Context context) {
        setVisibility(8);
        this.f91107h = new android.view.GestureDetector(context, this);
        this.f91110n = (android.os.Vibrator) context.getSystemService("vibrator");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = new com.tencent.mm.ui.widget.RoundedCornerFrameLayout(getContext());
        float f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv);
        roundedCornerFrameLayout.b(f17, f17, 0.0f, 0.0f);
        roundedCornerFrameLayout.setId(com.tencent.mm.R.id.m8i);
        int i17 = this.f91103d;
        roundedCornerFrameLayout.setTranslationY(i17);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, i17);
        layoutParams.gravity = 80;
        roundedCornerFrameLayout.setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        roundedCornerFrameLayout.addView(linearLayout);
        cl1.i0 i0Var = new cl1.i0(getContext());
        this.f91117u = i0Var;
        i0Var.c(com.tencent.mm.R.raw.appbrand_icon_star_off, com.tencent.mm.R.raw.appbrand_icon_star_on, com.tencent.mm.R.string.f490104l0, com.tencent.mm.R.string.f490105l1, com.tencent.mm.R.color.f478648d4, com.tencent.mm.R.color.f478649d5);
        linearLayout.addView(this.f91117u);
        cl1.i0 i0Var2 = new cl1.i0(getContext());
        this.f91118v = i0Var2;
        i0Var2.c(com.tencent.mm.R.raw.icons_filled_delete, com.tencent.mm.R.raw.icons_filled_delete_on, com.tencent.mm.R.string.f490103kz, com.tencent.mm.R.string.f490106l2, com.tencent.mm.R.color.f478644d0, com.tencent.mm.R.color.f478645d1);
        linearLayout.addView(this.f91118v);
        addView(roundedCornerFrameLayout);
    }

    public void i(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if (getVisibility() == 8) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "onBindViewHolder %d %d", java.lang.Integer.valueOf(this.f91109m), java.lang.Integer.valueOf(i17));
        if (this.f91109m == i17) {
            android.view.View view = k3Var.itemView;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = k3Var.itemView;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "resetRubbishView");
        this.f91119w = false;
        this.f91117u.b(false);
        this.f91118v.b(false);
    }

    public final void k(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "resetStatus %b", java.lang.Boolean.valueOf(z17));
        removeCallbacks(this.f91104e);
        removeCallbacks(this.B);
        setRubbishViewVisible(8);
        int i17 = this.f91109m;
        this.f91109m = -1;
        this.f91119w = false;
        ((dl1.f) this.f91105f).b(getRecyclerView(), this.f91108i, i17, z17, true, new cl1.g0(this));
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
        android.graphics.Rect rect = this.f91112p;
        getGlobalVisibleRect(rect);
        int i28 = rect.left;
        int i29 = rect.bottom;
        int i37 = this.f91103d;
        rect.set(i28, i29 - (i37 * 2), rect.right, i29 - i37);
        androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
        android.graphics.Rect rect2 = this.f91113q;
        recyclerView.getGlobalVisibleRect(rect2);
        rect2.set(rect2.left, 0, rect2.right, rect2.top + i37);
        findViewById(com.tencent.mm.R.id.m8i).getGlobalVisibleRect(this.f91114r);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        android.view.View view;
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        if (this.f91121y) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DragFeatureView", "DragFeatureView onLongPress is in long press and ignore");
            this.f91121y = false;
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", if1.m.NAME);
        androidx.recyclerview.widget.k3 g17 = g(motionEvent.getRawX(), motionEvent.getRawY(), true);
        if (g17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            return;
        }
        this.f91121y = true;
        setItemDragCallback(a(g17));
        dl1.c cVar = this.f91105f;
        getRecyclerView();
        if (((dl1.f) cVar).f235180d == null || g17.getItemViewType() == 2 || g17.getItemViewType() == 1) {
            dl1.c cVar2 = this.f91105f;
            androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
            dl1.f fVar = (dl1.f) cVar2;
            fVar.getClass();
            android.view.View view3 = g17.itemView;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper", "makeFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/widget/desktop/helper/ItemMoveHelper", "makeFloatView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View o17 = ((cl1.h) fVar.f235180d).f42871a.o(recyclerView, (cl1.z) g17);
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
            fVar.f235178b = o17;
            android.widget.FrameLayout frameLayout = fVar.f235177a;
            frameLayout.addView(o17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ItemMoveHelper", "[onDragBegin] position:" + g17.getAdapterPosition());
            if (g17.getAdapterPosition() >= 0 || (view2 = fVar.f235178b) == null) {
                dl1.g gVar = fVar.f235182f;
                if (gVar != null) {
                    java.util.List list = fVar.f235179c;
                    if (list.size() > g17.getAdapterPosition()) {
                        java.lang.Object obj = list.get(g17.getAdapterPosition());
                        int adapterPosition = g17.getAdapterPosition();
                        cl1.k0 k0Var = ((cl1.g) gVar).f42869a.H;
                        if (k0Var != null) {
                            k0Var.f(adapterPosition, true, false);
                        }
                        if (obj instanceof cl1.n0) {
                            cl1.n0 n0Var = (cl1.n0) obj;
                            cl1.n0 n0Var2 = new cl1.n0(n0Var.f42889b);
                            n0Var2.f42888a = n0Var.f42888a;
                            obj = n0Var2;
                        }
                        fVar.f235181e = obj;
                        int adapterPosition2 = g17.getAdapterPosition();
                        fVar.f235183g = adapterPosition2;
                        fVar.f235184h = adapterPosition2;
                    }
                }
                view = fVar.f235178b;
            } else {
                frameLayout.removeView(view2);
                view = null;
                fVar.f235178b = null;
            }
            this.f91111o = view;
            if (view != null) {
                setVisibility(8);
                this.f91109m = g17.getAdapterPosition();
                this.f91108i = g17;
                announceForAccessibility(getContext().getString(com.tencent.mm.R.string.f490101kx));
                this.f91110n.vibrate(30L);
                setRubbishViewVisible(0);
                setVisibility(0);
            } else {
                setRubbishViewVisible(8);
                setVisibility(8);
            }
        } else {
            setVisibility(8);
        }
        motionEvent.setAction(0);
        android.view.GestureDetector gestureDetector = this.f91107h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(motionEvent);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(gestureDetector, arrayList5.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", if1.m.NAME, "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList5.get(0)), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", if1.m.NAME, "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        motionEvent.setAction(3);
        android.view.GestureDetector gestureDetector2 = this.f91107h;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(motionEvent);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(gestureDetector2, arrayList6.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", if1.m.NAME, "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector2, gestureDetector2.onTouchEvent((android.view.MotionEvent) arrayList6.get(0)), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", if1.m.NAME, "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f91106g = recyclerView;
    }

    public void setRecyclerViewScrollComputer(cl1.q0 q0Var) {
    }

    public void setRubbishViewVisible(int i17) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m8i);
        if (findViewById == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "setRubbishViewVisible %d", java.lang.Integer.valueOf(i17));
        android.animation.Animator.AnimatorListener animatorListener = this.E;
        if (i17 == 0) {
            findViewById.requestLayout();
            findViewById.animate().translationY(0.0f).setDuration(300L).setListener(animatorListener).start();
        } else {
            this.A = true;
            findViewById.animate().translationY(findViewById.getHeight()).setDuration(300L).setListener(animatorListener).start();
        }
    }

    public void setTouchEnabled(boolean z17) {
        this.f91116t = z17;
    }

    public DragFeatureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91103d = i65.a.f(getContext(), com.tencent.mm.R.dimen.f480038ma) + i65.a.f(getContext(), com.tencent.mm.R.dimen.m_);
        this.f91109m = -1;
        this.f91112p = new android.graphics.Rect();
        this.f91113q = new android.graphics.Rect();
        this.f91114r = new android.graphics.Rect();
        this.f91115s = (android.os.Vibrator) getContext().getSystemService("vibrator");
        this.f91116t = true;
        this.f91119w = false;
        this.f91120x = false;
        this.f91121y = false;
        this.f91122z = true;
        this.A = false;
        this.C = new android.graphics.Rect();
        this.D = new android.graphics.Paint();
        this.E = new cl1.h0(this);
        h(context);
    }
}
