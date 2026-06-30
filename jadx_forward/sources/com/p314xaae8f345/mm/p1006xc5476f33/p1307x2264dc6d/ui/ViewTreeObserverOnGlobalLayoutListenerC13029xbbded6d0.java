package com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, d2 = {"com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onActivityDestroyed", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1 */
/* loaded from: classes7.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC13029xbbded6d0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener, p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f176147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 f176148e;

    public ViewTreeObserverOnGlobalLayoutListenerC13029xbbded6d0(android.widget.LinearLayout linearLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 activityC13028x321e1ca7) {
        this.f176147d = linearLayout;
        this.f176148e = activityC13028x321e1ca7;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onActivityDestroyed */
    public final void m54435xa9f48fab() {
        android.view.ViewTreeObserver viewTreeObserver = this.f176147d.getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.LinearLayout linearLayout = this.f176147d;
        if (linearLayout.isLaidOut()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7.f176142i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7 activityC13028x321e1ca7 = this.f176148e;
            if (activityC13028x321e1ca7.m78513xc2a54588().isLaidOut()) {
                float measuredWidth = linearLayout.getMeasuredWidth() > activityC13028x321e1ca7.m78513xc2a54588().getMeasuredWidth() ? activityC13028x321e1ca7.m78513xc2a54588().getMeasuredWidth() / linearLayout.getMeasuredWidth() : 1.0f;
                linearLayout.setScaleX(measuredWidth);
                linearLayout.setScaleY(measuredWidth);
            }
        }
    }
}
