package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class v2 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1 f230038a;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1 activityC16483x6e20aea1) {
        this.f230038a = activityC16483x6e20aea1;
    }

    public void a(android.os.Bundle bundle) {
        int i17 = bundle.getInt("callbackEventType");
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1 activityC16483x6e20aea1 = this.f230038a;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletUI", "refresh wallet data from pay settings");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1.f229847q;
            activityC16483x6e20aea1.U6(false, true);
        } else {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletUI", "refresh wallet data from realname end");
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1.f229847q;
            activityC16483x6e20aea1.U6(false, true);
        }
    }
}
