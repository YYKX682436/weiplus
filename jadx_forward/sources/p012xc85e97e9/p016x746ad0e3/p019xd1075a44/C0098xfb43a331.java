package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.LinearLayoutCompat */
/* loaded from: classes13.dex */
public class C0098xfb43a331 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f90933d;

    /* renamed from: e, reason: collision with root package name */
    public int f90934e;

    /* renamed from: f, reason: collision with root package name */
    public int f90935f;

    /* renamed from: g, reason: collision with root package name */
    public int f90936g;

    /* renamed from: h, reason: collision with root package name */
    public int f90937h;

    /* renamed from: i, reason: collision with root package name */
    public int f90938i;

    /* renamed from: m, reason: collision with root package name */
    public float f90939m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f90940n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f90941o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f90942p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90943q;

    /* renamed from: r, reason: collision with root package name */
    public int f90944r;

    /* renamed from: s, reason: collision with root package name */
    public int f90945s;

    /* renamed from: t, reason: collision with root package name */
    public int f90946t;

    /* renamed from: u, reason: collision with root package name */
    public int f90947u;

    public C0098xfb43a331(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams;
    }

    public void e(android.graphics.Canvas canvas, int i17) {
        this.f90943q.setBounds(getPaddingLeft() + this.f90947u, i17, (getWidth() - getPaddingRight()) - this.f90947u, this.f90945s + i17);
        this.f90943q.draw(canvas);
    }

    public void f(android.graphics.Canvas canvas, int i17) {
        this.f90943q.setBounds(i17, getPaddingTop() + this.f90947u, this.f90944r + i17, (getHeight() - getPaddingBottom()) - this.f90947u);
        this.f90943q.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams generateDefaultLayoutParams() {
        int i17 = this.f90936g;
        if (i17 == 0) {
            return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(-2, -2);
        }
        if (i17 == 1) {
            return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i17;
        if (this.f90934e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i18 = this.f90934e;
        if (childCount <= i18) {
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        android.view.View childAt = getChildAt(i18);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f90934e == 0) {
                return -1;
            }
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i19 = this.f90935f;
        if (this.f90936g == 1 && (i17 = this.f90937h & 112) != 48) {
            if (i17 == 16) {
                i19 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f90938i) / 2;
            } else if (i17 == 80) {
                i19 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f90938i;
            }
        }
        return i19 + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    /* renamed from: getBaselineAlignedChildIndex */
    public int m2711x634ee41f() {
        return this.f90934e;
    }

    /* renamed from: getDividerDrawable */
    public android.graphics.drawable.Drawable m2712x1db0a0a1() {
        return this.f90943q;
    }

    /* renamed from: getDividerPadding */
    public int m2713xfbc68fae() {
        return this.f90947u;
    }

    /* renamed from: getDividerWidth */
    public int m2714x185ec4a3() {
        return this.f90944r;
    }

    /* renamed from: getGravity */
    public int m2715x4e85ae18() {
        return this.f90937h;
    }

    /* renamed from: getOrientation */
    public int m2716x84093c9a() {
        return this.f90936g;
    }

    /* renamed from: getShowDividers */
    public int m2717x43e0d50d() {
        return this.f90946t;
    }

    /* renamed from: getVirtualChildCount */
    int m2718xe541ae08() {
        return getChildCount();
    }

    /* renamed from: getWeightSum */
    public float m2719x4f34c1fd() {
        return this.f90939m;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(layoutParams);
    }

    public boolean j(int i17) {
        if (i17 == 0) {
            return (this.f90946t & 1) != 0;
        }
        if (i17 == getChildCount()) {
            return (this.f90946t & 4) != 0;
        }
        if ((this.f90946t & 2) == 0) {
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
        if (this.f90943q == null) {
            return;
        }
        int i18 = 0;
        if (this.f90936g == 1) {
            int m2718xe541ae08 = m2718xe541ae08();
            while (i18 < m2718xe541ae08) {
                android.view.View childAt = getChildAt(i18);
                if (childAt != null && childAt.getVisibility() != 8 && j(i18)) {
                    e(canvas, (childAt.getTop() - ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams) childAt.getLayoutParams())).topMargin) - this.f90945s);
                }
                i18++;
            }
            if (j(m2718xe541ae08)) {
                android.view.View childAt2 = getChildAt(m2718xe541ae08 - 1);
                e(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f90945s : childAt2.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int m2718xe541ae082 = m2718xe541ae08();
        boolean a17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.a(this);
        while (i18 < m2718xe541ae082) {
            android.view.View childAt3 = getChildAt(i18);
            if (childAt3 != null && childAt3.getVisibility() != 8 && j(i18)) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams) childAt3.getLayoutParams();
                f(canvas, a17 ? childAt3.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f90944r);
            }
            i18++;
        }
        if (j(m2718xe541ae082)) {
            android.view.View childAt4 = getChildAt(m2718xe541ae082 - 1);
            if (childAt4 != null) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams layoutParams2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams) childAt4.getLayoutParams();
                if (a17) {
                    left = childAt4.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                    i17 = this.f90944r;
                    right = left - i17;
                } else {
                    right = childAt4.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                }
            } else if (a17) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i17 = this.f90944r;
                right = left - i17;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.class.getName());
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.onLayout(boolean, int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.onMeasure(int, int):void");
    }

    /* renamed from: setBaselineAligned */
    public void m2720x24c46b9d(boolean z17) {
        this.f90933d = z17;
    }

    /* renamed from: setBaselineAlignedChildIndex */
    public void m2721xad1b3c93(int i17) {
        if (i17 >= 0 && i17 < getChildCount()) {
            this.f90934e = i17;
            return;
        }
        throw new java.lang.IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    /* renamed from: setDividerDrawable */
    public void m2722x54873a15(android.graphics.drawable.Drawable drawable) {
        if (drawable == this.f90943q) {
            return;
        }
        this.f90943q = drawable;
        if (drawable != null) {
            this.f90944r = drawable.getIntrinsicWidth();
            this.f90945s = drawable.getIntrinsicHeight();
        } else {
            this.f90944r = 0;
            this.f90945s = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    /* renamed from: setDividerPadding */
    public void m2723xc3bcf7ba(int i17) {
        this.f90947u = i17;
    }

    /* renamed from: setGravity */
    public void m2724xc1f6fb8c(int i17) {
        if (this.f90937h != i17) {
            if ((8388615 & i17) == 0) {
                i17 |= 8388611;
            }
            if ((i17 & 112) == 0) {
                i17 |= 48;
            }
            this.f90937h = i17;
            requestLayout();
        }
    }

    /* renamed from: setHorizontalGravity */
    public void m2725x8a9ae148(int i17) {
        int i18 = i17 & 8388615;
        int i19 = this.f90937h;
        if ((8388615 & i19) != i18) {
            this.f90937h = i18 | ((-8388616) & i19);
            requestLayout();
        }
    }

    /* renamed from: setMeasureWithLargestChildEnabled */
    public void m2726x9c1b269f(boolean z17) {
        this.f90940n = z17;
    }

    /* renamed from: setOrientation */
    public void m2727x1a6eb00e(int i17) {
        if (this.f90936g != i17) {
            this.f90936g = i17;
            requestLayout();
        }
    }

    /* renamed from: setShowDividers */
    public void m2728x7a29d019(int i17) {
        if (i17 != this.f90946t) {
            requestLayout();
        }
        this.f90946t = i17;
    }

    /* renamed from: setVerticalGravity */
    public void m2729x54c5dd36(int i17) {
        int i18 = i17 & 112;
        int i19 = this.f90937h;
        if ((i19 & 112) != i18) {
            this.f90937h = i18 | (i19 & (-113));
            requestLayout();
        }
    }

    /* renamed from: setWeightSum */
    public void m2730xab888271(float f17) {
        this.f90939m = java.lang.Math.max(0.0f, f17);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C0098xfb43a331(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.graphics.drawable.Drawable drawable;
        int resourceId;
        this.f90933d = true;
        this.f90934e = -1;
        this.f90935f = 0;
        this.f90937h = 8388659;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f377719n, i17, 0);
        int i18 = obtainStyledAttributes.getInt(1, -1);
        if (i18 >= 0) {
            m2727x1a6eb00e(i18);
        }
        int i19 = obtainStyledAttributes.getInt(0, -1);
        if (i19 >= 0) {
            m2724xc1f6fb8c(i19);
        }
        boolean z17 = obtainStyledAttributes.getBoolean(2, true);
        if (!z17) {
            m2720x24c46b9d(z17);
        }
        this.f90939m = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f90934e = obtainStyledAttributes.getInt(3, -1);
        this.f90940n = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = k.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        m2722x54873a15(drawable);
        this.f90946t = obtainStyledAttributes.getInt(8, 0);
        this.f90947u = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: androidx.appcompat.widget.LinearLayoutCompat$LayoutParams */
    /* loaded from: classes13.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public float f90948a;

        /* renamed from: b, reason: collision with root package name */
        public int f90949b;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f90949b = -1;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f377720o);
            this.f90948a = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f90949b = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f90949b = -1;
            this.f90948a = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f90949b = -1;
        }
    }
}
