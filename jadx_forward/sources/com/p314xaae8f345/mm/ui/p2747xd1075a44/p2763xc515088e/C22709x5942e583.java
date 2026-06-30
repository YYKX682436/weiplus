package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* renamed from: com.tencent.mm.ui.widget.picker.OptionPicker */
/* loaded from: classes15.dex */
public class C22709x5942e583 extends android.widget.NumberPicker {

    /* renamed from: d, reason: collision with root package name */
    public int f293767d;

    /* renamed from: e, reason: collision with root package name */
    public int f293768e;

    /* renamed from: f, reason: collision with root package name */
    public int f293769f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f293770g;

    public C22709x5942e583(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293770g = context;
        a();
    }

    public final void a() {
        android.content.Context context = this.f293770g;
        this.f293767d = com.p314xaae8f345.mm.ui.zk.a(context, 120);
        this.f293769f = com.p314xaae8f345.mm.ui.zk.a(context, 20);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.c(this, getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.auc));
        setDescendantFocusability(393216);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.f(this, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.widget.NumberPicker, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        if (android.view.View.MeasureSpec.getMode(i17) == Integer.MIN_VALUE || android.view.View.MeasureSpec.getMode(i17) == 1073741824) {
            this.f293768e = android.view.View.MeasureSpec.getSize(i17);
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), i18);
        int measuredWidth = getMeasuredWidth();
        int i27 = this.f293767d;
        if (measuredWidth <= i27 && ((i19 = this.f293768e) <= 0 || i27 <= i19)) {
            setMeasuredDimension(i27, getMeasuredHeight());
            return;
        }
        int measuredWidth2 = getMeasuredWidth() + (this.f293769f * 2);
        int i28 = this.f293768e;
        if (i28 > 0 && i28 <= measuredWidth2) {
            measuredWidth2 = i28;
        }
        setMeasuredDimension(measuredWidth2, getMeasuredHeight());
    }

    @Override // android.widget.NumberPicker
    @java.lang.Deprecated
    public void setDisplayedValues(java.lang.String[] strArr) {
        super.setDisplayedValues(strArr);
    }

    /* renamed from: setExtraPadding */
    public final void m82075xb2c11b63(int i17) {
        this.f293769f = java.lang.Math.max(i17, 0);
    }

    /* renamed from: setMaxWidth */
    public final void m82076x8e6ff544(int i17) {
        this.f293768e = i17;
    }

    /* renamed from: setMinWidth */
    public final void m82077x24915916(int i17) {
        this.f293767d = i17;
    }

    /* renamed from: setOptionsArray */
    public void m82078x203ffbdd(java.lang.String[] strArr) {
        if (strArr == null) {
            return;
        }
        setDisplayedValues(null);
        setMinValue(0);
        setMaxValue(java.lang.Math.max(strArr.length - 1, 0));
        setWrapSelectorWheel(false);
        if (strArr.length <= 0) {
            strArr = null;
        }
        super.setDisplayedValues(strArr);
    }

    public C22709x5942e583(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293770g = context;
        a();
    }
}
