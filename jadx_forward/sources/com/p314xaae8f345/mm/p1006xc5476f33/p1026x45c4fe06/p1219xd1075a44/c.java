package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes7.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f172592n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f172593o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Float f172594p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f172595q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300 f172596r;

    public c(android.content.Context context) {
        super(context);
        this.f172596r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300(-1, -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandCenterInsideRuntimeFrameLayout", "AppBrandCenterInsideRuntimeFrameLayout: create");
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        super.addView(view);
        b(view);
    }

    public final void b(android.view.View view) {
        if (this.f172594p != null && java.lang.Math.abs(view.getScaleX() - this.f172594p.floatValue()) >= 0.01f) {
            view.setScaleX(this.f172594p.floatValue());
            view.setScaleY(this.f172594p.floatValue());
        }
    }

    /* renamed from: getWxaLayoutParams */
    public android.view.ViewGroup.LayoutParams m53350x5d0fdcda() {
        return this.f172596r;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
        java.lang.Integer num;
        if (this.f172593o != null && (num = this.f172592n) != null) {
            if (num.intValue() > 0) {
                i17 = android.view.View.MeasureSpec.makeMeasureSpec(this.f172592n.intValue(), 1073741824);
            }
            if (this.f172593o.intValue() > 0) {
                i19 = android.view.View.MeasureSpec.makeMeasureSpec(this.f172593o.intValue(), 1073741824);
            }
        }
        super.measureChildWithMargins(view, i17, i18, i19, i27);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        int i47;
        java.lang.Integer num = this.f172592n;
        if (num == null && this.f172593o == null) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        if (num == null || this.f172593o == null) {
            i28 = 0;
            i29 = 0;
        } else {
            i28 = num.intValue() > 0 ? ((i19 - i17) / 2) - (this.f172592n.intValue() / 2) : 0;
            i29 = this.f172593o.intValue() > 0 ? ((i27 - i18) / 2) - (this.f172593o.intValue() / 2) : 0;
        }
        if (i29 == 0 && i28 == 0) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        java.lang.Integer num2 = this.f172595q;
        int intValue = (num2 == null || num2.intValue() == -1) ? 17 : this.f172595q.intValue();
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.WXA.AppBrandCenterInsideRuntimeFrameLayout", "onLayout: unhandled gravity[%d], good luck~", java.lang.Integer.valueOf(intValue));
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

    /* renamed from: setWxaLayoutParams */
    public void m53351x93e6764e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300 c12547xf52fd300) {
        this.f172596r = c12547xf52fd300;
        this.f172592n = java.lang.Integer.valueOf(((android.widget.FrameLayout.LayoutParams) c12547xf52fd300).width);
        this.f172593o = java.lang.Integer.valueOf(((android.widget.FrameLayout.LayoutParams) c12547xf52fd300).height);
        this.f172594p = java.lang.Float.valueOf(c12547xf52fd300.f169103a);
        this.f172595q = java.lang.Integer.valueOf(((android.widget.FrameLayout.LayoutParams) c12547xf52fd300).gravity);
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            b(getChildAt(i17));
        }
        if (getLayoutParams() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300) {
            setLayoutParams(c12547xf52fd300);
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
