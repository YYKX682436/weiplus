package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.HorizontalListView */
/* loaded from: classes15.dex */
public class C21477xd5dd28c7 extends android.widget.AdapterView<android.widget.ListAdapter> {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f278793v = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListAdapter f278794d;

    /* renamed from: e, reason: collision with root package name */
    public int f278795e;

    /* renamed from: f, reason: collision with root package name */
    public int f278796f;

    /* renamed from: g, reason: collision with root package name */
    public int f278797g;

    /* renamed from: h, reason: collision with root package name */
    public int f278798h;

    /* renamed from: i, reason: collision with root package name */
    public int f278799i;

    /* renamed from: m, reason: collision with root package name */
    public int f278800m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Scroller f278801n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.GestureDetector f278802o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Queue f278803p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f278804q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f278805r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f278806s;

    /* renamed from: t, reason: collision with root package name */
    public final android.database.DataSetObserver f278807t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.GestureDetector.OnGestureListener f278808u;

    public C21477xd5dd28c7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278795e = -1;
        this.f278796f = 0;
        this.f278799i = Integer.MAX_VALUE;
        this.f278800m = 0;
        this.f278803p = new java.util.LinkedList();
        this.f278806s = false;
        this.f278807t = new db5.t(this);
        this.f278808u = new db5.v(this);
        c();
    }

    public final void a(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        addViewInLayout(view, i17, layoutParams, true);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
    }

    public final void b(int i17) {
        java.util.Queue queue;
        int i18;
        android.view.View childAt = getChildAt(getChildCount() - 1);
        int right = childAt != null ? childAt.getRight() : 0;
        while (true) {
            int i19 = right + i17;
            int width = getWidth();
            queue = this.f278803p;
            if (i19 >= width || this.f278796f >= this.f278794d.getCount()) {
                break;
            }
            android.view.View view = this.f278794d.getView(this.f278796f, (android.view.View) ((java.util.LinkedList) queue).poll(), this);
            a(view, -1);
            right += view.getMeasuredWidth();
            if (this.f278796f == this.f278794d.getCount() - 1) {
                this.f278799i = (this.f278797g + right) - getWidth();
            }
            if (this.f278799i < 0) {
                this.f278799i = 0;
            }
            this.f278796f++;
        }
        android.view.View childAt2 = getChildAt(0);
        int left = childAt2 != null ? childAt2.getLeft() : 0;
        while (left + i17 > 0 && (i18 = this.f278795e) >= 0) {
            android.view.View view2 = this.f278794d.getView(i18, (android.view.View) ((java.util.LinkedList) queue).poll(), this);
            a(view2, 0);
            left -= view2.getMeasuredWidth();
            this.f278795e--;
            this.f278800m -= view2.getMeasuredWidth();
        }
    }

    public final synchronized void c() {
        this.f278795e = -1;
        this.f278796f = 0;
        this.f278800m = 0;
        this.f278797g = 0;
        this.f278798h = 0;
        this.f278799i = Integer.MAX_VALUE;
        this.f278801n = new android.widget.Scroller(getContext());
        this.f278802o = new android.view.GestureDetector(getContext(), this.f278808u);
    }

    public final void d(int i17) {
        java.util.Queue queue;
        android.view.View childAt = getChildAt(0);
        while (true) {
            queue = this.f278803p;
            if (childAt == null || childAt.getRight() + i17 > 0) {
                break;
            }
            this.f278800m += childAt.getMeasuredWidth();
            ((java.util.LinkedList) queue).offer(childAt);
            removeViewInLayout(childAt);
            this.f278795e++;
            childAt = getChildAt(0);
        }
        android.view.View childAt2 = getChildAt(getChildCount() - 1);
        while (childAt2 != null && childAt2.getLeft() + i17 >= getWidth()) {
            ((java.util.LinkedList) queue).offer(childAt2);
            removeViewInLayout(childAt2);
            this.f278796f--;
            childAt2 = getChildAt(getChildCount() - 1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        android.view.GestureDetector gestureDetector = this.f278802o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/base/HorizontalListView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/ui/base/HorizontalListView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent | dispatchTouchEvent;
    }

    @Override // android.widget.AdapterView
    public android.view.View getSelectedView() {
        return null;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public synchronized void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f278794d == null) {
            return;
        }
        if (this.f278806s) {
            int i28 = this.f278797g;
            c();
            removeAllViewsInLayout();
            this.f278798h = i28;
            this.f278806s = false;
        }
        if (this.f278801n.computeScrollOffset()) {
            this.f278798h = this.f278801n.getCurrX();
        }
        if (this.f278798h <= 0) {
            this.f278798h = 0;
            this.f278801n.forceFinished(true);
        }
        int i29 = this.f278798h;
        int i37 = this.f278799i;
        if (i29 >= i37) {
            this.f278798h = i37;
            this.f278801n.forceFinished(true);
        }
        int i38 = this.f278797g - this.f278798h;
        d(i38);
        b(i38);
        if (getChildCount() > 0) {
            int i39 = this.f278800m + i38;
            this.f278800m = i39;
            int i47 = 0;
            while (i47 < getChildCount()) {
                android.view.View childAt = getChildAt(i47);
                int measuredWidth = childAt.getMeasuredWidth() + i39;
                childAt.layout(i39, 0, measuredWidth, childAt.getMeasuredHeight());
                i47++;
                i39 = measuredWidth;
            }
        }
        this.f278797g = this.f278798h;
        if (!this.f278801n.isFinished()) {
            post(new db5.u(this));
        }
    }

    /* renamed from: setDispatchTouchListener */
    public void m78888x227b5f77(db5.w wVar) {
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f278805r = onItemClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f278804q = onItemSelectedListener;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i17) {
    }

    @Override // android.widget.AdapterView
    public android.widget.ListAdapter getAdapter() {
        return this.f278794d;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        android.widget.ListAdapter listAdapter2 = this.f278794d;
        android.database.DataSetObserver dataSetObserver = this.f278807t;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f278794d = listAdapter;
        listAdapter.registerDataSetObserver(dataSetObserver);
        synchronized (this) {
            c();
            removeAllViewsInLayout();
            requestLayout();
        }
    }
}
