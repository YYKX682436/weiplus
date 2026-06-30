package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* renamed from: com.tencent.mm.plugin.finder.view.FinderTagFlowLayout */
/* loaded from: classes3.dex */
public class C15351x41e69e8c extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f213021d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f213022e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f213023f;

    /* renamed from: g, reason: collision with root package name */
    public int f213024g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f213025h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f213026i;

    public C15351x41e69e8c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f213021d = new java.util.ArrayList();
        this.f213022e = new java.util.ArrayList();
        this.f213023f = new java.util.ArrayList();
        this.f213025h = false;
        this.f213026i = new java.util.ArrayList();
        this.f213024g = -1;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15351x41e69e8c c15351x41e69e8c = this;
        java.util.List list = c15351x41e69e8c.f213021d;
        ((java.util.ArrayList) list).clear();
        java.util.List list2 = c15351x41e69e8c.f213022e;
        ((java.util.ArrayList) list2).clear();
        java.util.List list3 = c15351x41e69e8c.f213023f;
        ((java.util.ArrayList) list3).clear();
        c15351x41e69e8c.f213026i.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            i28 = 8;
            if (i29 >= childCount) {
                break;
            }
            android.view.View childAt = c15351x41e69e8c.getChildAt(i29);
            if (childAt.getVisibility() != 8) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i38 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (width - getPaddingLeft()) - getPaddingRight()) {
                    ((java.util.ArrayList) list2).add(java.lang.Integer.valueOf(i37));
                    ((java.util.ArrayList) list).add(c15351x41e69e8c.f213026i);
                    ((java.util.ArrayList) list3).add(java.lang.Integer.valueOf(i38));
                    i37 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                    c15351x41e69e8c.f213026i = new java.util.ArrayList();
                    i38 = 0;
                }
                i38 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i37 = java.lang.Math.max(i37, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                c15351x41e69e8c.f213026i.add(childAt);
            }
            i29++;
        }
        ((java.util.ArrayList) list2).add(java.lang.Integer.valueOf(i37));
        ((java.util.ArrayList) list3).add(java.lang.Integer.valueOf(i38));
        ((java.util.ArrayList) list).add(c15351x41e69e8c.f213026i);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = ((java.util.ArrayList) list).size();
        int i39 = 0;
        while (i39 < size) {
            c15351x41e69e8c.f213026i = (java.util.List) ((java.util.ArrayList) list).get(i39);
            int intValue = ((java.lang.Integer) ((java.util.ArrayList) list2).get(i39)).intValue();
            int intValue2 = ((java.lang.Integer) ((java.util.ArrayList) list3).get(i39)).intValue();
            int i47 = c15351x41e69e8c.f213024g;
            if (i47 == -1) {
                paddingLeft = getPaddingLeft();
            } else if (i47 == 0) {
                paddingLeft = ((width - intValue2) / 2) + getPaddingLeft();
            } else if (i47 == 1) {
                paddingLeft = (width - (intValue2 + getPaddingLeft())) - getPaddingRight();
                java.util.Collections.reverse(c15351x41e69e8c.f213026i);
            }
            int i48 = 0;
            while (i48 < c15351x41e69e8c.f213026i.size()) {
                android.view.View view = (android.view.View) c15351x41e69e8c.f213026i.get(i48);
                if (view.getVisibility() != i28) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i49 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i57 = marginLayoutParams2.topMargin;
                    int i58 = paddingTop + i57;
                    if (c15351x41e69e8c.f213025h && i57 + view.getMeasuredHeight() < intValue) {
                        i58 = (((intValue - marginLayoutParams2.topMargin) - view.getMeasuredHeight()) / 2) + paddingTop + marginLayoutParams2.topMargin;
                    }
                    int i59 = i58;
                    view.layout(i49, i59, view.getMeasuredWidth() + i49, i59 + view.getMeasuredHeight());
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                i48++;
                i28 = 8;
                c15351x41e69e8c = this;
            }
            paddingTop += intValue;
            i39++;
            i28 = 8;
            c15351x41e69e8c = this;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int childCount = getChildCount();
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        while (i27 < childCount) {
            android.view.View childAt = getChildAt(i27);
            if (childAt.getVisibility() == 8) {
                if (i27 == childCount - 1) {
                    i28 = java.lang.Math.max(i29, i28);
                    i38 += i37;
                }
                i19 = size2;
            } else {
                measureChild(childAt, i17, i18);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                i19 = size2;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i39 = i29 + measuredWidth;
                if (i39 > (size - getPaddingLeft()) - getPaddingRight()) {
                    i28 = java.lang.Math.max(i28, i29);
                    i38 += i37;
                } else {
                    measuredHeight = java.lang.Math.max(i37, measuredHeight);
                    measuredWidth = i39;
                }
                if (i27 == childCount - 1) {
                    i28 = java.lang.Math.max(measuredWidth, i28);
                    i38 += measuredHeight;
                }
                i37 = measuredHeight;
                i29 = measuredWidth;
            }
            i27++;
            size2 = i19;
        }
        int i47 = size2;
        if (mode != 1073741824) {
            size = getPaddingRight() + i28 + getPaddingLeft();
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? i47 : i38 + getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: setChildAlignCenterVertical */
    public void m62395xfc622916(boolean z17) {
        this.f213025h = z17;
    }

    /* renamed from: setGravity */
    public void m62396xc1f6fb8c(int i17) {
        this.f213024g = i17;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new android.view.ViewGroup.MarginLayoutParams(layoutParams);
    }

    public C15351x41e69e8c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
