package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e f229923d;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e) {
        this.f229923d = activityC16480xce80140e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e = this.f229923d;
        int k17 = i65.a.k(activityC16480xce80140e.mo55332x76847179());
        int b17 = i65.a.b(activityC16480xce80140e.mo55332x76847179(), 53);
        int[] iArr = new int[2];
        activityC16480xce80140e.f229787d.getLocationInWindow(iArr);
        int bottom = (activityC16480xce80140e.f229799s.getBottom() + iArr[1]) - k17;
        int height = (activityC16480xce80140e.f229787d.getHeight() - activityC16480xce80140e.f229799s.getHeight()) + iArr[1];
        if (bottom > 0) {
            height += bottom;
        }
        int i17 = (k17 - height) - b17;
        int b18 = i65.a.b(activityC16480xce80140e.mo55332x76847179(), 33);
        activityC16480xce80140e.f229799s.getHeight();
        if (i17 > b18) {
            activityC16480xce80140e.f229799s.setPadding(i65.a.f(activityC16480xce80140e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), i17, i65.a.f(activityC16480xce80140e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), b18);
        } else {
            activityC16480xce80140e.f229799s.setPadding(i65.a.f(activityC16480xce80140e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), b18, i65.a.f(activityC16480xce80140e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn), b18);
        }
    }
}
