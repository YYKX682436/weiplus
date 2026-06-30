package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class oa implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f228800d;

    public oa(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        this.f228800d = activityC16373x8a110f13;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialog) {
        android.app.Dialog dialog2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doPrepareBtnClick] coperationTipDialogNoTransparent onCancel()");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f228800d;
        boolean z17 = false;
        activityC16373x8a110f13.f227811t2 = false;
        activityC16373x8a110f13.f227809s2 = false;
        android.app.Dialog dialog3 = activityC16373x8a110f13.f227810t;
        if (dialog3 != null) {
            if (dialog3 != null && dialog3.isShowing()) {
                z17 = true;
            }
            if (z17 && (dialog2 = activityC16373x8a110f13.f227810t) != null) {
                dialog2.dismiss();
            }
        }
        if (activityC16373x8a110f13.m78513xc2a54588().getVisibility() == 8 || activityC16373x8a110f13.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "usr cancel, & visibility not visiable, so finish");
            activityC16373x8a110f13.finish();
        }
        activityC16373x8a110f13.m66166xc8398945();
    }
}
