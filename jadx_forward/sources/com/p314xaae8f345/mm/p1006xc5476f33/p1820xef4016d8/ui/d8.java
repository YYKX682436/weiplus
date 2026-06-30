package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class d8 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228366d;

    public d8(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228366d = activityC16371xf216ae6d;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        android.app.Dialog dialog;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228366d;
        android.app.Dialog dialog2 = activityC16371xf216ae6d.P;
        boolean z17 = false;
        if (dialog2 != null && dialog2.isShowing()) {
            z17 = true;
        }
        if (z17 && (dialog = activityC16371xf216ae6d.P) != null) {
            dialog.dismiss();
        }
        activityC16371xf216ae6d.m66166xc8398945();
        wb3.a aVar = activityC16371xf216ae6d.f227723h3;
        if (aVar != null) {
            aVar.j();
        }
        if (activityC16371xf216ae6d.m78513xc2a54588().getVisibility() == 8 || activityC16371xf216ae6d.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "user cancel & finish");
            activityC16371xf216ae6d.finish();
        }
    }
}
