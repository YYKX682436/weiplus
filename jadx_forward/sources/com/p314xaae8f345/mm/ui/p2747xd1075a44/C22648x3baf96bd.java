package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.StoryAvatarDotsView */
/* loaded from: classes3.dex */
public final class C22648x3baf96bd extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f292956d;

    /* renamed from: e, reason: collision with root package name */
    public int f292957e;

    public C22648x3baf96bd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292956d = i65.a.b(getContext(), 25);
        this.f292957e = i65.a.b(getContext(), 19);
    }

    public android.widget.ImageView a(int i17) {
        return (android.widget.ImageView) getChildAt((getChildCount() - 1) - i17);
    }

    public final void b() {
        if (getChildCount() > 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = getChildAt(childCount);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                int i17 = this.f292956d;
                layoutParams2.height = i17;
                layoutParams.width = i17;
                ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).gravity |= 5;
                ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).rightMargin = this.f292957e * childCount;
            }
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: getExpandDuration */
    public int m81439x104c2344() {
        if (getChildCount() <= 1) {
            return 0;
        }
        return ((getChildCount() - 2) * 50) + 200;
    }

    /* renamed from: setIconGap */
    public void m81440x12ebe4db(int i17) {
        if (i17 < 0 || this.f292957e == i17) {
            return;
        }
        this.f292957e = i17;
        b();
    }

    /* renamed from: setIconLayerCount */
    public void m81441x59e90099(int i17) {
        if (i17 < 0 || i17 == getChildCount()) {
            return;
        }
        if (i17 > getChildCount()) {
            int childCount = i17 - getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View imageView = new android.widget.ImageView(getContext());
                int i19 = this.f292956d;
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i19, i19);
                layoutParams.gravity = 16;
                addViewInLayout(imageView, 0, layoutParams, true);
            }
        } else if (i17 < getChildCount()) {
            removeViewsInLayout(0, getChildCount() - i17);
        }
        b();
    }

    /* renamed from: setIconSize */
    public void m81442x4a964a9c(int i17) {
        if (i17 <= 0 || i17 == this.f292956d) {
            return;
        }
        this.f292956d = i17;
        b();
    }

    public C22648x3baf96bd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292956d = i65.a.b(getContext(), 25);
        this.f292957e = i65.a.b(getContext(), 19);
    }
}
