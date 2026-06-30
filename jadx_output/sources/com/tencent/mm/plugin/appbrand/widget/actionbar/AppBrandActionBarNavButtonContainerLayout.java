package com.tencent.mm.plugin.appbrand.widget.actionbar;

/* loaded from: classes5.dex */
public final class AppBrandActionBarNavButtonContainerLayout extends android.widget.LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f91025e = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f91026d;

    public AppBrandActionBarNavButtonContainerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.Runnable runnable = this.f91026d;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        java.lang.Runnable runnable = this.f91026d;
        if (runnable == null) {
            this.f91026d = new al1.m$$a(this);
        } else {
            removeCallbacks(runnable);
        }
        post(this.f91026d);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        view.setOnTouchListener(new al1.m$$b());
        java.lang.Runnable runnable = this.f91026d;
        if (runnable == null) {
            this.f91026d = new al1.m$$a(this);
        } else {
            removeCallbacks(runnable);
        }
        post(this.f91026d);
    }

    public AppBrandActionBarNavButtonContainerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams(-1, -1, 8388627);
    }

    /* loaded from: classes5.dex */
    public static final class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            if (((android.widget.LinearLayout.LayoutParams) this).gravity == -1) {
                ((android.widget.LinearLayout.LayoutParams) this).gravity = 8388627;
            }
        }

        public LayoutParams(int i17, int i18, int i19) {
            super(i17, i18, i19);
            if (((android.widget.LinearLayout.LayoutParams) this).gravity == -1) {
                ((android.widget.LinearLayout.LayoutParams) this).gravity = 8388627;
            }
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            if (((android.widget.LinearLayout.LayoutParams) this).gravity == -1) {
                ((android.widget.LinearLayout.LayoutParams) this).gravity = 8388627;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout.LayoutParams(super.generateLayoutParams(layoutParams));
    }
}
