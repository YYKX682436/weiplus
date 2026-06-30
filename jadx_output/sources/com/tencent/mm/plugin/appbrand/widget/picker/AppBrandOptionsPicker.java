package com.tencent.mm.plugin.appbrand.widget.picker;

/* loaded from: classes15.dex */
public class AppBrandOptionsPicker extends android.widget.NumberPicker implements com.tencent.mm.plugin.appbrand.jsapi.picker.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f91803d;

    /* renamed from: e, reason: collision with root package name */
    public int f91804e;

    /* renamed from: f, reason: collision with root package name */
    public int f91805f;

    /* renamed from: g, reason: collision with root package name */
    public int f91806g;

    public AppBrandOptionsPicker(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494685te));
        com.tencent.mm.ui.widget.picker.q0.c(this, getResources().getDrawable(com.tencent.mm.R.drawable.f480854e8));
        com.tencent.mm.ui.widget.picker.q0.d(this);
        com.tencent.mm.ui.widget.picker.q0.e(this);
        tl1.b0.a(this);
        this.f91804e = i65.a.b(context, 100);
        this.f91806g = i65.a.b(context, 20);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public java.lang.Object currentValue() {
        java.lang.String[] strArr = this.f91803d;
        return (strArr == null || strArr.length <= 0) ? "" : strArr[getValue()];
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onAttach(tl1.v vVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.ui.widget.picker.q0.a(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onDetach(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onHide(tl1.v vVar) {
    }

    @Override // android.widget.NumberPicker, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        if (android.view.View.MeasureSpec.getMode(i17) == Integer.MIN_VALUE || android.view.View.MeasureSpec.getMode(i17) == 1073741824) {
            this.f91805f = android.view.View.MeasureSpec.getSize(i17);
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), i18);
        int measuredWidth = getMeasuredWidth();
        int i27 = this.f91804e;
        if (measuredWidth <= i27 && ((i19 = this.f91805f) <= 0 || i27 <= i19)) {
            setMeasuredDimension(i27, getMeasuredHeight());
            return;
        }
        int measuredWidth2 = getMeasuredWidth() + (this.f91806g * 2);
        int i28 = this.f91805f;
        if (i28 > 0 && i28 <= measuredWidth2) {
            measuredWidth2 = i28;
        }
        setMeasuredDimension(measuredWidth2, getMeasuredHeight());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onShow(tl1.v vVar) {
    }

    @Override // android.widget.NumberPicker
    @java.lang.Deprecated
    public void setDisplayedValues(java.lang.String[] strArr) {
        super.setDisplayedValues(strArr);
    }

    public final void setExtraPadding(int i17) {
        this.f91806g = java.lang.Math.max(i17, 0);
    }

    public final void setMaxWidth(int i17) {
        this.f91805f = i17;
    }

    public final void setMinWidth(int i17) {
        this.f91804e = i17;
    }

    public void setOptionsArray(java.lang.String[] strArr) {
        if (strArr == null) {
            return;
        }
        this.f91803d = strArr;
        setDisplayedValues(null);
        setMinValue(0);
        setMaxValue(java.lang.Math.max(strArr.length - 1, 0));
        if (strArr.length <= 0) {
            strArr = null;
        }
        super.setDisplayedValues(strArr);
    }
}
