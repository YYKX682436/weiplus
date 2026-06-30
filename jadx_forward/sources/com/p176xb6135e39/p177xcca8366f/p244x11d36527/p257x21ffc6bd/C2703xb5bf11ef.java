package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd;

/* renamed from: com.google.android.material.internal.BaselineLayout */
/* loaded from: classes13.dex */
public class C2703xb5bf11ef extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f126041d;

    public C2703xb5bf11ef(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f126041d = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f126041d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i19 - i17) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i29 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f126041d == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f126041d + paddingTop) - childAt.getBaseline();
                childAt.layout(i29, baseline, measuredWidth + i29, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int childCount = getChildCount();
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        int i37 = -1;
        for (int i38 = 0; i38 < childCount; i38++) {
            android.view.View childAt = getChildAt(i38);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i17, i18);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i29 = java.lang.Math.max(i29, baseline);
                    i37 = java.lang.Math.max(i37, childAt.getMeasuredHeight() - baseline);
                }
                i27 = java.lang.Math.max(i27, childAt.getMeasuredWidth());
                i19 = java.lang.Math.max(i19, childAt.getMeasuredHeight());
                i28 = android.view.View.combineMeasuredStates(i28, childAt.getMeasuredState());
            }
        }
        if (i29 != -1) {
            i19 = java.lang.Math.max(i19, java.lang.Math.max(i37, getPaddingBottom()) + i29);
            this.f126041d = i29;
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(i27, getSuggestedMinimumWidth()), i17, i28), android.view.View.resolveSizeAndState(java.lang.Math.max(i19, getSuggestedMinimumHeight()), i18, i28 << 16));
    }

    public C2703xb5bf11ef(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f126041d = -1;
    }
}
