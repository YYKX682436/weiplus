package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView */
/* loaded from: classes15.dex */
public class C22410xc19c546b extends android.widget.GridView implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemSelectedListener, android.widget.AdapterView.OnItemLongClickListener {
    public static final /* synthetic */ int L = 0;
    public com.p314xaae8f345.mm.ui.p2708x5ccaae3b.o A;
    public android.widget.AbsListView.OnScrollListener B;
    public int C;
    public android.view.View D;
    public java.lang.Runnable E;
    public final int F;
    public int G;
    public com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f290238J;
    public boolean K;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2708x5ccaae3b.k f290239d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2708x5ccaae3b.l f290240e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f290241f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f290242g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f290243h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f290244i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f290245m;

    /* renamed from: n, reason: collision with root package name */
    public int f290246n;

    /* renamed from: o, reason: collision with root package name */
    public long f290247o;

    /* renamed from: p, reason: collision with root package name */
    public final android.database.DataSetObserver f290248p;

    /* renamed from: q, reason: collision with root package name */
    public int f290249q;

    /* renamed from: r, reason: collision with root package name */
    public int f290250r;

    /* renamed from: s, reason: collision with root package name */
    public float f290251s;

    /* renamed from: t, reason: collision with root package name */
    public int f290252t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f290253u;

    /* renamed from: v, reason: collision with root package name */
    public int f290254v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2708x5ccaae3b.m f290255w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f290256x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.AdapterView.OnItemLongClickListener f290257y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f290258z;

    /* renamed from: com.tencent.mm.ui.gridviewheaders.GridHeadersGridView$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b.SavedState> f39599x681a0c0c = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.p();

        /* renamed from: d, reason: collision with root package name */
        public boolean f290259d;

        public SavedState(android.os.Parcel parcel, com.p314xaae8f345.mm.ui.p2708x5ccaae3b.i iVar) {
            super(parcel);
            this.f290259d = parcel.readByte() != 0;
        }

        /* renamed from: toString */
        public java.lang.String m80674x9616526c() {
            return "StickyGridHeadersGridView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " areHeadersSticky=" + this.f290259d + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeByte(this.f290259d ? (byte) 1 : (byte) 0);
        }
    }

    public C22410xc19c546b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.gridViewStyle);
    }

    /* renamed from: getHeaderHeight */
    private int m80666xc4e2148a() {
        android.view.View view = this.D;
        if (view != null) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    public android.view.View d(int i17) {
        if (i17 == -2) {
            return this.D;
        }
        try {
            return (android.view.View) getChildAt(i17).getTag();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        android.view.View view = this.D;
        int i17 = 0;
        boolean z17 = view != null && this.f290242g && view.getVisibility() == 0;
        int m80666xc4e2148a = m80666xc4e2148a();
        int i18 = this.f290249q - m80666xc4e2148a;
        android.graphics.Rect rect = this.f290243h;
        if (z17 && this.K) {
            rect.left = getPaddingLeft();
            rect.right = getWidth() - getPaddingRight();
            rect.top = this.f290249q;
            rect.bottom = getHeight();
            canvas.save();
            canvas.clipRect(rect);
        }
        super.dispatchDraw(canvas);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int firstVisiblePosition = getFirstVisiblePosition();
        int i19 = 0;
        while (firstVisiblePosition <= getLastVisiblePosition()) {
            if (getItemIdAtPosition(firstVisiblePosition) == -1) {
                arrayList.add(java.lang.Integer.valueOf(i19));
            }
            int i27 = this.f290254v;
            firstVisiblePosition += i27;
            i19 += i27;
        }
        int i28 = 0;
        while (i28 < arrayList.size()) {
            com.p314xaae8f345.mm.ui.p2708x5ccaae3b.g gVar = (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.g) getChildAt(((java.lang.Integer) arrayList.get(i28)).intValue());
            try {
                android.view.View view2 = (android.view.View) gVar.getTag();
                boolean z18 = ((long) ((com.p314xaae8f345.mm.ui.p2708x5ccaae3b.e) gVar.getChildAt(i17)).m80675x3960b9fe()) == this.f290247o && gVar.getTop() < 0 && this.f290242g;
                if (view2.getVisibility() == 0 && !z18) {
                    view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), (1073741824 - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                    view2.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), gVar.getHeight());
                    rect.left = getPaddingLeft();
                    rect.right = getWidth() - getPaddingRight();
                    rect.bottom = gVar.getBottom();
                    rect.top = gVar.getTop();
                    canvas.save();
                    canvas.clipRect(rect);
                    canvas.translate(getPaddingLeft(), gVar.getTop());
                    view2.draw(canvas);
                    canvas.restore();
                }
                i28++;
                i17 = 0;
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        if (z17 && this.K) {
            canvas.restore();
        } else if (!z17) {
            return;
        }
        if (this.D.getWidth() != (getWidth() - getPaddingLeft()) - getPaddingRight()) {
            this.D.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), (1073741824 - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            this.D.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.D.getHeight());
        }
        rect.left = getPaddingLeft();
        rect.right = getWidth() - getPaddingRight();
        rect.bottom = i18 + m80666xc4e2148a;
        if (this.f290244i) {
            rect.top = getPaddingTop();
        } else {
            rect.top = 0;
        }
        canvas.save();
        canvas.clipRect(rect);
        canvas.translate(getPaddingLeft(), i18);
        canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) ((this.f290249q * 255.0f) / m80666xc4e2148a), 31);
        this.D.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void f() {
        int i17;
        if (this.D == null) {
            return;
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec((getWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824);
        android.view.ViewGroup.LayoutParams layoutParams = this.D.getLayoutParams();
        this.D.measure(makeMeasureSpec, (layoutParams == null || (i17 = layoutParams.height) <= 0) ? android.view.View.MeasureSpec.makeMeasureSpec(0, 0) : android.view.View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
        this.D.layout(getLeft() + getPaddingLeft(), 0, getRight() - getPaddingRight(), this.D.getMeasuredHeight());
    }

    /* renamed from: getStickiedHeader */
    public android.view.View m80667x4609bddb() {
        return this.D;
    }

    /* renamed from: getStickyHeaderIsTranscluent */
    public boolean m80668x11aca471() {
        return !this.K;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f290256x.onItemClick(adapterView, view, this.H.c(i17).f290267b, j17);
        yj0.a.h(this, "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        return this.f290257y.onItemLongClick(adapterView, view, this.H.c(i17).f290267b, j17);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f290258z.onItemSelected(adapterView, view, this.H.c(i17).f290267b, j17);
        yj0.a.h(this, "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27 = this.f290252t;
        if (i27 == -1) {
            if (this.f290246n > 0) {
                int max = java.lang.Math.max((android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight(), 0);
                int i28 = max / this.f290246n;
                i19 = 1;
                if (i28 > 0) {
                    while (i28 != 1) {
                        int i29 = i28 - 1;
                        if ((this.f290246n * i28) + (this.f290250r * i29) <= max) {
                            break;
                        } else {
                            i28 = i29;
                        }
                    }
                    i19 = i28;
                }
            } else {
                i19 = 2;
            }
            this.f290254v = i19;
        } else {
            this.f290254v = i27;
        }
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h hVar = this.H;
        if (hVar != null) {
            int i37 = this.f290254v;
            hVar.f290279i = i37;
            android.view.View[] viewArr = new android.view.View[i37];
            hVar.f290280m = viewArr;
            java.util.Arrays.fill(viewArr, (java.lang.Object) null);
        }
        f();
        super.onMeasure(i17, i18);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
        this.f290258z.onNothingSelected(adapterView);
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b.SavedState savedState = (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f290242g = savedState.f290259d;
        requestLayout();
    }

    @Override // android.widget.AbsListView, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b.SavedState savedState = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b.SavedState(super.onSaveInstanceState());
        savedState.f290259d = this.f290242g;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    @Override // android.widget.AbsListView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScroll(android.widget.AbsListView r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        android.widget.AbsListView.OnScrollListener onScrollListener = this.B;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i17);
        }
        this.C = i17;
        yj0.a.h(this, "com/tencent/mm/ui/gridviewheaders/GridHeadersGridView", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    /* renamed from: setAreHeadersSticky */
    public void m80669xf2806b9d(boolean z17) {
        if (z17 != this.f290242g) {
            this.f290242g = z17;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z17) {
        super.setClipToPadding(z17);
        this.f290244i = z17;
        this.f290245m = true;
    }

    @Override // android.widget.GridView
    public void setColumnWidth(int i17) {
        super.setColumnWidth(i17);
        this.f290246n = i17;
    }

    @Override // android.widget.GridView
    public void setHorizontalSpacing(int i17) {
        super.setHorizontalSpacing(i17);
        this.f290250r = i17;
    }

    @Override // android.widget.GridView
    public void setNumColumns(int i17) {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h hVar;
        super.setNumColumns(i17);
        this.f290253u = true;
        this.f290252t = i17;
        if (i17 == -1 || (hVar = this.H) == null) {
            return;
        }
        hVar.f290279i = i17;
        android.view.View[] viewArr = new android.view.View[i17];
        hVar.f290280m = viewArr;
        java.util.Arrays.fill(viewArr, (java.lang.Object) null);
    }

    /* renamed from: setOnHeaderClickListener */
    public void m80670x76e35d2e(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.m mVar) {
        this.f290255w = mVar;
    }

    /* renamed from: setOnHeaderLongClickListener */
    public void m80671x53537712(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.n nVar) {
        if (isLongClickable()) {
            return;
        }
        setLongClickable(true);
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f290256x = onItemClickListener;
        super.setOnItemClickListener(this);
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f290257y = onItemLongClickListener;
        super.setOnItemLongClickListener(this);
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f290258z = onItemSelectedListener;
        super.setOnItemSelectedListener(this);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onScrollListener) {
        this.B = onScrollListener;
    }

    /* renamed from: setStickyHeaderIsTranscluent */
    public void m80672x5b78fce5(boolean z17) {
        this.K = !z17;
    }

    @Override // android.widget.GridView
    public void setVerticalSpacing(int i17) {
        super.setVerticalSpacing(i17);
        this.G = i17;
    }

    public C22410xc19c546b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f290241f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f290242g = true;
        this.f290243h = new android.graphics.Rect();
        this.f290247o = -1L;
        this.f290248p = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.i(this);
        this.f290254v = 1;
        this.C = 0;
        this.K = true;
        super.setOnScrollListener(this);
        setVerticalFadingEdgeEnabled(false);
        if (!this.f290253u) {
            this.f290252t = -1;
        }
        this.F = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b sVar;
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b bVar;
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h hVar = this.H;
        android.database.DataSetObserver dataSetObserver = this.f290248p;
        if (hVar != null && dataSetObserver != null) {
            hVar.unregisterDataSetObserver(dataSetObserver);
        }
        if (!this.f290245m) {
            this.f290244i = true;
        }
        if (listAdapter instanceof com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b) {
            bVar = (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b) listAdapter;
        } else {
            if (listAdapter instanceof com.p314xaae8f345.mm.ui.p2708x5ccaae3b.t) {
                sVar = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.x((com.p314xaae8f345.mm.ui.p2708x5ccaae3b.t) listAdapter);
            } else {
                sVar = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.s(listAdapter);
            }
            bVar = sVar;
        }
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h hVar2 = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.h(getContext(), this, bVar);
        this.H = hVar2;
        hVar2.registerDataSetObserver(dataSetObserver);
        this.f290249q = 0;
        this.D = null;
        this.f290247o = Long.MIN_VALUE;
        super.setAdapter((android.widget.ListAdapter) this.H);
    }
}
