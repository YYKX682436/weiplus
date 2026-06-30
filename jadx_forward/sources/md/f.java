package md;

/* loaded from: classes14.dex */
public final class f extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f407212d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f407213e;

    /* renamed from: f, reason: collision with root package name */
    public int f407214f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f407215g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f407216h;

    /* renamed from: i, reason: collision with root package name */
    public md.l f407217i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.WeakHashMap f407218m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f407219n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f407220o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Set f407221p;

    public f(android.content.Context context, android.view.View view) {
        super(context);
        this.f407214f = -1;
        this.f407215g = false;
        this.f407216h = new int[2];
        this.f407218m = new java.util.WeakHashMap();
        this.f407219n = new md.b(this);
        this.f407220o = new md.c(this);
        this.f407221p = new java.util.HashSet();
        super.setId(com.p314xaae8f345.mm.R.id.cre);
        this.f407213e = view;
    }

    public static md.f b(android.view.View view) {
        return (md.f) view.getRootView().findViewById(com.p314xaae8f345.mm.R.id.cre);
    }

    public static md.h c(android.view.View view) {
        md.f b17 = b(view);
        if (b17 == null) {
            return null;
        }
        if (b17.m147175xdaa76933() == null || !(b17.m147175xdaa76933() instanceof md.h)) {
            b17.m147177x7ea3fe3f(new md.h());
        }
        b17.getViewTreeObserver().addOnGlobalLayoutListener(new md.a(b17, new java.lang.ref.WeakReference(b17)));
        return (md.h) b17.m147175xdaa76933();
    }

    public void a(android.view.View view, boolean z17) {
        android.view.View view2 = this.f407212d;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f407212d = null;
        }
        if (this != view.getParent()) {
            if (view.getParent() != null) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            this.f407212d = view;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            super.addView(view, layoutParams);
            md.e eVar = new md.e(null);
            eVar.f407210a = z17;
            this.f407218m.put(view, eVar);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        if (view == this.f407213e || view == this.f407212d) {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View view;
        md.e eVar = (md.e) this.f407218m.get(this.f407212d);
        if (eVar != null && eVar.f407210a && (view = this.f407212d) != null && view.isShown() && motionEvent.getAction() == 0) {
            float rawY = motionEvent.getRawY();
            android.view.View view2 = this.f407212d;
            int[] iArr = this.f407216h;
            view2.getLocationOnScreen(iArr);
            float f17 = iArr[1];
            float height = this.f407212d.getHeight() + f17;
            if (rawY < f17 || rawY > height) {
                android.view.View view3 = this.f407212d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/liteapp/utils/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getCurrentBottomPanel */
    public android.view.View m147174xbfa17956() {
        return this.f407212d;
    }

    /* renamed from: getOnLayoutListener */
    public md.l m147175xdaa76933() {
        return this.f407217i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f407215g = true;
        super.onLayout(z17, i17, i18, i19, i27);
        this.f407215g = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f407214f;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.f407218m.remove(view);
    }

    /* renamed from: setForceHeight */
    public void m147176x4133a630(int i17) {
        boolean z17 = i17 != this.f407214f;
        this.f407214f = i17;
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.c(this) && !this.f407215g) {
                requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    /* renamed from: setOnLayoutListener */
    public void m147177x7ea3fe3f(md.l lVar) {
        this.f407217i = lVar;
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        if (view == this.f407213e || view == this.f407212d) {
            super.addView(view, i17);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, int i18) {
        if (view == this.f407213e || view == this.f407212d) {
            super.addView(view, i17, i18);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view == this.f407213e || view == this.f407212d) {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view == this.f407213e || view == this.f407212d) {
            super.addView(view, i17, layoutParams);
        }
    }
}
