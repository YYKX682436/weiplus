package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.widget.q {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f91059n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f91060o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Float f91061p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f91062q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams f91063r;

    public c(android.content.Context context) {
        super(context);
        this.f91063r = new com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams(-1, -1);
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandCenterInsideRuntimeFrameLayout", "AppBrandCenterInsideRuntimeFrameLayout: create");
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        super.addView(view);
        b(view);
    }

    public final void b(android.view.View view) {
        if (this.f91061p != null && java.lang.Math.abs(view.getScaleX() - this.f91061p.floatValue()) >= 0.01f) {
            view.setScaleX(this.f91061p.floatValue());
            view.setScaleY(this.f91061p.floatValue());
        }
    }

    public android.view.ViewGroup.LayoutParams getWxaLayoutParams() {
        return this.f91063r;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
        java.lang.Integer num;
        if (this.f91060o != null && (num = this.f91059n) != null) {
            if (num.intValue() > 0) {
                i17 = android.view.View.MeasureSpec.makeMeasureSpec(this.f91059n.intValue(), 1073741824);
            }
            if (this.f91060o.intValue() > 0) {
                i19 = android.view.View.MeasureSpec.makeMeasureSpec(this.f91060o.intValue(), 1073741824);
            }
        }
        super.measureChildWithMargins(view, i17, i18, i19, i27);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.q, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        int i47;
        java.lang.Integer num = this.f91059n;
        if (num == null && this.f91060o == null) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        if (num == null || this.f91060o == null) {
            i28 = 0;
            i29 = 0;
        } else {
            i28 = num.intValue() > 0 ? ((i19 - i17) / 2) - (this.f91059n.intValue() / 2) : 0;
            i29 = this.f91060o.intValue() > 0 ? ((i27 - i18) / 2) - (this.f91060o.intValue() / 2) : 0;
        }
        if (i29 == 0 && i28 == 0) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        java.lang.Integer num2 = this.f91062q;
        int intValue = (num2 == null || num2.intValue() == -1) ? 17 : this.f91062q.intValue();
        int childCount = getChildCount();
        for (int i48 = 0; i48 < childCount; i48++) {
            android.view.View childAt = getChildAt(i48);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (intValue == 17) {
                    int i49 = i17 + i28;
                    int i57 = i18 + i29;
                    i37 = measuredWidth + i49;
                    i38 = measuredHeight + i57;
                    i39 = i57;
                    i47 = i49;
                } else if (intValue != 80) {
                    i37 = i17 + measuredWidth;
                    com.tencent.mars.xlog.Log.w("Luggage.WXA.AppBrandCenterInsideRuntimeFrameLayout", "onLayout: unhandled gravity[%d], good luck~", java.lang.Integer.valueOf(intValue));
                    i47 = i17;
                    i38 = i18 + measuredHeight;
                    i39 = i18;
                } else {
                    i37 = i17 + measuredWidth;
                    i39 = i27 - measuredHeight;
                    i47 = i17;
                    i38 = i27;
                }
                childAt.layout(i47, i39, i37, i38);
            }
        }
    }

    public void setWxaLayoutParams(com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams wxaWindowLayoutParams) {
        this.f91063r = wxaWindowLayoutParams;
        this.f91059n = java.lang.Integer.valueOf(((android.widget.FrameLayout.LayoutParams) wxaWindowLayoutParams).width);
        this.f91060o = java.lang.Integer.valueOf(((android.widget.FrameLayout.LayoutParams) wxaWindowLayoutParams).height);
        this.f91061p = java.lang.Float.valueOf(wxaWindowLayoutParams.f87570a);
        this.f91062q = java.lang.Integer.valueOf(((android.widget.FrameLayout.LayoutParams) wxaWindowLayoutParams).gravity);
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            b(getChildAt(i17));
        }
        if (getLayoutParams() instanceof com.tencent.mm.plugin.appbrand.platform.window.WxaWindowLayoutParams) {
            setLayoutParams(wxaWindowLayoutParams);
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        super.addView(view, i17);
        b(view);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, int i18) {
        super.addView(view, i17, i18);
        b(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        b(view);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i17, layoutParams);
        b(view);
    }
}
