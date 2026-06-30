package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.picker.AppBrandOptionsPicker */
/* loaded from: classes15.dex */
public class C12787x4cdb4466 extends android.widget.NumberPicker implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f173336d;

    /* renamed from: e, reason: collision with root package name */
    public int f173337e;

    /* renamed from: f, reason: collision with root package name */
    public int f173338f;

    /* renamed from: g, reason: collision with root package name */
    public int f173339g;

    public C12787x4cdb4466(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576218te));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.c(this, getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562387e8));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.d(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.e(this);
        tl1.b0.a(this);
        this.f173337e = i65.a.b(context, 100);
        this.f173339g = i65.a.b(context, 20);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: currentValue */
    public java.lang.Object mo51206x57066778() {
        java.lang.String[] strArr = this.f173336d;
        return (strArr == null || strArr.length <= 0) ? "" : strArr[getValue()];
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: getView */
    public android.view.View mo51207xfb86a31b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onAttach */
    public void mo51208x3b13c504(tl1.v vVar) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.q0.a(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onDetach */
    public void mo51209x3f5eee52(tl1.v vVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onHide */
    public void mo51210xc39a57c1(tl1.v vVar) {
    }

    @Override // android.widget.NumberPicker, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        if (android.view.View.MeasureSpec.getMode(i17) == Integer.MIN_VALUE || android.view.View.MeasureSpec.getMode(i17) == 1073741824) {
            this.f173338f = android.view.View.MeasureSpec.getSize(i17);
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), i18);
        int measuredWidth = getMeasuredWidth();
        int i27 = this.f173337e;
        if (measuredWidth <= i27 && ((i19 = this.f173338f) <= 0 || i27 <= i19)) {
            setMeasuredDimension(i27, getMeasuredHeight());
            return;
        }
        int measuredWidth2 = getMeasuredWidth() + (this.f173339g * 2);
        int i28 = this.f173338f;
        if (i28 > 0 && i28 <= measuredWidth2) {
            measuredWidth2 = i28;
        }
        setMeasuredDimension(measuredWidth2, getMeasuredHeight());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.f
    /* renamed from: onShow */
    public void mo51211xc39f557c(tl1.v vVar) {
    }

    @Override // android.widget.NumberPicker
    @java.lang.Deprecated
    public void setDisplayedValues(java.lang.String[] strArr) {
        super.setDisplayedValues(strArr);
    }

    /* renamed from: setExtraPadding */
    public final void m53560xb2c11b63(int i17) {
        this.f173339g = java.lang.Math.max(i17, 0);
    }

    /* renamed from: setMaxWidth */
    public final void m53561x8e6ff544(int i17) {
        this.f173338f = i17;
    }

    /* renamed from: setMinWidth */
    public final void m53562x24915916(int i17) {
        this.f173337e = i17;
    }

    /* renamed from: setOptionsArray */
    public void m53563x203ffbdd(java.lang.String[] strArr) {
        if (strArr == null) {
            return;
        }
        this.f173336d = strArr;
        setDisplayedValues(null);
        setMinValue(0);
        setMaxValue(java.lang.Math.max(strArr.length - 1, 0));
        if (strArr.length <= 0) {
            strArr = null;
        }
        super.setDisplayedValues(strArr);
    }
}
