package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class LinearLayoutCompat extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f9400d;

    /* renamed from: e, reason: collision with root package name */
    public int f9401e;

    /* renamed from: f, reason: collision with root package name */
    public int f9402f;

    /* renamed from: g, reason: collision with root package name */
    public int f9403g;

    /* renamed from: h, reason: collision with root package name */
    public int f9404h;

    /* renamed from: i, reason: collision with root package name */
    public int f9405i;

    /* renamed from: m, reason: collision with root package name */
    public float f9406m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9407n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f9408o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f9409p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9410q;

    /* renamed from: r, reason: collision with root package name */
    public int f9411r;

    /* renamed from: s, reason: collision with root package name */
    public int f9412s;

    /* renamed from: t, reason: collision with root package name */
    public int f9413t;

    /* renamed from: u, reason: collision with root package name */
    public int f9414u;

    public LinearLayoutCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
    }

    public void e(android.graphics.Canvas canvas, int i17) {
        this.f9410q.setBounds(getPaddingLeft() + this.f9414u, i17, (getWidth() - getPaddingRight()) - this.f9414u, this.f9412s + i17);
        this.f9410q.draw(canvas);
    }

    public void f(android.graphics.Canvas canvas, int i17) {
        this.f9410q.setBounds(i17, getPaddingTop() + this.f9414u, this.f9411r + i17, (getHeight() - getPaddingBottom()) - this.f9414u);
        this.f9410q.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        int i17 = this.f9403g;
        if (i17 == 0) {
            return new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(-2, -2);
        }
        if (i17 == 1) {
            return new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i17;
        if (this.f9401e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i18 = this.f9401e;
        if (childCount <= i18) {
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        android.view.View childAt = getChildAt(i18);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f9401e == 0) {
                return -1;
            }
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i19 = this.f9402f;
        if (this.f9403g == 1 && (i17 = this.f9404h & 112) != 48) {
            if (i17 == 16) {
                i19 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f9405i) / 2;
            } else if (i17 == 80) {
                i19 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f9405i;
            }
        }
        return i19 + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f9401e;
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
        return this.f9410q;
    }

    public int getDividerPadding() {
        return this.f9414u;
    }

    public int getDividerWidth() {
        return this.f9411r;
    }

    public int getGravity() {
        return this.f9404h;
    }

    public int getOrientation() {
        return this.f9403g;
    }

    public int getShowDividers() {
        return this.f9413t;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f9406m;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(layoutParams);
    }

    public boolean j(int i17) {
        if (i17 == 0) {
            return (this.f9413t & 1) != 0;
        }
        if (i17 == getChildCount()) {
            return (this.f9413t & 4) != 0;
        }
        if ((this.f9413t & 2) == 0) {
            return false;
        }
        for (int i18 = i17 - 1; i18 >= 0; i18--) {
            if (getChildAt(i18).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int right;
        int left;
        int i17;
        if (this.f9410q == null) {
            return;
        }
        int i18 = 0;
        if (this.f9403g == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i18 < virtualChildCount) {
                android.view.View childAt = getChildAt(i18);
                if (childAt != null && childAt.getVisibility() != 8 && j(i18)) {
                    e(canvas, (childAt.getTop() - ((android.view.ViewGroup.MarginLayoutParams) ((androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) childAt.getLayoutParams())).topMargin) - this.f9412s);
                }
                i18++;
            }
            if (j(virtualChildCount)) {
                android.view.View childAt2 = getChildAt(virtualChildCount - 1);
                e(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f9412s : childAt2.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a17 = androidx.appcompat.widget.h3.a(this);
        while (i18 < virtualChildCount2) {
            android.view.View childAt3 = getChildAt(i18);
            if (childAt3 != null && childAt3.getVisibility() != 8 && j(i18)) {
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) childAt3.getLayoutParams();
                f(canvas, a17 ? childAt3.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f9411r);
            }
            i18++;
        }
        if (j(virtualChildCount2)) {
            android.view.View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) childAt4.getLayoutParams();
                if (a17) {
                    left = childAt4.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                    i17 = this.f9411r;
                    right = left - i17;
                } else {
                    right = childAt4.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                }
            } else if (a17) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i17 = this.f9411r;
                right = left - i17;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(androidx.appcompat.widget.LinearLayoutCompat.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(androidx.appcompat.widget.LinearLayoutCompat.class.getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06e5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z17) {
        this.f9400d = z17;
    }

    public void setBaselineAlignedChildIndex(int i17) {
        if (i17 >= 0 && i17 < getChildCount()) {
            this.f9401e = i17;
            return;
        }
        throw new java.lang.IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f9410q) {
            return;
        }
        this.f9410q = drawable;
        if (drawable != null) {
            this.f9411r = drawable.getIntrinsicWidth();
            this.f9412s = drawable.getIntrinsicHeight();
        } else {
            this.f9411r = 0;
            this.f9412s = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i17) {
        this.f9414u = i17;
    }

    public void setGravity(int i17) {
        if (this.f9404h != i17) {
            if ((8388615 & i17) == 0) {
                i17 |= 8388611;
            }
            if ((i17 & 112) == 0) {
                i17 |= 48;
            }
            this.f9404h = i17;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i17) {
        int i18 = i17 & 8388615;
        int i19 = this.f9404h;
        if ((8388615 & i19) != i18) {
            this.f9404h = i18 | ((-8388616) & i19);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z17) {
        this.f9407n = z17;
    }

    public void setOrientation(int i17) {
        if (this.f9403g != i17) {
            this.f9403g = i17;
            requestLayout();
        }
    }

    public void setShowDividers(int i17) {
        if (i17 != this.f9413t) {
            requestLayout();
        }
        this.f9413t = i17;
    }

    public void setVerticalGravity(int i17) {
        int i18 = i17 & 112;
        int i19 = this.f9404h;
        if ((i19 & 112) != i18) {
            this.f9404h = i18 | (i19 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f17) {
        this.f9406m = java.lang.Math.max(0.0f, f17);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.drawable.Drawable drawable;
        int resourceId;
        this.f9400d = true;
        this.f9401e = -1;
        this.f9402f = 0;
        this.f9404h = 8388659;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296186n, i17, 0);
        int i18 = obtainStyledAttributes.getInt(1, -1);
        if (i18 >= 0) {
            setOrientation(i18);
        }
        int i19 = obtainStyledAttributes.getInt(0, -1);
        if (i19 >= 0) {
            setGravity(i19);
        }
        boolean z17 = obtainStyledAttributes.getBoolean(2, true);
        if (!z17) {
            setBaselineAligned(z17);
        }
        this.f9406m = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f9401e = obtainStyledAttributes.getInt(3, -1);
        this.f9407n = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = k.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.f9413t = obtainStyledAttributes.getInt(8, 0);
        this.f9414u = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    /* loaded from: classes13.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public float f9415a;

        /* renamed from: b, reason: collision with root package name */
        public int f9416b;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9416b = -1;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296187o);
            this.f9415a = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f9416b = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f9416b = -1;
            this.f9415a = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9416b = -1;
        }
    }
}
