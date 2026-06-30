package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView */
/* loaded from: classes3.dex */
public final class C12752x751850b7 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f172508d;

    /* renamed from: e, reason: collision with root package name */
    public int f172509e;

    public C12752x751850b7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172508d = i65.a.b(getContext(), 25);
        this.f172509e = i65.a.b(getContext(), 19);
    }

    public final void a() {
        if (getChildCount() > 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = getChildAt(childCount);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                int i17 = this.f172508d;
                layoutParams2.height = i17;
                layoutParams.width = i17;
                ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity |= 5;
                ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).rightMargin = this.f172509e * childCount;
            }
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: getExpandDuration */
    public int m53310x104c2344() {
        if (getChildCount() <= 1) {
            return 0;
        }
        return ((getChildCount() - 2) * 50) + 200;
    }

    /* renamed from: setIconGap */
    public void m53311x12ebe4db(int i17) {
        if (i17 < 0 || this.f172509e == i17) {
            return;
        }
        this.f172509e = i17;
        a();
    }

    /* renamed from: setIconLayerCount */
    public void m53312x59e90099(int i17) {
        if (i17 < 0 || i17 == getChildCount()) {
            return;
        }
        if (i17 > getChildCount()) {
            int childCount = i17 - getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View imageView = new android.widget.ImageView(getContext());
                int i19 = this.f172508d;
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i19, i19);
                layoutParams.gravity = 16;
                addViewInLayout(imageView, 0, layoutParams, true);
            }
        } else if (i17 < getChildCount()) {
            removeViewsInLayout(0, getChildCount() - i17);
        }
        a();
    }

    /* renamed from: setIconSize */
    public void m53313x4a964a9c(int i17) {
        if (i17 <= 0 || i17 == this.f172508d) {
            return;
        }
        this.f172508d = i17;
        a();
    }

    public C12752x751850b7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172508d = i65.a.b(getContext(), 25);
        this.f172509e = i65.a.b(getContext(), 19);
    }
}
