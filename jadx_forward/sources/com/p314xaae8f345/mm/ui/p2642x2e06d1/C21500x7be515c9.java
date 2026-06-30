package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMHorList */
/* loaded from: classes15.dex */
public class C21500x7be515c9 extends android.widget.AdapterView<android.widget.ListAdapter> {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public boolean B;
    public final android.database.DataSetObserver C;
    public final android.view.GestureDetector.OnGestureListener D;

    /* renamed from: d, reason: collision with root package name */
    public db5.m3 f278961d;

    /* renamed from: e, reason: collision with root package name */
    public int f278962e;

    /* renamed from: f, reason: collision with root package name */
    public int f278963f;

    /* renamed from: g, reason: collision with root package name */
    public int f278964g;

    /* renamed from: h, reason: collision with root package name */
    public int f278965h;

    /* renamed from: i, reason: collision with root package name */
    public int f278966i;

    /* renamed from: m, reason: collision with root package name */
    public int f278967m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Queue f278968n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f278969o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f278970p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Scroller f278971q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.GestureDetector f278972r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f278973s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f278974t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ListAdapter f278975u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f278976v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f278977w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f278978x;

    /* renamed from: y, reason: collision with root package name */
    public int f278979y;

    /* renamed from: z, reason: collision with root package name */
    public int f278980z;

    public C21500x7be515c9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278967m = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965;
        this.f278968n = new java.util.LinkedList();
        this.f278969o = false;
        this.f278970p = false;
        this.f278976v = new db5.j3(this);
        this.f278977w = false;
        this.f278978x = false;
        this.f278979y = 0;
        this.f278980z = 0;
        this.A = false;
        this.B = false;
        this.C = new db5.k3(this);
        this.D = new db5.l3(this);
        b();
    }

    /* renamed from: getChildViewTotalWidth */
    private int m79005x5538166d() {
        return this.f278975u.getCount() * this.f278979y;
    }

    public final void a(android.view.View view, int i17) {
        this.f278970p = true;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        addViewInLayout(view, i17, layoutParams, true);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
    }

    public final void b() {
        this.f278971q = new android.widget.Scroller(getContext());
        this.f278962e = -1;
        this.f278963f = 0;
        this.f278964g = 0;
        this.f278965h = 0;
        this.f278966i = 0;
        this.f278969o = false;
        this.f278967m = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965;
        this.f278972r = new android.view.GestureDetector(getContext(), this.D);
    }

    public void c(int i17) {
        this.f278971q.forceFinished(true);
        android.widget.Scroller scroller = this.f278971q;
        int i18 = this.f278965h;
        scroller.startScroll(i18, 0, i17 - i18, 0);
        this.B = true;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f278972r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/base/MMHorList", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/ui/base/MMHorList", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 0) {
            this.A = true;
            db5.m3 m3Var = this.f278961d;
            if (m3Var != null) {
                ((fh4.d) m3Var).f344204a.f253987h.d();
            }
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            if (this.f278978x) {
                if (m79005x5538166d() > getWidth()) {
                    int i17 = this.f278965h;
                    if (i17 < 0) {
                        this.f278971q.forceFinished(true);
                        android.widget.Scroller scroller = this.f278971q;
                        int i18 = this.f278965h;
                        scroller.startScroll(i18, 0, 0 - i18, 0);
                        requestLayout();
                    } else if (i17 > this.f278967m) {
                        this.f278971q.forceFinished(true);
                        android.widget.Scroller scroller2 = this.f278971q;
                        int i19 = this.f278965h;
                        scroller2.startScroll(i19, 0, this.f278967m - i19, 0);
                        requestLayout();
                    }
                } else if (this.f278965h != this.f278980z * (-1)) {
                    this.f278971q.forceFinished(true);
                    android.widget.Scroller scroller3 = this.f278971q;
                    int i27 = this.f278965h;
                    scroller3.startScroll(i27, 0, 0 - i27, 0);
                    requestLayout();
                }
            }
            this.A = false;
            db5.m3 m3Var2 = this.f278961d;
            if (m3Var2 != null) {
                ((fh4.d) m3Var2).f344204a.f253987h.c(2000L, 2000L);
            }
        }
        return onTouchEvent;
    }

    /* renamed from: getCurrentPosition */
    public int m79006x9746038c() {
        return this.f278965h;
    }

    /* renamed from: getIsTouching */
    public boolean m79007x8e1f5b83() {
        return this.A;
    }

    @Override // android.widget.AdapterView
    public android.view.View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.util.Queue queue;
        int i28;
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f278975u == null) {
            return;
        }
        this.f278970p = true;
        if (this.f278969o) {
            int i29 = this.f278965h;
            b();
            removeAllViewsInLayout();
            this.f278966i = i29;
            if (this.f278977w) {
                int max = java.lang.Math.max(0, (getWidth() - m79005x5538166d()) / 2);
                this.f278980z = max;
                this.f278964g = max;
            }
            this.f278969o = false;
        }
        if (this.f278971q.computeScrollOffset()) {
            this.f278966i = this.f278971q.getCurrX();
        }
        if (!this.f278978x) {
            if (this.f278966i < 0) {
                this.f278966i = 0;
                this.f278971q.forceFinished(true);
            }
            int i37 = this.f278966i;
            int i38 = this.f278967m;
            if (i37 > i38) {
                this.f278966i = i38;
                this.f278971q.forceFinished(true);
            }
        } else if (m79005x5538166d() > getWidth()) {
            if (this.f278966i < getWidth() * (-1)) {
                this.f278966i = (getWidth() * (-1)) + 1;
                this.f278971q.forceFinished(true);
            }
            if (this.f278966i > this.f278967m + getWidth()) {
                this.f278966i = (this.f278967m + getWidth()) - 1;
                this.f278971q.forceFinished(true);
            }
        } else {
            if (this.f278966i < (getWidth() * (-1)) + this.f278980z) {
                this.f278966i = (getWidth() * (-1)) + this.f278980z + 1;
                this.f278971q.forceFinished(true);
            }
            if (this.f278966i > getWidth() - this.f278980z) {
                this.f278966i = (getWidth() - this.f278980z) - 1;
                this.f278971q.forceFinished(true);
            }
        }
        int i39 = this.f278965h - this.f278966i;
        android.view.View childAt = getChildAt(0);
        while (true) {
            queue = this.f278968n;
            if (childAt == null || childAt.getRight() + i39 > 0) {
                break;
            }
            this.f278964g += childAt.getMeasuredWidth();
            ((java.util.LinkedList) queue).offer(childAt);
            removeViewInLayout(childAt);
            this.f278962e++;
            childAt = getChildAt(0);
            this.f278970p = true;
        }
        android.view.View childAt2 = getChildAt(getChildCount() - 1);
        while (childAt2 != null && childAt2.getLeft() + i39 >= getWidth()) {
            ((java.util.LinkedList) queue).offer(childAt2);
            removeViewInLayout(childAt2);
            this.f278963f--;
            childAt2 = getChildAt(getChildCount() - 1);
            this.f278970p = true;
        }
        android.view.View childAt3 = getChildAt(getChildCount() - 1);
        int right = childAt3 != null ? childAt3.getRight() : 0;
        while (right + i39 < getWidth() && this.f278963f < this.f278975u.getCount()) {
            android.view.View view = this.f278975u.getView(this.f278963f, (android.view.View) ((java.util.LinkedList) queue).poll(), this);
            a(view, -1);
            right += view.getMeasuredWidth();
            if (this.f278963f == this.f278975u.getCount() - 1) {
                this.f278967m = (this.f278965h + right) - getWidth();
            }
            this.f278963f++;
        }
        android.view.View childAt4 = getChildAt(0);
        int left = childAt4 != null ? childAt4.getLeft() : 0;
        while (left + i39 > 0 && (i28 = this.f278962e) >= 0) {
            android.view.View view2 = this.f278975u.getView(i28, (android.view.View) ((java.util.LinkedList) queue).poll(), this);
            a(view2, 0);
            left -= view2.getMeasuredWidth();
            this.f278962e--;
            this.f278964g -= view2.getMeasuredWidth();
        }
        if (getChildCount() > 0 && this.f278970p) {
            int i47 = this.f278964g + i39;
            this.f278964g = i47;
            int i48 = 0;
            while (i48 < getChildCount()) {
                android.view.View childAt5 = getChildAt(i48);
                int measuredWidth = childAt5.getMeasuredWidth() + i47;
                childAt5.layout(i47, 0, measuredWidth, childAt5.getMeasuredHeight());
                i48++;
                i47 = measuredWidth;
            }
        }
        this.f278965h = this.f278966i;
        if (!this.f278971q.isFinished()) {
            post(this.f278976v);
            return;
        }
        db5.m3 m3Var = this.f278961d;
        if (m3Var == null || !this.B) {
            return;
        }
        fh4.d dVar = (fh4.d) m3Var;
        dVar.f344204a.f253986g.mo50293x3498a0(new fh4.c(dVar));
        this.B = false;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View childAt;
        android.widget.ListAdapter listAdapter = this.f278975u;
        if (listAdapter == null || listAdapter.getCount() <= 0 || (childAt = getChildAt(0)) == null) {
            super.onMeasure(i17, i18);
        } else {
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: setCenterInParent */
    public void m79008x3ea112a6(boolean z17) {
        this.f278977w = z17;
    }

    /* renamed from: setHorListLitener */
    public void m79009xd176e766(db5.m3 m3Var) {
        this.f278961d = m3Var;
    }

    /* renamed from: setItemWidth */
    public void m79010xdbabe831(int i17) {
        this.f278979y = i17;
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f278974t = onItemClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f278973s = onItemSelectedListener;
    }

    /* renamed from: setOverScrollEnabled */
    public void m79011x15066afe(boolean z17) {
        this.f278978x = z17;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i17) {
    }

    @Override // android.widget.AdapterView
    public android.widget.ListAdapter getAdapter() {
        return this.f278975u;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        if (this.f278975u == null) {
            listAdapter.registerDataSetObserver(this.C);
        }
        this.f278975u = listAdapter;
        b();
        removeAllViewsInLayout();
        requestLayout();
    }

    public C21500x7be515c9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278967m = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965;
        this.f278968n = new java.util.LinkedList();
        this.f278969o = false;
        this.f278970p = false;
        this.f278976v = new db5.j3(this);
        this.f278977w = false;
        this.f278978x = false;
        this.f278979y = 0;
        this.f278980z = 0;
        this.A = false;
        this.B = false;
        this.C = new db5.k3(this);
        this.D = new db5.l3(this);
        b();
    }
}
