package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class f3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234150d;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38) {
        this.f234150d = activityC16764xd1ab6b38;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234150d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "onTimerExpired, send ConsumedCardByOfflinePay event: %s", java.lang.Boolean.valueOf(activityC16764xd1ab6b38.Q1));
        if (activityC16764xd1ab6b38.Q1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5283xee2df026 c5283xee2df026 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5283xee2df026();
            c5283xee2df026.f135606g.getClass();
            c5283xee2df026.e();
        }
        activityC16764xd1ab6b38.finish();
        return false;
    }
}
