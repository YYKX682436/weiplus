package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class vi implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f229085d;

    public vi(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f229085d = activityC16384xb66222dd;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f229085d;
        int i17 = activityC16384xb66222dd.f227949n2 - 1;
        activityC16384xb66222dd.f227949n2 = i17;
        if (i17 > 0) {
            activityC16384xb66222dd.K.setText(activityC16384xb66222dd.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.goa, java.lang.Integer.valueOf(activityC16384xb66222dd.f227949n2)));
            return true;
        }
        activityC16384xb66222dd.F2.d();
        activityC16384xb66222dd.K.setVisibility(8);
        activityC16384xb66222dd.M.c();
        return true;
    }
}
