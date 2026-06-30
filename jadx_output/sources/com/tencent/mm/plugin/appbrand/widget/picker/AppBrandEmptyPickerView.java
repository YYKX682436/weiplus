package com.tencent.mm.plugin.appbrand.widget.picker;

/* loaded from: classes7.dex */
public class AppBrandEmptyPickerView extends android.view.View implements com.tencent.mm.plugin.appbrand.jsapi.picker.f {
    public AppBrandEmptyPickerView(android.content.Context context) {
        super(context);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public java.lang.Object currentValue() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public android.view.View getView() {
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
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7d), 1073741824));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.f
    public void onShow(tl1.v vVar) {
    }
}
