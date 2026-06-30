package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes3.dex */
public final class AppBrandNearbyShowcaseView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f90975d;

    /* renamed from: e, reason: collision with root package name */
    public int f90976e;

    public AppBrandNearbyShowcaseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90975d = i65.a.b(getContext(), 25);
        this.f90976e = i65.a.b(getContext(), 19);
    }

    public final void a() {
        if (getChildCount() > 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = getChildAt(childCount);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                int i17 = this.f90975d;
                layoutParams2.height = i17;
                layoutParams.width = i17;
                ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity |= 5;
                ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).rightMargin = this.f90976e * childCount;
            }
            requestLayout();
            invalidate();
        }
    }

    public int getExpandDuration() {
        if (getChildCount() <= 1) {
            return 0;
        }
        return ((getChildCount() - 2) * 50) + 200;
    }

    public void setIconGap(int i17) {
        if (i17 < 0 || this.f90976e == i17) {
            return;
        }
        this.f90976e = i17;
        a();
    }

    public void setIconLayerCount(int i17) {
        if (i17 < 0 || i17 == getChildCount()) {
            return;
        }
        if (i17 > getChildCount()) {
            int childCount = i17 - getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View imageView = new android.widget.ImageView(getContext());
                int i19 = this.f90975d;
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i19, i19);
                layoutParams.gravity = 16;
                addViewInLayout(imageView, 0, layoutParams, true);
            }
        } else if (i17 < getChildCount()) {
            removeViewsInLayout(0, getChildCount() - i17);
        }
        a();
    }

    public void setIconSize(int i17) {
        if (i17 <= 0 || i17 == this.f90975d) {
            return;
        }
        this.f90975d = i17;
        a();
    }

    public AppBrandNearbyShowcaseView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f90975d = i65.a.b(getContext(), 25);
        this.f90976e = i65.a.b(getContext(), 19);
    }
}
