package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd;

/* renamed from: com.google.android.material.internal.FlowLayout */
/* loaded from: classes13.dex */
public class C2705x81dbaa18 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f126044d;

    /* renamed from: e, reason: collision with root package name */
    public int f126045e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f126046f;

    public C2705x81dbaa18(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getItemSpacing */
    public int m20300x42143c7a() {
        return this.f126045e;
    }

    /* renamed from: getLineSpacing */
    public int m20301x78f8f879() {
        return this.f126044d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        if (getChildCount() == 0) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean z18 = n3.v0.d(this) == 1;
        int paddingRight = z18 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z18 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i37 = (i19 - i17) - paddingLeft;
        int i38 = paddingRight;
        int i39 = paddingTop;
        for (int i47 = 0; i47 < getChildCount(); i47++) {
            android.view.View childAt = getChildAt(i47);
            if (childAt.getVisibility() != 8) {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    i29 = n3.u.c(marginLayoutParams);
                    i28 = n3.u.b(marginLayoutParams);
                } else {
                    i28 = 0;
                    i29 = 0;
                }
                int measuredWidth = i38 + i29 + childAt.getMeasuredWidth();
                if (!this.f126046f && measuredWidth > i37) {
                    i39 = this.f126044d + paddingTop;
                    i38 = paddingRight;
                }
                int i48 = i38 + i29;
                int measuredWidth2 = childAt.getMeasuredWidth() + i48;
                int measuredHeight = childAt.getMeasuredHeight() + i39;
                if (z18) {
                    childAt.layout(i37 - measuredWidth2, i39, (i37 - i38) - i29, measuredHeight);
                } else {
                    childAt.layout(i48, i39, measuredWidth2, measuredHeight);
                }
                i38 += i29 + i28 + childAt.getMeasuredWidth() + this.f126045e;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27;
        int i28;
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int i29 = Integer.MIN_VALUE;
        int i37 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i37 - getPaddingRight();
        int i38 = paddingTop;
        int i39 = 0;
        int i47 = 0;
        while (i39 < getChildCount()) {
            android.view.View childAt = getChildAt(i39);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i17, i18);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    i28 = marginLayoutParams.leftMargin + 0;
                    i27 = marginLayoutParams.rightMargin + 0;
                } else {
                    i27 = 0;
                    i28 = 0;
                }
                if (paddingLeft + i28 + childAt.getMeasuredWidth() > paddingRight && !this.f126046f) {
                    paddingLeft = getPaddingLeft();
                    i38 = this.f126044d + paddingTop;
                }
                int measuredWidth = paddingLeft + i28 + childAt.getMeasuredWidth();
                paddingTop = childAt.getMeasuredHeight() + i38;
                if (measuredWidth > i47) {
                    i47 = measuredWidth;
                }
                paddingLeft += i28 + i27 + childAt.getMeasuredWidth() + this.f126045e;
            }
            i39++;
            i29 = Integer.MIN_VALUE;
        }
        int i48 = i29;
        if (mode != i48) {
            i19 = 1073741824;
            if (mode != 1073741824) {
                size = i47;
            }
        } else {
            i19 = 1073741824;
            size = java.lang.Math.min(i47, size);
        }
        if (mode2 == i48) {
            size2 = java.lang.Math.min(paddingTop, size2);
        } else if (mode2 != i19) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: setItemSpacing */
    public void m20302xd879afee(int i17) {
        this.f126045e = i17;
    }

    /* renamed from: setLineSpacing */
    public void m20303xf5e6bed(int i17) {
        this.f126044d = i17;
    }

    /* renamed from: setSingleLine */
    public void m20304x52d64a5e(boolean z17) {
        this.f126046f = z17;
    }

    public C2705x81dbaa18(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f126046f = false;
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, v9.a.f515655l, 0, 0);
        this.f126044d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f126045e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
