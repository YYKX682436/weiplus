package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class c2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ey4 f234126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 f234127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38, r45.ey4 ey4Var) {
        super(false);
        this.f234127e = activityC16764xd1ab6b38;
        this.f234126d = ey4Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38 activityC16764xd1ab6b38 = this.f234127e;
        activityC16764xd1ab6b38.J1 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16764xd1ab6b38.f7(5);
        r45.ey4 ey4Var = this.f234126d;
        int i17 = ey4Var.f455355s;
        if (i17 != 1) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC16764xd1ab6b38.mo55332x76847179(), ey4Var.f455356t, false);
            } else if (i17 != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "unknown entrance type");
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.c0(ey4Var.f455357u, ey4Var.f455358v, 0, 1137, new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.b2(this));
            }
        }
    }
}
