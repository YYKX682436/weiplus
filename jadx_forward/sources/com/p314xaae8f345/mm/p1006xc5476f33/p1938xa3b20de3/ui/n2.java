package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class n2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38) {
        super(false);
        this.f234214d = activityC16764xd1ab6b38;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "do get token, %s", java.lang.Integer.valueOf(to3.c0.Ai().Ui().d(true)));
        int d17 = to3.c0.Ai().Ui().d(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234214d;
        if (d17 > 0) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38.B2;
            activityC16764xd1ab6b38.e7(true, true);
        } else {
            activityC16764xd1ab6b38.m83096xe7b1ccf7(new wo3.l("" + ((int) (java.lang.System.currentTimeMillis() / 1000)), 10, 10));
        }
    }
}
