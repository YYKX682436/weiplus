package com.tencent.mm.plugin.car_license_plate.ui;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, d2 = {"com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onActivityDestroyed", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener, androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f94614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI f94615e;

    public CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1(android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI carLicensePlateEditUI) {
        this.f94614d = linearLayout;
        this.f94615e = carLicensePlateEditUI;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onActivityDestroyed() {
        android.view.ViewTreeObserver viewTreeObserver = this.f94614d.getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.LinearLayout linearLayout = this.f94614d;
        if (linearLayout.isLaidOut()) {
            int i17 = com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI.f94609i;
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI carLicensePlateEditUI = this.f94615e;
            if (carLicensePlateEditUI.getContentView().isLaidOut()) {
                float measuredWidth = linearLayout.getMeasuredWidth() > carLicensePlateEditUI.getContentView().getMeasuredWidth() ? carLicensePlateEditUI.getContentView().getMeasuredWidth() / linearLayout.getMeasuredWidth() : 1.0f;
                linearLayout.setScaleX(measuredWidth);
                linearLayout.setScaleY(measuredWidth);
            }
        }
    }
}
