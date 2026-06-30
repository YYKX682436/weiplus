package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout */
/* loaded from: classes5.dex */
public final class C12759xcecc55cd extends android.widget.LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f172558e = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f172559d;

    public C12759xcecc55cd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.Runnable runnable = this.f172559d;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        java.lang.Runnable runnable = this.f172559d;
        if (runnable == null) {
            this.f172559d = new al1.RunnableC0022x321854(this);
        } else {
            removeCallbacks(runnable);
        }
        post(this.f172559d);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        view.setOnTouchListener(new al1.ViewOnTouchListenerC0023x321855());
        java.lang.Runnable runnable = this.f172559d;
        if (runnable == null) {
            this.f172559d = new al1.RunnableC0022x321854(this);
        } else {
            removeCallbacks(runnable);
        }
        post(this.f172559d);
    }

    public C12759xcecc55cd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd.LayoutParams(-1, -1, 8388627);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandActionBarNavButtonContainerLayout$LayoutParams */
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
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd.LayoutParams(super.generateLayoutParams(layoutParams));
    }
}
