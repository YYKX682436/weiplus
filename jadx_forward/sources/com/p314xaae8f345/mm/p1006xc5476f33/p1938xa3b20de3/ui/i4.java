package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class i4 implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16769x400fef4 f234183a;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16769x400fef4 activityC16769x400fef4) {
        this.f234183a = activityC16769x400fef4;
    }

    @Override // h45.i
    /* renamed from: onKindaBusinessCallback */
    public void mo24858x44dbb8f3(android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "intent is null ignore");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16769x400fef4 activityC16769x400fef4 = this.f234183a;
        if (activityC16769x400fef4.isFinishing() || activityC16769x400fef4.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "[onKindaBusinessCallback] isFinishing: %s, isDestroyed: %s", java.lang.Boolean.valueOf(activityC16769x400fef4.isFinishing()), java.lang.Boolean.valueOf(activityC16769x400fef4.isDestroyed()));
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("Offline.shouldFinishTransparentUI", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEntranceUI", "offlinepay has callback, needFinish: %s", java.lang.Boolean.valueOf(booleanExtra));
        if (booleanExtra) {
            activityC16769x400fef4.finish();
        }
    }
}
