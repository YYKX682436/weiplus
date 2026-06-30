package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 f229887d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 activityC16479x8f884212) {
        this.f229887d = activityC16479x8f884212;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 activityC16479x8f884212 = this.f229887d;
        int k17 = i65.a.k(activityC16479x8f884212.mo55332x76847179());
        int b17 = i65.a.b(activityC16479x8f884212.mo55332x76847179(), 53);
        int[] iArr = new int[2];
        activityC16479x8f884212.f229772d.getLocationInWindow(iArr);
        int bottom = (activityC16479x8f884212.f229784s.getBottom() + iArr[1]) - k17;
        int height = (activityC16479x8f884212.f229772d.getHeight() - activityC16479x8f884212.f229784s.getHeight()) + iArr[1];
        if (bottom > 0) {
            height += bottom;
        }
        int i17 = (k17 - height) - b17;
        int b18 = i65.a.b(activityC16479x8f884212.mo55332x76847179(), 33);
        activityC16479x8f884212.f229784s.getHeight();
        if (i17 > b18) {
            activityC16479x8f884212.f229784s.setPadding(0, i17, 0, b18);
        } else {
            activityC16479x8f884212.f229784s.setPadding(0, b18, 0, b18);
        }
    }
}
