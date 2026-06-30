package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class pi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f228853d;

    public pi(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f228853d = activityC16384xb66222dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.M2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f228853d;
        if (activityC16384xb66222dd.g7()) {
            activityC16384xb66222dd.Y.setChecked(false);
            activityC16384xb66222dd.Z.setText(activityC16384xb66222dd.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573976m62));
            activityC16384xb66222dd.f227953p0.setVisibility(0);
            activityC16384xb66222dd.R.setVisibility(8);
            return;
        }
        activityC16384xb66222dd.Y.setChecked(true);
        activityC16384xb66222dd.Z.setText(activityC16384xb66222dd.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573974m60));
        activityC16384xb66222dd.f227953p0.setVisibility(8);
        activityC16384xb66222dd.R.setVisibility(0);
    }
}
