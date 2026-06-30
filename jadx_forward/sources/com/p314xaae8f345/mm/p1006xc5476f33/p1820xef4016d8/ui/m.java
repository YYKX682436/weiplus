package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c f228691d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c activityC16358x34a9fc3c) {
        this.f228691d = activityC16358x34a9fc3c;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p944x882e457a.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c activityC16358x34a9fc3c = this.f228691d;
        android.app.Dialog dialog = activityC16358x34a9fc3c.f227509g;
        if (dialog != null && dialog.isShowing()) {
            activityC16358x34a9fc3c.f227509g.dismiss();
        }
        activityC16358x34a9fc3c.m66166xc8398945();
        cc3.b bVar = activityC16358x34a9fc3c.f227514o;
        if (bVar != null && (iVar = bVar.f295418c) != null) {
            iVar.j();
        }
        if (activityC16358x34a9fc3c.m78513xc2a54588().getVisibility() == 8 || activityC16358x34a9fc3c.m78513xc2a54588().getVisibility() == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBeforeDetailUI", "user cancel & finish");
            activityC16358x34a9fc3c.finish();
        }
    }
}
