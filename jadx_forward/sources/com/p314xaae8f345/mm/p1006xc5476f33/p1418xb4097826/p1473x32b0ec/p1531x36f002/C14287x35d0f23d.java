package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/util/AutoScaledContainerView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.util.AutoScaledContainerView */
/* loaded from: classes3.dex */
public final class C14287x35d0f23d extends android.view.ViewGroup {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14287x35d0f23d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        return new android.view.ViewGroup.MarginLayoutParams(p17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            if (childAt.getVisibility() == 8) {
                return;
            }
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int width = (getWidth() - measuredWidth) / 2;
            int height = (getHeight() - measuredHeight) / 2;
            childAt.layout(width, height, width + measuredWidth, height + measuredHeight);
            float min = java.lang.Math.min(getWidth() / measuredWidth, getHeight() / measuredHeight);
            childAt.setScaleX(min);
            childAt.setScaleY(min);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (getChildCount() != 0) {
            android.view.View childAt = getChildAt(0);
            int i19 = childAt.getLayoutParams().width;
            int makeMeasureSpec = i19 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getMode(i17) == 0 ? 0 : android.view.View.MeasureSpec.getSize(i17), 0);
            int i27 = childAt.getLayoutParams().height;
            childAt.measure(makeMeasureSpec, i27 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i27, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getMode(i18) == 0 ? 0 : android.view.View.MeasureSpec.getSize(i18), 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14287x35d0f23d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }
}
