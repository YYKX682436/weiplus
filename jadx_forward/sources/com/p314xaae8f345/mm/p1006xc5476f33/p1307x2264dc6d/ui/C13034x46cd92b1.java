package com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB%\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/MaxWidthLinearLayout;", "Landroid/widget/LinearLayout;", "", "d", "I", "getMaxWidthPixels", "()I", "maxWidthPixels", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.MaxWidthLinearLayout */
/* loaded from: classes2.dex */
public final class C13034x46cd92b1 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int maxWidthPixels;

    public C13034x46cd92b1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.maxWidthPixels = 1073741823;
    }

    public final int getMaxWidthPixels() {
        return this.maxWidthPixels;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.maxWidthPixels, Integer.MIN_VALUE), i18);
    }

    public C13034x46cd92b1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.maxWidthPixels = 1073741823;
    }
}
