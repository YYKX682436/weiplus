package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.FlowLayout */
/* loaded from: classes11.dex */
public class C21475x81dbaa18 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f278787d;

    /* renamed from: e, reason: collision with root package name */
    public int f278788e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f278789f;

    /* renamed from: g, reason: collision with root package name */
    public int f278790g;

    /* renamed from: h, reason: collision with root package name */
    public int f278791h;

    public C21475x81dbaa18(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278787d = 0;
        this.f278788e = 0;
        this.f278789f = new java.util.LinkedList();
        this.f278790g = 0;
        this.f278791h = 0;
        a(context, attributeSet);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528723h);
        try {
            this.f278787d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f278788e = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.LayoutParams;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: getLineCount */
    public int m78884x92d2fac5() {
        return this.f278789f.size();
    }

    /* renamed from: getRealLineCount */
    public int m78885x8149fdc7() {
        return this.f278790g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int childCount = getChildCount();
        int i28 = i19 - i17;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f278790g = 1;
        int i29 = 0;
        for (int i37 = 0; i37 < childCount; i37++) {
            android.view.View childAt = getChildAt(i37);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int paddingRight = paddingLeft + measuredWidth + getPaddingRight();
                java.util.LinkedList linkedList = this.f278789f;
                if (paddingRight > i28) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += ((java.lang.Integer) linkedList.get(i29)).intValue() + this.f278788e;
                    i29++;
                    this.f278790g++;
                }
                int intValue = ((((java.lang.Integer) linkedList.get(i29)).intValue() - measuredHeight) / 2) + paddingTop;
                childAt.layout(paddingLeft, intValue, paddingLeft + measuredWidth, measuredHeight + intValue);
                paddingLeft += measuredWidth + this.f278787d;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int paddingTop;
        int paddingBottom;
        int i27;
        android.view.View view;
        if (android.view.View.MeasureSpec.getMode(i17) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlowLayout", " getMode(widthMeasureSpec) == MeasureSpec.UNSPECIFIED");
        }
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        int size2 = (android.view.View.MeasureSpec.getSize(i18) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        java.util.LinkedList linkedList = this.f278789f;
        linkedList.clear();
        int i28 = Integer.MIN_VALUE;
        int i29 = 0;
        int makeMeasureSpec = android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE ? android.view.View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int i37 = 1;
        int i38 = 0;
        int i39 = 0;
        int i47 = 0;
        int i48 = 0;
        while (i38 < childCount) {
            android.view.View childAt = getChildAt(i38);
            if (childAt.getVisibility() == 8) {
                i27 = size;
            } else {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, i28), makeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                if (i48 + measuredWidth > size) {
                    int i49 = this.f278791h;
                    if (i49 <= 0) {
                        i27 = size;
                        view = childAt;
                    } else if (i37 + 1 > i49) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        i27 = size;
                        yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/ui/base/FlowLayout", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        i29 = 0;
                        childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(childAt, "com/tencent/mm/ui/base/FlowLayout", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        i27 = size;
                        view = childAt;
                        i29 = 0;
                    }
                    i47 += this.f278788e + i39;
                    linkedList.add(java.lang.Integer.valueOf(i39));
                    i37++;
                    i39 = i29;
                    i48 = i39;
                } else {
                    i27 = size;
                    view = childAt;
                }
                i39 = java.lang.Math.max(i39, view.getMeasuredHeight());
                i48 += measuredWidth + this.f278787d;
            }
            i38++;
            size = i27;
            i28 = Integer.MIN_VALUE;
        }
        linkedList.add(java.lang.Integer.valueOf(i39));
        if (android.view.View.MeasureSpec.getMode(i18) != 0) {
            if (android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE && (i19 = i47 + i39) < size2) {
                paddingTop = i19 + getPaddingTop();
                paddingBottom = getPaddingBottom();
            }
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), size2);
        }
        paddingTop = i47 + i39 + getPaddingTop();
        paddingBottom = getPaddingBottom();
        size2 = paddingTop + paddingBottom;
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), size2);
    }

    /* renamed from: setMaxLineLimit */
    public void m78886xd6475ca5(int i17) {
        this.f278791h = i17;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new android.view.ViewGroup.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public C21475x81dbaa18(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278787d = 0;
        this.f278788e = 0;
        this.f278789f = new java.util.LinkedList();
        this.f278790g = 0;
        this.f278791h = 0;
        a(context, attributeSet);
    }
}
