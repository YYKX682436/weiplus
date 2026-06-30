package com.tencent.mm.plugin.appbrand.widget.picker;

/* loaded from: classes15.dex */
public class AppBrandOptionsPickerV2 extends com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker implements com.tencent.mm.plugin.appbrand.jsapi.picker.f {
    public java.lang.String[] X1;
    public int Y1;

    public AppBrandOptionsPickerV2(android.content.Context context) {
        super(context);
        setDividerHeight(i65.a.b(context, 2));
        setDividerColor(android.graphics.Color.parseColor("#1AAD19"));
        setItemPaddingVertical(i65.a.b(context, 8));
        setNormalTextColor(android.graphics.Color.parseColor("#A5A5A5"));
        setSelectedTextColor(-16777216);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public java.lang.Object currentValue() {
        java.lang.String[] strArr = this.X1;
        return (strArr == null || strArr.length <= 0) ? "" : strArr[getValue()];
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public final android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onAttach(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onDetach(tl1.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onHide(tl1.v vVar) {
        q();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.C1;
        if (n3Var != null) {
            n3Var.sendMessageDelayed(g(1, 0, 0, null), 0L);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker, android.view.View
    public final void onMeasure(int i17, int i18) {
        int i19 = this.Y1;
        if (i19 > 0) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onShow(tl1.v vVar) {
    }

    public final void setForceWidth(int i17) {
        this.Y1 = i17;
    }

    public final void setOptionsArray(java.lang.String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            setEnabled(false);
            setVisibility(4);
            return;
        }
        setEnabled(true);
        setVisibility(0);
        this.X1 = strArr;
        int minValue = getMinValue();
        int maxValue = (getMaxValue() - minValue) + 1;
        int length = strArr.length - 1;
        if ((length - minValue) + 1 > maxValue) {
            setDisplayedValues(strArr);
            setMaxValue(length);
        } else {
            setMaxValue(length);
            setDisplayedValues(strArr);
        }
    }
}
