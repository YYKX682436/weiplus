package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.HorizontalListViewV2 */
/* loaded from: classes15.dex */
public class C21478xd3361da3 extends android.widget.AdapterView<android.widget.ListAdapter> {
    public static final /* synthetic */ int H = 0;
    public final p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i A;
    public int B;
    public boolean C;
    public boolean D;
    public android.view.View.OnClickListener E;
    public final android.database.DataSetObserver F;
    public final java.lang.Runnable G;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.Scroller f278809d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.GestureDetector f278810e;

    /* renamed from: f, reason: collision with root package name */
    public int f278811f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListAdapter f278812g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f278813h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f278814i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f278815m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f278816n;

    /* renamed from: o, reason: collision with root package name */
    public int f278817o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.drawable.Drawable f278818p;

    /* renamed from: q, reason: collision with root package name */
    public int f278819q;

    /* renamed from: r, reason: collision with root package name */
    public int f278820r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Integer f278821s;

    /* renamed from: t, reason: collision with root package name */
    public int f278822t;

    /* renamed from: u, reason: collision with root package name */
    public int f278823u;

    /* renamed from: v, reason: collision with root package name */
    public int f278824v;

    /* renamed from: w, reason: collision with root package name */
    public int f278825w;

    /* renamed from: x, reason: collision with root package name */
    public db5.c0 f278826x;

    /* renamed from: y, reason: collision with root package name */
    public db5.b0 f278827y;

    /* renamed from: z, reason: collision with root package name */
    public final p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i f278828z;

    public C21478xd3361da3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.widget.Scroller scroller = new android.widget.Scroller(getContext());
        this.f278809d = scroller;
        db5.a0 a0Var = new db5.a0(this, null);
        this.f278813h = new java.util.ArrayList();
        this.f278814i = false;
        this.f278815m = new android.graphics.Rect();
        this.f278816n = null;
        this.f278817o = 0;
        this.f278818p = null;
        this.f278821s = null;
        this.f278822t = Integer.MAX_VALUE;
        this.f278826x = null;
        this.f278827y = db5.b0.SCROLL_STATE_IDLE;
        this.C = false;
        this.D = false;
        this.F = new db5.y(this);
        this.G = new db5.z(this);
        this.f278828z = new p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i(context);
        this.A = new p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i(context);
        this.f278810e = new android.view.GestureDetector(context, a0Var);
        setOnTouchListener(new db5.x(this));
        f();
        setWillNotDraw(false);
        scroller.setFriction(0.009f);
    }

    public static void b(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21478xd3361da3 c21478xd3361da3, int i17) {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i iVar;
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i iVar2 = c21478xd3361da3.f278828z;
        if (iVar2 == null || (iVar = c21478xd3361da3.A) == null) {
            return;
        }
        int i18 = c21478xd3361da3.f278819q + i17;
        android.widget.Scroller scroller = c21478xd3361da3.f278809d;
        if (scroller == null || scroller.isFinished()) {
            if (i18 < 0) {
                iVar2.c(java.lang.Math.abs(i17) / c21478xd3361da3.m78891x785dd09a());
                if (iVar.b()) {
                    return;
                }
                iVar.e();
                return;
            }
            if (i18 > c21478xd3361da3.f278822t) {
                iVar.c(java.lang.Math.abs(i17) / c21478xd3361da3.m78891x785dd09a());
                if (iVar2.b()) {
                    return;
                }
                iVar2.e();
            }
        }
    }

    /* renamed from: getLeftmostChild */
    private android.view.View m78889x2328b77c() {
        return getChildAt(0);
    }

    /* renamed from: getRenderHeight */
    private int m78890x798d48d3() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: getRenderWidth */
    private int m78891x785dd09a() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: getRightmostChild */
    private android.view.View m78892x56c82db3() {
        return getChildAt(getChildCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentScrollState */
    public void m78893xf667fe8d(db5.b0 b0Var) {
        db5.c0 c0Var;
        if (this.f278827y != b0Var && (c0Var = this.f278826x) != null) {
            ub3.q qVar = (ub3.q) c0Var;
            if (b0Var == db5.b0.SCROLL_STATE_IDLE) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = qVar.f507664a;
                if (((java.util.ArrayList) activityC16330x45b4a404.f226616t).size() >= 5 && ((java.util.ArrayList) activityC16330x45b4a404.f226616t).size() < activityC16330x45b4a404.K && activityC16330x45b4a404.f226615s.getLastVisiblePosition() == ((java.util.ArrayList) activityC16330x45b4a404.f226616t).size() - 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16330x45b4a404.F)) {
                    activityC16330x45b4a404.m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5(activityC16330x45b4a404.F, 5, ((java.util.ArrayList) activityC16330x45b4a404.f226616t).size(), null, "v1.0"));
                }
            } else {
                qVar.getClass();
            }
        }
        this.f278827y = b0Var;
    }

    public final void c(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
        }
        addViewInLayout(view, i17, layoutParams, true);
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new android.view.ViewGroup.LayoutParams(-2, -1);
        }
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(this.B, getPaddingTop() + getPaddingBottom(), layoutParams2.height);
        int i18 = layoutParams2.width;
        view.measure(i18 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0), childMeasureSpec);
    }

    public final int d(int i17, int i18) {
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = getChildAt(i19);
            android.graphics.Rect rect = this.f278815m;
            childAt.getHitRect(rect);
            if (rect.contains(i17, i18)) {
                return i19;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z17) {
    }

    public final android.view.View e(int i17) {
        int itemViewType = this.f278812g.getItemViewType(i17);
        java.util.List list = this.f278813h;
        if (itemViewType < ((java.util.ArrayList) list).size()) {
            return (android.view.View) ((java.util.Queue) ((java.util.ArrayList) list).get(itemViewType)).poll();
        }
        return null;
    }

    public final void f() {
        this.f278823u = -1;
        this.f278824v = -1;
        this.f278811f = 0;
        this.f278819q = 0;
        this.f278820r = 0;
        this.f278822t = Integer.MAX_VALUE;
        m78893xf667fe8d(db5.b0.SCROLL_STATE_IDLE);
    }

    public boolean g(android.view.MotionEvent motionEvent) {
        int d17;
        android.widget.Scroller scroller = this.f278809d;
        this.C = !scroller.isFinished();
        scroller.forceFinished(true);
        m78893xf667fe8d(db5.b0.SCROLL_STATE_IDLE);
        k();
        if (!this.C && (d17 = d((int) motionEvent.getX(), (int) motionEvent.getY())) >= 0) {
            android.view.View childAt = getChildAt(d17);
            this.f278816n = childAt;
            if (childAt != null) {
                childAt.setPressed(true);
                refreshDrawableState();
            }
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public int getFirstVisiblePosition() {
        return this.f278823u;
    }

    @Override // android.widget.AdapterView
    public int getLastVisiblePosition() {
        return this.f278824v;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i17 = this.f278819q;
        if (i17 == 0) {
            return 0.0f;
        }
        if (i17 < horizontalFadingEdgeLength) {
            return i17 / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i17 = this.f278819q;
        int i18 = this.f278822t;
        if (i17 == i18) {
            return 0.0f;
        }
        if (i18 - i17 < horizontalFadingEdgeLength) {
            return (i18 - i17) / horizontalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.widget.AdapterView
    public android.view.View getSelectedView() {
        int i17 = this.f278825w;
        int i18 = this.f278823u;
        if (i17 < i18 || i17 > this.f278824v) {
            return null;
        }
        return getChildAt(i17 - i18);
    }

    public boolean h(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        this.f278809d.fling(this.f278820r, 0, (int) (-f17), 0, 0, this.f278822t, 0, 0);
        m78893xf667fe8d(db5.b0.SCROLL_STATE_FLING);
        requestLayout();
        return true;
    }

    public final void i(java.lang.Boolean bool) {
        if (this.D != bool.booleanValue()) {
            for (android.view.View view = this; view.getParent() instanceof android.view.View; view = (android.view.View) view.getParent()) {
                if ((view.getParent() instanceof android.widget.ListView) || (view.getParent() instanceof android.widget.ScrollView)) {
                    view.getParent().requestDisallowInterceptTouchEvent(bool.booleanValue());
                    this.D = bool.booleanValue();
                    return;
                }
            }
        }
    }

    public void j(int i17) {
        android.widget.Scroller scroller = this.f278809d;
        int i18 = this.f278820r;
        scroller.startScroll(i18, 0, i17 - i18, 0);
        m78893xf667fe8d(db5.b0.SCROLL_STATE_FLING);
        requestLayout();
    }

    public final void k() {
        android.view.View view = this.f278816n;
        if (view != null) {
            view.setPressed(false);
            refreshDrawableState();
            this.f278816n = null;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int i17;
        super.onDraw(canvas);
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        android.graphics.Rect rect = this.f278815m;
        rect.top = paddingTop;
        rect.bottom = paddingTop + m78890x798d48d3();
        for (0; i17 < childCount; i17 + 1) {
            if (i17 == childCount - 1) {
                i17 = this.f278824v == this.f278812g.getCount() - 1 ? i17 + 1 : 0;
            }
            android.view.View childAt = getChildAt(i17);
            rect.left = childAt.getRight();
            rect.right = childAt.getRight() + this.f278817o;
            if (rect.left < getPaddingLeft()) {
                rect.left = getPaddingLeft();
            }
            if (rect.right > getWidth() - getPaddingRight()) {
                rect.right = getWidth() - getPaddingRight();
            }
            android.graphics.drawable.Drawable drawable = this.f278818p;
            if (drawable != null) {
                drawable.setBounds(rect);
                this.f278818p.draw(canvas);
            }
            if (i17 == 0 && childAt.getLeft() > getPaddingLeft()) {
                rect.left = getPaddingLeft();
                rect.right = childAt.getLeft();
                android.graphics.drawable.Drawable drawable2 = this.f278818p;
                if (drawable2 != null) {
                    drawable2.setBounds(rect);
                    this.f278818p.draw(canvas);
                }
            }
        }
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.util.List list;
        android.view.View m78892x56c82db3;
        int i28;
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.f278812g == null) {
            return;
        }
        invalidate();
        boolean z18 = false;
        if (this.f278814i) {
            int i29 = this.f278819q;
            f();
            removeAllViewsInLayout();
            this.f278820r = i29;
            this.f278814i = false;
        }
        java.lang.Integer num = this.f278821s;
        if (num != null) {
            this.f278820r = num.intValue();
            this.f278821s = null;
        }
        android.widget.Scroller scroller = this.f278809d;
        if (scroller.computeScrollOffset()) {
            this.f278820r = scroller.getCurrX();
        }
        int i37 = this.f278820r;
        db5.b0 b0Var = db5.b0.SCROLL_STATE_IDLE;
        if (i37 < 0) {
            this.f278820r = 0;
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i iVar = this.f278828z;
            if (iVar.b()) {
                iVar.f92635a.onAbsorb((int) scroller.getCurrVelocity());
            }
            scroller.forceFinished(true);
            m78893xf667fe8d(b0Var);
        } else {
            int i38 = this.f278822t;
            if (i37 > i38) {
                this.f278820r = i38;
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i iVar2 = this.A;
                if (iVar2.b()) {
                    iVar2.f92635a.onAbsorb((int) scroller.getCurrVelocity());
                }
                scroller.forceFinished(true);
                m78893xf667fe8d(b0Var);
            }
        }
        int i39 = this.f278819q - this.f278820r;
        android.view.View m78889x2328b77c = m78889x2328b77c();
        while (true) {
            list = this.f278813h;
            if (m78889x2328b77c == null || m78889x2328b77c.getRight() + i39 > 0) {
                break;
            }
            this.f278811f += this.f278823u == this.f278812g.getCount() - 1 ? m78889x2328b77c.getMeasuredWidth() : this.f278817o + m78889x2328b77c.getMeasuredWidth();
            int itemViewType = this.f278812g.getItemViewType(this.f278823u);
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (itemViewType < arrayList.size()) {
                ((java.util.Queue) arrayList.get(itemViewType)).offer(m78889x2328b77c);
            }
            removeViewInLayout(m78889x2328b77c);
            this.f278823u++;
            m78889x2328b77c = m78889x2328b77c();
        }
        android.view.View m78892x56c82db32 = m78892x56c82db3();
        while (m78892x56c82db32 != null && m78892x56c82db32.getLeft() + i39 >= getWidth()) {
            int itemViewType2 = this.f278812g.getItemViewType(this.f278824v);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            if (itemViewType2 < arrayList2.size()) {
                ((java.util.Queue) arrayList2.get(itemViewType2)).offer(m78892x56c82db32);
            }
            removeViewInLayout(m78892x56c82db32);
            this.f278824v--;
            m78892x56c82db32 = m78892x56c82db3();
        }
        android.view.View m78892x56c82db33 = m78892x56c82db3();
        int right = m78892x56c82db33 != null ? m78892x56c82db33.getRight() : 0;
        while (right + i39 + this.f278817o < getWidth() && this.f278824v + 1 < this.f278812g.getCount()) {
            int i47 = this.f278824v + 1;
            this.f278824v = i47;
            if (this.f278823u < 0) {
                this.f278823u = i47;
            }
            android.view.View view = this.f278812g.getView(i47, e(i47), this);
            c(view, -1);
            right += (this.f278824v == 0 ? 0 : this.f278817o) + view.getMeasuredWidth();
        }
        android.view.View m78889x2328b77c2 = m78889x2328b77c();
        int left = m78889x2328b77c2 != null ? m78889x2328b77c2.getLeft() : 0;
        while ((left + i39) - this.f278817o > 0 && (i28 = this.f278823u) >= 1) {
            int i48 = i28 - 1;
            this.f278823u = i48;
            android.view.View view2 = this.f278812g.getView(i48, e(i48), this);
            c(view2, 0);
            left -= this.f278823u == 0 ? view2.getMeasuredWidth() : this.f278817o + view2.getMeasuredWidth();
            this.f278811f -= left + i39 == 0 ? view2.getMeasuredWidth() : view2.getMeasuredWidth() + this.f278817o;
        }
        int childCount = getChildCount();
        if (childCount > 0) {
            int i49 = this.f278811f + i39;
            this.f278811f = i49;
            for (int i57 = 0; i57 < childCount; i57++) {
                android.view.View childAt = getChildAt(i57);
                int paddingLeft = getPaddingLeft() + i49;
                int paddingTop = getPaddingTop();
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                i49 += childAt.getMeasuredWidth() + this.f278817o;
            }
        }
        this.f278819q = this.f278820r;
        if ((this.f278824v == this.f278812g.getCount() - 1) && (m78892x56c82db3 = m78892x56c82db3()) != null) {
            int i58 = this.f278822t;
            int right2 = (this.f278819q + (m78892x56c82db3.getRight() - getPaddingLeft())) - m78891x785dd09a();
            this.f278822t = right2;
            if (right2 < 0) {
                this.f278822t = 0;
            }
            if (this.f278822t != i58) {
                z18 = true;
            }
        }
        if (z18) {
            onLayout(z17, i17, i18, i19, i27);
            return;
        }
        if (scroller.isFinished()) {
            if (this.f278827y == db5.b0.SCROLL_STATE_FLING) {
                m78893xf667fe8d(b0Var);
            }
        } else {
            java.lang.Runnable runnable = this.G;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.m(this, runnable);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.B = i18;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            this.f278821s = java.lang.Integer.valueOf(bundle.getInt("BUNDLE_ID_CURRENT_X"));
            super.onRestoreInstanceState(bundle.getParcelable("BUNDLE_ID_PARENT_STATE"));
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("BUNDLE_ID_PARENT_STATE", super.onSaveInstanceState());
        bundle.putInt("BUNDLE_ID_CURRENT_X", this.f278819q);
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i iVar = this.A;
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.i iVar2 = this.f278828z;
        if (action == 1) {
            android.widget.Scroller scroller = this.f278809d;
            if (scroller == null || scroller.isFinished()) {
                m78893xf667fe8d(db5.b0.SCROLL_STATE_IDLE);
            }
            i(java.lang.Boolean.FALSE);
            if (iVar2 != null) {
                iVar2.e();
            }
            if (iVar != null) {
                iVar.e();
            }
        } else if (motionEvent.getAction() == 3) {
            k();
            if (iVar2 != null) {
                iVar2.e();
            }
            if (iVar != null) {
                iVar.e();
            }
            i(java.lang.Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setDivider */
    public void m78894x150a9c57(android.graphics.drawable.Drawable drawable) {
        this.f278818p = drawable;
        if (drawable != null) {
            m78895x4ea7bfaf(drawable.getIntrinsicWidth());
        } else {
            m78895x4ea7bfaf(0);
        }
    }

    /* renamed from: setDividerWidth */
    public void m78895x4ea7bfaf(int i17) {
        this.f278817o = i17;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.AdapterView, android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.E = onClickListener;
    }

    /* renamed from: setOnScrollStateChangedListener */
    public void m78896x4d4eb3e5(db5.c0 c0Var) {
        this.f278826x = c0Var;
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i17) {
        this.f278825w = i17;
    }

    @Override // android.widget.AdapterView
    public android.widget.ListAdapter getAdapter() {
        return this.f278812g;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        android.widget.ListAdapter listAdapter2 = this.f278812g;
        android.database.DataSetObserver dataSetObserver = this.F;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        if (listAdapter != null) {
            this.f278812g = listAdapter;
            listAdapter.registerDataSetObserver(dataSetObserver);
        }
        android.widget.ListAdapter listAdapter3 = this.f278812g;
        if (listAdapter3 != null) {
            int viewTypeCount = listAdapter3.getViewTypeCount();
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f278813h;
            arrayList.clear();
            for (int i17 = 0; i17 < viewTypeCount; i17++) {
                arrayList.add(new java.util.LinkedList());
            }
        }
        f();
        removeAllViewsInLayout();
        requestLayout();
    }
}
