package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class u1 implements qp5.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f f261034d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f) {
        this.f261034d = activityC19081x5e445f1f;
    }

    @Override // qp5.i0
    /* renamed from: onInputValidChange */
    public void mo9068x194c4a1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayRealNameVerifyCodeUI", "phone valid change: %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f activityC19081x5e445f1f = this.f261034d;
        if (!activityC19081x5e445f1f.f260800d.n() || activityC19081x5e445f1f.f260809p) {
            activityC19081x5e445f1f.f260802f.setEnabled(false);
        } else {
            activityC19081x5e445f1f.f260802f.setEnabled(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19081x5e445f1f.U6(activityC19081x5e445f1f);
    }
}
